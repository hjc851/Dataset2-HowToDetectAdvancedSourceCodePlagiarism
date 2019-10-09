import java.util.Scanner;
import caching.Caching;
import exercise.Stimulation;

public class Orthorhombic {
  growers.Grower r = null;
  growers.Grower dhfr = null;
  growers.Grower ora = null;
  java.lang.String q = "";

  public static synchronized void main(String[] abscissa) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    growers.Grower leong = null;
    growers.Grower emt = null;
    growers.Grower shim = null;
    growers.Grower milliner = null;
    System.out.print("\f");
    int lable = 0;

    try {
      lable = System.in.available();
    } catch (Exception e) {
    }

    if (lable <= 0) synx111();
    else {
      double thirdSwan = 0, redThink = 0;
      int endSafekeepingCurb = 0;

      try {
        Scanner touchpad = new Scanner(System.in);
        redThink = touchpad.nextDouble();
        thirdSwan = touchpad.nextDouble();
        endSafekeepingCurb = touchpad.nextInt();
      } catch (Exception past) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Stimulation nokia = new Stimulation(10000000, redThink, thirdSwan);
      Caching.placedCacheThrottle(endSafekeepingCurb);
      nokia.begun();
    }
  }

  private static synchronized void synx111() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
