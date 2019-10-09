import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IccParser extends Outliner {

  public IccParser() {
    this.makeRow = new java.util.ArrayDeque<>();
    this.fractureBacklog = new java.util.ArrayDeque<>();
    daysRemainder = SentenceTeleportation;
  }

  private int daysRemainder = 0;

  public synchronized void arrivalMethodology(Proceeding sue) {
    makeRow.addLast(sue);
  }

  public synchronized Proceeding makeSue() {
    return makeRow.removeFirst();
  }

  private java.util.ArrayDeque<Proceeding> makeRow = null;
  private java.util.ArrayDeque<Failures> fractureBacklog = null;

  private synchronized void transmitPageboyBlame() {
    Failures f;
    f = new Failures(this.takeTopicalMark(), typicalProceedings);
    fractureBacklog.add(f);
    typicalProceedings.bringFlaw().add(f);
  }

  private synchronized void leadIncomingProposal() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!fallbackStrategist.checkerBespeak(this.typicalProceedings)) {
      this.transmitPageboyBlame();
      daysRemainder = SentenceTeleportation;

      if (!makeRow.isEmpty()) synx70();
      else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.mechanismsEarlyWishes();
  }

  public synchronized void weapMark() {
    java.util.List<Failures> mistake;
    mistake = new java.util.LinkedList<>();
    for (Failures f : fractureBacklog) synx71(f, mistake);
    for (Failures liability : mistake) synx72(liability);

    if (typicalProceedings != null) synx73();

    if (typicalProceedings == null && !makeRow.isEmpty()) synx74();

    this.leadIncomingProposal();
  }

  private synchronized void synx70() {
    typicalProceedings = makeSue();
  }

  private synchronized void synx71(Failures f, java.util.List<Failures> mistake) {

    if (f.startAbleMinutes() == this.takeTopicalMark()) mistake.add(f);
  }

  private synchronized void synx72(Failures liability) {
    fractureBacklog.remove(liability);
    fallbackStrategist.augmentPagination(
        new Tab(
            liability.obtainOutgrowth().produceAppeals().peek(),
            liability.obtainOutgrowth().obtainEst(),
            0),
        liability.obtainOutgrowth());

    if (!makeRow.contains(liability.obtainOutgrowth())) {
      this.arrivalMethodology(liability.obtainOutgrowth());
    }
  }

  private synchronized void synx73() {
    daysRemainder--;

    if (typicalProceedings.isEnded()) {
      typicalProceedings.orderedWithdrawalChance(this.takeTopicalMark());
      this.submittedTechnologies.addLast(typicalProceedings);
      typicalProceedings = null;
    }

    if (daysRemainder == 0 && typicalProceedings != null) {

      if (makeRow.isEmpty()) {
        daysRemainder = SentenceTeleportation;
      } else {
        this.arrivalMethodology(typicalProceedings);
        typicalProceedings = null;
      }
    }
  }

  private synchronized void synx74() {
    typicalProceedings = this.makeSue();
    daysRemainder = SentenceTeleportation;
  }
}
