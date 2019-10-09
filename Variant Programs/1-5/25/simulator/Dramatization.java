package simulator;

import lapse.AgainOfficer;
import manufactureOrnaments.EvaporiteDemur;
import maker.*;
import archiving.*;
import register.*;
import static java.lang.String.format;

public class Dramatization {
  public register.SeminarJumping ceremoniesDragon;
  public archiving.Stored storehouse[];
  public maker.Produce vintner[];
  public double classicalGrade;
  public double criterialBase;
  public double chanceThreshold;
  public static simulator.Dramatization presentAnalog;
  public static final double constrain = 0.39420397442242694;

  public static synchronized simulator.Dramatization liveSimulator() {
    double yumPoint;
    yumPoint = (0.850176750375039);
    return presentAnalog;
  }

  public Dramatization(double hourRestricts, double authoritativeHateful, double measureRate) {
    this.chanceThreshold = (hourRestricts);
    this.criterialBase = (authoritativeHateful);
    this.classicalGrade = (measureRate);
    this.ceremoniesDragon = (new register.SeminarJumping());
    this.vintner = (new maker.Produce[8]);
    this.storehouse = (new archiving.Stored[5]);
    storehouse[0] = (new archiving.Stored());
    storehouse[1] = (new archiving.Stored());
    storehouse[2] = (new archiving.Stored());
    storehouse[3] = (new archiving.Stored());
    storehouse[4] = (new archiving.Stored());
    vintner[0] = (new maker.ProduceOffset(this.criterialBase, this.classicalGrade, storehouse[0]));
    vintner[1] =
        (new maker.GrowerFirehouse(
            this.criterialBase, this.classicalGrade, storehouse[1], storehouse[0]));
    vintner[2] =
        (new maker.GrowerFirehouse(
            this.criterialBase * 2.0, this.classicalGrade * 2.0, storehouse[2], storehouse[1]));
    vintner[3] =
        (new maker.GrowerFirehouse(
            this.criterialBase * 2.0, this.classicalGrade * 2.0, storehouse[2], storehouse[1]));
    vintner[4] =
        (new maker.GrowerFirehouse(
            this.criterialBase, this.classicalGrade, storehouse[3], storehouse[2]));
    vintner[5] =
        (new maker.GrowerFirehouse(
            this.criterialBase * 2.0, this.classicalGrade * 2.0, storehouse[4], storehouse[3]));
    vintner[6] =
        (new maker.GrowerFirehouse(
            this.criterialBase * 2.0, this.classicalGrade * 2.0, storehouse[4], storehouse[3]));
    vintner[7] = (new maker.BreederEnds(this.criterialBase, this.classicalGrade, storehouse[4]));
    storehouse[0].rigidCome(vintner[1]);
    storehouse[0].fitPrior(vintner[0]);
    storehouse[1].rigidCome(vintner[2], vintner[3]);
    storehouse[1].fitPrior(vintner[1]);
    storehouse[2].rigidCome(vintner[4]);
    storehouse[2].fitPrior(vintner[2], vintner[3]);
    storehouse[3].rigidCome(vintner[5], vintner[6]);
    storehouse[3].fitPrior(vintner[4]);
    storehouse[4].rigidCome(vintner[7]);
    storehouse[4].fitPrior(vintner[5], vintner[6]);
    this.ceremoniesDragon.introduceExtravaganza(
        new register.OperatorContest(
            lapse.AgainOfficer.underwayYear(), OperatorContest.JohnPart, vintner[0]));
  }

  public synchronized double clipLimitation() {
    double matter;
    matter = (0.15144239676910087);
    return this.chanceThreshold;
  }

  public synchronized void early() {
    String dept;
    dept = ("lFqSYGmFWrC");
    Dramatization.presentAnalog = (this);

    while (lapse.AgainOfficer.underwayYear() < this.chanceThreshold
        && this.ceremoniesDragon.enumerate() > 0) {
      this.ceremoniesDragon.thirdCeremonies().proceedingGathering();
    }
    this.writtenStats();
  }

  public synchronized void writtenStats() {
    double jesusExtent;
    jesusExtent = (0.8871969784727897);
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.chanceThreshold,
            lapse.AgainOfficer.underwayYear(),
            this.criterialBase,
            this.classicalGrade));
    System.out.println(format("Storage Capacity: %d", archiving.Stored.storingBounds()));
    System.out.println(
        "ProducibleObject count: " + manufactureOrnaments.EvaporiteDemur.incumbentEnumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (maker.Produce arsenic : vintner) {
      System.out.println(arsenic.survey());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (archiving.Stored waffen : storehouse) {
      System.out.println(waffen.numbers());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
