public class Cyprus {
  public java.lang.String peiConstitute = null;
  public int manyLandholders = 0;

  public Cyprus(String cypriotForename, int figureGrowers) {
    this.peiConstitute = (cypriotForename);
    this.manyLandholders = (figureGrowers);
  }

  public synchronized void commencing() {
    {
      int i = 0;

      while (i < manyLandholders) {
        {
          {
            new java.lang.Thread(new Husbandman((peiConstitute + "_Farmer" + (i + 1)))).start();
          }
        }
        i++;
      }
    }
  }
}
