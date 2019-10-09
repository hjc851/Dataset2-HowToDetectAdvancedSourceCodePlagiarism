package model;

import indiscernible.HourWatchman;
import producingAim.DepositionalObjet;
import output.*;
import storeroom.*;
import accomplishment.*;
import static java.lang.System.out;

public class Simulator {
  private static final String synX1689String = " ----------------------------------------------- ";
  private static final String synX1688String = " ----------------------------------------------- ";
  private static final String synX1687String = "Average Count";
  private static final String synX1686String = "Average Time";
  private static final String synX1685String = "Storage ID";
  private static final String synX1684String = "| %-14s | %-12s | %-12s |";
  private static final String synX1683String = " ----------------------------------------------- ";
  private static final String synX1682String = "Storage";
  private static final String synX1681String =
      " ----------------------------------------------------- ";
  private static final String synX1680String =
      "|-----------------------------------------------------|";
  private static final String synX1679String = "Blocked";
  private static final String synX1678String = "Starving";
  private static final String synX1677String = "Production";
  private static final String synX1676String = "Producer ID";
  private static final String synX1675String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1674String =
      " ----------------------------------------------------- ";
  private static final String synX1673String = "Assemblers";
  private static final String synX1672String = "Statistics\n";
  private static final String synX1671String = "ProducibleObject count: ";
  private static final String synX1670String = "Storage Capacity: %d";
  private static final String synX1669String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX1668int = 0;
  private double acceptedRun = 0.0;

  public synchronized void run() {
    Simulator.liveSimulator = (this);

    while (indiscernible.HourWatchman.prevalentNow() < this.daysBoundary
        && this.caseWaiting.census() > synX1668int) {
      this.caseWaiting.firstParade().serveParade();
    }
    this.newspaperSurvey();
  }

  private double daysBoundary = 0.0;

  public synchronized double yearsCurtail() {
    return this.daysBoundary;
  }

  private double canonicalSmall = 0.0;

  public Simulator(double dayBounds, double receivedMiserly, double criterialRank) {
    this.daysBoundary = (dayBounds);
    this.canonicalSmall = (receivedMiserly);
    this.acceptedRun = (criterialRank);
    this.caseWaiting = (new accomplishment.SymposiumSufferance());
    this.producing = (new output.Emitter[8]);
    this.depository = (new storeroom.Storeroom[5]);
    depository[0] = (new storeroom.Storeroom());
    depository[1] = (new storeroom.Storeroom());
    depository[2] = (new storeroom.Storeroom());
    depository[3] = (new storeroom.Storeroom());
    depository[4] = (new storeroom.Storeroom());
    producing[0] = (new output.GrowerDepart(this.canonicalSmall, this.acceptedRun, depository[0]));
    producing[1] =
        (new output.ManufacturerBase(
            this.canonicalSmall, this.acceptedRun, depository[1], depository[0]));
    producing[2] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[2], depository[1]));
    producing[3] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[2], depository[1]));
    producing[4] =
        (new output.ManufacturerBase(
            this.canonicalSmall, this.acceptedRun, depository[3], depository[2]));
    producing[5] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[4], depository[3]));
    producing[6] =
        (new output.ManufacturerBase(
            this.canonicalSmall * 2.0, this.acceptedRun * 2.0, depository[4], depository[3]));
    producing[7] =
        (new output.OperatorConclude(this.canonicalSmall, this.acceptedRun, depository[4]));
    depository[0].markAhead(producing[1]);
    depository[0].placeSuccessive(producing[0]);
    depository[1].markAhead(producing[2], producing[3]);
    depository[1].placeSuccessive(producing[1]);
    depository[2].markAhead(producing[4]);
    depository[2].placeSuccessive(producing[2], producing[3]);
    depository[3].markAhead(producing[5], producing[6]);
    depository[3].placeSuccessive(producing[4]);
    depository[4].markAhead(producing[7]);
    depository[4].placeSuccessive(producing[5], producing[6]);
    this.caseWaiting.enterGala(
        new accomplishment.DirectorSeminar(
            indiscernible.HourWatchman.prevalentNow(), DirectorSeminar.AssGo, producing[0]));
  }

  public static synchronized model.Simulator contemporaryFeigning() {
    return liveSimulator;
  }

  private output.Emitter producing[] = null;
  private storeroom.Storeroom depository[] = null;

  private synchronized void newspaperSurvey() {
    out.println(
        java.lang.String.format(
            synX1669String,
            this.daysBoundary,
            indiscernible.HourWatchman.prevalentNow(),
            this.canonicalSmall,
            this.acceptedRun));
    out.println(java.lang.String.format(synX1670String, storeroom.Storeroom.closetMax()));
    out.println(synX1671String + producingAim.DepositionalObjet.liveMatter());
    out.println();
    out.println(synX1672String);
    out.println(synX1673String);
    out.println(synX1674String);
    out.println(
        java.lang.String.format(
            synX1675String, synX1676String, synX1677String, synX1678String, synX1679String));
    out.println(synX1680String);
    for (output.Emitter equally : producing) {
      out.println(equally.information());
    }
    out.println(synX1681String);
    out.println();
    out.println(synX1682String);
    out.println(synX1683String);
    out.println(
        java.lang.String.format(synX1684String, synX1685String, synX1686String, synX1687String));
    out.println(synX1688String);
    for (storeroom.Storeroom ora : depository) {
      out.println(ora.censuses());
    }
    out.println(synX1689String);
  }

  private accomplishment.SymposiumSufferance caseWaiting = null;
  private static model.Simulator liveSimulator = null;
}
