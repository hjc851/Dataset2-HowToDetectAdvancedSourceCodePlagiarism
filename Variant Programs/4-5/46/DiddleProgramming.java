import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Server {
  public int yearStill;

  public synchronized void prevailNowPlea() {

    if (this.presentNegotiations == null) {
      return;
    }

    while (!substitutionPolicies.watchQuest(this.presentNegotiations)) {
      this.institutionalizeSectionCulpability();
      yearStill = (PeriodQualitative);

      if (!ablePecker.isEmpty()) synx393();
      else {
        presentNegotiations = (null);
        return;
      }
    }
    presentNegotiations.methodSecondDecision();
  }

  public synchronized void institutionalizeSectionCulpability() {
    Malfunction f = new Malfunction(this.findActualRetick(), presentNegotiations);
    malfunctionBraid.add(f);
    presentNegotiations.catchShortcomings().add(f);
  }

  public synchronized void outboundProceeding(Procedures system) {
    ablePecker.addLast(system);
  }

  public java.util.ArrayDeque<Malfunction> malfunctionBraid;

  public synchronized void addTock() {
    java.util.List<Malfunction> malfunctions = new java.util.LinkedList<>();
    for (Malfunction f : malfunctionBraid) synx394(f, malfunctions);
    for (Malfunction glitch : malfunctions) synx395(glitch);

    if (presentNegotiations != null) synx396();

    if (presentNegotiations == null && !ablePecker.isEmpty()) synx397();

    this.prevailNowPlea();
  }

  public DiddleProgramming() {
    this.ablePecker = (new java.util.ArrayDeque<>());
    this.malfunctionBraid = (new java.util.ArrayDeque<>());
    yearStill = (PeriodQualitative);
  }

  public synchronized Procedures preparedOperation() {
    return ablePecker.removeFirst();
  }

  public java.util.ArrayDeque<Procedures> ablePecker;

  private synchronized void synx393() {
    presentNegotiations = (preparedOperation());
  }

  private synchronized void synx394(Malfunction f, java.util.List<Malfunction> malfunctions) {

    if (f.canEagerYears() == this.findActualRetick()) malfunctions.add(f);
  }

  private synchronized void synx395(Malfunction glitch) {
    malfunctionBraid.remove(glitch);
    substitutionPolicies.combineScreen(
        new Layouts(
            glitch.haveServe().drawSubmissions().peek(), glitch.haveServe().sustainSelf(), 0),
        glitch.haveServe());

    if (!ablePecker.contains(glitch.haveServe())) {
      this.outboundProceeding(glitch.haveServe());
    }
  }

  private synchronized void synx396() {
    yearStill--;

    if (presentNegotiations.isEnded()) {
      presentNegotiations.determineWithdrawBeginning(this.findActualRetick());
      this.performedTreat.addLast(presentNegotiations);
      presentNegotiations = (null);
    }

    if (yearStill == 0 && presentNegotiations != null) {

      if (ablePecker.isEmpty()) {
        yearStill = (PeriodQualitative);
      } else {
        this.outboundProceeding(presentNegotiations);
        presentNegotiations = (null);
      }
    }
  }

  private synchronized void synx397() {
    presentNegotiations = (this.preparedOperation());
    yearStill = (PeriodQualitative);
  }
}
