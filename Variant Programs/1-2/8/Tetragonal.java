import java.util.Scanner;
import cache.Depository;
import realism.Stimulation;
import java.lang.String;
import growers.Publisher;

public class Tetragonal {
  String q = "";
  Publisher r = null;
  Publisher fh = null;
  Publisher dhfr = null;

  public static void main(String[] ing) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Publisher equally = null;
    Publisher emt = null;
    Publisher nlsy = null;
    Publisher cdma = null;
    System.out.print("\f");
    int avec = 0;

    try {
      avec = System.in.available();
    } catch (java.lang.Exception cma) {
    }

    if (avec <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double warRank = 0, needAwful = 0;
      int firstStorehouseRestrict = 0;

      try {
        java.util.Scanner piano = new java.util.Scanner(System.in);
        needAwful = piano.nextDouble();
        warRank = piano.nextDouble();
        firstStorehouseRestrict = piano.nextInt();
      } catch (java.lang.Exception appointed) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      realism.Stimulation cis = new realism.Stimulation(10000000, needAwful, warRank);
      cache.Depository.placeWarehousesMinimum(firstStorehouseRestrict);
      cis.resume();
    }
  }
}
