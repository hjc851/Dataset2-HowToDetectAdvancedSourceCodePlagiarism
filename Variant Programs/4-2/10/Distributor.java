import java.util.*;

public class Distributor {
  private java.util.ArrayDeque<Programmer> local;
  private int generMethodology;
  private java.util.LinkedList<Appendage> ReplacementMarch;
  private java.util.LinkedList<Appendage> TimeProcedure;

  public Distributor() {
    this.local = new java.util.ArrayDeque<>();
    Programmer diddle = new ApDatabase();
    this.local.addLast(diddle);
  }

  public void arrangedFifoAct(java.util.LinkedList<Appendage> method) {
    this.generMethodology = method.size();
    this.ReplacementMarch = method;
  }

  public void markHourSummons(java.util.LinkedList<Appendage> methods) {
    this.generMethodology = methods.size();
    this.TimeProcedure = methods;
  }

  public void driveYardmaster() {
    this.footraceSpooler(new ApDatabase(), this.ReplacementMarch, "LRU");
    this.footraceSpooler(new ApDatabase(), this.TimeProcedure, "CLOCK");
  }

  private void footraceSpooler(
      Programmer organizer,
      java.util.LinkedList<Appendage> prevailingProcedure,
      java.lang.String replaces) {
    organizer.commenceProgramming(replaces);
    java.util.Collections.sort(prevailingProcedure);

    while (!prevailingProcedure.isEmpty()) {
      organizer.arrivalMethodology(prevailingProcedure.removeFirst());
    }

    while (organizer.goIsMoving()) {

      if (organizer.catchFinalizeSueScale() == generMethodology) {
        organizer.hitchMultitasking(replaces);
      } else {
        organizer.fixedTheSelect(organizer.fixNewTally() + 1);
        organizer.nsoTic();
      }
    }
  }
}
