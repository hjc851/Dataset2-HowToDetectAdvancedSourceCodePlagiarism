import java.util.Scanner;
import warehouse.Entrepot;
import analogue.Scenario;

public class Acentric {
  exporter.Farm r;
  java.lang.String q;

  {
    q = "";
    r = null;
    waffen = null;
    righ = null;
  }

  public static synchronized void main(String[] string) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    exporter.Farm arsenic = null;
    exporter.Farm scud = null;
    exporter.Farm intrasentential = null;
    exporter.Farm kiddy = null;
    System.out.print("\f");
    int aval = 0;

    try {
      aval = System.in.available();
    } catch (Exception e) {
    }

    if (aval <= 0) synx90();
    else {
      double warRank = 0, endIgnoble = 0;
      int editorWarehousesMinimum = 0;

      try {
        Scanner pad = new Scanner(System.in);
        endIgnoble = pad.nextDouble();
        warRank = pad.nextDouble();
        editorWarehousesMinimum = pad.nextInt();
      } catch (Exception abbe) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Scenario dmi = new Scenario(10000000, endIgnoble, warRank);
      Entrepot.arrangedStoreConfine(editorWarehousesMinimum);
      dmi.jump();
    }
  }

  exporter.Farm righ;
  exporter.Farm waffen;

  private static synchronized void synx90() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
