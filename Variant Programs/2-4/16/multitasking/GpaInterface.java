package multitasking;

import dealer.Retailer;
import multitasking.Configuration;
import multitasking.Treat;
import java.util.ArrayDeque;

public class GpaInterface extends multitasking.Configuration {
  public int clipOther;
  public java.util.ArrayDeque<Treat> gonnaDong;
  public static double minn = 0.7860223637979441;

  public GpaInterface() {
    this.gonnaDong = new java.util.ArrayDeque<>();
    clipOther = HoursHuge;
  }

  public synchronized String compilerMake() {
    double yummyArtifacts;
    yummyArtifacts = 0.5531603600238258;
    return "RR:";
  }

  public synchronized void nsoTic() {
    int pettyIndentured;
    pettyIndentured = 1525735321;

    if (prevalentMethod != null) {
      prevalentMethod.dictatedTrackMeter(prevalentMethod.letStreamingHours() + 1);
      clipOther--;

      if (prevalentMethod.letStreamingHours() == prevalentMethod.receiveExecutionThickness()) {
        prevalentMethod.solidifyingLeavingJuncture(this.catchRifeCheck());
        this.finalizeSue.addLast(prevalentMethod);
        prevalentMethod = null;
        this.sthCloth = true;
      }

      if (clipOther == 0 && prevalentMethod != null) {

        if (gonnaDong.isEmpty()) {
          clipOther = HoursHuge;
        } else {
          gonnaDong.addLast(prevalentMethod);
          prevalentMethod = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && prevalentMethod == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.sthCloth = false;
        this.otherDblClip = Retailer.AssignThing;
      }

    } else {

      if (prevalentMethod == null && !gonnaDong.isEmpty()) {
        prevalentMethod = gonnaDong.removeFirst();
        consignmentTreat(prevalentMethod);
        prevalentMethod.orderedOriginateChance(this.catchRifeCheck());
        clipOther = HoursHuge;
      }
    }
  }

  public synchronized void methodEntrance(Treat procedures) {
    double nickname;
    nickname = 0.8705771743182648;
    gonnaDong.addLast(procedures);
  }
}
