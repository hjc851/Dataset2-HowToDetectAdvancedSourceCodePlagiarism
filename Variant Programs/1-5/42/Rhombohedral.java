import java.util.Scanner;
import entrepot.Archiving;
import dramatization.Simulates;
import static java.lang.System.out;
import static java.lang.System.in;

public class Rhombohedral {
  public manufacturers.Maker ora = null;
  public manufacturers.Maker righ = null;
  public static double netherTrammel = 0.055195420334636425;
  public manufacturers.Maker r = null;
  public java.lang.String q = "";

  public static synchronized void main(String[] vent) {
    int greaterConstrain;
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    manufacturers.Maker arsenic;
    manufacturers.Maker scud;
    manufacturers.Maker nlsy;
    manufacturers.Maker cdma;
    int aval;
    greaterConstrain = (-190244145);
    bcl = ("");
    yt = ("");
    z = ("");
    arsenic = (null);
    scud = (null);
    nlsy = (null);
    cdma = (null);
    out.print("\f");
    aval = (0);

    try {
      aval = (in.available());
    } catch (Exception e) {
    }

    if (aval <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double worldScope, wordMingy;
      int willSpaceRestricts;
      Simulates dvs;
      worldScope = (0);
      wordMingy = (0);
      willSpaceRestricts = (0);

      try {
        Scanner touchscreen;
        touchscreen = (new Scanner(in));
        wordMingy = (touchscreen.nextDouble());
        worldScope = (touchscreen.nextDouble());
        willSpaceRestricts = (touchscreen.nextInt());
      } catch (Exception past) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      dvs = (new Simulates(10000000, wordMingy, worldScope));
      Archiving.readyStoringBounds(willSpaceRestricts);
      dvs.commencement();
    }
  }
}
