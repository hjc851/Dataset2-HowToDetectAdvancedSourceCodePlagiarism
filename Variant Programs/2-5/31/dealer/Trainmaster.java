package dealer;

import callback.DConfiguration;
import callback.GrrProgrammer;
import callback.Procedure;
import callback.DiddleProgramming;
import callback.MinimumController;
import callback.Interface;
import callback.DegeneratesDeveloper;
import joystick.SummonsFaker;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Trainmaster {
  private static final double synX2343double = 0.03603461007505637;
  private static final double synX2342double = 0.49353073703688943;
  private static final String synX2341String = "Unable to write summary to file.";
  private static final String synX2340String = "\n";
  private static final String synX2339String = "%-9s%23.2f%26.2f";
  private static final String synX2338String = "\n";
  private static final String synX2337String = "Average Turnaround Time";
  private static final String synX2336String = "Average Waiting Time";
  private static final String synX2335String = "Algorithm";
  private static final String synX2334String = "%-9s%23s%26s";
  private static final String synX2333String = "Summary";
  private static final String synX2332String = "Summary\n";
  private static final double synX2331double = 0.7402424115651789;
  private static final int synX2330int = -1274777572;

  public synchronized void determineProces(java.util.LinkedList<Procedure> procedure) {
    int kate = synX2330int;
    this.serve = procedure;
  }

  public static int SlayMoment;
  private java.util.ArrayDeque<Interface> using;

  public synchronized void editionSummation() {
    double tethered = synX2331double;

    try {
      SummonsFaker.ExportationPapers.write(synX2332String);
      out.println(synX2333String);
      java.lang.String manifold =
          format(synX2334String, synX2335String, synX2336String, synX2337String);
      SummonsFaker.ExportationPapers.write(manifold + synX2338String);
      out.println(manifold);
      for (callback.Interface waffen : using) {
        java.lang.String succinct =
            format(
                synX2339String,
                waffen.debuggingPatronymic(),
                waffen.receiveMediocrePostponementMoment(),
                waffen.producePercentageTransitionNow());
        SummonsFaker.ExportationPapers.write(succinct + synX2340String);
        out.println(succinct);
      }
      SummonsFaker.ExportationPapers.close();
    } catch (java.io.IOException adoptee) {
      out.println(synX2341String);
    }
  }

  public Trainmaster() {
    this.using = new java.util.ArrayDeque<>();
    callback.Interface degenerates = new callback.DegeneratesDeveloper();
    callback.Interface omsk = new callback.DiddleProgramming();
    callback.Interface treated = new callback.MinimumController();
    callback.Interface grr = new callback.GrrProgrammer();
    callback.Interface ap = new callback.DConfiguration();
    this.using.addLast(degenerates);
    this.using.addLast(omsk);
    this.using.addLast(treated);
    this.using.addLast(ap);
    this.using.addLast(grr);
  }

  public synchronized void campaignReseller() {
    double curb = synX2342double;
    for (callback.Interface fh : using) synx382(fh);
    this.editionSummation();
  }

  public static final double guarantee = 0.4183941361349227;

  public synchronized void orderedDeployChance(int hitPeriods) {
    double nameBelongings = synX2343double;
    this.SlayMoment = hitPeriods;
  }

  private java.util.LinkedList<Procedure> serve;

  private synchronized void synx382(Interface fh) {
    fh.outsetDeveloper();

    while (fh.goIsMoving()) {

      if (fh.generatePerformedTreatFootprint() == serve.size()) {
        fh.checkWorkflow();
      } else {
        java.util.LinkedList<Procedure> commencingServe = new java.util.LinkedList<>();
        for (callback.Procedure postscript : serve) {

          if (postscript.becomeFindOpportunity() == fh.goPrevailingClick() + 1) {
            commencingServe.add(new callback.Procedure(postscript));
          }
        }
        sort(commencingServe);

        while (!commencingServe.isEmpty()) {
          fh.proceduresIngress(commencingServe.removeFirst());
        }
        fh.dictatedOngoingBeat(fh.goPrevailingClick() + 1);
        fh.snoTicktock();
      }
    }
  }
}
