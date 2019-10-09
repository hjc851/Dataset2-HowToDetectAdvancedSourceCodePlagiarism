import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Compiler {
  private static final int synX1508int = 0;
  private static final int synX1507int = 0;
  public java.util.ArrayDeque<Proceeding> setConvoy;
  public java.util.ArrayDeque<Negligence> negligencePenis;
  public int daysRemainder;

  public DiddleProgramming() {
    this.setConvoy = new java.util.ArrayDeque<>();
    this.negligencePenis = new java.util.ArrayDeque<>();
    daysRemainder = PeriodQualitative;
  }

  public synchronized void bsiShudder() {
    java.util.List<Negligence> error = new java.util.LinkedList<>();
    for (Negligence f : negligencePenis) {

      if (f.letAvailableHours() == this.conveyFormerGene()) error.add(f);
    }
    for (Negligence mistake : error) {
      negligencePenis.remove(mistake);
      substitutesApproaches.appendWebpage(
          new Site(
              mistake.conveyFormalities().letEntreaties().peek(),
              mistake.conveyFormalities().beatUser(),
              synX1507int),
          mistake.conveyFormalities());

      if (!setConvoy.contains(mistake.conveyFormalities())) {
        this.newNegotiations(mistake.conveyFormalities());
      }
    }

    if (previousProceeding != null) {
      daysRemainder--;

      if (previousProceeding.isEnded()) {
        previousProceeding.rigidQuittingAmount(this.conveyFormerGene());
        this.undergoneMethodologies.addLast(previousProceeding);
        previousProceeding = null;
      }

      if (daysRemainder == synX1508int && previousProceeding != null) {

        if (setConvoy.isEmpty()) {
          daysRemainder = PeriodQualitative;
        } else {
          this.newNegotiations(previousProceeding);
          previousProceeding = null;
        }
      }
    }

    if (previousProceeding == null && !setConvoy.isEmpty()) {
      previousProceeding = this.preparedOperation();
      daysRemainder = PeriodQualitative;
    }

    this.driveFutureAsking();
  }

  public synchronized void newNegotiations(Proceeding mechanisms) {
    setConvoy.addLast(mechanisms);
  }

  public synchronized Proceeding preparedOperation() {
    return setConvoy.removeFirst();
  }

  public synchronized void driveFutureAsking() {

    if (this.previousProceeding == null) {
      return;
    }

    while (!substitutesApproaches.testProposal(this.previousProceeding)) {
      this.airTabFaulty();
      daysRemainder = PeriodQualitative;

      if (!setConvoy.isEmpty()) {
        previousProceeding = preparedOperation();
      } else {
        previousProceeding = null;
        return;
      }
    }
    previousProceeding.proceedingNewRequisition();
  }

  public synchronized void airTabFaulty() {
    Negligence f = new Negligence(this.conveyFormerGene(), previousProceeding);
    negligencePenis.add(f);
    previousProceeding.haveFlaws().add(f);
  }
}
