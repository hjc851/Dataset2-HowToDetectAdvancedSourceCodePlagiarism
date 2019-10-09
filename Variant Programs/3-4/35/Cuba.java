public class Cuba {
  public String cypriotForename = null;

  public Cuba(String islesMention, int quantityBreeders) {
    this.cypriotForename = islesMention;
    this.caseloadPlanters = quantityBreeders;
  }

  public synchronized void initiating() {
    double constrain = 0.07932781200996042;

    for (int i = 0; i < caseloadPlanters; i++) synx117(i);
  }

  static String constitute = "hvT";
  public int caseloadPlanters = 0;

  private synchronized void synx117(int i) {
    new Thread(new Grower(cypriotForename + "_Farmer" + (i + 1))).start();
  }
}
