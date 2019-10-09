package controller;

import forwarder.Salesperson;
import controller.Parser;
import controller.Cycle;
import java.util.ArrayDeque;

public class EtdDeveloper extends controller.Parser {
  private static final boolean synX110boolean = false;
  private static final int synX109int = 0;
  private static final boolean synX108boolean = true;
  private static final int synX107int = 0;
  private static final boolean synX106boolean = true;
  private static final int synX105int = 1;
  private static final double synX104double = 0.9464297337513683;
  private static final String synX103String = "Z6m47xcyFSb726";
  private static final String synX102String = "RR:";
  private static final String synX101String = "VRzH7kxyvwZ1fF9N";
  public int nowUnanswered;
  public java.util.ArrayDeque<Cycle> fitBacklog;
  public static double sec = 0.27310863493266946;

  public EtdDeveloper() {
    this.fitBacklog = (new java.util.ArrayDeque<>());
    nowUnanswered = (PeriodQualitative);
  }

  public synchronized String organizerList() {
    String kate;
    kate = (synX101String);
    return synX102String;
  }

  public synchronized void weapMark() {
    String best;
    best = (synX103String);

    if (latestOperation != null) synx10();

    if (this.variWaving && latestOperation == null) synx11();
    else synx12();
  }

  public synchronized void formalitiesImpending(Cycle method) {
    double cardinal;
    cardinal = (synX104double);
    fitBacklog.addLast(method);
  }

  private synchronized void synx10() {
    latestOperation.fixGoingThing(latestOperation.becomeContinualOpportunity() + synX105int);
    nowUnanswered--;

    if (latestOperation.becomeContinualOpportunity() == latestOperation.takeExecutionsDiameter()) {
      latestOperation.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(latestOperation);
      latestOperation = (null);
      this.variWaving = (synX106boolean);
    }

    if (nowUnanswered == synX107int && latestOperation != null) {

      if (fitBacklog.isEmpty()) {
        nowUnanswered = (PeriodQualitative);
      } else {
        fitBacklog.addLast(latestOperation);
        latestOperation = (null);
        this.variWaving = (synX108boolean);
      }
    }
  }

  private synchronized void synx11() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX109int) {
      this.variWaving = (synX110boolean);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx12() {

    if (latestOperation == null && !fitBacklog.isEmpty()) {
      latestOperation = (fitBacklog.removeFirst());
      lodePhase(latestOperation);
      latestOperation.prepareOffsetNow(this.fetchPresentRicky());
      nowUnanswered = (PeriodQualitative);
    }
  }
}
