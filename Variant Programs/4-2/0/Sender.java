import java.util.*;

public class Sender {
  private java.util.ArrayDeque<Timer> number;
  private int positionMethodologies;
  private java.util.LinkedList<Formalities> AzimuthMethodologies;
  private java.util.LinkedList<Formalities> TachMarch;

  public Sender() {
    this.number = new java.util.ArrayDeque<>();
    Timer a = new OximeWorkflow();
    this.number.addLast(a);
  }

  public void putHasProcedure(java.util.LinkedList<Formalities> methodologies) {
    this.positionMethodologies = methodologies.size();
    this.AzimuthMethodologies = methodologies;
  }

  public void doWakingTechniques(java.util.LinkedList<Formalities> methods) {
    this.positionMethodologies = methods.size();
    this.TachMarch = methods;
  }

  public void raceShipper() {
    this.footraceSpooler(new OximeWorkflow(), this.AzimuthMethodologies, "LRU");
    this.footraceSpooler(new OximeWorkflow(), this.TachMarch, "CLOCK");
  }

  private void footraceSpooler(
      Timer organizer,
      java.util.LinkedList<Formalities> previousTechnologies,
      java.lang.String replacing) {
    organizer.goTimer(replacing);
    java.util.Collections.sort(previousTechnologies);

    while (!previousTechnologies.isEmpty()) {
      organizer.inCycle(previousTechnologies.removeFirst());
    }

    while (organizer.goIsMoving()) {

      if (organizer.makeUndertakenMarchDimensions() == positionMethodologies) {
        organizer.kiboshSynchronization(replacing);
      } else {
        organizer.rigidFormerGene(organizer.makeIncumbentTock() + 1);
        organizer.bpsRetick();
      }
    }
  }
}
