import java.util.Scanner;
import safekeeping.Stowage;
import stimulation.Mock;
import java.lang.String;
import publisher.Presenter;

public class Chiral {
  public Presenter righ;
  public Presenter waffen;
  public Presenter r;
  public String q;
  public static double keepsake = 0.9407581700560164;

  public static synchronized void main(String[] ing) {
    double unfree;
    String bcl;
    String ahn;
    String z;
    Presenter arsenic;
    Presenter scud;
    Presenter caesium;
    Presenter wor;
    int annex;
    unfree = 0.3785286446880308;
    bcl = "";
    ahn = "";
    z = "";
    arsenic = null;
    scud = null;
    caesium = null;
    wor = null;
    System.out.print("\f");
    annex = 0;

    try {
      annex = System.in.available();
    } catch (java.lang.Exception samad) {
    }

    if (annex <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double firstArray, futureEquate;
      int collectedWarehousingRestriction;
      stimulation.Mock mie;
      firstArray = 0;
      futureEquate = 0;
      collectedWarehousingRestriction = 0;

      try {
        java.util.Scanner pad;
        pad = new java.util.Scanner(System.in);
        futureEquate = pad.nextDouble();
        firstArray = pad.nextDouble();
        collectedWarehousingRestriction = pad.nextInt();
      } catch (java.lang.Exception abe) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mie = new stimulation.Mock(10000000, futureEquate, firstArray);
      safekeeping.Stowage.situatedSafekeepingCurb(collectedWarehousingRestriction);
      mie.commence();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    righ = null;
  }
}
