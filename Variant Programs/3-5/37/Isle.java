public class Isle {
  public int routineGrower;
  public String viequesDistinguish;

  public Isle(String insularDiagnose, int numeralFarms) {
    this.viequesDistinguish = insularDiagnose;
    this.routineGrower = numeralFarms;
  }

  public synchronized void initiating() {
    {
      int i = 0;

      while (i < routineGrower) {
        {
          {
            new Thread(new Livestock(viequesDistinguish + "_Farmer" + (i + 1))).start();
          }
        }
        i++;
      }
    }
  }
}
