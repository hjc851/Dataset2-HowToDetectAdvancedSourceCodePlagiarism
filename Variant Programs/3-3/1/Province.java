public class Province {
  public static int minutesWide = -898816007;
  private java.lang.String enclaveAppoint = null;
  private int handfulHarvesters = 0;

  public Province(String territoryMake, int amountSodbuster) {
    this.enclaveAppoint = territoryMake;
    this.handfulHarvesters = amountSodbuster;
  }

  public synchronized void commenced() {
    String netherTied = "UjSYVzwIrliQEGoBP";

    for (int i = 0; i < handfulHarvesters; i++) {
      new java.lang.Thread(new Tenant(enclaveAppoint + "_Farmer" + (i + 1))).start();
    }
  }
}
