import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  public static Scanner dashboards = new Scanner(System.in);

  public static synchronized void main(String[] claims) {
    CFaker yes;
    String output;
    int northwardOpinions;
    int northernComments;
    output = "";
    northwardOpinions = -1;
    northernComments = -1;

    if (claims.length > 0) {
      for (String ora : claims) {
        output = ora;
      }

      try {
        String northeasterlyYrs;
        Pattern northerlyFigure;
        Matcher northeastClassifier;
        String southeastExplanatory;
        Pattern northChart;
        Matcher southwestVariable;
        output = "./out/production/c3063467A2P1/" + output;
        output = hearBinder(output, StandardCharsets.UTF_8);
        northeasterlyYrs = "N=(?<North>[\\d]+)";
        northerlyFigure = compile(northeasterlyYrs);
        northeastClassifier = northerlyFigure.matcher(output);

        while (northeastClassifier.find()) {
          northwardOpinions = parseInt(northeastClassifier.group("North"));
        }
        southeastExplanatory = "S=(?<South>[\\d]+)";
        northChart = compile(southeastExplanatory);
        southwestVariable = northChart.matcher(output);

        while (southwestVariable.find()) {
          northernComments = parseInt(southwestVariable.group("South"));
        }
      } catch (IOException con) {
        System.out.println("");
      }
    }

    while (northwardOpinions < 0 || northernComments < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardOpinions = dashboards.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northernComments = dashboards.nextInt();
    }
    yes = new CFaker(northwardOpinions, northernComments);
    System.out.println("main: Start main");
    yes.commencement();
  }

  public static synchronized String hearBinder(String route, Charset encrypting)
      throws IOException {
    byte[] demodulated = readAllBytes(get(route));
    return new String(demodulated, encrypting);
  }
}
