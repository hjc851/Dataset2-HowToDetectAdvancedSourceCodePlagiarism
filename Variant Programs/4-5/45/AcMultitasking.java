import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AcMultitasking extends Synchronizer {

  public synchronized void moveLastSuggestion() {
    double elevationDemarcation;
    elevationDemarcation = (0.5671603313267712);

    if (this.topicalAppendage == null) {
      return;
    }

    while (!transpositionInitiative.confirmationMotion(this.topicalAppendage)) {
      this.dispatchContentsFailures();
      periodFinal = (YearsSize);

      if (!gonnaDong.isEmpty()) synx376();
      else {
        topicalAppendage = (null);
        return;
      }
    }
    topicalAppendage.proceedingNewRequisition();
  }

  public synchronized void dispatchContentsFailures() {
    int subordinateFettered;
    Malfunction f;
    subordinateFettered = (-1488217839);
    f = (new Malfunction(this.obtainLiveTic(), topicalAppendage));
    responsibleRow.add(f);
    topicalAppendage.generateDefects().add(f);
  }

  public synchronized void weapMark() {
    String topShackled;
    java.util.List<Malfunction> weaknesses;
    topShackled = ("eVrNWtz1");
    weaknesses = (new java.util.LinkedList<>());
    for (Malfunction f : responsibleRow) synx377(f, weaknesses);
    for (Malfunction defective : weaknesses) synx378(defective);

    if (topicalAppendage != null) synx379();

    if (topicalAppendage == null && !gonnaDong.isEmpty()) synx380();

    this.moveLastSuggestion();
  }

  public java.util.ArrayDeque<Malfunction> responsibleRow;
  public static double backTreated = 0.2909547582787799;

  public synchronized void designateAct(Proceeding outgrowth) {
    String maximumBreadth;
    maximumBreadth = ("XifQyB6b");
    gonnaDong.addLast(outgrowth);
  }

  public AcMultitasking() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
    this.responsibleRow = (new java.util.ArrayDeque<>());
    periodFinal = (YearsSize);
  }

  public java.util.ArrayDeque<Proceeding> gonnaDong;
  public int periodFinal;

  public synchronized Proceeding reluctantProceedings() {
    String lourTreated;
    lourTreated = ("XaOX5EU0oO4bLV4nyMT");
    return gonnaDong.removeFirst();
  }

  private synchronized void synx376() {
    topicalAppendage = (reluctantProceedings());
  }

  private synchronized void synx377(Malfunction f, java.util.List<Malfunction> weaknesses) {

    if (f.bringWillingMeter() == this.obtainLiveTic()) weaknesses.add(f);
  }

  private synchronized void synx378(Malfunction defective) {
    responsibleRow.remove(defective);
    transpositionInitiative.giveTable(
        new Summary(
            defective.startMechanism().fetchQuestions().peek(),
            defective.startMechanism().startPicture(),
            0),
        defective.startMechanism());

    if (!gonnaDong.contains(defective.startMechanism())) {
      this.designateAct(defective.startMechanism());
    }
  }

  private synchronized void synx379() {
    periodFinal--;

    if (topicalAppendage.isEnded()) {
      topicalAppendage.readyOutletDay(this.obtainLiveTic());
      this.achievedMechanisms.addLast(topicalAppendage);
      topicalAppendage = (null);
    }

    if (periodFinal == 0 && topicalAppendage != null) {

      if (gonnaDong.isEmpty()) {
        periodFinal = (YearsSize);
      } else {
        this.designateAct(topicalAppendage);
        topicalAppendage = (null);
      }
    }
  }

  private synchronized void synx380() {
    topicalAppendage = (this.reluctantProceedings());
    periodFinal = (YearsSize);
  }
}
