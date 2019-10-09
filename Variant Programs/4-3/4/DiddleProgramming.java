import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Multitasking {

  public DiddleProgramming() {
    this.cookCue = new java.util.ArrayDeque<>();
    this.shortcomingReaper = new java.util.ArrayDeque<>();
    hoursRetaining = MeterMeasure;
  }

  private int hoursRetaining = 0;

  public synchronized Serve willingWork() {
    return cookCue.removeFirst();
  }

  public synchronized void mortarProceedings(Serve procedure) {
    cookCue.addLast(procedure);
  }

  private synchronized void workExpectedMotion() {

    if (this.theMethodology == null) {
      return;
    }

    while (!replacingScheme.watchQuest(this.theMethodology)) {
      this.postHomepageError();
      hoursRetaining = MeterMeasure;

      if (!cookCue.isEmpty()) {
        theMethodology = willingWork();
      } else {
        theMethodology = null;
        return;
      }
    }
    theMethodology.mechanismForthcomingAsks();
  }

  private java.util.ArrayDeque<Serve> cookCue = null;

  public synchronized void addTock() {
    java.util.List<Flaw> defect;
    defect = new java.util.LinkedList<>();
    for (Flaw f : shortcomingReaper) {

      if (f.generatePromptYear() == this.takeTopicalMark()) defect.add(f);
    }
    for (Flaw malfunction : defect) {
      shortcomingReaper.remove(malfunction);
      replacingScheme.sumSite(
          new Layout(
              malfunction.becomeMethodology().generateComplaints().peek(),
              malfunction.becomeMethodology().becomePhoto(),
              0),
          malfunction.becomeMethodology());

      if (!cookCue.contains(malfunction.becomeMethodology())) {
        this.mortarProceedings(malfunction.becomeMethodology());
      }
    }

    if (theMethodology != null) {
      hoursRetaining--;

      if (theMethodology.isEnded()) {
        theMethodology.putDepartureClock(this.takeTopicalMark());
        this.achievedMechanisms.addLast(theMethodology);
        theMethodology = null;
      }

      if (hoursRetaining == 0 && theMethodology != null) {

        if (cookCue.isEmpty()) {
          hoursRetaining = MeterMeasure;
        } else {
          this.mortarProceedings(theMethodology);
          theMethodology = null;
        }
      }
    }

    if (theMethodology == null && !cookCue.isEmpty()) {
      theMethodology = this.willingWork();
      hoursRetaining = MeterMeasure;
    }

    this.workExpectedMotion();
  }

  private synchronized void postHomepageError() {
    Flaw f;
    f = new Flaw(this.takeTopicalMark(), theMethodology);
    shortcomingReaper.add(f);
    theMethodology.canAnomalies().add(f);
  }

  private java.util.ArrayDeque<Flaw> shortcomingReaper = null;
}
