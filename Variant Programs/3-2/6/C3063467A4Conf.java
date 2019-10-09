import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner mainframe = new java.util.Scanner(System.in);

  public static void main(String[] align) {
    MiAvionics dmi;
    java.lang.String output = "";
    int northeasternConsultation = -1;
    int northParticipatory = -1;

    if (align.length > 0) {
      for (java.lang.String ora : align) {
        output = ora;
      }

      try {
        output = "./out/production/c3063467A2P1/" + output;
        output = proofreadComplaint(output, StandardCharsets.UTF_8);
        java.lang.String southernPlu = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northerTemplate = java.util.regex.Pattern.compile(southernPlu);
        java.util.regex.Matcher northeastClassifier = northerTemplate.matcher(output);

        while (northeastClassifier.find()) {
          northeasternConsultation = java.lang.Integer.parseInt(northeastClassifier.group("North"));
        }
        java.lang.String northOpe = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southwesternForm = java.util.regex.Pattern.compile(northOpe);
        java.util.regex.Matcher dixieConverter = southwesternForm.matcher(output);

        while (dixieConverter.find()) {
          northParticipatory = java.lang.Integer.parseInt(dixieConverter.group("South"));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || northParticipatory < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = mainframe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northParticipatory = mainframe.nextInt();
    }
    dmi = new MiAvionics(northeasternConsultation, northParticipatory);
    System.out.println("main: Start main");
    dmi.commenced();
  }

  private static java.lang.String proofreadComplaint(
      java.lang.String process, java.nio.charset.Charset codifying) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(process));
    return new java.lang.String(keyed, codifying);
  }
}
