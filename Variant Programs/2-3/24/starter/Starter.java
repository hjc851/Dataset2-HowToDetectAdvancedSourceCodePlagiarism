package starter;

import timer.FaController;
import timer.GrrProgrammer;
import timer.Method;
import timer.OberProgrammer;
import timer.ObtainingConfiguration;
import timer.Parser;
import timer.UsingProgramming;
import kinematics.MethodsRobot;
import java.io.IOException;
import java.util.*;

public class Starter {
  public java.util.ArrayDeque<Parser> multiple;
  public java.util.LinkedList<Method> methodologies;

  public synchronized void photographySnapshot() {

    try {
      MethodsRobot.PowerApplication.write("Summary\n");
      System.out.println("Summary");
      java.lang.String title =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MethodsRobot.PowerApplication.write(title + "\n");
      System.out.println(title);
      for (timer.Parser fh : multiple) {
        java.lang.String review =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.synchronizationAppoint(),
                fh.driveRatesStayAgain(),
                fh.findNormReverseSentence());
        MethodsRobot.PowerApplication.write(review + "\n");
        System.out.println(review);
      }
      MethodsRobot.PowerApplication.close();
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public static int DetachmentBeginning;

  public synchronized void passMailer() {
    for (timer.Parser ora : multiple) {
      ora.firstPlanner();

      while (ora.goIsMoving()) {

        if (ora.produceUndergoneMethodologiesDensity() == methodologies.size()) {
          ora.periodDatabase();
        } else {
          java.util.LinkedList<Method> fromOperations = new java.util.LinkedList<>();
          for (timer.Method vig : methodologies) {

            if (vig.sustainHearThing() == ora.canExistingDial() + 1) {
              fromOperations.add(new timer.Method(vig));
            }
          }
          java.util.Collections.sort(fromOperations);

          while (!fromOperations.isEmpty()) {
            ora.operationInbound(fromOperations.removeFirst());
          }
          ora.situatedPresentlyMarch(ora.canExistingDial() + 1);
          ora.ourTicktack();
        }
      }
    }
    this.photographySnapshot();
  }

  public synchronized void solidifyingOfficeJuncture(int assignThing) {
    this.DetachmentBeginning = assignThing;
  }

  public Starter() {
    this.multiple = new java.util.ArrayDeque<>();
    timer.Parser lamps = new timer.UsingProgramming();
    timer.Parser ohio = new timer.OberProgrammer();
    timer.Parser obtaining = new timer.ObtainingConfiguration();
    timer.Parser grr = new timer.GrrProgrammer();
    timer.Parser dc = new timer.FaController();
    this.multiple.addLast(lamps);
    this.multiple.addLast(ohio);
    this.multiple.addLast(obtaining);
    this.multiple.addLast(dc);
    this.multiple.addLast(grr);
  }

  public synchronized void settledServe(java.util.LinkedList<Method> summons) {
    this.methodologies = summons;
  }
}
