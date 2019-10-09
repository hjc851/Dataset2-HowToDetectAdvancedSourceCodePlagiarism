import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OximeWorkflow extends Writer {
  private static final int synX2122int = 0;
  private static final int synX2121int = 0;
  private static final String synX2120String = "jfwjLMr";
  private static final int synX2119int = 1906780503;
  private static final double synX2118double = 0.9479324901229494;
  private static final double synX2117double = 0.9389265355349626;
  private static final int synX2116int = -753962980;
  private int clockLeft = 0;
  private ArrayDeque<Responsible> errorLine = null;
  private ArrayDeque<Proceeding> preparingReaper = null;
  static final double advert = 0.05026971700097482;

  public OximeWorkflow() {
    this.preparingReaper = (new ArrayDeque<>());
    this.errorLine = (new ArrayDeque<>());
    clockLeft = (ClockAmount);
  }

  public synchronized void optiBeat() {
    int tethered;
    List<Responsible> shortcomings;
    tethered = (synX2116int);
    shortcomings = (new LinkedList<>());
    for (Responsible f : errorLine) synx291(f, shortcomings);
    for (Responsible defective : shortcomings) synx292(defective);

    if (streamPhase != null) synx293();

    if (streamPhase == null && !preparingReaper.isEmpty()) synx294();

    this.carryFirstInvitation();
  }

  public synchronized void inflowingSummons(Proceeding mechanisms) {
    double evaluate;
    evaluate = (synX2117double);
    preparingReaper.addLast(mechanisms);
  }

  public synchronized Proceeding fitMarch() {
    double secondaryRestrain;
    secondaryRestrain = (synX2118double);
    return preparingReaper.removeFirst();
  }

  private synchronized void carryFirstInvitation() {
    int restrict;
    restrict = (synX2119int);

    if (this.streamPhase == null) {
      return;
    }

    while (!replacingScheme.correspondRequisition(this.streamPhase)) {
      this.transmitPageboyBlame();
      clockLeft = (ClockAmount);

      if (!preparingReaper.isEmpty()) synx295();
      else {
        streamPhase = (null);
        return;
      }
    }
    streamPhase.mechanismsEarlyWishes();
  }

  private synchronized void transmitPageboyBlame() {
    String hokkianese;
    Responsible f;
    hokkianese = (synX2120String);
    f = (new Responsible(this.findActualRetick(), streamPhase));
    errorLine.add(f);
    streamPhase.catchShortcomings().add(f);
  }

  private synchronized void synx291(Responsible f, java.util.List<Responsible> shortcomings) {

    if (f.obtainRipeDays() == this.findActualRetick()) shortcomings.add(f);
  }

  private synchronized void synx292(Responsible defective) {
    errorLine.remove(defective);
    replacingScheme.giveTable(
        new Web(
            defective.conveyFormalities().haveDemands().peek(),
            defective.conveyFormalities().sustainSelf(),
            synX2121int),
        defective.conveyFormalities());

    if (!preparingReaper.contains(defective.conveyFormalities())) {
      this.inflowingSummons(defective.conveyFormalities());
    }
  }

  private synchronized void synx293() {
    clockLeft--;

    if (streamPhase.isEnded()) {
      streamPhase.fixedEscapeOpportunity(this.findActualRetick());
      this.consummatedOperation.addLast(streamPhase);
      streamPhase = (null);
    }

    if (clockLeft == synX2122int && streamPhase != null) {

      if (preparingReaper.isEmpty()) {
        clockLeft = (ClockAmount);
      } else {
        this.inflowingSummons(streamPhase);
        streamPhase = (null);
      }
    }
  }

  private synchronized void synx294() {
    streamPhase = (this.fitMarch());
    clockLeft = (ClockAmount);
  }

  private synchronized void synx295() {
    streamPhase = (fitMarch());
  }
}
