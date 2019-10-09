import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OximeWorkflow extends Initialization {
  public int dayOdd = 0;
  public java.util.ArrayDeque<Failures> wrongJumping = null;
  public java.util.ArrayDeque<Proceedings> preparingReaper = null;

  public OximeWorkflow() {
    this.preparingReaper = (new java.util.ArrayDeque<>());
    this.wrongJumping = (new java.util.ArrayDeque<>());
    dayOdd = (YearSurface);
  }

  public synchronized void weapMark() {
    java.util.List<Failures> mistakes;
    mistakes = (new java.util.LinkedList<>());
    for (Failures f : wrongJumping) synx359(f, mistakes);
    for (Failures carelessness : mistakes) synx360(carelessness);

    if (latestOperation != null) synx361();

    if (latestOperation == null && !preparingReaper.isEmpty()) synx362();

    this.outpouringTheOrdered();
  }

  public synchronized void inflowingSummons(Proceedings method) {
    preparingReaper.addLast(method);
  }

  public synchronized Proceedings fitMarch() {
    return preparingReaper.removeFirst();
  }

  public synchronized void outpouringTheOrdered() {

    if (this.latestOperation == null) {
      return;
    }

    while (!alternativesProgram.checkerBespeak(this.latestOperation)) {
      this.airTabFaulty();
      dayOdd = (YearSurface);

      if (!preparingReaper.isEmpty()) synx363();
      else {
        latestOperation = (null);
        return;
      }
    }
    latestOperation.workCloseQuest();
  }

  public synchronized void airTabFaulty() {
    Failures f;
    f = (new Failures(this.fixNewTally(), latestOperation));
    wrongJumping.add(f);
    latestOperation.findError().add(f);
  }

  private synchronized void synx359(Failures f, java.util.List<Failures> mistakes) {

    if (f.developPoisedHour() == this.fixNewTally()) mistakes.add(f);
  }

  private synchronized void synx360(Failures carelessness) {
    wrongJumping.remove(carelessness);
    alternativesProgram.totSheet(
        new Homepage(
            carelessness.makeMarch().beatPetitions().peek(),
            carelessness.makeMarch().receiveCard(),
            0),
        carelessness.makeMarch());

    if (!preparingReaper.contains(carelessness.makeMarch())) {
      this.inflowingSummons(carelessness.makeMarch());
    }
  }

  private synchronized void synx361() {
    dayOdd--;

    if (latestOperation.isEnded()) {
      latestOperation.doExodusAgain(this.fixNewTally());
      this.accomplishedProcedure.addLast(latestOperation);
      latestOperation = (null);
    }

    if (dayOdd == 0 && latestOperation != null) {

      if (preparingReaper.isEmpty()) {
        dayOdd = (YearSurface);
      } else {
        this.inflowingSummons(latestOperation);
        latestOperation = (null);
      }
    }
  }

  private synchronized void synx362() {
    latestOperation = (this.fitMarch());
    dayOdd = (YearSurface);
  }

  private synchronized void synx363() {
    latestOperation = (fitMarch());
  }
}
