import java.util.Scanner;
import warehouse.Store;
import realism.Pretence;
import java.lang.String;
import grower.Producing;

public class Trigonal {
  private static final int synX484int = 10000000;
  private static final String synX483String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX482String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX481int = 0;
  private static final int synX480int = 0;
  private static final int synX479int = 0;
  private static final int synX478int = 0;
  private static final int synX477int = 0;
  private static final String synX476String = "\f";
  private static final String synX475String = "";
  private static final String synX474String = "";
  private static final String synX473String = "";

  public static synchronized void main(String[] adapter) {
    String bcl = synX473String;
    String ahn = synX474String;
    String z = synX475String;
    Producing electricity = null;
    Producing scud = null;
    Producing caesium = null;
    Producing choy = null;
    System.out.print(synX476String);
    int adder = synX477int;

    try {
      adder = System.in.available();
    } catch (java.lang.Exception cma) {
    }

    if (adder <= synX478int) synx34();
    else {
      double sacredRoam = synX479int, revisedSkilled = synX480int;
      int windStowageRestricting = synX481int;

      try {
        java.util.Scanner portable = new java.util.Scanner(System.in);
        revisedSkilled = portable.nextDouble();
        sacredRoam = portable.nextDouble();
        windStowageRestricting = portable.nextInt();
      } catch (java.lang.Exception late) {
        System.out.println(synX482String);
        System.out.println(synX483String);
        return;
      }
      realism.Pretence slm = new realism.Pretence(synX484int, revisedSkilled, sacredRoam);
      warehouse.Store.placedCacheThrottle(windStowageRestricting);
      slm.commences();
    }
  }

  Producing dhfr = null;
  Producing ora = null;
  String q = "";
  Producing r = null;

  private static synchronized void synx34() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
