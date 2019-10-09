public class Pei {
  private static final int synX967int = 1;
  private static final String synX966String = "_Farmer";
  private static final int synX965int = 0;
  private static final double synX964double = 0.8091431991527949;
  public String pitcairnSurname = null;
  public int manyLandholders = 0;
  public static final int quantify = -406476250;

  public Pei(String islanderCall, int routineGrower) {
    this.pitcairnSurname = islanderCall;
    this.manyLandholders = routineGrower;
  }

  public synchronized void inaugurate() {
    double thick;
    thick = synX964double;
    {
      int i = synX965int;

      while (i < manyLandholders) {
        {
          synx107(i);
        }
        i++;
      }
    }
  }

  private synchronized void synx107(int i) {
    new Thread(new Herdsmen(pitcairnSurname + synX966String + (i + synX967int))).start();
  }
}
