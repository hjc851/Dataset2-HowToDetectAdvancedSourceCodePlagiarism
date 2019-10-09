import java.util.Scanner;
import store.Entrepot;
import pretense.Modeling;
import java.lang.String;
import farmer.Fabricator;

public class Ternary {
  Fabricator righ = null;
  Fabricator fh = null;
  Fabricator r = null;
  String q = "";

  public static synchronized void main(String[] using) {
    String bcl;
    String yt;
    String z;
    Fabricator arsenic;
    Fabricator sb;
    Fabricator cathode;
    Fabricator kiddy;
    int profi;
    bcl = "";
    yt = "";
    z = "";
    arsenic = null;
    sb = null;
    cathode = null;
    kiddy = null;
    System.out.print("\f");
    profi = 0;

    try {
      profi = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (profi <= 0) synx125();
    else {
      double thirdSwan, firstImply;
      int collectedWarehousingRestriction;
      pretense.Modeling mis;
      thirdSwan = 0;
      firstImply = 0;
      collectedWarehousingRestriction = 0;

      try {
        java.util.Scanner touch;
        touch = new java.util.Scanner(System.in);
        firstImply = touch.nextDouble();
        thirdSwan = touch.nextDouble();
        collectedWarehousingRestriction = touch.nextInt();
      } catch (java.lang.Exception former) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mis = new pretense.Modeling(10000000, firstImply, thirdSwan);
      store.Entrepot.readyStoringBounds(collectedWarehousingRestriction);
      mis.early();
    }
  }

  private static synchronized void synx125() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
