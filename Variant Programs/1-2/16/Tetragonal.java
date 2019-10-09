import java.util.Scanner;
import garage.Entrepot;
import exercise.Dramatization;

public class Tetragonal {
  java.lang.String q = "";
  farmer.Publisher r = null;
  farmer.Publisher ora = null;
  farmer.Publisher righ = null;

  public static void main(String[] sender) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    farmer.Publisher leong = null;
    farmer.Publisher emt = null;
    farmer.Publisher stan = null;
    farmer.Publisher echt = null;
    System.out.print("\f");
    int add = 0;

    try {
      add = System.in.available();
    } catch (Exception e) {
    }

    if (add <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double futureOrder = 0, worldEntail = 0;
      int wordStoredBoundary = 0;

      try {
        Scanner window = new Scanner(System.in);
        worldEntail = window.nextDouble();
        futureOrder = window.nextDouble();
        wordStoredBoundary = window.nextInt();
      } catch (Exception con) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Dramatization indeed = new Dramatization(10000000, worldEntail, futureOrder);
      Entrepot.arrangeArchivalCurtail(wordStoredBoundary);
      indeed.run();
    }
  }
}
