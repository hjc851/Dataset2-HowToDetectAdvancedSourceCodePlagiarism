package platter;

import manufactureOrnaments.ImmiscibleDisagree;

public class DepotDisc extends CelebrationEnter {
  public static final String TookErase = "DID_REMOVE";
  public static final String SawAugment = "DID_ADD";
  private int power;
  private ImmiscibleDisagree content;

  public DepotDisc(double hour, String informational, int strength, ImmiscibleDisagree field) {
    this.when = hour;
    this.learn = informational;
    this.power = strength;
    this.content = field;
  }

  public int wherewithal() {
    return this.power;
  }

  public ImmiscibleDisagree aim() {
    return this.content;
  }
}
