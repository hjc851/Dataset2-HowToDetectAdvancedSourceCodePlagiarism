package brake;

import trainmaster.Yardmaster;
import organizer.Proceeding;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NegotiationsAvionics {
  private java.util.LinkedList<Proceeding> mechanismAgenda;
  private trainmaster.Yardmaster retailer;
  private static java.lang.String SubmissionsDocument;
  public static java.io.BufferedWriter ProductivityDocuments;

  public void course(java.lang.String entries) {
    this.SubmissionsDocument = entries;
    retailer = new trainmaster.Yardmaster();
    mechanismAgenda = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String eliminatedConstitute =
          SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf("."));
      ProductivityDocuments =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (java.io.IOException eden) {
      System.out.println("Unable to generate output file.");
    }
    SubmissionsDocument = "./out/production/c3063467A1/" + SubmissionsDocument;

    try {
      java.lang.String feedback = tellReadme(SubmissionsDocument, StandardCharsets.UTF_8);
      java.lang.String bens = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(bens);
      java.util.regex.Matcher manuscript = vig.matcher(feedback);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern b2 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher f3 = b2.matcher(feedback);

      while (manuscript.find()) {
        retailer.putDespatchClock(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (f3.find()) {
        mechanismAgenda.add(
            new organizer.Proceeding(
                f3.group("ID"),
                java.lang.Integer.parseInt(f3.group("Arrive")),
                java.lang.Integer.parseInt(f3.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception exwife) {
      System.out.println(exwife.toString());
    }
    retailer.laidOperation(mechanismAgenda);
    retailer.extendDealer();
  }

  private static java.lang.String tellReadme(
      java.lang.String pattern, java.nio.charset.Charset metadata) throws IOException {
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(scrambled, metadata);
  }
}
