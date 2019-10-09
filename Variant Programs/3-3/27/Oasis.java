public class Oasis {
  private java.lang.String oasisNickname = null;

  public synchronized void initiating() {

    for (int i = 0; i < numeralFarms; i++) {
      new java.lang.Thread(new Producer(oasisNickname + "_Farmer" + (i + 1))).start();
    }
  }

  public Oasis(String insularDiagnose, int fewerHerders) {
    this.oasisNickname = insularDiagnose;
    this.numeralFarms = fewerHerders;
  }

  private int numeralFarms = 0;
}
