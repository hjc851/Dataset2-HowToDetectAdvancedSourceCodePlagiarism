import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AController extends Controller {
  private static final int synX1376int = 0;
  private static final int synX1375int = 0;
  public int hoursRetaining;
  public java.util.ArrayDeque<Defect> carelessnessDipper;
  public java.util.ArrayDeque<Proceedings> eagerJunk;

  public AController() {
    this.eagerJunk = new java.util.ArrayDeque<>();
    this.carelessnessDipper = new java.util.ArrayDeque<>();
    hoursRetaining = MinutesEnormous;
  }

  public synchronized void ourTicktack() {
    java.util.List<Defect> shortcomings;
    shortcomings = new java.util.LinkedList<>();
    for (Defect f : carelessnessDipper) {

      if (f.fetchPreppedBeginning() == this.producePrevalentScore()) shortcomings.add(f);
    }
    for (Defect liability : shortcomings) {
      carelessnessDipper.remove(liability);
      substituteStrategic.incorporateFootnote(
          new Section(
              liability.conveyFormalities().generateComplaints().peek(),
              liability.conveyFormalities().obtainEst(),
              synX1375int),
          liability.conveyFormalities());

      if (!eagerJunk.contains(liability.conveyFormalities())) {
        this.succeedingOutgrowth(liability.conveyFormalities());
      }
    }

    if (typicalProceedings != null) {
      hoursRetaining--;

      if (typicalProceedings.isEnded()) {
        typicalProceedings.doExodusAgain(this.producePrevalentScore());
        this.finalizedLitigate.addLast(typicalProceedings);
        typicalProceedings = null;
      }

      if (hoursRetaining == synX1376int && typicalProceedings != null) {

        if (eagerJunk.isEmpty()) {
          hoursRetaining = MinutesEnormous;
        } else {
          this.succeedingOutgrowth(typicalProceedings);
          typicalProceedings = null;
        }
      }
    }

    if (typicalProceedings == null && !eagerJunk.isEmpty()) {
      typicalProceedings = this.quickAppendage();
      hoursRetaining = MinutesEnormous;
    }

    this.campaignSoonComplaint();
  }

  public synchronized void succeedingOutgrowth(Proceedings serve) {
    eagerJunk.addLast(serve);
  }

  public synchronized Proceedings quickAppendage() {
    return eagerJunk.removeFirst();
  }

  public synchronized void campaignSoonComplaint() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!substituteStrategic.checkoutInvitation(this.typicalProceedings)) {
      this.dispatchContentsFailures();
      hoursRetaining = MinutesEnormous;

      if (!eagerJunk.isEmpty()) {
        typicalProceedings = quickAppendage();
      } else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.mechanismsEarlyWishes();
  }

  public synchronized void dispatchContentsFailures() {
    Defect f;
    f = new Defect(this.producePrevalentScore(), typicalProceedings);
    carelessnessDipper.add(f);
    typicalProceedings.obtainDemerit().add(f);
  }
}
