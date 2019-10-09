import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApDatabase extends Multitasking {
  private ArrayDeque<Formalities> wantGlue;
  private ArrayDeque<Malfunction> breakSufferance;
  private int whenLeaving;

  public ApDatabase() {
    this.wantGlue = new ArrayDeque<>();
    this.breakSufferance = new ArrayDeque<>();
    whenLeaving = YearSurface;
  }

  public void nbsClick() {
    List<Malfunction> deficiencies = new LinkedList<>();
    for (Malfunction f : breakSufferance) {

      if (f.makeFitDay() == this.producePrevalentScore()) deficiencies.add(f);
    }
    for (Malfunction criticize : deficiencies) {
      breakSufferance.remove(criticize);
      substituteStrategic.supplySummary(
          new Layout(
              criticize.bringWork().takeInquiries().peek(), criticize.bringWork().goQuod(), 0),
          criticize.bringWork());

      if (!wantGlue.contains(criticize.bringWork())) {
        this.futureMarch(criticize.bringWork());
      }
    }

    if (latestOperation != null) {
      whenLeaving--;

      if (latestOperation.isEnded()) {
        latestOperation.placedExpireWhen(this.producePrevalentScore());
        this.fulfilledMethod.addLast(latestOperation);
        latestOperation = null;
      }

      if (whenLeaving == 0 && latestOperation != null) {

        if (wantGlue.isEmpty()) {
          whenLeaving = YearSurface;
        } else {
          this.futureMarch(latestOperation);
          latestOperation = null;
        }
      }
    }

    if (latestOperation == null && !wantGlue.isEmpty()) {
      latestOperation = this.preppedNegotiations();
      whenLeaving = YearSurface;
    }

    this.leadIncomingProposal();
  }

  public void futureMarch(Formalities proceeding) {
    wantGlue.addLast(proceeding);
  }

  public Formalities preppedNegotiations() {
    return wantGlue.removeFirst();
  }

  private void leadIncomingProposal() {

    if (this.latestOperation == null) {
      return;
    }

    while (!substituteStrategic.verificationAsking(this.latestOperation)) {
      this.institutionalizeSectionCulpability();
      whenLeaving = YearSurface;

      if (!wantGlue.isEmpty()) {
        latestOperation = preppedNegotiations();
      } else {
        latestOperation = null;
        return;
      }
    }
    latestOperation.methodsThenCalls();
  }

  private void institutionalizeSectionCulpability() {
    Malfunction f = new Malfunction(this.producePrevalentScore(), latestOperation);
    breakSufferance.add(f);
    latestOperation.developErrors().add(f);
  }
}
