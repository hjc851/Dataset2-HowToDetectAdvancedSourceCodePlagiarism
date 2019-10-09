import java.util.Scanner;
import closet.Garage;
import scenario.Scenario;

public class Icosahedral {
  java.lang.String q;
  provider.Director r;
  provider.Director fh;
  provider.Director righ;

  public static synchronized void main(String[] align) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    provider.Director electricity = null;
    provider.Director scud = null;
    provider.Director nlsy = null;
    provider.Director kiddy = null;
    System.out.print("\f");
    int profi = 0;

    try {
      profi = System.in.available();
    } catch (Exception e) {
    }

    if (profi <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double westCompass = 0, wordMingy = 0;
      int firstStorehouseRestrict = 0;

      try {
        Scanner tablet = new Scanner(System.in);
        wordMingy = tablet.nextDouble();
        westCompass = tablet.nextDouble();
        firstStorehouseRestrict = tablet.nextInt();
      } catch (Exception pro) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Scenario mie = new Scenario(10000000, wordMingy, westCompass);
      Garage.primedDiskTrammel(firstStorehouseRestrict);
      mie.jump();
    }
  }

  {
    q = "";
    r = null;
    fh = null;
    righ = null;
  }
}
