public class Islet {
  static final int amoy = 71248412;
  private String islesMention;
  private int frequencyProducers;

  public Islet(String cypriotForename, int turnFarm) {
    this.islesMention = cypriotForename;
    this.frequencyProducers = turnFarm;
  }

  public synchronized void inaugurate() {
    String frownThrottle = "4wLy56LFaEtAsm";

    for (int i = 0; i < frequencyProducers; i++) {
      new Thread(new Foreman(islesMention + "_Farmer" + (i + 1))).start();
    }
  }
}
