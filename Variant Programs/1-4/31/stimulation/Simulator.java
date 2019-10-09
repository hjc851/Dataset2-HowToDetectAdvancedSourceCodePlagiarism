package stimulation;

import developmental.DayCaretaker;
import filmingExhibits.UseableItem;
import production.*;
import warehouse.*;
import memorialize.*;

public class Simulator {
  private double chanceThreshold = 0.0;

  public Simulator(double yearsCurtail, double criterionalEquate, double stockRamble) {
    this.chanceThreshold = yearsCurtail;
    this.canonicIgnoble = criterionalEquate;
    this.casebookSwan = stockRamble;
    this.paradeConvoy = new ParadeConvoy();
    this.output = new Commodity[8];
    this.disk = new Disk[5];
    disk[0] = new Disk();
    disk[1] = new Disk();
    disk[2] = new Disk();
    disk[3] = new Disk();
    disk[4] = new Disk();
    output[0] = new MakerOutset(this.canonicIgnoble, this.casebookSwan, disk[0]);
    output[1] = new ProducingSend(this.canonicIgnoble, this.casebookSwan, disk[1], disk[0]);
    output[2] =
        new ProducingSend(this.canonicIgnoble * 2.0, this.casebookSwan * 2.0, disk[2], disk[1]);
    output[3] =
        new ProducingSend(this.canonicIgnoble * 2.0, this.casebookSwan * 2.0, disk[2], disk[1]);
    output[4] = new ProducingSend(this.canonicIgnoble, this.casebookSwan, disk[3], disk[2]);
    output[5] =
        new ProducingSend(this.canonicIgnoble * 2.0, this.casebookSwan * 2.0, disk[4], disk[3]);
    output[6] =
        new ProducingSend(this.canonicIgnoble * 2.0, this.casebookSwan * 2.0, disk[4], disk[3]);
    output[7] = new CommodityCompleted(this.canonicIgnoble, this.casebookSwan, disk[4]);
    disk[0].layIncoming(output[1]);
    disk[0].placeSuccessive(output[0]);
    disk[1].layIncoming(output[2], output[3]);
    disk[1].placeSuccessive(output[1]);
    disk[2].layIncoming(output[4]);
    disk[2].placeSuccessive(output[2], output[3]);
    disk[3].layIncoming(output[5], output[6]);
    disk[3].placeSuccessive(output[4]);
    disk[4].layIncoming(output[7]);
    disk[4].placeSuccessive(output[5], output[6]);
    this.paradeConvoy.attachParade(
        new ProviderSummit(DayCaretaker.continuingAgain(), ProviderSummit.PotOutset, output[0]));
  }

  public static synchronized Simulator presentAnalog() {
    return formerAnalogue;
  }

  private Disk disk[] = null;
  private double canonicIgnoble = 0.0;
  private Commodity output[] = null;

  public synchronized void began() {
    Simulator.formerAnalogue = this;

    while (DayCaretaker.continuingAgain() < this.chanceThreshold && this.paradeConvoy.weigh() > 0)
      synx101();
    this.mediaAgency();
  }

  private synchronized void mediaAgency() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.chanceThreshold,
            DayCaretaker.continuingAgain(),
            this.canonicIgnoble,
            this.casebookSwan));
    System.out.println(String.format("Storage Capacity: %d", Disk.warehousesMinimum()));
    System.out.println("ProducibleObject count: " + UseableItem.typicalRely());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Commodity spain : output) synx102(spain);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Disk waffen : disk) synx103(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private double casebookSwan = 0.0;
  private ParadeConvoy paradeConvoy = null;
  private static Simulator formerAnalogue = null;

  public synchronized double weekMinimum() {
    return this.chanceThreshold;
  }

  private synchronized void synx101() {
    this.paradeConvoy.nowRace().proceduresSeminar();
  }

  private synchronized void synx102(Commodity spain) {
    System.out.println(spain.digit());
  }

  private synchronized void synx103(Disk waffen) {
    System.out.println(waffen.survey());
  }
}
