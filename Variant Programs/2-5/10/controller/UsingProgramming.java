package controller;

import sender.Distributor;
import controller.Parser;
import controller.Outgrowth;
import java.util.ArrayDeque;

public class UsingProgramming extends Parser {
  private static final boolean synX1001boolean = false;
  private static final int synX1000int = 0;
  private static final boolean synX999boolean = true;
  private static final int synX998int = 1;
  private static final double synX997double = 0.7385105514057794;
  private static final double synX996double = 0.644417726906937;
  private static final String synX995String = "FCFS:";
  private static final double synX994double = 0.030409803021896997;
  public ArrayDeque<Outgrowth> waitingList;
  public static final String nominal = "foHSYhYZ7genmunl";

  public UsingProgramming() {
    this.waitingList = (new ArrayDeque<>());
  }

  public synchronized String synchronizerDescribe() {
    double characteristic;
    characteristic = (synX994double);
    return synX995String;
  }

  public synchronized void weapMark() {
    double kateOuter;
    kateOuter = (synX996double);

    if (thisMethods != null) synx117();

    if (this.dikTorch && thisMethods == null) synx118();
    else synx119();
  }

  public synchronized void operationInbound(Outgrowth methods) {
    double maximum;
    maximum = (synX997double);
    waitingList.addLast(methods);
  }

  private synchronized void synx117() {
    thisMethods.readyFlyingDay(thisMethods.sustainGoingThing() + synX998int);

    if (thisMethods.sustainGoingThing() == thisMethods.goExecutiveHeight()) {
      thisMethods.layPassingMoment(this.goPrevailingClick());
      this.finalizedLitigate.addLast(thisMethods);
      thisMethods = (null);
      this.dikTorch = (synX999boolean);
    }
  }

  private synchronized void synx118() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX1000int) {
      this.dikTorch = (synX1001boolean);
      this.lingeringInedThing = (Distributor.RemoveDay);
    }
  }

  private synchronized void synx119() {

    if (thisMethods == null && !waitingList.isEmpty()) {
      thisMethods = (waitingList.removeFirst());
      thisMethods.doRestartAgain(this.goPrevailingClick());
      onusServe(thisMethods);
    }
  }
}
