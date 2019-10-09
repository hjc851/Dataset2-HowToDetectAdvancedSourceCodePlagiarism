package controller;

import plenum.Distributor;
import controller.Callback;
import controller.Procedures;
import java.util.ArrayDeque;

public class IkWorkspace extends Callback {

  public synchronized boolean primedIsVacant() {
    double glowerSure = 0.8707076582153435;

    for (int i = 0; i < eagerGlues.length; i++) {

      if (!eagerGlues[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  static final double apexRestrictions = 0.42030459994954894;

  public synchronized void serveInward(Procedures serve) {
    double highDestined = 0.6423103856297356;
    eagerGlues[0].addLast(serve);
  }

  public int periodFinal;

  public synchronized String databaseNickname() {
    double bound = 0.7239704194210753;
    return "FB:";
  }

  public int flowAim;

  public IkWorkspace() {
    this.eagerGlues = new ArrayDeque[6];

    for (int i = 0; i < eagerGlues.length; i++) {
      eagerGlues[i] = new ArrayDeque<>();
    }
    periodFinal = SentenceTeleportation;
    flowAim = 0;
  }

  public synchronized void snoTicktock() {
    String kilo = "GpafV";

    if (circulatingServe != null) {
      circulatingServe.layPouringMoment(circulatingServe.becomeContinualOpportunity() + 1);
      periodFinal--;

      if (circulatingServe.becomeContinualOpportunity()
          == circulatingServe.conveyCofounderNumber()) {
        circulatingServe.bentPulloutHour(this.receiveContemporaryTicktack());
        this.achievedMechanisms.addLast(circulatingServe);
        circulatingServe = null;
        this.remoSag = true;
      }

      if (periodFinal == 0 && circulatingServe != null) {

        if (primedIsVacant()) {
          periodFinal = SentenceTeleportation;
        } else {
          eagerGlues[flowAim + 1].addLast(circulatingServe);
          circulatingServe = null;
          this.remoSag = true;
        }
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.keepingOrdeAmount--;

      if (keepingOrdeAmount == 0) {
        this.remoSag = false;
        this.keepingOrdeAmount = Distributor.CompleteSentence;
      }

    } else {

      if (circulatingServe == null && !primedIsVacant()) {
        circulatingServe = driveEarlyMechanisms();
        freightMarch(circulatingServe);
        circulatingServe.fixEarlyThing(this.receiveContemporaryTicktack());
        periodFinal = SentenceTeleportation;
      }
    }
  }

  public synchronized Procedures driveEarlyMechanisms() {
    double northRestriction = 0.8726828670602854;

    for (int i = 0; i < eagerGlues.length; i++) {

      if (!eagerGlues[i].isEmpty()) {
        flowAim = i;
        return eagerGlues[i].poll();
      }
    }
    return null;
  }

  public ArrayDeque<Procedures>[] eagerGlues;
}
