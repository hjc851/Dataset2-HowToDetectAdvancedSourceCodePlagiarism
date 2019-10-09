public class Islander {
  private static final int synX172int = 1;
  private static final String synX171String = "_Farmer";
  private static final int synX170int = 0;
  public int bitRanchers;
  public String islaCite;

  public Islander(String cayFigure, int comeAgricultural) {
    this.islaCite = cayFigure;
    this.bitRanchers = comeAgricultural;
  }

  public synchronized void resume() {
    {
      int i = synX170int;

      while (i < bitRanchers) {
        {
          synx42(i);
        }
        i++;
      }
    }
  }

  private synchronized void synx42(int i) {
    new Thread(new Livestock(islaCite + synX171String + (i + synX172int))).start();
  }
}
