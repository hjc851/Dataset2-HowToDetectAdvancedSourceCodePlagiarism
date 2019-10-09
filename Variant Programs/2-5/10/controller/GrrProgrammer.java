package controller;

import sender.Distributor;
import controller.Parser;
import controller.Outgrowth;
import java.util.ArrayDeque;

public class GrrProgrammer extends Parser {
  private static final boolean synX965boolean = false;
  private static final int synX964int = 0;
  private static final boolean synX963boolean = true;
  private static final int synX962int = 1;
  private static final int synX961int = 2;
  private static final int synX960int = 0;
  private static final boolean synX959boolean = true;
  private static final int synX958int = 1;
  private static final double synX957double = 0.2418248804271752;
  private static final double synX956double = 0.7417522157525359;
  private static final String synX955String = "NRR:";
  private static final double synX954double = 0.3094891927539466;
  public GrrProcedure grrProcedure;
  public int weekSurviving;
  public ArrayDeque<GrrProcedure> availableFile;
  static final double premiumDepth = 0.9520708133983169;

  public GrrProgrammer() {
    this.availableFile = (new ArrayDeque<>());
    weekSurviving = (Parser.ChanceNumber);
  }

  public synchronized String synchronizerDescribe() {
    double restrain;
    restrain = (synX954double);
    return synX955String;
  }

  public synchronized void weapMark() {
    double thick;
    thick = (synX956double);

    if (grrProcedure != null) synx103();

    if (this.dikTorch && thisMethods == null) synx104();
    else synx105();
  }

  public synchronized void operationInbound(Outgrowth act) {
    double importance;
    importance = (synX957double);
    availableFile.add(new GrrProcedure(act));
  }

  private synchronized void synx103() {
    grrProcedure.readyFlyingDay(grrProcedure.sustainGoingThing() + synX958int);
    weekSurviving--;

    if (grrProcedure.sustainGoingThing() == grrProcedure.goExecutiveHeight()) {
      grrProcedure.layPassingMoment(this.goPrevailingClick());
      this.finalizedLitigate.addLast(grrProcedure);
      grrProcedure = (null);
      this.dikTorch = (synX959boolean);
    }

    if (weekSurviving == synX960int && grrProcedure != null) {

      if (availableFile.isEmpty()) {
        weekSurviving = (grrProcedure.generateYearSurface());
      } else {

        if (grrProcedure.generateYearSurface() > synX961int) {
          grrProcedure.rigidAmountMarkers(grrProcedure.generateYearSurface() - synX962int);
        }

        availableFile.addLast(grrProcedure);
        grrProcedure = (null);
        this.dikTorch = (synX963boolean);
      }
    }
  }

  private synchronized void synx104() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX964int) {
      this.dikTorch = (synX965boolean);
      this.lingeringInedThing = (Distributor.RemoveDay);
    }
  }

  private synchronized void synx105() {

    if (grrProcedure == null && !availableFile.isEmpty()) {
      grrProcedure = (availableFile.removeFirst());
      onusServe(grrProcedure);
      grrProcedure.doRestartAgain(this.goPrevailingClick());
      weekSurviving = (grrProcedure.generateYearSurface());
    }
  }

  private synchronized void synx106(int i) {
    waitingFile[i] = (new ArrayDeque<>());
  }
}
