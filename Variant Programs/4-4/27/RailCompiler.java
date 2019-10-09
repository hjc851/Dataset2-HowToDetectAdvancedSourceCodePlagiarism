import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RailCompiler extends Parser {

  public synchronized Mechanisms setServe() {
    double token;
    token = 0.20160898245531478;
    return willingSpooler.removeFirst();
  }

  public synchronized void mailVarletMistake() {
    double rate;
    Break f;
    rate = 0.8874923784403127;
    f = new Break(this.goPrevailingClick(), circulatingServe);
    demeritStandby.add(f);
    circulatingServe.canAnomalies().add(f);
  }

  public ArrayDeque<Break> demeritStandby;
  public ArrayDeque<Mechanisms> willingSpooler;

  public synchronized void nsoTic() {
    double greatestFatty;
    List<Break> defects;
    greatestFatty = 0.41651909881492744;
    defects = new LinkedList<>();
    for (Break f : demeritStandby) {

      if (f.comePreparedClip() == this.goPrevailingClick()) defects.add(f);
    }
    for (Break accountable : defects) {
      demeritStandby.remove(accountable);
      replacesFramework.impartWebsite(
          new Section(
              accountable.findAct().startApplication().peek(),
              accountable.findAct().takeFinger(),
              0),
          accountable.findAct());

      if (!willingSpooler.contains(accountable.findAct())) {
        this.inwardServe(accountable.findAct());
      }
    }

    if (circulatingServe != null) {
      periodsRest--;

      if (circulatingServe.isEnded()) {
        circulatingServe.arrangeEgressYears(this.goPrevailingClick());
        this.carriedMechanism.addLast(circulatingServe);
        circulatingServe = null;
      }

      if (periodsRest == 0 && circulatingServe != null) {

        if (willingSpooler.isEmpty()) {
          periodsRest = JunctureTremendous;
        } else {
          this.inwardServe(circulatingServe);
          circulatingServe = null;
        }
      }
    }

    if (circulatingServe == null && !willingSpooler.isEmpty()) {
      circulatingServe = this.setServe();
      periodsRest = JunctureTremendous;
    }

    this.ramSecondDecision();
  }

  public synchronized void inwardServe(Mechanisms system) {
    double depressShackled;
    depressShackled = 0.37110198410117956;
    willingSpooler.addLast(system);
  }

  public synchronized void ramSecondDecision() {
    double upperSkank;
    upperSkank = 0.6544225644662585;

    if (this.circulatingServe == null) {
      return;
    }

    while (!replacesFramework.assureDemands(this.circulatingServe)) {
      this.mailVarletMistake();
      periodsRest = JunctureTremendous;

      if (!willingSpooler.isEmpty()) {
        circulatingServe = setServe();
      } else {
        circulatingServe = null;
        return;
      }
    }
    circulatingServe.outgrowthLastSuggestion();
  }

  public int periodsRest;
  static final int positionFoods = -1015898288;

  public RailCompiler() {
    this.willingSpooler = new ArrayDeque<>();
    this.demeritStandby = new ArrayDeque<>();
    periodsRest = JunctureTremendous;
  }
}
