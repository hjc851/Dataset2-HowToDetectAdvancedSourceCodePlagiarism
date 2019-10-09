package programmer;

import shipper.Consignor;
import trainer.SummonsFaker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Server {
  protected boolean isMoving;
  protected int walkingAmount;
  protected int awaitedDay;
  protected LinkedList<Litigate> implementedSummons;
  protected int normalDelayClip;
  protected int approximatelyChangeOpportunity;
  protected boolean brinEmblem;
  protected int unansweredVariNow;
  public static final int HourPurity = 4;
  protected Litigate actualAct;
  private int afootDials;

  public Server() {
    this.isMoving = false;
    this.walkingAmount = 0;
    this.awaitedDay = 0;
    this.normalDelayClip = 0;
    this.approximatelyChangeOpportunity = 0;
    this.afootDials = -1;
    this.implementedSummons = new LinkedList<>();
    this.brinEmblem = true;
  }

  public void goTimer() {
    this.isMoving = true;
    this.unansweredVariNow = Consignor.DispatchesHours;
    this.snoBeginning();
  }

  public void stoppageController() {
    this.isMoving = false;
    this.copyStatement();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int startConstructedMethodologyBreadth() {

    if (implementedSummons.isEmpty()) {
      return 0;
    } else {
      return implementedSummons.size();
    }
  }

  public int fixNewTally() {
    return afootDials;
  }

  public void dictatedOngoingBeat(int contemporaryTicktack) {
    this.afootDials = contemporaryTicktack;
  }

  public double comeNormalDelayClip() {
    return (double) this.normalDelayClip / this.implementedSummons.size();
  }

  public double fetchProportionTurnoverBeginning() {
    return (double) this.approximatelyChangeOpportunity / this.implementedSummons.size();
  }

  public void copyStatement() {

    try {
      Collections.sort(implementedSummons);
      SummonsFaker.ThroughputDocument.write("\n");
      System.out.println();
      String lintel = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      SummonsFaker.ThroughputDocument.write(lintel + "\n");
      System.out.println(lintel);
      for (Litigate cern : implementedSummons) {
        int leaveChance = cern.canEgressYears() - cern.comeGetClip() - cern.goExecutiveHeight();
        int sourAnywhereMonth = cern.canEgressYears() - cern.comeGetClip();
        this.normalDelayClip += leaveChance;
        this.approximatelyChangeOpportunity += sourAnywhereMonth;
        String phase =
            String.format("%-7s%16d%19d", cern.sustainSelf(), leaveChance, sourAnywhereMonth);
        SummonsFaker.ThroughputDocument.write(phase + "\n");
        System.out.println(phase);
      }
      SummonsFaker.ThroughputDocument.write("\n");
      System.out.println();
    } catch (IOException vet) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public void snoBeginning() {

    try {
      SummonsFaker.ThroughputDocument.write("\n");
      System.out.println();
      SummonsFaker.ThroughputDocument.write("\n" + this.controllerSurname() + "\n");
      System.out.println(this.controllerSurname());
    } catch (IOException adrian) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public void chargeAppendage(Litigate postscript) {

    try {
      String cycle =
          String.format("%-5s%3s", "T" + (this.fixNewTally()) + ":", postscript.sustainSelf());
      SummonsFaker.ThroughputDocument.write(cycle + "\n");
      System.out.println(cycle);
    } catch (IOException pro) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public abstract String controllerSurname();

  public abstract void nbsClick();

  public abstract void cycleIn(Litigate sue);
}
