import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BWorkspace extends Server {

  public synchronized void electWork(Operation summons) {
    setConvoy.addLast(summons);
  }

  public BWorkspace() {
    this.setConvoy = new ArrayDeque<>();
    this.carelessnessDipper = new ArrayDeque<>();
    hoursRetaining = SentenceTeleportation;
  }

  private synchronized void workExpectedMotion() {

    if (this.rifeSue == null) {
      return;
    }

    while (!replacesFramework.ensureAppeals(this.rifeSue)) {
      this.airTabFaulty();
      hoursRetaining = SentenceTeleportation;

      if (!setConvoy.isEmpty()) {
        rifeSue = quickAppendage();
      } else {
        rifeSue = null;
        return;
      }
    }
    rifeSue.marchAdjacentAsked();
  }

  private synchronized void airTabFaulty() {
    Flaw f;
    f = new Flaw(this.obtainLiveTic(), rifeSue);
    carelessnessDipper.add(f);
    rifeSue.receiveDefect().add(f);
  }

  public synchronized void bsiShudder() {
    List<Flaw> problems;
    problems = new LinkedList<>();
    for (Flaw f : carelessnessDipper) {

      if (f.drawIntelligentWeek() == this.obtainLiveTic()) problems.add(f);
    }
    for (Flaw faulty : problems) {
      carelessnessDipper.remove(faulty);
      replacesFramework.appendWebpage(
          new Layouts(
              faulty.conveyFormalities().findBespeak().peek(),
              faulty.conveyFormalities().generateIdem(),
              0),
          faulty.conveyFormalities());

      if (!setConvoy.contains(faulty.conveyFormalities())) {
        this.electWork(faulty.conveyFormalities());
      }
    }

    if (rifeSue != null) {
      hoursRetaining--;

      if (rifeSue.isEnded()) {
        rifeSue.laidLeaveClip(this.obtainLiveTic());
        this.finalizedLitigate.addLast(rifeSue);
        rifeSue = null;
      }

      if (hoursRetaining == 0 && rifeSue != null) {

        if (setConvoy.isEmpty()) {
          hoursRetaining = SentenceTeleportation;
        } else {
          this.electWork(rifeSue);
          rifeSue = null;
        }
      }
    }

    if (rifeSue == null && !setConvoy.isEmpty()) {
      rifeSue = this.quickAppendage();
      hoursRetaining = SentenceTeleportation;
    }

    this.workExpectedMotion();
  }

  private ArrayDeque<Flaw> carelessnessDipper;

  public synchronized Operation quickAppendage() {
    return setConvoy.removeFirst();
  }

  private ArrayDeque<Operation> setConvoy;
  private int hoursRetaining;
}
