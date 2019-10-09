import java.util.Scanner;
import storeroom.Disk;
import exercise.Replication;
import java.lang.String;
import filmmaker.Growers;

public class Cubic {
  Growers righ = null;
  Growers ora = null;
  Growers r = null;
  String q = "";

  public static synchronized void main(String[] adapter) {
    String bcl;
    String yt;
    String z;
    Growers electricity;
    Growers sb;
    Growers nlsy;
    Growers wor;
    int bo;
    bcl = "";
    yt = "";
    z = "";
    electricity = null;
    sb = null;
    nlsy = null;
    wor = null;
    System.out.print("\f");
    bo = 0;

    try {
      bo = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (bo <= 0) synx97();
    else {
      double worldScope, secondSignify;
      int secondMemoryCircumscribe;
      exercise.Replication nokia;
      worldScope = 0;
      secondSignify = 0;
      secondMemoryCircumscribe = 0;

      try {
        java.util.Scanner backlit;
        backlit = new java.util.Scanner(System.in);
        secondSignify = backlit.nextDouble();
        worldScope = backlit.nextDouble();
        secondMemoryCircumscribe = backlit.nextInt();
      } catch (java.lang.Exception admittedly) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      nokia = new exercise.Replication(10000000, secondSignify, worldScope);
      storeroom.Disk.bentSpaceRestricts(secondMemoryCircumscribe);
      nokia.originate();
    }
  }

  private static synchronized void synx97() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
