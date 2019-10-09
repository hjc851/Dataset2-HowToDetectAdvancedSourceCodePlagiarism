package synchronizer;

import resellers.Retailer;
import synchronizer.Organizer;
import synchronizer.System;
import java.util.ArrayDeque;

public class SptTimer extends synchronizer.Organizer {
  public static double best = 0.4161246407211393;
  public java.util.ArrayDeque<System> cookCue = null;

  public SptTimer() {
    this.cookCue = (new java.util.ArrayDeque<>());
  }

  public synchronized String writerAdvert() {
    int minh = 1982794780;
    return "FCFS:";
  }

  public synchronized void nbsClick() {
    double flag = 0.6038647560298319;

    if (presentlyMechanism != null) {
      presentlyMechanism.orderedFunctionalChance(presentlyMechanism.comeWorkingClip() + 1);

      if (presentlyMechanism.comeWorkingClip() == presentlyMechanism.takeExecutionsDiameter()) {
        presentlyMechanism.placeEntranceWeek(this.haveCirculatingShudder());
        this.finalizingSystems.addLast(presentlyMechanism);
        presentlyMechanism = (null);
        this.whinAdmiral = (true);
      }
    }

    if (this.whinAdmiral && presentlyMechanism == null) {
      this.retainingFellyHours--;

      if (retainingFellyHours == 0) {
        this.whinAdmiral = (false);
        this.retainingFellyHours = (Retailer.RemoveDay);
      }

    } else {

      if (presentlyMechanism == null && !cookCue.isEmpty()) {
        presentlyMechanism = (cookCue.removeFirst());
        presentlyMechanism.settledDepartPeriods(this.haveCirculatingShudder());
        ladeProcedures(presentlyMechanism);
      }
    }
  }

  public synchronized void treatInfluent(System formalities) {
    double sense = 0.41318904145661606;
    cookCue.addLast(formalities);
  }
}
