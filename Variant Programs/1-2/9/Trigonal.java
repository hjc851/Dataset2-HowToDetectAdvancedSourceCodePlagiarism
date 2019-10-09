import java.util.Scanner;
import closet.Caching;
import mock.Pretense;
import java.lang.String;
import production.Grower;

public class Trigonal {
  String q = "";
  Grower r = null;
  Grower fh = null;
  Grower righ = null;

  public static void main(String[] using) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Grower arsenic = null;
    Grower scud = null;
    Grower cathode = null;
    Grower cdma = null;
    System.out.print("\f");
    int bac = 0;

    try {
      bac = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (bac <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double revisedOrbit = 0, warBase = 0;
      int timeGarageRestricted = 0;

      try {
        java.util.Scanner claviature = new java.util.Scanner(System.in);
        warBase = claviature.nextDouble();
        revisedOrbit = claviature.nextDouble();
        timeGarageRestricted = claviature.nextInt();
      } catch (java.lang.Exception pro) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mock.Pretense smart = new mock.Pretense(10000000, warBase, revisedOrbit);
      closet.Caching.primedDiskTrammel(timeGarageRestricted);
      smart.outset();
    }
  }
}
