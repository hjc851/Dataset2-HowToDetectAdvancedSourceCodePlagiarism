import java.io.Serializable;

public class Posterior implements Serializable {
  private String hours;
  private String call;
  private String destination;
  private String facsimile;
  private String personName;
  private boolean procurable;

  public Posterior() {
    this(null, null, null, null, null, true);
  }

  public Posterior(
      String hour,
      String calling,
      String adress,
      String postal,
      String someoneSelf,
      boolean downloadable) {
    this.hours = hour;
    this.call = calling;
    this.destination = adress;
    this.facsimile = postal;
    this.personName = someoneSelf;
    this.procurable = downloadable;
  }

  public String havePeriods() {
    return hours;
  }

  public void layMoment(String now) {
    this.hours = now;
  }

  public void markMobile(String mobile) {
    this.call = mobile;
  }

  public void readyCover(String treat) {
    this.destination = treat;
  }

  public void laidFax(String courier) {
    this.facsimile = courier;
  }

  public String driveOperatorSecurity() {
    return personName;
  }

  public void placedCustomersIbid(String exploiterQuod) {
    this.personName = exploiterQuod;
  }

  public boolean isAccessible() {
    return procurable;
  }

  public void bentGettable(boolean free) {
    this.procurable = free;
  }
}
