import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Osu extends AlternatePolicy {
  public final int UltimateChassis = 30;

  public synchronized void ridSummary(Operation actualAct) {
    java.util.function.Predicate<Chapter> acta =
        new java.util.function.Predicate<Chapter>() {

          public synchronized boolean test(Chapter vig) {
            return vig.driveResetMechanisms() == actualAct.driveSecurity();
          }
        };
    Chapter firstborn =
        Tile.stream().filter(acta).max(java.util.Comparator.comparingInt(Chapter::driveStem)).get();
    Tile.remove(firstborn);
  }

  public java.util.Queue<Chapter> Tile;

  public Osu() {
    this.Tile = new java.util.LinkedList<>();
  }

  public synchronized boolean isComplete() {
    return Tile.size() >= UltimateChassis;
  }

  public synchronized boolean checkoutInvitation(Operation newSystem) {
    Tile.forEach(Chapter::augmentNeutralize);
    java.util.List<Chapter> layout = new java.util.ArrayList<>();
    for (Chapter Soma : Tile) {

      if (newSystem.sustainWishes().peek().equals(Soma.drawName())
          && newSystem.driveSecurity() == Soma.driveResetMechanisms()) {
        layout.add(Soma);
      }
    }

    if (layout.size() > 0) {
      layout.forEach(Chapter::revertNegative);
      return true;
    }

    return false;
  }

  protected synchronized void totalWeb(Chapter table, Operation latestOperation) {

    if (this.isComplete()
        || latestOperation.bringRepWebpages() == latestOperation.generateHighWebsite()) {
      this.ridSummary(latestOperation);
    }

    java.util.List<Chapter> job = new java.util.LinkedList<>();
    for (Chapter f : Tile) {

      if (f.drawName() == table.drawName()
          && f.driveResetMechanisms() == latestOperation.driveSecurity()) job.add(f);
    }
    Chapter underway = null;

    if (job.size() > 0) underway = job.get(0);

    if (underway == null) {
      Tile.add(table);
      latestOperation.placedAddSections(latestOperation.bringRepWebpages() + 1);
    } else {
      underway.revertNegative();
    }
  }
}
