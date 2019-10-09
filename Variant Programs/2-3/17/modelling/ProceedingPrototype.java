package modelling;

import dealer.Sender;
import server.Sue;
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
  public static String OpinionsDocuments;
  public Sender caller;

  public synchronized void extend(String nih) {
    this.OpinionsDocuments = nih;
    caller = new Sender();
    workLean = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String revokedAdvert;
      revokedAdvert = OpinionsDocuments.substring(0, OpinionsDocuments.lastIndexOf("."));
      VolumeArchiving =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + revokedAdvert + "_output.txt"));
    } catch (IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    OpinionsDocuments = "./out/production/c3063467A1/" + OpinionsDocuments;

    try {
      String guidance;
      String yrs;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern p3;
      Matcher a2;
      guidance = readableArchiving(OpinionsDocuments, StandardCharsets.UTF_8);
      yrs = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(yrs);
      esi = p.matcher(guidance);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p3 = Pattern.compile(exp2);
      a2 = p3.matcher(guidance);

      while (esi.find()) {
        caller.fixedDeployingOpportunity(Integer.parseInt(esi.group("DISP")));
      }

      while (a2.find()) {
        workLean.add(
            new Sue(
                a2.group("ID"),
                Integer.parseInt(a2.group("Arrive")),
                Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception past) {
      System.out.println(past.toString());
    }
    caller.doTechniques(workLean);
    caller.carryDevice();
  }

  public static BufferedWriter VolumeArchiving;

  public static synchronized String readableArchiving(String trails, Charset metadata)
      throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(trails));
    return new String(instantiated, metadata);
  }

  public LinkedList<Sue> workLean;
}
