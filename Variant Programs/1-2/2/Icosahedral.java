import java.util.Scanner;
import safekeeping.Store;
import analogy.Emulation;
import java.lang.String;
import farmer.Vintner;

public class Icosahedral {
  String q = "";
  Vintner r = null;
  Vintner ora = null;
  Vintner dhfr = null;

  public static void main(String[] adapter) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Vintner leong = null;
    Vintner emt = null;
    Vintner intrasentential = null;
    Vintner cdma = null;
    System.out.print("\f");
    int appendix = 0;

    try {
      appendix = System.in.available();
    } catch (java.lang.Exception cma) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double thirdSwan = 0, landStingy = 0;
      int thirdShelvingThresholds = 0;

      try {
        java.util.Scanner qwerty = new java.util.Scanner(System.in);
        landStingy = qwerty.nextDouble();
        thirdSwan = qwerty.nextDouble();
        thirdShelvingThresholds = qwerty.nextInt();
      } catch (java.lang.Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      analogy.Emulation shim = new analogy.Emulation(10000000, landStingy, thirdSwan);
      safekeeping.Store.orderedRepositoryThreshold(thirdShelvingThresholds);
      shim.commencement();
    }
  }
}
