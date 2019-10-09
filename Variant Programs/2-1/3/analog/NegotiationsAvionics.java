package analog;

import plenum.Originator;
import timer.Serve;
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

public class NegotiationsAvionics {
  private LinkedList<Serve> serveNames;
  private Originator forwarder;
  private static String AdviceDocumentation;
  public static BufferedWriter VolumeArchiving;

  public void move(String proponents) {
    this.AdviceDocumentation = proponents;
    forwarder = new Originator();
    serveNames = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String minimalMention =
          AdviceDocumentation.substring(0, AdviceDocumentation.lastIndexOf("."));
      VolumeArchiving =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    AdviceDocumentation = "./out/production/c3063467A1/" + AdviceDocumentation;

    try {
      String support = translateDocuments(AdviceDocumentation, StandardCharsets.UTF_8);
      String pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(pkg);
      Matcher dos = p.matcher(support);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern aj = Pattern.compile(exp2);
      Matcher fig = aj.matcher(support);

      while (dos.find()) {
        forwarder.primedExpeditionPeriod(Integer.parseInt(dos.group("DISP")));
      }

      while (fig.find()) {
        serveNames.add(
            new Serve(
                fig.group("ID"),
                Integer.parseInt(fig.group("Arrive")),
                Integer.parseInt(fig.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception past) {
      System.out.println(past.toString());
    }
    forwarder.laidOperation(serveNames);
    forwarder.passMailer();
  }

  private static String translateDocuments(String road, Charset codification) throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(road));
    return new String(coded, codification);
  }
}
