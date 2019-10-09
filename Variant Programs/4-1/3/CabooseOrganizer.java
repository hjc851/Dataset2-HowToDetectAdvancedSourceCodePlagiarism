import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CabooseOrganizer extends Spreadsheet {
  private ArrayDeque<Negotiations> intelligentBraid;
  private ArrayDeque<Culpability> culpabilityConvoy;
  private int sentenceUnexpended;

  public CabooseOrganizer() {
    this.intelligentBraid = new ArrayDeque<>();
    this.culpabilityConvoy = new ArrayDeque<>();
    sentenceUnexpended = ChanceNumber;
  }

  public void snoTicktock() {
    List<Culpability> flaws = new LinkedList<>();
    for (Culpability f : culpabilityConvoy) {

      if (f.receiveWaitingMoment() == this.findActualRetick()) flaws.add(f);
    }
    for (Culpability accountable : flaws) {
      culpabilityConvoy.remove(accountable);
      substitutionPolicies.supplySummary(
          new Annexes(
              accountable.obtainOutgrowth().makeQueries().peek(),
              accountable.obtainOutgrowth().receiveCard(),
              0),
          accountable.obtainOutgrowth());

      if (!intelligentBraid.contains(accountable.obtainOutgrowth())) {
        this.arrivingLitigate(accountable.obtainOutgrowth());
      }
    }

    if (theMethodology != null) {
      sentenceUnexpended--;

      if (theMethodology.isEnded()) {
        theMethodology.prepareIssueNow(this.findActualRetick());
        this.performedTreat.addLast(theMethodology);
        theMethodology = null;
      }

      if (sentenceUnexpended == 0 && theMethodology != null) {

        if (intelligentBraid.isEmpty()) {
          sentenceUnexpended = ChanceNumber;
        } else {
          this.arrivingLitigate(theMethodology);
          theMethodology = null;
        }
      }
    }

    if (theMethodology == null && !intelligentBraid.isEmpty()) {
      theMethodology = this.availableSummons();
      sentenceUnexpended = ChanceNumber;
    }

    this.moveLastSuggestion();
  }

  public void arrivingLitigate(Negotiations methodology) {
    intelligentBraid.addLast(methodology);
  }

  public Negotiations availableSummons() {
    return intelligentBraid.removeFirst();
  }

  private void moveLastSuggestion() {

    if (this.theMethodology == null) {
      return;
    }

    while (!substitutionPolicies.ensureAppeals(this.theMethodology)) {
      this.airTabFaulty();
      sentenceUnexpended = ChanceNumber;

      if (!intelligentBraid.isEmpty()) {
        theMethodology = availableSummons();
      } else {
        theMethodology = null;
        return;
      }
    }
    theMethodology.operationFollowingPetition();
  }

  private void airTabFaulty() {
    Culpability f = new Culpability(this.findActualRetick(), theMethodology);
    culpabilityConvoy.add(f);
    theMethodology.haveFlaws().add(f);
  }
}
