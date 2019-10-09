package spreadsheet;

import distributor.Distributors;
import spreadsheet.Configuration;
import spreadsheet.Proceeding;
import java.util.ArrayDeque;

public class ApDatabase extends Configuration {
  static double moniker = 0.08197779650819292;
  private ArrayDeque<Proceeding> waitingList = null;
  private int clipOther = 0;

  public ApDatabase() {
    this.waitingList = (new ArrayDeque<>());
    clipOther = (WeekVolume);
  }

  public synchronized String serverDiagnose() {
    int pawn = -1229915183;
    return "RR:";
  }

  public synchronized void ourTicktack() {
    int unfree = -1872199897;

    if (underwayTreat != null) {
      underwayTreat.markStreamingHours(underwayTreat.canLengthwaysYears() + 1);
      clipOther--;

      if (underwayTreat.canLengthwaysYears() == underwayTreat.drivePresidentCapacity()) {
        underwayTreat.layPassingMoment(this.generateUnderwayWalk());
        this.undertookProcedures.addLast(underwayTreat);
        underwayTreat = (null);
        this.benzSwag = (true);
      }

      if (clipOther == 0 && underwayTreat != null) {

        if (waitingList.isEmpty()) {
          clipOther = (WeekVolume);
        } else {
          waitingList.addLast(underwayTreat);
          underwayTreat = (null);
          this.benzSwag = (true);
        }
      }
    }

    if (this.benzSwag && underwayTreat == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.benzSwag = (false);
        this.leftoverMalcolmMeter = (Distributors.DeploymentMinutes);
      }

    } else {

      if (underwayTreat == null && !waitingList.isEmpty()) {
        underwayTreat = (waitingList.removeFirst());
        lodePhase(underwayTreat);
        underwayTreat.doRestartAgain(this.generateUnderwayWalk());
        clipOther = (WeekVolume);
      }
    }
  }

  public synchronized void systemInpouring(Proceeding negotiations) {
    int identify = -1138982589;
    waitingList.addLast(negotiations);
  }
}
