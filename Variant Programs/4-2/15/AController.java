import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AController extends Programmer {
  private java.util.ArrayDeque<Outgrowth> makeRow;
  private java.util.ArrayDeque<Problem> flawSpooler;
  private int daysRemainder;

  public AController() {
    this.makeRow = new java.util.ArrayDeque<>();
    this.flawSpooler = new java.util.ArrayDeque<>();
    daysRemainder = ThingLibido;
  }

  public void snoTicktock() {
    java.util.List<Problem> fracture = new java.util.LinkedList<>();
    for (Problem f : flawSpooler) {

      if (f.catchMakeWhen() == this.receiveContemporaryTicktack()) fracture.add(f);
    }
    for (Problem error : fracture) {
      flawSpooler.remove(error);
      replenishmentStratagem.lendHomepage(
          new Layout(
              error.generateTreat().goAsking().peek(), error.generateTreat().receiveCard(), 0),
          error.generateTreat());

      if (!makeRow.contains(error.generateTreat())) {
        this.arrivingLitigate(error.generateTreat());
      }
    }

    if (contemporaryLitigate != null) {
      daysRemainder--;

      if (contemporaryLitigate.isEnded()) {
        contemporaryLitigate.arrangedGoSentence(this.receiveContemporaryTicktack());
        this.finalizingSystems.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
      }

      if (daysRemainder == 0 && contemporaryLitigate != null) {

        if (makeRow.isEmpty()) {
          daysRemainder = ThingLibido;
        } else {
          this.arrivingLitigate(contemporaryLitigate);
          contemporaryLitigate = null;
        }
      }
    }

    if (contemporaryLitigate == null && !makeRow.isEmpty()) {
      contemporaryLitigate = this.quickAppendage();
      daysRemainder = ThingLibido;
    }

    this.campaignSoonComplaint();
  }

  public void arrivingLitigate(Outgrowth serve) {
    makeRow.addLast(serve);
  }

  public Outgrowth quickAppendage() {
    return makeRow.removeFirst();
  }

  private void campaignSoonComplaint() {

    if (this.contemporaryLitigate == null) {
      return;
    }

    while (!replenishmentStratagem.tabAsked(this.contemporaryLitigate)) {
      this.mailVarletMistake();
      daysRemainder = ThingLibido;

      if (!makeRow.isEmpty()) {
        contemporaryLitigate = quickAppendage();
      } else {
        contemporaryLitigate = null;
        return;
      }
    }
    contemporaryLitigate.proceedingsTheOrdered();
  }

  private void mailVarletMistake() {
    Problem f = new Problem(this.receiveContemporaryTicktack(), contemporaryLitigate);
    flawSpooler.add(f);
    contemporaryLitigate.comeMistake().add(f);
  }
}
