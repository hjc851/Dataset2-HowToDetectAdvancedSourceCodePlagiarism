import java.util.Scanner;
import warehousing.Store;
import synthesizer.Modeling;

public class Conformal {
  java.lang.String q = "";
  output.Exporter r = null;
  output.Exporter waffen = null;
  output.Exporter dhfr = null;

  public static void main(String[] vent) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    output.Exporter electricity = null;
    output.Exporter scud = null;
    output.Exporter cesium = null;
    output.Exporter milliner = null;
    System.out.print("\f");
    int avec = 0;

    try {
      avec = System.in.available();
    } catch (Exception e) {
    }

    if (avec <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double proposedStray = 0, secondSignify = 0;
      int endSafekeepingCurb = 0;

      try {
        Scanner keys = new Scanner(System.in);
        secondSignify = keys.nextDouble();
        proposedStray = keys.nextDouble();
        endSafekeepingCurb = keys.nextInt();
      } catch (Exception adoptee) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Modeling sem = new Modeling(10000000, secondSignify, proposedStray);
      Store.arrangeArchivalCurtail(endSafekeepingCurb);
      sem.commencement();
    }
  }
}
