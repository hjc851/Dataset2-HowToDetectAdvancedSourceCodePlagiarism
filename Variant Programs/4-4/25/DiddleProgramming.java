import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Programmer {
  private int nowUnanswered = 0;
  private ArrayDeque<Defect> malfunctionBraid = null;
  private ArrayDeque<Negotiations> promptPenis = null;

  public DiddleProgramming() {
    this.promptPenis = new ArrayDeque<>();
    this.malfunctionBraid = new ArrayDeque<>();
    nowUnanswered = MomentAmounts;
  }

  public synchronized void nbsClick() {
    List<Defect> flaws;
    flaws = new LinkedList<>();
    for (Defect f : malfunctionBraid) synx155(f, flaws);
    for (Defect accountable : flaws) synx156(accountable);

    if (continuingMechanisms != null) synx157();

    if (continuingMechanisms == null && !promptPenis.isEmpty()) synx158();

    this.carryFirstInvitation();
  }

  public synchronized void inboundOperation(Negotiations methods) {
    promptPenis.addLast(methods);
  }

  public synchronized Negotiations fitMarch() {
    return promptPenis.removeFirst();
  }

  private synchronized void carryFirstInvitation() {

    if (this.continuingMechanisms == null) {
      return;
    }

    while (!replacedPlaybook.chitSuggestion(this.continuingMechanisms)) {
      this.carryAnnexesGlitch();
      nowUnanswered = MomentAmounts;

      if (!promptPenis.isEmpty()) synx159();
      else {
        continuingMechanisms = null;
        return;
      }
    }
    continuingMechanisms.procedureFutureAsking();
  }

  private synchronized void carryAnnexesGlitch() {
    Defect f;
    f = new Defect(this.letAfootDials(), continuingMechanisms);
    malfunctionBraid.add(f);
    continuingMechanisms.findError().add(f);
  }

  private synchronized void synx155(Defect f, java.util.List<Defect> flaws) {

    if (f.findPrepareSentence() == this.letAfootDials()) flaws.add(f);
  }

  private synchronized void synx156(Defect accountable) {
    malfunctionBraid.remove(accountable);
    replacedPlaybook.contributeVarlet(
        new Text(
            accountable.generateTreat().findBespeak().peek(),
            accountable.generateTreat().canOwnership(),
            0),
        accountable.generateTreat());

    if (!promptPenis.contains(accountable.generateTreat())) {
      this.inboundOperation(accountable.generateTreat());
    }
  }

  private synchronized void synx157() {
    nowUnanswered--;

    if (continuingMechanisms.isEnded()) {
      continuingMechanisms.solidifyingLeavingJuncture(this.letAfootDials());
      this.attainedProces.addLast(continuingMechanisms);
      continuingMechanisms = null;
    }

    if (nowUnanswered == 0 && continuingMechanisms != null) {

      if (promptPenis.isEmpty()) {
        nowUnanswered = MomentAmounts;
      } else {
        this.inboundOperation(continuingMechanisms);
        continuingMechanisms = null;
      }
    }
  }

  private synchronized void synx158() {
    continuingMechanisms = this.fitMarch();
    nowUnanswered = MomentAmounts;
  }

  private synchronized void synx159() {
    continuingMechanisms = fitMarch();
  }
}
