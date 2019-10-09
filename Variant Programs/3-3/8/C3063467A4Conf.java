import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner brackets;

  public static synchronized void main(String[] sender) {
    CFaker ism;
    String assistance = "";
    int northwardOpinions = -1;
    int regionRepresentations = -1;

    if (sender.length > 0) {
      for (String ora : sender) {
        assistance = ora;
      }

      try {
        assistance = "./out/production/c3063467A2P1/" + assistance;
        assistance = writeDatabase(assistance, StandardCharsets.UTF_8);
        String northerlyEquiv = "N=(?<North>[\\d]+)";
        Pattern northwestwardConvention = Pattern.compile(northerlyEquiv);
        Matcher northerCreaser = northwestwardConvention.matcher(assistance);

        while (northerCreaser.find()) {
          northwardOpinions = Integer.parseInt(northerCreaser.group("North"));
        }
        String southmostLic = "S=(?<South>[\\d]+)";
        Pattern southernmostNormal = Pattern.compile(southmostLic);
        Matcher southeastwardSpooler = southernmostNormal.matcher(assistance);

        while (southeastwardSpooler.find()) {
          regionRepresentations = Integer.parseInt(southeastwardSpooler.group("South"));
        }
      } catch (IOException abel) {
        System.out.println("");
      }
    }

    while (northwardOpinions < 0 || regionRepresentations < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardOpinions = brackets.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      regionRepresentations = brackets.nextInt();
    }
    ism = new CFaker(northwardOpinions, regionRepresentations);
    System.out.println("main: Start main");
    ism.opens();
  }

  private static synchronized String writeDatabase(String process, Charset encrypt)
      throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(process));
    return new String(instantiated, encrypt);
  }

  static {
    brackets = new Scanner(System.in);
  }
}
