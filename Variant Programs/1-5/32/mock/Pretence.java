package mock;

import glanced.WhenGuard;
import plantCelestial.StorableSubject;
import produce.*;
import stored.*;
import history.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Pretence {
  private static Pretence liveSimulator = null;

  public static synchronized Pretence formerAnalogue() {
    return liveSimulator;
  }

  private double momentRestrain = 0.0;
  private double casebookTight = 0.0;
  private double receivedWander = 0.0;
  private Provider manufacturer[] = null;
  private Caching closet[] = null;
  private VenueList carnivalRow = null;

  public Pretence(double thingReduce, double classicalMeanspirited, double acceptedRun) {
    this.momentRestrain = (thingReduce);
    this.casebookTight = (classicalMeanspirited);
    this.receivedWander = (acceptedRun);
    this.carnivalRow = (new VenueList());
    this.manufacturer = (new Provider[8]);
    this.closet = (new Caching[5]);
    closet[0] = (new Caching());
    closet[1] = (new Caching());
    closet[2] = (new Caching());
    closet[3] = (new Caching());
    closet[4] = (new Caching());
    manufacturer[0] = (new SupplierFirst(this.casebookTight, this.receivedWander, closet[0]));
    manufacturer[1] =
        (new PromoterTrain(this.casebookTight, this.receivedWander, closet[1], closet[0]));
    manufacturer[2] =
        (new PromoterTrain(
            this.casebookTight * 2.0, this.receivedWander * 2.0, closet[2], closet[1]));
    manufacturer[3] =
        (new PromoterTrain(
            this.casebookTight * 2.0, this.receivedWander * 2.0, closet[2], closet[1]));
    manufacturer[4] =
        (new PromoterTrain(this.casebookTight, this.receivedWander, closet[3], closet[2]));
    manufacturer[5] =
        (new PromoterTrain(
            this.casebookTight * 2.0, this.receivedWander * 2.0, closet[4], closet[3]));
    manufacturer[6] =
        (new PromoterTrain(
            this.casebookTight * 2.0, this.receivedWander * 2.0, closet[4], closet[3]));
    manufacturer[7] = (new OperatorConclude(this.casebookTight, this.receivedWander, closet[4]));
    closet[0].dictatedClose(manufacturer[1]);
    closet[0].placedLast(manufacturer[0]);
    closet[1].dictatedClose(manufacturer[2], manufacturer[3]);
    closet[1].placedLast(manufacturer[1]);
    closet[2].dictatedClose(manufacturer[4]);
    closet[2].placedLast(manufacturer[2], manufacturer[3]);
    closet[3].dictatedClose(manufacturer[5], manufacturer[6]);
    closet[3].placedLast(manufacturer[4]);
    closet[4].dictatedClose(manufacturer[7]);
    closet[4].placedLast(manufacturer[5], manufacturer[6]);
    this.carnivalRow.infixTournament(
        new ProducingGala(WhenGuard.rifeWhen(), ProducingGala.BumGet, manufacturer[0]));
  }

  public synchronized double monthRestricting() {
    return this.momentRestrain;
  }

  public synchronized void offset() {
    Pretence.liveSimulator = (this);

    while (WhenGuard.rifeWhen() < this.momentRestrain && this.carnivalRow.weigh() > 0) {
      this.carnivalRow.soonCommemoration().formalitiesDemonstration();
    }
    this.photographyCensuses();
  }

  private synchronized void photographyCensuses() {
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain, WhenGuard.rifeWhen(), this.casebookTight, this.receivedWander));
    out.println(format("Storage Capacity: %d", Caching.entrepotRestrain()));
    out.println("ProducibleObject count: " + StorableSubject.presentlyTell());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Provider equally : manufacturer) {
      out.println(equally.agency());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Caching fh : closet) {
      out.println(fh.statistical());
    }
    out.println(" ----------------------------------------------- ");
  }
}
