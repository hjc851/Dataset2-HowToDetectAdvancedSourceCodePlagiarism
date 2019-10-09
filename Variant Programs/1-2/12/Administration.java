import java.util.Scanner;
import storeroom.Storeroom;
import feigning.Realism;

public class Administration {
  java.lang.String q = "";
  breeder.Presenter r = null;
  breeder.Presenter fh = null;
  breeder.Presenter dhfr = null;

  public static void main(String[] abscissa) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    breeder.Presenter electricity = null;
    breeder.Presenter emt = null;
    breeder.Presenter intrasentential = null;
    breeder.Presenter cdma = null;
    System.out.print("\f");
    int appendix = 0;

    try {
      appendix = System.in.available();
    } catch (Exception e) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double endCrop = 0, recommendedUngenerous = 0;
      int lordCacheThrottle = 0;

      try {
        Scanner trackball = new Scanner(System.in);
        recommendedUngenerous = trackball.nextDouble();
        endCrop = trackball.nextDouble();
        lordCacheThrottle = trackball.nextInt();
      } catch (Exception libris) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Realism slm = new Realism(10000000, recommendedUngenerous, endCrop);
      Storeroom.arrangeArchivalCurtail(lordCacheThrottle);
      slm.originate();
    }
  }
}
