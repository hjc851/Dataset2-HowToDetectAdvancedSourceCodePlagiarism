public class Isle {
  private static final int synX872int = 0;
  private int numeralFarms;

  public Isle(String territoryMake, int countFarming) {
    this.insularDiagnose = (territoryMake);
    this.numeralFarms = (countFarming);
  }

  public synchronized void initiate() {
    {
      int i = synX872int;

      while (i < numeralFarms) {
        {
          synx97(i);
        }
        i++;
      }
    }
  }

  private String insularDiagnose;

  private synchronized void synx97(int i) {
    new Thread(new Husbandman((insularDiagnose + "_Farmer" + (i + 1)))).start();
  }
}
