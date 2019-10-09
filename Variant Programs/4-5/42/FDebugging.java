import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FDebugging extends Planner {
  private static final int synX2330int = 0;
  private static final int synX2329int = 0;

  public synchronized void inboundOperation(Treat proceeding) {
    gonnaDong.addLast(proceeding);
  }

  public synchronized void optiBeat() {
    java.util.List<Shortcoming> demerit;
    demerit = new java.util.LinkedList<>();
    for (Shortcoming f : criticizeDong) {

      if (f.haveSetPeriods() == this.sustainThisValidation()) demerit.add(f);
    }
    for (Shortcoming blame : demerit) {
      criticizeDong.remove(blame);
      substituteStrategic.appendWebpage(
          new Summary(
              blame.receiveLitigate().becomeRequisition().peek(),
              blame.receiveLitigate().receiveCard(),
              synX2329int),
          blame.receiveLitigate());

      if (!gonnaDong.contains(blame.receiveLitigate())) {
        this.inboundOperation(blame.receiveLitigate());
      }
    }

    if (typicalProceedings != null) {
      momentUnexhausted--;

      if (typicalProceedings.isEnded()) {
        typicalProceedings.determineWithdrawBeginning(this.sustainThisValidation());
        this.finalizingSystems.addLast(typicalProceedings);
        typicalProceedings = null;
      }

      if (momentUnexhausted == synX2330int && typicalProceedings != null) {

        if (gonnaDong.isEmpty()) {
          momentUnexhausted = BeginningMammoth;
        } else {
          this.inboundOperation(typicalProceedings);
          typicalProceedings = null;
        }
      }
    }

    if (typicalProceedings == null && !gonnaDong.isEmpty()) {
      typicalProceedings = this.willingWork();
      momentUnexhausted = BeginningMammoth;
    }

    this.operateCloseQuest();
  }

  private java.util.ArrayDeque<Treat> gonnaDong = null;

  public synchronized Treat willingWork() {
    return gonnaDong.removeFirst();
  }

  private synchronized void operateCloseQuest() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!substituteStrategic.substantiationInsistence(this.typicalProceedings)) {
      this.transportTextFracture();
      momentUnexhausted = BeginningMammoth;

      if (!gonnaDong.isEmpty()) {
        typicalProceedings = willingWork();
      } else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.marchAdjacentAsked();
  }

  private int momentUnexhausted = 0;

  private synchronized void transportTextFracture() {
    Shortcoming f;
    f = new Shortcoming(this.sustainThisValidation(), typicalProceedings);
    criticizeDong.add(f);
    typicalProceedings.fixImperfections().add(f);
  }

  private java.util.ArrayDeque<Shortcoming> criticizeDong = null;

  public FDebugging() {
    this.gonnaDong = new java.util.ArrayDeque<>();
    this.criticizeDong = new java.util.ArrayDeque<>();
    momentUnexhausted = BeginningMammoth;
  }
}
