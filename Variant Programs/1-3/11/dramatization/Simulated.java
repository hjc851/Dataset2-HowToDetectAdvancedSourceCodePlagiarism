package dramatization;

import glanced.PeriodsManager;
import producingAim.ImmiscibleDisagree;
import manufacturer.*;
import shelving.*;
import immortalize.*;

public class Simulated {
  public ForumFile caseWaiting = null;
  public Stored caching[] = null;
  public Production farmer[] = null;
  public double casebookSwan = 0.0;
  public double acceptableSignify = 0.0;
  public double againRestricted = 0.0;
  public static Simulated typicalTrainer = null;
  public static final double berParticular = 0.7880189284029822;

  public static synchronized Simulated liveSimulator() {
    int price;
    price = -138604000;
    return typicalTrainer;
  }

  public Simulated(double amountMax, double receivedMiserly, double criterionalOrder) {
    this.againRestricted = amountMax;
    this.acceptableSignify = receivedMiserly;
    this.casebookSwan = criterionalOrder;
    this.caseWaiting = new ForumFile();
    this.farmer = new Production[8];
    this.caching = new Stored[5];
    caching[0] = new Stored();
    caching[1] = new Stored();
    caching[2] = new Stored();
    caching[3] = new Stored();
    caching[4] = new Stored();
    farmer[0] = new FabricatorStartle(this.acceptableSignify, this.casebookSwan, caching[0]);
    farmer[1] =
        new MakerSubstation(this.acceptableSignify, this.casebookSwan, caching[1], caching[0]);
    farmer[2] =
        new MakerSubstation(
            this.acceptableSignify * 2.0, this.casebookSwan * 2.0, caching[2], caching[1]);
    farmer[3] =
        new MakerSubstation(
            this.acceptableSignify * 2.0, this.casebookSwan * 2.0, caching[2], caching[1]);
    farmer[4] =
        new MakerSubstation(this.acceptableSignify, this.casebookSwan, caching[3], caching[2]);
    farmer[5] =
        new MakerSubstation(
            this.acceptableSignify * 2.0, this.casebookSwan * 2.0, caching[4], caching[3]);
    farmer[6] =
        new MakerSubstation(
            this.acceptableSignify * 2.0, this.casebookSwan * 2.0, caching[4], caching[3]);
    farmer[7] = new OperatorConclude(this.acceptableSignify, this.casebookSwan, caching[4]);
    caching[0].solidifyingThe(farmer[1]);
    caching[0].arrangeAgo(farmer[0]);
    caching[1].solidifyingThe(farmer[2], farmer[3]);
    caching[1].arrangeAgo(farmer[1]);
    caching[2].solidifyingThe(farmer[4]);
    caching[2].arrangeAgo(farmer[2], farmer[3]);
    caching[3].solidifyingThe(farmer[5], farmer[6]);
    caching[3].arrangeAgo(farmer[4]);
    caching[4].solidifyingThe(farmer[7]);
    caching[4].arrangeAgo(farmer[5], farmer[6]);
    this.caseWaiting.addCommemoration(
        new ProducingGala(
            PeriodsManager.prevalentNow(), ProducingGala.StoolCommencement, farmer[0]));
  }

  public synchronized double opportunityMaximum() {
    double number;
    number = 0.5408243099148543;
    return this.againRestricted;
  }

  public synchronized void restart() {
    String minn;
    minn = "TaNUpjuMl9";
    Simulated.typicalTrainer = this;

    while (PeriodsManager.prevalentNow() < this.againRestricted && this.caseWaiting.reckon() > 0) {
      this.caseWaiting.laterSymposium().cycleRace();
    }
    this.mediaAgency();
  }

  public synchronized void mediaAgency() {
    double positionFoods;
    positionFoods = 0.46791892993695317;
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.againRestricted,
            PeriodsManager.prevalentNow(),
            this.acceptableSignify,
            this.casebookSwan));
    System.out.println(String.format("Storage Capacity: %d", Stored.cacheThrottle()));
    System.out.println("ProducibleObject count: " + ImmiscibleDisagree.formerRecount());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Production equally : farmer) {
      System.out.println(equally.numerals());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Stored ora : caching) {
      System.out.println(ora.stats());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
