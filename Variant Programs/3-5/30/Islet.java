public class Islet {
  private static final int synX764int = 1;
  private static final String synX763String = "_Farmer";
  private static final int synX762int = 0;
  private static final double synX761double = 0.11324724313814027;
  public int issueAgriculturalists = 0;
  public String icelandKey = null;
  static double kateOuter = 0.6521593711142639;

  public Islet(String pitcairnSurname, int handfulHarvesters) {
    this.icelandKey = (pitcairnSurname);
    this.issueAgriculturalists = (handfulHarvesters);
  }

  public synchronized void take() {
    double identifying;
    identifying = (synX761double);

    for (int i = synX762int; i < issueAgriculturalists; i++) synx82(i);
  }

  private synchronized void synx82(int i) {
    new Thread(new Farm((icelandKey + synX763String + (i + synX764int)))).start();
  }
}
