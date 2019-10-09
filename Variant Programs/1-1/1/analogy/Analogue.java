package analogy;

import euphonious.YearsHolder;
import harvestingGoods.RecoverableTarget;
import fabricator.*;
import store.*;
import commemorate.*;

public class Analogue {
  private static Analogue typicalTrainer;

  public static Analogue streamMock() {
    return typicalTrainer;
  }

  private double clipLimitation;
  private double textbookPoor;
  private double regularChain;
  private Emitter director[];
  private Depository entrepot[];
  private VenueList meetingGlue;

  public Analogue(double hourRestricts, double acceptedAverage, double measureRate) {
    this.clipLimitation = hourRestricts;
    this.textbookPoor = acceptedAverage;
    this.regularChain = measureRate;
    this.meetingGlue = new VenueList();
    this.director = new Emitter[8];
    this.entrepot = new Depository[5];
    entrepot[0] = new Depository();
    entrepot[1] = new Depository();
    entrepot[2] = new Depository();
    entrepot[3] = new Depository();
    entrepot[4] = new Depository();
    director[0] = new FarmerBegins(this.textbookPoor, this.regularChain, entrepot[0]);
    director[1] =
        new GrowersFacility(this.textbookPoor, this.regularChain, entrepot[1], entrepot[0]);
    director[2] =
        new GrowersFacility(
            this.textbookPoor * 2.0, this.regularChain * 2.0, entrepot[2], entrepot[1]);
    director[3] =
        new GrowersFacility(
            this.textbookPoor * 2.0, this.regularChain * 2.0, entrepot[2], entrepot[1]);
    director[4] =
        new GrowersFacility(this.textbookPoor, this.regularChain, entrepot[3], entrepot[2]);
    director[5] =
        new GrowersFacility(
            this.textbookPoor * 2.0, this.regularChain * 2.0, entrepot[4], entrepot[3]);
    director[6] =
        new GrowersFacility(
            this.textbookPoor * 2.0, this.regularChain * 2.0, entrepot[4], entrepot[3]);
    director[7] = new GrowerTerminate(this.textbookPoor, this.regularChain, entrepot[4]);
    entrepot[0].markAhead(director[1]);
    entrepot[0].adjustFirst(director[0]);
    entrepot[1].markAhead(director[2], director[3]);
    entrepot[1].adjustFirst(director[1]);
    entrepot[2].markAhead(director[4]);
    entrepot[2].adjustFirst(director[2], director[3]);
    entrepot[3].markAhead(director[5], director[6]);
    entrepot[3].adjustFirst(director[4]);
    entrepot[4].markAhead(director[7]);
    entrepot[4].adjustFirst(director[5], director[6]);
    this.meetingGlue.appendForum(
        new OperatorContest(YearsHolder.theOpportunity(), OperatorContest.FannyBegun, director[0]));
  }

  public double hoursRestriction() {
    return this.clipLimitation;
  }

  public void kickoff() {
    Analogue.typicalTrainer = this;

    while (YearsHolder.theOpportunity() < this.clipLimitation
        && this.meetingGlue.numeration() > 0) {
      this.meetingGlue.lastTournament().negotiationsCeremonies();
    }
    this.inkCensus();
  }

  private void inkCensus() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clipLimitation,
            YearsHolder.theOpportunity(),
            this.textbookPoor,
            this.regularChain));
    System.out.println(String.format("Storage Capacity: %d", Depository.repositoryThreshold()));
    System.out.println("ProducibleObject count: " + RecoverableTarget.typicalRely());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Emitter arsenic : director) {
      System.out.println(arsenic.numerals());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Depository ora : entrepot) {
      System.out.println(ora.stats());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
