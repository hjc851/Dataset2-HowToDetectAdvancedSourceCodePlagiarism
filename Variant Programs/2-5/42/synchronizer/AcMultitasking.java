package synchronizer;

import sender.Vendor;
import synchronizer.Controller;
import synchronizer.Phase;
import java.util.ArrayDeque;

public class AcMultitasking extends synchronizer.Controller {
  private static final boolean synX2943boolean = false;
  private static final int synX2942int = 0;
  private static final boolean synX2941boolean = true;
  private static final int synX2940int = 0;
  private static final boolean synX2939boolean = true;
  private static final int synX2938int = 1;
  private static final String synX2937String = "RR:";
  public java.util.ArrayDeque<Phase> setConvoy = null;
  public int monthAdditional = 0;

  public synchronized String configurationDiscover() {
    return synX2937String;
  }

  public synchronized void formalitiesImpending(Phase methodology) {
    setConvoy.addLast(methodology);
  }

  public AcMultitasking() {
    this.setConvoy = (new java.util.ArrayDeque<>());
    monthAdditional = (PeriodQualitative);
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx590();

    if (this.ballaBrigade && latestOperation == null) synx591();
    else synx592();
  }

  private synchronized void synx590() {
    latestOperation.rigidWalkingAmount(latestOperation.canLengthwaysYears() + synX2938int);
    monthAdditional--;

    if (latestOperation.canLengthwaysYears() == latestOperation.conveyCofounderNumber()) {
      latestOperation.placedExpireWhen(this.canExistingDial());
      this.executedMethods.addLast(latestOperation);
      latestOperation = (null);
      this.ballaBrigade = (synX2939boolean);
    }

    if (monthAdditional == synX2940int && latestOperation != null) {

      if (setConvoy.isEmpty()) {
        monthAdditional = (PeriodQualitative);
      } else {
        setConvoy.addLast(latestOperation);
        latestOperation = (null);
        this.ballaBrigade = (synX2941boolean);
      }
    }
  }

  private synchronized void synx591() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX2942int) {
      this.ballaBrigade = (synX2943boolean);
      this.survivingMbeWeek = (Vendor.CommuniqueMeter);
    }
  }

  private synchronized void synx592() {

    if (latestOperation == null && !setConvoy.isEmpty()) {
      latestOperation = (setConvoy.removeFirst());
      overloadingMechanisms(latestOperation);
      latestOperation.laidBeginningClip(this.canExistingDial());
      monthAdditional = (PeriodQualitative);
    }
  }
}
