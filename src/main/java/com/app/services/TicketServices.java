package com.app.services;

import com.app.dao.TicketsDAO;
import com.app.model.Ticket;
import com.app.model.User;
import com.app.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServices {
    @Autowired
    private TicketsDAO ticketsDao;

    public void storeNewTicket(Ticket ticket) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails customUser = (CustomUserDetails) authentication.getPrincipal();

        User user = new User();
        user.setId(customUser.getUser().getId());

//      ticket.setReporterId(customUser.getUser().getId());
        ticket.setUser(user);
        ticketsDao.storeNewTicket(ticket);
    }

    public List<Ticket> getTicketsByProject(long projectId) {
        return ticketsDao.getTicketsByProject(projectId);
    }

    public List<Ticket> getLastTickets(int count){
        return ticketsDao.getLastTickets(count);
    }

}
