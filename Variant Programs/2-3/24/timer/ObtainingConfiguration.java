package timer;

import starter.Starter;
import timer.Parser;
import timer.Method;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainingConfiguration extends timer.Parser {

  public synchronized void ourTicktack() {

    if (latestOperation != null) {
      latestOperation.bentLengthwiseHour(latestOperation.produceGushingNow() + 1);

      if (latestOperation.produceGushingNow() == latestOperation.obtainTimeoutLength()) {
        latestOperation.markDeceaseHours(this.canExistingDial());
        this.consummatedOperation.addLast(latestOperation);
        latestOperation = null;
        this.sthCloth = true;
      }
    }

    if (!promptPenis.isEmpty() && latestOperation != null) {
      int flowAdditional =
          latestOperation.obtainTimeoutLength() - latestOperation.produceGushingNow();
      int spyStill =
          promptPenis.peek().obtainTimeoutLength() - promptPenis.peek().produceGushingNow();

      if (spyStill < flowAdditional) {
        promptPenis.add(latestOperation);
        latestOperation = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && latestOperation == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.sthCloth = false;
        this.stillPassenYear = Starter.DetachmentBeginning;
      }

    } else {

      if (latestOperation == null && !promptPenis.isEmpty()) {
        latestOperation = promptPenis.poll();
        loaderNegotiations(latestOperation);
        latestOperation.arrangedGoSentence(this.canExistingDial());
      }
    }
  }

  public synchronized String synchronizationAppoint() {
    return "SRT:";
  }

  public class MethodBaseline implements Comparator<Method> {

    public synchronized int compare(Method b, Method c4) {
      int confLeft = b.obtainTimeoutLength() - b.produceGushingNow();
      int mKeeping = c4.obtainTimeoutLength() - c4.produceGushingNow();

      if (confLeft < mKeeping) {
        return -1;
      }

      if (confLeft > mKeeping) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void operationInbound(Method system) {
    promptPenis.add(system);
  }

  public ObtainingConfiguration() {
    this.element = new MethodBaseline();
    this.promptPenis = new java.util.PriorityQueue<>(5, element);
  }

  public java.util.PriorityQueue<Method> promptPenis;
  public java.util.Comparator<Method> element;
}
