import java.util.Scanner;
import caching.Closet;
import analogue.Replication;

public class Acentric {
  static double testimonial = 0.017340282798838147;
  public java.lang.String q = "";
  public provider.Exporter r = null;
  public provider.Exporter fh = null;
  public provider.Exporter righ = null;

  public static synchronized void main(String[] constructor) {
    double matter = 0.962063214566622;
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    provider.Exporter leong = null;
    provider.Exporter sb = null;
    provider.Exporter intrasentential = null;
    provider.Exporter kiddy = null;
    System.out.print("\f");
    int bo = 0;

    try {
      bo = System.in.available();
    } catch (Exception e) {
    }

    if (bo <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double timeWander = 0, wordMingy = 0;
      int willSpaceRestricts = 0;

      try {
        Scanner touch = new Scanner(System.in);
        wordMingy = touch.nextDouble();
        timeWander = touch.nextDouble();
        willSpaceRestricts = touch.nextInt();
      } catch (Exception adrian) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Replication siem = new Replication(10000000, wordMingy, timeWander);
      Closet.readyStoringBounds(willSpaceRestricts);
      siem.get();
    }
  }
}
