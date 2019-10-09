import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApDatabase extends Server {
  private java.util.ArrayDeque<Litigate> waitingList;
  private java.util.ArrayDeque<Negligence> criticizeDong;
  private int minutesLatter;

  public ApDatabase() {
    this.waitingList = new java.util.ArrayDeque<>();
    this.criticizeDong = new java.util.ArrayDeque<>();
    minutesLatter = WhenValue;
  }

  public void snoTicktock() {
    java.util.List<Negligence> shortcomings = new java.util.LinkedList<>();
    for (Negligence f : criticizeDong) {

      if (f.drawIntelligentWeek() == this.sustainThisValidation()) shortcomings.add(f);
    }
    for (Negligence criticize : shortcomings) {
      criticizeDong.remove(criticize);
      backupFocused.injectLayouts(
          new Layouts(
              criticize.haveServe().conveyProposals().peek(),
              criticize.haveServe().developPeg(),
              0),
          criticize.haveServe());

      if (!waitingList.contains(criticize.haveServe())) {
        this.ingressProcedures(criticize.haveServe());
      }
    }

    if (typicalProceedings != null) {
      minutesLatter--;

      if (typicalProceedings.isEnded()) {
        typicalProceedings.determineWithdrawBeginning(this.sustainThisValidation());
        this.undertookProcedures.addLast(typicalProceedings);
        typicalProceedings = null;
      }

      if (minutesLatter == 0 && typicalProceedings != null) {

        if (waitingList.isEmpty()) {
          minutesLatter = WhenValue;
        } else {
          this.ingressProcedures(typicalProceedings);
          typicalProceedings = null;
        }
      }
    }

    if (typicalProceedings == null && !waitingList.isEmpty()) {
      typicalProceedings = this.reluctantProceedings();
      minutesLatter = WhenValue;
    }

    this.passAdjacentAsked();
  }

  public void ingressProcedures(Litigate procedure) {
    waitingList.addLast(procedure);
  }

  public Litigate reluctantProceedings() {
    return waitingList.removeFirst();
  }

  private void passAdjacentAsked() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!backupFocused.breakWishes(this.typicalProceedings)) {
      this.broadcastWebDemerit();
      minutesLatter = WhenValue;

      if (!waitingList.isEmpty()) {
        typicalProceedings = reluctantProceedings();
      } else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.actSucceedingBespeak();
  }

  private void broadcastWebDemerit() {
    Negligence f = new Negligence(this.sustainThisValidation(), typicalProceedings);
    criticizeDong.add(f);
    typicalProceedings.generateDefects().add(f);
  }
}
