import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner comfort = new Scanner(System.in);

  public static void main(String[] ae) {
    PvKinematics slm;
    String suggestions = "";
    int northeastwardParticipation = -1;
    int southwesternSuggestions = -1;

    if (ae.length > 0) {
      for (String waffen : ae) {
        suggestions = waffen;
      }

      try {
        suggestions = "./out/production/c3063467A2P1/" + suggestions;
        suggestions = translateDocuments(suggestions, StandardCharsets.UTF_8);
        String southOpe = "N=(?<North>[\\d]+)";
        Pattern northwestRule = Pattern.compile(southOpe);
        Matcher northwestVariable = northwestRule.matcher(suggestions);

        while (northwestVariable.find()) {
          northeastwardParticipation = Integer.parseInt(northwestVariable.group("North"));
        }
        String dixielandSupp = "S=(?<South>[\\d]+)";
        Pattern southwesterlyConvention = Pattern.compile(dixielandSupp);
        Matcher dixieConverter = southwesterlyConvention.matcher(suggestions);

        while (dixieConverter.find()) {
          southwesternSuggestions = Integer.parseInt(dixieConverter.group("South"));
        }
      } catch (IOException admittedly) {
        System.out.println("");
      }
    }

    while (northeastwardParticipation < 0 || southwesternSuggestions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastwardParticipation = comfort.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesternSuggestions = comfort.nextInt();
    }
    slm = new PvKinematics(northeastwardParticipation, southwesternSuggestions);
    System.out.println("main: Start main");
    slm.launch();
  }

  private static String translateDocuments(String pathway, Charset codification)
      throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(pathway));
    return new String(decodes, codification);
  }
}
