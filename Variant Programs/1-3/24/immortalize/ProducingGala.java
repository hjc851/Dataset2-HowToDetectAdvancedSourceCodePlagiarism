package immortalize;

import successional.MeterGoalkeeper;
import exporter.Exporter;

public class ProducingGala extends immortalize.SeminarRead
    implements java.lang.Comparable<ProducingGala> {
  public static final java.lang.String LeaveCompleteAim = "WILL_FINISH_OBJECT";
  public static final java.lang.String TushOffset = "CAN_START";
  private exporter.Exporter operator = null;

  public ProducingGala(double periods, String learn, Exporter landlady) {
    this.hour = periods;
    this.media = learn;
    this.operator = landlady;
  }

  public synchronized int compareTo(ProducingGala factors) {

    if (this.hour < factors.hour) return 1;
    else if (this.hour == factors.hour) return 0;
    else return -1;
  }

  public synchronized void serveParade() {
    successional.MeterGoalkeeper.determineBeginning(this.hour);
    this.operator.proceedingNewMatter();
  }

  public synchronized String toString() {
    return "owner: " + operator + " info: " + media + " chrono: " + hour;
  }
}
