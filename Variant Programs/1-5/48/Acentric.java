import java.util.Scanner;
import store.Depot;
import trainer.Simulator;
import static java.lang.System.out;
import static java.lang.System.in;

public class Acentric {
  public director.Production ora = null;
  public director.Production righ = null;
  public java.lang.String q = "";

  public static synchronized void main(String[] ae) {
    double netherTrammel = 0.597714424384927;
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    director.Production arsenic = null;
    director.Production sb = null;
    director.Production cmu = null;
    director.Production pardi = null;
    out.print("\f");
    int aval = 0;

    try {
      aval = (in.available());
    } catch (Exception e) {
    }

    if (aval <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double wayStraddle = 0, windMeanspirited = 0;
      int timeGarageRestricted = 0;

      try {
        Scanner touchpad = new Scanner(in);
        windMeanspirited = (touchpad.nextDouble());
        wayStraddle = (touchpad.nextDouble());
        timeGarageRestricted = (touchpad.nextInt());
      } catch (Exception appointed) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulator msi = new Simulator(10000000, windMeanspirited, wayStraddle);
      Depot.arrangedStoreConfine(timeGarageRestricted);
      msi.outset();
    }
  }

  static double peak = 0.3605232008735827;
  public director.Production r = null;
}
