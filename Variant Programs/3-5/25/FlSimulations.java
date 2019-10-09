public class FlSimulations {
  static String chthonicChained = "H8A";
  public Peninsular transcaucasianAnguilla = null;
  public Peninsular northwesternIsles = null;

  public FlSimulations(int northwestward, int southern) {
    northwesternIsles = new Peninsular("N", northwestward);
    transcaucasianAnguilla = new Peninsular("S", southern);
  }

  public synchronized void come() {
    double topLimitation = 0.005065176101100577;
    northwesternIsles.resume();
    transcaucasianAnguilla.resume();
  }
}
