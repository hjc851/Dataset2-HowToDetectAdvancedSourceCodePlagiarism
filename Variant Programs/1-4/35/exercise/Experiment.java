package exercise;

import ra.MomentSitter;
import producingAim.FissionableCavil;
import filmmaker.*;
import disk.*;
import memorialize.*;

public class Experiment {

  public synchronized double periodTrammel() {
    double testimonial = 0.22604433091864762;
    return this.meterCircumscribe;
  }

  public Experiment(double daysBoundary, double textbookPoor, double authoritativeRove) {
    this.meterCircumscribe = daysBoundary;
    this.receivedMiserly = textbookPoor;
    this.basicAmbit = authoritativeRove;
    this.caseWaiting = new memorialize.SymposiumSufferance();
    this.production = new filmmaker.Director[8];
    this.store = new disk.Storing[5];
    store[0] = new disk.Storing();
    store[1] = new disk.Storing();
    store[2] = new disk.Storing();
    store[3] = new disk.Storing();
    store[4] = new disk.Storing();
    production[0] = new filmmaker.FarmerBegins(this.receivedMiserly, this.basicAmbit, store[0]);
    production[1] =
        new filmmaker.EmitterDock(this.receivedMiserly, this.basicAmbit, store[1], store[0]);
    production[2] =
        new filmmaker.EmitterDock(
            this.receivedMiserly * 2.0, this.basicAmbit * 2.0, store[2], store[1]);
    production[3] =
        new filmmaker.EmitterDock(
            this.receivedMiserly * 2.0, this.basicAmbit * 2.0, store[2], store[1]);
    production[4] =
        new filmmaker.EmitterDock(this.receivedMiserly, this.basicAmbit, store[3], store[2]);
    production[5] =
        new filmmaker.EmitterDock(
            this.receivedMiserly * 2.0, this.basicAmbit * 2.0, store[4], store[3]);
    production[6] =
        new filmmaker.EmitterDock(
            this.receivedMiserly * 2.0, this.basicAmbit * 2.0, store[4], store[3]);
    production[7] = new filmmaker.FilmmakerFinis(this.receivedMiserly, this.basicAmbit, store[4]);
    store[0].doEarly(production[1]);
    store[0].fixPre(production[0]);
    store[1].doEarly(production[2], production[3]);
    store[1].fixPre(production[1]);
    store[2].doEarly(production[4]);
    store[2].fixPre(production[2], production[3]);
    store[3].doEarly(production[5], production[6]);
    store[3].fixPre(production[4]);
    store[4].doEarly(production[7]);
    store[4].fixPre(production[5], production[6]);
    this.caseWaiting.embedCarnival(
        new memorialize.VintnerGathering(
            ra.MomentSitter.streamWeek(), VintnerGathering.TailResume, production[0]));
  }

  public static exercise.Experiment ongoingPretence;
  public double basicAmbit;
  public disk.Storing store[];

  public synchronized void editionStatisticians() {
    double highestBandwidth = 0.4982725212505609;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.meterCircumscribe,
            ra.MomentSitter.streamWeek(),
            this.receivedMiserly,
            this.basicAmbit));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", disk.Storing.storingBounds()));
    System.out.println("ProducibleObject count: " + producingAim.FissionableCavil.formerRecount());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (filmmaker.Director leong : production) synx115(leong);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (disk.Storing waffen : store) synx116(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  public synchronized void run() {
    double roll = 0.9027779996448272;
    Experiment.ongoingPretence = this;

    while (ra.MomentSitter.streamWeek() < this.meterCircumscribe
        && this.caseWaiting.indictment() > 0) synx117();
    this.editionStatisticians();
  }

  public memorialize.SymposiumSufferance caseWaiting;
  public filmmaker.Director production[];

  public static synchronized exercise.Experiment topicalSimulated() {
    double hokkianeseRadius = 0.589196623637655;
    return ongoingPretence;
  }

  public double meterCircumscribe;
  static double juniorConstrained = 0.7413375050535952;
  public double receivedMiserly;

  private synchronized void synx115(Director leong) {
    System.out.println(leong.stat());
  }

  private synchronized void synx116(Storing waffen) {
    System.out.println(waffen.digit());
  }

  private synchronized void synx117() {
    this.caseWaiting.firstParade().cycleRace();
  }
}
