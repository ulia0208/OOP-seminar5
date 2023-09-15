package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables(){
        if(tables==null){
            tables=new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    public int reservationTable(Date reservatinDate, int tableNo, String name){
        for(Table table:loadTables()){
            if(table.getNo()==tableNo){
                Reservation reservation=new Reservation(reservatinDate, name);
                table.getReservation().add(reservation);
                return reservation.getId();
            }
        }

        return -1;

        // throw new RuntimeException("Некоррекный номер столика");

    }

    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for(Table table:loadTables()){

            System.out.println("old"+oldReservation);
            if(table.getNo()==tableNo||reservationTable(reservationDate,tableNo,name)==oldReservation){
                Reservation reservation=new Reservation(reservationDate,name);
                table.getReservation().remove(oldReservation);
                table.getReservation().add(reservation);
                return reservation.getId();
            }
        }

        return -1;

    }
}
