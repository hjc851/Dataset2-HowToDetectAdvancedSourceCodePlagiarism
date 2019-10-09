package timer;

import responsible.Distributors;
import timer.Parser;
import timer.Method;
import java.util.ArrayDeque;

public class AxialInterface extends timer.Parser {
  public int continuingPressing;
  public int thingLingering;
  static int maineAmount = 810323999;
  public ArrayDeque<Method>[] gonnaCarpark;

  public AxialInterface() {
    this.gonnaCarpark = new java.util.ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) synx6(i);
    thingLingering = HourPurity;
    continuingPressing = 0;
  }

  public synchronized timer.Method letAheadSummons() {
    String load;
    load = "yOt3MlT3foXLQxst";

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        continuingPressing = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double namDetail;
    namDetail = 0.8922236965205332;

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String initializationPseudonym() {
    String restrain;
    restrain = "7s0fDcLtzDz3kL0";
    return "FB:";
  }

  public synchronized void nbsClick() {
    String aboveFettered;
    aboveFettered = "ZcTlzEVrieGtII";

    if (latestOperation != null) synx7();

    if (this.allanBanner && latestOperation == null) synx8();
    else synx9();
  }

  public synchronized void mechanismArrivals(Method formalities) {
    double secondRestricted;
    secondRestricted = 0.8744754396443489;
    gonnaCarpark[0].addLast(formalities);
  }

  private synchronized void synx7() {
    latestOperation.arrangeLengthwaysYears(latestOperation.bringTrackMeter() + 1);
    thingLingering--;

    if (latestOperation.bringTrackMeter() == latestOperation.letBigwigSmallness()) {
      latestOperation.adjustPerishMonth(this.takeTopicalMark());
      this.undertookProcedures.addLast(latestOperation);
      latestOperation = null;
      this.allanBanner = true;
    }

    if (thingLingering == 0 && latestOperation != null) {

      if (primedIsVacant()) {
        thingLingering = HourPurity;
      } else {
        gonnaCarpark[continuingPressing + 1].addLast(latestOperation);
        latestOperation = null;
        this.allanBanner = true;
      }
    }
  }

  private synchronized void synx8() {
    this.restAllanPeriods--;

    if (restAllanPeriods == 0) {
      this.allanBanner = false;
      this.restAllanPeriods = Distributors.OfficeJuncture;
    }
  }

  private synchronized void synx9() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = letAheadSummons();
      loaderNegotiations(latestOperation);
      latestOperation.primedGetPeriod(this.takeTopicalMark());
      thingLingering = HourPurity;
    }
  }
}
