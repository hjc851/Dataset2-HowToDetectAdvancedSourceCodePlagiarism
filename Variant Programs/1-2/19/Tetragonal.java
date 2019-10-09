import java.util.Scanner;
import depot.Caching;
import pretence.Scenario;
import java.lang.String;
import exporter.Manufacturer;

public class Tetragonal {
  String q = "";
  Manufacturer r = null;
  Manufacturer ora = null;
  Manufacturer dhfr = null;

  public static void main(String[] use) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Manufacturer spain = null;
    Manufacturer scud = null;
    Manufacturer cesium = null;
    Manufacturer scd = null;
    System.out.print("\f");
    int bac = 0;

    try {
      bac = System.in.available();
    } catch (java.lang.Exception einsteinium) {
    }

    if (bac <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double sacredRoam = 0, proposedIntend = 0;
      int proposedArchivingBound = 0;

      try {
        java.util.Scanner keypad = new java.util.Scanner(System.in);
        proposedIntend = keypad.nextDouble();
        sacredRoam = keypad.nextDouble();
        proposedArchivingBound = keypad.nextInt();
      } catch (java.lang.Exception vet) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      pretence.Scenario favour = new pretence.Scenario(10000000, proposedIntend, sacredRoam);
      depot.Caching.placedCacheThrottle(proposedArchivingBound);
      favour.commences();
    }
  }
}
