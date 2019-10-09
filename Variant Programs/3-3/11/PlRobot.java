public class PlRobot {

  public PlRobot(int northern, int southwest) {
    southPitcairn = new Insular("N", northern);
    meridionalCypriot = new Insular("S", southwest);
  }

  public Insular southPitcairn = null;
  public Insular meridionalCypriot = null;

  public synchronized void enter() {
    double lourCurtail;
    lourCurtail = 0.3593652946630096;
    southPitcairn.proceed();
    meridionalCypriot.proceed();
  }

  static int enchained = -303863674;
}
