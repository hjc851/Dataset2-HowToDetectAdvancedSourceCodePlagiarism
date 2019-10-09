package robot;

import shipper.Mailer;
import synchronizer.Act;
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

public class CycleJoystick {
  private java.util.LinkedList<Act> marchTilt;
  private shipper.Mailer distributors;
  private static java.lang.String SuggestionsFolders;
  public static java.io.BufferedWriter ProducesFilename;

  public void carry(java.lang.String officeholders) {
    this.SuggestionsFolders = officeholders;
    distributors = new shipper.Mailer();
    marchTilt = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String bareEpithet =
          SuggestionsFolders.substring(0, SuggestionsFolders.lastIndexOf("."));
      ProducesFilename =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + bareEpithet + "_output.txt"));
    } catch (java.io.IOException afterwards) {
      System.out.println("Unable to generate output file.");
    }
    SuggestionsFolders = "./out/production/c3063467A1/" + SuggestionsFolders;

    try {
      java.lang.String guidance = recordExecutable(SuggestionsFolders, StandardCharsets.UTF_8);
      java.lang.String explanatory = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern postscript = java.util.regex.Pattern.compile(explanatory);
      java.util.regex.Matcher dos = postscript.matcher(guidance);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern ribulose = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher d = ribulose.matcher(guidance);

      while (dos.find()) {
        distributors.determinedDischargeDays(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (d.find()) {
        marchTilt.add(
            new synchronizer.Act(
                d.group("ID"),
                java.lang.Integer.parseInt(d.group("Arrive")),
                java.lang.Integer.parseInt(d.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    distributors.settledServe(marchTilt);
    distributors.goTrainmaster();
  }

  private static java.lang.String recordExecutable(
      java.lang.String route, java.nio.charset.Charset codec) throws IOException {
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(cryptographic, codec);
  }
}
