import java.util.Scanner;
import depository.Depository;
import simulates.Pretense;
import static java.lang.System.out;
import static java.lang.System.in;

public class Chiral {
  public fabricator.Promoter waffen = null;

  public static synchronized void main(String[] rationalizations) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    fabricator.Promoter arsenic = null;
    fabricator.Promoter emt = null;
    fabricator.Promoter cathode = null;
    fabricator.Promoter wor = null;
    out.print("\f");
    int annex = 0;

    try {
      annex = (in.available());
    } catch (Exception e) {
    }

    if (annex <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double endCrop = 0, willHateful = 0;
      int futureDepositoryConstrain = 0;

      try {
        Scanner portable = new Scanner(in);
        willHateful = (portable.nextDouble());
        endCrop = (portable.nextDouble());
        futureDepositoryConstrain = (portable.nextInt());
      } catch (Exception abe) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Pretense mie = new Pretense(10000000, willHateful, endCrop);
      Depository.layEntrepotRestrain(futureDepositoryConstrain);
      mie.jump();
    }
  }

  public fabricator.Promoter righ = null;
  public java.lang.String q = "";
  public fabricator.Promoter r = null;
}
