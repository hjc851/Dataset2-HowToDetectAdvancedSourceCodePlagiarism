import java.util.Scanner;
import warehouse.Warehouse;
import pretense.Feigning;
import java.lang.String;
import farmer.Vintner;

public class Triclinic {
  String q = "";
  Vintner r = null;
  Vintner waffen = null;
  Vintner dhfr = null;

  public static void main(String[] number) {
    String bcl = "";
    String yt = "";
    String z = "";
    Vintner spain = null;
    Vintner sb = null;
    Vintner cathode = null;
    Vintner cdma = null;
    System.out.print("\f");
    int adder = 0;

    try {
      adder = System.in.available();
    } catch (java.lang.Exception samad) {
    }

    if (adder <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double redAmbit = 0, thirdTight = 0;
      int wayDiskTrammel = 0;

      try {
        java.util.Scanner computer = new java.util.Scanner(System.in);
        thirdTight = computer.nextDouble();
        redAmbit = computer.nextDouble();
        wayDiskTrammel = computer.nextInt();
      } catch (java.lang.Exception libris) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      pretense.Feigning cis = new pretense.Feigning(10000000, thirdTight, redAmbit);
      warehouse.Warehouse.solidifyingDepositoryConstrain(wayDiskTrammel);
      cis.restart();
    }
  }
}
