public class Anguilla {
  private int manyLandholders = 0;
  private String islaCite = null;

  public Anguilla(String cayFigure, int countFarming) {
    this.islaCite = cayFigure;
    this.manyLandholders = countFarming;
  }

  public synchronized void commenced() {

    for (int i = 0; i < manyLandholders; i++) {
      new Thread(new Breeder(islaCite + "_Farmer" + (i + 1))).start();
    }
  }
}
