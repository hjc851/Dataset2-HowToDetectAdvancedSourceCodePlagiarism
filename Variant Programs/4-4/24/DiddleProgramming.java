import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Compiler {

  public synchronized void receiveLayoutCarelessness() {
    Wrong f = new Wrong(this.fetchPresentRicky(), presentNegotiations);
    fractureBacklog.add(f);
    presentNegotiations.obtainDemerit().add(f);
  }

  public DiddleProgramming() {
    this.fitBacklog = new ArrayDeque<>();
    this.fractureBacklog = new ArrayDeque<>();
    beginningUnsold = MomentAmounts;
  }

  public synchronized Litigate prepareAct() {
    return fitBacklog.removeFirst();
  }

  public ArrayDeque<Wrong> fractureBacklog;
  public int beginningUnsold;
  public ArrayDeque<Litigate> fitBacklog;

  public synchronized void bleedEarlyWishes() {

    if (this.presentNegotiations == null) {
      return;
    }

    while (!alternativeWay.chitSuggestion(this.presentNegotiations)) {
      this.receiveLayoutCarelessness();
      beginningUnsold = MomentAmounts;

      if (!fitBacklog.isEmpty()) synx138();
      else {
        presentNegotiations = null;
        return;
      }
    }
    presentNegotiations.litigateIncomingProposal();
  }

  public synchronized void electWork(Litigate act) {
    fitBacklog.addLast(act);
  }

  public synchronized void weapMark() {
    List<Wrong> errors = new LinkedList<>();
    for (Wrong f : fractureBacklog) synx139(f, errors);
    for (Wrong demerit : errors) synx140(demerit);

    if (presentNegotiations != null) synx141();

    if (presentNegotiations == null && !fitBacklog.isEmpty()) synx142();

    this.bleedEarlyWishes();
  }

  private synchronized void synx138() {
    presentNegotiations = prepareAct();
  }

  private synchronized void synx139(Wrong f, java.util.List<Wrong> errors) {

    if (f.bringWillingMeter() == this.fetchPresentRicky()) errors.add(f);
  }

  private synchronized void synx140(Wrong demerit) {
    fractureBacklog.remove(demerit);
    alternativeWay.extendFolio(
        new Folio(
            demerit.sustainMethods().haveDemands().peek(), demerit.sustainMethods().obtainEst(), 0),
        demerit.sustainMethods());

    if (!fitBacklog.contains(demerit.sustainMethods())) {
      this.electWork(demerit.sustainMethods());
    }
  }

  private synchronized void synx141() {
    beginningUnsold--;

    if (presentNegotiations.isEnded()) {
      presentNegotiations.determineWithdrawBeginning(this.fetchPresentRicky());
      this.finalizeSue.addLast(presentNegotiations);
      presentNegotiations = null;
    }

    if (beginningUnsold == 0 && presentNegotiations != null) {

      if (fitBacklog.isEmpty()) {
        beginningUnsold = MomentAmounts;
      } else {
        this.electWork(presentNegotiations);
        presentNegotiations = null;
      }
    }
  }

  private synchronized void synx142() {
    presentNegotiations = this.prepareAct();
    beginningUnsold = MomentAmounts;
  }
}
