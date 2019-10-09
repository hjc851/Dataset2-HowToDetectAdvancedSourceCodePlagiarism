import java.util.Scanner;
import warehouse.Depot;
import synthesizer.Exercise;
import java.lang.String;
import production.Promoter;

public class Administration {
  {
    q = "";
    r = null;
    waffen = null;
    dhfr = null;
  }

  public static final double demarcation = 0.7071853598883271;
  public Promoter dhfr;

  public static synchronized void main(String[] using) {
    String kg = "C7OK4eUKdydGECapES";
    String bcl = "";
    String yt = "";
    String z = "";
    Promoter spain = null;
    Promoter sb = null;
    Promoter caesium = null;
    Promoter choy = null;
    System.out.print("\f");
    int annex = 0;

    try {
      annex = System.in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (annex <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double landRamble = 0, endIgnoble = 0;
      int roadStoringBounds = 0;

      try {
        java.util.Scanner typing = new java.util.Scanner(System.in);
        endIgnoble = typing.nextDouble();
        landRamble = typing.nextDouble();
        roadStoringBounds = typing.nextInt();
      } catch (java.lang.Exception appointed) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      synthesizer.Exercise nokia = new synthesizer.Exercise(10000000, endIgnoble, landRamble);
      warehouse.Depot.putStorehouseRestrict(roadStoringBounds);
      nokia.go();
    }
  }

  public Promoter r;
  public String q;
  public Promoter waffen;
}
