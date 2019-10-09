import java.util.Scanner;
import warehouses.Repository;
import analogy.Scenario;

public class Trigonal {
  public production.Presenter dhfr = null;
  public production.Presenter fh = null;
  public production.Presenter r = null;
  public java.lang.String q = null;

  public static synchronized void main(String[] adapter) {
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    production.Presenter spain;
    production.Presenter scud;
    production.Presenter stan;
    production.Presenter choy;
    int appendix;
    bcl = "";
    yt = "";
    z = "";
    spain = null;
    scud = null;
    stan = null;
    choy = null;
    System.out.print("\f");
    appendix = 0;

    try {
      appendix = System.in.available();
    } catch (Exception e) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double thirdSwan, needAwful;
      int warClosetMax;
      Scenario shum;
      thirdSwan = 0;
      needAwful = 0;
      warClosetMax = 0;

      try {
        Scanner pad;
        pad = new Scanner(System.in);
        needAwful = pad.nextDouble();
        thirdSwan = pad.nextDouble();
        warClosetMax = pad.nextInt();
      } catch (Exception admittedly) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      shum = new Scenario(10000000, needAwful, thirdSwan);
      Repository.layEntrepotRestrain(warClosetMax);
      shum.early();
    }
  }

  {
    q = "";
    r = null;
    fh = null;
    dhfr = null;
  }
}
