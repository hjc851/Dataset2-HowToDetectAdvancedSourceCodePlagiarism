import java.util.concurrent.Semaphore;
/**
 * Farmer
 *
 * Farmer Object which implements Runnable to run as a thread
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class Farmer implements Runnable{
    private String id;

    public static Semaphore s = new Semaphore(1);
    public static int neon = 0;

    public Farmer(String id) {
        this.id = id;
    }

    /**
     * Implements Runnable Run() method
     */
    @Override
    public void run() {
        // Run forever
        while (true) {
            System.out.println(id + ": Waiting for bridge.");
            /**
             * Critical Section
             */
            try {
                s.acquire();
                takeSteps();
                System.out.println(id + ": Crossing bridge step 5.");
                takeSteps();
                System.out.println(id + ": Crossing bridge step 10.");
                takeSteps();
                System.out.println(id + ": Crossing bridge step 15.");
                takeSteps();
                System.out.println(id + ": Across the bridge.");
                neon++;
                System.out.println("NEON = " + neon);
                s.release();
            } catch (InterruptedException ex) {
                ex.toString();
            }
            /**
             * End Critical Section
             */
            // Turn farmer around - do nothing, while loop just re-runs
        }
    }

    /**
     * takeSteps
     *
     * Private helper function to simulate walking by waiting the thread
     */
    private synchronized void takeSteps() {
        try {
            wait(1000);
        } catch (InterruptedException ex)
        {
            System.out.println(ex.toString());
        }
    }
}
