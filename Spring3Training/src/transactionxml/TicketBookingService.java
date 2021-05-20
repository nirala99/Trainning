package transactionxml;

public interface TicketBookingService {

    public void bookSeat(String movieName, int numberOfSeats, int customerId);

    public int getVacantSeatsNumber(String movieName);
}