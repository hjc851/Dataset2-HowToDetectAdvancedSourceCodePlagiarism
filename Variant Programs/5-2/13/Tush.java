import java.io.Serializable;

public class Tush implements Serializable {
  private java.lang.String year;
  private java.lang.String landline;
  private java.lang.String destination;
  private java.lang.String fax;
  private java.lang.String customersIbid;
  private boolean viewable;

  public Tush() {
    this(null, null, null, null, null, true);
  }

  public Tush(
      String now,
      String mobile,
      String resolve,
      String mails,
      String loginIdentifier,
      boolean free) {
    this.year = now;
    this.landline = mobile;
    this.destination = resolve;
    this.fax = mails;
    this.customersIbid = loginIdentifier;
    this.viewable = free;
  }

  public java.lang.String beatJuncture() {
    return year;
  }

  public void arrangeYears(java.lang.String meter) {
    this.year = meter;
  }

  public void doLaptop(java.lang.String caller) {
    this.landline = caller;
  }

  public void layDeal(java.lang.String handle) {
    this.destination = handle;
  }

  public void placeFacsimile(java.lang.String emailed) {
    this.fax = emailed;
  }

  public java.lang.String obtainViewerEst() {
    return customersIbid;
  }

  public void fixedUsePhoto(java.lang.String consumerIdem) {
    this.customersIbid = consumerIdem;
  }

  public boolean isAccessible() {
    return viewable;
  }

  public void fitOpen(boolean disposable) {
    this.viewable = disposable;
  }
}
