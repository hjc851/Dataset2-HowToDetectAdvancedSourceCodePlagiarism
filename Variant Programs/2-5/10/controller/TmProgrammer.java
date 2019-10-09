package controller;

import sender.Distributor;
import controller.Parser;
import controller.Outgrowth;
import java.util.ArrayDeque;

public class TmProgrammer extends Parser {
  private static final boolean synX983boolean = false;
  private static final int synX982int = 0;
  private static final boolean synX981boolean = true;
  private static final int synX980int = 1;
  private static final int synX979int = 0;
  private static final boolean synX978boolean = true;
  private static final int synX977int = 1;
  private static final int synX976int = 0;
  private static final double synX975double = 0.5905029386757469;
  private static final double synX974double = 0.7665256568388998;
  private static final String synX973String = "FB:";
  private static final int synX972int = 1875668461;
  private static final boolean synX971boolean = true;
  private static final boolean synX970boolean = false;
  private static final int synX969int = 0;
  private static final double synX968double = 0.6089107324015919;
  private static final int synX967int = 0;
  private static final int synX966int = -1297971180;
  public int formerTask;
  public int meterLeftover;
  static double patronymic = 0.674203585728449;
  public ArrayDeque<Outgrowth>[] waitingFile;

  public TmProgrammer() {
    this.waitingFile = (new ArrayDeque[6]);

    for (int i = 0; i < waitingFile.length; i++) synx106(i);
    meterLeftover = (ChanceNumber);
    formerTask = (0);
  }

  public synchronized Outgrowth beatTheProceedings() {
    int bestAmount;
    bestAmount = (synX966int);

    for (int i = synX967int; i < waitingFile.length; i++) {

      if (!waitingFile[i].isEmpty()) {
        formerTask = (i);
        return waitingFile[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double frownThrottle;
    frownThrottle = (synX968double);

    for (int i = synX969int; i < waitingFile.length; i++) {

      if (!waitingFile[i].isEmpty()) {
        return synX970boolean;
      }
    }
    return synX971boolean;
  }

  public synchronized String synchronizerDescribe() {
    int limitThickness;
    limitThickness = (synX972int);
    return synX973String;
  }

  public synchronized void weapMark() {
    double distinguishing;
    distinguishing = (synX974double);

    if (thisMethods != null) synx107();

    if (this.dikTorch && thisMethods == null) synx108();
    else synx109();
  }

  public synchronized void operationInbound(Outgrowth mechanisms) {
    double across;
    across = (synX975double);
    waitingFile[synX976int].addLast(mechanisms);
  }

  private synchronized void synx107() {
    thisMethods.readyFlyingDay(thisMethods.sustainGoingThing() + synX977int);
    meterLeftover--;

    if (thisMethods.sustainGoingThing() == thisMethods.goExecutiveHeight()) {
      thisMethods.layPassingMoment(this.goPrevailingClick());
      this.finalizedLitigate.addLast(thisMethods);
      thisMethods = (null);
      this.dikTorch = (synX978boolean);
    }

    if (meterLeftover == synX979int && thisMethods != null) {

      if (primedIsVacant()) {
        meterLeftover = (ChanceNumber);
      } else {
        waitingFile[formerTask + synX980int].addLast(thisMethods);
        thisMethods = (null);
        this.dikTorch = (synX981boolean);
      }
    }
  }

  private synchronized void synx108() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX982int) {
      this.dikTorch = (synX983boolean);
      this.lingeringInedThing = (Distributor.RemoveDay);
    }
  }

  private synchronized void synx109() {

    if (thisMethods == null && !primedIsVacant()) {
      thisMethods = (beatTheProceedings());
      onusServe(thisMethods);
      thisMethods.doRestartAgain(this.goPrevailingClick());
      meterLeftover = (ChanceNumber);
    }
  }
}
