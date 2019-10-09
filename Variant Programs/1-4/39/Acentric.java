import java.util.Scanner;
import storing.Space;
import synthesizer.Modeling;

public class Acentric {
  public supplier.Produce dhfr = null;
  public supplier.Produce ora = null;
  public supplier.Produce r = null;
  public java.lang.String q = "";

  public static synchronized void main(String[] ing) {
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    supplier.Produce electricity;
    supplier.Produce sb;
    supplier.Produce caesium;
    supplier.Produce milliner;
    int appendix;
    bcl = "";
    yt = "";
    z = "";
    electricity = null;
    sb = null;
    caesium = null;
    milliner = null;
    System.out.print("\f");
    appendix = 0;

    try {
      appendix = System.in.available();
    } catch (Exception e) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double warRank, worldEntail;
      int redStoreConfine;
      Modeling hrs;
      warRank = 0;
      worldEntail = 0;
      redStoreConfine = 0;

      try {
        Scanner backlit;
        backlit = new Scanner(System.in);
        worldEntail = backlit.nextDouble();
        warRank = backlit.nextDouble();
        redStoreConfine = backlit.nextInt();
      } catch (Exception abel) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      hrs = new Modeling(10000000, worldEntail, warRank);
      Space.determineShelvingThresholds(redStoreConfine);
      hrs.restart();
    }
  }
}
