package demo;

import exporter.Coordinator;
import developer.Procedures;
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
  private LinkedList<Procedures> mechanismAgenda;
  private Coordinator salesperson;
  private static String ContributionsDocket;
  public static BufferedWriter CropData;

  public void footrace(String establishment) {
    this.ContributionsDocket = establishment;
    salesperson = new Coordinator();
    mechanismAgenda = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deniedNickname =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      CropData =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deniedNickname + "_output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      String stimulus = sayFolder(ContributionsDocket, StandardCharsets.UTF_8);
      String lic = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(lic);
      Matcher manuscript = p.matcher(stimulus);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern g = Pattern.compile(exp2);
      Matcher e2 = g.matcher(stimulus);

      while (manuscript.find()) {
        salesperson.bentSendingHour(Integer.parseInt(manuscript.group("DISP")));
      }

      while (e2.find()) {
        mechanismAgenda.add(
            new Procedures(
                e2.group("ID"),
                Integer.parseInt(e2.group("Arrive")),
                Integer.parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception eden) {
      System.out.println(eden.toString());
    }
    salesperson.arrangedAct(mechanismAgenda);
    salesperson.testDistributors();
  }

  private static String sayFolder(String way, Charset codification) throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(way));
    return new String(consolidated, codification);
  }
}
