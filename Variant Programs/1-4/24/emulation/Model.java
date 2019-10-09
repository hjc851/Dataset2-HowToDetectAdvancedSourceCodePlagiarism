package emulation;

import indiscernible.YearWarder;
import manufacturedBelongings.StorableSubject;
import exporter.*;
import storehouse.*;
import register.*;

public class Model {
  public register.ExpositionCola gatheringDipper;
  public storehouse.Repository warehouse[];
  public exporter.Operator director[];
  public double basicAmbit;
  public double criterionEntail;
  public double nowRestrictions;
  public static emulation.Model actualPretending;
  public static String lowlyEnchained = "oW";

  public static synchronized emulation.Model previousExercise() {
    double senateTrammel;
    senateTrammel = 0.9654369415067012;
    return actualPretending;
  }

  public Model(double minutesCurb, double classicNormal, double normativeDrift) {
    this.nowRestrictions = minutesCurb;
    this.criterionEntail = classicNormal;
    this.basicAmbit = normativeDrift;
    this.gatheringDipper = new register.ExpositionCola();
    this.director = new exporter.Operator[8];
    this.warehouse = new storehouse.Repository[5];
    warehouse[0] = new storehouse.Repository();
    warehouse[1] = new storehouse.Repository();
    warehouse[2] = new storehouse.Repository();
    warehouse[3] = new storehouse.Repository();
    warehouse[4] = new storehouse.Repository();
    director[0] =
        new exporter.OutputCommencement(this.criterionEntail, this.basicAmbit, warehouse[0]);
    director[1] =
        new exporter.PromoterTrain(
            this.criterionEntail, this.basicAmbit, warehouse[1], warehouse[0]);
    director[2] =
        new exporter.PromoterTrain(
            this.criterionEntail * 2.0, this.basicAmbit * 2.0, warehouse[2], warehouse[1]);
    director[3] =
        new exporter.PromoterTrain(
            this.criterionEntail * 2.0, this.basicAmbit * 2.0, warehouse[2], warehouse[1]);
    director[4] =
        new exporter.PromoterTrain(
            this.criterionEntail, this.basicAmbit, warehouse[3], warehouse[2]);
    director[5] =
        new exporter.PromoterTrain(
            this.criterionEntail * 2.0, this.basicAmbit * 2.0, warehouse[4], warehouse[3]);
    director[6] =
        new exporter.PromoterTrain(
            this.criterionEntail * 2.0, this.basicAmbit * 2.0, warehouse[4], warehouse[3]);
    director[7] = new exporter.ExporterEnd(this.criterionEntail, this.basicAmbit, warehouse[4]);
    warehouse[0].prepareSecond(director[1]);
    warehouse[0].primedEarlier(director[0]);
    warehouse[1].prepareSecond(director[2], director[3]);
    warehouse[1].primedEarlier(director[1]);
    warehouse[2].prepareSecond(director[4]);
    warehouse[2].primedEarlier(director[2], director[3]);
    warehouse[3].prepareSecond(director[5], director[6]);
    warehouse[3].primedEarlier(director[4]);
    warehouse[4].prepareSecond(director[7]);
    warehouse[4].primedEarlier(director[5], director[6]);
    this.gatheringDipper.pasteContest(
        new register.BreederCeremonies(
            indiscernible.YearWarder.typicalJuncture(),
            BreederCeremonies.BunsCommences,
            director[0]));
  }

  public synchronized double meterCircumscribe() {
    double pivotal;
    pivotal = 0.748175613618856;
    return this.nowRestrictions;
  }

  public synchronized void offset() {
    String maximum;
    maximum = "y";
    Model.actualPretending = this;

    while (indiscernible.YearWarder.typicalJuncture() < this.nowRestrictions
        && this.gatheringDipper.enumerate() > 0) {
      this.gatheringDipper.firstParade().systemContest();
    }
    this.writtenStats();
  }

  public synchronized void writtenStats() {
    double hour;
    hour = 0.503789634528178;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.nowRestrictions,
            indiscernible.YearWarder.typicalJuncture(),
            this.criterionEntail,
            this.basicAmbit));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", storehouse.Repository.diskTrammel()));
    System.out.println(
        "ProducibleObject count: " + manufacturedBelongings.StorableSubject.topicalConsider());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (exporter.Operator spain : director) {
      System.out.println(spain.figure());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (storehouse.Repository waffen : warehouse) {
      System.out.println(waffen.stat());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
