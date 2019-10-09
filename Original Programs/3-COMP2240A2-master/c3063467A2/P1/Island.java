/**
 * Island
 *
 * Represents one of the islands
 *
 * Author: Ben Sutter
 * Updated: 5/10/16
 */
public class Island {
    private String islandName;
    private int numberFarmers;

    public Island(String islandName, int numberFarmers) {
        this.islandName = islandName;
        this.numberFarmers = numberFarmers;
    }

    /**
     * begin
     *
     * Generates farmers for the island and starts their thread
     */
    public void begin() {
        for (int i = 0; i < numberFarmers; i++) {
            new Thread(new Farmer(islandName + "_Farmer" + (i+1))).start();
        }
    }
}
