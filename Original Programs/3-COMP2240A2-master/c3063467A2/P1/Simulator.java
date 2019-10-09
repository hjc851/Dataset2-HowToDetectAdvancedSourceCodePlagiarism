/**
 * Simulator
 *
 * Initializes island objects and begins simulation
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class Simulator {
    private Island southIsland;
    private Island northIsland;

    public Simulator(int north, int south) {
        northIsland = new Island("N", north);
        southIsland = new Island("S", south);
    }

    public void begin() {
        northIsland.begin();
        southIsland.begin();
    }
}
