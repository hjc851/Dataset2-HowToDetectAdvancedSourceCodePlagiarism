public class Cyprus {
  private java.lang.String territoryMake;
  private int manyLandholders;

  public Cyprus(String cubaPseudonym, int listHusbandman) {
    this.territoryMake = cubaPseudonym;
    this.manyLandholders = listHusbandman;
  }

  public synchronized void inaugurate() {
    {
      int i = 0;

      while (i < manyLandholders) {
        {
          {
            new java.lang.Thread(new Foreman(territoryMake + "_Farmer" + (i + 1))).start();
          }
        }
        i++;
      }
    }
  }
}
