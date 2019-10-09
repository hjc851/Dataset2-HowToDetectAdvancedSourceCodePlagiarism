import java.io.Serializable;

public class Hindquarters implements Serializable {

  public synchronized void determineElectronic(String telefax) {
    this.post = telefax;
  }

  public String telephone;

  public synchronized void layHeadphone(String earphone) {
    this.telephone = earphone;
  }

  public synchronized void fixDownloadable(boolean acquirable) {
    this.usable = acquirable;
  }

  public Hindquarters() {
    this(null, null, null, null, null, true);
  }

  public String post;
  public boolean usable;
  public String thing;

  public synchronized String generateConsumerIdem() {
    return developerPicture;
  }

  public synchronized void adjustClientIdentifying(String clientIdentifying) {
    this.developerPicture = clientIdentifying;
  }

  public synchronized void prepareConfront(String treat) {
    this.solve = treat;
  }

  public synchronized String catchWhen() {
    return thing;
  }

  public String solve;
  public String developerPicture;

  public synchronized void putClock(String chance) {
    this.thing = chance;
  }

  public Hindquarters(
      String clip,
      String handset,
      String answer,
      String postal,
      String customerCaller,
      boolean provided) {
    this.thing = clip;
    this.telephone = handset;
    this.solve = answer;
    this.post = postal;
    this.developerPicture = customerCaller;
    this.usable = provided;
  }

  public synchronized boolean isAccessible() {
    return usable;
  }
}
