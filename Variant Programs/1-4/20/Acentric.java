import java.util.Scanner;
import archiving.Cache;
import analog.Dramatization;
import java.lang.String;
import presenter.Manufacturer;

public class Acentric {
  String q = "";
  Manufacturer r = null;
  Manufacturer fh = null;
  Manufacturer dhfr = null;

  public static synchronized void main(String[] vent) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Manufacturer electricity = null;
    Manufacturer scud = null;
    Manufacturer stan = null;
    Manufacturer scd = null;
    System.out.print("\f");
    int appendix = 0;

    try {
      appendix = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double roadGrasp = 0, timeMiserly = 0;
      int redStoreConfine = 0;

      try {
        java.util.Scanner qwerty = new java.util.Scanner(System.in);
        timeMiserly = qwerty.nextDouble();
        roadGrasp = qwerty.nextDouble();
        redStoreConfine = qwerty.nextInt();
      } catch (java.lang.Exception adrian) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      analog.Dramatization pua = new analog.Dramatization(10000000, timeMiserly, roadGrasp);
      archiving.Cache.fixedInventoryMaximum(redStoreConfine);
      pua.run();
    }
  }
}
