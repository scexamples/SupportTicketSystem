package com.example.supportticketsystem;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
   
	@Autowired
	private SupportTicketService supportTicketService;
	
    @GetMapping("/")
    public String viewPage() {
            return "home";
    }
    
    @PostMapping("/setProject")
    public String setProject(@RequestParam(value = "projectId", required = false) String projectId, HttpServletRequest request, Model model) {
		
    	if(!"-".equals(projectId)) {
    		request.getSession().setAttribute("projectId", projectId);
    	} 
    	else {
    		model.addAttribute("error", "Please select a project");	
    		return "home";
		}
    	
    	return "redirect:/tickets"; // redirect will be a GET request to "/tickets"
    	
    }
    
	@GetMapping("/tickets")
	public String showTicketList(Model model, HttpSession session) {
	  	
		String projectId = (String) session.getAttribute("projectId");
		
		if(!StringUtils.isBlank(projectId) && !"-".equals(projectId)) {
			model.addAttribute("projectId", projectId);
		}
		
		List<SupportTicket> tickets = supportTicketService.findSupportTickets();
		model.addAttribute("tickets", tickets);
		
		return "home";
	}
    
    @GetMapping("/showForm")
    public String showAddTicketForm(Model model) {
        model.addAttribute("ticket", new SupportTicket());
        model.addAttribute("pageTitle", "Create Ticket");
        model.addAttribute("formAction", "/addTicket");
        return "ticket";
    }
    
    @PostMapping("/addTicket")
    public String addTicket(@ModelAttribute("ticket") SupportTicket ticket, Model model) {
    	ticket.setDate(new Date());
        supportTicketService.save(ticket);
        return "redirect:/tickets";
    }
    
    @GetMapping("/tickets/{ticketId}")
    public String showUpdateTicketForm(Model model, @PathVariable long ticketId) {
    	SupportTicket ticket = supportTicketService.findSupportTicket(ticketId)
   			 .orElseThrow(() -> new IllegalArgumentException("Invalid ticketId:" + ticketId));
    	model.addAttribute("ticket", ticket);
    	model.addAttribute("pageTitle", "Update Ticket");
    	model.addAttribute("formAction", "/update");
        return "ticket";
    }
    
    @PostMapping("/update")
    public String updateTicket(@ModelAttribute("ticket") SupportTicket ticket, Model model) {
    	ticket.setDate(new Date());
        supportTicketService.update(ticket);
        return "redirect:/tickets";
    }
    
    @GetMapping("/delete/{ticketId}")
    public String deleteTicket(Model model, @PathVariable long ticketId) {
    	 SupportTicket ticket = supportTicketService.findSupportTicket(ticketId)
    			 .orElseThrow(() -> new IllegalArgumentException("Invalid ticketId:" + ticketId));
         supportTicketService.delete(ticket);
         return "redirect:/tickets";
    }
    
    @PostMapping("/invalidate")
    public String destroySession(HttpServletRequest request) {
    	request.getSession().invalidate();
        return "redirect:/";
    }
    
}
