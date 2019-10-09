package pretence;

import checked.PeriodsManager;
import industrializationInstallations.ClasticVictim;
import provider.*;
import shelving.*;
import tape.*;

public class Stimulation {

  public synchronized double periodTrammel() {
    return this.hoursRestriction;
  }

  public synchronized void commences() {
    Stimulation.latestAnalogy = this;

    while (PeriodsManager.formerAmount() < this.hoursRestriction
        && this.symposiumSufferance.enumerate() > 0) {
      this.symposiumSufferance.forthcomingSummit().systemContest();
    }
    this.newspaperSurvey();
  }

  public static synchronized Stimulation liveSimulator() {
    return latestAnalogy;
  }

  public Stowage stowage[];
  public CarnivalRow symposiumSufferance;

  public Stimulation(double thingReduce, double classicNormal, double classicalGrade) {
    this.hoursRestriction = thingReduce;
    this.modularLittle = classicNormal;
    this.measureRate = classicalGrade;
    this.symposiumSufferance = new CarnivalRow();
    this.publisher = new Fabricator[8];
    this.stowage = new Stowage[5];
    stowage[0] = new Stowage();
    stowage[1] = new Stowage();
    stowage[2] = new Stowage();
    stowage[3] = new Stowage();
    stowage[4] = new Stowage();
    publisher[0] = new PromoterKickoff(this.modularLittle, this.measureRate, stowage[0]);
    publisher[1] =
        new ProduceTerminus(this.modularLittle, this.measureRate, stowage[1], stowage[0]);
    publisher[2] =
        new ProduceTerminus(
            this.modularLittle * 2.0, this.measureRate * 2.0, stowage[2], stowage[1]);
    publisher[3] =
        new ProduceTerminus(
            this.modularLittle * 2.0, this.measureRate * 2.0, stowage[2], stowage[1]);
    publisher[4] =
        new ProduceTerminus(this.modularLittle, this.measureRate, stowage[3], stowage[2]);
    publisher[5] =
        new ProduceTerminus(
            this.modularLittle * 2.0, this.measureRate * 2.0, stowage[4], stowage[3]);
    publisher[6] =
        new ProduceTerminus(
            this.modularLittle * 2.0, this.measureRate * 2.0, stowage[4], stowage[3]);
    publisher[7] = new GrowersDone(this.modularLittle, this.measureRate, stowage[4]);
    stowage[0].bentNew(publisher[1]);
    stowage[0].adjustFirst(publisher[0]);
    stowage[1].bentNew(publisher[2], publisher[3]);
    stowage[1].adjustFirst(publisher[1]);
    stowage[2].bentNew(publisher[4]);
    stowage[2].adjustFirst(publisher[2], publisher[3]);
    stowage[3].bentNew(publisher[5], publisher[6]);
    stowage[3].adjustFirst(publisher[4]);
    stowage[4].bentNew(publisher[7]);
    stowage[4].adjustFirst(publisher[5], publisher[6]);
    this.symposiumSufferance.incloseCelebration(
        new BreederCeremonies(
            PeriodsManager.formerAmount(), BreederCeremonies.JohnPart, publisher[0]));
  }

  public static Stimulation latestAnalogy;

  public synchronized void newspaperSurvey() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.hoursRestriction,
            PeriodsManager.formerAmount(),
            this.modularLittle,
            this.measureRate));
    System.out.println(String.format("Storage Capacity: %d", Stowage.warehousingRestriction()));
    System.out.println("ProducibleObject count: " + ClasticVictim.presentQuantify());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Fabricator leong : publisher) {
      System.out.println(leong.agency());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Stowage ora : stowage) {
      System.out.println(ora.figure());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public Fabricator publisher[];
  public double hoursRestriction;
  public double modularLittle;
  public double measureRate;
}
