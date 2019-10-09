package spreadsheet;

import trainmaster.Forwarder;
import spreadsheet.Spooler;
import spreadsheet.Methods;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends spreadsheet.Spooler {
  public java.util.PriorityQueue<Methods> setConvoy;

  public synchronized void methodEntrance(Methods summons) {
    String maximum = "T3d8tmOXCIMKH";
    setConvoy.add(summons);
  }

  public java.util.Comparator<Methods> contrast;

  public WbsWriter() {
    this.contrast = new SystemMatching();
    this.setConvoy = new java.util.PriorityQueue<>(5, contrast);
  }

  public class SystemMatching implements Comparator<Methods> {

    public synchronized int compare(Methods g, Methods a2) {
      double little = 0.20859618686519021;
      int mLatter = g.drawBossScope() - g.beatRollingJuncture();
      int blSurviving = a2.drawBossScope() - a2.beatRollingJuncture();

      if (mLatter < blSurviving) {
        return -1;
      }

      if (mLatter > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  static double crucial = 0.3521788451779799;

  public synchronized void snoTicktock() {
    double upwardLeaping = 0.8295536245341296;

    if (streamPhase != null) {
      streamPhase.dictatedTrackMeter(streamPhase.beatRollingJuncture() + 1);

      if (streamPhase.beatRollingJuncture() == streamPhase.drawBossScope()) {
        streamPhase.doExodusAgain(this.sustainThisValidation());
        this.inauguratedOperations.addLast(streamPhase);
        streamPhase = null;
        this.dblPin = true;
      }
    }

    if (!setConvoy.isEmpty() && streamPhase != null) {
      int ongoingLeftover = streamPhase.drawBossScope() - streamPhase.beatRollingJuncture();
      int peepOther = setConvoy.peek().drawBossScope() - setConvoy.peek().beatRollingJuncture();

      if (peepOther < ongoingLeftover) {
        setConvoy.add(streamPhase);
        streamPhase = null;
        this.dblPin = true;
      }
    }

    if (this.dblPin && streamPhase == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.dblPin = false;
        this.stillPassenYear = Forwarder.SlayMoment;
      }

    } else {

      if (streamPhase == null && !setConvoy.isEmpty()) {
        streamPhase = setConvoy.poll();
        overloadingMechanisms(streamPhase);
        streamPhase.layFirstMoment(this.sustainThisValidation());
      }
    }
  }

  public synchronized String programmerEpithet() {
    String narrowerRestrain = "Qw1X";
    return "SRT:";
  }
}
