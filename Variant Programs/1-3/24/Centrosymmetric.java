import java.util.Scanner;
import repository.Storing;
import simulated.Scenario;
import java.lang.String;
import exporter.Exporter;

public class Centrosymmetric {
  String q = "";
  Exporter r = null;
  Exporter waffen = null;
  Exporter dhfr = null;

  public static synchronized void main(String[] using) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Exporter leong = null;
    Exporter scud = null;
    Exporter intrasentential = null;
    Exporter milliner = null;
    System.out.print("\f");
    int adder = 0;

    try {
      adder = System.in.available();
    } catch (java.lang.Exception cma) {
    }

    if (adder <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double futureOrder = 0, windMeanspirited = 0;
      int secondMemoryCircumscribe = 0;

      try {
        java.util.Scanner touchpad = new java.util.Scanner(System.in);
        windMeanspirited = touchpad.nextDouble();
        futureOrder = touchpad.nextDouble();
        secondMemoryCircumscribe = touchpad.nextInt();
      } catch (java.lang.Exception abel) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      simulated.Scenario nokia = new simulated.Scenario(10000000, windMeanspirited, futureOrder);
      repository.Storing.settledArchivingBound(secondMemoryCircumscribe);
      nokia.get();
    }
  }
}
