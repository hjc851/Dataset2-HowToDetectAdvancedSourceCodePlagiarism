package mock;

import glanced.OpportunityCarer;
import manufacturingPieces.TuronianOpposes;
import production.*;
import closet.*;
import disc.*;

public class Pretense {
  private static mock.Pretense circulatingSimulating;

  public static mock.Pretense presentAnalog() {
    return circulatingSimulating;
  }

  private double weekMinimum;
  private double stockStingy;
  private double criterionScope;
  private production.Grower produce[];
  private closet.Caching warehousing[];
  private disc.FestivalSpooler tournamentStandby;

  public Pretense(double againRestricted, double criterionEntail, double definitiveOrbit) {
    this.weekMinimum = againRestricted;
    this.stockStingy = criterionEntail;
    this.criterionScope = definitiveOrbit;
    this.tournamentStandby = new disc.FestivalSpooler();
    this.produce = new production.Grower[8];
    this.warehousing = new closet.Caching[5];
    warehousing[0] = new closet.Caching();
    warehousing[1] = new closet.Caching();
    warehousing[2] = new closet.Caching();
    warehousing[3] = new closet.Caching();
    warehousing[4] = new closet.Caching();
    produce[0] =
        new production.ManufacturerBegin(this.stockStingy, this.criterionScope, warehousing[0]);
    produce[1] =
        new production.OperatorPolice(
            this.stockStingy, this.criterionScope, warehousing[1], warehousing[0]);
    produce[2] =
        new production.OperatorPolice(
            this.stockStingy * 2.0, this.criterionScope * 2.0, warehousing[2], warehousing[1]);
    produce[3] =
        new production.OperatorPolice(
            this.stockStingy * 2.0, this.criterionScope * 2.0, warehousing[2], warehousing[1]);
    produce[4] =
        new production.OperatorPolice(
            this.stockStingy, this.criterionScope, warehousing[3], warehousing[2]);
    produce[5] =
        new production.OperatorPolice(
            this.stockStingy * 2.0, this.criterionScope * 2.0, warehousing[4], warehousing[3]);
    produce[6] =
        new production.OperatorPolice(
            this.stockStingy * 2.0, this.criterionScope * 2.0, warehousing[4], warehousing[3]);
    produce[7] =
        new production.MakerConclusion(this.stockStingy, this.criterionScope, warehousing[4]);
    warehousing[0].primedLater(produce[1]);
    warehousing[0].solidifyingElapsed(produce[0]);
    warehousing[1].primedLater(produce[2], produce[3]);
    warehousing[1].solidifyingElapsed(produce[1]);
    warehousing[2].primedLater(produce[4]);
    warehousing[2].solidifyingElapsed(produce[2], produce[3]);
    warehousing[3].primedLater(produce[5], produce[6]);
    warehousing[3].solidifyingElapsed(produce[4]);
    warehousing[4].primedLater(produce[7]);
    warehousing[4].solidifyingElapsed(produce[5], produce[6]);
    this.tournamentStandby.addCommemoration(
        new disc.VintnerGathering(
            glanced.OpportunityCarer.presentlyMinutes(),
            VintnerGathering.FundamentOriginate,
            produce[0]));
  }

  public double meterCircumscribe() {
    return this.weekMinimum;
  }

  public void outset() {
    Pretense.circulatingSimulating = this;

    while (glanced.OpportunityCarer.presentlyMinutes() < this.weekMinimum
        && this.tournamentStandby.figure() > 0) {
      this.tournamentStandby.againContest().serveParade();
    }
    this.reprintingStatistician();
  }

  private void reprintingStatistician() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.weekMinimum,
            glanced.OpportunityCarer.presentlyMinutes(),
            this.stockStingy,
            this.criterionScope));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", closet.Caching.repositoryThreshold()));
    System.out.println("ProducibleObject count: " + manufacturingPieces.TuronianOpposes.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (production.Grower electricity : produce) {
      System.out.println(electricity.numerals());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (closet.Caching ora : warehousing) {
      System.out.println(ora.stats());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
