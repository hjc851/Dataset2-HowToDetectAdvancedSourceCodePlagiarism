package developer;

import sender.Resellers;
import developer.Programmer;
import developer.System;
import java.util.ArrayDeque;

public class ConWorkflow extends developer.Programmer {
  private static final boolean synX1353boolean = false;
  private static final int synX1352int = 0;
  private static final boolean synX1351boolean = true;
  private static final int synX1350int = 1;
  private static final int synX1349int = 0;
  private static final boolean synX1348boolean = true;
  private static final int synX1347int = 1;
  private static final int synX1346int = 0;
  private static final String synX1345String = "FB:";
  private static final boolean synX1344boolean = true;
  private static final boolean synX1343boolean = false;
  private static final int synX1342int = 0;
  private static final int synX1341int = 0;
  public ArrayDeque<System>[] prepareSnakes;
  public int monthAdditional;
  public int thisPrioritization;

  public ConWorkflow() {
    this.prepareSnakes = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < prepareSnakes.length) {
        {
          synx186(i);
        }
        i++;
      }
    }
    monthAdditional = (NowLevel);
    thisPrioritization = (0);
  }

  public synchronized developer.System drawSoonPhase() {
    {
      int i = synX1341int;

      while (i < prepareSnakes.length) {
        {
          {
            if (!prepareSnakes[i].isEmpty()) {
              thisPrioritization = (i);
              return prepareSnakes[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = synX1342int;

      while (i < prepareSnakes.length) {
        {
          {
            if (!prepareSnakes[i].isEmpty()) {
              return synX1343boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1344boolean;
  }

  public synchronized String spoolerDistinguish() {
    return synX1345String;
  }

  public synchronized void addTock() {

    if (circulatingServe != null) synx187();

    if (this.malcolmIris && circulatingServe == null) synx188();
    else synx189();
  }

  public synchronized void outgrowthSucceeding(System mechanism) {
    prepareSnakes[synX1346int].addLast(mechanism);
  }

  private synchronized void synx187() {
    circulatingServe.fixGoingThing(circulatingServe.obtainScamperingDays() + synX1347int);
    monthAdditional--;

    if (circulatingServe.obtainScamperingDays() == circulatingServe.conveyCofounderNumber()) {
      circulatingServe.placedExpireWhen(this.goPrevailingClick());
      this.carriedMechanism.addLast(circulatingServe);
      circulatingServe = (null);
      this.malcolmIris = (synX1348boolean);
    }

    if (monthAdditional == synX1349int && circulatingServe != null) {

      if (primedIsVacant()) {
        monthAdditional = (NowLevel);
      } else {
        prepareSnakes[thisPrioritization + synX1350int].addLast(circulatingServe);
        circulatingServe = (null);
        this.malcolmIris = (synX1351boolean);
      }
    }
  }

  private synchronized void synx188() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == synX1352int) {
      this.malcolmIris = (synX1353boolean);
      this.anotherBurberryYears = (Resellers.AssignThing);
    }
  }

  private synchronized void synx189() {

    if (circulatingServe == null && !primedIsVacant()) {
      circulatingServe = (drawSoonPhase());
      ladingSue(circulatingServe);
      circulatingServe.determinedInitiateDays(this.goPrevailingClick());
      monthAdditional = (NowLevel);
    }
  }
}
