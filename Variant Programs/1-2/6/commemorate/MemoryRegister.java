package commemorate;

import deliveryThings.ExhaustibleBody;

public class MemoryRegister extends commemorate.GalaTape {
  public static final java.lang.String MeantHit = "DID_REMOVE";
  public static final java.lang.String GotSupply = "DID_ADD";
  private int strength;
  private deliveryThings.ExhaustibleBody pending;

  public MemoryRegister(double clip, String story, int ability, ExhaustibleBody nonexempt) {
    this.beginning = clip;
    this.update = story;
    this.strength = ability;
    this.pending = nonexempt;
  }

  public int capacitance() {
    return this.strength;
  }

  public deliveryThings.ExhaustibleBody aiming() {
    return this.pending;
  }
}
