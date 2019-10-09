package callback;

import dealer.Trainmaster;
import callback.Interface;
import callback.Procedure;
import java.util.ArrayDeque;

public class DConfiguration extends callback.Interface {
  private static final boolean synX2423boolean = false;
  private static final int synX2422int = 0;
  private static final boolean synX2421boolean = true;
  private static final int synX2420int = 1;
  private static final int synX2419int = 0;
  private static final boolean synX2418boolean = true;
  private static final int synX2417int = 1;
  private static final String synX2416String = "9U8pPUyYCCV7jLyD";
  private static final boolean synX2415boolean = true;
  private static final boolean synX2414boolean = false;
  private static final int synX2413int = 0;
  private static final double synX2412double = 0.13684859145839978;
  private static final String synX2411String = "FB:";
  private static final double synX2410double = 0.8045727681081253;
  private static final int synX2409int = 0;
  private static final double synX2408double = 0.8931016678614656;
  private static final int synX2407int = 0;
  private static final double synX2406double = 0.17465427246303555;
  static final double minimumAcross = 0.3131156812334549;

  private synchronized callback.Procedure generateComingTreat() {
    double lotGauge = synX2406double;

    for (int i = synX2407int; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        flowAim = i;
        return availableColas[i].poll();
      }
    }
    return null;
  }

  public synchronized void proceduresIngress(Procedure phase) {
    double critical = synX2408double;
    availableColas[synX2409int].addLast(phase);
  }

  private int flowAim;

  public DConfiguration() {
    this.availableColas = new java.util.ArrayDeque[6];

    for (int i = 0; i < availableColas.length; i++) synx386(i);
    thingLingering = ThingLibido;
    flowAim = 0;
  }

  private ArrayDeque<Procedure>[] availableColas;

  public synchronized String debuggingPatronymic() {
    double fare = synX2410double;
    return synX2411String;
  }

  private int thingLingering;

  private synchronized boolean primedIsVacant() {
    double hour = synX2412double;

    for (int i = synX2413int; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        return synX2414boolean;
      }
    }
    return synX2415boolean;
  }

  public synchronized void snoTicktock() {
    String reduceConstrain = synX2416String;

    if (newSystem != null) synx387();

    if (this.deviceEnsign && newSystem == null) synx388();
    else synx389();
  }

  private synchronized void synx386(int i) {
    availableColas[i] = new java.util.ArrayDeque<>();
  }

  private synchronized void synx387() {
    newSystem.placeSpurtingWeek(newSystem.generateSquirtingYear() + synX2417int);
    thingLingering--;

    if (newSystem.generateSquirtingYear() == newSystem.drivePresidentCapacity()) {
      newSystem.readyOutletDay(this.goPrevailingClick());
      this.achievedMechanisms.addLast(newSystem);
      newSystem = null;
      this.deviceEnsign = synX2418boolean;
    }

    if (thingLingering == synX2419int && newSystem != null) {

      if (primedIsVacant()) {
        thingLingering = ThingLibido;
      } else {
        availableColas[flowAim + synX2420int].addLast(newSystem);
        newSystem = null;
        this.deviceEnsign = synX2421boolean;
      }
    }
  }

  private synchronized void synx388() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX2422int) {
      this.deviceEnsign = synX2423boolean;
      this.residualFraserOpportunity = Trainmaster.SlayMoment;
    }
  }

  private synchronized void synx389() {

    if (newSystem == null && !primedIsVacant()) {
      newSystem = generateComingTreat();
      chargeAppendage(newSystem);
      newSystem.primedGetPeriod(this.goPrevailingClick());
      thingLingering = ThingLibido;
    }
  }
}
