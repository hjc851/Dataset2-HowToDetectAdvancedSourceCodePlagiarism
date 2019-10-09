import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Nebraska extends AlternatePolicy {
  public java.util.Queue<Homepage> Paintings = null;
  public final int MarquezSettings = 30;

  public Nebraska() {
    this.Paintings = (new java.util.LinkedList<>());
  }

  protected synchronized void totSheet(Homepage layouts, Proceedings presentNegotiations) {
    java.util.List<Homepage> celsius;
    Homepage afoot;

    if (this.isComplete()
        || presentNegotiations.goEprPageboy() == presentNegotiations.developUltimatePpm())
      synx364(presentNegotiations);

    celsius = (new java.util.LinkedList<>());
    for (Homepage f : Paintings) synx365(f, layouts, presentNegotiations, celsius);
    afoot = (null);

    if (celsius.size() > 0) afoot = (celsius.get(0));

    if (afoot == null) synx366(layouts, presentNegotiations);
    else synx367(afoot);
  }

  public synchronized void dislodgeSheet(Proceedings newSystem) {
    java.util.function.Predicate<Homepage> cui;
    Homepage elder;
    cui =
        (new java.util.function.Predicate<Homepage>() {

          public synchronized boolean test(Homepage cern) {
            return cern.haveActivateServe() == newSystem.receiveCard();
          }
        });
    elder =
        (Paintings.stream()
            .filter(cui)
            .max(java.util.Comparator.comparingInt(Homepage::becomePlay))
            .get());
    Paintings.remove(elder);
  }

  public synchronized boolean checkerBespeak(Proceedings circulatingServe) {
    java.util.List<Homepage> paper;
    Paintings.forEach(Homepage::surgeCounterbalance);
    paper = (new java.util.ArrayList<>());
    for (Homepage Form : Paintings) synx368(circulatingServe, Form, paper);

    if (paper.size() > 0) {
      paper.forEach(Homepage::adjustedTabulator);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Paintings.size() >= MarquezSettings;
  }

  private synchronized void synx364(Proceedings presentNegotiations) {
    this.dislodgeSheet(presentNegotiations);
  }

  private synchronized void synx365(
      Homepage f,
      Homepage layouts,
      Proceedings presentNegotiations,
      java.util.List<Homepage> celsius) {

    if (f.letIdentification() == layouts.letIdentification()
        && f.haveActivateServe() == presentNegotiations.receiveCard()) celsius.add(f);
  }

  private synchronized void synx366(Homepage layouts, Proceedings presentNegotiations) {
    Paintings.add(layouts);
    presentNegotiations.placedAddSections(presentNegotiations.goEprPageboy() + 1);
  }

  private synchronized void synx367(Homepage afoot) {
    afoot.adjustedTabulator();
  }

  private synchronized void synx368(
      Proceedings circulatingServe, Homepage Form, java.util.List<Homepage> paper) {

    if (circulatingServe.beatPetitions().peek().equals(Form.letIdentification())
        && circulatingServe.receiveCard() == Form.haveActivateServe()) {
      paper.add(Form);
    }
  }
}
