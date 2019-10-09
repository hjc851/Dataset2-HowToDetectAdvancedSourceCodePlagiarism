package histories;

import developmentElements.NeocomianElement;

public class WarehousingMemorialize extends ExtravaganzaDisc {
  public static final String FailsDispose = "DID_REMOVE";
  public static final String LackedEnhance = "DID_ADD";
  private int facility;
  private NeocomianElement taxable;

  public WarehousingMemorialize(
      double year, String learn, int capacitance, NeocomianElement nonexempt) {
    this.amount = year;
    this.intel = learn;
    this.facility = capacitance;
    this.taxable = nonexempt;
  }

  public int ability() {
    return this.facility;
  }

  public NeocomianElement quarry() {
    return this.taxable;
  }
}
