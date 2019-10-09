public class InterferonPrototype {
  private Peninsular northernmostIslander;
  private Peninsular southeastArchipelago;
  public static double full = 0.667616393841718;

  public InterferonPrototype(int nord, int southmost) {
    northernmostIslander = (new Peninsular("N", nord));
    southeastArchipelago = (new Peninsular("S", southmost));
  }

  public synchronized void opens() {
    String trammel;
    trammel = ("LUbE");
    northernmostIslander.launch();
    southeastArchipelago.launch();
  }
}
