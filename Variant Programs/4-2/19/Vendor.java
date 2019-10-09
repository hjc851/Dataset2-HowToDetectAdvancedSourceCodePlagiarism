import java.util.*;

public class Vendor {
  private java.util.ArrayDeque<Planner> number;
  private int positionMethodologies;
  private java.util.LinkedList<March> CartelProces;
  private java.util.LinkedList<March> HourSummons;

  public Vendor() {
    this.number = new java.util.ArrayDeque<>();
    Planner icc = new IccParser();
    this.number.addLast(icc);
  }

  public void fixCryptographyMechanism(java.util.LinkedList<March> sue) {
    this.positionMethodologies = sue.size();
    this.CartelProces = sue;
  }

  public void rigidDayMethod(java.util.LinkedList<March> methodologies) {
    this.positionMethodologies = methodologies.size();
    this.HourSummons = methodologies;
  }

  public void testDistributors() {
    this.goOrganizer(new IccParser(), this.CartelProces, "LRU");
    this.goOrganizer(new IccParser(), this.HourSummons, "CLOCK");
  }

  private void goOrganizer(
      Planner callback, java.util.LinkedList<March> formerMethod, java.lang.String alternatives) {
    callback.beganSpreadsheet(alternatives);
    java.util.Collections.sort(formerMethod);

    while (!formerMethod.isEmpty()) {
      callback.arrivalsMechanism(formerMethod.removeFirst());
    }

    while (callback.goIsMoving()) {

      if (callback.canExecutedMethodsAmount() == positionMethodologies) {
        callback.diaphragmWorkspace(alternatives);
      } else {
        callback.rigidFormerGene(callback.goPrevailingClick() + 1);
        callback.optiBeat();
      }
    }
  }
}
