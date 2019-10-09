package realism;

import acculturative.HoursAdministrator;
import extractionTreasures.ExhaustibleBody;
import grower.*;
import warehouse.*;
import tape.*;
import static java.lang.String.format;

public class Pretence {
  private static final int synX435int = 0;
  private static final String synX434String = " ----------------------------------------------- ";
  private static final String synX433String = " ----------------------------------------------- ";
  private static final String synX432String = "Average Count";
  private static final String synX431String = "Average Time";
  private static final String synX430String = "Storage ID";
  private static final String synX429String = "| %-14s | %-12s | %-12s |";
  private static final String synX428String = " ----------------------------------------------- ";
  private static final String synX427String = "Storage";
  private static final String synX426String =
      " ----------------------------------------------------- ";
  private static final String synX425String =
      "|-----------------------------------------------------|";
  private static final String synX424String = "Blocked";
  private static final String synX423String = "Starving";
  private static final String synX422String = "Production";
  private static final String synX421String = "Producer ID";
  private static final String synX420String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX419String =
      " ----------------------------------------------------- ";
  private static final String synX418String = "Assemblers";
  private static final String synX417String = "Statistics\n";
  private static final String synX416String = "ProducibleObject count: ";
  private static final String synX415String = "Storage Capacity: %d";
  private static final String synX414String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";

  private synchronized void brailleNumerals() {
    System.out.println(
        format(
            synX414String,
            this.monthRestricting,
            acculturative.HoursAdministrator.circulatingPeriods(),
            this.modularLittle,
            this.standardizedArray));
    System.out.println(format(synX415String, warehouse.Store.archivalCurtail()));
    System.out.println(synX416String + extractionTreasures.ExhaustibleBody.existingIndictment());
    System.out.println();
    System.out.println(synX417String);
    System.out.println(synX418String);
    System.out.println(synX419String);
    System.out.println(
        format(synX420String, synX421String, synX422String, synX423String, synX424String));
    System.out.println(synX425String);
    for (grower.Producing equally : publisher) synx31(equally);
    System.out.println(synX426String);
    System.out.println();
    System.out.println(synX427String);
    System.out.println(synX428String);
    System.out.println(format(synX429String, synX430String, synX431String, synX432String));
    System.out.println(synX433String);
    for (warehouse.Store fh : archiving) synx32(fh);
    System.out.println(synX434String);
  }

  public synchronized double thingReduce() {
    return this.monthRestricting;
  }

  private double modularLittle;

  public synchronized void commences() {
    Pretence.incumbentPretense = this;

    while (acculturative.HoursAdministrator.circulatingPeriods() < this.monthRestricting
        && this.commemorationBraid.numeration() > synX435int) synx33();
    this.brailleNumerals();
  }

  public static synchronized realism.Pretence formerAnalogue() {
    return incumbentPretense;
  }

  private grower.Producing publisher[];
  private static realism.Pretence incumbentPretense;
  private double standardizedArray;
  private tape.CelebrationBacklog commemorationBraid;
  private warehouse.Store archiving[];
  private double monthRestricting;

  public Pretence(double momentRestrain, double authoritativeHateful, double prescriptiveBrowse) {
    this.monthRestricting = momentRestrain;
    this.modularLittle = authoritativeHateful;
    this.standardizedArray = prescriptiveBrowse;
    this.commemorationBraid = new tape.CelebrationBacklog();
    this.publisher = new grower.Producing[8];
    this.archiving = new warehouse.Store[5];
    archiving[0] = new warehouse.Store();
    archiving[1] = new warehouse.Store();
    archiving[2] = new warehouse.Store();
    archiving[3] = new warehouse.Store();
    archiving[4] = new warehouse.Store();
    publisher[0] =
        new grower.FarmerBegins(this.modularLittle, this.standardizedArray, archiving[0]);
    publisher[1] =
        new grower.OperatorPolice(
            this.modularLittle, this.standardizedArray, archiving[1], archiving[0]);
    publisher[2] =
        new grower.OperatorPolice(
            this.modularLittle * 2.0, this.standardizedArray * 2.0, archiving[2], archiving[1]);
    publisher[3] =
        new grower.OperatorPolice(
            this.modularLittle * 2.0, this.standardizedArray * 2.0, archiving[2], archiving[1]);
    publisher[4] =
        new grower.OperatorPolice(
            this.modularLittle, this.standardizedArray, archiving[3], archiving[2]);
    publisher[5] =
        new grower.OperatorPolice(
            this.modularLittle * 2.0, this.standardizedArray * 2.0, archiving[4], archiving[3]);
    publisher[6] =
        new grower.OperatorPolice(
            this.modularLittle * 2.0, this.standardizedArray * 2.0, archiving[4], archiving[3]);
    publisher[7] =
        new grower.OperatorConclude(this.modularLittle, this.standardizedArray, archiving[4]);
    archiving[0].fixedAfter(publisher[1]);
    archiving[0].arrangeAgo(publisher[0]);
    archiving[1].fixedAfter(publisher[2], publisher[3]);
    archiving[1].arrangeAgo(publisher[1]);
    archiving[2].fixedAfter(publisher[4]);
    archiving[2].arrangeAgo(publisher[2], publisher[3]);
    archiving[3].fixedAfter(publisher[5], publisher[6]);
    archiving[3].arrangeAgo(publisher[4]);
    archiving[4].fixedAfter(publisher[7]);
    archiving[4].arrangeAgo(publisher[5], publisher[6]);
    this.commemorationBraid.incorporatedRally(
        new tape.PresenterSymposium(
            acculturative.HoursAdministrator.circulatingPeriods(),
            PresenterSymposium.BehindRestart,
            publisher[0]));
  }

  private synchronized void synx31(Producing equally) {
    System.out.println(equally.survey());
  }

  private synchronized void synx32(Store fh) {
    System.out.println(fh.number());
  }

  private synchronized void synx33() {
    this.commemorationBraid.nowRace().methodTriathlon();
  }
}
