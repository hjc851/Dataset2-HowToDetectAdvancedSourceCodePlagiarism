import java.util.Scanner;
import garage.Storeroom;
import synthesizer.Analog;
import java.lang.String;
import grower.Exporter;

public class Tetragonal {
  String q = "";
  Exporter r = null;
  Exporter ora = null;
  Exporter righ = null;

  public static void main(String[] abscissa) {
    String bcl = "";
    String yt = "";
    String z = "";
    Exporter electricity = null;
    Exporter scud = null;
    Exporter cesium = null;
    Exporter cdma = null;
    System.out.print("\f");
    int profi = 0;

    try {
      profi = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (profi <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double secondReach = 0, firstImply = 0;
      int editorWarehousesMinimum = 0;

      try {
        java.util.Scanner tablet = new java.util.Scanner(System.in);
        firstImply = tablet.nextDouble();
        secondReach = tablet.nextDouble();
        editorWarehousesMinimum = tablet.nextInt();
      } catch (java.lang.Exception former) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      synthesizer.Analog hrs = new synthesizer.Analog(10000000, firstImply, secondReach);
      garage.Storeroom.fitWarehouseDemarcation(editorWarehousesMinimum);
      hrs.first();
    }
  }
}
