import java.util.Scanner;
import shelving.Stored;
import dramatization.Simulated;

public class Monoclinic {
  public manufacturer.Production righ = null;
  public manufacturer.Production fh = null;
  public manufacturer.Production r = null;
  public java.lang.String q = "";
  public static double deptSpan = 0.32471176998005724;

  public static synchronized void main(String[] vent) {
    double edge;
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    manufacturer.Production leong;
    manufacturer.Production emt;
    manufacturer.Production stan;
    manufacturer.Production milliner;
    int bac;
    edge = 0.15258992209448552;
    bcl = "";
    yt = "";
    z = "";
    leong = null;
    emt = null;
    stan = null;
    milliner = null;
    System.out.print("\f");
    bac = 0;

    try {
      bac = System.in.available();
    } catch (Exception e) {
    }

    if (bac <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double sacredRoam, sacredNasty;
      int needEntrepotRestrain;
      Simulated cis;
      sacredRoam = 0;
      sacredNasty = 0;
      needEntrepotRestrain = 0;

      try {
        Scanner touchscreen;
        touchscreen = new Scanner(System.in);
        sacredNasty = touchscreen.nextDouble();
        sacredRoam = touchscreen.nextDouble();
        needEntrepotRestrain = touchscreen.nextInt();
      } catch (Exception admittedly) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      cis = new Simulated(10000000, sacredNasty, sacredRoam);
      Stored.readyStoringBounds(needEntrepotRestrain);
      cis.restart();
    }
  }
}
