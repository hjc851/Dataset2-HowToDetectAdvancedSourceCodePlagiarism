import java.util.Scanner;
import repository.Storeroom;
import simulate.Stimulation;

public class Orthorhombic {
  java.lang.String q = "";
  production.Fabricator r = null;
  production.Fabricator waffen = null;
  production.Fabricator righ = null;

  public static void main(String[] adapter) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    production.Fabricator equally = null;
    production.Fabricator emt = null;
    production.Fabricator cmu = null;
    production.Fabricator scd = null;
    System.out.print("\f");
    int annex = 0;

    try {
      annex = System.in.available();
    } catch (Exception e) {
    }

    if (annex <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double landRamble = 0, timeMiserly = 0;
      int revisedCachingRestrictions = 0;

      try {
        Scanner handheld = new Scanner(System.in);
        timeMiserly = handheld.nextDouble();
        landRamble = handheld.nextDouble();
        revisedCachingRestrictions = handheld.nextInt();
      } catch (Exception past) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Stimulation mis = new Stimulation(10000000, timeMiserly, landRamble);
      Storeroom.placedCacheThrottle(revisedCachingRestrictions);
      mis.initiate();
    }
  }
}
