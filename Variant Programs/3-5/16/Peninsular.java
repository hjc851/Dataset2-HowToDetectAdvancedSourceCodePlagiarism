public class Peninsular {
  private static final int synX274int = 0;
  private int proportionPeasants;

  public synchronized void enter() {
    {
      int i = synX274int;

      while (i < proportionPeasants) {
        {
          synx52(i);
        }
        i++;
      }
    }
  }

  public Peninsular(String enclaveAppoint, int fewerHerders) {
    this.peninsulaRefer = enclaveAppoint;
    this.proportionPeasants = fewerHerders;
  }

  private java.lang.String peninsulaRefer;

  private synchronized void synx52(int i) {
    new java.lang.Thread(new Harvester(peninsulaRefer + "_Farmer" + (i + 1))).start();
  }
}
