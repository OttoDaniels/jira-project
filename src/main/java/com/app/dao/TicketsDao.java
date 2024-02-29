package com.app.dao;

import com.app.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TicketsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewTicket(Ticket ticket){
        jdbcTemplate.update("INSERT INTO tickets (summary, description, reporter_id, project_id)" +
                "VALUES (?, ?, ?, ?)", ticket.getSummary(), ticket.getDescription(), ticket.getReporterId(), ticket.getProjectId());
    }

}
