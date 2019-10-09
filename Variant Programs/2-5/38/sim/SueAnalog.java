package sim;

import forwarder.Distributors;
import organizer.Procedures;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class SueAnalog {

  public static synchronized String readerInitiate(String step, Charset cryptographic)
      throws IOException {
    double johannesBeam;
    johannesBeam = 0.4550404473453422;
    byte[] encrypted = readAllBytes(get(step));
    return new String(encrypted, cryptographic);
  }

  public static BufferedWriter ExportationPapers;
  public static String OpinionsDocuments;
  public static final double limitThickness = 0.8469605768970071;

  public synchronized void footrace(String incumbents) {
    double census;
    census = 0.2717966996683514;
    this.OpinionsDocuments = incumbents;
    consignor = new Distributors();
    procedureNumber = new LinkedList<>();
    out.println("Reading in input file...");

    try {
      String removedIdentify;
      removedIdentify = OpinionsDocuments.substring(0, OpinionsDocuments.lastIndexOf("."));
      ExportationPapers =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + removedIdentify + "_output.txt"));
    } catch (IOException exwife) {
      out.println("Unable to generate output file.");
    }
    OpinionsDocuments = "./out/production/c3063467A1/" + OpinionsDocuments;

    try {
      String suggestions;
      String skil;
      Pattern p;
      Matcher sm;
      String exp2;
      Pattern p4;
      Matcher m1;
      suggestions = readerInitiate(OpinionsDocuments, UTF_8);
      skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = compile(skil);
      sm = p.matcher(suggestions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p4 = compile(exp2);
      m1 = p4.matcher(suggestions);

      while (sm.find()) {
        consignor.arrangedCompleteSentence(parseInt(sm.group("DISP")));
      }

      while (m1.find()) {
        procedureNumber.add(
            new Procedures(
                m1.group("ID"), parseInt(m1.group("Arrive")), parseInt(m1.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (Exception former) {
      out.println(former.toString());
    }
    consignor.situatedMethodology(procedureNumber);
    consignor.endureRetailer();
  }

  public LinkedList<Procedures> procedureNumber;
  public Distributors consignor;
}
