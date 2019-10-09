package dealer;

import database.AxialInterface;
import database.GrrProgrammer;
import database.Negotiations;
import database.StaOutliner;
import database.DefinedCompiler;
import database.Organizer;
import database.LampsProgrammer;
import mock.ProceedingsKinematics;
import java.io.IOException;
import java.util.*;

public class Plenum {
  public static int DispatchedMonth;
  private java.util.LinkedList<Negotiations> march;
  private java.util.ArrayDeque<Organizer> using;

  public Plenum() {
    database.Organizer lamps;
    database.Organizer lyra;
    database.Organizer treated;
    database.Organizer grr;
    database.Organizer axial;
    this.using = new java.util.ArrayDeque<>();
    lamps = new database.LampsProgrammer();
    lyra = new database.StaOutliner();
    treated = new database.DefinedCompiler();
    grr = new database.GrrProgrammer();
    axial = new database.AxialInterface();
    this.using.addLast(lamps);
    this.using.addLast(lyra);
    this.using.addLast(treated);
    this.using.addLast(axial);
    this.using.addLast(grr);
  }

  public synchronized void readyMarch(java.util.LinkedList<Negotiations> mechanism) {
    this.march = mechanism;
  }

  public synchronized void situatedDeploymentMinutes(int detachmentBeginning) {
    this.DispatchedMonth = detachmentBeginning;
  }

  public synchronized void testDistributors() {
    for (database.Organizer ora : using) synx202(ora);
    this.writtenSummarization();
  }

  public synchronized void writtenSummarization() {

    try {
      java.lang.String headings;
      ProceedingsKinematics.CropData.write("Summary\n");
      System.out.println("Summary");
      headings =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceedingsKinematics.CropData.write(headings + "\n");
      System.out.println(headings);
      for (database.Organizer waffen : using) {
        java.lang.String summarization;
        summarization =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.compilerMake(),
                waffen.producePercentageTakeNow(),
                waffen.fetchProportionTurnoverBeginning());
        ProceedingsKinematics.CropData.write(summarization + "\n");
        System.out.println(summarization);
      }
      ProceedingsKinematics.CropData.close();
    } catch (java.io.IOException afterwards) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx202(Organizer ora) {
    ora.runDebugging();

    while (ora.goIsMoving()) {

      if (ora.fixAchievedMechanismsProportions() == march.size()) {
        ora.haltProgrammer();
      } else {
        java.util.LinkedList<Negotiations> beginAct;
        beginAct = new java.util.LinkedList<>();
        for (database.Negotiations writes : march) {

          if (writes.driveAriseAgain() == ora.makeIncumbentTock() + 1) {
            beginAct.add(new database.Negotiations(writes));
          }
        }
        java.util.Collections.sort(beginAct);

        while (!beginAct.isEmpty()) {
          ora.cycleIn(beginAct.removeFirst());
        }
        ora.situatedPresentlyMarch(ora.makeIncumbentTock() + 1);
        ora.bsiShudder();
      }
    }
  }
}
