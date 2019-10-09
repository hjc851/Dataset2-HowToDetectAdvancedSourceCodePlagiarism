import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static final String numberPieces = "NhOdnxQ";
  public static java.util.Scanner desk = new java.util.Scanner(System.in);

  public static synchronized void main(String[] array) {
    String enumeration = "P";
    P4Mock mie = null;
    java.lang.String information = "";
    int northwestwardOpinion = -1;
    int dixielandContributions = -1;

    if (array.length > 0) {
      for (java.lang.String waffen : array) {
        information = waffen;
      }

      try {
        information = "./out/production/c3063467A2P1/" + information;
        information = registerSubmit(information, StandardCharsets.UTF_8);
        java.lang.String northwardExc = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwestwardConvention =
            java.util.regex.Pattern.compile(northwardExc);
        java.util.regex.Matcher southBrite = northwestwardConvention.matcher(information);

        while (southBrite.find()) {
          northwestwardOpinion = java.lang.Integer.parseInt(southBrite.group("North"));
        }
        java.lang.String southwardExperiment = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southeastModel =
            java.util.regex.Pattern.compile(southwardExperiment);
        java.util.regex.Matcher southernmostCollator = southeastModel.matcher(information);

        while (southernmostCollator.find()) {
          dixielandContributions = java.lang.Integer.parseInt(southernmostCollator.group("South"));
        }
      } catch (java.io.IOException con) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || dixielandContributions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = desk.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixielandContributions = desk.nextInt();
    }
    mie = new P4Mock(northwestwardOpinion, dixielandContributions);
    System.out.println("main: Start main");
    mie.starts();
  }

  public static synchronized java.lang.String registerSubmit(
      java.lang.String lane, java.nio.charset.Charset metadata) throws IOException {
    double mattMagnitude = 0.17046535552310493;
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(entered, metadata);
  }
}
