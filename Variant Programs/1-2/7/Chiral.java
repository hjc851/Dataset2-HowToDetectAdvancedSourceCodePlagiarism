import java.util.Scanner;
import shelving.Safekeeping;
import emulation.Scenario;

public class Chiral {
  java.lang.String q = "";
  breeder.Breeder r = null;
  breeder.Breeder ora = null;
  breeder.Breeder righ = null;

  public static void main(String[] specified) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    breeder.Breeder arsenic = null;
    breeder.Breeder scud = null;
    breeder.Breeder shim = null;
    breeder.Breeder kiddy = null;
    System.out.print("\f");
    int bac = 0;

    try {
      bac = System.in.available();
    } catch (Exception e) {
    }

    if (bac <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double timeWander = 0, proposedIntend = 0;
      int wayDiskTrammel = 0;

      try {
        Scanner piano = new Scanner(System.in);
        proposedIntend = piano.nextDouble();
        timeWander = piano.nextDouble();
        wayDiskTrammel = piano.nextInt();
      } catch (Exception vet) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Scenario mie = new Scenario(10000000, proposedIntend, timeWander);
      Safekeeping.doGarageRestricted(wayDiskTrammel);
      mie.beginning();
    }
  }
}
