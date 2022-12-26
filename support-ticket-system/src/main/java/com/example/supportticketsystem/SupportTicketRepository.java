package com.example.supportticketsystem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportTicketRepository extends CrudRepository<SupportTicket, Long>{
}
