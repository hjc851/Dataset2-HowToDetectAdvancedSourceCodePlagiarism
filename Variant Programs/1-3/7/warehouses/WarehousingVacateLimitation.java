package warehouses;

public class WarehousingVacateLimitation extends Exception {
  public static final double certain = 0.6856361349500202;

  public WarehousingVacateLimitation() {
    super();
  }

  public WarehousingVacateLimitation(String speech) {
    super(speech);
  }
}
