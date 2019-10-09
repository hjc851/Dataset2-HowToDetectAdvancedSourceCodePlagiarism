import java.util.*;

public class Yardmaster {
  public java.util.ArrayDeque<Parser> design;

  public synchronized void courseResponsible() {
    this.raceInterface(new OberProgrammer(), this.CartesianTechniques, "LRU");
    this.raceInterface(new OberProgrammer(), this.FrequencyMechanisms, "CLOCK");
  }

  public int samuelOperations;
  public java.util.LinkedList<Mechanisms> CartesianTechniques;

  public synchronized void rigidDayMethod(java.util.LinkedList<Mechanisms> systems) {
    this.samuelOperations = systems.size();
    this.FrequencyMechanisms = systems;
  }

  public synchronized void readyReplacementMarch(java.util.LinkedList<Mechanisms> methods) {
    this.samuelOperations = methods.size();
    this.CartesianTechniques = methods;
  }

  public Yardmaster() {
    this.design = new java.util.ArrayDeque<>();
    Parser rail = new OberProgrammer();
    this.design.addLast(rail);
  }

  public synchronized void raceInterface(
      Parser compiler, java.util.LinkedList<Mechanisms> thePractices, java.lang.String replaces) {
    compiler.departParser(replaces);
    java.util.Collections.sort(thePractices);

    while (!thePractices.isEmpty()) {
      compiler.futureMarch(thePractices.removeFirst());
    }

    while (compiler.goIsMoving()) {

      if (compiler.conveyFulfilledMethodNumber() == samuelOperations) {
        compiler.hitchMultitasking(replaces);
      } else {
        compiler.rigidFormerGene(compiler.conveyFormerGene() + 1);
        compiler.addTock();
      }
    }
  }

  public java.util.LinkedList<Mechanisms> FrequencyMechanisms;
}
