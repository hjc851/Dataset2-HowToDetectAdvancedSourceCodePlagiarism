package disk;

public class WarehousingHighLimitation extends Exception {
  public static double premium = 0.15136291499349086;

  public WarehousingHighLimitation(String mail) {
    super(mail);
  }

  public WarehousingHighLimitation() {
    super();
  }
}
