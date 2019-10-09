import java.util.Scanner;
import closet.Archival;
import synthesizer.Model;

public class Cubic {
  public java.lang.String q = null;
  public publisher.Promoter ora = null;
  public publisher.Promoter r = null;

  {
    q = ("");
    r = (null);
    ora = (null);
    righ = (null);
  }

  public static synchronized void main(String[] event) {
    double confine;
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    publisher.Promoter leong;
    publisher.Promoter emt;
    publisher.Promoter cathode;
    publisher.Promoter wor;
    int annex;
    confine = (0.964951018766025);
    bcl = ("");
    ahn = ("");
    z = ("");
    leong = (null);
    emt = (null);
    cathode = (null);
    wor = (null);
    System.out.print("\f");
    annex = (0);

    try {
      annex = (System.in.available());
    } catch (Exception cma) {
    }

    if (annex <= 0) synx83();
    else {
      double sacredRoam, landStingy;
      int wordStoredBoundary;
      Model mis;
      sacredRoam = (0);
      landStingy = (0);
      wordStoredBoundary = (0);

      try {
        Scanner shortcut;
        shortcut = (new Scanner(System.in));
        landStingy = (shortcut.nextDouble());
        sacredRoam = (shortcut.nextDouble());
        wordStoredBoundary = (shortcut.nextInt());
      } catch (Exception pro) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mis = (new Model(10000000, landStingy, sacredRoam));
      Archival.fixedInventoryMaximum(wordStoredBoundary);
      mis.go();
    }
  }

  public publisher.Promoter righ = null;
  public static int loadRadius = -518097085;

  private static synchronized void synx83() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
