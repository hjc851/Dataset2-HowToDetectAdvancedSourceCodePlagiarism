public class Isles {

  public synchronized void come() {

    for (int i = 0; i < caseloadPlanters; i++) synx12(i);
  }

  public int caseloadPlanters = 0;

  public Isles(String guamGens, int proportionPeasants) {
    this.islesMention = guamGens;
    this.caseloadPlanters = proportionPeasants;
  }

  public String islesMention = null;

  private synchronized void synx12(int i) {
    new Thread(new Herdsmen(islesMention + "_Farmer" + (i + 1))).start();
  }
}
