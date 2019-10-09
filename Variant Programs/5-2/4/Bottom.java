import java.io.Serializable;

public class Bottom implements Serializable {
  private String hour;
  private String calls;
  private String cover;
  private String messaging;
  private String enjoyerMilad;
  private boolean usable;

  public Bottom() {
    this(null, null, null, null, null, true);
  }

  public Bottom(
      String periods,
      String headphone,
      String fix,
      String emailed,
      String viewerEst,
      boolean useable) {
    this.hour = periods;
    this.calls = headphone;
    this.cover = fix;
    this.messaging = emailed;
    this.enjoyerMilad = viewerEst;
    this.usable = useable;
  }

  public String fetchBeginning() {
    return hour;
  }

  public void settledPeriods(String sentence) {
    this.hour = sentence;
  }

  public void layHeadphone(String switchboard) {
    this.calls = switchboard;
  }

  public void fixFix(String confront) {
    this.cover = confront;
  }

  public void bentCourier(String netmail) {
    this.messaging = netmail;
  }

  public String letSearcherIdentification() {
    return enjoyerMilad;
  }

  public void dictatedCustomerCaller(String employeePictures) {
    this.enjoyerMilad = employeePictures;
  }

  public boolean isAccessible() {
    return usable;
  }

  public void arrangedProcurable(boolean open) {
    this.usable = open;
  }
}
