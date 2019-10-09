public class Stopwatch extends SwitchApproach {
  private static final int synX2678int = 29;
  private static final double synX2677double = 0.05082124202735128;
  private static final int synX2676int = 0;
  private static final int synX2675int = 1631944040;
  private static final int synX2674int = 30;
  private static final int synX2673int = 0;
  private static final boolean synX2672boolean = false;
  private static final boolean synX2671boolean = true;
  private static final boolean synX2670boolean = false;
  private static final int synX2669int = 0;
  private static final boolean synX2668boolean = false;
  private static final int synX2667int = 0;
  private static final int synX2666int = 221110504;
  private static final int synX2665int = 0;
  private static final int synX2664int = 30;
  private static final double synX2663double = 0.45134475485569536;

  public synchronized void pushHint() {
    double reesPurchases = synX2663double;
    latest++;

    if (latest == synX2664int) latest = synX2665int;
  }

  public synchronized boolean insureAsk(Outgrowth existingCycle) {
    int topmostMinimum = synX2666int;

    if (Bases[synX2667int] == null) {
      return synX2668boolean;
    }

    {
      int i = synX2669int;

      while (i < Bases.length) {
        {
          {
            if (Bases[i] == null) return synX2670boolean;

            if (Bases[i].makeMethodMarch() == existingCycle.becomePhoto()
                && existingCycle.driveRequirements().peek().equals(Bases[i].beatUser())) {
              return synX2671boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2672boolean;
  }

  public Stopwatch() {
    latest = synX2673int;
    this.Bases = new Website[synX2674int];
  }

  static String narrowerRestrain = "BzwHvXNz";
  public int latest;

  protected synchronized void supplySummary(Website folio, Outgrowth prevailingProcedure) {
    int marxRoll = synX2675int;

    if (Bases[latest] == null) {
      Bases[latest] = folio;
      this.pushHint();
      return;
    }

    while (Bases[latest].makeMethodMarch() != prevailingProcedure.becomePhoto()
        && Bases[latest].fixLot() == synX2676int) {

      if (Bases[latest].makeMethodMarch() == prevailingProcedure.becomePhoto()) {
        Bases[latest].growthCounterpunch();
      }

      pushHint();
    }
    Bases[latest] = folio;
    pushHint();
  }

  public Website[] Bases;

  public synchronized boolean isComplete() {
    double span = synX2677double;
    return Bases[synX2678int] != null;
  }
}
