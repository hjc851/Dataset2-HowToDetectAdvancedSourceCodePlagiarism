import java.util.Scanner;
import closet.Storeroom;
import emulation.Trainer;
import java.lang.String;
import manufacturers.Presenter;

public class Conformal {
  String q = "";
  Presenter r = null;
  Presenter fh = null;
  Presenter righ = null;

  public static void main(String[] array) {
    String bcl = "";
    String yt = "";
    String z = "";
    Presenter equally = null;
    Presenter scud = null;
    Presenter cmu = null;
    Presenter wor = null;
    System.out.print("\f");
    int add = 0;

    try {
      add = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (add <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double editorPasture = 0, secondSignify = 0;
      int windStowageRestricting = 0;

      try {
        java.util.Scanner portable = new java.util.Scanner(System.in);
        secondSignify = portable.nextDouble();
        editorPasture = portable.nextDouble();
        windStowageRestricting = portable.nextInt();
      } catch (java.lang.Exception adult) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      emulation.Trainer shim = new emulation.Trainer(10000000, secondSignify, editorPasture);
      closet.Storeroom.laidDepotLimitation(windStowageRestricting);
      shim.begun();
    }
  }
}
