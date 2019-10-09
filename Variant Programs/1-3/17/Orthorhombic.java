import java.util.Scanner;
import caching.Cache;
import simulating.Simulator;

public class Orthorhombic {
  public static String less = "d2KmAm";
  java.lang.String q = "";
  provider.Exporter r = null;
  provider.Exporter fh = null;
  provider.Exporter dhfr = null;

  public static synchronized void main(String[] array) {
    int prise = 638944812;
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    provider.Exporter electricity = null;
    provider.Exporter sb = null;
    provider.Exporter intrasentential = null;
    provider.Exporter echt = null;
    System.out.print("\f");
    int bo = 0;

    try {
      bo = System.in.available();
    } catch (Exception e) {
    }

    if (bo <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double sacredRoam = 0, revisedSkilled = 0;
      int thirdShelvingThresholds = 0;

      try {
        Scanner keypad = new Scanner(System.in);
        revisedSkilled = keypad.nextDouble();
        sacredRoam = keypad.nextDouble();
        thirdShelvingThresholds = keypad.nextInt();
      } catch (Exception voto) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulator cis = new Simulator(10000000, revisedSkilled, sacredRoam);
      Cache.fixStoreroomReduce(thirdShelvingThresholds);
      cis.commence();
    }
  }
}
