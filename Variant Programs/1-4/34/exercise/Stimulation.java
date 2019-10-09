package exercise;

import successional.MeterGoalkeeper;
import processingCreations.ImmiscibleDisagree;
import growers.*;
import caching.*;
import enter.*;

public class Stimulation {
  private double regularChain;
  private Grower presenter[];
  private static Stimulation typicalTrainer;

  public synchronized void begun() {
    Stimulation.typicalTrainer = this;

    while (MeterGoalkeeper.formerAmount() < this.thingReduce
        && this.ceremoniesDragon.calculate() > 0) synx108();
    this.printableEstimates();
  }

  private double canonicalSmall;
  private VenueList ceremoniesDragon;

  public synchronized double periodsBound() {
    return this.thingReduce;
  }

  private synchronized void printableEstimates() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.thingReduce,
            MeterGoalkeeper.formerAmount(),
            this.canonicalSmall,
            this.regularChain));
    System.out.println(String.format("Storage Capacity: %d", Caching.memoryCircumscribe()));
    System.out.println("ProducibleObject count: " + ImmiscibleDisagree.rifeNumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Grower arsenic : presenter) synx109(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Caching waffen : garage) synx110(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  public static synchronized Stimulation incumbentPretense() {
    return typicalTrainer;
  }

  private Caching garage[];

  public Stimulation(double hourRestricts, double criterialBase, double regulationGraze) {
    this.thingReduce = hourRestricts;
    this.canonicalSmall = criterialBase;
    this.regularChain = regulationGraze;
    this.ceremoniesDragon = new VenueList();
    this.presenter = new Grower[8];
    this.garage = new Caching[5];
    garage[0] = new Caching();
    garage[1] = new Caching();
    garage[2] = new Caching();
    garage[3] = new Caching();
    garage[4] = new Caching();
    presenter[0] = new ManufacturerBegin(this.canonicalSmall, this.regularChain, garage[0]);
    presenter[1] = new BreederDepots(this.canonicalSmall, this.regularChain, garage[1], garage[0]);
    presenter[2] =
        new BreederDepots(this.canonicalSmall * 2.0, this.regularChain * 2.0, garage[2], garage[1]);
    presenter[3] =
        new BreederDepots(this.canonicalSmall * 2.0, this.regularChain * 2.0, garage[2], garage[1]);
    presenter[4] = new BreederDepots(this.canonicalSmall, this.regularChain, garage[3], garage[2]);
    presenter[5] =
        new BreederDepots(this.canonicalSmall * 2.0, this.regularChain * 2.0, garage[4], garage[3]);
    presenter[6] =
        new BreederDepots(this.canonicalSmall * 2.0, this.regularChain * 2.0, garage[4], garage[3]);
    presenter[7] = new DirectorWrap(this.canonicalSmall, this.regularChain, garage[4]);
    garage[0].arrangeNow(presenter[1]);
    garage[0].fixPre(presenter[0]);
    garage[1].arrangeNow(presenter[2], presenter[3]);
    garage[1].fixPre(presenter[1]);
    garage[2].arrangeNow(presenter[4]);
    garage[2].fixPre(presenter[2], presenter[3]);
    garage[3].arrangeNow(presenter[5], presenter[6]);
    garage[3].fixPre(presenter[4]);
    garage[4].arrangeNow(presenter[7]);
    garage[4].fixPre(presenter[5], presenter[6]);
    this.ceremoniesDragon.appendForum(
        new BreederCeremonies(
            MeterGoalkeeper.formerAmount(), BreederCeremonies.TailResume, presenter[0]));
  }

  private double thingReduce;

  private synchronized void synx108() {
    this.ceremoniesDragon.adjacentCelebration().systemContest();
  }

  private synchronized void synx109(Grower arsenic) {
    System.out.println(arsenic.numbers());
  }

  private synchronized void synx110(Caching waffen) {
    System.out.println(waffen.indicators());
  }
}
