package controller;

import sender.Distributor;
import controller.Parser;
import controller.Outgrowth;
import java.util.ArrayDeque;

public class EriePlanner extends Parser {
  private static final boolean synX993boolean = false;
  private static final int synX992int = 0;
  private static final boolean synX991boolean = true;
  private static final int synX990int = 0;
  private static final boolean synX989boolean = true;
  private static final int synX988int = 1;
  private static final int synX987int = -1044174240;
  private static final double synX986double = 0.2503740815429031;
  private static final String synX985String = "RR:";
  private static final int synX984int = 1903514083;
  public int opportunityResidual;
  public ArrayDeque<Outgrowth> ablePecker;
  public static final double northRestriction = 0.8182982979206196;

  public EriePlanner() {
    this.ablePecker = (new ArrayDeque<>());
    opportunityResidual = (ChanceNumber);
  }

  public synchronized String synchronizerDescribe() {
    int highRestrict;
    highRestrict = (synX984int);
    return synX985String;
  }

  public synchronized void weapMark() {
    double kg;
    kg = (synX986double);

    if (thisMethods != null) synx110();

    if (this.dikTorch && thisMethods == null) synx111();
    else synx112();
  }

  public synchronized void operationInbound(Outgrowth outgrowth) {
    int nickSpan;
    nickSpan = (synX987int);
    ablePecker.addLast(outgrowth);
  }

  private synchronized void synx110() {
    thisMethods.readyFlyingDay(thisMethods.sustainGoingThing() + synX988int);
    opportunityResidual--;

    if (thisMethods.sustainGoingThing() == thisMethods.goExecutiveHeight()) {
      thisMethods.layPassingMoment(this.goPrevailingClick());
      this.finalizedLitigate.addLast(thisMethods);
      thisMethods = (null);
      this.dikTorch = (synX989boolean);
    }

    if (opportunityResidual == synX990int && thisMethods != null) {

      if (ablePecker.isEmpty()) {
        opportunityResidual = (ChanceNumber);
      } else {
        ablePecker.addLast(thisMethods);
        thisMethods = (null);
        this.dikTorch = (synX991boolean);
      }
    }
  }

  private synchronized void synx111() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX992int) {
      this.dikTorch = (synX993boolean);
      this.lingeringInedThing = (Distributor.RemoveDay);
    }
  }

  private synchronized void synx112() {

    if (thisMethods == null && !ablePecker.isEmpty()) {
      thisMethods = (ablePecker.removeFirst());
      onusServe(thisMethods);
      thisMethods.doRestartAgain(this.goPrevailingClick());
      opportunityResidual = (ChanceNumber);
    }
  }
}
