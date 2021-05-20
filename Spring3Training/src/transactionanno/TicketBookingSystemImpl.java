package transactionanno;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional()
public class TicketBookingSystemImpl extends JdbcDaoSupport implements TicketBookingService {

    /*create table MOVIES(movie_name varchar(100), booked_seats integer, total_seats integer, price integer);
    create table account(account_Id integer, balance integer)
    insert into movies values ('spiderman',8, 10, 50)
    insert into movies values ('superman',10, 12, 25)
    insert into account values (1,100)
    insert into account values (2,200)
    insert into account values (3,300)*/
    @Override
    @Transactional(rollbackFor = Exception.class, noRollbackFor = RuntimeException.class)
    public void bookSeat(String movieName, int numberOfSeats, int customerId) {
        int vacantSeats = getVacantSeatsNumber(movieName);
        if (vacantSeats >= numberOfSeats) {
            //update booked seats
            int bookedSeats = getJdbcTemplate().queryForInt("select booked_seats from movies where movie_name=?", movieName);
            System.out.println("Movie updated " + getJdbcTemplate().update("update movies set booked_seats=? where movie_name=?", (bookedSeats + numberOfSeats), movieName) + " movie name:" + movieName + " orginal booked seats:" + bookedSeats + " update booked seats:" + (bookedSeats + numberOfSeats));
        } else {
            throw new RuntimeException("Not enough seats-vacantSeats: " + vacantSeats);
        }
        //get movie price
        int price = getJdbcTemplate().queryForInt("select price from movies where movie_name=?", movieName);
        int balance = getJdbcTemplate().queryForInt("select balance from account where account_Id=?", customerId);
        int amount = price * numberOfSeats;
        if (balance >= amount) {
            int newBalance = balance - amount;
            //debit account
            System.out.println("Balance updated " + getJdbcTemplate().update("update account set balance=? where account_id=?", newBalance, customerId) + " customerId=" + customerId + " new balance:" + newBalance + " orginal balance: " + balance);
        } else {
            throw new RuntimeException("Not enough balance: " + balance + " " + customerId);
        }
    }

    @Override
    public int getVacantSeatsNumber(String movieName) {
        int vacantSeats = getJdbcTemplate().queryForInt("select (total_seats-booked_seats) as vaccentseat from movies where movie_name=?", movieName);
        return vacantSeats;
    }
}
