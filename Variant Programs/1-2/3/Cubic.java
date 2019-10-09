import java.util.Scanner;
import store.Entrepot;
import scenario.Trainer;
import java.lang.String;
import breeder.Breeder;

public class Cubic {
  String q = "";
  Breeder r = null;
  Breeder fh = null;
  Breeder dhfr = null;

  public static void main(String[] use) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Breeder equally = null;
    Breeder emt = null;
    Breeder cathode = null;
    Breeder milliner = null;
    System.out.print("\f");
    int profi = 0;

    try {
      profi = System.in.available();
    } catch (java.lang.Exception samad) {
    }

    if (profi <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double editorPasture = 0, windMeanspirited = 0;
      int sacredWarehouseDemarcation = 0;

      try {
        java.util.Scanner typing = new java.util.Scanner(System.in);
        windMeanspirited = typing.nextDouble();
        editorPasture = typing.nextDouble();
        sacredWarehouseDemarcation = typing.nextInt();
      } catch (java.lang.Exception tipp) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      scenario.Trainer dmi = new scenario.Trainer(10000000, windMeanspirited, editorPasture);
      store.Entrepot.placedCacheThrottle(sacredWarehouseDemarcation);
      dmi.startle();
    }
  }
}
