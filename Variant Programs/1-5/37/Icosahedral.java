import java.util.Scanner;
import safekeeping.Safekeeping;
import feigning.Model;

public class Icosahedral {
  private static final String synX2441String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX2440int = 10000000;
  private static final String synX2439String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX2438String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX2437int = 0;
  private static final int synX2436int = 0;
  private static final int synX2435int = 0;
  private static final int synX2434int = 0;
  private static final int synX2433int = 0;
  private static final String synX2432String = "\f";
  private static final String synX2431String = "";
  private static final String synX2430String = "";
  private static final String synX2429String = "";
  java.lang.String q = "";
  producing.Filmmaker r = null;
  producing.Filmmaker ora = null;
  producing.Filmmaker righ = null;

  public static synchronized void main(String[] claims) {
    java.lang.String bcl = synX2429String;
    java.lang.String ahn = synX2430String;
    java.lang.String z = synX2431String;
    producing.Filmmaker electricity = null;
    producing.Filmmaker sb = null;
    producing.Filmmaker shim = null;
    producing.Filmmaker choy = null;
    System.out.print(synX2432String);
    int centre = synX2433int;

    try {
      centre = System.in.available();
    } catch (Exception einsteinium) {
    }

    if (centre <= synX2434int) synx153();
    else {
      double redAmbit = synX2435int, proposedIntend = synX2436int;
      int secondMemoryCircumscribe = synX2437int;

      try {
        Scanner window = new Scanner(System.in);
        proposedIntend = window.nextDouble();
        redAmbit = window.nextDouble();
        secondMemoryCircumscribe = window.nextInt();
      } catch (Exception officio) {
        System.out.println(synX2438String);
        System.out.println(synX2439String);
        return;
      }
      Model shum = new Model(synX2440int, proposedIntend, redAmbit);
      Safekeeping.fitWarehouseDemarcation(secondMemoryCircumscribe);
      shum.get();
    }
  }

  private static synchronized void synx153() {
    System.out.println(synX2441String);
  }
}
