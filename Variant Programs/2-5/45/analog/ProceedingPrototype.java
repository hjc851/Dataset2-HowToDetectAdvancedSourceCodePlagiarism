package analog;

import salesperson.Resellers;
import synchronization.Proceedings;
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

public class ProceedingPrototype {
  private java.util.LinkedList<Proceedings> negotiationsListings = null;
  private salesperson.Resellers device = null;
  private static java.lang.String ResponseDatabase = null;
  public static java.io.BufferedWriter ExportationPapers = null;

  public synchronized void lean(java.lang.String entries) {
    this.ResponseDatabase = entries;
    device = new salesperson.Resellers();
    negotiationsListings = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String bareEpithet =
          ResponseDatabase.substring(0, ResponseDatabase.lastIndexOf("."));
      ExportationPapers =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + bareEpithet + "_output.txt"));
    } catch (java.io.IOException late) {
      System.out.println("Unable to generate output file.");
    }
    ResponseDatabase = "./out/production/c3063467A1/" + ResponseDatabase;

    try {
      java.lang.String participation = registerSubmit(ResponseDatabase, StandardCharsets.UTF_8);
      java.lang.String knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = compile(knowl);
      java.util.regex.Matcher dos = writes.matcher(participation);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern gpi = compile(exp2);
      java.util.regex.Matcher cm2 = gpi.matcher(participation);

      while (dos.find()) {
        device.primedExpeditionPeriod(parseInt(dos.group("DISP")));
      }

      while (cm2.find()) {
        negotiationsListings.add(
            new synchronization.Proceedings(
                cm2.group("ID"), parseInt(cm2.group("Arrive")), parseInt(cm2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    device.settledServe(negotiationsListings);
    device.moveSender();
  }

  private static synchronized java.lang.String registerSubmit(
      java.lang.String journey, java.nio.charset.Charset consolidation) throws IOException {
    byte[] demodulated = readAllBytes(get(journey));
    return new java.lang.String(demodulated, consolidation);
  }
}
