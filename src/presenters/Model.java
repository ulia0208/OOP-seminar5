package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();
    int reservationTable(Date reservatinDate, int tableNo, String name);


    ////////////////////hw
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);




    }
