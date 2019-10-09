import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OhioSynchronization extends Planner {
  private java.util.ArrayDeque<Proceeding> ablePecker;
  private java.util.ArrayDeque<Responsible> errorLine;
  private int clockLeft;

  public OhioSynchronization() {
    this.ablePecker = new java.util.ArrayDeque<>();
    this.errorLine = new java.util.ArrayDeque<>();
    clockLeft = BeginningMammoth;
  }

  public void nsoTic() {
    java.util.List<Responsible> imperfections = new java.util.LinkedList<>();
    for (Responsible f : errorLine) {

      if (f.produceCookNow() == this.arriveFlowIndicate()) imperfections.add(f);
    }
    for (Responsible demerit : imperfections) {
      errorLine.remove(demerit);
      alternativesProgram.summateTab(
          new Webpage(
              demerit.obtainOutgrowth().fixOrders().peek(),
              demerit.obtainOutgrowth().haveHandle(),
              0),
          demerit.obtainOutgrowth());

      if (!ablePecker.contains(demerit.obtainOutgrowth())) {
        this.outboundProceeding(demerit.obtainOutgrowth());
      }
    }

    if (typicalProceedings != null) {
      clockLeft--;

      if (typicalProceedings.isEnded()) {
        typicalProceedings.determineWithdrawBeginning(this.arriveFlowIndicate());
        this.carriedMechanism.addLast(typicalProceedings);
        typicalProceedings = null;
      }

      if (clockLeft == 0 && typicalProceedings != null) {

        if (ablePecker.isEmpty()) {
          clockLeft = BeginningMammoth;
        } else {
          this.outboundProceeding(typicalProceedings);
          typicalProceedings = null;
        }
      }
    }

    if (typicalProceedings == null && !ablePecker.isEmpty()) {
      typicalProceedings = this.primedProcedure();
      clockLeft = BeginningMammoth;
    }

    this.tallyAgainDemands();
  }

  public void outboundProceeding(Proceeding method) {
    ablePecker.addLast(method);
  }

  public Proceeding primedProcedure() {
    return ablePecker.removeFirst();
  }

  private void tallyAgainDemands() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!alternativesProgram.stopComplaint(this.typicalProceedings)) {
      this.forwardedFrontAccountable();
      clockLeft = BeginningMammoth;

      if (!ablePecker.isEmpty()) {
        typicalProceedings = primedProcedure();
      } else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.procedureFutureAsking();
  }

  private void forwardedFrontAccountable() {
    Responsible f = new Responsible(this.arriveFlowIndicate(), typicalProceedings);
    errorLine.add(f);
    typicalProceedings.obtainDemerit().add(f);
  }
}
