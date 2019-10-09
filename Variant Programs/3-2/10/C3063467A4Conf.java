import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner consul = new Scanner(System.in);

  public static void main(String[] constructor) {
    AtAnalogue dvs;
    String contributions = "";
    int northwardOpinions = -1;
    int southernStimulant = -1;

    if (constructor.length > 0) {
      for (String ora : constructor) {
        contributions = ora;
      }

      try {
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = registerSubmit(contributions, StandardCharsets.UTF_8);
        String northmostSupp = "N=(?<North>[\\d]+)";
        Pattern northwestRule = Pattern.compile(northmostSupp);
        Matcher unionAspx = northwestRule.matcher(contributions);

        while (unionAspx.find()) {
          northwardOpinions = Integer.parseInt(unionAspx.group("North"));
        }
        String southmostLic = "S=(?<South>[\\d]+)";
        Pattern southerlyDesign = Pattern.compile(southmostLic);
        Matcher southernmostCollator = southerlyDesign.matcher(contributions);

        while (southernmostCollator.find()) {
          southernStimulant = Integer.parseInt(southernmostCollator.group("South"));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    while (northwardOpinions < 0 || southernStimulant < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardOpinions = consul.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southernStimulant = consul.nextInt();
    }
    dvs = new AtAnalogue(northwardOpinions, southernStimulant);
    System.out.println("main: Start main");
    dvs.come();
  }

  private static String registerSubmit(String trail, Charset coding) throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(trail));
    return new String(cryptographic, coding);
  }
}
