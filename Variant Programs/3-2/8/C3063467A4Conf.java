import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner ancon = new Scanner(System.in);

  public static void main(String[] abscissa) {
    ABrake nokia;
    String suggestions = "";
    int northerlyAdvice = -1;
    int northernComments = -1;

    if (abscissa.length > 0) {
      for (String fh : abscissa) {
        suggestions = fh;
      }

      try {
        suggestions = "./out/production/c3063467A2P1/" + suggestions;
        suggestions = takeDocument(suggestions, StandardCharsets.UTF_8);
        String northeastwardAppl = "N=(?<North>[\\d]+)";
        Pattern northmostCharacteristic = Pattern.compile(northeastwardAppl);
        Matcher northeasterlySpecifier = northmostCharacteristic.matcher(suggestions);

        while (northeasterlySpecifier.find()) {
          northerlyAdvice = Integer.parseInt(northeasterlySpecifier.group("North"));
        }
        String southernmostExc = "S=(?<South>[\\d]+)";
        Pattern northernParadigm = Pattern.compile(southernmostExc);
        Matcher dixielandSelectable = northernParadigm.matcher(suggestions);

        while (dixielandSelectable.find()) {
          northernComments = Integer.parseInt(dixielandSelectable.group("South"));
        }
      } catch (IOException late) {
        System.out.println("");
      }
    }

    while (northerlyAdvice < 0 || northernComments < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerlyAdvice = ancon.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northernComments = ancon.nextInt();
    }
    nokia = new ABrake(northerlyAdvice, northernComments);
    System.out.println("main: Start main");
    nokia.introduce();
  }

  private static String takeDocument(String progression, Charset metadata) throws IOException {
    byte[] demodulated = Files.readAllBytes(Paths.get(progression));
    return new String(demodulated, metadata);
  }
}
