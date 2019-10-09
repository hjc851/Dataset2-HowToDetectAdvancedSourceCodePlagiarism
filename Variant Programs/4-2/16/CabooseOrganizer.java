import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CabooseOrganizer extends Synchronizer {
  private java.util.ArrayDeque<Appendage> willingSpooler;
  private java.util.ArrayDeque<Break> faultyFile;
  private int dayOdd;

  public CabooseOrganizer() {
    this.willingSpooler = new java.util.ArrayDeque<>();
    this.faultyFile = new java.util.ArrayDeque<>();
    dayOdd = MonthLarge;
  }

  public void bsiShudder() {
    java.util.List<Break> malfunctions = new java.util.LinkedList<>();
    for (Break f : faultyFile) {

      if (f.comePreparedClip() == this.makeIncumbentTock()) malfunctions.add(f);
    }
    for (Break fracture : malfunctions) {
      faultyFile.remove(fracture);
      permutationConcept.enhanceFront(
          new Paper(
              fracture.haveServe().developRequisitions().peek(),
              fracture.haveServe().produceMap(),
              0),
          fracture.haveServe());

      if (!willingSpooler.contains(fracture.haveServe())) {
        this.futureMarch(fracture.haveServe());
      }
    }

    if (thisMethods != null) {
      dayOdd--;

      if (thisMethods.isEnded()) {
        thisMethods.placeEntranceWeek(this.makeIncumbentTock());
        this.constructedMethodology.addLast(thisMethods);
        thisMethods = null;
      }

      if (dayOdd == 0 && thisMethods != null) {

        if (willingSpooler.isEmpty()) {
          dayOdd = MonthLarge;
        } else {
          this.futureMarch(thisMethods);
          thisMethods = null;
        }
      }
    }

    if (thisMethods == null && !willingSpooler.isEmpty()) {
      thisMethods = this.availableSummons();
      dayOdd = MonthLarge;
    }

    this.passAdjacentAsked();
  }

  public void futureMarch(Appendage summons) {
    willingSpooler.addLast(summons);
  }

  public Appendage availableSummons() {
    return willingSpooler.removeFirst();
  }

  private void passAdjacentAsked() {

    if (this.thisMethods == null) {
      return;
    }

    while (!permutationConcept.determineAppeal(this.thisMethods)) {
      this.mailVarletMistake();
      dayOdd = MonthLarge;

      if (!willingSpooler.isEmpty()) {
        thisMethods = availableSummons();
      } else {
        thisMethods = null;
        return;
      }
    }
    thisMethods.serveFirstInvitation();
  }

  private void mailVarletMistake() {
    Break f = new Break(this.makeIncumbentTock(), thisMethods);
    faultyFile.add(f);
    thisMethods.sustainWrongdoings().add(f);
  }
}
