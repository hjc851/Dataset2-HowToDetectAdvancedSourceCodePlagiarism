package faker;

import limiter.Exporter;
import configuration.Methodology;
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

public class ProcedureSimulation {
  public static String OutputSubmitting = null;
  public LinkedList<Methodology> mechanismAgenda = null;
  public static BufferedWriter InputInitiate = null;

  public static synchronized String scanFolders(String road, Charset codified) throws IOException {
    byte[] decrypt = Files.readAllBytes(Paths.get(road));
    return new String(decrypt, codified);
  }

  public synchronized void melt(String advocates) {
    this.OutputSubmitting = advocates;
    distributors = new Exporter();
    mechanismAgenda = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String demotedCite;
      demotedCite = OutputSubmitting.substring(0, OutputSubmitting.lastIndexOf("."));
      InputInitiate =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + demotedCite + "_output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    OutputSubmitting = "./out/production/c3063467A1/" + OutputSubmitting;

    try {
      String involvement;
      String mgr;
      Pattern p;
      Matcher manuscript;
      String exp2;
      Pattern g;
      Matcher fig;
      involvement = scanFolders(OutputSubmitting, StandardCharsets.UTF_8);
      mgr = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(mgr);
      manuscript = p.matcher(involvement);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      g = Pattern.compile(exp2);
      fig = g.matcher(involvement);

      while (manuscript.find()) {
        distributors.putDespatchClock(Integer.parseInt(manuscript.group("DISP")));
      }

      while (fig.find()) {
        mechanismAgenda.add(
            new Methodology(
                fig.group("ID"),
                Integer.parseInt(fig.group("Arrive")),
                Integer.parseInt(fig.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception eden) {
      System.out.println(eden.toString());
    }
    distributors.primedAppendage(mechanismAgenda);
    distributors.meltResellers();
  }

  public Exporter distributors = null;
}
