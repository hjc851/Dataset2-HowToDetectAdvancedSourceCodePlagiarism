import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner pulpit = new Scanner(System.in);

  public static void main(String[] use) {
    P6Device siem;
    String contributions = "";
    int unionPerspective = -1;
    int regionRepresentations = -1;

    if (use.length > 0) {
      for (String fh : use) {
        contributions = fh;
      }

      try {
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = registerSubmit(contributions, StandardCharsets.UTF_8);
        String northmostSupp = "N=(?<North>[\\d]+)";
        Pattern northwardsForm = Pattern.compile(northmostSupp);
        Matcher northwestVariable = northwardsForm.matcher(contributions);

        while (northwestVariable.find()) {
          unionPerspective = Integer.parseInt(northwestVariable.group("North"));
        }
        String transcaucasianBens = "S=(?<South>[\\d]+)";
        Pattern southeastwardTrend = Pattern.compile(transcaucasianBens);
        Matcher sRadian = southeastwardTrend.matcher(contributions);

        while (sRadian.find()) {
          regionRepresentations = Integer.parseInt(sRadian.group("South"));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    while (unionPerspective < 0 || regionRepresentations < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      unionPerspective = pulpit.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      regionRepresentations = pulpit.nextInt();
    }
    siem = new P6Device(unionPerspective, regionRepresentations);
    System.out.println("main: Start main");
    siem.starting();
  }

  private static String registerSubmit(String trail, Charset encrypting) throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(trail));
    return new String(concatenated, encrypting);
  }
}
