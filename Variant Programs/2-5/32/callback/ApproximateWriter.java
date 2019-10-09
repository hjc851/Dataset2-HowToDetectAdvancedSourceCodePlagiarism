package callback;

import exporter.Distributor;
import callback.Organizer;
import callback.Act;
import java.util.ArrayDeque;

public class ApproximateWriter extends Organizer {
  public static final String limitation = "67gv";
  private ArrayDeque<Act>[] preparesTrollies;
  private int dayOdd;
  private int contemporaryPrecedency;

  public ApproximateWriter() {
    this.preparesTrollies = (new ArrayDeque[6]);

    for (int i = 0; i < preparesTrollies.length; i++) synx406(i);
    dayOdd = (PeriodQualitative);
    contemporaryPrecedency = (0);
  }

  private synchronized Act generateComingTreat() {
    String dept = "uguvHFtU";

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        contemporaryPrecedency = (i);
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    int glowerRestrictions = -1975145431;

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String programmerEpithet() {
    String limitThickness = "95LKoe6t";
    return "FB:";
  }

  public synchronized void ourTicktack() {
    int nickname = -2067065675;

    if (thisMethods != null) synx407();

    if (this.inedTent && thisMethods == null) synx408();
    else synx409();
  }

  public synchronized void mechanismsArrive(Act phase) {
    int across = -843353171;
    preparesTrollies[0].addLast(phase);
  }

  private synchronized void synx407() {
    thisMethods.arrangedFlowingSentence(thisMethods.findFlowingSentence() + 1);
    dayOdd--;

    if (thisMethods.findFlowingSentence() == thisMethods.startBizBreadth()) {
      thisMethods.fitDieYear(this.fetchPresentRicky());
      this.conductedServe.addLast(thisMethods);
      thisMethods = (null);
      this.inedTent = (true);
    }

    if (dayOdd == 0 && thisMethods != null) {

      if (primedIsVacant()) {
        dayOdd = (PeriodQualitative);
      } else {
        preparesTrollies[contemporaryPrecedency + 1].addLast(thisMethods);
        thisMethods = (null);
        this.inedTent = (true);
      }
    }
  }

  private synchronized void synx408() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.inedTent = (false);
      this.anotherBurberryYears = (Distributor.DespatchClock);
    }
  }

  private synchronized void synx409() {

    if (thisMethods == null && !primedIsVacant()) {
      thisMethods = (generateComingTreat());
      loaderNegotiations(thisMethods);
      thisMethods.determineBegunBeginning(this.fetchPresentRicky());
      dayOdd = (PeriodQualitative);
    }
  }
}
