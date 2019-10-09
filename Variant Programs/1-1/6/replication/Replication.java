package replication;

import euphonious.WhenGuard;
import developmentElements.RecoverableTarget;
import maker.*;
import shelving.*;
import immortalize.*;

public class Replication {
  private static Replication ongoingPretence;

  public static Replication continuingStimulation() {
    return ongoingPretence;
  }

  private double clockRestrict;
  private double casebookTight;
  private double prescriptiveBrowse;
  private Production growers[];
  private Repository memory[];
  private FestivalSpooler commemorationBraid;

  public Replication(double clipLimitation, double definitiveSkilled, double criterionScope) {
    this.clockRestrict = clipLimitation;
    this.casebookTight = definitiveSkilled;
    this.prescriptiveBrowse = criterionScope;
    this.commemorationBraid = new FestivalSpooler();
    this.growers = new Production[8];
    this.memory = new Repository[5];
    memory[0] = new Repository();
    memory[1] = new Repository();
    memory[2] = new Repository();
    memory[3] = new Repository();
    memory[4] = new Repository();
    growers[0] = new PublisherJump(this.casebookTight, this.prescriptiveBrowse, memory[0]);
    growers[1] =
        new MakerSubstation(this.casebookTight, this.prescriptiveBrowse, memory[1], memory[0]);
    growers[2] =
        new MakerSubstation(
            this.casebookTight * 2.0, this.prescriptiveBrowse * 2.0, memory[2], memory[1]);
    growers[3] =
        new MakerSubstation(
            this.casebookTight * 2.0, this.prescriptiveBrowse * 2.0, memory[2], memory[1]);
    growers[4] =
        new MakerSubstation(this.casebookTight, this.prescriptiveBrowse, memory[3], memory[2]);
    growers[5] =
        new MakerSubstation(
            this.casebookTight * 2.0, this.prescriptiveBrowse * 2.0, memory[4], memory[3]);
    growers[6] =
        new MakerSubstation(
            this.casebookTight * 2.0, this.prescriptiveBrowse * 2.0, memory[4], memory[3]);
    growers[7] = new OutputCease(this.casebookTight, this.prescriptiveBrowse, memory[4]);
    memory[0].situatedForthcoming(growers[1]);
    memory[0].adjustFirst(growers[0]);
    memory[1].situatedForthcoming(growers[2], growers[3]);
    memory[1].adjustFirst(growers[1]);
    memory[2].situatedForthcoming(growers[4]);
    memory[2].adjustFirst(growers[2], growers[3]);
    memory[3].situatedForthcoming(growers[5], growers[6]);
    memory[3].adjustFirst(growers[4]);
    memory[4].situatedForthcoming(growers[7]);
    memory[4].adjustFirst(growers[5], growers[6]);
    this.commemorationBraid.embeddedExposition(
        new ProduceTriathlon(
            WhenGuard.existingYears(), ProduceTriathlon.BacksideStartle, growers[0]));
  }

  public double daysBoundary() {
    return this.clockRestrict;
  }

  public void startle() {
    Replication.ongoingPretence = this;

    while (WhenGuard.existingYears() < this.clockRestrict
        && this.commemorationBraid.enumerate() > 0) {
      this.commemorationBraid.newGathering().workFestival();
    }
    this.hardcopyRecords();
  }

  private void hardcopyRecords() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clockRestrict,
            WhenGuard.existingYears(),
            this.casebookTight,
            this.prescriptiveBrowse));
    System.out.println(String.format("Storage Capacity: %d", Repository.shelvingThresholds()));
    System.out.println("ProducibleObject count: " + RecoverableTarget.thisGet());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Production equally : growers) {
      System.out.println(equally.numbers());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Repository fh : memory) {
      System.out.println(fh.survey());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
