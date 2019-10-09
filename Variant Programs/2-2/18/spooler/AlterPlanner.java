package spooler;

import consignor.Limiter;
import spooler.Workspace;
import spooler.March;
import java.util.ArrayDeque;

public class AlterPlanner extends spooler.Workspace {
  private ArrayDeque<March>[] gonnaCarpark;
  private int amountKeeping;
  private int afootFocus;

  public AlterPlanner() {
    this.gonnaCarpark = new java.util.ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) {
      gonnaCarpark[i] = new java.util.ArrayDeque<>();
    }
    amountKeeping = MeterMeasure;
    afootFocus = 0;
  }

  private spooler.March findSucceedingAct() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        afootFocus = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String spoolerDistinguish() {
    return "FB:";
  }

  public void addTock() {

    if (typicalProceedings != null) {
      typicalProceedings.fitSquirtingYear(typicalProceedings.haveSpoutingPeriods() + 1);
      amountKeeping--;

      if (typicalProceedings.haveSpoutingPeriods() == typicalProceedings.developDirectorStature()) {
        typicalProceedings.situatedMoveMinutes(this.findActualRetick());
        this.finishedOutgrowth.addLast(typicalProceedings);
        typicalProceedings = null;
        this.thmFlagstone = true;
      }

      if (amountKeeping == 0 && typicalProceedings != null) {

        if (primedIsVacant()) {
          amountKeeping = MeterMeasure;
        } else {
          gonnaCarpark[afootFocus + 1].addLast(typicalProceedings);
          typicalProceedings = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && typicalProceedings == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.thmFlagstone = false;
        this.unresolvedLeviChance = Limiter.DeploymentMinutes;
      }

    } else {

      if (typicalProceedings == null && !primedIsVacant()) {
        typicalProceedings = findSucceedingAct();
        payloadOperation(typicalProceedings);
        typicalProceedings.fixEarlyThing(this.findActualRetick());
        amountKeeping = MeterMeasure;
      }
    }
  }

  public void outgrowthSucceeding(March appendage) {
    gonnaCarpark[0].addLast(appendage);
  }
}
