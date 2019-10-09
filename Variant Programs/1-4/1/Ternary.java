import java.util.Scanner;
import store.Warehousing;
import simulate.Modeling;
import java.lang.String;
import filmmaker.Commodity;

public class Ternary {
  public Commodity dhfr;
  public Commodity waffen;
  public Commodity r;
  public String q;
  static double bottomCompelled = 0.7556751012950282;

  public static synchronized void main(String[] vent) {
    double marx;
    String bcl;
    String ahn;
    String z;
    Commodity equally;
    Commodity sb;
    Commodity cesium;
    Commodity cdma;
    int aval;
    marx = 0.590156070726305;
    bcl = "";
    ahn = "";
    z = "";
    equally = null;
    sb = null;
    cesium = null;
    cdma = null;
    System.out.print("\f");
    aval = 0;

    try {
      aval = System.in.available();
    } catch (java.lang.Exception einsteinium) {
    }

    if (aval <= 0) synx13();
    else {
      double willRove, editorPoor;
      int windStowageRestricting;
      simulate.Modeling sem;
      willRove = 0;
      editorPoor = 0;
      windStowageRestricting = 0;

      try {
        java.util.Scanner touch;
        touch = new java.util.Scanner(System.in);
        editorPoor = touch.nextDouble();
        willRove = touch.nextDouble();
        windStowageRestricting = touch.nextInt();
      } catch (java.lang.Exception adrian) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      sem = new simulate.Modeling(10000000, editorPoor, willRove);
      store.Warehousing.putStorehouseRestrict(windStowageRestricting);
      sem.commences();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    dhfr = null;
  }

  private static synchronized void synx13() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
