import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FuzeeWriter extends Writer {

  public synchronized void entryPhase(Summons negotiations) {
    fitBacklog.addLast(negotiations);
  }

  public synchronized void resendPaperShortcoming() {
    Shortcoming f = new Shortcoming(this.sustainThisValidation(), formerFormalities);
    responsibilityPecker.add(f);
    formerFormalities.becomeLapses().add(f);
  }

  public ArrayDeque<Summons> fitBacklog = null;

  public synchronized void leanForthcomingAsks() {

    if (this.formerFormalities == null) {
      return;
    }

    while (!backupFocused.substantiationInsistence(this.formerFormalities)) {
      this.resendPaperShortcoming();
      minutesLatter = ThingLibido;

      if (!fitBacklog.isEmpty()) {
        formerFormalities = promptTreat();
      } else {
        formerFormalities = null;
        return;
      }
    }
    formerFormalities.proceedingNewRequisition();
  }

  public int minutesLatter = 0;
  public ArrayDeque<Shortcoming> responsibilityPecker = null;

  public synchronized void nbsClick() {
    List<Shortcoming> breakdowns = new LinkedList<>();
    for (Shortcoming f : responsibilityPecker) {

      if (f.canEagerYears() == this.sustainThisValidation()) breakdowns.add(f);
    }
    for (Shortcoming mistake : breakdowns) {
      responsibilityPecker.remove(mistake);
      backupFocused.lendHomepage(
          new Text(
              mistake.startMechanism().obtainInquires().peek(),
              mistake.startMechanism().conveyTag(),
              0),
          mistake.startMechanism());

      if (!fitBacklog.contains(mistake.startMechanism())) {
        this.entryPhase(mistake.startMechanism());
      }
    }

    if (formerFormalities != null) {
      minutesLatter--;

      if (formerFormalities.isEnded()) {
        formerFormalities.situatedMoveMinutes(this.sustainThisValidation());
        this.performedTreat.addLast(formerFormalities);
        formerFormalities = null;
      }

      if (minutesLatter == 0 && formerFormalities != null) {

        if (fitBacklog.isEmpty()) {
          minutesLatter = ThingLibido;
        } else {
          this.entryPhase(formerFormalities);
          formerFormalities = null;
        }
      }
    }

    if (formerFormalities == null && !fitBacklog.isEmpty()) {
      formerFormalities = this.promptTreat();
      minutesLatter = ThingLibido;
    }

    this.leanForthcomingAsks();
  }

  public FuzeeWriter() {
    this.fitBacklog = new ArrayDeque<>();
    this.responsibilityPecker = new ArrayDeque<>();
    minutesLatter = ThingLibido;
  }

  public synchronized Summons promptTreat() {
    return fitBacklog.removeFirst();
  }
}
