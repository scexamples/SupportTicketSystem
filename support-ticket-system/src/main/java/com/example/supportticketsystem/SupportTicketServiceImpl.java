package com.example.supportticketsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("supportTicketServicImpl")
public class SupportTicketServiceImpl implements SupportTicketService {

	@Autowired
	private SupportTicketRepository supportTicketRepository;
	
	@Override
	public List<SupportTicket> findSupportTickets() {
		return (List<SupportTicket>) supportTicketRepository.findAll();
	}
	
	@Override
	public Optional<SupportTicket> findSupportTicket(Long id) {
		return supportTicketRepository.findById(id);
	}
	
	@Override
	public void update(SupportTicket customer) {
		supportTicketRepository.save(customer);
	}
	
	@Override
	@Transactional
	public void save(SupportTicket customer) {
		supportTicketRepository.save(customer);
	}
	
	@Override
	@Transactional
	public void delete(SupportTicket customer) {
		supportTicketRepository.delete(customer);
	}
}
