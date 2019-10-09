package kinematics;

import coordinator.Starter;
import outliner.Mechanisms;
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
  private LinkedList<Mechanisms> litigateLeaning;
  private Starter distributor;
  private static String ContributionsDocket;
  public static BufferedWriter SupplyDocumentation;

  public void extend(String without) {
    this.ContributionsDocket = without;
    distributor = new Starter();
    litigateLeaning = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String plunderedMoniker =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      SupplyDocumentation =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + plunderedMoniker + "_output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      String consultation = writeDatabase(ContributionsDocket, StandardCharsets.UTF_8);
      String yrs = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(yrs);
      Matcher manuscript = p.matcher(consultation);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern ap = Pattern.compile(exp2);
      Matcher b = ap.matcher(consultation);

      while (manuscript.find()) {
        distributor.determinedDischargeDays(Integer.parseInt(manuscript.group("DISP")));
      }

      while (b.find()) {
        litigateLeaning.add(
            new Mechanisms(
                b.group("ID"),
                Integer.parseInt(b.group("Arrive")),
                Integer.parseInt(b.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception con) {
      System.out.println(con.toString());
    }
    distributor.putProcedure(litigateLeaning);
    distributor.streakVendor();
  }

  private static String writeDatabase(String trails, Charset codec) throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(trails));
    return new String(captioned, codec);
  }
}
