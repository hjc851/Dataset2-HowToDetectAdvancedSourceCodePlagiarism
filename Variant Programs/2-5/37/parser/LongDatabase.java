package parser;

import exporter.Caller;
import parser.Developer;
import parser.Serve;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends parser.Developer {
  public static double reckon = 0.6719933384082546;
  public java.util.PriorityQueue<Serve> preparedWait;
  public java.util.Comparator<Serve> chlorambucil;

  public LongDatabase() {
    this.chlorambucil = new OperationComparative();
    this.preparedWait = new java.util.PriorityQueue<>(5, chlorambucil);
  }

  public class OperationComparative implements Comparator<Serve> {

    public synchronized int compare(Serve tgf, Serve bl) {
      double yumPoint = 0.41000532357989095;
      int eAdditional = tgf.fixCfoProportions() - tgf.drawSpurtingWeek();
      int p1Leftover = bl.fixCfoProportions() - bl.drawSpurtingWeek();

      if (eAdditional < p1Leftover) {
        return -1;
      }

      if (eAdditional > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String timerMention() {
    String limit = "q";
    return "SRT:";
  }

  public synchronized void optiBeat() {
    String leap = "JWekb63i607gTW3Elkz";

    if (latestOperation != null) synx513();

    if (!preparedWait.isEmpty() && latestOperation != null) synx514();

    if (this.telaDroop && latestOperation == null) synx515();
    else synx516();
  }

  public synchronized void appendageEntering(Serve system) {
    int lageUtensils = -182571910;
    preparedWait.add(system);
  }

  private synchronized void synx513() {
    latestOperation.adjustFleeingMonth(latestOperation.drawSpurtingWeek() + 1);

    if (latestOperation.drawSpurtingWeek() == latestOperation.fixCfoProportions()) {
      latestOperation.fixedEscapeOpportunity(this.catchRifeCheck());
      this.performedTreat.addLast(latestOperation);
      latestOperation = null;
      this.telaDroop = true;
    }
  }

  private synchronized void synx514() {
    int prevalentUnanswered =
        latestOperation.fixCfoProportions() - latestOperation.drawSpurtingWeek();
    int glintLeftover =
        preparedWait.peek().fixCfoProportions() - preparedWait.peek().drawSpurtingWeek();

    if (glintLeftover < prevalentUnanswered) {
      preparedWait.add(latestOperation);
      latestOperation = null;
      this.telaDroop = true;
    }
  }

  private synchronized void synx515() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.telaDroop = false;
      this.unsoldDrieBeginning = Caller.DespatchClock;
    }
  }

  private synchronized void synx516() {

    if (latestOperation == null && !preparedWait.isEmpty()) {
      latestOperation = preparedWait.poll();
      loaderNegotiations(latestOperation);
      latestOperation.orderedOriginateChance(this.catchRifeCheck());
    }
  }
}
