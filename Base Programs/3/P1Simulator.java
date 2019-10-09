/**
 * P1Simulator
 *
 * Initializes island objects and begins simulation
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class P1Simulator {
    private Island southIsland;
    private Island northIsland;

    public P1Simulator(int north, int south) {
        northIsland = new Island("N", north);
        southIsland = new Island("S", south);
    }

    /**
     * Begin simulator
     */
    public void begin() {
        northIsland.begin();
        southIsland.begin();
    }
}
