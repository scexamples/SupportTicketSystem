package com.example.supportticketsystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SupportTicketSystemApplicationTests {
	
	@Autowired
	private HomePageController controller;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	void testHome() throws Exception {
		this.mockMvc.perform(get("/")).andExpect(forwardedUrl("/WEB-INF/jsp/home.jsp"));
	}
	
	@Test
	void testGetTickets() throws Exception {		
		this.mockMvc.perform(get("/tickets")).andExpect(forwardedUrl("/WEB-INF/jsp/home.jsp"));
	}
	
	@Test
	void testShowForm() throws Exception {		
		this.mockMvc.perform(get("/showForm")).andExpect(forwardedUrl("/WEB-INF/jsp/ticket.jsp"));
	}
}
