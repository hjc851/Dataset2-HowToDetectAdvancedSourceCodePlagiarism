package parser;

import exporter.Caller;
import parser.Developer;
import parser.Serve;
import java.util.ArrayDeque;

public class DcSpreadsheet extends parser.Developer {
  private static final boolean synX2753boolean = false;
  private static final int synX2752int = 0;
  private static final boolean synX2751boolean = true;
  private static final int synX2750int = 1;
  private static final int synX2749int = 0;
  private static final boolean synX2748boolean = true;
  private static final int synX2747int = 1;
  private static final int synX2746int = 0;
  private static final double synX2745double = 0.7096723954856631;
  private static final String synX2744String = "H2aQ8sb13nCxQ2RfiT";
  private static final String synX2743String = "FB:";
  private static final double synX2742double = 0.0470589524444297;
  private static final boolean synX2741boolean = true;
  private static final boolean synX2740boolean = false;
  private static final int synX2739int = 0;
  private static final double synX2738double = 0.648610620417997;
  private static final int synX2737int = 0;
  private static final int synX2736int = -848904122;
  static final double ceilingSlot = 0.5647697330136442;
  public ArrayDeque<Serve>[] preparingRanks;
  public int againPending;
  public int latestAntecedence;

  public DcSpreadsheet() {
    this.preparingRanks = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < preparingRanks.length) {
        {
          synx506(i);
        }
        i++;
      }
    }
    againPending = AmountMarkers;
    latestAntecedence = 0;
  }

  public synchronized parser.Serve drawSoonPhase() {
    int infernalMinimum = synX2736int;
    {
      int i = synX2737int;

      while (i < preparingRanks.length) {
        {
          {
            if (!preparingRanks[i].isEmpty()) {
              latestAntecedence = i;
              return preparingRanks[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double figure = synX2738double;
    {
      int i = synX2739int;

      while (i < preparingRanks.length) {
        {
          {
            if (!preparingRanks[i].isEmpty()) {
              return synX2740boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2741boolean;
  }

  public synchronized String timerMention() {
    double infernalCertain = synX2742double;
    return synX2743String;
  }

  public synchronized void optiBeat() {
    String maximalLength = synX2744String;

    if (latestOperation != null) synx507();

    if (this.telaDroop && latestOperation == null) synx508();
    else synx509();
  }

  public synchronized void appendageEntering(Serve summons) {
    double positionFoods = synX2745double;
    preparingRanks[synX2746int].addLast(summons);
  }

  private synchronized void synx507() {
    latestOperation.adjustFleeingMonth(latestOperation.drawSpurtingWeek() + synX2747int);
    againPending--;

    if (latestOperation.drawSpurtingWeek() == latestOperation.fixCfoProportions()) {
      latestOperation.fixedEscapeOpportunity(this.catchRifeCheck());
      this.performedTreat.addLast(latestOperation);
      latestOperation = null;
      this.telaDroop = synX2748boolean;
    }

    if (againPending == synX2749int && latestOperation != null) {

      if (primedIsVacant()) {
        againPending = AmountMarkers;
      } else {
        preparingRanks[latestAntecedence + synX2750int].addLast(latestOperation);
        latestOperation = null;
        this.telaDroop = synX2751boolean;
      }
    }
  }

  private synchronized void synx508() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == synX2752int) {
      this.telaDroop = synX2753boolean;
      this.unsoldDrieBeginning = Caller.DespatchClock;
    }
  }

  private synchronized void synx509() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = drawSoonPhase();
      loaderNegotiations(latestOperation);
      latestOperation.orderedOriginateChance(this.catchRifeCheck());
      againPending = AmountMarkers;
    }
  }
}
