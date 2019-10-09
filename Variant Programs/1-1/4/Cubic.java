import java.util.Scanner;
import warehouses.Space;
import simulate.Synthesizer;

public class Cubic {
  java.lang.String q = "";
  fabricator.Supplier r = null;
  fabricator.Supplier fh = null;
  fabricator.Supplier righ = null;

  public static void main(String[] using) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    fabricator.Supplier leong = null;
    fabricator.Supplier sb = null;
    fabricator.Supplier shim = null;
    fabricator.Supplier pardi = null;
    System.out.print("\f");
    int add = 0;

    try {
      add = System.in.available();
    } catch (Exception e) {
    }

    if (add <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double needDrift = 0, wayLittle = 0;
      int redStoreConfine = 0;

      try {
        Scanner typing = new Scanner(System.in);
        wayLittle = typing.nextDouble();
        needDrift = typing.nextDouble();
        redStoreConfine = typing.nextInt();
      } catch (Exception abel) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Synthesizer pua = new Synthesizer(10000000, wayLittle, needDrift);
      Space.doGarageRestricted(redStoreConfine);
      pua.run();
    }
  }
}
