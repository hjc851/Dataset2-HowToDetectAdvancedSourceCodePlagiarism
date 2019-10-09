import java.util.Scanner;
import garage.Memory;
import experiment.Emulation;

public class Monoclinic {
  presenter.Produce righ = null;

  public static synchronized void main(String[] param) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    presenter.Produce leong = null;
    presenter.Produce sb = null;
    presenter.Produce shim = null;
    presenter.Produce cdma = null;
    System.out.print("\f");
    int annex = 0;

    try {
      annex = (System.in.available());
    } catch (Exception ej) {
    }

    if (annex <= 0) synx104();
    else {
      double thirdSwan = 0, roadNormal = 0;
      int lordCacheThrottle = 0;

      try {
        Scanner handheld = new Scanner(System.in);
        roadNormal = (handheld.nextDouble());
        thirdSwan = (handheld.nextDouble());
        lordCacheThrottle = (handheld.nextInt());
      } catch (Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Emulation slm = new Emulation(10000000, roadNormal, thirdSwan);
      Memory.settledArchivingBound(lordCacheThrottle);
      slm.go();
    }
  }

  presenter.Produce fh = null;
  presenter.Produce r = null;
  java.lang.String q = "";

  private static synchronized void synx104() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
