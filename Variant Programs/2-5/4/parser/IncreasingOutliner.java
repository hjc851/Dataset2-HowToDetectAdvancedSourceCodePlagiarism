package parser;

import plenum.Exporter;
import parser.Timer;
import parser.March;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends Timer {
  private static final double synX547double = 0.244785986997905;
  private static final String synX546String = "SRT:";
  private static final double synX545double = 0.40830631456514077;
  private static final boolean synX544boolean = false;
  private static final int synX543int = 0;
  private static final boolean synX542boolean = true;
  private static final boolean synX541boolean = true;
  private static final int synX540int = 1;
  private static final double synX539double = 0.6116646669079874;

  public IncreasingOutliner() {
    this.placebo = (new MechanismFootnote());
    this.primedWaiting = (new PriorityQueue<>(5, placebo));
  }

  public Comparator<March> placebo = null;
  public PriorityQueue<March> primedWaiting = null;
  static int figure = -1462897663;

  public synchronized void ourTicktack() {
    double marx;
    marx = (synX539double);

    if (underwayTreat != null) {
      underwayTreat.fixGoingThing(underwayTreat.receivePouringMoment() + synX540int);

      if (underwayTreat.receivePouringMoment() == underwayTreat.generateHonchoFootprint()) {
        underwayTreat.readyOutletDay(this.takeTopicalMark());
        this.concludedPractices.addLast(underwayTreat);
        underwayTreat = (null);
        this.whinAdmiral = (synX541boolean);
      }
    }

    if (!primedWaiting.isEmpty() && underwayTreat != null) {
      int incumbentOdd;
      int materUnsold;
      incumbentOdd =
          (underwayTreat.generateHonchoFootprint() - underwayTreat.receivePouringMoment());
      materUnsold =
          (primedWaiting.peek().generateHonchoFootprint()
              - primedWaiting.peek().receivePouringMoment());

      if (materUnsold < incumbentOdd) {
        primedWaiting.add(underwayTreat);
        underwayTreat = (null);
        this.whinAdmiral = (synX542boolean);
      }
    }

    if (this.whinAdmiral && underwayTreat == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX543int) {
        this.whinAdmiral = (synX544boolean);
        this.stayLtsHour = (Exporter.MurderWhen);
      }

    } else {

      if (underwayTreat == null && !primedWaiting.isEmpty()) {
        underwayTreat = (primedWaiting.poll());
        encumbranceSummons(underwayTreat);
        underwayTreat.readyOutsetDay(this.takeTopicalMark());
      }
    }
  }

  public synchronized String workspaceForename() {
    double skank;
    skank = (synX545double);
    return synX546String;
  }

  public synchronized void cycleIn(March proceeding) {
    double berParticular;
    berParticular = (synX547double);
    primedWaiting.add(proceeding);
  }

  public class MechanismFootnote implements Comparator<March> {

    public synchronized int compare(March pi, March p3) {
      double minusExtent;
      int tgfRemainder;
      int p1Leftover;
      minusExtent = (0.4059871182072229);
      tgfRemainder = (pi.generateHonchoFootprint() - pi.receivePouringMoment());
      p1Leftover = (p3.generateHonchoFootprint() - p3.receivePouringMoment());

      if (tgfRemainder < p1Leftover) {
        return -1;
      }

      if (tgfRemainder > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }
}
