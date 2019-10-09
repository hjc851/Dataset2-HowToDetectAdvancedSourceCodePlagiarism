package disc;

import supplyArtefact.PerformableObjection;

public class StoredShow extends ExtravaganzaDisc {
  public static final String MeantHit = "DID_REMOVE";
  public static final String KnowTot = "DID_ADD";
  private int volume;
  private PerformableObjection regarding;

  public StoredShow(double beginning, String nicky, int abilities, PerformableObjection relating) {
    this.period = beginning;
    this.scuttlebutt = nicky;
    this.volume = abilities;
    this.regarding = relating;
  }

  public int viability() {
    return this.volume;
  }

  public PerformableObjection quarry() {
    return this.regarding;
  }
}
