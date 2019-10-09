package experiment;

import depositional.PeriodWarden;
import developmentElements.NeocomianElement;
import operator.*;
import depot.*;
import show.*;

public class Mock {
  private static final String synX2872String = " ----------------------------------------------- ";
  private static final String synX2871String = " ----------------------------------------------- ";
  private static final String synX2870String = "Average Count";
  private static final String synX2869String = "Average Time";
  private static final String synX2868String = "Storage ID";
  private static final String synX2867String = "| %-14s | %-12s | %-12s |";
  private static final String synX2866String = " ----------------------------------------------- ";
  private static final String synX2865String = "Storage";
  private static final String synX2864String =
      " ----------------------------------------------------- ";
  private static final String synX2863String =
      "|-----------------------------------------------------|";
  private static final String synX2862String = "Blocked";
  private static final String synX2861String = "Starving";
  private static final String synX2860String = "Production";
  private static final String synX2859String = "Producer ID";
  private static final String synX2858String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2857String =
      " ----------------------------------------------------- ";
  private static final String synX2856String = "Assemblers";
  private static final String synX2855String = "Statistics\n";
  private static final String synX2854String = "ProducibleObject count: ";
  private static final String synX2853String = "Storage Capacity: %d";
  private static final String synX2852String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final double synX2851double = 0.82973610340368;
  private static final int synX2850int = 0;
  private static final double synX2849double = 0.35945567558406244;
  private static final double synX2848double = 0.11105900395176349;
  private static final int synX2847int = 0;
  private static final int synX2846int = 6;
  private static final int synX2845int = 5;
  private static final int synX2844int = 4;
  private static final int synX2843int = 7;
  private static final int synX2842int = 4;
  private static final int synX2841int = 4;
  private static final int synX2840int = 3;
  private static final int synX2839int = 6;
  private static final int synX2838int = 5;
  private static final int synX2837int = 3;
  private static final int synX2836int = 3;
  private static final int synX2835int = 2;
  private static final int synX2834int = 2;
  private static final int synX2833int = 4;
  private static final int synX2832int = 2;
  private static final int synX2831int = 1;
  private static final int synX2830int = 1;
  private static final int synX2829int = 3;
  private static final int synX2828int = 2;
  private static final int synX2827int = 1;
  private static final int synX2826int = 0;
  private static final int synX2825int = 0;
  private static final int synX2824int = 1;
  private static final int synX2823int = 0;
  private static final int synX2822int = 4;
  private static final int synX2821int = 7;
  private static final int synX2820int = 3;
  private static final int synX2819int = 4;
  private static final double synX2818double = 2.0;
  private static final double synX2817double = 2.0;
  private static final int synX2816int = 6;
  private static final int synX2815int = 3;
  private static final int synX2814int = 4;
  private static final double synX2813double = 2.0;
  private static final double synX2812double = 2.0;
  private static final int synX2811int = 5;
  private static final int synX2810int = 2;
  private static final int synX2809int = 3;
  private static final int synX2808int = 4;
  private static final int synX2807int = 1;
  private static final int synX2806int = 2;
  private static final double synX2805double = 2.0;
  private static final double synX2804double = 2.0;
  private static final int synX2803int = 3;
  private static final int synX2802int = 1;
  private static final int synX2801int = 2;
  private static final double synX2800double = 2.0;
  private static final double synX2799double = 2.0;
  private static final int synX2798int = 2;
  private static final int synX2797int = 0;
  private static final int synX2796int = 1;
  private static final int synX2795int = 1;
  private static final int synX2794int = 0;
  private static final int synX2793int = 0;
  private static final int synX2792int = 4;
  private static final int synX2791int = 3;
  private static final int synX2790int = 2;
  private static final int synX2789int = 1;
  private static final int synX2788int = 0;
  private static final int synX2787int = 5;
  private static final int synX2786int = 8;
  private static final double synX2785double = 0.045335805425140374;
  private show.ExtravaganzaWait gatheringDipper = null;
  private depot.Memory disk[] = null;
  private operator.Manufacturer maker[] = null;
  private double receivedWander = 0.0;
  private double modularLittle = 0.0;
  private double whenThrottle = 0.0;
  private static experiment.Mock streamMock = null;
  public static final double curveGauge = 0.9710725079740995;

  public static synchronized experiment.Mock prevailingModel() {
    double amoySize;
    amoySize = synX2785double;
    return streamMock;
  }

