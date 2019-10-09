import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Nebraska extends AlternativeWay {
  public final int KateBoxes = 30;
  public java.util.Queue<Website> Sashes;

  public Nebraska() {
    this.Sashes = new java.util.LinkedList<>();
  }

  protected synchronized void totalWeb(Website homepage, Appendage previousProceeding) {

    if (this.isComplete()
        || previousProceeding.bringRepWebpages() == previousProceeding.startCeilingScript()) {
      this.ridSummary(previousProceeding);
    }

    java.util.List<Website> time = new java.util.LinkedList<>();
    for (Website f : Sashes) {

      if (f.takeFinger() == homepage.takeFinger()
          && f.becomeInterruptMethodology() == previousProceeding.beatUser()) time.add(f);
    }
    Website prevailing = null;

    if (time.size() > 0) prevailing = time.get(0);

    if (prevailing == null) {
      Sashes.add(homepage);
      previousProceeding.putEprPageboy(previousProceeding.bringRepWebpages() + 1);
    } else {
      prevailing.revertNegative();
    }
  }

  public synchronized void ridSummary(Appendage presentNegotiations) {
    java.util.function.Predicate<Website> amoxil =
        new java.util.function.Predicate<Website>() {

          public synchronized boolean test(Website writes) {
            return writes.becomeInterruptMethodology() == presentNegotiations.beatUser();
          }
        };
    Website happiest =
        Sashes.stream()
            .filter(amoxil)
            .max(java.util.Comparator.comparingInt(Website::developPiece))
            .get();
    Sashes.remove(happiest);
  }

  public synchronized boolean testProposal(Appendage liveOutgrowth) {
    Sashes.forEach(Website::gainReverse);
    java.util.List<Website> sheet = new java.util.ArrayList<>();
    for (Website Period : Sashes) {

      if (liveOutgrowth.startApplication().peek().equals(Period.takeFinger())
          && liveOutgrowth.beatUser() == Period.becomeInterruptMethodology()) {
        sheet.add(Period);
      }
    }

    if (sheet.size() > 0) {
      sheet.forEach(Website::revertNegative);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Sashes.size() >= KateBoxes;
  }
}
