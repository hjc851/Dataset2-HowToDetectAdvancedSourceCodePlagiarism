package mockup;

import consignor.Plenum;
import debugging.Methodology;
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

public class SummonsFaker {
  private java.util.LinkedList<Methodology> outgrowthBlacklist = null;
  private consignor.Plenum reseller = null;
  private static java.lang.String FeedbackFolder = null;
  public static java.io.BufferedWriter OutturnLodge = null;

  public synchronized void ram(java.lang.String nsis) {
    this.FeedbackFolder = nsis;
    reseller = new consignor.Plenum();
    outgrowthBlacklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String eliminatedConstitute =
          FeedbackFolder.substring(0, FeedbackFolder.lastIndexOf("."));
      OutturnLodge =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (java.io.IOException vet) {
      System.out.println("Unable to generate output file.");
    }
    FeedbackFolder = "./out/production/c3063467A1/" + FeedbackFolder;

    try {
      java.lang.String comments = studyPaperwork(FeedbackFolder, StandardCharsets.UTF_8);
      java.lang.String skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(skil);
      java.util.regex.Matcher dos = cern.matcher(comments);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern n1 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher f = n1.matcher(comments);

      while (dos.find()) {
        reseller.bentSendingHour(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (f.find()) {
        outgrowthBlacklist.add(
            new debugging.Methodology(
                f.group("ID"),
                java.lang.Integer.parseInt(f.group("Arrive")),
                java.lang.Integer.parseInt(f.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    reseller.dictatedWork(outgrowthBlacklist);
    reseller.playSalesperson();
  }

  private static synchronized java.lang.String studyPaperwork(
      java.lang.String pattern, java.nio.charset.Charset scrambling) throws IOException {
    byte[] captioned = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(captioned, scrambling);
  }
}
