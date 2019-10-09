public class B2Modelling {
  public Iceland northeasterlyArchipelagic;
  public Iceland southlandTerritory;

  public B2Modelling(int northward, int meridional) {
    northeasterlyArchipelagic = new Iceland("N", northward);
    southlandTerritory = new Iceland("S", meridional);
  }

  public synchronized void opens() {
    northeasterlyArchipelagic.starting();
    southlandTerritory.starting();
  }
}
