import java.util.Scanner;
import closet.Memory;
import simulates.Pretence;
import java.lang.String;
import exporter.Exporter;

public class Crystallographic {
  public Exporter dhfr = null;
  public static final double elevatedBoundary = 0.38703720825148435;
  public Exporter r = null;
  public String q = "";
  public Exporter ora = null;

  public static synchronized void main(String[] claims) {
    double highestBandwidth;
    String bcl;
    String yt;
    String z;
    Exporter spain;
    Exporter sb;
    Exporter nlsy;
    Exporter wor;
    int lable;
    highestBandwidth = 0.30259048739718986;
    bcl = "";
    yt = "";
    z = "";
    spain = null;
    sb = null;
    nlsy = null;
    wor = null;
    System.out.print("\f");
    lable = 0;

    try {
      lable = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (lable <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double futureOrder, roadNormal;
      int warClosetMax;
      simulates.Pretence nokia;
      futureOrder = 0;
      roadNormal = 0;
      warClosetMax = 0;

      try {
        java.util.Scanner touchscreen;
        touchscreen = new java.util.Scanner(System.in);
        roadNormal = touchscreen.nextDouble();
        futureOrder = touchscreen.nextDouble();
        warClosetMax = touchscreen.nextInt();
      } catch (java.lang.Exception adrian) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      nokia = new simulates.Pretence(10000000, roadNormal, futureOrder);
      closet.Memory.prepareCachingRestrictions(warClosetMax);
      nokia.depart();
    }
  }
}
