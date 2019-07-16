package com.wycliffe.producer.service;

import com.wycliffe.producer.model.Apartments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HousingService {

    @Autowired
    private JdbcTemplate myJdbcTemplate;

    public List<Apartments> getAccounts(){
        String sqlQuery ="SELECT * FROM apartments";
        return myJdbcTemplate.query(sqlQuery,(rs,rowNum)->{
            Apartments apartments = new Apartments();

            apartments.setApartment_id(rs.getInt("apartment_id"));
            apartments.getApartment_name(rs.getString("apartment_name"));
            apartments.getAgent_id(rs.getInt("agent_id"));
            apartments.getLocation_id(rs.getString("location_id"));
            apartments.getRooms(rs.getInt("rooms"));
            apartments.getStatus(rs.getString("status"));
            apartments.getOwner_id(rs.getString("owner_id"));

             return apartments;
        });
    }
}
