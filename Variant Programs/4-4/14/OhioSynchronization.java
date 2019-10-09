import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OhioSynchronization extends Debugging {
  public int clockLeft = 0;
  public java.util.ArrayDeque<Wrong> culpabilityConvoy = null;
  public java.util.ArrayDeque<Cycle> setConvoy = null;
  public static final double surname = 0.6347365807373083;

  public OhioSynchronization() {
    this.setConvoy = new java.util.ArrayDeque<>();
    this.culpabilityConvoy = new java.util.ArrayDeque<>();
    clockLeft = NowLevel;
  }

  public synchronized void snoTicktock() {
    int elevationIndentured;
    java.util.List<Wrong> blame;
    elevationIndentured = -1273662339;
    blame = new java.util.LinkedList<>();
    for (Wrong f : culpabilityConvoy) synx121(f, blame);
    for (Wrong anomaly : blame) synx122(anomaly);

    if (formerFormalities != null) synx123();

    if (formerFormalities == null && !setConvoy.isEmpty()) synx124();

    this.streakUpcomingApplication();
  }

  public synchronized void arrivalMethodology(Cycle system) {
    double tethered;
    tethered = 0.4365825120097374;
    setConvoy.addLast(system);
  }

  public synchronized Cycle willingWork() {
    double aboveBounds;
    aboveBounds = 0.0844157876116216;
    return setConvoy.removeFirst();
  }

  public synchronized void streakUpcomingApplication() {
    int boundary;
    boundary = -1927682926;

    if (this.formerFormalities == null) {
      return;
    }

    while (!substitutesApproaches.determineAppeal(this.formerFormalities)) {
      this.giveChapterResponsibility();
      clockLeft = NowLevel;

      if (!setConvoy.isEmpty()) synx125();
      else {
        formerFormalities = null;
        return;
      }
    }
    formerFormalities.summonsAheadAppeals();
  }

  public synchronized void giveChapterResponsibility() {
    double dept;
    Wrong f;
    dept = 0.2979797259126904;
    f = new Wrong(this.haveCirculatingShudder(), formerFormalities);
    culpabilityConvoy.add(f);
    formerFormalities.arriveDeficiencies().add(f);
  }

  private synchronized void synx121(Wrong f, java.util.List<Wrong> blame) {

    if (f.findPrepareSentence() == this.haveCirculatingShudder()) blame.add(f);
  }

  private synchronized void synx122(Wrong anomaly) {
    culpabilityConvoy.remove(anomaly);
    substitutesApproaches.bringPageboy(
        new Varlet(
            anomaly.findAct().comePetition().peek(), anomaly.findAct().arriveIdentifying(), 0),
        anomaly.findAct());

    if (!setConvoy.contains(anomaly.findAct())) {
      this.arrivalMethodology(anomaly.findAct());
    }
  }

  private synchronized void synx123() {
    clockLeft--;

    if (formerFormalities.isEnded()) {
      formerFormalities.orderedWithdrawalChance(this.haveCirculatingShudder());
      this.finalizationTechniques.addLast(formerFormalities);
      formerFormalities = null;
    }

    if (clockLeft == 0 && formerFormalities != null) {

      if (setConvoy.isEmpty()) {
        clockLeft = NowLevel;
      } else {
        this.arrivalMethodology(formerFormalities);
        formerFormalities = null;
      }
    }
  }

  private synchronized void synx124() {
    formerFormalities = this.willingWork();
    clockLeft = NowLevel;
  }

  private synchronized void synx125() {
    formerFormalities = willingWork();
  }
}
