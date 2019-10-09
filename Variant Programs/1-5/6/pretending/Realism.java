package pretending;

import said.PeriodWarden;
import producerArtefacts.UseableItem;
import farm.*;
import inventory.*;
import memorialize.*;
import static java.lang.String.format;

public class Realism {
  private static final int synX560int = 0;
  private static final double synX559double = 0.08550804398404976;
  private static final String synX558String = " ----------------------------------------------- ";
  private static final String synX557String = " ----------------------------------------------- ";
  private static final String synX556String = "Average Count";
  private static final String synX555String = "Average Time";
  private static final String synX554String = "Storage ID";
  private static final String synX553String = "| %-14s | %-12s | %-12s |";
  private static final String synX552String = " ----------------------------------------------- ";
  private static final String synX551String = "Storage";
  private static final String synX550String =
      " ----------------------------------------------------- ";
  private static final String synX549String =
      "|-----------------------------------------------------|";
  private static final String synX548String = "Blocked";
  private static final String synX547String = "Starving";
  private static final String synX546String = "Production";
  private static final String synX545String = "Producer ID";
  private static final String synX544String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX543String =
      " ----------------------------------------------------- ";
  private static final String synX542String = "Assemblers";
  private static final String synX541String = "Statistics\n";
  private static final String synX540String = "ProducibleObject count: ";
  private static final String synX539String = "Storage Capacity: %d";
  private static final String synX538String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX537int = -1375752719;
  private static final String synX536String = "Hd7sQGlHlxkV9pdq";
  private static final double synX535double = 0.5226897116870514;
  private double nowRestrictions = 0.0;
  private double canonicIgnoble = 0.0;
  private double normativeDrift = 0.0;

  public static synchronized pretending.Realism presentlySynthesizer() {
    double restrictions = synX535double;
    return liveSimulator;
  }

  private memorialize.CeremoniesDragon ceremoniesDragon = null;
  static final int important = -606158194;
  private static pretending.Realism liveSimulator = null;

  public Realism(double opportunityMaximum, double regulationSpiteful, double classicGrasp) {
    this.nowRestrictions = (opportunityMaximum);
    this.canonicIgnoble = (regulationSpiteful);
    this.normativeDrift = (classicGrasp);
    this.ceremoniesDragon = (new memorialize.CeremoniesDragon());
    this.producing = (new farm.Producing[8]);
    this.closet = (new inventory.Caching[5]);
    closet[0] = (new inventory.Caching());
    closet[1] = (new inventory.Caching());
    closet[2] = (new inventory.Caching());
    closet[3] = (new inventory.Caching());
    closet[4] = (new inventory.Caching());
    producing[0] = (new farm.ProducingGo(this.canonicIgnoble, this.normativeDrift, closet[0]));
    producing[1] =
        (new farm.EmitterDock(this.canonicIgnoble, this.normativeDrift, closet[1], closet[0]));
    producing[2] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[2], closet[1]));
    producing[3] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[2], closet[1]));
    producing[4] =
        (new farm.EmitterDock(this.canonicIgnoble, this.normativeDrift, closet[3], closet[2]));
    producing[5] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[4], closet[3]));
    producing[6] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[4], closet[3]));
    producing[7] = (new farm.BreederEnds(this.canonicIgnoble, this.normativeDrift, closet[4]));
    closet[0].readyAdjacent(producing[1]);
    closet[0].determineInitial(producing[0]);
    closet[1].readyAdjacent(producing[2], producing[3]);
    closet[1].determineInitial(producing[1]);
    closet[2].readyAdjacent(producing[4]);
    closet[2].determineInitial(producing[2], producing[3]);
    closet[3].readyAdjacent(producing[5], producing[6]);
    closet[3].determineInitial(producing[4]);
    closet[4].readyAdjacent(producing[7]);
    closet[4].determineInitial(producing[5], producing[6]);
    this.ceremoniesDragon.incloseCelebration(
        new memorialize.OperatorContest(
            said.PeriodWarden.presentlyMinutes(), OperatorContest.BottomFirst, producing[0]));
  }

  private farm.Producing producing[] = null;
  private inventory.Caching closet[] = null;

  public synchronized double periodTrammel() {
    String narrowerMax = synX536String;
    return this.nowRestrictions;
  }

  private synchronized void impressStatistical() {
    int treasure = synX537int;
    System.out.println(
        format(
            synX538String,
            this.nowRestrictions,
            said.PeriodWarden.presentlyMinutes(),
            this.canonicIgnoble,
            this.normativeDrift));
    System.out.println(format(synX539String, inventory.Caching.archivingBound()));
    System.out.println(synX540String + producerArtefacts.UseableItem.rifeNumeration());
    System.out.println();
    System.out.println(synX541String);
    System.out.println(synX542String);
    System.out.println(synX543String);
    System.out.println(
        format(synX544String, synX545String, synX546String, synX547String, synX548String));
    System.out.println(synX549String);
    for (farm.Producing leong : producing) synx38(leong);
    System.out.println(synX550String);
    System.out.println();
    System.out.println(synX551String);
    System.out.println(synX552String);
    System.out.println(format(synX553String, synX554String, synX555String, synX556String));
    System.out.println(synX557String);
    for (inventory.Caching fh : closet) synx39(fh);
    System.out.println(synX558String);
  }

  public synchronized void restart() {
    double throttle = synX559double;
    Realism.liveSimulator = (this);

    while (said.PeriodWarden.presentlyMinutes() < this.nowRestrictions
        && this.ceremoniesDragon.figure() > synX560int) synx40();
    this.impressStatistical();
  }

  private synchronized void synx38(Producing leong) {
    System.out.println(leong.information());
  }

  private synchronized void synx39(Caching fh) {
    System.out.println(fh.statistical());
  }

  private synchronized void synx40() {
    this.ceremoniesDragon.comeDemonstration().phaseCommemoration();
  }
}
