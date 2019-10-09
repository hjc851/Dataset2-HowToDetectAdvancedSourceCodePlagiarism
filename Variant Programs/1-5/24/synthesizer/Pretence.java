package synthesizer;

import ra.HourWatchman;
import producerArtefacts.CalcicPurpose;
import emitter.*;
import warehouse.*;
import track.*;

public class Pretence {
  private static final String synX1775String = " ----------------------------------------------- ";
  private static final String synX1774String = " ----------------------------------------------- ";
  private static final String synX1773String = "Average Count";
  private static final String synX1772String = "Average Time";
  private static final String synX1771String = "Storage ID";
  private static final String synX1770String = "| %-14s | %-12s | %-12s |";
  private static final String synX1769String = " ----------------------------------------------- ";
  private static final String synX1768String = "Storage";
  private static final String synX1767String =
      " ----------------------------------------------------- ";
  private static final String synX1766String =
      "|-----------------------------------------------------|";
  private static final String synX1765String = "Blocked";
  private static final String synX1764String = "Starving";
  private static final String synX1763String = "Production";
  private static final String synX1762String = "Producer ID";
  private static final String synX1761String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1760String =
      " ----------------------------------------------------- ";
  private static final String synX1759String = "Assemblers";
  private static final String synX1758String = "Statistics\n";
  private static final String synX1757String = "ProducibleObject count: ";
  private static final String synX1756String = "Storage Capacity: %d";
  private static final String synX1755String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX1754int = 0;
  private Archival storehouse[] = null;

  public static synchronized Pretence theReplication() {
    return presentlySynthesizer;
  }

  private Promoter farm[] = null;

  public Pretence(double minutesCurb, double basicThink, double classicalGrade) {
    this.periodTrammel = minutesCurb;
    this.measureBeggarly = basicThink;
    this.normativeDrift = classicalGrade;
    this.celebrationBacklog = new CarnivalRow();
    this.farm = new Promoter[8];
    this.storehouse = new Archival[5];
    storehouse[0] = new Archival();
    storehouse[1] = new Archival();
    storehouse[2] = new Archival();
    storehouse[3] = new Archival();
    storehouse[4] = new Archival();
    farm[0] = new EmitterOpening(this.measureBeggarly, this.normativeDrift, storehouse[0]);
    farm[1] =
        new EmitterDock(this.measureBeggarly, this.normativeDrift, storehouse[1], storehouse[0]);
    farm[2] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, storehouse[2], storehouse[1]);
    farm[3] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, storehouse[2], storehouse[1]);
    farm[4] =
        new EmitterDock(this.measureBeggarly, this.normativeDrift, storehouse[3], storehouse[2]);
    farm[5] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, storehouse[4], storehouse[3]);
    farm[6] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, storehouse[4], storehouse[3]);
    farm[7] = new OperatorConclude(this.measureBeggarly, this.normativeDrift, storehouse[4]);
    storehouse[0].adjustExpected(farm[1]);
    storehouse[0].fixPre(farm[0]);
    storehouse[1].adjustExpected(farm[2], farm[3]);
    storehouse[1].fixPre(farm[1]);
    storehouse[2].adjustExpected(farm[4]);
    storehouse[2].fixPre(farm[2], farm[3]);
    storehouse[3].adjustExpected(farm[5], farm[6]);
    storehouse[3].fixPre(farm[4]);
    storehouse[4].adjustExpected(farm[7]);
    storehouse[4].fixPre(farm[5], farm[6]);
    this.celebrationBacklog.tuckCase(
        new ProduceTriathlon(HourWatchman.existingYears(), ProduceTriathlon.PotOutset, farm[0]));
  }

  public synchronized void depart() {
    Pretence.presentlySynthesizer = this;

    while (HourWatchman.existingYears() < this.periodTrammel
        && this.celebrationBacklog.enumeration() > synX1754int) synx108();
    this.printableEstimates();
  }

  private static Pretence presentlySynthesizer = null;
  private CarnivalRow celebrationBacklog = null;

  public synchronized double monthRestricting() {
    return this.periodTrammel;
  }

  private synchronized void printableEstimates() {
    System.out.println(
        String.format(
            synX1755String,
            this.periodTrammel,
            HourWatchman.existingYears(),
            this.measureBeggarly,
            this.normativeDrift));
    System.out.println(String.format(synX1756String, Archival.inventoryMaximum()));
    System.out.println(synX1757String + CalcicPurpose.topicalConsider());
    System.out.println();
    System.out.println(synX1758String);
    System.out.println(synX1759String);
    System.out.println(synX1760String);
    System.out.println(
        String.format(
            synX1761String, synX1762String, synX1763String, synX1764String, synX1765String));
    System.out.println(synX1766String);
    for (Promoter spain : farm) synx109(spain);
    System.out.println(synX1767String);
    System.out.println();
    System.out.println(synX1768String);
    System.out.println(synX1769String);
    System.out.println(
        String.format(synX1770String, synX1771String, synX1772String, synX1773String));
    System.out.println(synX1774String);
    for (Archival fh : storehouse) synx110(fh);
    System.out.println(synX1775String);
  }

  private double periodTrammel = 0.0;
  private double measureBeggarly = 0.0;
  private double normativeDrift = 0.0;

  private synchronized void synx108() {
    this.celebrationBacklog.thirdCeremonies().methodTriathlon();
  }

  private synchronized void synx109(Promoter spain) {
    System.out.println(spain.information());
  }

  private synchronized void synx110(Archival fh) {
    System.out.println(fh.numerals());
  }
}
