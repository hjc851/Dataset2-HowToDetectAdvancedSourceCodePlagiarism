import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OmskSpooler extends Interface {
  private java.util.ArrayDeque<Treat> availableFile = null;
  private java.util.ArrayDeque<Mistake> demeritStandby = null;
  private int junctureMaintaining = 0;

  public OmskSpooler() {
    this.availableFile = new java.util.ArrayDeque<>();
    this.demeritStandby = new java.util.ArrayDeque<>();
    junctureMaintaining = OpportunityDramatic;
  }

  public synchronized void bpsRetick() {
    java.util.List<Mistake> errors = new java.util.LinkedList<>();
    for (Mistake f : demeritStandby) {

      if (f.takeQuickPeriod() == this.goPrevailingClick()) errors.add(f);
    }
    for (Mistake faulty : errors) {
      demeritStandby.remove(faulty);
      replaceableSds.introduceChapter(
          new Annexes(
              faulty.receiveLitigate().generateComplaints().peek(),
              faulty.receiveLitigate().findIdentifier(),
              0),
          faulty.receiveLitigate());

      if (!availableFile.contains(faulty.receiveLitigate())) {
        this.mortarProceedings(faulty.receiveLitigate());
      }
    }

    if (continuingMechanisms != null) {
      junctureMaintaining--;

      if (continuingMechanisms.isEnded()) {
        continuingMechanisms.placedExpireWhen(this.goPrevailingClick());
        this.finalizingSystems.addLast(continuingMechanisms);
        continuingMechanisms = null;
      }

      if (junctureMaintaining == 0 && continuingMechanisms != null) {

        if (availableFile.isEmpty()) {
          junctureMaintaining = OpportunityDramatic;
        } else {
          this.mortarProceedings(continuingMechanisms);
          continuingMechanisms = null;
        }
      }
    }

    if (continuingMechanisms == null && !availableFile.isEmpty()) {
      continuingMechanisms = this.preparedOperation();
      junctureMaintaining = OpportunityDramatic;
    }

    this.moveLastSuggestion();
  }

  public synchronized void mortarProceedings(Treat methods) {
    availableFile.addLast(methods);
  }

  public synchronized Treat preparedOperation() {
    return availableFile.removeFirst();
  }

  private synchronized void moveLastSuggestion() {

    if (this.continuingMechanisms == null) {
      return;
    }

    while (!replaceableSds.curbCalls(this.continuingMechanisms)) {
      this.getTableCriticize();
      junctureMaintaining = OpportunityDramatic;

      if (!availableFile.isEmpty()) {
        continuingMechanisms = preparedOperation();
      } else {
        continuingMechanisms = null;
        return;
      }
    }
    continuingMechanisms.proceedingsTheOrdered();
  }

  private synchronized void getTableCriticize() {
    Mistake f = new Mistake(this.goPrevailingClick(), continuingMechanisms);
    demeritStandby.add(f);
    continuingMechanisms.produceFailures().add(f);
  }
}
