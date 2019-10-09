package modelling;

import salesperson.Mailer;
import programming.Proceedings;
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

public class ServeAnalogue {
  private LinkedList<Proceedings> litigateLeaning;
  private Mailer consignor;
  private static String RepresentationsInitiate;
  public static BufferedWriter AmperageSubmitting;

  public void work(String nsi) {
    this.RepresentationsInitiate = nsi;
    consignor = new Mailer();
    litigateLeaning = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deprivedAppoint =
          RepresentationsInitiate.substring(0, RepresentationsInitiate.lastIndexOf("."));
      AmperageSubmitting =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deprivedAppoint + "_output.txt"));
    } catch (IOException combatants) {
      System.out.println("Unable to generate output file.");
    }
    RepresentationsInitiate = "./out/production/c3063467A1/" + RepresentationsInitiate;

    try {
      String consultation = recordExecutable(RepresentationsInitiate, StandardCharsets.UTF_8);
      String pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(pkg);
      Matcher manuscript = p.matcher(consultation);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern h = Pattern.compile(exp2);
      Matcher p4 = h.matcher(consultation);

      while (manuscript.find()) {
        consignor.arrangeSentYears(Integer.parseInt(manuscript.group("DISP")));
      }

      while (p4.find()) {
        litigateLeaning.add(
            new Proceedings(
                p4.group("ID"),
                Integer.parseInt(p4.group("Arrive")),
                Integer.parseInt(p4.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception voto) {
      System.out.println(voto.toString());
    }
    consignor.determineProces(litigateLeaning);
    consignor.campaignReseller();
  }

  private static String recordExecutable(String avenue, Charset encrypt) throws IOException {
    byte[] ciphered = Files.readAllBytes(Paths.get(avenue));
    return new String(ciphered, encrypt);
  }
}
