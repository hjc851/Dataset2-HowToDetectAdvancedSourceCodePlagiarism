import java.util.Scanner;
import disk.Warehousing;
import replication.Simulator;

public class Administration {
  java.lang.String q = "";
  supplier.Farmer r = null;
  supplier.Farmer fh = null;
  supplier.Farmer righ = null;

  public static void main(String[] ing) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    supplier.Farmer electricity = null;
    supplier.Farmer sb = null;
    supplier.Farmer cathode = null;
    supplier.Farmer choy = null;
    System.out.print("\f");
    int ak = 0;

    try {
      ak = System.in.available();
    } catch (Exception e) {
    }

    if (ak <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double westCompass = 0, warBase = 0;
      int redStoreConfine = 0;

      try {
        Scanner handheld = new Scanner(System.in);
        warBase = handheld.nextDouble();
        westCompass = handheld.nextDouble();
        redStoreConfine = handheld.nextInt();
      } catch (Exception abbe) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulator ism = new Simulator(10000000, warBase, westCompass);
      Warehousing.rigidClosetMax(redStoreConfine);
      ism.kickoff();
    }
  }
}
