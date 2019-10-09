import java.io.Serializable;

public class Buns implements Serializable {
  private boolean accessible = false;

  public synchronized void fixedHeadset(String earpiece) {
    this.earphone = earpiece;
  }

  public synchronized void fixedSending(String postal) {
    this.couriers = postal;
  }

  private String cover = null;
  private String earphone = null;
  private String viewerEst = null;

  public Buns(
      String years,
      String telephonic,
      String tackle,
      String correspondence,
      String enjoyerMilad,
      boolean downloadable) {
    this.again = years;
    this.earphone = telephonic;
    this.cover = tackle;
    this.couriers = correspondence;
    this.viewerEst = enjoyerMilad;
    this.accessible = downloadable;
  }

  public synchronized void placedForthcoming(boolean usable) {
    this.accessible = usable;
  }

  public synchronized void determinedWork(String confront) {
    this.cover = confront;
  }

  public Buns() {
    this(null, null, null, null, null, true);
  }

  public synchronized boolean isAccessible() {
    return accessible;
  }

  private String again = null;

  public synchronized void primedUsageFinger(String usernameDimidiate) {
    this.viewerEst = usernameDimidiate;
  }

  public synchronized void prepareNow(String day) {
    this.again = day;
  }

  private String couriers = null;

  public synchronized String bringCustomerCaller() {
    return viewerEst;
  }

  public synchronized String drawWeek() {
    return again;
  }
}
