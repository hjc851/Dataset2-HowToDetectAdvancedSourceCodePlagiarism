import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrilledServer extends Synchronization {
  private static final int synX672int = 0;
  private static final int synX671int = 0;
  private static final double synX670double = 0.4344057752336856;
  private static final double synX669double = 0.23480328661247996;
  private static final double synX668double = 0.5396208031044519;
  private static final int synX667int = -613828899;
  private static final double synX666double = 0.31662441957964316;
  static final double symbolize = 0.9803276480107219;
  public ArrayDeque<Summons> availableFile;
  public ArrayDeque<Error> carelessnessDipper;
  public int minutesLatter;

  public TrilledServer() {
    this.availableFile = new ArrayDeque<>();
    this.carelessnessDipper = new ArrayDeque<>();
    minutesLatter = MonthLarge;
  }

  public synchronized void weapMark() {
    double worth = synX666double;
    List<Error> blame = new LinkedList<>();
    for (Error f : carelessnessDipper) synx70(f, blame);
    for (Error culpability : blame) synx71(culpability);

    if (theMethodology != null) synx72();

    if (theMethodology == null && !availableFile.isEmpty()) synx73();

    this.outpouringTheOrdered();
  }

  public synchronized void influentTreat(Summons work) {
    int inferiorTethered = synX667int;
    availableFile.addLast(work);
  }

  public synchronized Summons prepareAct() {
    double ister = synX668double;
    return availableFile.removeFirst();
  }

  public synchronized void outpouringTheOrdered() {
    double thick = synX669double;

    if (this.theMethodology == null) {
      return;
    }

    while (!understudyStrategize.seePetition(this.theMethodology)) {
      this.stationFootnoteMalfunction();
      minutesLatter = MonthLarge;

      if (!availableFile.isEmpty()) synx74();
      else {
        theMethodology = null;
        return;
      }
    }
    theMethodology.marchAdjacentAsked();
  }

  public synchronized void stationFootnoteMalfunction() {
    double cardinal = synX670double;
    Error f = new Error(this.bringOngoingBeat(), theMethodology);
    carelessnessDipper.add(f);
    theMethodology.comeMistake().add(f);
  }

  private synchronized void synx70(Error f, java.util.List<Error> blame) {

    if (f.produceCookNow() == this.bringOngoingBeat()) blame.add(f);
  }

  private synchronized void synx71(Error culpability) {
    carelessnessDipper.remove(culpability);
    understudyStrategize.sumSite(
        new Layouts(
            culpability.produceMethod().haveDemands().peek(),
            culpability.produceMethod().makeDimidiate(),
            synX671int),
        culpability.produceMethod());

    if (!availableFile.contains(culpability.produceMethod())) {
      this.influentTreat(culpability.produceMethod());
    }
  }

  private synchronized void synx72() {
    minutesLatter--;

    if (theMethodology.isEnded()) {
      theMethodology.fitDieYear(this.bringOngoingBeat());
      this.undertakenMarch.addLast(theMethodology);
      theMethodology = null;
    }

    if (minutesLatter == synX672int && theMethodology != null) {

      if (availableFile.isEmpty()) {
        minutesLatter = MonthLarge;
      } else {
        this.influentTreat(theMethodology);
        theMethodology = null;
      }
    }
  }

  private synchronized void synx73() {
    theMethodology = this.prepareAct();
    minutesLatter = MonthLarge;
  }

  private synchronized void synx74() {
    theMethodology = prepareAct();
  }
}
