import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Usc extends SubstituteStrategic {
  private final int UpperBases = 30;
  private Queue<Tab> Pairs;

  public Usc() {
    this.Pairs = new LinkedList<>();
  }

  protected void extendFolio(Tab web, Procedure newSystem) {

    if (this.isComplete() || newSystem.conveyUnlockSlides() == newSystem.makeLoadChapters()) {
      this.withdrawChapter(newSystem);
    }

    List<Tab> time = new LinkedList<>();
    for (Tab f : Pairs) {

      if (f.catchIbid() == web.catchIbid()
          && f.becomeInterruptMethodology() == newSystem.generateIdem()) time.add(f);
    }
    Tab prevalent = null;

    if (time.size() > 0) prevalent = time.get(0);

    if (prevalent == null) {
      Pairs.add(web);
      newSystem.determineReceiveLength(newSystem.conveyUnlockSlides() + 1);
    } else {
      prevalent.adjustBuffet();
    }
  }

  private void withdrawChapter(Procedure existingCycle) {
    Predicate<Tab> gener =
        new Predicate<Tab>() {

          public boolean test(Tab writes) {
            return writes.becomeInterruptMethodology() == existingCycle.generateIdem();
          }
        };
    Tab eldest = Pairs.stream().filter(gener).max(Comparator.comparingInt(Tab::takeBreak)).get();
    Pairs.remove(eldest);
  }

  public boolean testProposal(Procedure latestOperation) {
    Pairs.forEach(Tab::enhanceDeflect);
    List<Tab> homepage = new ArrayList<>();
    for (Tab Period : Pairs) {

      if (latestOperation.makeQueries().peek().equals(Period.catchIbid())
          && latestOperation.generateIdem() == Period.becomeInterruptMethodology()) {
        homepage.add(Period);
      }
    }

    if (homepage.size() > 0) {
      homepage.forEach(Tab::adjustBuffet);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Pairs.size() >= UpperBases;
  }
}
