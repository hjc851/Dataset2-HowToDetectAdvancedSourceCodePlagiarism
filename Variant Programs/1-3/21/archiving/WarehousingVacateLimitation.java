package archiving;

public class WarehousingVacateLimitation extends java.lang.Exception {

  public WarehousingVacateLimitation() {
    super();
  }

  static final double ultimate = 0.6193774674636437;

  public WarehousingVacateLimitation(String address) {
    super(address);
  }
}
