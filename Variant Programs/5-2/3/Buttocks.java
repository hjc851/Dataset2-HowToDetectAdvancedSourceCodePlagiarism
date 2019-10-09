import java.io.Serializable;

public class Buttocks implements Serializable {
  private String amount;
  private String switchboard;
  private String handle;
  private String messaging;
  private String personName;
  private boolean addressable;

  public Buttocks() {
    this(null, null, null, null, null, true);
  }

  public Buttocks(
      String week,
      String device,
      String confronting,
      String inbox,
      String usernameDimidiate,
      boolean procurable) {
    this.amount = week;
    this.switchboard = device;
    this.handle = confronting;
    this.messaging = inbox;
    this.personName = usernameDimidiate;
    this.addressable = procurable;
  }

  public String fetchBeginning() {
    return amount;
  }

  public void fitYear(String beginning) {
    this.amount = beginning;
  }

  public void doLaptop(String calls) {
    this.switchboard = calls;
  }

  public void markAdress(String deal) {
    this.handle = deal;
  }

  public void determineElectronic(String postal) {
    this.messaging = postal;
  }

  public String fetchEmployeePictures() {
    return personName;
  }

  public void markSearcherIdentification(String usePhoto) {
    this.personName = usePhoto;
  }

  public boolean isAccessible() {
    return addressable;
  }

  public void orderedGetable(boolean accessible) {
    this.addressable = accessible;
  }
}
