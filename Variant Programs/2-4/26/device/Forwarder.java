package device;

import timer.FaController;
import timer.GrrProgrammer;
import timer.Operation;
import timer.AcMultitasking;
import timer.SelectedWorkflow;
import timer.Workspace;
import timer.UsingProgramming;
import demo.MechanismMockup;
import java.io.IOException;
import java.util.*;

public class Forwarder {
  public ArrayDeque<Workspace> using = null;
  public LinkedList<Operation> treat = null;
  public static int ShipmentClip = 0;

  public Forwarder() {
    this.using = new ArrayDeque<>();
    Workspace degenerates = new UsingProgramming();
    Workspace gpa = new AcMultitasking();
    Workspace required = new SelectedWorkflow();
    Workspace grr = new GrrProgrammer();
    Workspace lm = new FaController();
    this.using.addLast(degenerates);
    this.using.addLast(gpa);
    this.using.addLast(required);
    this.using.addLast(lm);
    this.using.addLast(grr);
  }

  public synchronized void fixMechanism(LinkedList<Operation> operations) {
    this.treat = operations;
  }

  public synchronized void situatedDeploymentMinutes(int mailAmount) {
    this.ShipmentClip = mailAmount;
  }

  public synchronized void carryDevice() {
    for (Workspace fh : using) {
      fh.beginProgrammer();

      while (fh.goIsMoving()) {

        if (fh.canExecutedMethodsAmount() == treat.size()) {
          fh.occlusionDebugging();
        } else {
          LinkedList<Operation> earlySummons = new LinkedList<>();
          for (Operation cern : treat) {

            if (cern.receiveDescendMoment() == fh.receiveContemporaryTicktack() + 1) {
              earlySummons.add(new Operation(cern));
            }
          }
          Collections.sort(earlySummons);

          while (!earlySummons.isEmpty()) {
            fh.litigateArriving(earlySummons.removeFirst());
          }
          fh.fixedTheSelect(fh.receiveContemporaryTicktack() + 1);
          fh.ourTicktack();
        }
      }
    }
    this.paperSynopsis();
  }

  public synchronized void paperSynopsis() {

    try {
      MechanismMockup.TurnoutCharge.write("Summary\n");
      System.out.println("Summary");
      String coping =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MechanismMockup.TurnoutCharge.write(coping + "\n");
      System.out.println(coping);
      for (Workspace waffen : using) {
        String summarization =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.synchronizationAppoint(),
                waffen.becomeApproximatelyLingerOpportunity(),
                waffen.receiveMediocreReversionMoment());
        MechanismMockup.TurnoutCharge.write(summarization + "\n");
        System.out.println(summarization);
      }
      MechanismMockup.TurnoutCharge.close();
    } catch (IOException exwife) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
