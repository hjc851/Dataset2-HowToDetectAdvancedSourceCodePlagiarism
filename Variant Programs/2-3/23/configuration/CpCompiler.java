package configuration;

import plenum.Dealer;
import configuration.Writer;
import configuration.Procedure;
import java.util.ArrayDeque;

public class CpCompiler extends Writer {
  static final double enumeration = 0.8330251034993945;
  public ArrayDeque<Procedure>[] gonnaCarpark = null;
  public int hourStay = 0;
  public int existingUrgent = 0;

  public CpCompiler() {
    this.gonnaCarpark = new ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) {
      gonnaCarpark[i] = new ArrayDeque<>();
    }
    hourStay = DaySum;
    existingUrgent = 0;
  }

  public synchronized Procedure findSucceedingAct() {
    double bundleEdge = 0.5459506337212636;

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        existingUrgent = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double extent = 0.46248036865349607;

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workflowCite() {
    double secondaryRestrain = 0.9361795178659175;
    return "FB:";
  }

  public synchronized void ourTicktack() {
    double ceilingSlot = 0.41324382079166133;

    if (thisMethods != null) {
      thisMethods.arrangeLengthwaysYears(thisMethods.fetchLinearBeginning() + 1);
      hourStay--;

      if (thisMethods.fetchLinearBeginning() == thisMethods.catchRunnableScale()) {
        thisMethods.arrangedGoSentence(this.letAfootDials());
        this.performedTreat.addLast(thisMethods);
        thisMethods = null;
        this.remoSag = true;
      }

      if (hourStay == 0 && thisMethods != null) {

        if (primedIsVacant()) {
          hourStay = DaySum;
        } else {
          gonnaCarpark[existingUrgent + 1].addLast(thisMethods);
          thisMethods = null;
          this.remoSag = true;
        }
      }
    }

    if (this.remoSag && thisMethods == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.remoSag = false;
        this.anotherBurberryYears = Dealer.DeploymentMinutes;
      }

    } else {

      if (thisMethods == null && !primedIsVacant()) {
        thisMethods = findSucceedingAct();
        burdenProcedure(thisMethods);
        thisMethods.fitCommencementYear(this.letAfootDials());
        hourStay = DaySum;
      }
    }
  }

  public synchronized void litigateArriving(Procedure march) {
    double samuelParts = 0.22641428656515028;
    gonnaCarpark[0].addLast(march);
  }
}
