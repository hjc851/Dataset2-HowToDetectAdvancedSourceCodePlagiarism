package mock;

import salesperson.Caller;
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

public class TreatModelling {
  private LinkedList<Proceeding> procedureNumber;
  private Caller device;
  private static String OpinionsDocuments;
  public static BufferedWriter GdpDatabase;

  public void move(String incumbents) {
    this.OpinionsDocuments = incumbents;
    device = new Caller();
    procedureNumber = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deprivedAppoint = OpinionsDocuments.substring(0, OpinionsDocuments.lastIndexOf("."));
      GdpDatabase =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deprivedAppoint + "_output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }
    OpinionsDocuments = "./out/production/c3063467A1/" + OpinionsDocuments;

    try {
      String stimulant = translateDocuments(OpinionsDocuments, StandardCharsets.UTF_8);
      String supp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(supp);
      Matcher sm = p.matcher(stimulant);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern n1 = Pattern.compile(exp2);
      Matcher pk = n1.matcher(stimulant);

      while (sm.find()) {
        device.placeRoutingWeek(Integer.parseInt(sm.group("DISP")));
      }

      while (pk.find()) {
        procedureNumber.add(
            new Proceeding(
                pk.group("ID"),
                Integer.parseInt(pk.group("Arrive")),
                Integer.parseInt(pk.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception aba) {
      System.out.println(aba.toString());
    }
    device.readyMarch(procedureNumber);
    device.scarperCaller();
  }

  private static String translateDocuments(String trajectory, Charset encrypting)
      throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(trajectory));
    return new String(keyed, encrypting);
  }
}
