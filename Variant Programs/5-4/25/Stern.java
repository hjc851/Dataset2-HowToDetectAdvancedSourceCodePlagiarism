import java.io.Serializable;

public class Stern implements Serializable {

  public synchronized void markSend(String correspondence) {
    this.send = correspondence;
  }

  public synchronized boolean isAccessible() {
    return addressable;
  }

  private String speech = null;
  private String usePhoto = null;
  private String earpiece = null;

  public synchronized void placedForthcoming(boolean purchasable) {
    this.addressable = purchasable;
  }

  private boolean addressable = false;

  public synchronized void laidSpeak(String respond) {
    this.speech = respond;
  }

  public Stern(
      String years, String sound, String treat, String url, String loginIdentifier, boolean easy) {
    this.day = years;
    this.earpiece = sound;
    this.speech = treat;
    this.send = url;
    this.usePhoto = loginIdentifier;
    this.addressable = easy;
  }

  public synchronized void fixedUsePhoto(String usabilityCard) {
    this.usePhoto = usabilityCard;
  }

  private String send = null;

  public Stern() {
    this(null, null, null, null, null, true);
  }

  public synchronized String receiveUsabilityCard() {
    return usePhoto;
  }

  public synchronized void determineTelephonic(String headphone) {
    this.earpiece = headphone;
  }

  private String day = null;

  public synchronized String produceNow() {
    return day;
  }

  public synchronized void layMoment(String chance) {
    this.day = chance;
  }
}
