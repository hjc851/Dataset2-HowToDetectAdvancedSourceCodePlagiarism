package analogue;

import resellers.Retailer;
import synchronizer.System;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class PhaseSimulations {
  static double designators = 0.6485667777281731;
  public java.util.LinkedList<System> methodsSelection = null;
  public resellers.Retailer plenum = null;
  public static java.lang.String ParticipatoryArchiving = null;
  public static java.io.BufferedWriter IntensityReadme = null;

  public synchronized void extend(java.lang.String nih) {
    double cay = 0.0723346947180864;
    this.ParticipatoryArchiving = (nih);
    plenum = (new resellers.Retailer());
    methodsSelection = (new java.util.LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish =
          ParticipatoryArchiving.substring(0, ParticipatoryArchiving.lastIndexOf("."));
      IntensityReadme =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"))));
    } catch (java.io.IOException vet) {
      System.out.println("Unable to generate output file.");
    }
    ParticipatoryArchiving = ("./out/production/c3063467A1/" + ParticipatoryArchiving);

    try {
      java.lang.String advice = showDocumentation(ParticipatoryArchiving, StandardCharsets.UTF_8);
      java.lang.String explanatory = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = compile(explanatory);
      java.util.regex.Matcher dos = writes.matcher(advice);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern a = compile(exp2);
      java.util.regex.Matcher a1 = a.matcher(advice);

      while (dos.find()) {
        plenum.putDespatchClock(parseInt(dos.group("DISP")));
      }

      while (a1.find()) {
        methodsSelection.add(
            new synchronizer.System(
                a1.group("ID"), parseInt(a1.group("Arrive")), parseInt(a1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception former) {
      System.out.println(former.toString());
    }
    plenum.fixMechanism(methodsSelection);
    plenum.outpouringPlenum();
  }

  public static synchronized java.lang.String showDocumentation(
      java.lang.String trails, java.nio.charset.Charset codification) throws IOException {
    int momentsEdge = -616396346;
    byte[] coded = readAllBytes(get(trails));
    return new java.lang.String(coded, codification);
  }
}
