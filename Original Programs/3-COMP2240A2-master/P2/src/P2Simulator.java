import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * P2Simulator
 *
 * Initializes customer objects and begins simulation
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class P2Simulator {
    private List<Customer> customerList;
    public static int timer = 0;

    public P2Simulator(List<Customer> customerList) {
        this.customerList = customerList;

    }

    /**
     * Begin simulator
     */
    public void begin() {
        System.out.println(String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));
        // Run until no customers left
        while (!customerList.isEmpty()) {
            // If a customers arrival time is now, start their thread
            List<Customer> due = customerList.stream().filter(c -> c.getArrival() == timer).collect(Collectors.toList());
            for (Customer c : due) {
                customerList.remove(c);
                new Thread(c).start();
            }
            // Increment time
            timer++;
            // Simulate a timer so we can actually see it run
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }

        }
    }
}
