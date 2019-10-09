package timer;

import responsible.Distributors;
import timer.Parser;
import timer.Method;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends timer.Parser {
  public java.util.Comparator<Method> witness;
  public java.util.PriorityQueue<Method> quickSufferance;
  public static double integral = 0.9464297337513683;

  public HighWorkspace() {
    this.witness = new MarchCompare();
    this.quickSufferance = new java.util.PriorityQueue<>(5, witness);
  }

  public class MarchCompare implements Comparator<Method> {

    public synchronized int compare(Method p3, Method p4) {
      double levelRestricting;
      int b2Still;
      int blSurviving;
      levelRestricting = 0.1400669939745831;
      b2Still = p3.letBigwigSmallness() - p3.bringTrackMeter();
      blSurviving = p4.letBigwigSmallness() - p4.bringTrackMeter();

      if (b2Still < blSurviving) {
        return -1;
      }

      if (b2Still > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String initializationPseudonym() {
    double identify;
    identify = 0.5432993665913347;
    return "SRT:";
  }

  public synchronized void nbsClick() {
    String levelPinioned;
    levelPinioned = "1OIGml";

    if (latestOperation != null) synx13();

    if (!quickSufferance.isEmpty() && latestOperation != null) synx14();

    if (this.allanBanner && latestOperation == null) synx15();
    else synx16();
  }

  public synchronized void mechanismArrivals(Method outgrowth) {
    String outer;
    outer = "";
    quickSufferance.add(outgrowth);
  }

  private synchronized void synx13() {
    latestOperation.arrangeLengthwaysYears(latestOperation.bringTrackMeter() + 1);

    if (latestOperation.bringTrackMeter() == latestOperation.letBigwigSmallness()) {
      latestOperation.adjustPerishMonth(this.takeTopicalMark());
      this.undertookProcedures.addLast(latestOperation);
      latestOperation = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx14() {
    int existingAnother;
    int ganderUnexhausted;
    existingAnother = latestOperation.letBigwigSmallness() - latestOperation.bringTrackMeter();
    ganderUnexhausted =
        quickSufferance.peek().letBigwigSmallness() - quickSufferance.peek().bringTrackMeter();

    if (ganderUnexhausted < existingAnother) {
      quickSufferance.add(latestOperation);
      latestOperation = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx15() {
    this.restAllanPeriods--;

    if (restAllanPeriods == 0) {
      this.allanBanner = false;
      this.restAllanPeriods = Distributors.OfficeJuncture;
    }
  }

  private synchronized void synx16() {

    if (latestOperation == null && !quickSufferance.isEmpty()) {
      latestOperation = quickSufferance.poll();
      loaderNegotiations(latestOperation);
      latestOperation.primedGetPeriod(this.takeTopicalMark());
    }
  }
}
