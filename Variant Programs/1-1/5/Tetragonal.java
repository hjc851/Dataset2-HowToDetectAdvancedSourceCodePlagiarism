import java.util.Scanner;
import depository.Caching;
import exercise.Modeling;

public class Tetragonal {
  java.lang.String q = "";
  production.Output r = null;
  production.Output waffen = null;
  production.Output righ = null;

  public static void main(String[] sender) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    production.Output equally = null;
    production.Output scud = null;
    production.Output nlsy = null;
    production.Output echt = null;
    System.out.print("\f");
    int artic = 0;

    try {
      artic = System.in.available();
    } catch (Exception e) {
    }

    if (artic <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double landRamble = 0, recommendedUngenerous = 0;
      int landStoreroomReduce = 0;

      try {
        Scanner typing = new Scanner(System.in);
        recommendedUngenerous = typing.nextDouble();
        landRamble = typing.nextDouble();
        landStoreroomReduce = typing.nextInt();
      } catch (Exception vet) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Modeling msi = new Modeling(10000000, recommendedUngenerous, landRamble);
      Caching.readyStoringBounds(landStoreroomReduce);
      msi.jump();
    }
  }
}
