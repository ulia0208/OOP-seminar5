import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        TableModel model=new TableModel();
        BookingView view=new BookingView();

        BookingPresenter bookingPresenter=new BookingPresenter(model,view);

        bookingPresenter.updateTablesUI();

        view.reservationTable(new Date(),4,"Ульяна");

        view.changeReservationTable(101, new Date(),1,"Ульяна");



    }





}