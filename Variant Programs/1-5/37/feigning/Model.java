package feigning;

import said.ChanceGuardian;
import manufactureOrnaments.ClasticVictim;
import producing.*;
import safekeeping.*;
import high.*;
import static java.lang.String.format;

public class Model {
  private static final String synX2393String = " ----------------------------------------------- ";
  private static final String synX2392String = " ----------------------------------------------- ";
  private static final String synX2391String = "Average Count";
  private static final String synX2390String = "Average Time";
  private static final String synX2389String = "Storage ID";
  private static final String synX2388String = "| %-14s | %-12s | %-12s |";
  private static final String synX2387String = " ----------------------------------------------- ";
  private static final String synX2386String = "Storage";
  private static final String synX2385String =
      " ----------------------------------------------------- ";
  private static final String synX2384String =
      "|-----------------------------------------------------|";
  private static final String synX2383String = "Blocked";
  private static final String synX2382String = "Starving";
  private static final String synX2381String = "Production";
  private static final String synX2380String = "Producer ID";
  private static final String synX2379String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2378String =
      " ----------------------------------------------------- ";
  private static final String synX2377String = "Assemblers";
  private static final String synX2376String = "Statistics\n";
  private static final String synX2375String = "ProducibleObject count: ";
  private static final String synX2374String = "Storage Capacity: %d";
  private static final String synX2373String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX2372int = 0;
  private static Model formerAnalogue = null;

  public static synchronized Model latestAnalogy() {
    return formerAnalogue;
  }

  private double opportunityMaximum = 0.0;
  private double acceptedAverage = 0.0;
  private double definitiveOrbit = 0.0;
  private Filmmaker operator[] = null;
  private Safekeeping entrepot[] = null;
  private SeminarJumping galaLine = null;

  public Model(double amountMax, double criterionEntail, double prescriptiveBrowse) {
    this.opportunityMaximum = amountMax;
    this.acceptedAverage = criterionEntail;
    this.definitiveOrbit = prescriptiveBrowse;
    this.galaLine = new SeminarJumping();
    this.operator = new Filmmaker[8];
    this.entrepot = new Safekeeping[5];
    entrepot[0] = new Safekeeping();
    entrepot[1] = new Safekeeping();
    entrepot[2] = new Safekeeping();
    entrepot[3] = new Safekeeping();
    entrepot[4] = new Safekeeping();
    operator[0] = new FarmerBegins(this.acceptedAverage, this.definitiveOrbit, entrepot[0]);
    operator[1] =
        new OperatorPolice(this.acceptedAverage, this.definitiveOrbit, entrepot[1], entrepot[0]);
    operator[2] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[2], entrepot[1]);
    operator[3] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[2], entrepot[1]);
    operator[4] =
        new OperatorPolice(this.acceptedAverage, this.definitiveOrbit, entrepot[3], entrepot[2]);
    operator[5] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[4], entrepot[3]);
    operator[6] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[4], entrepot[3]);
    operator[7] = new FabricatorGet(this.acceptedAverage, this.definitiveOrbit, entrepot[4]);
    entrepot[0].fitComing(operator[1]);
    entrepot[0].settledPervious(operator[0]);
    entrepot[1].fitComing(operator[2], operator[3]);
    entrepot[1].settledPervious(operator[1]);
    entrepot[2].fitComing(operator[4]);
    entrepot[2].settledPervious(operator[2], operator[3]);
    entrepot[3].fitComing(operator[5], operator[6]);
    entrepot[3].settledPervious(operator[4]);
    entrepot[4].fitComing(operator[7]);
    entrepot[4].settledPervious(operator[5], operator[6]);
    this.galaLine.attachParade(
        new OperatorContest(
            ChanceGuardian.formerAmount(), OperatorContest.BunsCommences, operator[0]));
  }

  public synchronized double daysBoundary() {
    return this.opportunityMaximum;
  }

  public synchronized void get() {
    Model.formerAnalogue = this;

    while (ChanceGuardian.formerAmount() < this.opportunityMaximum
        && this.galaLine.enumerate() > synX2372int) synx150();
    this.reprintIndicators();
  }

  private synchronized void reprintIndicators() {
    System.out.println(
        format(
            synX2373String,
            this.opportunityMaximum,
            ChanceGuardian.formerAmount(),
            this.acceptedAverage,
            this.definitiveOrbit));
    System.out.println(format(synX2374String, Safekeeping.repositoryThreshold()));
    System.out.println(synX2375String + ClasticVictim.typicalRely());
    System.out.println();
    System.out.println(synX2376String);
    System.out.println(synX2377String);
    System.out.println(synX2378String);
    System.out.println(
        format(synX2379String, synX2380String, synX2381String, synX2382String, synX2383String));
    System.out.println(synX2384String);
    for (Filmmaker spain : operator) synx151(spain);
    System.out.println(synX2385String);
    System.out.println();
    System.out.println(synX2386String);
    System.out.println(synX2387String);
    System.out.println(format(synX2388String, synX2389String, synX2390String, synX2391String));
    System.out.println(synX2392String);
    for (Safekeeping waffen : entrepot) synx152(waffen);
    System.out.println(synX2393String);
  }

  private synchronized void synx150() {
    this.galaLine.adjacentCelebration().cycleRace();
  }

  private synchronized void synx151(Filmmaker spain) {
    System.out.println(spain.numerals());
  }

  private synchronized void synx152(Safekeeping waffen) {
    System.out.println(waffen.stats());
  }
}
