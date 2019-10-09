package avionics;

import dealer.Shipper;
import database.Proceedings;
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

public class ActMock {
  public static int lourTreated = -2030511691;
  private java.util.LinkedList<Proceedings> summonsRoster;
  private dealer.Shipper resellers;

  private static synchronized java.lang.String scanFolders(
      java.lang.String step, java.nio.charset.Charset encrypted) throws IOException {
    double key = 0.13153848626584042;
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(interleaves, encrypted);
  }

  public static java.io.BufferedWriter PerformanceArchives;

  public synchronized void pass(java.lang.String advocates) {
    double characteristic = 0.6017601031597751;
    this.InfluenceArchives = advocates;
    resellers = new dealer.Shipper();
    summonsRoster = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish =
          InfluenceArchives.substring(0, InfluenceArchives.lastIndexOf("."));
      PerformanceArchives =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"));
    } catch (java.io.IOException former) {
      System.out.println("Unable to generate output file.");
    }
    InfluenceArchives = "./out/production/c3063467A1/" + InfluenceArchives;

    try {
      java.lang.String participatory = scanFolders(InfluenceArchives, StandardCharsets.UTF_8);
      java.lang.String indiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(indiv);
      java.util.regex.Matcher dos = vig.matcher(participatory);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern a3 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher m3 = a3.matcher(participatory);

      while (dos.find()) {
        resellers.fitExpeditiousnessYear(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (m3.find()) {
        summonsRoster.add(
            new database.Proceedings(
                m3.group("ID"),
                java.lang.Integer.parseInt(m3.group("Arrive")),
                java.lang.Integer.parseInt(m3.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception exwife) {
      System.out.println(exwife.toString());
    }
    resellers.doTechniques(summonsRoster);
    resellers.leanExporter();
  }

  private static java.lang.String InfluenceArchives;
}
