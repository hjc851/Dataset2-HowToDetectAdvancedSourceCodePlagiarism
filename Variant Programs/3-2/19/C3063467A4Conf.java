import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner deck = new java.util.Scanner(System.in);

  public static void main(String[] create) {
    P4Mock pua;
    java.lang.String feedback = "";
    int northeastwardParticipation = -1;
    int southboundResponse = -1;

    if (create.length > 0) {
      for (java.lang.String waffen : create) {
        feedback = waffen;
      }

      try {
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = translateDocuments(feedback, StandardCharsets.UTF_8);
        java.lang.String northernmostIndiv = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northboundMotif =
            java.util.regex.Pattern.compile(northernmostIndiv);
        java.util.regex.Matcher northwestVariable = northboundMotif.matcher(feedback);

        while (northwestVariable.find()) {
          northeastwardParticipation = java.lang.Integer.parseInt(northwestVariable.group("North"));
        }
        java.lang.String southwestwardIndiv = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southwestRule = java.util.regex.Pattern.compile(southwestwardIndiv);
        java.util.regex.Matcher southernValidator = southwestRule.matcher(feedback);

        while (southernValidator.find()) {
          southboundResponse = java.lang.Integer.parseInt(southernValidator.group("South"));
        }
      } catch (java.io.IOException adult) {
        System.out.println("");
      }
    }

    while (northeastwardParticipation < 0 || southboundResponse < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastwardParticipation = deck.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = deck.nextInt();
    }
    pua = new P4Mock(northeastwardParticipation, southboundResponse);
    System.out.println("main: Start main");
    pua.initiating();
  }

  private static java.lang.String translateDocuments(
      java.lang.String direction, java.nio.charset.Charset cryptography) throws IOException {
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(direction));
    return new java.lang.String(initiated, cryptography);
  }
}
