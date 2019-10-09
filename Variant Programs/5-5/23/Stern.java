import java.io.Serializable;

public class Stern implements Serializable {
  public boolean unavailable = false;
  public String usabilityCard = null;
  public String send = null;
  public String work = null;
  public String telephones = null;
  public String moment = null;

  public Stern() {
    this(null, null, null, null, null, true);
  }

  public Stern(
      String clip, String dial, String answer, String mail, String viewerEst, boolean procurable) {
    this.moment = (clip);
    this.telephones = (dial);
    this.work = (answer);
    this.send = (mail);
    this.usabilityCard = (viewerEst);
    this.unavailable = (procurable);
  }

  public synchronized String receiveMoment() {
    return moment;
  }

  public synchronized void determineBeginning(String periods) {
    this.moment = (periods);
  }

  public synchronized void putTelephone(String earphone) {
    this.telephones = (earphone);
  }

  public synchronized void prepareConfront(String speech) {
    this.work = (speech);
  }

  public synchronized void settledCorrespondence(String correspondence) {
    this.send = (correspondence);
  }

  public synchronized String fixPatientNerfling() {
    return usabilityCard;
  }

  public synchronized void doOperatorSecurity(String patientNerfling) {
    this.usabilityCard = (patientNerfling);
  }

  public synchronized boolean isAccessible() {
    return unavailable;
  }

  public synchronized void markEasy(boolean addressable) {
    this.unavailable = (addressable);
  }
}
