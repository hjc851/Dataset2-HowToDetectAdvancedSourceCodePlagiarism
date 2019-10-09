import java.util.Scanner;
import shelving.Repository;
import replication.Replication;

public class Triclinic {
  java.lang.String q = "";
  maker.Production r = null;
  maker.Production ora = null;
  maker.Production dhfr = null;

  public static void main(String[] ing) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    maker.Production electricity = null;
    maker.Production scud = null;
    maker.Production stan = null;
    maker.Production milliner = null;
    System.out.print("\f");
    int artic = 0;

    try {
      artic = System.in.available();
    } catch (Exception e) {
    }

    if (artic <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double endCrop = 0, westSmall = 0;
      int westInventoryMaximum = 0;

      try {
        Scanner keypad = new Scanner(System.in);
        westSmall = keypad.nextDouble();
        endCrop = keypad.nextDouble();
        westInventoryMaximum = keypad.nextInt();
      } catch (Exception appointed) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Replication dmi = new Replication(10000000, westSmall, endCrop);
      Repository.settledArchivingBound(westInventoryMaximum);
      dmi.startle();
    }
  }
}
