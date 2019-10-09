import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OhioSynchronization extends Spreadsheet {
  private ArrayDeque<Outgrowth> ablePecker;
  private ArrayDeque<Defective> wrongJumping;
  private int dayOdd;

  public OhioSynchronization() {
    this.ablePecker = new ArrayDeque<>();
    this.wrongJumping = new ArrayDeque<>();
    dayOdd = YearsSize;
  }

  public void optiBeat() {
    List<Defective> error = new LinkedList<>();
    for (Defective f : wrongJumping) {

      if (f.startAbleMinutes() == this.obtainLiveTic()) error.add(f);
    }
    for (Defective shortcoming : error) {
      wrongJumping.remove(shortcoming);
      switchApproach.injectLayouts(
          new Layouts(
              shortcoming.drawPhase().findBespeak().peek(),
              shortcoming.drawPhase().receiveCard(),
              0),
          shortcoming.drawPhase());

      if (!ablePecker.contains(shortcoming.drawPhase())) {
        this.entryPhase(shortcoming.drawPhase());
      }
    }

    if (latestOperation != null) {
      dayOdd--;

      if (latestOperation.isEnded()) {
        latestOperation.arrangeEgressYears(this.obtainLiveTic());
        this.constructedMethodology.addLast(latestOperation);
        latestOperation = null;
      }

      if (dayOdd == 0 && latestOperation != null) {

        if (ablePecker.isEmpty()) {
          dayOdd = YearsSize;
        } else {
          this.entryPhase(latestOperation);
          latestOperation = null;
        }
      }
    }

    if (latestOperation == null && !ablePecker.isEmpty()) {
      latestOperation = this.quickAppendage();
      dayOdd = YearsSize;
    }

    this.passAdjacentAsked();
  }

  public void entryPhase(Outgrowth sue) {
    ablePecker.addLast(sue);
  }

  public Outgrowth quickAppendage() {
    return ablePecker.removeFirst();
  }

  private void passAdjacentAsked() {

    if (this.latestOperation == null) {
      return;
    }

    while (!switchApproach.correspondRequisition(this.latestOperation)) {
      this.resendPaperShortcoming();
      dayOdd = YearsSize;

      if (!ablePecker.isEmpty()) {
        latestOperation = quickAppendage();
      } else {
        latestOperation = null;
        return;
      }
    }
    latestOperation.formalitiesComeMotions();
  }

  private void resendPaperShortcoming() {
    Defective f = new Defective(this.obtainLiveTic(), latestOperation);
    wrongJumping.add(f);
    latestOperation.drawWeaknesses().add(f);
  }
}
