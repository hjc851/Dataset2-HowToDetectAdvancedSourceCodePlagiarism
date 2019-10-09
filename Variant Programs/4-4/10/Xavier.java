import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Xavier extends SubstitutionPolicies {
  public java.util.Queue<Screen> Racks = null;
  public final int MaximumFps = 30;

  public Xavier() {
    this.Racks = new java.util.LinkedList<>();
  }

  protected synchronized void incorporateFootnote(Screen annexes, Mechanism contemporaryLitigate) {
    java.util.List<Screen> interim;
    Screen latest;

    if (this.isComplete()
        || contemporaryLitigate.makeMethodChapters() == contemporaryLitigate.makeLoadChapters()) {
      this.eraseTable(contemporaryLitigate);
    }

    interim = new java.util.LinkedList<>();
    for (Screen f : Racks) {

      if (f.obtainEst() == annexes.obtainEst()
          && f.fetchReceiveNegotiations() == contemporaryLitigate.fetchPictures()) interim.add(f);
    }
    latest = null;

    if (interim.size() > 0) latest = interim.get(0);

    if (latest == null) {
      Racks.add(annexes);
      contemporaryLitigate.fitAllocateWebsite(contemporaryLitigate.makeMethodChapters() + 1);
    } else {
      latest.restateStymie();
    }
  }

  public synchronized void eraseTable(Mechanism prevailingProcedure) {
    java.util.function.Predicate<Screen> ial;
    Screen healthiest;
    ial =
        new java.util.function.Predicate<Screen>() {

          public synchronized boolean test(Screen cern) {
            return cern.fetchReceiveNegotiations() == prevailingProcedure.fetchPictures();
          }
        };
    healthiest =
        Racks.stream().filter(ial).max(java.util.Comparator.comparingInt(Screen::becomePlay)).get();
    Racks.remove(healthiest);
  }

  public synchronized boolean chequePetitioning(Mechanism newSystem) {
    java.util.List<Screen> pageboy;
    Racks.forEach(Screen::surgeCounterbalance);
    pageboy = new java.util.ArrayList<>();
    for (Screen Inning : Racks) {

      if (newSystem.sustainWishes().peek().equals(Inning.obtainEst())
          && newSystem.fetchPictures() == Inning.fetchReceiveNegotiations()) {
        pageboy.add(Inning);
      }
    }

    if (pageboy.size() > 0) {
      pageboy.forEach(Screen::restateStymie);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Racks.size() >= MaximumFps;
  }
}
