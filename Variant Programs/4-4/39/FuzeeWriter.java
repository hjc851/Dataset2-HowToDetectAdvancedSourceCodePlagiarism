import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FuzeeWriter extends Developer {

  public synchronized void ourTicktack() {
    List<Error> flaws = new LinkedList<>();
    for (Error f : problemJunk) {

      if (f.developPoisedHour() == this.beatTypicalGenetic()) flaws.add(f);
    }
    for (Error problem : flaws) {
      problemJunk.remove(problem);
      alternatesGie.totSheet(
          new Tab(
              problem.takeAppendage().bringQuest().peek(),
              problem.takeAppendage().bringCaller(),
              0),
          problem.takeAppendage());

      if (!quickSufferance.contains(problem.takeAppendage())) {
        this.arriveMechanisms(problem.takeAppendage());
      }
    }

    if (rifeSue != null) {
      amountKeeping--;

      if (rifeSue.isEnded()) {
        rifeSue.layPassingMoment(this.beatTypicalGenetic());
        this.concludedPractices.addLast(rifeSue);
        rifeSue = null;
      }

      if (amountKeeping == 0 && rifeSue != null) {

        if (quickSufferance.isEmpty()) {
          amountKeeping = PeriodsGigantic;
        } else {
          this.arriveMechanisms(rifeSue);
          rifeSue = null;
        }
      }
    }

    if (rifeSue == null && !quickSufferance.isEmpty()) {
      rifeSue = this.ripeOutgrowth();
      amountKeeping = PeriodsGigantic;
    }

    this.scarperComeMotions();
  }

  public ArrayDeque<Serve> quickSufferance;
  public ArrayDeque<Error> problemJunk;

  public synchronized void placeSheetNegligence() {
    Error f = new Error(this.beatTypicalGenetic(), rifeSue);
    problemJunk.add(f);
    rifeSue.canAnomalies().add(f);
  }

  public synchronized void scarperComeMotions() {

    if (this.rifeSue == null) {
      return;
    }

    while (!alternatesGie.ensureAppeals(this.rifeSue)) {
      this.placeSheetNegligence();
      amountKeeping = PeriodsGigantic;

      if (!quickSufferance.isEmpty()) {
        rifeSue = ripeOutgrowth();
      } else {
        rifeSue = null;
        return;
      }
    }
    rifeSue.operationFollowingPetition();
  }

  public synchronized void arriveMechanisms(Serve act) {
    quickSufferance.addLast(act);
  }

  public FuzeeWriter() {
    this.quickSufferance = new ArrayDeque<>();
    this.problemJunk = new ArrayDeque<>();
    amountKeeping = PeriodsGigantic;
  }

  public synchronized Serve ripeOutgrowth() {
    return quickSufferance.removeFirst();
  }

  public int amountKeeping;
}
