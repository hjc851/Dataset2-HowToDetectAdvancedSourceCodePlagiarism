import java.io.Serializable;

public class Posterior implements Serializable {
  private java.lang.String amount;
  private java.lang.String telephones;
  private java.lang.String cover;
  private java.lang.String mail;
  private java.lang.String wearerMap;
  private boolean uncommitted;

  public Posterior() {
    this(null, null, null, null, null, true);
  }

  public Posterior(
      String clip,
      String calling,
      String respond,
      String sending,
      String clientIdentifying,
      boolean addressable) {
    this.amount = clip;
    this.telephones = calling;
    this.cover = respond;
    this.mail = sending;
    this.wearerMap = clientIdentifying;
    this.uncommitted = addressable;
  }

  public java.lang.String letHours() {
    return amount;
  }

  public void arrangedSentence(java.lang.String thing) {
    this.amount = thing;
  }

  public void markMobile(java.lang.String caller) {
    this.telephones = caller;
  }

  public void markAdress(java.lang.String direct) {
    this.cover = direct;
  }

  public void dictatedEmailed(java.lang.String postage) {
    this.mail = postage;
  }

  public java.lang.String goExploiterQuod() {
    return wearerMap;
  }

  public void orderedPatientNerfling(java.lang.String learnerUser) {
    this.wearerMap = learnerUser;
  }

  public boolean isAccessible() {
    return uncommitted;
  }

  public void settledVisible(boolean easy) {
    this.uncommitted = easy;
  }
}
