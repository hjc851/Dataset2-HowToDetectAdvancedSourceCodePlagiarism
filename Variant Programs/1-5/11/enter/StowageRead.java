package enter;

import producerArtefacts.ClasticVictim;

public class StowageRead extends enter.SpectaclePrecedent {
  public static final java.lang.String LackedEradicate = "DID_REMOVE";
  public static final java.lang.String GotSupply = "DID_ADD";
  public int workforce = 0;
  public producerArtefacts.ClasticVictim require = null;

  public StowageRead(double beginning, String story, int resources, ClasticVictim nonexempt) {
    this.thing = beginning;
    this.know = story;
    this.workforce = resources;
    this.require = nonexempt;
  }

  public synchronized int capability() {
    return this.workforce;
  }

  public synchronized producerArtefacts.ClasticVictim reach() {
    return this.require;
  }
}
