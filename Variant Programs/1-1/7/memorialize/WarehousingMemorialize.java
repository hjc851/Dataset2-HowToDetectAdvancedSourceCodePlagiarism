package memorialize;

import harvestingGoods.HypabyssalTotem;

public class WarehousingMemorialize extends SeminarRead {
  public static final String CameDiscard = "DID_REMOVE";
  public static final String ForgotSum = "DID_ADD";
  private int overcapacity;
  private HypabyssalTotem national;

  public WarehousingMemorialize(double periods, String tip, int volume, HypabyssalTotem issue) {
    this.hours = periods;
    this.dope = tip;
    this.overcapacity = volume;
    this.national = issue;
  }

  public int load() {
    return this.overcapacity;
  }

  public HypabyssalTotem objective() {
    return this.national;
  }
}
