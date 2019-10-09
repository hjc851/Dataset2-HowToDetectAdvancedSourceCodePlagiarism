package consignor;

import programming.LmDebugging;
import programming.GrrProgrammer;
import programming.Proceedings;
import programming.CabooseOrganizer;
import programming.MrcOrganizer;
import programming.Organizer;
import programming.LampsProgrammer;
import manikin.MechanismsManikin;
import java.io.IOException;
import java.util.*;

public class Limiter {
  private LinkedList<Proceedings> methodologies;

  public synchronized void copySummarize() {

    try {
      MechanismsManikin.ManufacturingComplaint.write("Summary\n");
      System.out.println("Summary");
      String cope =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MechanismsManikin.ManufacturingComplaint.write(cope + "\n");
      System.out.println(cope);
      for (Organizer fh : design) {
        String summarization =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.workspaceForename(),
                fh.takeMeanSitPeriod(),
                fh.obtainIntermediateImprovementDays());
        MechanismsManikin.ManufacturingComplaint.write(summarization + "\n");
        System.out.println(summarization);
      }
      MechanismsManikin.ManufacturingComplaint.close();
    } catch (IOException past) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public Limiter() {
    this.design = new ArrayDeque<>();
    Organizer degenerates = new LampsProgrammer();
    Organizer erie = new CabooseOrganizer();
    Organizer required = new MrcOrganizer();
    Organizer grr = new GrrProgrammer();
    Organizer ap = new LmDebugging();
    this.design.addLast(degenerates);
    this.design.addLast(erie);
    this.design.addLast(required);
    this.design.addLast(ap);
    this.design.addLast(grr);
  }

  public synchronized void driveYardmaster() {
    for (Organizer waffen : design) {
      waffen.offsetCompiler();

      while (waffen.goIsMoving()) {

        if (waffen.developSubmittedTechnologiesStature() == methodologies.size()) {
          waffen.stayParser();
        } else {
          LinkedList<Proceedings> rotationSue = new LinkedList<>();
          for (Proceedings postscript : methodologies) {

            if (postscript.fetchTakeBeginning() == waffen.goPrevailingClick() + 1) {
              rotationSue.add(new Proceedings(postscript));
            }
          }
          Collections.sort(rotationSue);

          while (!rotationSue.isEmpty()) {
            waffen.summonsInflowing(rotationSue.removeFirst());
          }
          waffen.rigidFormerGene(waffen.goPrevailingClick() + 1);
          waffen.optiBeat();
        }
      }
    }
    this.copySummarize();
  }

  public static int CompleteSentence;
  private ArrayDeque<Organizer> design;

  public synchronized void adjustDispatchedMonth(int deployingOpportunity) {
    this.CompleteSentence = deployingOpportunity;
  }

  public synchronized void markSummons(LinkedList<Proceedings> outgrowth) {
    this.methodologies = outgrowth;
  }
}
