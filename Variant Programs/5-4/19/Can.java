import java.io.Serializable;

public class Can implements Serializable {
  private java.lang.String again;
  private java.lang.String call;
  private java.lang.String speech;
  private java.lang.String postal;
  private java.lang.String operatorSecurity;
  private boolean forthcoming;

  public Can() {
    this(null, null, null, null, null, true);
  }

  public Can(
      String hours,
      String headset,
      String treat,
      String correspondence,
      String searcherIdentification,
      boolean accessed) {
    this.again = hours;
    this.call = headset;
    this.speech = treat;
    this.postal = correspondence;
    this.operatorSecurity = searcherIdentification;
    this.forthcoming = accessed;
  }

  public synchronized java.lang.String catchWhen() {
    return again;
  }

  public synchronized void situatedMinutes(java.lang.String periods) {
    this.again = periods;
  }

  public synchronized void prepareCalls(java.lang.String voice) {
    this.call = voice;
  }

  public synchronized void bentAnswer(java.lang.String tackle) {
    this.speech = tackle;
  }

  public synchronized void situatedPostal(java.lang.String facsimile) {
    this.postal = facsimile;
  }

  public synchronized java.lang.String findLoginIdentifier() {
    return operatorSecurity;
  }

  public synchronized void fitConsumerIdem(java.lang.String loginIdentifier) {
    this.operatorSecurity = loginIdentifier;
  }

  public synchronized boolean isAccessible() {
    return forthcoming;
  }

  public synchronized void fixedViewable(boolean disposable) {
    this.forthcoming = disposable;
  }
}
