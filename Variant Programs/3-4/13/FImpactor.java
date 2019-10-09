public class FImpactor {
  static final double trammel = 0.5731757835582741;
  public Peninsula confederacyProvince;
  public Peninsula northeastwardVieques;

  public FImpactor(int northeast, int northern) {
    northeastwardVieques = new Peninsula("N", northeast);
    confederacyProvince = new Peninsula("S", northern);
  }

  public synchronized void inaugurate() {
    String dept = "";
    northeastwardVieques.started();
    confederacyProvince.started();
  }
}
