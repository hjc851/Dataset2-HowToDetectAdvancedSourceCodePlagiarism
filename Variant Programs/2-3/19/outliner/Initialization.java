package outliner;

import yardmaster.Starter;
import moot.SystemSim;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Initialization {
  public LinkedList<System> finalizingSystems;
  public static final int BeginningMammoth = 4;

  public synchronized void encumbranceSummons(System vig) {

    try {
      String summons;
      summons = String.format("%-5s%3s", "T" + (this.fixNewTally()) + ":", vig.generateIdem());
      SystemSim.ProducedExecutable.write(summons + "\n");
      System.out.println(summons);
    } catch (IOException adoptee) {
      System.out.println("Unable to write " + this.organizerList() + " to file.");
    }
  }

  public abstract void optiBeat();

  public synchronized void originateConfiguration() {
    this.isMoving = true;
    this.additionalDikMonth = Starter.SendingHour;
    this.addOutset();
  }

  public boolean isMoving;
  public int ratioReboundChance;

  public abstract void outgrowthSucceeding(System procedure);

  public synchronized void addOutset() {

    try {
      SystemSim.ProducedExecutable.write("\n");
      System.out.println();
      SystemSim.ProducedExecutable.write("\n" + this.organizerList() + "\n");
      System.out.println(this.organizerList());
    } catch (IOException pro) {
      System.out.println("Unable to write " + this.organizerList() + " to file.");
    }
  }

  public boolean benzSwag;

  public synchronized double arriveModalUpswingMonth() {
    return (double) this.ratioReboundChance / this.finalizingSystems.size();
  }

  public synchronized void arrestCompiler() {
    this.isMoving = false;
    this.publishStudy();
  }

  public int additionalDikMonth;

  public synchronized int fixNewTally() {
    return contemporaryTicktack;
  }

  public int spurtingWeek;

  public Initialization() {
    this.isMoving = false;
    this.spurtingWeek = 0;
    this.delayHour = 0;
    this.ratioLeaveChance = 0;
    this.ratioReboundChance = 0;
    this.contemporaryTicktack = -1;
    this.finalizingSystems = new LinkedList<>();
    this.benzSwag = true;
  }

  public int ratioLeaveChance;
  public int delayHour;

  public synchronized void publishStudy() {

    try {
      String overhead;
      Collections.sort(finalizingSystems);
      SystemSim.ProducedExecutable.write("\n");
      System.out.println();
      overhead = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      SystemSim.ProducedExecutable.write(overhead + "\n");
      System.out.println(overhead);
      for (System writes : finalizingSystems) {
        int leaveChance;
        int goAboutClock;
        String formalities;
        leaveChance =
            writes.canEgressYears() - writes.becomeFindOpportunity() - writes.produceVeepDensity();
        goAboutClock = writes.canEgressYears() - writes.becomeFindOpportunity();
        this.ratioLeaveChance += leaveChance;
        this.ratioReboundChance += goAboutClock;
        formalities =
            String.format("%-7s%16d%19d", writes.generateIdem(), leaveChance, goAboutClock);
        SystemSim.ProducedExecutable.write(formalities + "\n");
        System.out.println(formalities);
      }
      SystemSim.ProducedExecutable.write("\n");
      System.out.println();
    } catch (IOException appointed) {
      System.out.println("Unable to write " + this.organizerList() + " to file.");
    }
  }

  public synchronized void doContinuingVibrate(int continuingVibrate) {
    this.contemporaryTicktack = continuingVibrate;
  }

  public System formerFormalities;

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized double receiveMediocrePostponementMoment() {
    return (double) this.ratioLeaveChance / this.finalizingSystems.size();
  }

  public abstract String organizerList();

  public int contemporaryTicktack;

  public synchronized int generatePerformedTreatFootprint() {

    if (finalizingSystems.isEmpty()) {
      return 0;
    } else {
      return finalizingSystems.size();
    }
  }
}
