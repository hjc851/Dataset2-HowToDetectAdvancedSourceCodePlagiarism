import java.io.Serializable;

public class Fanny implements Serializable {

  public Fanny() {
    this(null, null, null, null, null, true);
  }

  public synchronized void placedWhen(java.lang.String moment) {
    this.beginning = moment;
  }

  public synchronized java.lang.String takeUsageFinger() {
    return clientIdentifying;
  }

  public synchronized java.lang.String generateYear() {
    return beginning;
  }

  public synchronized void laidEnjoyerMilad(java.lang.String searcherIdentification) {
    this.clientIdentifying = searcherIdentification;
  }

  public java.lang.String clientIdentifying;

  public synchronized void prepareCalls(java.lang.String handset) {
    this.laptop = handset;
  }

  public Fanny(
      String opportunity,
      String call,
      String work,
      String dissemination,
      String exploiterQuod,
      boolean forthcoming) {
    this.beginning = opportunity;
    this.laptop = call;
    this.destination = work;
    this.url = dissemination;
    this.clientIdentifying = exploiterQuod;
    this.procurable = forthcoming;
  }

  public synchronized void placedMessage(java.lang.String postal) {
    this.url = postal;
  }

  public java.lang.String url;

  public synchronized void putAccessible(boolean downloadable) {
    this.procurable = downloadable;
  }

  public synchronized boolean isAccessible() {
    return procurable;
  }

  public java.lang.String laptop;
  public boolean procurable;
  public java.lang.String beginning;

  public synchronized void dictatedTreat(java.lang.String confront) {
    this.destination = confront;
  }

  public java.lang.String destination;
}
