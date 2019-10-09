import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Clemson extends ReplenishmentStratagem {
  private final int GreatestBicycles = 30;
  private java.util.Queue<Folio> Cabinets;

  public Clemson() {
    this.Cabinets = new java.util.LinkedList<>();
  }

  protected void enhanceFront(Folio footnote, Formalities continuingMechanisms) {

    if (this.isComplete()
        || continuingMechanisms.startMoveScript() == continuingMechanisms.fetchLotLength()) {
      this.disposeAnnexes(continuingMechanisms);
    }

    java.util.List<Folio> fahrenheit = new java.util.LinkedList<>();
    for (Folio f : Cabinets) {

      if (f.bringCaller() == footnote.bringCaller()
          && f.developHomileticProceeding() == continuingMechanisms.receiveCard())
        fahrenheit.add(f);
    }
    Folio incumbent = null;

    if (fahrenheit.size() > 0) incumbent = fahrenheit.get(0);

    if (incumbent == null) {
      Cabinets.add(footnote);
      continuingMechanisms.placedAddSections(continuingMechanisms.startMoveScript() + 1);
    } else {
      incumbent.reactivateParry();
    }
  }

  private void disposeAnnexes(Formalities presentNegotiations) {
    java.util.function.Predicate<Folio> continua =
        new java.util.function.Predicate<Folio>() {

          public boolean test(Folio cern) {
            return cern.developHomileticProceeding() == presentNegotiations.receiveCard();
          }
        };
    Folio biggest =
        Cabinets.stream()
            .filter(continua)
            .max(java.util.Comparator.comparingInt(Folio::goAct))
            .get();
    Cabinets.remove(biggest);
  }

  public boolean curbCalls(Formalities latestOperation) {
    Cabinets.forEach(Folio::augmentationParry);
    java.util.List<Folio> homepage = new java.util.ArrayList<>();
    for (Folio Compose : Cabinets) {

      if (latestOperation.becomeRequisition().peek().equals(Compose.bringCaller())
          && latestOperation.receiveCard() == Compose.developHomileticProceeding()) {
        homepage.add(Compose);
      }
    }

    if (homepage.size() > 0) {
      homepage.forEach(Folio::reactivateParry);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Cabinets.size() >= GreatestBicycles;
  }
}
