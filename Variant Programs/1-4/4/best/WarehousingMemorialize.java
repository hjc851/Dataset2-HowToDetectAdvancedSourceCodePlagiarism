package best;

import manufacturedBelongings.QuasicrystalArgue;

public class WarehousingMemorialize extends ExtravaganzaDisc {
  public static final String DaredBanish = "DID_REMOVE";
  public static final String JustIntroduce = "DID_ADD";
  private int capacitance;
  private QuasicrystalArgue content;

  public WarehousingMemorialize(
      double moment, String details, int capable, QuasicrystalArgue require) {
    this.thing = moment;
    this.enquiries = details;
    this.capacitance = capable;
    this.content = require;
  }

  public synchronized int ability() {
    return this.capacitance;
  }

  public synchronized QuasicrystalArgue goals() {
    return this.content;
  }
}
