package parser;

import exporter.Caller;
import parser.Developer;
import parser.Serve;
import java.util.ArrayDeque;

public class GpaInterface extends parser.Developer {
  private static final boolean synX2763boolean = false;
  private static final int synX2762int = 0;
  private static final boolean synX2761boolean = true;
  private static final int synX2760int = 0;
  private static final boolean synX2759boolean = true;
  private static final int synX2758int = 1;
  private static final String synX2757String = "QDGWvTBcw2qN1TjVuD";
  private static final int synX2756int = 1010767694;
  private static final String synX2755String = "RR:";
  private static final int synX2754int = 1720713163;
  public static final double topsBeam = 0.7872757828709395;
  public java.util.ArrayDeque<Serve> willingSpooler;
  public int hourStay;

  public GpaInterface() {
    this.willingSpooler = new java.util.ArrayDeque<>();
    hourStay = AmountMarkers;
  }

  public synchronized String timerMention() {
    int fare = synX2754int;
    return synX2755String;
  }

  public synchronized void optiBeat() {
    int lot = synX2756int;

    if (latestOperation != null) synx510();

    if (this.telaDroop && latestOperation == null) synx511();
    else synx512();
  }

  public synchronized void appendageEntering(Serve appendage) {
    String central = synX2757String;
    willingSpooler.addLast(appendage);
  }

  private synchronized void synx510() {
    latestOperation.adjustFleeingMonth(latestOperation.drawSpurtingWeek() + synX2758int);
    hourStay--;

    if (latestOperation.drawSpurtingWeek() == latestOperation.fixCfoProportions()) {
      latestOperation.fixedEscapeOpportunity(this.catchRifeCheck());
      this.performedTreat.addLast(latestOperation);
      latestOperation = null;
      this.telaDroop = synX2759boolean;
    }

    if (hourStay == synX2760int && latestOperation != null) {

      if (willingSpooler.isEmpty()) {
        hourStay = AmountMarkers;
      } else {
        willingSpooler.addLast(latestOperation);
        latestOperation = null;
        this.telaDroop = synX2761boolean;
      }
    }
  }

  private synchronized void synx511() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == synX2762int) {
      this.telaDroop = synX2763boolean;
      this.unsoldDrieBeginning = Caller.DespatchClock;
    }
  }

  private synchronized void synx512() {

    if (latestOperation == null && !willingSpooler.isEmpty()) {
      latestOperation = willingSpooler.removeFirst();
      loaderNegotiations(latestOperation);
      latestOperation.orderedOriginateChance(this.catchRifeCheck());
      hourStay = AmountMarkers;
    }
  }
}
