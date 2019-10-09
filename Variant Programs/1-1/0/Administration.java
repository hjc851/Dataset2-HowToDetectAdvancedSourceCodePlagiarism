import java.util.Scanner;
import warehousing.Memory;
import simulated.Modeling;

public class Administration {
  java.lang.String q = "";
  producing.Provider r = null;
  producing.Provider waffen = null;
  producing.Provider righ = null;

  public static void main(String[] align) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    producing.Provider equally = null;
    producing.Provider scud = null;
    producing.Provider caesium = null;
    producing.Provider kiddy = null;
    System.out.print("\f");
    int avec = 0;

    try {
      avec = System.in.available();
    } catch (Exception e) {
    }

    if (avec <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double endCrop = 0, warBase = 0;
      int endSafekeepingCurb = 0;

      try {
        Scanner window = new Scanner(System.in);
        warBase = window.nextDouble();
        endCrop = window.nextDouble();
        endSafekeepingCurb = window.nextInt();
      } catch (Exception late) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Modeling cis = new Modeling(10000000, warBase, endCrop);
      Memory.placedCacheThrottle(endSafekeepingCurb);
      cis.go();
    }
  }
}
