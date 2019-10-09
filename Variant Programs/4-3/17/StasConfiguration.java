import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StasConfiguration extends Outliner {
  private java.util.ArrayDeque<Mechanism> happyStopper;
  private java.util.ArrayDeque<Accountable> failuresCola;
  private int weekSurviving;

  public StasConfiguration() {
    this.happyStopper = new java.util.ArrayDeque<>();
    this.failuresCola = new java.util.ArrayDeque<>();
    weekSurviving = OpportunityDramatic;
  }

  public synchronized void bsiShudder() {
    java.util.List<Accountable> defects = new java.util.LinkedList<>();
    for (Accountable f : failuresCola) {

      if (f.conveyHappyAmount() == this.conveyFormerGene()) defects.add(f);
    }
    for (Accountable error : defects) {
      failuresCola.remove(error);
      replacedPlaybook.giveTable(
          new Site(
              error.fetchNegotiations().receiveCalls().peek(),
              error.fetchNegotiations().drawName(),
              0),
          error.fetchNegotiations());

      if (!happyStopper.contains(error.fetchNegotiations())) {
        this.arriveMechanisms(error.fetchNegotiations());
      }
    }

    if (incumbentMarch != null) {
      weekSurviving--;

      if (incumbentMarch.isEnded()) {
        incumbentMarch.arrangedGoSentence(this.conveyFormerGene());
        this.accomplishedProcedure.addLast(incumbentMarch);
        incumbentMarch = null;
      }

      if (weekSurviving == 0 && incumbentMarch != null) {

        if (happyStopper.isEmpty()) {
          weekSurviving = OpportunityDramatic;
        } else {
          this.arriveMechanisms(incumbentMarch);
          incumbentMarch = null;
        }
      }
    }

    if (incumbentMarch == null && !happyStopper.isEmpty()) {
      incumbentMarch = this.poisedProceeding();
      weekSurviving = OpportunityDramatic;
    }

    this.scarperComeMotions();
  }

  public synchronized void arriveMechanisms(Mechanism method) {
    happyStopper.addLast(method);
  }

  public synchronized Mechanism poisedProceeding() {
    return happyStopper.removeFirst();
  }

  private synchronized void scarperComeMotions() {

    if (this.incumbentMarch == null) {
      return;
    }

    while (!replacedPlaybook.determineAppeal(this.incumbentMarch)) {
      this.commitWebpageFlaw();
      weekSurviving = OpportunityDramatic;

      if (!happyStopper.isEmpty()) {
        incumbentMarch = poisedProceeding();
      } else {
        incumbentMarch = null;
        return;
      }
    }
    incumbentMarch.formalitiesComeMotions();
  }

  private synchronized void commitWebpageFlaw() {
    Accountable f = new Accountable(this.conveyFormerGene(), incumbentMarch);
    failuresCola.add(f);
    incumbentMarch.takeBreak().add(f);
  }
}
