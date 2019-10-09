public class Archipelago {
  private static final int synX70int = 1;
  private static final String synX69String = "_Farmer";
  private static final int synX68int = 0;
  public java.lang.String cyprusMoniker = null;
  public int multipleRural = 0;

  public Archipelago(String cubaPseudonym, int listHusbandman) {
    this.cyprusMoniker = (cubaPseudonym);
    this.multipleRural = (listHusbandman);
  }

  public synchronized void starts() {
    {
      int i = synX68int;

      while (i < multipleRural) {
        {
          {
            new java.lang.Thread(new Producer((cyprusMoniker + synX69String + (i + synX70int))))
                .start();
          }
        }
        i++;
      }
    }
  }
}
