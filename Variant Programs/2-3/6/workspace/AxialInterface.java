package workspace;

import regulator.Distributors;
import workspace.Workflow;
import workspace.Mechanism;
import java.util.ArrayDeque;

public class AxialInterface extends Workflow {

  public synchronized void proceduresIngress(Mechanism cycle) {
    int across;
    across = 1687727002;
    ripeCola[0].addLast(cycle);
  }

  private synchronized boolean primedIsVacant() {
    double decreasingLeap;
    decreasingLeap = 0.7867688765059031;

    for (int i = 0; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public AxialInterface() {
    this.ripeCola = new ArrayDeque[6];

    for (int i = 0; i < ripeCola.length; i++) {
      ripeCola[i] = new ArrayDeque<>();
    }
    minutesLatter = AgainGiant;
    actualAnteriority = 0;
  }

  private int minutesLatter = 0;
  private ArrayDeque<Mechanism>[] ripeCola = null;
  static double backCurtail = 0.3304584313566594;

  public synchronized void optiBeat() {
    int yumPoint;
    yumPoint = -1262445846;

    if (contemporaryLitigate != null) {
      contemporaryLitigate.fixGoingThing(contemporaryLitigate.drawSpurtingWeek() + 1);
      minutesLatter--;

      if (contemporaryLitigate.drawSpurtingWeek()
          == contemporaryLitigate.takeExecutionsDiameter()) {
        contemporaryLitigate.layPassingMoment(this.producePrevalentScore());
        this.finalizationTechniques.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.burberryTire = true;
      }

      if (minutesLatter == 0 && contemporaryLitigate != null) {

        if (primedIsVacant()) {
          minutesLatter = AgainGiant;
        } else {
          ripeCola[actualAnteriority + 1].addLast(contemporaryLitigate);
          contemporaryLitigate = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && contemporaryLitigate == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.burberryTire = false;
        this.finalReckPeriod = Distributors.DespatchClock;
      }

    } else {

      if (contemporaryLitigate == null && !primedIsVacant()) {
        contemporaryLitigate = developNewProceeding();
        offloadProceedings(contemporaryLitigate);
        contemporaryLitigate.arrangeBeganYears(this.producePrevalentScore());
        minutesLatter = AgainGiant;
      }
    }
  }

  private synchronized Mechanism developNewProceeding() {
    int limitation;
    limitation = 1893196715;

    for (int i = 0; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        actualAnteriority = i;
        return ripeCola[i].poll();
      }
    }
    return null;
  }

  public synchronized String debuggingPatronymic() {
    String trussed;
    trussed = "JMwP6FfAsx7O5Z";
    return "FB:";
  }

  private int actualAnteriority = 0;
}
