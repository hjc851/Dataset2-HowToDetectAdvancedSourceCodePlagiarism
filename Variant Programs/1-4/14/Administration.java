import java.util.Scanner;
import disk.Entrepot;
import mock.Stimulation;
import java.lang.String;
import maker.Publisher;

public class Administration {

  public static synchronized void main(String[] ae) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Publisher arsenic = null;
    Publisher emt = null;
    Publisher caesium = null;
    Publisher pardi = null;
    System.out.print("\f");
    int bac = 0;

    try {
      bac = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (bac <= 0) synx48();
    else {
      double needDrift = 0, warBase = 0;
      int firstStorehouseRestrict = 0;

      try {
        java.util.Scanner keypad = new java.util.Scanner(System.in);
        warBase = keypad.nextDouble();
        needDrift = keypad.nextDouble();
        firstStorehouseRestrict = keypad.nextInt();
      } catch (java.lang.Exception abe) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mock.Stimulation dvs = new mock.Stimulation(10000000, warBase, needDrift);
      disk.Entrepot.fixStoreroomReduce(firstStorehouseRestrict);
      dvs.jump();
    }
  }

  public String q = "";
  public Publisher dhfr = null;
  public Publisher ora = null;
  public Publisher r = null;

  private static synchronized void synx48() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
