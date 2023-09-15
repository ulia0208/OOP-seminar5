package models;

import java.util.Date;

public class Reservation {
    private final int id;
    {
        id=++counter;
    }

    private static int counter=100;
    private Date date;
    private String name;

    public Reservation(int id, Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public Reservation(Date reservatinDate, String name) {
    }


    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public String getName() {
        return name;
    }
}
