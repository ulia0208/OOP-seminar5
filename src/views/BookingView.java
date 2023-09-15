package views;

import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View{

    private ViewObserver observer;

    public void  showTables(Collection<Table> tables){
        for(Table table: tables){
            System.out.println(table);

        }
    }


    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    public void setObserver(ViewObserver observer){
        this.observer=observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        if(reservationNo>0){
            System.out.printf("Столик забронирован, номер брони #%d \n", reservationNo);
        }
        else {
            System.out.println("Не удалось забронировать столик, попробуйте позже");
        }
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);

    }

}
