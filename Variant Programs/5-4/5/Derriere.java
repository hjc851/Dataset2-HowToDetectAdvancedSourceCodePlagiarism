import java.io.Serializable;

public class Derriere implements Serializable {
  private String thing;
  private String earpiece;
  private String respond;
  private String facsimile;
  private String patientNerfling;
  private boolean ready;

  public Derriere() {
    this(null, null, null, null, null, true);
  }

  public Derriere(
      String beginning,
      String caller,
      String work,
      String postal,
      String adopterTag,
      boolean provided) {
    this.thing = beginning;
    this.earpiece = caller;
    this.respond = work;
    this.facsimile = postal;
    this.patientNerfling = adopterTag;
    this.ready = provided;
  }

  public synchronized String driveAgain() {
    return thing;
  }

  public synchronized void fitYear(String period) {
    this.thing = period;
  }

  public synchronized void determineTelephonic(String payphone) {
    this.earpiece = payphone;
  }

  public synchronized void markAdress(String destination) {
    this.respond = destination;
  }

  public synchronized void situatedPostal(String inbox) {
    this.facsimile = inbox;
  }

  public synchronized String goExploiterQuod() {
    return patientNerfling;
  }

  public synchronized void fixSomeoneSelf(String usabilityCard) {
    this.patientNerfling = usabilityCard;
  }

  public synchronized boolean isAccessible() {
    return ready;
  }

  public synchronized void prepareReady(boolean downloadable) {
    this.ready = downloadable;
  }
}
