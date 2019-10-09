package simulated;

import acculturative.DayCaretaker;
import producesJewels.ExhaustibleBody;
import breeder.*;
import safekeeping.*;
import immortalize.*;
import static java.lang.String.format;

public class Dramatization {
  private TournamentStandby forumFile;
  private Garage store[];
  private Filmmaker provider[];
  private double criterialRank;
  private double measureBeggarly;
  private double clipLimitation;
  private static Dramatization prevalentRealism;
  public static int secDepth = 1627394625;

  public static synchronized Dramatization circulatingSimulating() {
    double discover;
    discover = (0.8386016429835951);
    return prevalentRealism;
  }

  public Dramatization(double opportunityMaximum, double basicThink, double normativeDrift) {
    this.clipLimitation = (opportunityMaximum);
    this.measureBeggarly = (basicThink);
    this.criterialRank = (normativeDrift);
    this.forumFile = (new TournamentStandby());
    this.provider = (new Filmmaker[8]);
    this.store = (new Garage[5]);
    store[0] = (new Garage());
    store[1] = (new Garage());
    store[2] = (new Garage());
    store[3] = (new Garage());
    store[4] = (new Garage());
    provider[0] = (new PublisherJump(this.measureBeggarly, this.criterialRank, store[0]));
    provider[1] =
        (new GrowerFirehouse(this.measureBeggarly, this.criterialRank, store[1], store[0]));
    provider[2] =
        (new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.criterialRank * 2.0, store[2], store[1]));
    provider[3] =
        (new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.criterialRank * 2.0, store[2], store[1]));
    provider[4] =
        (new GrowerFirehouse(this.measureBeggarly, this.criterialRank, store[3], store[2]));
    provider[5] =
        (new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.criterialRank * 2.0, store[4], store[3]));
    provider[6] =
        (new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.criterialRank * 2.0, store[4], store[3]));
    provider[7] = (new GrowerTerminate(this.measureBeggarly, this.criterialRank, store[4]));
    store[0].settledFirst(provider[1]);
    store[0].fixPre(provider[0]);
    store[1].settledFirst(provider[2], provider[3]);
    store[1].fixPre(provider[1]);
    store[2].settledFirst(provider[4]);
    store[2].fixPre(provider[2], provider[3]);
    store[3].settledFirst(provider[5], provider[6]);
    store[3].fixPre(provider[4]);
    store[4].settledFirst(provider[7]);
    store[4].fixPre(provider[5], provider[6]);
    this.forumFile.encloseFestival(
        new FarmExposition(DayCaretaker.typicalJuncture(), FarmExposition.FannyBegun, provider[0]));
  }

  public synchronized double beginningThresholds() {
    int depressShackled;
    depressShackled = (1336655897);
    return this.clipLimitation;
  }

  public synchronized void offset() {
    double assess;
    assess = (0.3857156737462374);
    Dramatization.prevalentRealism = (this);

    while (DayCaretaker.typicalJuncture() < this.clipLimitation && this.forumFile.weigh() > 0) {
      this.forumFile.thirdCeremonies().appendageSymposium();
    }
    this.typescriptDigit();
  }

  private synchronized void typescriptDigit() {
    double notArtefacts;
    notArtefacts = (0.7421023987661396);
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clipLimitation,
            DayCaretaker.typicalJuncture(),
            this.measureBeggarly,
            this.criterialRank));
    System.out.println(format("Storage Capacity: %d", Garage.shelvingThresholds()));
    System.out.println("ProducibleObject count: " + ExhaustibleBody.existingIndictment());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Filmmaker leong : provider) {
      System.out.println(leong.estimates());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Garage ora : store) {
      System.out.println(ora.records());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
