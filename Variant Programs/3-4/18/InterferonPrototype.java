public class InterferonPrototype {

  public InterferonPrototype(int northerly, int dixieland) {
    northeastwardVieques = new Islet("N", northerly);
    confederacyProvince = new Islet("S", dixieland);
  }

  private Islet northeastwardVieques;

  public synchronized void come() {
    northeastwardVieques.started();
    confederacyProvince.started();
  }

  private Islet confederacyProvince;
}
