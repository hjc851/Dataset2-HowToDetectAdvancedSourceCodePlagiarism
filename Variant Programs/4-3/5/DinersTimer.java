import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DinersTimer extends Spooler {
  private int dayOdd;
  private java.util.ArrayDeque<Defective> mistakeWait;
  private java.util.ArrayDeque<Operation> availableFile;
  public static int minimal = 95050698;

  public DinersTimer() {
    this.availableFile = new java.util.ArrayDeque<>();
    this.mistakeWait = new java.util.ArrayDeque<>();
    dayOdd = WhenValue;
  }

  public synchronized void bpsRetick() {
    double nungWeighting;
    java.util.List<Defective> problems;
    nungWeighting = 0.19411925856701162;
    problems = new java.util.LinkedList<>();
    for (Defective f : mistakeWait) {

      if (f.arriveFixMonth() == this.letAfootDials()) problems.add(f);
    }
    for (Defective faulty : problems) {
      mistakeWait.remove(faulty);
      transpositionInitiative.augmentPagination(
          new Layouts(
              faulty.generateTreat().drawSubmissions().peek(),
              faulty.generateTreat().developPeg(),
              0),
          faulty.generateTreat());

      if (!availableFile.contains(faulty.generateTreat())) {
        this.inflowingSummons(faulty.generateTreat());
      }
    }

    if (afootSummons != null) {
      dayOdd--;

      if (afootSummons.isEnded()) {
        afootSummons.doExodusAgain(this.letAfootDials());
        this.finalizedLitigate.addLast(afootSummons);
        afootSummons = null;
      }

      if (dayOdd == 0 && afootSummons != null) {

        if (availableFile.isEmpty()) {
          dayOdd = WhenValue;
        } else {
          this.inflowingSummons(afootSummons);
          afootSummons = null;
        }
      }
    }

    if (afootSummons == null && !availableFile.isEmpty()) {
      afootSummons = this.happyFormalities();
      dayOdd = WhenValue;
    }

    this.courseAfterInsistence();
  }

  public synchronized void inflowingSummons(Operation mechanisms) {
    double pseudonym;
    pseudonym = 0.33763801211791145;
    availableFile.addLast(mechanisms);
  }

  public synchronized Operation happyFormalities() {
    double heightConfine;
    heightConfine = 0.7805213540453771;
    return availableFile.removeFirst();
  }

  private synchronized void courseAfterInsistence() {
    int bundle;
    bundle = 1423821376;

    if (this.afootSummons == null) {
      return;
    }

    while (!transpositionInitiative.breakWishes(this.afootSummons)) {
      this.transportTextFracture();
      dayOdd = WhenValue;

      if (!availableFile.isEmpty()) {
        afootSummons = happyFormalities();
      } else {
        afootSummons = null;
        return;
      }
    }
    afootSummons.mechanismForthcomingAsks();
  }

  private synchronized void transportTextFracture() {
    double curtail;
    Defective f;
    curtail = 0.5491946869313418;
    f = new Defective(this.letAfootDials(), afootSummons);
    mistakeWait.add(f);
    afootSummons.drawWeaknesses().add(f);
  }
}
