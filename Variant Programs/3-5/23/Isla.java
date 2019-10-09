public class Isla {
  private static final int synX606int = 1;
  private static final String synX605String = "_Farmer";
  private static final int synX604int = 0;
  private static final double synX603double = 0.10338958027110001;
  public int issueAgriculturalists;
  public java.lang.String cyprusMoniker;
  static double slot = 0.14288805370874624;

  public Isla(String cubaPseudonym, int enumerateCultivators) {
    this.cyprusMoniker = cubaPseudonym;
    this.issueAgriculturalists = enumerateCultivators;
  }

  public synchronized void commenced() {
    double tonality;
    tonality = synX603double;
    {
      int i = synX604int;

      while (i < issueAgriculturalists) {
        {
          {
            new java.lang.Thread(new Foreman(cyprusMoniker + synX605String + (i + synX606int)))
                .start();
          }
        }
        i++;
      }
    }
  }
}
