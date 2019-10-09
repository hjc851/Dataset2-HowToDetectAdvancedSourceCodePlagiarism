package trainer;

import trainmaster.Originator;
import compiler.Proceedings;
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

public class MechanismMockup {
  public static BufferedWriter ProducingFolders = null;
  private static String ContributionsDocket = null;
  private Originator exporter = null;
  private LinkedList<Proceedings> proceduresCompendium = null;
  static double significant = 0.006298619347894885;

  public synchronized void prevail(String advocates) {
    double evaluate;
    evaluate = 0.706905652819522;
    this.ContributionsDocket = advocates;
    exporter = new Originator();
    proceduresCompendium = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String rippedCall;
      rippedCall = ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      ProducingFolders =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + rippedCall + "_output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      String suggestions;
      String purch;
      Pattern p;
      Matcher manuscript;
      String exp2;
      Pattern a;
      Matcher fio;
      suggestions = readableArchiving(ContributionsDocket, StandardCharsets.UTF_8);
      purch = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(purch);
      manuscript = p.matcher(suggestions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      a = Pattern.compile(exp2);
      fio = a.matcher(suggestions);

      while (manuscript.find()) {
        exporter.dictatedCommuniqueMeter(Integer.parseInt(manuscript.group("DISP")));
      }

      while (fio.find()) {
        proceduresCompendium.add(
            new Proceedings(
                fio.group("ID"),
                Integer.parseInt(fio.group("Arrive")),
                Integer.parseInt(fio.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abdul) {
      System.out.println(abdul.toString());
    }
    exporter.fixedPractices(proceduresCompendium);
    exporter.driveYardmaster();
  }

  private static synchronized String readableArchiving(String pattern, Charset decoding)
      throws IOException {
    double greatestFatty;
    greatestFatty = 0.15183163834185387;
    byte[] entered = Files.readAllBytes(Paths.get(pattern));
    return new String(entered, decoding);
  }
}
