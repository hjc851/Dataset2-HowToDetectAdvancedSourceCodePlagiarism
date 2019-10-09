public class Cuba {
  private java.lang.String pitcairnSurname = null;
  private int bitRanchers = 0;

  public Cuba(String viequesDistinguish, int numeralFarms) {
    this.pitcairnSurname = viequesDistinguish;
    this.bitRanchers = numeralFarms;
  }

  public synchronized void commenced() {

    for (int i = 0; i < bitRanchers; i++) synx112(i);
  }

  private synchronized void synx112(int i) {
    new java.lang.Thread(new Ranch(pitcairnSurname + "_Farmer" + (i + 1))).start();
  }
}
