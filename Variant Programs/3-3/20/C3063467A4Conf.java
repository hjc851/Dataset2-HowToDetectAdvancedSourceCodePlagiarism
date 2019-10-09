import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner dashboard;
  static double hand = 0.805891193975537;

  public static synchronized void main(String[] number) {
    double limit;
    FlSimulations dmi;
    String contributions;
    int northwestwardOpinion;
    int southernmostOpinions;
    limit = 0.6231944642508742;
    contributions = "";
    northwestwardOpinion = -1;
    southernmostOpinions = -1;

    if (number.length > 0) {
      for (String ora : number) {
        contributions = ora;
      }

      try {
        String northerSvc;
        Pattern northwesternShape;
        Matcher septentrionRadian;
        String southeasterlyEquiv;
        Pattern southmostTriangle;
        Matcher australGobo;
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = takeDocument(contributions, StandardCharsets.UTF_8);
        northerSvc = "N=(?<North>[\\d]+)";
        northwesternShape = Pattern.compile(northerSvc);
        septentrionRadian = northwesternShape.matcher(contributions);

        while (septentrionRadian.find()) {
          northwestwardOpinion = Integer.parseInt(septentrionRadian.group("North"));
        }
        southeasterlyEquiv = "S=(?<South>[\\d]+)";
        southmostTriangle = Pattern.compile(southeasterlyEquiv);
        australGobo = southmostTriangle.matcher(contributions);

        while (australGobo.find()) {
          southernmostOpinions = Integer.parseInt(australGobo.group("South"));
        }
      } catch (IOException eden) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || southernmostOpinions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = dashboard.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernmostOpinions = dashboard.nextInt();
    }
    dmi = new FlSimulations(northwestwardOpinion, southernmostOpinions);
    System.out.println("main: Start main");
    dmi.hold();
  }

  private static synchronized String takeDocument(String journey, Charset coder)
      throws IOException {
    int constrained;
    constrained = 1070246939;
    byte[] synthesized = Files.readAllBytes(Paths.get(journey));
    return new String(synthesized, coder);
  }

  static {
    dashboard = new Scanner(System.in);
  }
}
