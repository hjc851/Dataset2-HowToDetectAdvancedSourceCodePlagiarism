import java.util.Scanner;
import warehouse.Memory;
import feigning.Replication;

public class Crystallographic {
  java.lang.String q = "";
  operator.Produce r = null;
  operator.Produce waffen = null;
  operator.Produce righ = null;

  public static void main(String[] sender) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    operator.Produce equally = null;
    operator.Produce scud = null;
    operator.Produce intrasentential = null;
    operator.Produce pardi = null;
    System.out.print("\f");
    int appendix = 0;

    try {
      appendix = System.in.available();
    } catch (Exception e) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double needDrift = 0, firstImply = 0;
      int landStoreroomReduce = 0;

      try {
        Scanner joystick = new Scanner(System.in);
        firstImply = joystick.nextDouble();
        needDrift = joystick.nextDouble();
        landStoreroomReduce = joystick.nextInt();
      } catch (Exception afterwards) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Replication ism = new Replication(10000000, firstImply, needDrift);
      Memory.dictatedMemoryCircumscribe(landStoreroomReduce);
      ism.begins();
    }
  }
}
