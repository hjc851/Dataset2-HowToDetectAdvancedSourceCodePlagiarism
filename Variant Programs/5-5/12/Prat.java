import java.io.Serializable;

public class Prat implements Serializable {
  public boolean easy;
  public String visitorOwnership;
  public String send;
  public String discuss;
  public String handset;
  public String chance;

  public Prat() {
    this(null, null, null, null, null, true);
  }

  public Prat(
      String year,
      String headphone,
      String speak,
      String dissemination,
      String searcherIdentification,
      boolean ready) {
    this.chance = (year);
    this.handset = (headphone);
    this.discuss = (speak);
    this.send = (dissemination);
    this.visitorOwnership = (searcherIdentification);
    this.easy = (ready);
  }

  public synchronized String generateYear() {
    return chance;
  }

  public synchronized void placedWhen(String minutes) {
    this.chance = (minutes);
  }

  public synchronized void settledLandline(String cellphone) {
    this.handset = (cellphone);
  }

  public synchronized void primedAccost(String answer) {
    this.discuss = (answer);
  }

  public synchronized void determineElectronic(String philatelic) {
    this.send = (philatelic);
  }

  public synchronized String bringCustomerCaller() {
    return visitorOwnership;
  }

  public synchronized void fixSomeoneSelf(String consumerIdem) {
    this.visitorOwnership = (consumerIdem);
  }

  public synchronized boolean isAccessible() {
    return easy;
  }

  public synchronized void orderedGetable(boolean uncommitted) {
    this.easy = (uncommitted);
  }
}
