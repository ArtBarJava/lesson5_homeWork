package ru.geekbrains.oop.lesson5;

import ru.geekbrains.oop.lesson5.models.TablesRepository;
import ru.geekbrains.oop.lesson5.presenters.BookingPresenter;
import ru.geekbrains.oop.lesson5.views.BookingView;

import java.util.Date;

public class Program {


    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TablesRepository tablesRepository = new TablesRepository();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tablesRepository, bookingView);
        bookingPresenter.updateTablesView();
        bookingView.reservationTable(new Date(), 2, "Станислав");
        bookingView.changeReservationTable(1001, new Date(), 4, "Станислав");
        bookingView.changeReservationTable(1002, new Date(), 5, "Артём");

        bookingView.changeReservationTable(1004, new Date(), 6, "Артём");  // Некорректный номер бронирования!

    }

}
