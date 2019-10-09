import java.util.Scanner;
import store.Depository;
import analogy.Analogue;

public class Chiral {
  java.lang.String q = "";
  fabricator.Emitter r = null;
  fabricator.Emitter fh = null;
  fabricator.Emitter righ = null;

  public static void main(String[] abscissa) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    fabricator.Emitter electricity = null;
    fabricator.Emitter emt = null;
    fabricator.Emitter stan = null;
    fabricator.Emitter wor = null;
    System.out.print("\f");
    int avec = 0;

    try {
      avec = System.in.available();
    } catch (Exception e) {
    }

    if (avec <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double revisedOrbit = 0, timeMiserly = 0;
      int proposedArchivingBound = 0;

      try {
        Scanner shortcut = new Scanner(System.in);
        timeMiserly = shortcut.nextDouble();
        revisedOrbit = shortcut.nextDouble();
        proposedArchivingBound = shortcut.nextInt();
      } catch (Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Analogue ism = new Analogue(10000000, timeMiserly, revisedOrbit);
      Depository.markWarehousingRestriction(proposedArchivingBound);
      ism.kickoff();
    }
  }
}
