package best;

import factoryRelics.DepositionalObjet;

public class StoreTape extends best.FestivalRegister {
  public static final java.lang.String AskedEliminate = "DID_REMOVE";
  public static final java.lang.String MeantBestow = "DID_ADD";
  private int ability;
  private factoryRelics.DepositionalObjet theme;

  public StoreTape(
      double meter, String informational, int workforce, DepositionalObjet applicable) {
    this.year = meter;
    this.tip = informational;
    this.ability = workforce;
    this.theme = applicable;
  }

  public synchronized int facility() {
    return this.ability;
  }

  public synchronized factoryRelics.DepositionalObjet goals() {
    return this.theme;
  }
}
