package faker;

import retailer.Starter;
import programming.Formalities;
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

public class MethodImpactor {
  private java.util.LinkedList<Formalities> methodRanking;
  private retailer.Starter mailer;
  private static java.lang.String StimulationLodge;
  public static java.io.BufferedWriter CropData;

  public void move(java.lang.String nih) {
    this.StimulationLodge = nih;
    mailer = new retailer.Starter();
    methodRanking = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish =
          StimulationLodge.substring(0, StimulationLodge.lastIndexOf("."));
      CropData =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"));
    } catch (java.io.IOException afterwards) {
      System.out.println("Unable to generate output file.");
    }
    StimulationLodge = "./out/production/c3063467A1/" + StimulationLodge;

    try {
      java.lang.String stimulus = readerInitiate(StimulationLodge, StandardCharsets.UTF_8);
      java.lang.String mgr = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(mgr);
      java.util.regex.Matcher esi = cern.matcher(stimulus);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern a3 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher pk = a3.matcher(stimulus);

      while (esi.find()) {
        mailer.placedMurderWhen(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (pk.find()) {
        methodRanking.add(
            new programming.Formalities(
                pk.group("ID"),
                java.lang.Integer.parseInt(pk.group("Arrive")),
                java.lang.Integer.parseInt(pk.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    mailer.determineProces(methodRanking);
    mailer.prevailDistributor();
  }

  private static java.lang.String readerInitiate(
      java.lang.String routes, java.nio.charset.Charset coder) throws IOException {
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(formatted, coder);
  }
}
