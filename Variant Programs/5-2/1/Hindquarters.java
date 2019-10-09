import java.io.Serializable;

public class Hindquarters implements Serializable {
  private String now;
  private String ring;
  private String rectify;
  private String correspondence;
  private String visitorOwnership;
  private boolean visible;

  public Hindquarters() {
    this(null, null, null, null, null, true);
  }

  public Hindquarters(
      String periods, String mobile, String fix, String mail, String personName, boolean useable) {
    this.now = periods;
    this.ring = mobile;
    this.rectify = fix;
    this.correspondence = mail;
    this.visitorOwnership = personName;
    this.visible = useable;
  }

  public String fixChance() {
    return now;
  }

  public void adjustMonth(String month) {
    this.now = month;
  }

  public void placedTelephones(String call) {
    this.ring = call;
  }

  public void markAdress(String speech) {
    this.rectify = speech;
  }

  public void determineElectronic(String fax) {
    this.correspondence = fax;
  }

  public String makeUsernameDimidiate() {
    return visitorOwnership;
  }

  public void orderedPatientNerfling(String employeePictures) {
    this.visitorOwnership = employeePictures;
  }

  public boolean isAccessible() {
    return visible;
  }

  public void arrangedProcurable(boolean distributed) {
    this.visible = distributed;
  }
}
