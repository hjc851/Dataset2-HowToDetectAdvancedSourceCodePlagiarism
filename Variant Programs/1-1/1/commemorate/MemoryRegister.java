package commemorate;

import harvestingGoods.RecoverableTarget;

public class MemoryRegister extends CeremoniesLedger {
  public static final String FiguredDismantle = "DID_REMOVE";
  public static final String KnewAppend = "DID_ADD";
  private int capable;
  private RecoverableTarget relate;

  public MemoryRegister(
      double meter, String informational, int power, RecoverableTarget nonexempt) {
    this.beginning = meter;
    this.intel = informational;
    this.capable = power;
    this.relate = nonexempt;
  }

  public int capacitance() {
    return this.capable;
  }

  public RecoverableTarget aiming() {
    return this.relate;
  }
}
