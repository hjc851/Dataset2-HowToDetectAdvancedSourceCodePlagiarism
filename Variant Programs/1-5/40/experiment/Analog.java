package experiment;

import indiscernible.MomentSitter;
import producedItems.MinableOppose;
import fabricator.*;
import depository.*;
import book.*;
import static java.lang.String.format;

public class Analog {
  private static experiment.Analog typicalTrainer = null;

  public static synchronized experiment.Analog ongoingPretence() {
    return typicalTrainer;
  }

  private double clockRestrict = 0.0;
  private double acceptedAverage = 0.0;
  private double stockRamble = 0.0;
  private fabricator.Grower breeder[] = null;
  private depository.Warehousing storeroom[] = null;
  private book.CommemorationBraid commemorationBraid = null;

  public Analog(double periodTrammel, double textbookPoor, double definitiveOrbit) {
    this.clockRestrict = periodTrammel;
    this.acceptedAverage = textbookPoor;
    this.stockRamble = definitiveOrbit;
    this.commemorationBraid = new book.CommemorationBraid();
    this.breeder = new fabricator.Grower[8];
    this.storeroom = new depository.Warehousing[5];
    storeroom[0] = new depository.Warehousing();
    storeroom[1] = new depository.Warehousing();
    storeroom[2] = new depository.Warehousing();
    storeroom[3] = new depository.Warehousing();
    storeroom[4] = new depository.Warehousing();
    breeder[0] = new fabricator.MakerOutset(this.acceptedAverage, this.stockRamble, storeroom[0]);
    breeder[1] =
        new fabricator.DirectorBarracks(
            this.acceptedAverage, this.stockRamble, storeroom[1], storeroom[0]);
    breeder[2] =
        new fabricator.DirectorBarracks(
            this.acceptedAverage * 2.0, this.stockRamble * 2.0, storeroom[2], storeroom[1]);
    breeder[3] =
        new fabricator.DirectorBarracks(
            this.acceptedAverage * 2.0, this.stockRamble * 2.0, storeroom[2], storeroom[1]);
    breeder[4] =
        new fabricator.DirectorBarracks(
            this.acceptedAverage, this.stockRamble, storeroom[3], storeroom[2]);
    breeder[5] =
        new fabricator.DirectorBarracks(
            this.acceptedAverage * 2.0, this.stockRamble * 2.0, storeroom[4], storeroom[3]);
    breeder[6] =
        new fabricator.DirectorBarracks(
            this.acceptedAverage * 2.0, this.stockRamble * 2.0, storeroom[4], storeroom[3]);
    breeder[7] =
        new fabricator.ProviderAccomplish(this.acceptedAverage, this.stockRamble, storeroom[4]);
    storeroom[0].doEarly(breeder[1]);
    storeroom[0].fixPre(breeder[0]);
    storeroom[1].doEarly(breeder[2], breeder[3]);
    storeroom[1].fixPre(breeder[1]);
    storeroom[2].doEarly(breeder[4]);
    storeroom[2].fixPre(breeder[2], breeder[3]);
    storeroom[3].doEarly(breeder[5], breeder[6]);
    storeroom[3].fixPre(breeder[4]);
    storeroom[4].doEarly(breeder[7]);
    storeroom[4].fixPre(breeder[5], breeder[6]);
    this.commemorationBraid.appendForum(
        new book.FabricatorCommemoration(
            indiscernible.MomentSitter.presentBeginning(),
            FabricatorCommemoration.ToiletBegan,
            breeder[0]));
  }

  public synchronized double sentenceConfine() {
    return this.clockRestrict;
  }

  public synchronized void commencement() {
    Analog.typicalTrainer = this;

    while (indiscernible.MomentSitter.presentBeginning() < this.clockRestrict
        && this.commemorationBraid.number() > 0) synx164();
    this.hardcopyRecords();
  }

  private synchronized void hardcopyRecords() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clockRestrict,
            indiscernible.MomentSitter.presentBeginning(),
            this.acceptedAverage,
            this.stockRamble));
    System.out.println(format("Storage Capacity: %d", depository.Warehousing.storehouseRestrict()));
    System.out.println("ProducibleObject count: " + producedItems.MinableOppose.liveMatter());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (fabricator.Grower electricity : breeder) synx165(electricity);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (depository.Warehousing fh : storeroom) synx166(fh);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx164() {
    this.commemorationBraid.firstParade().litigateVenue();
  }

  private synchronized void synx165(Grower electricity) {
    System.out.println(electricity.rda());
  }

  private synchronized void synx166(Warehousing fh) {
    System.out.println(fh.stats());
  }
}
