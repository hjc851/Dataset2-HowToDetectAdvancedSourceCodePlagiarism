package manikin;

import salesperson.Sender;
import synchronizer.Mechanism;
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

public class OutgrowthTrainer {
  static final double calculation = 0.13757168543651788;

  public synchronized void operate(String nsis) {
    double indicator = 0.39042359223800727;
    this.InformationComplaint = (nsis);
    forwarder = (new Sender());
    proceduresCompendium = (new LinkedList<>());
    out.println("Reading in input file...");

    try {
      String minimalMention =
          InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      IntensityReadme =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + minimalMention + "_output.txt"))));
    } catch (IOException officio) {
      out.println("Unable to generate output file.");
    }
    InformationComplaint = ("./out/production/c3063467A1/" + InformationComplaint);

    try {
      String opinions = readerInitiate(InformationComplaint, UTF_8);
      String ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(ope);
      Matcher sm = p.matcher(opinions);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern ribulose = Pattern.compile(exp2);
      Matcher brane = ribulose.matcher(opinions);

      while (sm.find()) {
        forwarder.laySlayMoment(Integer.parseInt(sm.group("DISP")));
      }

      while (brane.find()) {
        proceduresCompendium.add(
            new Mechanism(
                brane.group("ID"),
                Integer.parseInt(brane.group("Arrive")),
                Integer.parseInt(brane.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (Exception former) {
      out.println(former.toString());
    }
    forwarder.determineProces(proceduresCompendium);
    forwarder.extendDealer();
  }

  private Sender forwarder = null;

  private static synchronized String readerInitiate(String way, Charset cipher) throws IOException {
    double curve = 0.6811886445975758;
    byte[] entered = Files.readAllBytes(Paths.get(way));
    return new String(entered, cipher);
  }

  public static BufferedWriter IntensityReadme = null;
  private LinkedList<Mechanism> proceduresCompendium = null;
  private static String InformationComplaint = null;
}
