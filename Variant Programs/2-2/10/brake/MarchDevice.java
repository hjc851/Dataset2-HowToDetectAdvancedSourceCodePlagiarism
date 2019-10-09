package brake;

import responsible.Responsible;
import workspace.Proceedings;
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

public class MarchDevice {
  private LinkedList<Proceedings> workLean;
  private Responsible retailer;
  private static String ParticipationSubmitted;
  public static BufferedWriter EfficiencyDocket;

  public void bleed(String elected) {
    this.ParticipationSubmitted = elected;
    retailer = new Responsible();
    workLean = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String abolishedDiscover =
          ParticipationSubmitted.substring(0, ParticipationSubmitted.lastIndexOf("."));
      EfficiencyDocket =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + abolishedDiscover + "_output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }
    ParticipationSubmitted = "./out/production/c3063467A1/" + ParticipationSubmitted;

    try {
      String support = writeDatabase(ParticipationSubmitted, StandardCharsets.UTF_8);
      String knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(knowl);
      Matcher dos = p.matcher(support);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a2 = Pattern.compile(exp2);
      Matcher f3 = a2.matcher(support);

      while (dos.find()) {
        retailer.laidShipmentClip(Integer.parseInt(dos.group("DISP")));
      }

      while (f3.find()) {
        workLean.add(
            new Proceedings(
                f3.group("ID"),
                Integer.parseInt(f3.group("Arrive")),
                Integer.parseInt(f3.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception post) {
      System.out.println(post.toString());
    }
    retailer.orderedMechanisms(workLean);
    retailer.carryDevice();
  }

  private static String writeDatabase(String routes, Charset codification) throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(routes));
    return new String(decodes, codification);
  }
}
