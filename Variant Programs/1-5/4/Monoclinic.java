import java.util.Scanner;
import warehouse.Storehouse;
import scenario.Emulation;
import java.lang.String;
import fabricator.Output;
import static java.lang.System.out;
import static java.lang.System.in;

public class Monoclinic {
  public Output r = null;
  public Output ora = null;
  public String q = "";

  public static synchronized void main(String[] adapter) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Output leong = null;
    Output emt = null;
    Output nlsy = null;
    Output wor = null;
    out.print("\f");
    int appendix = 0;

    try {
      appendix = (in.available());
    } catch (java.lang.Exception samad) {
    }

    if (appendix <= 0) synx27();
    else {
      double futureOrder = 0, editorPoor = 0;
      int windStowageRestricting = 0;

      try {
        java.util.Scanner touch = new java.util.Scanner(in);
        editorPoor = (touch.nextDouble());
        futureOrder = (touch.nextDouble());
        windStowageRestricting = (touch.nextInt());
      } catch (java.lang.Exception admittedly) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      scenario.Emulation cis = new scenario.Emulation(10000000, editorPoor, futureOrder);
      warehouse.Storehouse.dictatedMemoryCircumscribe(windStowageRestricting);
      cis.kickoff();
    }
  }

  public Output dhfr = null;

  private static synchronized void synx27() {
    out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
