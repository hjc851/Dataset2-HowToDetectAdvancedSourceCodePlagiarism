package simulating;

import salesperson.Coordinator;
import organizer.Proceedings;
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

public class TreatModelling {
  private LinkedList<Proceedings> phaseDirectory;
  private Coordinator resellers;
  private static String ParticipationSubmitted;
  public static BufferedWriter ThroughputDocument;

  public void lean(String nsi) {
    this.ParticipationSubmitted = nsi;
    resellers = new Coordinator();
    phaseDirectory = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String eliminatedConstitute =
          ParticipationSubmitted.substring(0, ParticipationSubmitted.lastIndexOf("."));
      ThroughputDocument =
          new BufferedWriter(
              new FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (IOException late) {
      System.out.println("Unable to generate output file.");
    }
    ParticipationSubmitted = "./out/production/c3063467A1/" + ParticipationSubmitted;

    try {
      String opinion = learnRegister(ParticipationSubmitted, StandardCharsets.UTF_8);
      String exc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(exc);
      Matcher manuscript = p.matcher(opinion);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a2 = Pattern.compile(exp2);
      Matcher fab = a2.matcher(opinion);

      while (manuscript.find()) {
        resellers.determineDetachmentBeginning(Integer.parseInt(manuscript.group("DISP")));
      }

      while (fab.find()) {
        phaseDirectory.add(
            new Proceedings(
                fab.group("ID"),
                Integer.parseInt(fab.group("Arrive")),
                Integer.parseInt(fab.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception combatants) {
      System.out.println(combatants.toString());
    }
    resellers.arrangeMethods(phaseDirectory);
    resellers.meltResellers();
  }

  private static String learnRegister(String track, Charset coding) throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(track));
    return new String(consolidated, coding);
  }
}
