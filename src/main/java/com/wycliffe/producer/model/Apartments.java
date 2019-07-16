package com.wycliffe.producer.model;

public class Apartments {
    private int apartment_id;
    private String apartment_name;
    private int agent_id;
    private String location_id;
    private int rooms;
    private String status;
    private String owner_id;

    public int getApartment_id() {
        return apartment_id;
    }

    public void setApartment_id(int apartment_id) {
        this.apartment_id = apartment_id;
    }

    public String getApartment_name() {
        return apartment_name;
    }

    public void setApartment_name(String apartment_name) {
        this.apartment_name = apartment_name;
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }


    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public Apartments() {

    }

    @Override
    public String toString() {
        return "Apartments{" +
                "apartment_id=" + apartment_id +
                ", apartment_name='" + apartment_name + '\'' +
                ", agent_id=" + agent_id +
                ", location_id='" + location_id + '\'' +
                ", rooms=" + rooms +
                ", status='" + status + '\'' +
                ", owner_id='" + owner_id + '\'' +
                '}';
    }
}
