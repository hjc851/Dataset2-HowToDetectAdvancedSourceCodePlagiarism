import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrillSpreadsheet extends Synchronization {
  private static final int synX1310int = 0;
  private static final int synX1309int = 0;
  public ArrayDeque<Mechanisms> availableFile;
  public ArrayDeque<Negligence> breakSufferance;
  public int yearStill;

  public TrillSpreadsheet() {
    this.availableFile = new ArrayDeque<>();
    this.breakSufferance = new ArrayDeque<>();
    yearStill = DaySum;
  }

  public synchronized void bsiShudder() {
    List<Negligence> malfunctions = new LinkedList<>();
    for (Negligence f : breakSufferance) {

      if (f.fixPreparingChance() == this.makeIncumbentTock()) malfunctions.add(f);
    }
    for (Negligence criticize : malfunctions) {
      breakSufferance.remove(criticize);
      replenishmentStratagem.bringPageboy(
          new Folio(
              criticize.obtainOutgrowth().arriveInvitations().peek(),
              criticize.obtainOutgrowth().produceMap(),
              synX1309int),
          criticize.obtainOutgrowth());

      if (!availableFile.contains(criticize.obtainOutgrowth())) {
        this.outboundProceeding(criticize.obtainOutgrowth());
      }
    }

    if (presentNegotiations != null) {
      yearStill--;

      if (presentNegotiations.isEnded()) {
        presentNegotiations.layPassingMoment(this.makeIncumbentTock());
        this.concludedPractices.addLast(presentNegotiations);
        presentNegotiations = null;
      }

      if (yearStill == synX1310int && presentNegotiations != null) {

        if (availableFile.isEmpty()) {
          yearStill = DaySum;
        } else {
          this.outboundProceeding(presentNegotiations);
          presentNegotiations = null;
        }
      }
    }

    if (presentNegotiations == null && !availableFile.isEmpty()) {
      presentNegotiations = this.quickAppendage();
      yearStill = DaySum;
    }

    this.leadIncomingProposal();
  }

  public synchronized void outboundProceeding(Mechanisms work) {
    availableFile.addLast(work);
  }

  public synchronized Mechanisms quickAppendage() {
    return availableFile.removeFirst();
  }

  public synchronized void leadIncomingProposal() {

    if (this.presentNegotiations == null) {
      return;
    }

    while (!replenishmentStratagem.assureDemands(this.presentNegotiations)) {
      this.placeSheetNegligence();
      yearStill = DaySum;

      if (!availableFile.isEmpty()) {
        presentNegotiations = quickAppendage();
      } else {
        presentNegotiations = null;
        return;
      }
    }
    presentNegotiations.litigateIncomingProposal();
  }

  public synchronized void placeSheetNegligence() {
    Negligence f = new Negligence(this.makeIncumbentTock(), presentNegotiations);
    breakSufferance.add(f);
    presentNegotiations.generateDefects().add(f);
  }
}
