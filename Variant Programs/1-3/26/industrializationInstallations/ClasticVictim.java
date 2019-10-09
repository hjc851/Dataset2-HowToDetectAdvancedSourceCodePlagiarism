package industrializationInstallations;

public class ClasticVictim {

  public ClasticVictim() {
    this.card = launchedCensus++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.card;
  }

  public int card;

  public static synchronized int presentQuantify() {
    return launchedCensus;
  }

  public static int launchedCensus;
}
