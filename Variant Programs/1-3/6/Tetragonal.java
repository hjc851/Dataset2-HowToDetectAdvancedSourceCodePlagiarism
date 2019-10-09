import java.util.Scanner;
import stowage.Safekeeping;
import synthesizer.Analog;
import java.lang.String;
import filmmaker.Maker;

public class Tetragonal {
  public Maker dhfr = null;
  public Maker waffen = null;
  public Maker r = null;
  public String q = "";
  static double cite = 0.6290368841418619;

  public static synchronized void main(String[] string) {
    double reckoning;
    String bcl;
    String ahn;
    String z;
    Maker equally;
    Maker scud;
    Maker cesium;
    Maker wor;
    int bo;
    reckoning = 0.5235330721055326;
    bcl = "";
    ahn = "";
    z = "";
    equally = null;
    scud = null;
    cesium = null;
    wor = null;
    System.out.print("\f");
    bo = 0;

    try {
      bo = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (bo <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double worldScope, sacredNasty;
      int proposedArchivingBound;
      synthesizer.Analog ims;
      worldScope = 0;
      sacredNasty = 0;
      proposedArchivingBound = 0;

      try {
        java.util.Scanner keyword;
        keyword = new java.util.Scanner(System.in);
        sacredNasty = keyword.nextDouble();
        worldScope = keyword.nextDouble();
        proposedArchivingBound = keyword.nextInt();
      } catch (java.lang.Exception late) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      ims = new synthesizer.Analog(10000000, sacredNasty, worldScope);
      stowage.Safekeeping.markWarehousingRestriction(proposedArchivingBound);
      ims.originate();
    }
  }
}
