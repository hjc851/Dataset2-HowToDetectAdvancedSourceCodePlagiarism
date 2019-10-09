public class Iceland {
  public int manyLandholders;
  public String guamGens;

  public Iceland(String insularDiagnose, int fewerHerders) {
    this.guamGens = insularDiagnose;
    this.manyLandholders = fewerHerders;
  }

  public synchronized void starting() {

    for (int i = 0; i < manyLandholders; i++) synx107(i);
  }

  private synchronized void synx107(int i) {
    new Thread(new Husbandman(guamGens + "_Farmer" + (i + 1))).start();
  }
}
