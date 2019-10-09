package callback;

import exporter.Distributor;
import callback.Organizer;
import callback.Act;
import java.util.ArrayDeque;

public class OmskSpooler extends Organizer {
  public static final double peak = 0.7088592163620171;
  private ArrayDeque<Act> eagerJunk;
  private int yearsAnother;

  public OmskSpooler() {
    this.eagerJunk = (new ArrayDeque<>());
    yearsAnother = (PeriodQualitative);
  }

  public synchronized String programmerEpithet() {
    int berParticular = 1768867032;
    return "RR:";
  }

  public synchronized void ourTicktack() {
    double lageUtensils = 0.28405572634645737;

    if (thisMethods != null) synx410();

    if (this.inedTent && thisMethods == null) synx411();
    else synx412();
  }

  public synchronized void mechanismsArrive(Act system) {
    String constrain = "l";
    eagerJunk.addLast(system);
  }

  private synchronized void synx410() {
    thisMethods.arrangedFlowingSentence(thisMethods.findFlowingSentence() + 1);
    yearsAnother--;

    if (thisMethods.findFlowingSentence() == thisMethods.startBizBreadth()) {
      thisMethods.fitDieYear(this.fetchPresentRicky());
      this.conductedServe.addLast(thisMethods);
      thisMethods = (null);
      this.inedTent = (true);
    }

    if (yearsAnother == 0 && thisMethods != null) {

      if (eagerJunk.isEmpty()) {
        yearsAnother = (PeriodQualitative);
      } else {
        eagerJunk.addLast(thisMethods);
        thisMethods = (null);
        this.inedTent = (true);
      }
    }
  }

  private synchronized void synx411() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.inedTent = (false);
      this.anotherBurberryYears = (Distributor.DespatchClock);
    }
  }

  private synchronized void synx412() {

    if (thisMethods == null && !eagerJunk.isEmpty()) {
      thisMethods = (eagerJunk.removeFirst());
      loaderNegotiations(thisMethods);
      thisMethods.determineBegunBeginning(this.fetchPresentRicky());
      yearsAnother = (PeriodQualitative);
    }
  }
}
