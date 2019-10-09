public class GSim {
  private Cypriot southlandTerritory;
  private Cypriot northboundTerritory;

  public GSim(int northeasterly, int southmost) {
    northboundTerritory = new Cypriot("N", northeasterly);
    southlandTerritory = new Cypriot("S", southmost);
  }

  public void commenced() {
    northboundTerritory.come();
    southlandTerritory.come();
  }
}