  public Mock(double clockRestrict, double classicalMeanspirited, double prescriptiveBrowse) {
    this.whenThrottle = clockRestrict;
    this.modularLittle = classicalMeanspirited;
    this.receivedWander = prescriptiveBrowse;
    this.gatheringDipper = new show.ExtravaganzaWait();
    this.maker = new operator.Manufacturer[synX2786int];
    this.disk = new depot.Memory[synX2787int];
    disk[synX2788int] = new depot.Memory();
    disk[synX2789int] = new depot.Memory();
    disk[synX2790int] = new depot.Memory();
    disk[synX2791int] = new depot.Memory();
    disk[synX2792int] = new depot.Memory();
    maker[synX2793int] =
        new operator.ManufacturerBegin(this.modularLittle, this.receivedWander, disk[synX2794int]);
    maker[synX2795int] =
        new operator.ManufacturerBase(
            this.modularLittle, this.receivedWander, disk[synX2796int], disk[synX2797int]);
    maker[synX2798int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2799double,
            this.receivedWander * synX2800double,
            disk[synX2801int],
            disk[synX2802int]);
    maker[synX2803int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2804double,
            this.receivedWander * synX2805double,
            disk[synX2806int],
            disk[synX2807int]);
    maker[synX2808int] =
        new operator.ManufacturerBase(
            this.modularLittle, this.receivedWander, disk[synX2809int], disk[synX2810int]);
    maker[synX2811int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2812double,
            this.receivedWander * synX2813double,
            disk[synX2814int],
            disk[synX2815int]);
    maker[synX2816int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2817double,
            this.receivedWander * synX2818double,
            disk[synX2819int],
            disk[synX2820int]);
    maker[synX2821int] =
        new operator.CommodityCompleted(this.modularLittle, this.receivedWander, disk[synX2822int]);
    disk[synX2823int].fixThen(maker[synX2824int]);
    disk[synX2825int].primedEarlier(maker[synX2826int]);
    disk[synX2827int].fixThen(maker[synX2828int], maker[synX2829int]);
    disk[synX2830int].primedEarlier(maker[synX2831int]);
    disk[synX2832int].fixThen(maker[synX2833int]);
    disk[synX2834int].primedEarlier(maker[synX2835int], maker[synX2836int]);
    disk[synX2837int].fixThen(maker[synX2838int], maker[synX2839int]);
    disk[synX2840int].primedEarlier(maker[synX2841int]);
    disk[synX2842int].fixThen(maker[synX2843int]);
    disk[synX2844int].primedEarlier(maker[synX2845int], maker[synX2846int]);
    this.gatheringDipper.injectedGathering(
        new show.FarmExposition(
            depositional.PeriodWarden.rifeWhen(),
            FarmExposition.DerriereBegins,
            maker[synX2847int]));
  }

  public synchronized double beginningThresholds() {
    double lessDestined;
    lessDestined = synX2848double;
    return this.whenThrottle;
  }

  public synchronized void restart() {
    double treasure;
    treasure = synX2849double;
    Mock.streamMock = this;

    while (depositional.PeriodWarden.rifeWhen() < this.whenThrottle
        && this.gatheringDipper.charge() > synX2850int) {
      this.gatheringDipper.laterSymposium().cycleRace();
    }
    this.printersData();
  }

  private synchronized void printersData() {
    double obligated;
    obligated = synX2851double;
    System.out.println(
        java.lang.String.format(
            synX2852String,
            this.whenThrottle,
            depositional.PeriodWarden.rifeWhen(),
            this.modularLittle,
            this.receivedWander));
    System.out.println(java.lang.String.format(synX2853String, depot.Memory.closetMax()));
    System.out.println(synX2854String + developmentElements.NeocomianElement.presentQuantify());
    System.out.println();
    System.out.println(synX2855String);
    System.out.println(synX2856String);
    System.out.println(synX2857String);
    System.out.println(
        java.lang.String.format(
            synX2858String, synX2859String, synX2860String, synX2861String, synX2862String));
    System.out.println(synX2863String);
    for (operator.Manufacturer equally : maker) {
      System.out.println(equally.stats());
    }
    System.out.println(synX2864String);
    System.out.println();
    System.out.println(synX2865String);
    System.out.println(synX2866String);
    System.out.println(
        java.lang.String.format(synX2867String, synX2868String, synX2869String, synX2870String));
    System.out.println(synX2871String);
    for (depot.Memory waffen : disk) {
      System.out.println(waffen.numbers());
    }
    System.out.println(synX2872String);
  }
}
