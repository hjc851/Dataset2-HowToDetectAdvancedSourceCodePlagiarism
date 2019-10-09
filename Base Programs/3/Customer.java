import java.util.concurrent.Semaphore;
/**
 * Customer
 *
 * Customer Object which implements Runnable to run as a thread
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class Customer implements Runnable {
    private int arrival;
    private String id;
    private int eatTime;
    private int seatTime;
    private int finishTime;

    public static Semaphore seats = new Semaphore(5);
    public static Semaphore store = new Semaphore(1);

    public Customer(int arrival, String id, int eatTime) {
        this.arrival = arrival;
        this.id = id;
        this.eatTime = eatTime;
    }

    /**
     * Implements Runnable Run() method
     */
    @Override
    public void run() {
        try {
            // Lock the store if it is full
            if (seats.availablePermits() == 1) {
                store.acquire();
            }
            // Lock a seat
            seats.acquire();
            /**
             * Critical Section
             */
            this.seatTime = P2Simulator.timer;
            this.finishTime = this.seatTime + this.eatTime;
            while (P2Simulator.timer < this.finishTime) {
                // Do nothing, I'm eating
            }
            System.out.println(String.format("%-10s%10s%10s%10s", this.id, this.arrival, this.seatTime, this.finishTime));
            /**
             * End Critical Section
             */
            // Release the seat
            seats.release();
            // Release the store if it is now empty
            if (seats.availablePermits() == 5) {
                store.release();
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Standard getter
     * @return
     */
    public int getArrival() {
        return arrival;
    }
}
