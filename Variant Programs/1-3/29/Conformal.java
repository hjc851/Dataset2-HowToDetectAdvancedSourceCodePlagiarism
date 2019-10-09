import java.util.Scanner;
import entrepot.Shelving;
import exercise.Feigning;

public class Conformal {
  public static final double decreaseRolled = 0.39312448233671804;
  public java.lang.String q = "";
  public director.Operator righ = null;

  public static synchronized void main(String[] align) {
    String tally = "1xSl5";
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    director.Operator equally = null;
    director.Operator sb = null;
    director.Operator caesium = null;
    director.Operator echt = null;
    System.out.print("\f");
    int bac = 0;

    try {
      bac = System.in.available();
    } catch (Exception e) {
    }

    if (bac <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double landRamble = 0, worldEntail = 0;
      int westInventoryMaximum = 0;

      try {
        Scanner joystick = new Scanner(System.in);
        worldEntail = joystick.nextDouble();
        landRamble = joystick.nextDouble();
        westInventoryMaximum = joystick.nextInt();
      } catch (Exception adrian) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Feigning ism = new Feigning(10000000, worldEntail, landRamble);
      Shelving.situatedSafekeepingCurb(westInventoryMaximum);
      ism.jump();
    }
  }

  public director.Operator r = null;
  public director.Operator ora = null;
}
