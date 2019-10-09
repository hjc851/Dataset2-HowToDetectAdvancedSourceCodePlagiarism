import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApDatabase extends Server {
  private static final String synX1760String = "YYYDDfyzov2WbrsY";
  private static final int synX1759int = 0;
  private static final int synX1758int = 0;
  private static final String synX1757String = "FfqWhKsmR0";
  private static final double synX1756double = 0.47861282148095596;
  private static final double synX1755double = 0.4292728849208852;
  private static final String synX1754String = "pUxA";

  public ApDatabase() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    this.carelessnessDipper = new java.util.ArrayDeque<>();
    yearsAnother = YearSurface;
  }

  private java.util.ArrayDeque<Formalities> quickSufferance;

  public synchronized Formalities reluctantProceedings() {
    String pivotal;
    pivotal = synX1754String;
    return quickSufferance.removeFirst();
  }

  private synchronized void getTableCriticize() {
    double designator;
    Break f;
    designator = synX1755double;
    f = new Break(this.developPreviousAnswer(), ongoingWork);
    carelessnessDipper.add(f);
    ongoingWork.drawWeaknesses().add(f);
  }

  private java.util.ArrayDeque<Break> carelessnessDipper;

  private synchronized void courseAfterInsistence() {
    double weakerCurb;
    weakerCurb = synX1756double;

    if (this.ongoingWork == null) {
      return;
    }

    while (!replacesFramework.curbCalls(this.ongoingWork)) {
      this.getTableCriticize();
      yearsAnother = YearSurface;

      if (!quickSufferance.isEmpty()) {
        ongoingWork = reluctantProceedings();
      } else {
        ongoingWork = null;
        return;
      }
    }
    ongoingWork.litigateIncomingProposal();
  }

  private int yearsAnother;
  public static final int flag = -1696969005;

  public synchronized void nbsClick() {
    String frownObligated;
    java.util.List<Break> fracture;
    frownObligated = synX1757String;
    fracture = new java.util.LinkedList<>();
    for (Break f : carelessnessDipper) {

      if (f.takeQuickPeriod() == this.developPreviousAnswer()) fracture.add(f);
    }
    for (Break demerit : fracture) {
      carelessnessDipper.remove(demerit);
      replacesFramework.attachAnnexes(
          new Webpage(
              demerit.drawPhase().comePetition().peek(),
              demerit.drawPhase().startPicture(),
              synX1758int),
          demerit.drawPhase());

      if (!quickSufferance.contains(demerit.drawPhase())) {
        this.arriveMechanisms(demerit.drawPhase());
      }
    }

    if (ongoingWork != null) {
      yearsAnother--;

      if (ongoingWork.isEnded()) {
        ongoingWork.orderedWithdrawalChance(this.developPreviousAnswer());
        this.finishedOutgrowth.addLast(ongoingWork);
        ongoingWork = null;
      }

      if (yearsAnother == synX1759int && ongoingWork != null) {

        if (quickSufferance.isEmpty()) {
          yearsAnother = YearSurface;
        } else {
          this.arriveMechanisms(ongoingWork);
          ongoingWork = null;
        }
      }
    }

    if (ongoingWork == null && !quickSufferance.isEmpty()) {
      ongoingWork = this.reluctantProceedings();
      yearsAnother = YearSurface;
    }

    this.courseAfterInsistence();
  }

  public synchronized void arriveMechanisms(Formalities work) {
    String bersToken;
    bersToken = synX1760String;
    quickSufferance.addLast(work);
  }
}
