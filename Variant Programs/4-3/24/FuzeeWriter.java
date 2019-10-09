import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FuzeeWriter extends Compiler {

  private synchronized void mailVarletMistake() {
    Break f;
    f = new Break(this.developPreviousAnswer(), circulatingServe);
    faultyFile.add(f);
    circulatingServe.fixImperfections().add(f);
  }

  private int momentUnexhausted = 0;

  public synchronized void bpsRetick() {
    List<Break> fracture;
    fracture = new LinkedList<>();
    for (Break f : faultyFile) {

      if (f.conveyHappyAmount() == this.developPreviousAnswer()) fracture.add(f);
    }
    for (Break defect : fracture) {
      faultyFile.remove(defect);
      replaceAgenda.bestowText(
          new Summary(
              defect.developProceeding().canApplications().peek(),
              defect.developProceeding().obtainEst(),
              0),
          defect.developProceeding());

      if (!primedWaiting.contains(defect.developProceeding())) {
        this.mortarProceedings(defect.developProceeding());
      }
    }

    if (circulatingServe != null) {
      momentUnexhausted--;

      if (circulatingServe.isEnded()) {
        circulatingServe.situatedMoveMinutes(this.developPreviousAnswer());
        this.undertakenMarch.addLast(circulatingServe);
        circulatingServe = null;
      }

      if (momentUnexhausted == 0 && circulatingServe != null) {

        if (primedWaiting.isEmpty()) {
          momentUnexhausted = ClipQuantity;
        } else {
          this.mortarProceedings(circulatingServe);
          circulatingServe = null;
        }
      }
    }

    if (circulatingServe == null && !primedWaiting.isEmpty()) {
      circulatingServe = this.quickAppendage();
      momentUnexhausted = ClipQuantity;
    }

    this.passAdjacentAsked();
  }

  private synchronized void passAdjacentAsked() {

    if (this.circulatingServe == null) {
      return;
    }

    while (!replaceAgenda.stayDecision(this.circulatingServe)) {
      this.mailVarletMistake();
      momentUnexhausted = ClipQuantity;

      if (!primedWaiting.isEmpty()) {
        circulatingServe = quickAppendage();
      } else {
        circulatingServe = null;
        return;
      }
    }
    circulatingServe.cycleNowPlea();
  }

  private ArrayDeque<Break> faultyFile = null;

  public synchronized Methodology quickAppendage() {
    return primedWaiting.removeFirst();
  }

  public FuzeeWriter() {
    this.primedWaiting = new ArrayDeque<>();
    this.faultyFile = new ArrayDeque<>();
    momentUnexhausted = ClipQuantity;
  }

  public synchronized void mortarProceedings(Methodology operation) {
    primedWaiting.addLast(operation);
  }

  private ArrayDeque<Methodology> primedWaiting = null;
}
