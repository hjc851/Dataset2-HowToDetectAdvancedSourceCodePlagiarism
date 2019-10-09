import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lus extends ReplaceableSds {
  public final int BundleRims = 30;
  public java.util.Queue<Table> Boxes = null;

  public Lus() {
    this.Boxes = new java.util.LinkedList<>();
  }

  protected synchronized void bringPageboy(Table footnote, Outgrowth afootSummons) {

    if (this.isComplete()
        || afootSummons.becomeInterruptToner() == afootSummons.conveyGreatestSlides()) {
      this.discardScreen(afootSummons);
    }

    java.util.List<Table> geothermometer = new java.util.LinkedList<>();
    for (Table f : Boxes) {

      if (f.generateIdem() == footnote.generateIdem()
          && f.becomeInterruptMethodology() == afootSummons.becomePhoto()) geothermometer.add(f);
    }
    Table former = null;

    if (geothermometer.size() > 0) former = geothermometer.get(0);

    if (former == null) {
      Boxes.add(footnote);
      afootSummons.bentHomileticPpm(afootSummons.becomeInterruptToner() + 1);
    } else {
      former.readjustForestall();
    }
  }

  public synchronized void discardScreen(Outgrowth flowProcedures) {
    java.util.function.Predicate<Table> mundi =
        new java.util.function.Predicate<Table>() {

          public synchronized boolean test(Table postscript) {
            return postscript.becomeInterruptMethodology() == flowProcedures.becomePhoto();
          }
        };
    Table largest =
        Boxes.stream().filter(mundi).max(java.util.Comparator.comparingInt(Table::findBar)).get();
    Boxes.remove(largest);
  }

  public synchronized boolean stayDecision(Outgrowth presentNegotiations) {
    Boxes.forEach(Table::trancheAnticipate);
    java.util.List<Table> table = new java.util.ArrayList<>();
    for (Table Put : Boxes) {

      if (presentNegotiations.goAsking().peek().equals(Put.generateIdem())
          && presentNegotiations.becomePhoto() == Put.becomeInterruptMethodology()) {
        table.add(Put);
      }
    }

    if (table.size() > 0) {
      table.forEach(Table::readjustForestall);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Boxes.size() >= BundleRims;
  }
}
