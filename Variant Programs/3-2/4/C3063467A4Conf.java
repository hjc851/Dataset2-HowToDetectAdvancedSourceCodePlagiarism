import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner rras = new Scanner(System.in);

  public static void main(String[] ing) {
    PtDemo cis;
    String consultation = "";
    int northwardsSuggestions = -1;
    int sAssistance = -1;

    if (ing.length > 0) {
      for (String fh : ing) {
        consultation = fh;
      }

      try {
        consultation = "./out/production/c3063467A2P1/" + consultation;
        consultation = scanFolders(consultation, StandardCharsets.UTF_8);
        String nordCust = "N=(?<North>[\\d]+)";
        Pattern regionBehavior = Pattern.compile(nordCust);
        Matcher northernmostFinder = regionBehavior.matcher(consultation);

        while (northernmostFinder.find()) {
          northwardsSuggestions = Integer.parseInt(northernmostFinder.group("North"));
        }
        String southwestInteractive = "S=(?<South>[\\d]+)";
        Pattern australCharacteristics = Pattern.compile(southwestInteractive);
        Matcher transcaucasianPseudorandom = australCharacteristics.matcher(consultation);

        while (transcaucasianPseudorandom.find()) {
          sAssistance = Integer.parseInt(transcaucasianPseudorandom.group("South"));
        }
      } catch (IOException con) {
        System.out.println("");
      }
    }

    while (northwardsSuggestions < 0 || sAssistance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardsSuggestions = rras.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      sAssistance = rras.nextInt();
    }
    cis = new PtDemo(northwardsSuggestions, sAssistance);
    System.out.println("main: Start main");
    cis.commencement();
  }

  private static String scanFolders(String roadway, Charset encrypted) throws IOException {
    byte[] formatted = Files.readAllBytes(Paths.get(roadway));
    return new String(formatted, encrypted);
  }
}
