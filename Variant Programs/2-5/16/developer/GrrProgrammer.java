package developer;

import sender.Resellers;
import developer.Programmer;
import developer.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends developer.Programmer {
  private static final boolean synX1340boolean = false;
  private static final int synX1339int = 0;
  private static final boolean synX1338boolean = true;
  private static final int synX1337int = 1;
  private static final int synX1336int = 2;
  private static final int synX1335int = 0;
  private static final boolean synX1334boolean = true;
  private static final int synX1333int = 1;
  private static final String synX1332String = "NRR:";
  public java.util.ArrayDeque<GrrProcedure> willingSpooler;
  public int hourStay;
  public developer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.willingSpooler = (new java.util.ArrayDeque<>());
    hourStay = (Programmer.NowLevel);
  }

  public synchronized String spoolerDistinguish() {
    return synX1332String;
  }

  public synchronized void addTock() {

    if (grrProcedure != null) synx183();

    if (this.malcolmIris && circulatingServe == null) synx184();
    else synx185();
  }

  public synchronized void outgrowthSucceeding(System march) {
    willingSpooler.add(new developer.GrrProcedure(march));
  }

  private synchronized void synx183() {
    grrProcedure.fixGoingThing(grrProcedure.obtainScamperingDays() + synX1333int);
    hourStay--;

    if (grrProcedure.obtainScamperingDays() == grrProcedure.conveyCofounderNumber()) {
      grrProcedure.placedExpireWhen(this.goPrevailingClick());
      this.carriedMechanism.addLast(grrProcedure);
      grrProcedure = (null);
      this.malcolmIris = (synX1334boolean);
    }

    if (hourStay == synX1335int && grrProcedure != null) {

      if (willingSpooler.isEmpty()) {
        hourStay = (grrProcedure.fixChanceNumber());
      } else {

        if (grrProcedure.fixChanceNumber() > synX1336int) {
          grrProcedure.fixThingLibido(grrProcedure.fixChanceNumber() - synX1337int);
        }

        willingSpooler.addLast(grrProcedure);
        grrProcedure = (null);
        this.malcolmIris = (synX1338boolean);
      }
    }
  }

  private synchronized void synx184() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == synX1339int) {
      this.malcolmIris = (synX1340boolean);
      this.anotherBurberryYears = (Resellers.AssignThing);
    }
  }

  private synchronized void synx185() {

    if (grrProcedure == null && !willingSpooler.isEmpty()) {
      grrProcedure = (willingSpooler.removeFirst());
      ladingSue(grrProcedure);
      grrProcedure.determinedInitiateDays(this.goPrevailingClick());
      hourStay = (grrProcedure.fixChanceNumber());
    }
  }

  private synchronized void synx186(int i) {
    prepareSnakes[i] = (new java.util.ArrayDeque<>());
  }
}
