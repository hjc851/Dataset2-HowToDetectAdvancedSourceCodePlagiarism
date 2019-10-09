package warehouse;

import java.util.HashMap;
import developmental.DayCaretaker;
import filmingExhibits.UseableItem;
import production.*;
import stimulation.Simulator;

public class Disk {
  private static int antagonistic = 0;
  private double modalNumbers = 0.0;
  private Commodity recent[] = null;

  public static synchronized int warehousesMinimum() {
    return Disk.closetMax;
  }

  public synchronized UseableItem upcomingSomething() throws ArchivalHungryExempt {

    if (this.census() > 0) {
      UseableItem hamatum;
      double addWeek;
      double dispatchMoment;
      hamatum = this.warehouseLitany.murderStart();
      this.modalNumbers +=
          (this.census() + 1)
              * (DayCaretaker.continuingAgain() - this.finalGalaSentence)
              / Simulator.presentAnalog().weekMinimum();
      addWeek = this.pronunciation.remove(hamatum);
      dispatchMoment = DayCaretaker.continuingAgain();
      this.ratesAgain =
          (ratesAgain * talliedObjective + (dispatchMoment - addWeek)) / ++talliedObjective;
      for (Commodity electricity : recent) {

        if (electricity.actualPublic() == GrowerTell.inhibiting) {
          electricity.resolve();
          break;
        }
      }
      this.finalGalaSentence = DayCaretaker.continuingAgain();
      return hamatum;
    } else {
      throw new ArchivalHungryExempt();
    }
  }

  private HashMap<UseableItem, Double> pronunciation = null;
  private static int closetMax = 1;

  public synchronized String survey() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ratesAgain, this.modalNumbers);
  }

  public synchronized void introduceAspect(UseableItem item) throws CachingBroadExemptions {

    if (this.warehouseLitany.calculate() < Disk.closetMax) {
      this.warehouseLitany.attachLowest(item);
      this.modalNumbers +=
          (this.census() - 1)
              * (DayCaretaker.continuingAgain() - this.finalGalaSentence)
              / Simulator.presentAnalog().weekMinimum();
      this.pronunciation.put(item, DayCaretaker.continuingAgain());
      this.finalGalaSentence = DayCaretaker.continuingAgain();
      for (Commodity arsenic : third) {

        if (arsenic.actualPublic() == GrowerTell.brutalized) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new CachingBroadExemptions();
    }
  }

  public synchronized void placeSuccessive(Commodity... preliminary) {
    this.recent = preliminary;
  }

  private double talliedObjective = 0.0;

  public Disk() {
    this.warehouseLitany = new RingedInfluencedRoster<UseableItem>();
    this.pronunciation = new HashMap<UseableItem, Double>();
    this.card = antagonistic++;
    this.ratesAgain = 0;
    this.talliedObjective = 0;
    this.modalNumbers = 0;
    this.finalGalaSentence = 0;
  }

  public synchronized void layIncoming(Commodity... succeeding) {
    this.third = succeeding;
  }

  private RingedInfluencedRoster<UseableItem> warehouseLitany = null;
  private Commodity third[] = null;

  public synchronized int census() {
    return this.warehouseLitany.calculate();
  }

  public synchronized String toString() {
    return "Storage" + card;
  }

  private double finalGalaSentence = 0.0;

  public static synchronized void fixedInventoryMaximum(int storeConfine) {

    if (storeConfine > 0) Disk.closetMax = storeConfine;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  private double ratesAgain = 0.0;
  private int card = 0;
}
