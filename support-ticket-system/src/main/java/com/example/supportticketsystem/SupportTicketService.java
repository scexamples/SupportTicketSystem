package com.example.supportticketsystem;
import java.util.List;
import java.util.Optional;

public interface SupportTicketService {
	public List<SupportTicket> findSupportTickets();
	public void save(SupportTicket customer);
	public void delete(SupportTicket customer);
	public Optional<SupportTicket> findSupportTicket(Long id);
	void update(SupportTicket customer);
}
