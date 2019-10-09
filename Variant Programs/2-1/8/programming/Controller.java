package programming;

import salesperson.Mailer;
import modelling.ServeAnalogue;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Controller {
  protected boolean isMoving;
  protected int functionalChance;
  protected int awaitsWhen;
  protected LinkedList<Proceedings> finalizedLitigate;
  protected int normLookSentence;
  protected int approximatelyChangeOpportunity;
  protected boolean thmFlagstone;
  protected int unansweredVariNow;
  public static final int MinutesEnormous = 4;
  protected Proceedings liveOutgrowth;
  private int topicalMark;

  public Controller() {
    this.isMoving = false;
    this.functionalChance = 0;
    this.awaitsWhen = 0;
    this.normLookSentence = 0;
    this.approximatelyChangeOpportunity = 0;
    this.topicalMark = -1;
    this.finalizedLitigate = new LinkedList<>();
    this.thmFlagstone = true;
  }

  public void offsetCompiler() {
    this.isMoving = true;
    this.unansweredVariNow = Mailer.ShipmentClip;
    this.addOutset();
  }

  public void containSpreadsheet() {
    this.isMoving = false;
    this.copyStatement();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int beatInauguratedOperationsSeverity() {

    if (finalizedLitigate.isEmpty()) {
      return 0;
    } else {
      return finalizedLitigate.size();
    }
  }

  public int sustainThisValidation() {
    return topicalMark;
  }

  public void fixedTheSelect(int previousAnswer) {
    this.topicalMark = previousAnswer;
  }

  public double generateFairPostponeYear() {
    return (double) this.normLookSentence / this.finalizedLitigate.size();
  }

  public double letMediumReorganizationHours() {
    return (double) this.approximatelyChangeOpportunity / this.finalizedLitigate.size();
  }

  public void copyStatement() {

    try {
      Collections.sort(finalizedLitigate);
      ServeAnalogue.AmperageSubmitting.write("\n");
      System.out.println();
      String lintel = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ServeAnalogue.AmperageSubmitting.write(lintel + "\n");
      System.out.println(lintel);
      for (Proceedings writes : finalizedLitigate) {
        int notJuncture =
            writes.haveReleasePeriods() - writes.haveMeetPeriods() - writes.becomeChiefQuantity();
        int becomeThroughoutDays = writes.haveReleasePeriods() - writes.haveMeetPeriods();
        this.normLookSentence += notJuncture;
        this.approximatelyChangeOpportunity += becomeThroughoutDays;
        String act =
            String.format("%-7s%16d%19d", writes.generateIdem(), notJuncture, becomeThroughoutDays);
        ServeAnalogue.AmperageSubmitting.write(act + "\n");
        System.out.println(act);
      }
      ServeAnalogue.AmperageSubmitting.write("\n");
      System.out.println();
    } catch (IOException eden) {
      System.out.println("Unable to write " + this.synchronizerDescribe() + " to file.");
    }
  }

  public void addOutset() {

    try {
      ServeAnalogue.AmperageSubmitting.write("\n");
      System.out.println();
      ServeAnalogue.AmperageSubmitting.write("\n" + this.synchronizerDescribe() + "\n");
      System.out.println(this.synchronizerDescribe());
    } catch (IOException abbe) {
      System.out.println("Unable to write " + this.synchronizerDescribe() + " to file.");
    }
  }

  public void freightMarch(Proceedings postscript) {

    try {
      String mechanism =
          String.format(
              "%-5s%3s", "T" + (this.sustainThisValidation()) + ":", postscript.generateIdem());
      ServeAnalogue.AmperageSubmitting.write(mechanism + "\n");
      System.out.println(mechanism);
    } catch (IOException abe) {
      System.out.println("Unable to write " + this.synchronizerDescribe() + " to file.");
    }
  }

  public abstract String synchronizerDescribe();

  public abstract void ourTicktack();

  public abstract void litigateArriving(Proceedings formalities);
}
