package dramatization;

import checked.DayCaretaker;
import cultivationBodies.StorableSubject;
import manufacturers.*;
import entrepot.*;
import performance.*;
import static java.lang.System.out;

public class Simulates {
  static final int kateOuter = -1471524318;

  public static synchronized Simulates topicalSimulated() {
    double morin;
    morin = (0.460077287651794);
    return contemporaryFeigning;
  }

  public static Simulates contemporaryFeigning;

  public synchronized void publicationsStatistically() {
    int decreasingRestricted;
    decreasingRestricted = (2017839065);
    out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.nowRestrictions,
            DayCaretaker.incumbentDay(),
            this.touchstoneNasty,
            this.classicalGrade));
    out.println(String.format("Storage Capacity: %d", Archiving.stowageRestricting()));
    out.println("ProducibleObject count: " + StorableSubject.newTotal());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Maker spain : manufacturer) {
      out.println(spain.statistical());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Archiving waffen : store) {
      out.println(waffen.figures());
    }
    out.println(" ----------------------------------------------- ");
  }

  public synchronized double monthRestricting() {
    String discover;
    discover = ("OAPB8hYYLTnn3DQm");
    return this.nowRestrictions;
  }

  public SeminarJumping gatheringDipper;
  public Maker manufacturer[];
  public Archiving store[];
  public double touchstoneNasty;

  public synchronized void commencement() {
    int maximizeWide;
    maximizeWide = (-1523803540);
    Simulates.contemporaryFeigning = (this);

    while (DayCaretaker.incumbentDay() < this.nowRestrictions
        && this.gatheringDipper.numbers() > 0) {
      this.gatheringDipper.earlyMeeting().outgrowthTournament();
    }
    this.publicationsStatistically();
  }

  public double nowRestrictions;
  public double classicalGrade;

  public Simulates(double amountMax, double receivedMiserly, double regularChain) {
    this.nowRestrictions = (amountMax);
    this.touchstoneNasty = (receivedMiserly);
    this.classicalGrade = (regularChain);
    this.gatheringDipper = (new SeminarJumping());
    this.manufacturer = (new Maker[8]);
    this.store = (new Archiving[5]);
    store[0] = (new Archiving());
    store[1] = (new Archiving());
    store[2] = (new Archiving());
    store[3] = (new Archiving());
    store[4] = (new Archiving());
    manufacturer[0] = (new CommodityBegan(this.touchstoneNasty, this.classicalGrade, store[0]));
    manufacturer[1] =
        (new ProviderChannel(this.touchstoneNasty, this.classicalGrade, store[1], store[0]));
    manufacturer[2] =
        (new ProviderChannel(
            this.touchstoneNasty * 2.0, this.classicalGrade * 2.0, store[2], store[1]));
    manufacturer[3] =
        (new ProviderChannel(
            this.touchstoneNasty * 2.0, this.classicalGrade * 2.0, store[2], store[1]));
    manufacturer[4] =
        (new ProviderChannel(this.touchstoneNasty, this.classicalGrade, store[3], store[2]));
    manufacturer[5] =
        (new ProviderChannel(
            this.touchstoneNasty * 2.0, this.classicalGrade * 2.0, store[4], store[3]));
    manufacturer[6] =
        (new ProviderChannel(
            this.touchstoneNasty * 2.0, this.classicalGrade * 2.0, store[4], store[3]));
    manufacturer[7] = (new MakerConclusion(this.touchstoneNasty, this.classicalGrade, store[4]));
    store[0].situatedForthcoming(manufacturer[1]);
    store[0].adjustFirst(manufacturer[0]);
    store[1].situatedForthcoming(manufacturer[2], manufacturer[3]);
    store[1].adjustFirst(manufacturer[1]);
    store[2].situatedForthcoming(manufacturer[4]);
    store[2].adjustFirst(manufacturer[2], manufacturer[3]);
    store[3].situatedForthcoming(manufacturer[5], manufacturer[6]);
    store[3].adjustFirst(manufacturer[4]);
    store[4].situatedForthcoming(manufacturer[7]);
    store[4].adjustFirst(manufacturer[5], manufacturer[6]);
    this.gatheringDipper.addCommemoration(
        new PublisherCarnival(
            DayCaretaker.incumbentDay(), PublisherCarnival.ArseJump, manufacturer[0]));
  }
}
