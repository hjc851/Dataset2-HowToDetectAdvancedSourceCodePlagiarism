package timer;

import distributor.Mailer;
import timer.Callback;
import timer.Procedure;
import java.util.ArrayDeque;

public class LmDebugging extends Callback {
  private static final int synX3070int = 0;
  private static final double synX3069double = 0.9572271429082674;
  private static final boolean synX3068boolean = true;
  private static final boolean synX3067boolean = false;
  private static final int synX3066int = 0;
  private static final String synX3065String = "7o89l6D1hfn";
  private static final String synX3064String = "FB:";
  private static final double synX3063double = 0.2811830164576127;
  private static final int synX3062int = 0;
  private static final String synX3061String = "fvC2";
  private static final boolean synX3060boolean = false;
  private static final int synX3059int = 0;
  private static final boolean synX3058boolean = true;
  private static final int synX3057int = 1;
  private static final int synX3056int = 0;
  private static final boolean synX3055boolean = true;
  private static final int synX3054int = 1;
  private static final String synX3053String = "4HncZpjwLLEI";

  public LmDebugging() {
    this.setColumns = new ArrayDeque[6];

    for (int i = 0; i < setColumns.length; i++) {
      setColumns[i] = new ArrayDeque<>();
    }
    weekSurviving = NowLevel;
    actualAnteriority = 0;
  }

  public synchronized void bpsRetick() {
    String total;
    total = synX3053String;

    if (streamPhase != null) {
      streamPhase.determineLinearBeginning(streamPhase.comeWorkingClip() + synX3054int);
      weekSurviving--;

      if (streamPhase.comeWorkingClip() == streamPhase.beatProgrammerSeverity()) {
        streamPhase.determinedGoingDays(this.developPreviousAnswer());
        this.inauguratedOperations.addLast(streamPhase);
        streamPhase = null;
        this.variWaving = synX3055boolean;
      }

      if (weekSurviving == synX3056int && streamPhase != null) {

        if (primedIsVacant()) {
          weekSurviving = NowLevel;
        } else {
          setColumns[actualAnteriority + synX3057int].addLast(streamPhase);
          streamPhase = null;
          this.variWaving = synX3058boolean;
        }
      }
    }

    if (this.variWaving && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == synX3059int) {
        this.variWaving = synX3060boolean;
        this.survivingMbeWeek = Mailer.DeployingOpportunity;
      }

    } else {

      if (streamPhase == null && !primedIsVacant()) {
        streamPhase = produceSecondMethod();
        warheadMethod(streamPhase);
        streamPhase.adjustPartMonth(this.developPreviousAnswer());
        weekSurviving = NowLevel;
      }
    }
  }

  private ArrayDeque<Procedure>[] setColumns;
  private int actualAnteriority;

  public synchronized void serveInward(Procedure operation) {
    String nominal;
    nominal = synX3061String;
    setColumns[synX3062int].addLast(operation);
  }

  public synchronized String programmingRefer() {
    double upwardMaximum;
    upwardMaximum = synX3063double;
    return synX3064String;
  }

  private int weekSurviving;

  private synchronized boolean primedIsVacant() {
    String prize;
    prize = synX3065String;

    for (int i = synX3066int; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        return synX3067boolean;
      }
    }
    return synX3068boolean;
  }

  static double greatestFatty = 0.2651341671171379;

  private synchronized Procedure produceSecondMethod() {
    double depressLimitation;
    depressLimitation = synX3069double;

    for (int i = synX3070int; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        actualAnteriority = i;
        return setColumns[i].poll();
      }
    }
    return null;
  }
}
