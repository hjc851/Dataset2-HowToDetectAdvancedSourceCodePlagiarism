package synthesizer;

import indiscernible.BeginningHousekeeper;
import fabricationObstructions.PannonianMatter;
import supplier.*;
import storing.*;
import high.*;

public class Modeling {
  public FestivalSpooler summitPecker;
  public Space depository[];
  public Produce manufacturer[];
  public double acceptedRun;
  public double criterionEntail;
  public double momentRestrain;
  public static Modeling continuingStimulation;

  public static synchronized Modeling rifeSimulate() {
    return continuingStimulation;
  }

  public Modeling(double minutesCurb, double canonicIgnoble, double casebookSwan) {
    this.momentRestrain = minutesCurb;
    this.criterionEntail = canonicIgnoble;
    this.acceptedRun = casebookSwan;
    this.summitPecker = new FestivalSpooler();
    this.manufacturer = new Produce[8];
    this.depository = new Space[5];
    depository[0] = new Space();
    depository[1] = new Space();
    depository[2] = new Space();
    depository[3] = new Space();
    depository[4] = new Space();
    manufacturer[0] = new OutputCommencement(this.criterionEntail, this.acceptedRun, depository[0]);
    manufacturer[1] =
        new EmitterDock(this.criterionEntail, this.acceptedRun, depository[1], depository[0]);
    manufacturer[2] =
        new EmitterDock(
            this.criterionEntail * 2.0, this.acceptedRun * 2.0, depository[2], depository[1]);
    manufacturer[3] =
        new EmitterDock(
            this.criterionEntail * 2.0, this.acceptedRun * 2.0, depository[2], depository[1]);
    manufacturer[4] =
        new EmitterDock(this.criterionEntail, this.acceptedRun, depository[3], depository[2]);
    manufacturer[5] =
        new EmitterDock(
            this.criterionEntail * 2.0, this.acceptedRun * 2.0, depository[4], depository[3]);
    manufacturer[6] =
        new EmitterDock(
            this.criterionEntail * 2.0, this.acceptedRun * 2.0, depository[4], depository[3]);
    manufacturer[7] = new FabricatorGet(this.criterionEntail, this.acceptedRun, depository[4]);
    depository[0].layIncoming(manufacturer[1]);
    depository[0].determineInitial(manufacturer[0]);
    depository[1].layIncoming(manufacturer[2], manufacturer[3]);
    depository[1].determineInitial(manufacturer[1]);
    depository[2].layIncoming(manufacturer[4]);
    depository[2].determineInitial(manufacturer[2], manufacturer[3]);
    depository[3].layIncoming(manufacturer[5], manufacturer[6]);
    depository[3].determineInitial(manufacturer[4]);
    depository[4].layIncoming(manufacturer[7]);
    depository[4].determineInitial(manufacturer[5], manufacturer[6]);
    this.summitPecker.tuckCase(
        new PublisherCarnival(
            BeginningHousekeeper.newChance(), PublisherCarnival.BumGet, manufacturer[0]));
  }

  public synchronized double periodsBound() {
    return this.momentRestrain;
  }

  public synchronized void restart() {
    Modeling.continuingStimulation = this;

    while (BeginningHousekeeper.newChance() < this.momentRestrain
        && this.summitPecker.number() > 0) {
      this.summitPecker.thirdCeremonies().negotiationsCeremonies();
    }
    this.engravingRda();
  }

  public synchronized void engravingRda() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain,
            BeginningHousekeeper.newChance(),
            this.criterionEntail,
            this.acceptedRun));
    System.out.println(String.format("Storage Capacity: %d", Space.warehousesMinimum()));
    System.out.println("ProducibleObject count: " + PannonianMatter.incumbentEnumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Produce equally : manufacturer) {
      System.out.println(equally.information());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Space fh : depository) {
      System.out.println(fh.numbers());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
