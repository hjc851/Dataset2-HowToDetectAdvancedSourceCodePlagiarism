package sim;

import consignor.Limiter;
import spooler.March;
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

public class ActMock {
  private java.util.LinkedList<March> treatLitany;
  private consignor.Limiter trainmaster;
  private static java.lang.String FeedbackFolder;
  public static java.io.BufferedWriter SupplyDocumentation;

  public void move(java.lang.String immigration) {
    this.FeedbackFolder = immigration;
    trainmaster = new consignor.Limiter();
    treatLitany = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String plunderedMoniker =
          FeedbackFolder.substring(0, FeedbackFolder.lastIndexOf("."));
      SupplyDocumentation =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + plunderedMoniker + "_output.txt"));
    } catch (java.io.IOException libris) {
      System.out.println("Unable to generate output file.");
    }
    FeedbackFolder = "./out/production/c3063467A1/" + FeedbackFolder;

    try {
      java.lang.String suggestions = learnRegister(FeedbackFolder, StandardCharsets.UTF_8);
      java.lang.String ind = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = java.util.regex.Pattern.compile(ind);
      java.util.regex.Matcher dos = writes.matcher(suggestions);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern ap = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher pk = ap.matcher(suggestions);

      while (dos.find()) {
        trainmaster.adjustDispatchedMonth(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (pk.find()) {
        treatLitany.add(
            new spooler.March(
                pk.group("ID"),
                java.lang.Integer.parseInt(pk.group("Arrive")),
                java.lang.Integer.parseInt(pk.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abbe) {
      System.out.println(abbe.toString());
    }
    trainmaster.solidifyingOperations(treatLitany);
    trainmaster.leadCoordinator();
  }

  private static java.lang.String learnRegister(
      java.lang.String roadway, java.nio.charset.Charset cryptography) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(ciphered, cryptography);
  }
}
