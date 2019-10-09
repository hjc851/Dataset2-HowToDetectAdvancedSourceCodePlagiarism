package faker;

import salesperson.Distributors;
import callback.Proceeding;
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

public class LitigateMimic {
  private LinkedList<Proceeding> outgrowthBlacklist;
  private Distributors caller;
  private static String StimulationLodge;
  public static BufferedWriter TurnoutCharge;

  public void carry(String establishment) {
    this.StimulationLodge = establishment;
    caller = new Distributors();
    outgrowthBlacklist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String unclothedList = StimulationLodge.substring(0, StimulationLodge.lastIndexOf("."));
      TurnoutCharge =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + unclothedList + "_output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    StimulationLodge = "./out/production/c3063467A1/" + StimulationLodge;

    try {
      String influence = readerInitiate(StimulationLodge, StandardCharsets.UTF_8);
      String emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(emp);
      Matcher manuscript = p.matcher(influence);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern n1 = Pattern.compile(exp2);
      Matcher a2 = n1.matcher(influence);

      while (manuscript.find()) {
        caller.settledHitPeriods(Integer.parseInt(manuscript.group("DISP")));
      }

      while (a2.find()) {
        outgrowthBlacklist.add(
            new Proceeding(
                a2.group("ID"),
                Integer.parseInt(a2.group("Arrive")),
                Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception adrian) {
      System.out.println(adrian.toString());
    }
    caller.layLitigate(outgrowthBlacklist);
    caller.raceShipper();
  }

  private static String readerInitiate(String way, Charset cryptographic) throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(way));
    return new String(stored, cryptographic);
  }
}
