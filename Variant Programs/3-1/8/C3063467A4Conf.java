import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner brackets = new Scanner(System.in);

  public static void main(String[] specified) {
    FImpactor yes;
    String output = "";
    int northwardsSuggestions = -1;
    int australInvolvement = -1;

    if (specified.length > 0) {
      for (String ora : specified) {
        output = ora;
      }

      try {
        output = "./out/production/c3063467A2P1/" + output;
        output = rereadSubmitted(output, StandardCharsets.UTF_8);
        String northwardExc = "N=(?<North>[\\d]+)";
        Pattern northboundMotif = Pattern.compile(northwardExc);
        Matcher septentrionRadian = northboundMotif.matcher(output);

        while (septentrionRadian.find()) {
          northwardsSuggestions = Integer.parseInt(septentrionRadian.group("North"));
        }
        String southwesterlyPkg = "S=(?<South>[\\d]+)";
        Pattern southmostTriangle = Pattern.compile(southwesterlyPkg);
        Matcher southeasterlyRecognizer = southmostTriangle.matcher(output);

        while (southeasterlyRecognizer.find()) {
          australInvolvement = Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (IOException eden) {
        System.out.println("");
      }
    }

    while (northwardsSuggestions < 0 || australInvolvement < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardsSuggestions = brackets.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      australInvolvement = brackets.nextInt();
    }
    yes = new FImpactor(northwardsSuggestions, australInvolvement);
    System.out.println("main: Start main");
    yes.take();
  }

  private static String rereadSubmitted(String destiny, Charset coded) throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(destiny));
    return new String(decodes, coded);
  }
}
