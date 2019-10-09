import java.util.Scanner;
import memory.Garage;
import analogy.Replication;

public class Trigonal {
  java.lang.String q = "";
  publisher.Grower r = null;
  publisher.Grower fh = null;
  publisher.Grower righ = null;

  public static void main(String[] param) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    publisher.Grower spain = null;
    publisher.Grower sb = null;
    publisher.Grower caesium = null;
    publisher.Grower pardi = null;
    System.out.print("\f");
    int lable = 0;

    try {
      lable = System.in.available();
    } catch (Exception e) {
    }

    if (lable <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double firstArray = 0, willHateful = 0;
      int willSpaceRestricts = 0;

      try {
        Scanner handheld = new Scanner(System.in);
        willHateful = handheld.nextDouble();
        firstArray = handheld.nextDouble();
        willSpaceRestricts = handheld.nextInt();
      } catch (Exception pro) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Replication dvs = new Replication(10000000, willHateful, firstArray);
      Garage.placedCacheThrottle(willSpaceRestricts);
      dvs.began();
    }
  }
}
