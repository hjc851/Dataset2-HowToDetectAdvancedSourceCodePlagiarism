package kinematics;

import limiter.Forwarder;
import callback.Treat;
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

public class ProceedingPrototype {
  private LinkedList<Treat> procedureNumber;
  private Forwarder distributors;
  private static String SubmissionsDocument;
  public static BufferedWriter ManufacturingComplaint;

  public void endure(String advocates) {
    this.SubmissionsDocument = advocates;
    distributors = new Forwarder();
    procedureNumber = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String undoneForename =
          SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf("."));
      ManufacturingComplaint =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + undoneForename + "_output.txt"));
    } catch (IOException aba) {
      System.out.println("Unable to generate output file.");
    }
    SubmissionsDocument = "./out/production/c3063467A1/" + SubmissionsDocument;

    try {
      String stimulant = aloudApplication(SubmissionsDocument, StandardCharsets.UTF_8);
      String lic = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(lic);
      Matcher manuscript = p.matcher(stimulant);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern e = Pattern.compile(exp2);
      Matcher fig = e.matcher(stimulant);

      while (manuscript.find()) {
        distributors.prepareSendNow(Integer.parseInt(manuscript.group("DISP")));
      }

      while (fig.find()) {
        procedureNumber.add(
            new Treat(
                fig.group("ID"),
                Integer.parseInt(fig.group("Arrive")),
                Integer.parseInt(fig.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception post) {
      System.out.println(post.toString());
    }
    distributors.prepareMethodologies(procedureNumber);
    distributors.leanExporter();
  }

  private static String aloudApplication(String trail, Charset coder) throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(trail));
    return new String(keyed, coder);
  }
}
