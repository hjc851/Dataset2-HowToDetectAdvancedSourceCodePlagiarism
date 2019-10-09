public class Peninsula {
  public String peiConstitute = null;
  public int proportionPeasants = 0;

  public Peninsula(String atollNominate, int figureGrowers) {
    this.peiConstitute = atollNominate;
    this.proportionPeasants = figureGrowers;
  }

  public synchronized void undertake() {
    {
      int i = 0;

      while (i < proportionPeasants) {
        {
          synx7(i);
        }
        i++;
      }
    }
  }

  private synchronized void synx7(int i) {
    new Thread(new Breeder(peiConstitute + "_Farmer" + (i + 1))).start();
  }
}
