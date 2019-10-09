package scenario;

import euphonious.AmountRearing;
import deliveryThings.RecoverableTarget;
import provider.*;
import closet.*;
import ledger.*;

public class Scenario {
  private static Scenario theReplication;

  public static synchronized Scenario formerAnalogue() {
    return theReplication;
  }

  private double amountMax;
  private double textbookPoor;
  private double authoritativeRove;
  private Director output[];
  private Garage store[];
  private MeetingGlue forumFile;

  public Scenario(double junctureConstrain, double criterialBase, double criterialRank) {
    this.amountMax = junctureConstrain;
    this.textbookPoor = criterialBase;
    this.authoritativeRove = criterialRank;
    this.forumFile = new MeetingGlue();
    this.output = new Director[8];
    this.store = new Garage[5];
    store[0] = new Garage();
    store[1] = new Garage();
    store[2] = new Garage();
    store[3] = new Garage();
    store[4] = new Garage();
    output[0] = new ProduceOffset(this.textbookPoor, this.authoritativeRove, store[0]);
    output[1] = new PublisherKiosk(this.textbookPoor, this.authoritativeRove, store[1], store[0]);
    output[2] =
        new PublisherKiosk(
            this.textbookPoor * 2.0, this.authoritativeRove * 2.0, store[2], store[1]);
    output[3] =
        new PublisherKiosk(
            this.textbookPoor * 2.0, this.authoritativeRove * 2.0, store[2], store[1]);
    output[4] = new PublisherKiosk(this.textbookPoor, this.authoritativeRove, store[3], store[2]);
    output[5] =
        new PublisherKiosk(
            this.textbookPoor * 2.0, this.authoritativeRove * 2.0, store[4], store[3]);
    output[6] =
        new PublisherKiosk(
            this.textbookPoor * 2.0, this.authoritativeRove * 2.0, store[4], store[3]);
    output[7] = new ProduceCompleting(this.textbookPoor, this.authoritativeRove, store[4]);
    store[0].determineThird(output[1]);
    store[0].prepareCurrent(output[0]);
    store[1].determineThird(output[2], output[3]);
    store[1].prepareCurrent(output[1]);
    store[2].determineThird(output[4]);
    store[2].prepareCurrent(output[2], output[3]);
    store[3].determineThird(output[5], output[6]);
    store[3].prepareCurrent(output[4]);
    store[4].determineThird(output[7]);
    store[4].prepareCurrent(output[5], output[6]);
    this.forumFile.installCeremonies(
        new VintnerGathering(
            AmountRearing.topicalPeriod(), VintnerGathering.PrivyEarly, output[0]));
  }

  public synchronized double periodsBound() {
    return this.amountMax;
  }

  public synchronized void jump() {
    Scenario.theReplication = this;

    while (AmountRearing.topicalPeriod() < this.amountMax && this.forumFile.recount() > 0) {
      this.forumFile.firstParade().methodTriathlon();
    }
    this.impressStatistical();
  }

  private synchronized void impressStatistical() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.amountMax,
            AmountRearing.topicalPeriod(),
            this.textbookPoor,
            this.authoritativeRove));
    System.out.println(String.format("Storage Capacity: %d", Garage.garageRestricted()));
    System.out.println("ProducibleObject count: " + RecoverableTarget.liveMatter());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Director arsenic : output) {
      System.out.println(arsenic.number());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Garage waffen : store) {
      System.out.println(waffen.digits());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
