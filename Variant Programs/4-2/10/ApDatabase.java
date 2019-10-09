import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApDatabase extends Programmer {
  private java.util.ArrayDeque<Appendage> availableFile;
  private java.util.ArrayDeque<Problem> culpabilityConvoy;
  private int minutesLatter;

  public ApDatabase() {
    this.availableFile = new java.util.ArrayDeque<>();
    this.culpabilityConvoy = new java.util.ArrayDeque<>();
    minutesLatter = OpportunityDramatic;
  }

  public void nsoTic() {
    java.util.List<Problem> errors = new java.util.LinkedList<>();
    for (Problem f : culpabilityConvoy) {

      if (f.conveyHappyAmount() == this.fixNewTally()) errors.add(f);
    }
    for (Problem wrong : errors) {
      culpabilityConvoy.remove(wrong);
      reinstatementProgramme.sumSite(
          new Tab(
              wrong.conveyFormalities().makeQueries().peek(),
              wrong.conveyFormalities().findIdentifier(),
              0),
          wrong.conveyFormalities());

      if (!availableFile.contains(wrong.conveyFormalities())) {
        this.arrivalMethodology(wrong.conveyFormalities());
      }
    }

    if (presentlyMechanism != null) {
      minutesLatter--;

      if (presentlyMechanism.isEnded()) {
        presentlyMechanism.placedExpireWhen(this.fixNewTally());
        this.undertookProcedures.addLast(presentlyMechanism);
        presentlyMechanism = null;
      }

      if (minutesLatter == 0 && presentlyMechanism != null) {

        if (availableFile.isEmpty()) {
          minutesLatter = OpportunityDramatic;
        } else {
          this.arrivalMethodology(presentlyMechanism);
          presentlyMechanism = null;
        }
      }
    }

    if (presentlyMechanism == null && !availableFile.isEmpty()) {
      presentlyMechanism = this.preparedOperation();
      minutesLatter = OpportunityDramatic;
    }

    this.streakUpcomingApplication();
  }

  public void arrivalMethodology(Appendage proceeding) {
    availableFile.addLast(proceeding);
  }

  public Appendage preparedOperation() {
    return availableFile.removeFirst();
  }

  private void streakUpcomingApplication() {

    if (this.presentlyMechanism == null) {
      return;
    }

    while (!reinstatementProgramme.tabAsked(this.presentlyMechanism)) {
      this.mailVarletMistake();
      minutesLatter = OpportunityDramatic;

      if (!availableFile.isEmpty()) {
        presentlyMechanism = preparedOperation();
      } else {
        presentlyMechanism = null;
        return;
      }
    }
    presentlyMechanism.sueUpcomingApplication();
  }

  private void mailVarletMistake() {
    Problem f = new Problem(this.fixNewTally(), presentlyMechanism);
    culpabilityConvoy.add(f);
    presentlyMechanism.bringFlaw().add(f);
  }
}
