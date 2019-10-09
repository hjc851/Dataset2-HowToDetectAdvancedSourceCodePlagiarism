package programming;

import retailer.Starter;
import programming.Spooler;
import programming.Formalities;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrsDeveloper extends programming.Spooler {
  private java.util.PriorityQueue<Formalities> poisedDipper;
  private java.util.Comparator<Formalities> reference;

  public TrsDeveloper() {
    this.reference = new SystemMatching();
    this.poisedDipper = new java.util.PriorityQueue<>(5, reference);
  }

  private class SystemMatching implements Comparator<Formalities> {

    public int compare(Formalities p3, Formalities g) {
      int hAnother = p3.produceVeepDensity() - p3.makeFlyingDay();
      int ajRetaining = g.produceVeepDensity() - g.makeFlyingDay();

      if (hAnother < ajRetaining) {
        return -1;
      }

      if (hAnother > ajRetaining) {
        return 1;
      }

      return 0;
    }
  }

  public String interfaceCall() {
    return "SRT:";
  }

  public void optiBeat() {

    if (flowProcedures != null) {
      flowProcedures.readyFlyingDay(flowProcedures.makeFlyingDay() + 1);

      if (flowProcedures.makeFlyingDay() == flowProcedures.produceVeepDensity()) {
        flowProcedures.fitDieYear(this.haveCirculatingShudder());
        this.realizedWork.addLast(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }
    }

    if (!poisedDipper.isEmpty() && flowProcedures != null) {
      int theResidual = flowProcedures.produceVeepDensity() - flowProcedures.makeFlyingDay();
      int watchingUnanswered =
          poisedDipper.peek().produceVeepDensity() - poisedDipper.peek().makeFlyingDay();

      if (watchingUnanswered < theResidual) {
        poisedDipper.add(flowProcedures);
        flowProcedures = null;
        this.reckTricolor = true;
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.reckTricolor = false;
        this.anotherBurberryYears = Starter.DispatchedMonth;
      }

    } else {

      if (flowProcedures == null && !poisedDipper.isEmpty()) {
        flowProcedures = poisedDipper.poll();
        warheadMethod(flowProcedures);
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
      }
    }
  }

  public void operationInbound(Formalities outgrowth) {
    poisedDipper.add(outgrowth);
  }
}
