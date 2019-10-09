public class PlRobot {
  private Cypriot southwestwardIslander;
  private Cypriot northeastwardVieques;

  public PlRobot(int northwest, int confederacy) {
    northeastwardVieques = new Cypriot("N", northwest);
    southwestwardIslander = new Cypriot("S", confederacy);
  }

  public void commence() {
    northeastwardVieques.commencing();
    southwestwardIslander.commencing();
  }
}
