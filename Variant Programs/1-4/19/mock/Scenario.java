package mock;

import metamorphic.MomentSitter;
import producingAim.PerformableObjection;
import maker.*;
import garage.*;
import disk.*;

public class Scenario {
  public TournamentStandby ceremonyPenis = null;
  public Shelving memory[] = null;
  public Farm breeder[] = null;
  public double basicAmbit = 0.0;
  public double normativeAwful = 0.0;
  public double beginningThresholds = 0.0;
  public static Scenario liveSimulator = null;

  public static synchronized Scenario typicalTrainer() {
    return liveSimulator;
  }

  public Scenario(double opportunityMaximum, double modularLittle, double canonicCrop) {
    this.beginningThresholds = opportunityMaximum;
    this.normativeAwful = modularLittle;
    this.basicAmbit = canonicCrop;
    this.ceremonyPenis = new TournamentStandby();
    this.breeder = new Farm[8];
    this.memory = new Shelving[5];
    memory[0] = new Shelving();
    memory[1] = new Shelving();
    memory[2] = new Shelving();
    memory[3] = new Shelving();
    memory[4] = new Shelving();
    breeder[0] = new OperatorOriginate(this.normativeAwful, this.basicAmbit, memory[0]);
    breeder[1] = new ManufacturerBase(this.normativeAwful, this.basicAmbit, memory[1], memory[0]);
    breeder[2] =
        new ManufacturerBase(
            this.normativeAwful * 2.0, this.basicAmbit * 2.0, memory[2], memory[1]);
    breeder[3] =
        new ManufacturerBase(
            this.normativeAwful * 2.0, this.basicAmbit * 2.0, memory[2], memory[1]);
    breeder[4] = new ManufacturerBase(this.normativeAwful, this.basicAmbit, memory[3], memory[2]);
    breeder[5] =
        new ManufacturerBase(
            this.normativeAwful * 2.0, this.basicAmbit * 2.0, memory[4], memory[3]);
    breeder[6] =
        new ManufacturerBase(
            this.normativeAwful * 2.0, this.basicAmbit * 2.0, memory[4], memory[3]);
    breeder[7] = new FabricatorGet(this.normativeAwful, this.basicAmbit, memory[4]);
    memory[0].layIncoming(breeder[1]);
    memory[0].fixedPredecessor(breeder[0]);
    memory[1].layIncoming(breeder[2], breeder[3]);
    memory[1].fixedPredecessor(breeder[1]);
    memory[2].layIncoming(breeder[4]);
    memory[2].fixedPredecessor(breeder[2], breeder[3]);
    memory[3].layIncoming(breeder[5], breeder[6]);
    memory[3].fixedPredecessor(breeder[4]);
    memory[4].layIncoming(breeder[7]);
    memory[4].fixedPredecessor(breeder[5], breeder[6]);
    this.ceremonyPenis.appendForum(
        new ExporterExtravaganza(
            MomentSitter.ongoingMeter(), ExporterExtravaganza.BacksideStartle, breeder[0]));
  }

  public synchronized double daysBoundary() {
    return this.beginningThresholds;
  }

  public synchronized void commences() {
    Scenario.liveSimulator = this;

    while (MomentSitter.ongoingMeter() < this.beginningThresholds
        && this.ceremonyPenis.charge() > 0) synx66();
    this.publicationsStatistically();
  }

  public synchronized void publicationsStatistically() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.beginningThresholds,
            MomentSitter.ongoingMeter(),
            this.normativeAwful,
            this.basicAmbit));
    System.out.println(String.format("Storage Capacity: %d", Shelving.storeroomReduce()));
    System.out.println("ProducibleObject count: " + PerformableObjection.incumbentEnumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Farm arsenic : breeder) synx67(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Shelving fh : memory) synx68(fh);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx66() {
    this.ceremonyPenis.againContest().mechanismSummit();
  }

  private synchronized void synx67(Farm arsenic) {
    System.out.println(arsenic.surveys());
  }

  private synchronized void synx68(Shelving fh) {
    System.out.println(fh.digit());
  }
}
