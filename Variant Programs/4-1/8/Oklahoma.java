import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oklahoma extends TranspositionInitiative {
  private final int CeilingMatrices = 30;
  private Queue<Homepage> Rims;

  public Oklahoma() {
    this.Rims = new LinkedList<>();
  }

  protected void summateTab(Homepage webpage, Summons theMethodology) {

    if (this.isComplete()
        || theMethodology.conveyUnlockSlides() == theMethodology.fetchLotLength()) {
      this.expelPagination(theMethodology);
    }

    List<Homepage> unaccompanied = new LinkedList<>();
    for (Homepage f : Rims) {

      if (f.receiveCard() == webpage.receiveCard()
          && f.drawArithmeticPhase() == theMethodology.beatUser()) unaccompanied.add(f);
    }
    Homepage afoot = null;

    if (unaccompanied.size() > 0) afoot = unaccompanied.get(0);

    if (afoot == null) {
      Rims.add(webpage);
      theMethodology.adjustAntipyreticSite(theMethodology.conveyUnlockSlides() + 1);
    } else {
      afoot.realignCurb();
    }
  }

  private void expelPagination(Summons existingCycle) {
    Predicate<Homepage> acta =
        new Predicate<Homepage>() {

          public boolean test(Homepage vig) {
            return vig.drawArithmeticPhase() == existingCycle.beatUser();
          }
        };
    Homepage youngest =
        Rims.stream().filter(acta).max(Comparator.comparingInt(Homepage::becomePlay)).get();
    Rims.remove(youngest);
  }

  public boolean verificationAsking(Summons latestOperation) {
    Rims.forEach(Homepage::progressionNegate);
    List<Homepage> section = new ArrayList<>();
    for (Homepage Soma : Rims) {

      if (latestOperation.fetchQuestions().peek().equals(Soma.receiveCard())
          && latestOperation.beatUser() == Soma.drawArithmeticPhase()) {
        section.add(Soma);
      }
    }

    if (section.size() > 0) {
      section.forEach(Homepage::realignCurb);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Rims.size() >= CeilingMatrices;
  }
}
