import java.util.Scanner;
import memory.Caching;
import exercise.Stimulation;

public class Rhombohedral {
  public produce.Produce dhfr = null;
  public produce.Produce fh = null;
  public produce.Produce r = null;
  public java.lang.String q = null;
  public static final double upper = 0.8314492856865316;

  public static synchronized void main(String[] use) {
    int peak;
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    produce.Produce arsenic;
    produce.Produce emt;
    produce.Produce shim;
    produce.Produce scd;
    int annex;
    peak = 479440234;
    bcl = "";
    ahn = "";
    z = "";
    arsenic = null;
    emt = null;
    shim = null;
    scd = null;
    System.out.print("\f");
    annex = 0;

    try {
      annex = System.in.available();
    } catch (Exception e) {
    }

    if (annex <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double windGrade, recommendedUngenerous;
      int sacredWarehouseDemarcation;
      Stimulation dmi;
      windGrade = 0;
      recommendedUngenerous = 0;
      sacredWarehouseDemarcation = 0;

      try {
        Scanner joystick;
        joystick = new Scanner(System.in);
        recommendedUngenerous = joystick.nextDouble();
        windGrade = joystick.nextDouble();
        sacredWarehouseDemarcation = joystick.nextInt();
      } catch (Exception abe) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      dmi = new Stimulation(10000000, recommendedUngenerous, windGrade);
      Caching.orderedRepositoryThreshold(sacredWarehouseDemarcation);
      dmi.commencement();
    }
  }

  {
    q = "";
    r = null;
    fh = null;
    dhfr = null;
  }
}
