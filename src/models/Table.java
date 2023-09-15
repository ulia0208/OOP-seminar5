package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private  final int no;
    private static int counter;
    private final Collection<Reservation>reservations=new ArrayList<>();

    public Collection<Reservation> getReservation(){
        return reservations;
    }

    public int getNo() {
        return no;
    }
    {
        no=++counter;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),"Столик #%d", no);
    }
}
