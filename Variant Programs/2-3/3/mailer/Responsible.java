package mailer;

import parser.ConWorkflow;
import parser.GrrProgrammer;
import parser.March;
import parser.StaOutliner;
import parser.IncreasedSynchronizer;
import parser.Compiler;
import parser.LampsProgrammer;
import faker.SummonsFaker;
import java.io.IOException;
import java.util.*;

public class Responsible {
  private ArrayDeque<Compiler> design;
  private LinkedList<March> outgrowth;
  public static int DischargeDays;

  public Responsible() {
    this.design = new ArrayDeque<>();
    Compiler scheduling = new LampsProgrammer();
    Compiler f = new StaOutliner();
    Compiler operated = new IncreasedSynchronizer();
    Compiler grr = new GrrProgrammer();
    Compiler ik = new ConWorkflow();
    this.design.addLast(scheduling);
    this.design.addLast(f);
    this.design.addLast(operated);
    this.design.addLast(ik);
    this.design.addLast(grr);
  }

  public synchronized void orderedMechanisms(LinkedList<March> appendage) {
    this.outgrowth = appendage;
  }

  public synchronized void bentSendingHour(int dispatchesHours) {
    this.DischargeDays = dispatchesHours;
  }

  public synchronized void workForwarder() {
    for (Compiler fh : design) {
      fh.kickoffSpooler();

      while (fh.goIsMoving()) {

        if (fh.generatePerformedTreatFootprint() == outgrowth.size()) {
          fh.quitProgramming();
        } else {
          LinkedList<March> begunTreat = new LinkedList<>();
          for (March postscript : outgrowth) {

            if (postscript.makeReceiveDay() == fh.haveCirculatingShudder() + 1) {
              begunTreat.add(new March(postscript));
            }
          }
          Collections.sort(begunTreat);

          while (!begunTreat.isEmpty()) {
            fh.methodsElected(begunTreat.removeFirst());
          }
          fh.bentPreviousAnswer(fh.haveCirculatingShudder() + 1);
          fh.bpsRetick();
        }
      }
    }
    this.engravingGist();
  }

  public synchronized void engravingGist() {

    try {
      SummonsFaker.ExportationPapers.write("Summary\n");
      System.out.println("Summary");
      String caption =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SummonsFaker.ExportationPapers.write(caption + "\n");
      System.out.println(caption);
      for (Compiler ora : design) {
        String recap =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.databaseNickname(),
                ora.producePercentageTakeNow(),
                ora.bringMiddlingTurnaboutMeter());
        SummonsFaker.ExportationPapers.write(recap + "\n");
        System.out.println(recap);
      }
      SummonsFaker.ExportationPapers.close();
    } catch (IOException abel) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
