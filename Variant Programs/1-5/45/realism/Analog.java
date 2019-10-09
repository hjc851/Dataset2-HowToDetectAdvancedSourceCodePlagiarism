package realism;

import depositional.WeekGoverness;
import throughputMaterials.FissionableCavil;
import farmer.*;
import memory.*;
import read.*;
import static java.lang.String.format;

public class Analog {
  private static final int synX2697int = 0;
  private static final String synX2696String = " ----------------------------------------------- ";
  private static final String synX2695String = " ----------------------------------------------- ";
  private static final String synX2694String = "Average Count";
  private static final String synX2693String = "Average Time";
  private static final String synX2692String = "Storage ID";
  private static final String synX2691String = "| %-14s | %-12s | %-12s |";
  private static final String synX2690String = " ----------------------------------------------- ";
  private static final String synX2689String = "Storage";
  private static final String synX2688String =
      " ----------------------------------------------------- ";
  private static final String synX2687String =
      "|-----------------------------------------------------|";
  private static final String synX2686String = "Blocked";
  private static final String synX2685String = "Starving";
  private static final String synX2684String = "Production";
  private static final String synX2683String = "Producer ID";
  private static final String synX2682String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2681String =
      " ----------------------------------------------------- ";
  private static final String synX2680String = "Assemblers";
  private static final String synX2679String = "Statistics\n";
  private static final String synX2678String = "ProducibleObject count: ";
  private static final String synX2677String = "Storage Capacity: %d";
  private static final String synX2676String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private double monthRestricting = 0.0;
  private farmer.Breeder vintner[] = null;

  private synchronized void brailleNumerals() {
    System.out.println(
        format(
            synX2676String,
            this.monthRestricting,
            depositional.WeekGoverness.flowMonth(),
            this.definitiveSkilled,
            this.regulationGraze));
    System.out.println(format(synX2677String, memory.Garage.warehousingRestriction()));
    System.out.println(synX2678String + throughputMaterials.FissionableCavil.flowNumbers());
    System.out.println();
    System.out.println(synX2679String);
    System.out.println(synX2680String);
    System.out.println(synX2681String);
    System.out.println(
        format(synX2682String, synX2683String, synX2684String, synX2685String, synX2686String));
    System.out.println(synX2687String);
    for (farmer.Breeder leong : vintner) {
      System.out.println(leong.indicators());
    }
    System.out.println(synX2688String);
    System.out.println();
    System.out.println(synX2689String);
    System.out.println(synX2690String);
    System.out.println(format(synX2691String, synX2692String, synX2693String, synX2694String));
    System.out.println(synX2695String);
    for (memory.Garage ora : depot) {
      System.out.println(ora.survey());
    }
    System.out.println(synX2696String);
  }

  private static realism.Analog latestAnalogy = null;
  private read.ExtravaganzaWait symposiumSufferance = null;

  public synchronized double sentenceConfine() {
    return this.monthRestricting;
  }

  private memory.Garage depot[] = null;
  private double regulationGraze = 0.0;

  public Analog(double opportunityMaximum, double standardizedImply, double modularStraddle) {
    this.monthRestricting = (opportunityMaximum);
    this.definitiveSkilled = (standardizedImply);
    this.regulationGraze = (modularStraddle);
    this.symposiumSufferance = (new read.ExtravaganzaWait());
    this.vintner = (new farmer.Breeder[8]);
    this.depot = (new memory.Garage[5]);
    depot[0] = (new memory.Garage());
    depot[1] = (new memory.Garage());
    depot[2] = (new memory.Garage());
    depot[3] = (new memory.Garage());
    depot[4] = (new memory.Garage());
    vintner[0] = (new farmer.FarmerBegins(this.definitiveSkilled, this.regulationGraze, depot[0]));
    vintner[1] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled, this.regulationGraze, depot[1], depot[0]));
    vintner[2] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[2], depot[1]));
    vintner[3] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[2], depot[1]));
    vintner[4] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled, this.regulationGraze, depot[3], depot[2]));
    vintner[5] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[4], depot[3]));
    vintner[6] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[4], depot[3]));
    vintner[7] =
        (new farmer.ManufacturersEnding(this.definitiveSkilled, this.regulationGraze, depot[4]));
    depot[0].fitComing(vintner[1]);
    depot[0].laidPast(vintner[0]);
    depot[1].fitComing(vintner[2], vintner[3]);
    depot[1].laidPast(vintner[1]);
    depot[2].fitComing(vintner[4]);
    depot[2].laidPast(vintner[2], vintner[3]);
    depot[3].fitComing(vintner[5], vintner[6]);
    depot[3].laidPast(vintner[4]);
    depot[4].fitComing(vintner[7]);
    depot[4].laidPast(vintner[5], vintner[6]);
    this.symposiumSufferance.putSummit(
        new read.ProduceTriathlon(
            depositional.WeekGoverness.flowMonth(), ProduceTriathlon.TailResume, vintner[0]));
  }

  private double definitiveSkilled = 0.0;

  public static synchronized realism.Analog liveSimulator() {
    return latestAnalogy;
  }

  public synchronized void go() {
    Analog.latestAnalogy = (this);

    while (depositional.WeekGoverness.flowMonth() < this.monthRestricting
        && this.symposiumSufferance.figures() > synX2697int) {
      this.symposiumSufferance.theExposition().procedureCase();
    }
    this.brailleNumerals();
  }
}
