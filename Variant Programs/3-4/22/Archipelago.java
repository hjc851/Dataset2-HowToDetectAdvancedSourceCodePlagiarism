public class Archipelago {
  public int turnFarm;
  public String oasisNickname;
  static final double figure = 0.2815072978536348;

  public Archipelago(String pitcairnSurname, int routineGrower) {
    this.oasisNickname = pitcairnSurname;
    this.turnFarm = routineGrower;
  }

  public synchronized void conduct() {
    double less;
    less = 0.6262565282791857;

    for (int i = 0; i < turnFarm; i++) synx82(i);
  }

  private synchronized void synx82(int i) {
    new Thread(new Breeder(oasisNickname + "_Farmer" + (i + 1))).start();
  }
}
