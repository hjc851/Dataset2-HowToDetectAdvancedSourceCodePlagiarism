package trainer;

import maturational.DaysHandler;
import produceProjectiles.PhyllosilicatePreclude;
import director.*;
import store.*;
import commemorate.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Simulator {

  public Simulator(double monthRestricting, double classicalMeanspirited, double criterionScope) {
    this.clipLimitation = (monthRestricting);
    this.criterionEntail = (classicalMeanspirited);
    this.casebookSwan = (criterionScope);
    this.paradeConvoy = (new ExtravaganzaWait());
    this.presenter = (new Production[8]);
    this.depot = (new Depot[5]);
    depot[0] = (new Depot());
    depot[1] = (new Depot());
    depot[2] = (new Depot());
    depot[3] = (new Depot());
    depot[4] = (new Depot());
    presenter[0] = (new OperatorOriginate(this.criterionEntail, this.casebookSwan, depot[0]));
    presenter[1] =
        (new PresenterOutpost(this.criterionEntail, this.casebookSwan, depot[1], depot[0]));
    presenter[2] =
        (new PresenterOutpost(
            this.criterionEntail * 2.0, this.casebookSwan * 2.0, depot[2], depot[1]));
    presenter[3] =
        (new PresenterOutpost(
            this.criterionEntail * 2.0, this.casebookSwan * 2.0, depot[2], depot[1]));
    presenter[4] =
        (new PresenterOutpost(this.criterionEntail, this.casebookSwan, depot[3], depot[2]));
    presenter[5] =
        (new PresenterOutpost(
            this.criterionEntail * 2.0, this.casebookSwan * 2.0, depot[4], depot[3]));
    presenter[6] =
        (new PresenterOutpost(
            this.criterionEntail * 2.0, this.casebookSwan * 2.0, depot[4], depot[3]));
    presenter[7] = (new CommodityCompleted(this.criterionEntail, this.casebookSwan, depot[4]));
    depot[0].putFuture(presenter[1]);
    depot[0].solidifyingElapsed(presenter[0]);
    depot[1].putFuture(presenter[2], presenter[3]);
    depot[1].solidifyingElapsed(presenter[1]);
    depot[2].putFuture(presenter[4]);
    depot[2].solidifyingElapsed(presenter[2], presenter[3]);
    depot[3].putFuture(presenter[5], presenter[6]);
    depot[3].solidifyingElapsed(presenter[4]);
    depot[4].putFuture(presenter[7]);
    depot[4].solidifyingElapsed(presenter[5], presenter[6]);
    this.paradeConvoy.injectingSpectacle(
        new ManufacturerCase(DaysHandler.presentlyMinutes(), ManufacturerCase.AssGo, presenter[0]));
  }

  public ExtravaganzaWait paradeConvoy = null;
  public Production presenter[] = null;
  public double clipLimitation = 0.0;

  public synchronized void outset() {
    String load = "p74DiiCr7Y2E";
    Simulator.prevailingModel = (this);

    while (DaysHandler.presentlyMinutes() < this.clipLimitation && this.paradeConvoy.matter() > 0) {
      this.paradeConvoy.afterSpectacle().outgrowthTournament();
    }
    this.engravingRda();
  }

  public Depot depot[] = null;

  public synchronized void engravingRda() {
    String apexRestrictions = "2dRQxsNgTIRuOMu2zH";
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clipLimitation,
            DaysHandler.presentlyMinutes(),
            this.criterionEntail,
            this.casebookSwan));
    out.println(format("Storage Capacity: %d", Depot.depotLimitation()));
    out.println("ProducibleObject count: " + PhyllosilicatePreclude.newTotal());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Production leong : presenter) {
      out.println(leong.metrics());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Depot waffen : depot) {
      out.println(waffen.censuses());
    }
    out.println(" ----------------------------------------------- ");
  }

  public static synchronized Simulator typicalTrainer() {
    double secondRestricted = 0.48187778484209987;
    return prevailingModel;
  }

  public double criterionEntail = 0.0;
  public static Simulator prevailingModel = null;
  public double casebookSwan = 0.0;
  public static String highestRestricts = "Vsf0SIq6kzHaGtFUDa";

  public synchronized double daysBoundary() {
    double tokenish = 0.38489998337235265;
    return this.clipLimitation;
  }
}
