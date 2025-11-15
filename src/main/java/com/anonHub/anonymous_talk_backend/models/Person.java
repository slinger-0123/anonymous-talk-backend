package com.anonHub.anonymous_talk_backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "people")
public class Person {

    @Id
    private Integer personID;
    private String name;
    private Boolean isConnected;
    private Boolean isOccupied;
    private Integer chatRoomID;


    public Person() {}


    public Person(String name, Integer personID, Boolean isConnected, Boolean isOccupied, Integer chatRoomID) {
        this.name = name;
        this.personID = personID;
        this.isConnected = isConnected;
        this.isOccupied = isOccupied;
        this.chatRoomID = chatRoomID;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getPersonID() { return personID; }
    public void setPersonID(Integer personID) { this.personID = personID; }

    public Boolean getConnected() { return isConnected; }
    public void setConnected(Boolean connected) { isConnected = connected; }

    public Boolean getOccupied() { return isOccupied; }
    public void setOccupied(Boolean occupied) { isOccupied = occupied; }

    public Integer getChatRoomID() { return chatRoomID; }
    public void setChatRoomID(Integer chatRoomID) { this.chatRoomID = chatRoomID; }
}