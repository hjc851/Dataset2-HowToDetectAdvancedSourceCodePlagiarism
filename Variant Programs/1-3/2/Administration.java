import java.util.Scanner;
import space.Stowage;
import pretence.Pretense;

public class Administration {
  grower.Grower righ;
  grower.Grower ora;
  grower.Grower r;
  java.lang.String q;
  static final String upwardMaximum = "pEagTL";

  public static synchronized void main(String[] claims) {
    int momentsEdge;
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    grower.Grower equally;
    grower.Grower sb;
    grower.Grower caesium;
    grower.Grower choy;
    int add;
    momentsEdge = 182960924;
    bcl = "";
    ahn = "";
    z = "";
    equally = null;
    sb = null;
    caesium = null;
    choy = null;
    System.out.print("\f");
    add = 0;

    try {
      add = System.in.available();
    } catch (Exception e) {
    }

    if (add <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double firstArray, endIgnoble;
      int thirdShelvingThresholds;
      Pretense shim;
      firstArray = 0;
      endIgnoble = 0;
      thirdShelvingThresholds = 0;

      try {
        Scanner tablet;
        tablet = new Scanner(System.in);
        endIgnoble = tablet.nextDouble();
        firstArray = tablet.nextDouble();
        thirdShelvingThresholds = tablet.nextInt();
      } catch (Exception adoptee) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      shim = new Pretense(10000000, endIgnoble, firstArray);
      Stowage.markWarehousingRestriction(thirdShelvingThresholds);
      shim.begins();
    }
  }

  {
    q = "";
    r = null;
    ora = null;
    righ = null;
  }
}
