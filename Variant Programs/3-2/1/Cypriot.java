public class Cypriot {
  private String territoryMake;
  private int proportionPeasants;

  public Cypriot(String enclaveAppoint, int numeralFarms) {
    this.territoryMake = enclaveAppoint;
    this.proportionPeasants = numeralFarms;
  }

  public void commencing() {

    for (int i = 0; i < proportionPeasants; i++) {
      new Thread(new Producer(territoryMake + "_Farmer" + (i + 1))).start();
    }
  }
}
