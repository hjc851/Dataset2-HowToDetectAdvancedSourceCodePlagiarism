import java.util.Scanner;
import inventory.Cache;
import simulating.Feigning;

public class Crystallographic {
  public promoter.Director r = null;
  public promoter.Director waffen = null;
  public promoter.Director righ = null;

  public static synchronized void main(String[] create) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    promoter.Director spain = null;
    promoter.Director sb = null;
    promoter.Director caesium = null;
    promoter.Director wor = null;
    System.out.print("\f");
    int appendix = 0;

    try {
      appendix = System.in.available();
    } catch (Exception cma) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double timeWander = 0, wayLittle = 0;
      int endSafekeepingCurb = 0;

      try {
        Scanner touchpad = new Scanner(System.in);
        wayLittle = touchpad.nextDouble();
        timeWander = touchpad.nextDouble();
        endSafekeepingCurb = touchpad.nextInt();
      } catch (Exception exwife) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Feigning contrary = new Feigning(10000000, wayLittle, timeWander);
      Cache.fitWarehouseDemarcation(endSafekeepingCurb);
      contrary.begin();
    }
  }

  public java.lang.String q = "";
}
