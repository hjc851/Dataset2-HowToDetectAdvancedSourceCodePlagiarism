package synchronization;

import salesperson.Resellers;
import synchronization.Writer;
import synchronization.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronization.Writer {
  private java.util.ArrayDeque<GrrProcedure> ablePecker = null;
  private int periodsRest = 0;
  private synchronization.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.ablePecker = new java.util.ArrayDeque<>();
    periodsRest = Writer.AmountMarkers;
  }

  public synchronized String developerIdentify() {
    return "NRR:";
  }

  public synchronized void addTock() {

    if (grrProcedure != null) {
      grrProcedure.layPouringMoment(grrProcedure.obtainScamperingDays() + 1);
      periodsRest--;

      if (grrProcedure.obtainScamperingDays() == grrProcedure.findImplementationSmall()) {
        grrProcedure.fixDepartThing(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(grrProcedure);
        grrProcedure = null;
        this.inedTent = true;
      }

      if (periodsRest == 0 && grrProcedure != null) {

        if (ablePecker.isEmpty()) {
          periodsRest = grrProcedure.bringMeterMeasure();
        } else {

          if (grrProcedure.bringMeterMeasure() > 2) {
            grrProcedure.placedWhenValue(grrProcedure.bringMeterMeasure() - 1);
          }

          ablePecker.addLast(grrProcedure);
          grrProcedure = null;
          this.inedTent = true;
        }
      }
    }

    if (this.inedTent && presentlyMechanism == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.inedTent = false;
        this.unexpendedThmSentence = Resellers.DispatchesHours;
      }

    } else {

      if (grrProcedure == null && !ablePecker.isEmpty()) {
        grrProcedure = ablePecker.removeFirst();
        shipmentOutgrowth(grrProcedure);
        grrProcedure.laidBeginningClip(this.receiveContemporaryTicktack());
        periodsRest = grrProcedure.bringMeterMeasure();
      }
    }
  }

  public synchronized void systemInpouring(Proceedings proceeding) {
    ablePecker.add(new synchronization.GrrProcedure(proceeding));
  }
}
