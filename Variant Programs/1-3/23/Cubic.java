import java.util.Scanner;
import warehouses.Memory;
import simulated.Simulating;

public class Cubic {
  output.Grower righ;
  output.Grower fh;
  output.Grower r;
  java.lang.String q;

  public static synchronized void main(String[] align) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    output.Grower electricity;
    output.Grower emt;
    output.Grower intrasentential;
    output.Grower milliner;
    int lable;
    bcl = "";
    ahn = "";
    z = "";
    electricity = null;
    emt = null;
    intrasentential = null;
    milliner = null;
    System.out.print("\f");
    lable = 0;

    try {
      lable = System.in.available();
    } catch (Exception e) {
    }

    if (lable <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double editorPasture, backgroundSpiteful;
      int thirdShelvingThresholds;
      Simulating yes;
      editorPasture = 0;
      backgroundSpiteful = 0;
      thirdShelvingThresholds = 0;

      try {
        Scanner qwerty;
        qwerty = new Scanner(System.in);
        backgroundSpiteful = qwerty.nextDouble();
        editorPasture = qwerty.nextDouble();
        thirdShelvingThresholds = qwerty.nextInt();
      } catch (Exception aba) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      yes = new Simulating(10000000, backgroundSpiteful, editorPasture);
      Memory.laidDepotLimitation(thirdShelvingThresholds);
      yes.outset();
    }
  }

  {
    q = "";
    r = null;
    fh = null;
    righ = null;
  }
}
