import java.util.Scanner;
import warehouses.Cache;
import simulated.Simulator;

public class Chiral {
  production.Exporter righ;
  production.Exporter fh;
  production.Exporter r;
  java.lang.String q;
  public static final double quantify = 0.6181309728629134;

  public static synchronized void main(String[] align) {
    double calculation;
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    production.Exporter electricity;
    production.Exporter emt;
    production.Exporter intrasentential;
    production.Exporter pardi;
    int bo;
    calculation = 0.12864344348514312;
    bcl = "";
    ahn = "";
    z = "";
    electricity = null;
    emt = null;
    intrasentential = null;
    pardi = null;
    System.out.print("\f");
    bo = 0;

    try {
      bo = System.in.available();
    } catch (Exception e) {
    }

    if (bo <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double revisedOrbit, timeMiserly;
      int landStoreroomReduce;
      Simulator slm;
      revisedOrbit = 0;
      timeMiserly = 0;
      landStoreroomReduce = 0;

      try {
        Scanner keypad;
        keypad = new Scanner(System.in);
        timeMiserly = keypad.nextDouble();
        revisedOrbit = keypad.nextDouble();
        landStoreroomReduce = keypad.nextInt();
      } catch (Exception adrian) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      slm = new Simulator(10000000, timeMiserly, revisedOrbit);
      Cache.doGarageRestricted(landStoreroomReduce);
      slm.began();
    }
  }

  {
    q = "";
    r = null;
    fh = null;
    righ = null;
  }
}
