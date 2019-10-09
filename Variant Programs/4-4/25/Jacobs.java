import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jacobs extends PermutationConcept {
  private Queue<Text> Bases = null;
  private final int MaximizeRaster = 30;

  public Jacobs() {
    this.Bases = new LinkedList<>();
  }

  protected synchronized void contributeVarlet(Text tab, Negotiations contemporaryLitigate) {
    List<Text> temporal;
    Text ongoing;

    if (this.isComplete()
        || contemporaryLitigate.sustainRetrievePubs() == contemporaryLitigate.comeLimitVarlet())
      synx160(contemporaryLitigate);

    temporal = new LinkedList<>();
    for (Text f : Bases) synx161(f, tab, contemporaryLitigate, temporal);
    ongoing = null;

    if (temporal.size() > 0) ongoing = temporal.get(0);

    if (ongoing == null) synx162(tab, contemporaryLitigate);
    else synx163(ongoing);
  }

  private synchronized void undoContents(Negotiations presentlyMechanism) {
    Predicate<Text> lunesta;
    Text richest;
    lunesta =
        new Predicate<Text>() {

          public synchronized boolean test(Text writes) {
            return writes.generateAllocateTreat() == presentlyMechanism.canOwnership();
          }
        };
    richest = Bases.stream().filter(lunesta).max(Comparator.comparingInt(Text::fixLot)).get();
    Bases.remove(richest);
  }

  public synchronized boolean chitSuggestion(Negotiations streamPhase) {
    List<Text> annexes;
    Bases.forEach(Text::levelStymie);
    annexes = new ArrayList<>();
    for (Text Period : Bases) synx164(streamPhase, Period, annexes);

    if (annexes.size() > 0) {
      annexes.forEach(Text::zeroDispel);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Bases.size() >= MaximizeRaster;
  }

  private synchronized void synx160(Negotiations contemporaryLitigate) {
    this.undoContents(contemporaryLitigate);
  }

  private synchronized void synx161(
      Text f, Text tab, Negotiations contemporaryLitigate, java.util.List<Text> temporal) {

    if (f.produceMap() == tab.produceMap()
        && f.generateAllocateTreat() == contemporaryLitigate.canOwnership()) temporal.add(f);
  }

  private synchronized void synx162(Text tab, Negotiations contemporaryLitigate) {
    Bases.add(tab);
    contemporaryLitigate.fitAllocateWebsite(contemporaryLitigate.sustainRetrievePubs() + 1);
  }

  private synchronized void synx163(Text ongoing) {
    ongoing.zeroDispel();
  }

  private synchronized void synx164(
      Negotiations streamPhase, Text Period, java.util.List<Text> annexes) {

    if (streamPhase.findBespeak().peek().equals(Period.produceMap())
        && streamPhase.canOwnership() == Period.generateAllocateTreat()) {
      annexes.add(Period);
    }
  }
}
