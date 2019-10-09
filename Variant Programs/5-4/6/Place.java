import java.io.Serializable;

public class Place implements Serializable {
  public String moment = null;
  public String ring = null;
  public String discuss = null;
  public String messaging = null;
  public String wearerMap = null;
  public boolean disposable = false;

  public Place() {
    this(null, null, null, null, null, true);
  }

  public Place(
      String amount,
      String voice,
      String work,
      String mails,
      String searcherIdentification,
      boolean addressable) {
    this.moment = amount;
    this.ring = voice;
    this.discuss = work;
    this.messaging = mails;
    this.wearerMap = searcherIdentification;
    this.disposable = addressable;
  }

  public synchronized String sustainThing() {
    return moment;
  }

  public synchronized void determinedDays(String chance) {
    this.moment = chance;
  }

  public synchronized void fixedHeadset(String handset) {
    this.ring = handset;
  }

  public synchronized void settledDestination(String confronting) {
    this.discuss = confronting;
  }

  public synchronized void orderedPostage(String send) {
    this.messaging = send;
  }

  public synchronized String drawPersonName() {
    return wearerMap;
  }

  public synchronized void orderedPatientNerfling(String visitorOwnership) {
    this.wearerMap = visitorOwnership;
  }

  public synchronized boolean isAccessible() {
    return disposable;
  }

  public synchronized void adjustAddressable(boolean availability) {
    this.disposable = availability;
  }
}
