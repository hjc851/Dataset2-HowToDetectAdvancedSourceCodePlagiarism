import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Georgia extends SwitchApproach {
  private final int HighBezel = 30;
  private Queue<Section> Wheels = null;

  public Georgia() {
    this.Wheels = new LinkedList<>();
  }

  protected synchronized void provideLayout(Section table, Phase actualAct) {

    if (this.isComplete() || actualAct.takeAbortSites() == actualAct.letHighestSheets())
      synx41(actualAct);

    List<Section> geothermometer = new LinkedList<>();
    for (Section f : Wheels) synx42(f, table, actualAct, geothermometer);
    Section circulating = null;

    if (geothermometer.size() > 0) circulating = geothermometer.get(0);

    if (circulating == null) synx43(table, actualAct);
    else synx44(circulating);
  }

  private synchronized void dislodgeSheet(Phase presentlyMechanism) {
    Predicate<Section> cui =
        new Predicate<Section>() {

          public synchronized boolean test(Section postscript) {
            return postscript.canGetCycle() == presentlyMechanism.developPeg();
          }
        };
    Section biggest =
        Wheels.stream().filter(cui).max(Comparator.comparingInt(Section::generateDown)).get();
    Wheels.remove(biggest);
  }

  public synchronized boolean ascertainApplication(Phase liveOutgrowth) {
    Wheels.forEach(Section::riseForesee);
    List<Section> homepage = new ArrayList<>();
    for (Section Period : Wheels) synx45(liveOutgrowth, Period, homepage);

    if (homepage.size() > 0) {
      homepage.forEach(Section::readjustForestall);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Wheels.size() >= HighBezel;
  }

  private synchronized void synx41(Phase actualAct) {
    this.dislodgeSheet(actualAct);
  }

  private synchronized void synx42(
      Section f, Section table, Phase actualAct, java.util.List<Section> geothermometer) {

    if (f.produceMap() == table.produceMap() && f.canGetCycle() == actualAct.developPeg())
      geothermometer.add(f);
  }

  private synchronized void synx43(Section table, Phase actualAct) {
    Wheels.add(table);
    actualAct.fixRetrievePubs(actualAct.takeAbortSites() + 1);
  }

  private synchronized void synx44(Section circulating) {
    circulating.readjustForestall();
  }

  private synchronized void synx45(
      Phase liveOutgrowth, Section Period, java.util.List<Section> homepage) {

    if (liveOutgrowth.arriveInvitations().peek().equals(Period.produceMap())
        && liveOutgrowth.developPeg() == Period.canGetCycle()) {
      homepage.add(Period);
    }
  }
}
