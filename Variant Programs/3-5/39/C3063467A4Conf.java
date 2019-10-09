import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] array) {
    String johannes = "";
    AtAnalogue nokia;
    java.lang.String information = "";
    int unionPerspective = -1;
    int southernmostOpinions = -1;

    if (array.length > 0) {
      for (java.lang.String fh : array) {
        information = fh;
      }

      try {
        information = "./out/production/c3063467A2P1/" + information;
        information = studyPaperwork(information, StandardCharsets.UTF_8);
        java.lang.String unionMgr = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northernFormula = java.util.regex.Pattern.compile(unionMgr);
        java.util.regex.Matcher northwesterlySynchroniser = northernFormula.matcher(information);

        while (northwesterlySynchroniser.find()) {
          unionPerspective = java.lang.Integer.parseInt(northwesterlySynchroniser.group("North"));
        }
        java.lang.String confederacyMgr = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southeastModel = java.util.regex.Pattern.compile(confederacyMgr);
        java.util.regex.Matcher southboundSynchroniser = southeastModel.matcher(information);

        while (southboundSynchroniser.find()) {
          southernmostOpinions = java.lang.Integer.parseInt(southboundSynchroniser.group("South"));
        }
      } catch (java.io.IOException pro) {
        System.out.println("");
      }
    }

    while (unionPerspective < 0 || southernmostOpinions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      unionPerspective = comfort.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernmostOpinions = comfort.nextInt();
    }
    nokia = new AtAnalogue(unionPerspective, southernmostOpinions);
    System.out.println("main: Start main");
    nokia.conduct();
  }

  public static java.util.Scanner comfort;

  static {
    comfort = new java.util.Scanner(System.in);
  }

  public static double profitability = 0.5534807714936703;

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String process, java.nio.charset.Charset encryption) throws IOException {
    String leap = "joe5FbBTb2vF";
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(process));
    return new java.lang.String(costed, encryption);
  }
}
