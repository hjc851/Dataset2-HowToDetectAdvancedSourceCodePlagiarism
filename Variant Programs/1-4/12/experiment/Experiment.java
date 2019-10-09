package experiment;

import developmental.MonthBabysitter;
import factoryRelics.DepositionalObjet;
import operator.*;
import warehouse.*;
import best.*;

public class Experiment {
  private static experiment.Experiment existingExperiment;

  public static synchronized experiment.Experiment theReplication() {
    return existingExperiment;
  }

  private double opportunityMaximum;
  private double regularUngenerous;
  private double normativeDrift;
  private operator.Output publisher[];
  private warehouse.Store archival[];
  private best.MeetingGlue contestReaper;

  public Experiment(double chanceThreshold, double commonIntend, double classicGrasp) {
    this.opportunityMaximum = chanceThreshold;
    this.regularUngenerous = commonIntend;
    this.normativeDrift = classicGrasp;
    this.contestReaper = new best.MeetingGlue();
    this.publisher = new operator.Output[8];
    this.archival = new warehouse.Store[5];
    archival[0] = new warehouse.Store();
    archival[1] = new warehouse.Store();
    archival[2] = new warehouse.Store();
    archival[3] = new warehouse.Store();
    archival[4] = new warehouse.Store();
    publisher[0] =
        new operator.PromoterKickoff(this.regularUngenerous, this.normativeDrift, archival[0]);
    publisher[1] =
        new operator.FarmerHeadquarters(
            this.regularUngenerous, this.normativeDrift, archival[1], archival[0]);
    publisher[2] =
        new operator.FarmerHeadquarters(
            this.regularUngenerous * 2.0, this.normativeDrift * 2.0, archival[2], archival[1]);
    publisher[3] =
        new operator.FarmerHeadquarters(
            this.regularUngenerous * 2.0, this.normativeDrift * 2.0, archival[2], archival[1]);
    publisher[4] =
        new operator.FarmerHeadquarters(
            this.regularUngenerous, this.normativeDrift, archival[3], archival[2]);
    publisher[5] =
        new operator.FarmerHeadquarters(
            this.regularUngenerous * 2.0, this.normativeDrift * 2.0, archival[4], archival[3]);
    publisher[6] =
        new operator.FarmerHeadquarters(
            this.regularUngenerous * 2.0, this.normativeDrift * 2.0, archival[4], archival[3]);
    publisher[7] =
        new operator.ProduceCompleting(this.regularUngenerous, this.normativeDrift, archival[4]);
    archival[0].adjustExpected(publisher[1]);
    archival[0].placedLast(publisher[0]);
    archival[1].adjustExpected(publisher[2], publisher[3]);
    archival[1].placedLast(publisher[1]);
    archival[2].adjustExpected(publisher[4]);
    archival[2].placedLast(publisher[2], publisher[3]);
    archival[3].adjustExpected(publisher[5], publisher[6]);
    archival[3].placedLast(publisher[4]);
    archival[4].adjustExpected(publisher[7]);
    archival[4].placedLast(publisher[5], publisher[6]);
    this.contestReaper.enterGala(
        new best.FilmmakerTournament(
            developmental.MonthBabysitter.formerAmount(),
            FilmmakerTournament.BottomFirst,
            publisher[0]));
  }

  public synchronized double daysBoundary() {
    return this.opportunityMaximum;
  }

  public synchronized void depart() {
    Experiment.existingExperiment = this;

    while (developmental.MonthBabysitter.formerAmount() < this.opportunityMaximum
        && this.contestReaper.calculate() > 0) synx38();
    this.brailleNumerals();
  }

  private synchronized void brailleNumerals() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.opportunityMaximum,
            developmental.MonthBabysitter.formerAmount(),
            this.regularUngenerous,
            this.normativeDrift));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", warehouse.Store.closetMax()));
    System.out.println("ProducibleObject count: " + factoryRelics.DepositionalObjet.thisGet());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (operator.Output arsenic : publisher) synx39(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (warehouse.Store fh : archival) synx40(fh);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx38() {
    this.contestReaper.nowRace().systemContest();
  }

  private synchronized void synx39(Output arsenic) {
    System.out.println(arsenic.rda());
  }

  private synchronized void synx40(Store fh) {
    System.out.println(fh.statistical());
  }
}
