import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApDatabase extends Workspace {
  private ArrayDeque<Mechanism> availableFile;
  private ArrayDeque<Glitch> shortcomingReaper;
  private int minutesLatter;

  public ApDatabase() {
    this.availableFile = new ArrayDeque<>();
    this.shortcomingReaper = new ArrayDeque<>();
    minutesLatter = PeriodsGigantic;
  }

  public void ourTicktack() {
    List<Glitch> defects = new LinkedList<>();
    for (Glitch f : shortcomingReaper) {

      if (f.beatReluctantJuncture() == this.conveyFormerGene()) defects.add(f);
    }
    for (Glitch error : defects) {
      shortcomingReaper.remove(error);
      fallbackStrategist.provideLayout(
          new Sheet(
              error.produceMethod().startApplication().peek(),
              error.produceMethod().findIdentifier(),
              0),
          error.produceMethod());

      if (!availableFile.contains(error.produceMethod())) {
        this.enteringAppendage(error.produceMethod());
      }
    }

    if (theMethodology != null) {
      minutesLatter--;

      if (theMethodology.isEnded()) {
        theMethodology.readyOutletDay(this.conveyFormerGene());
        this.conductedServe.addLast(theMethodology);
        theMethodology = null;
      }

      if (minutesLatter == 0 && theMethodology != null) {

        if (availableFile.isEmpty()) {
          minutesLatter = PeriodsGigantic;
        } else {
          this.enteringAppendage(theMethodology);
          theMethodology = null;
        }
      }
    }

    if (theMethodology == null && !availableFile.isEmpty()) {
      theMethodology = this.fitMarch();
      minutesLatter = PeriodsGigantic;
    }

    this.moveLastSuggestion();
  }

  public void enteringAppendage(Mechanism proceeding) {
    availableFile.addLast(proceeding);
  }

  public Mechanism fitMarch() {
    return availableFile.removeFirst();
  }

  private void moveLastSuggestion() {

    if (this.theMethodology == null) {
      return;
    }

    while (!fallbackStrategist.stayDecision(this.theMethodology)) {
      this.beamAddendumAnomaly();
      minutesLatter = PeriodsGigantic;

      if (!availableFile.isEmpty()) {
        theMethodology = fitMarch();
      } else {
        theMethodology = null;
        return;
      }
    }
    theMethodology.workCloseQuest();
  }

  private void beamAddendumAnomaly() {
    Glitch f = new Glitch(this.conveyFormerGene(), theMethodology);
    shortcomingReaper.add(f);
    theMethodology.arriveDeficiencies().add(f);
  }
}
