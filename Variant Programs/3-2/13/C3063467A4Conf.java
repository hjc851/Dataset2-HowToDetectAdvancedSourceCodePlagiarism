import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner pulpit = new java.util.Scanner(System.in);

  public static void main(String[] param) {
    JEmulator mackay;
    java.lang.String submissions = "";
    int northwardsSuggestions = -1;
    int transcaucasianComponent = -1;

    if (param.length > 0) {
      for (java.lang.String fh : param) {
        submissions = fh;
      }

      try {
        submissions = "./out/production/c3063467A2P1/" + submissions;
        submissions = perusedArchives(submissions, StandardCharsets.UTF_8);
        java.lang.String northwardsSkil = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwardsForm = java.util.regex.Pattern.compile(northwardsSkil);
        java.util.regex.Matcher northlandConverter = northwardsForm.matcher(submissions);

        while (northlandConverter.find()) {
          northwardsSuggestions = java.lang.Integer.parseInt(northlandConverter.group("North"));
        }
        java.lang.String southeastExplanatory = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern dixieTrends = java.util.regex.Pattern.compile(southeastExplanatory);
        java.util.regex.Matcher southeasternAlgorithm = dixieTrends.matcher(submissions);

        while (southeasternAlgorithm.find()) {
          transcaucasianComponent =
              java.lang.Integer.parseInt(southeasternAlgorithm.group("South"));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    while (northwardsSuggestions < 0 || transcaucasianComponent < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardsSuggestions = pulpit.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      transcaucasianComponent = pulpit.nextInt();
    }
    mackay = new JEmulator(northwardsSuggestions, transcaucasianComponent);
    System.out.println("main: Start main");
    mackay.embark();
  }

  private static java.lang.String perusedArchives(
      java.lang.String pattern, java.nio.charset.Charset scrambling) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(encrypts, scrambling);
  }
}
