import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OberProgrammer extends Database {

  public synchronized void weapMark() {
    List<Error> flaws;
    flaws = new LinkedList<>();
    for (Error f : carelessnessDipper) synx19(f, flaws);
    for (Error defective : flaws) synx20(defective);

    if (typicalProceedings != null) synx21();

    if (typicalProceedings == null && !reluctantCola.isEmpty()) synx22();

    this.bleedEarlyWishes();
  }

  public synchronized void enteringAppendage(System operation) {
    reluctantCola.addLast(operation);
  }

  public ArrayDeque<System> reluctantCola = null;
  public ArrayDeque<Error> carelessnessDipper = null;

  public synchronized void resendPaperShortcoming() {
    Error f;
    f = new Error(this.arriveFlowIndicate(), typicalProceedings);
    carelessnessDipper.add(f);
    typicalProceedings.sustainWrongdoings().add(f);
  }

  public OberProgrammer() {
    this.reluctantCola = new ArrayDeque<>();
    this.carelessnessDipper = new ArrayDeque<>();
    beginningUnsold = PeriodQualitative;
  }

  public synchronized System waitingLitigate() {
    return reluctantCola.removeFirst();
  }

  public synchronized void bleedEarlyWishes() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!refillingGambit.correspondRequisition(this.typicalProceedings)) {
      this.resendPaperShortcoming();
      beginningUnsold = PeriodQualitative;

      if (!reluctantCola.isEmpty()) synx23();
      else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.litigateIncomingProposal();
  }

  public int beginningUnsold = 0;

  private synchronized void synx19(Error f, java.util.List<Error> flaws) {

    if (f.goPrimedClock() == this.arriveFlowIndicate()) flaws.add(f);
  }

  private synchronized void synx20(Error defective) {
    carelessnessDipper.remove(defective);
    refillingGambit.supplySummary(
        new Layouts(
            defective.driveMechanisms().driveRequirements().peek(),
            defective.driveMechanisms().canOwnership(),
            0),
        defective.driveMechanisms());

    if (!reluctantCola.contains(defective.driveMechanisms())) {
      this.enteringAppendage(defective.driveMechanisms());
    }
  }

  private synchronized void synx21() {
    beginningUnsold--;

    if (typicalProceedings.isEnded()) {
      typicalProceedings.rigidQuittingAmount(this.arriveFlowIndicate());
      this.realizedWork.addLast(typicalProceedings);
      typicalProceedings = null;
    }

    if (beginningUnsold == 0 && typicalProceedings != null) {

      if (reluctantCola.isEmpty()) {
        beginningUnsold = PeriodQualitative;
      } else {
        this.enteringAppendage(typicalProceedings);
        typicalProceedings = null;
      }
    }
  }

  private synchronized void synx22() {
    typicalProceedings = this.waitingLitigate();
    beginningUnsold = PeriodQualitative;
  }

  private synchronized void synx23() {
    typicalProceedings = waitingLitigate();
  }
}
