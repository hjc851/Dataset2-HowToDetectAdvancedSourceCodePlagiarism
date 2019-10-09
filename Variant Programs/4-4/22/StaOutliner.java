import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StaOutliner extends Parser {
  public ArrayDeque<Cycle> reluctantCola;
  public ArrayDeque<Wrong> accountableSuspense;
  public int againPending;

  public StaOutliner() {
    this.reluctantCola = new ArrayDeque<>();
    this.accountableSuspense = new ArrayDeque<>();
    againPending = YearSurface;
  }

  public synchronized void bpsRetick() {
    List<Wrong> error = new LinkedList<>();
    for (Wrong f : accountableSuspense) {

      if (f.produceCookNow() == this.letAfootDials()) error.add(f);
    }
    for (Wrong criticize : error) {
      accountableSuspense.remove(criticize);
      alternativesProgram.attachAnnexes(
          new Paper(
              criticize.letSummons().bringQuest().peek(), criticize.letSummons().obtainEst(), 0),
          criticize.letSummons());

      if (!reluctantCola.contains(criticize.letSummons())) {
        this.electWork(criticize.letSummons());
      }
    }

    if (prevailingProcedure != null) {
      againPending--;

      if (prevailingProcedure.isEnded()) {
        prevailingProcedure.layPassingMoment(this.letAfootDials());
        this.realizedWork.addLast(prevailingProcedure);
        prevailingProcedure = null;
      }

      if (againPending == 0 && prevailingProcedure != null) {

        if (reluctantCola.isEmpty()) {
          againPending = YearSurface;
        } else {
          this.electWork(prevailingProcedure);
          prevailingProcedure = null;
        }
      }
    }

    if (prevailingProcedure == null && !reluctantCola.isEmpty()) {
      prevailingProcedure = this.preparingSystem();
      againPending = YearSurface;
    }

    this.tallyAgainDemands();
  }

  public synchronized void electWork(Cycle outgrowth) {
    reluctantCola.addLast(outgrowth);
  }

  public synchronized Cycle preparingSystem() {
    return reluctantCola.removeFirst();
  }

  public synchronized void tallyAgainDemands() {

    if (this.prevailingProcedure == null) {
      return;
    }

    while (!alternativesProgram.lambastMotions(this.prevailingProcedure)) {
      this.mailedFolioLiability();
      againPending = YearSurface;

      if (!reluctantCola.isEmpty()) {
        prevailingProcedure = preparingSystem();
      } else {
        prevailingProcedure = null;
        return;
      }
    }
    prevailingProcedure.methodSecondDecision();
  }

  public synchronized void mailedFolioLiability() {
    Wrong f = new Wrong(this.letAfootDials(), prevailingProcedure);
    accountableSuspense.add(f);
    prevailingProcedure.haveFlaws().add(f);
  }
}
