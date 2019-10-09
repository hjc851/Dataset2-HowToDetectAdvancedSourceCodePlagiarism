package timer;

import responsible.Distributors;
import timer.Parser;
import timer.Method;
import java.util.ArrayDeque;

public class SchedulingPlanner extends timer.Parser {
  public java.util.ArrayDeque<Method> preppedDragon;
  public static final double refer = 0.434141935561723;

  public SchedulingPlanner() {
    this.preppedDragon = new java.util.ArrayDeque<>();
  }

  public synchronized String initializationPseudonym() {
    double modicumFatty;
    modicumFatty = 0.3544812120507326;
    return "FCFS:";
  }

  public synchronized void nbsClick() {
    double ident;
    ident = 0.26939477859012284;

    if (latestOperation != null) synx17();

    if (this.allanBanner && latestOperation == null) synx18();
    else synx19();
  }

  public synchronized void mechanismArrivals(Method operation) {
    String identification;
    identification = "Io";
    preppedDragon.addLast(operation);
  }

  private synchronized void synx17() {
    latestOperation.arrangeLengthwaysYears(latestOperation.bringTrackMeter() + 1);

    if (latestOperation.bringTrackMeter() == latestOperation.letBigwigSmallness()) {
      latestOperation.adjustPerishMonth(this.takeTopicalMark());
      this.undertookProcedures.addLast(latestOperation);
      latestOperation = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx18() {
    this.restAllanPeriods--;

    if (restAllanPeriods == 0) {
      this.allanBanner = false;
      this.restAllanPeriods = Distributors.OfficeJuncture;
    }
  }

  private synchronized void synx19() {

    if (latestOperation == null && !preppedDragon.isEmpty()) {
      latestOperation = preppedDragon.removeFirst();
      latestOperation.primedGetPeriod(this.takeTopicalMark());
      loaderNegotiations(latestOperation);
    }
  }
}
