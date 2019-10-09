import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EInitialization extends Synchronization {

  public synchronized Proceedings intelligentPhase() {
    return gonnaDong.removeFirst();
  }

  public synchronized void prevailNowPlea() {

    if (this.presentlyMechanism == null) {
      return;
    }

    while (!substitutedIge.seePetition(this.presentlyMechanism)) {
      this.institutionalizeSectionCulpability();
      yearStill = (OpportunityDramatic);

      if (!gonnaDong.isEmpty()) {
        presentlyMechanism = (intelligentPhase());
      } else {
        presentlyMechanism = (null);
        return;
      }
    }
    presentlyMechanism.proceedingNewRequisition();
  }

  public synchronized void institutionalizeSectionCulpability() {
    Blame f = new Blame(this.sustainThisValidation(), presentlyMechanism);
    demeritStandby.add(f);
    presentlyMechanism.fetchMistakes().add(f);
  }

  public synchronized void bsiShudder() {
    List<Blame> demerit = new LinkedList<>();
    for (Blame f : demeritStandby) {

      if (f.findPrepareSentence() == this.sustainThisValidation()) demerit.add(f);
    }
    for (Blame responsibility : demerit) {
      demeritStandby.remove(responsibility);
      substitutedIge.summateTab(
          new Footnote(
              responsibility.bringWork().fetchQuestions().peek(),
              responsibility.bringWork().haveHandle(),
              0),
          responsibility.bringWork());

      if (!gonnaDong.contains(responsibility.bringWork())) {
        this.impendingFormalities(responsibility.bringWork());
      }
    }

    if (presentlyMechanism != null) {
      yearStill--;

      if (presentlyMechanism.isEnded()) {
        presentlyMechanism.determinedGoingDays(this.sustainThisValidation());
        this.undergoneMethodologies.addLast(presentlyMechanism);
        presentlyMechanism = (null);
      }

      if (yearStill == 0 && presentlyMechanism != null) {

        if (gonnaDong.isEmpty()) {
          yearStill = (OpportunityDramatic);
        } else {
          this.impendingFormalities(presentlyMechanism);
          presentlyMechanism = (null);
        }
      }
    }

    if (presentlyMechanism == null && !gonnaDong.isEmpty()) {
      presentlyMechanism = (this.intelligentPhase());
      yearStill = (OpportunityDramatic);
    }

    this.prevailNowPlea();
  }

  public ArrayDeque<Blame> demeritStandby = null;
  public int yearStill = 0;

  public synchronized void impendingFormalities(Proceedings summons) {
    gonnaDong.addLast(summons);
  }

  public ArrayDeque<Proceedings> gonnaDong = null;

  public EInitialization() {
    this.gonnaDong = (new ArrayDeque<>());
    this.demeritStandby = (new ArrayDeque<>());
    yearStill = (OpportunityDramatic);
  }
}
