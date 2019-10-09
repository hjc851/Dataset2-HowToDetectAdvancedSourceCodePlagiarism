import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GpaInterface extends Organizer {
  private ArrayDeque<Summons> cookCue;
  private ArrayDeque<Anomaly> mistakeWait;
  private int periodFinal;

  public GpaInterface() {
    this.cookCue = new ArrayDeque<>();
    this.mistakeWait = new ArrayDeque<>();
    periodFinal = AmountMarkers;
  }

  public void nsoTic() {
    List<Anomaly> problems = new LinkedList<>();
    for (Anomaly f : mistakeWait) {

      if (f.produceCookNow() == this.catchRifeCheck()) problems.add(f);
    }
    for (Anomaly blame : problems) {
      mistakeWait.remove(blame);
      backupFocused.summateTab(
          new Homepage(blame.haveServe().fetchQuestions().peek(), blame.haveServe().beatUser(), 0),
          blame.haveServe());

      if (!cookCue.contains(blame.haveServe())) {
        this.enteringAppendage(blame.haveServe());
      }
    }

    if (circulatingServe != null) {
      periodFinal--;

      if (circulatingServe.isEnded()) {
        circulatingServe.situatedMoveMinutes(this.catchRifeCheck());
        this.accomplishedProcedure.addLast(circulatingServe);
        circulatingServe = null;
      }

      if (periodFinal == 0 && circulatingServe != null) {

        if (cookCue.isEmpty()) {
          periodFinal = AmountMarkers;
        } else {
          this.enteringAppendage(circulatingServe);
          circulatingServe = null;
        }
      }
    }

    if (circulatingServe == null && !cookCue.isEmpty()) {
      circulatingServe = this.fixProcedures();
      periodFinal = AmountMarkers;
    }

    this.ramSecondDecision();
  }

  public void enteringAppendage(Summons proceeding) {
    cookCue.addLast(proceeding);
  }

  public Summons fixProcedures() {
    return cookCue.removeFirst();
  }

  private void ramSecondDecision() {

    if (this.circulatingServe == null) {
      return;
    }

    while (!backupFocused.verificationAsking(this.circulatingServe)) {
      this.mailVarletMistake();
      periodFinal = AmountMarkers;

      if (!cookCue.isEmpty()) {
        circulatingServe = fixProcedures();
      } else {
        circulatingServe = null;
        return;
      }
    }
    circulatingServe.operationFollowingPetition();
  }

  private void mailVarletMistake() {
    Anomaly f = new Anomaly(this.catchRifeCheck(), circulatingServe);
    mistakeWait.add(f);
    circulatingServe.becomeLapses().add(f);
  }
}
