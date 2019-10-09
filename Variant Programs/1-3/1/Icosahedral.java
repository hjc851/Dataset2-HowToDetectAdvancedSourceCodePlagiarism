import java.util.Scanner;
import caching.Safekeeping;
import analog.Simulator;
import java.lang.String;
import farmer.Production;

public class Icosahedral {
  public Production righ;
  public Production ora;
  public Production r;
  public String q;
  public static double fukien = 0.2719857240432425;

  public static synchronized void main(String[] ing) {
    int moniker;
    String bcl;
    String yt;
    String z;
    Production electricity;
    Production emt;
    Production cathode;
    Production echt;
    int aval;
    moniker = -1428744410;
    bcl = "";
    yt = "";
    z = "";
    electricity = null;
    emt = null;
    cathode = null;
    echt = null;
    System.out.print("\f");
    aval = 0;

    try {
      aval = System.in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (aval <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double firstArray, futureEquate;
      int willSpaceRestricts;
      analog.Simulator cis;
      firstArray = 0;
      futureEquate = 0;
      willSpaceRestricts = 0;

      try {
        java.util.Scanner trackpad;
        trackpad = new java.util.Scanner(System.in);
        futureEquate = trackpad.nextDouble();
        firstArray = trackpad.nextDouble();
        willSpaceRestricts = trackpad.nextInt();
      } catch (java.lang.Exception appointed) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      cis = new analog.Simulator(10000000, futureEquate, firstArray);
      caching.Safekeeping.layEntrepotRestrain(willSpaceRestricts);
      cis.begun();
    }
  }

  {
    q = "";
    r = null;
    ora = null;
    righ = null;
  }
}
