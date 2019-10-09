package faker;

import starter.Trainmaster;
import developer.Act;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class MechanismMockup {
  public java.util.LinkedList<Act> negotiationsListings;
  public starter.Trainmaster originator;
  public static java.lang.String SuggestionsFolders;
  public static java.io.BufferedWriter CropData;

  public synchronized void outpouring(java.lang.String details) {
    this.SuggestionsFolders = details;
    originator = new starter.Trainmaster();
    negotiationsListings = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String disassembledPatronymic =
          SuggestionsFolders.substring(0, SuggestionsFolders.lastIndexOf("."));
      CropData =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + disassembledPatronymic + "_output.txt"));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }
    SuggestionsFolders = "./out/production/c3063467A1/" + SuggestionsFolders;

    try {
      java.lang.String component = hearBinder(SuggestionsFolders, StandardCharsets.UTF_8);
      java.lang.String knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = compile(knowl);
      java.util.regex.Matcher manuscript = cern.matcher(component);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern ap = compile(exp2);
      java.util.regex.Matcher e2 = ap.matcher(component);

      while (manuscript.find()) {
        originator.bentSendingHour(parseInt(manuscript.group("DISP")));
      }

      while (e2.find()) {
        negotiationsListings.add(
            new developer.Act(
                e2.group("ID"), parseInt(e2.group("Arrive")), parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abel) {
      System.out.println(abel.toString());
    }
    originator.determineProces(negotiationsListings);
    originator.leadCoordinator();
  }

  public static synchronized java.lang.String hearBinder(
      java.lang.String trail, java.nio.charset.Charset cipher) throws IOException {
    byte[] demodulated = readAllBytes(get(trail));
    return new java.lang.String(demodulated, cipher);
  }
}
