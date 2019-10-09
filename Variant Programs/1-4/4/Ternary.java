import java.util.Scanner;
import storing.Stowage;
import trainer.Stimulation;

public class Ternary {
  java.lang.String q = "";
  output.Emitter r = null;
  output.Emitter fh = null;
  output.Emitter righ = null;

  public static synchronized void main(String[] arguments) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    output.Emitter equally = null;
    output.Emitter scud = null;
    output.Emitter stan = null;
    output.Emitter milliner = null;
    System.out.print("\f");
    int aval = 0;

    try {
      aval = System.in.available();
    } catch (Exception e) {
    }

    if (aval <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double collectedRate = 0, worldEntail = 0;
      int wordStoredBoundary = 0;

      try {
        Scanner window = new Scanner(System.in);
        worldEntail = window.nextDouble();
        collectedRate = window.nextDouble();
        wordStoredBoundary = window.nextInt();
      } catch (Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Stimulation ism = new Stimulation(10000000, worldEntail, collectedRate);
      Stowage.markWarehousingRestriction(wordStoredBoundary);
      ism.startle();
    }
  }
}
