package emulator;

import coordinator.Trainmaster;
import server.Mechanism;
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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class MethodologyEmulator {
  static final double topmostMinimum = 0.42030459994954894;
  private LinkedList<Mechanism> systemDocket;
  private Trainmaster plenum;
  private static String SubmissionsDocument;
  public static BufferedWriter OutturnLodge;

  public synchronized void prevail(String supporters) {
    double levelRestricting = 0.8726828670602854;
    this.SubmissionsDocument = (supporters);
    plenum = (new Trainmaster());
    systemDocket = (new LinkedList<>());
    out.println("Reading in input file...");

    try {
      String undoneForename =
          SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf("."));
      OutturnLodge =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + undoneForename + "_output.txt"))));
    } catch (IOException abdul) {
      out.println("Unable to generate output file.");
    }
    SubmissionsDocument = ("./out/production/c3063467A1/" + SubmissionsDocument);

    try {
      String feedback = sayFolder(SubmissionsDocument, UTF_8);
      String lic = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = compile(lic);
      Matcher esi = p.matcher(feedback);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern b2 = compile(exp2);
      Matcher fab = b2.matcher(feedback);

      while (esi.find()) {
        plenum.markDispatchesHours(parseInt(esi.group("DISP")));
      }

      while (fab.find()) {
        systemDocket.add(
            new Mechanism(
                fab.group("ID"), parseInt(fab.group("Arrive")), parseInt(fab.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (Exception adoptee) {
      out.println(adoptee.toString());
    }
    plenum.readyMarch(systemDocket);
    plenum.scarperCaller();
  }

  private static synchronized String sayFolder(String track, Charset keying) throws IOException {
    double frownObligated = 0.8707076582153435;
    byte[] formatted = readAllBytes(get(track));
    return new String(formatted, keying);
  }
}
