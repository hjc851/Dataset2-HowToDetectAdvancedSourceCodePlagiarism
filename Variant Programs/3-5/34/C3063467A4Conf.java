import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.lang.System.in;

public class C3063467A4Conf {

  public static synchronized void main(String[] event) {
    AtAnalogue sem;
    String comments;
    int northernmostSubmissions;
    int dixielandContributions;
    comments = "";
    northernmostSubmissions = -1;
    dixielandContributions = -1;

    if (event.length > 0) {
      for (String fh : event) {
        comments = fh;
      }

      try {
        String nLic;
        Pattern northernFormula;
        Matcher northwardCollator;
        String southerlyYrs;
        Pattern southmostTriangle;
        Matcher dixielandSelectable;
        comments = "./out/production/c3063467A2P1/" + comments;
        comments = sayFolder(comments, UTF_8);
        nLic = "N=(?<North>[\\d]+)";
        northernFormula = Pattern.compile(nLic);
        northwardCollator = northernFormula.matcher(comments);

        while (northwardCollator.find()) {
          northernmostSubmissions = Integer.parseInt(northwardCollator.group("North"));
        }
        southerlyYrs = "S=(?<South>[\\d]+)";
        southmostTriangle = Pattern.compile(southerlyYrs);
        dixielandSelectable = southmostTriangle.matcher(comments);

        while (dixielandSelectable.find()) {
          dixielandContributions = Integer.parseInt(dixielandSelectable.group("South"));
        }
      } catch (IOException former) {
        out.println("");
      }
    }

    while (northernmostSubmissions < 0 || dixielandContributions < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      northernmostSubmissions = pulpit.nextInt();
      out.println("Enter the number of South Island Farmers to initialize:");
      dixielandContributions = pulpit.nextInt();
    }
    sem = new AtAnalogue(northernmostSubmissions, dixielandContributions);
    out.println("main: Start main");
    sem.initiate();
  }

  private static Scanner pulpit = new Scanner(in);

  private static synchronized String sayFolder(String road, Charset encryption) throws IOException {
    byte[] formatted = Files.readAllBytes(Paths.get(road));
    return new String(formatted, encryption);
  }
}
