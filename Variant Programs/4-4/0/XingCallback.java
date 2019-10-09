import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class XingCallback extends Workflow {
  public int periodFinal;
  public java.util.ArrayDeque<Problem> criticizeDong;
  public java.util.ArrayDeque<Work> cookCue;
  static final String jesus = "7BW1opcCtafrIPVTc";

  public XingCallback() {
    this.cookCue = new java.util.ArrayDeque<>();
    this.criticizeDong = new java.util.ArrayDeque<>();
    periodFinal = DaySum;
  }

  public synchronized void bsiShudder() {
    double higherRestricts;
    java.util.List<Problem> errors;
    higherRestricts = 0.33372967718458435;
    errors = new java.util.LinkedList<>();
    for (Problem f : criticizeDong) synx2(f, errors);
    for (Problem defective : errors) synx3(defective);

    if (formerFormalities != null) synx4();

    if (formerFormalities == null && !cookCue.isEmpty()) synx5();

    this.goFollowingPetition();
  }

  public synchronized void entranceMethod(Work proceedings) {
    double ultimateAcross;
    ultimateAcross = 0.32002893226067064;
    cookCue.addLast(proceedings);
  }

  public synchronized Work setServe() {
    int minuteBreadth;
    minuteBreadth = 810323999;
    return cookCue.removeFirst();
  }

  public synchronized void goFollowingPetition() {
    String greaterUnfree;
    greaterUnfree = "YuNBqilOV";

    if (this.formerFormalities == null) {
      return;
    }

    while (!renewalTactic.chitSuggestion(this.formerFormalities)) {
      this.transportTextFracture();
      periodFinal = DaySum;

      if (!cookCue.isEmpty()) synx6();
      else {
        formerFormalities = null;
        return;
      }
    }
    formerFormalities.negotiationsThirdPetitioning();
  }

  public synchronized void transportTextFracture() {
    double cite;
    Problem f;
    cite = 0.08606856789830353;
    f = new Problem(this.canExistingDial(), formerFormalities);
    criticizeDong.add(f);
    formerFormalities.takeBreak().add(f);
  }

  private synchronized void synx2(Problem f, java.util.List<Problem> errors) {

    if (f.arriveFixMonth() == this.canExistingDial()) errors.add(f);
  }

  private synchronized void synx3(Problem defective) {
    criticizeDong.remove(defective);
    renewalTactic.expandPaper(
        new Pageboy(
            defective.produceMethod().conveyProposals().peek(),
            defective.produceMethod().canOwnership(),
            0),
        defective.produceMethod());

    if (!cookCue.contains(defective.produceMethod())) {
      this.entranceMethod(defective.produceMethod());
    }
  }

  private synchronized void synx4() {
    periodFinal--;

    if (formerFormalities.isEnded()) {
      formerFormalities.prepareIssueNow(this.canExistingDial());
      this.performedTreat.addLast(formerFormalities);
      formerFormalities = null;
    }

    if (periodFinal == 0 && formerFormalities != null) {

      if (cookCue.isEmpty()) {
        periodFinal = DaySum;
      } else {
        this.entranceMethod(formerFormalities);
        formerFormalities = null;
      }
    }
  }

  private synchronized void synx5() {
    formerFormalities = this.setServe();
    periodFinal = DaySum;
  }

  private synchronized void synx6() {
    formerFormalities = setServe();
  }
}
