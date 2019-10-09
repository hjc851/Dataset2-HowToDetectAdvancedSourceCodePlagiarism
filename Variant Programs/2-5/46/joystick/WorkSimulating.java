package joystick;

import yardmaster.Reseller;
import writer.Sue;
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

public class WorkSimulating {
  public static java.io.BufferedWriter IntensityReadme = null;
  public static java.lang.String InformationComplaint = null;
  public yardmaster.Reseller device = null;
  public java.util.LinkedList<Sue> mechanismsBibliography = null;

  public synchronized void melt(java.lang.String elected) {
    this.InformationComplaint = elected;
    device = new yardmaster.Reseller();
    mechanismsBibliography = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String minimalMention;
      minimalMention = InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      IntensityReadme =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (java.io.IOException voto) {
      out.println("Unable to generate output file.");
    }
    InformationComplaint = "./out/production/c3063467A1/" + InformationComplaint;

    try {
      java.lang.String response;
      java.lang.String yrs;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern e;
      java.util.regex.Matcher b;
      response = wrotePapers(InformationComplaint, UTF_8);
      yrs = "DISP:[\\s]+(?<DISP>[\\d]+)";
      postscript = compile(yrs);
      manuscript = postscript.matcher(response);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      e = compile(exp2);
      b = e.matcher(response);

      while (manuscript.find()) {
        device.readyRemoveDay(parseInt(manuscript.group("DISP")));
      }

      while (b.find()) {
        mechanismsBibliography.add(
            new writer.Sue(b.group("ID"), parseInt(b.group("Arrive")), parseInt(b.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception abel) {
      out.println(abel.toString());
    }
    device.determinedOutgrowth(mechanismsBibliography);
    device.driveYardmaster();
  }

  public static synchronized java.lang.String wrotePapers(
      java.lang.String road, java.nio.charset.Charset coded) throws IOException {
    byte[] ciphered = readAllBytes(get(road));
    return new java.lang.String(ciphered, coded);
  }
}
