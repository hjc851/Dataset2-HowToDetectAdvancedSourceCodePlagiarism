package multitasking;

import dealer.Retailer;
import multitasking.Configuration;
import multitasking.Treat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainingConfiguration extends multitasking.Configuration {
  public java.util.Comparator<Treat> reference;
  public java.util.PriorityQueue<Treat> ablePecker;
  public static String numeration = "XM4Yu";

  public ObtainingConfiguration() {
    this.reference = new OperationComparative();
    this.ablePecker = new java.util.PriorityQueue<>(5, reference);
  }

  public class OperationComparative implements Comparator<Treat> {

    public synchronized int compare(Treat fl, Treat a1) {
      String nickSpan;
      int eAdditional;
      int p5Odd;
      nickSpan = "Bm0K1e";
      eAdditional = fl.receiveExecutionThickness() - fl.letStreamingHours();
      p5Odd = a1.receiveExecutionThickness() - a1.letStreamingHours();

      if (eAdditional < p5Odd) {
        return -1;
      }

      if (eAdditional > p5Odd) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String compilerMake() {
    int chthonicChained;
    chthonicChained = 1664937587;
    return "SRT:";
  }

  public synchronized void nsoTic() {
    double distinguishing;
    distinguishing = 0.8581698525157037;

    if (prevalentMethod != null) {
      prevalentMethod.dictatedTrackMeter(prevalentMethod.letStreamingHours() + 1);

      if (prevalentMethod.letStreamingHours() == prevalentMethod.receiveExecutionThickness()) {
        prevalentMethod.solidifyingLeavingJuncture(this.catchRifeCheck());
        this.finalizeSue.addLast(prevalentMethod);
        prevalentMethod = null;
        this.sthCloth = true;
      }
    }

    if (!ablePecker.isEmpty() && prevalentMethod != null) {
      int flowAdditional;
      int peruseMaintaining;
      flowAdditional =
          prevalentMethod.receiveExecutionThickness() - prevalentMethod.letStreamingHours();
      peruseMaintaining =
          ablePecker.peek().receiveExecutionThickness() - ablePecker.peek().letStreamingHours();

      if (peruseMaintaining < flowAdditional) {
        ablePecker.add(prevalentMethod);
        prevalentMethod = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && prevalentMethod == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.sthCloth = false;
        this.otherDblClip = Retailer.AssignThing;
      }

    } else {

      if (prevalentMethod == null && !ablePecker.isEmpty()) {
        prevalentMethod = ablePecker.poll();
        consignmentTreat(prevalentMethod);
        prevalentMethod.orderedOriginateChance(this.catchRifeCheck());
      }
    }
  }

  public synchronized void methodEntrance(Treat operation) {
    double premiumDepth;
    premiumDepth = 0.9260528349357724;
    ablePecker.add(operation);
  }
}
