package manikin;

import forwarder.Caller;
import writer.March;
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

public class OperationSimulated {
  private static final String synX1741String = "678vZo";
  private static final String synX1740String = "Finished reading input file...";
  private static final String synX1739String = "SIZE";
  private static final String synX1738String = "Arrive";
  private static final String synX1737String = "ID";
  private static final String synX1736String = "DISP";
  private static final String synX1735String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1734String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1733String = "./out/production/c3063467A1/";
  private static final String synX1732String = "Unable to generate output file.";
  private static final String synX1731String = "_output.txt";
  private static final String synX1730String = "./out/production/c3063467A1/";
  private static final String synX1729String = ".";
  private static final int synX1728int = 0;
  private static final String synX1727String = "Reading in input file...";
  private static final int synX1726int = -1139674117;
  public static final String circumscribe = "z9cQJqWT4KUPkGt";
  public java.util.LinkedList<March> proceedingsPlaylist;
  public forwarder.Caller caller;
  public static java.lang.String InvolvementData;
  public static java.io.BufferedWriter IntensityReadme;

  public synchronized void endure(java.lang.String tenants) {
    int chthonicBound = synX1726int;
    this.InvolvementData = (tenants);
    caller = (new forwarder.Caller());
    proceedingsPlaylist = (new java.util.LinkedList<>());
    System.out.println(synX1727String);

    try {
      java.lang.String withdrawnMake =
          InvolvementData.substring(synX1728int, InvolvementData.lastIndexOf(synX1729String));
      IntensityReadme =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX1730String + withdrawnMake + synX1731String))));
    } catch (java.io.IOException libris) {
      System.out.println(synX1732String);
    }
    InvolvementData = (synX1733String + InvolvementData);

    try {
      java.lang.String response = studyPaperwork(InvolvementData, StandardCharsets.UTF_8);
      java.lang.String mgr = synX1734String;
      java.util.regex.Pattern postscript = compile(mgr);
      java.util.regex.Matcher esi = postscript.matcher(response);
      java.lang.String exp2 = synX1735String;
      java.util.regex.Pattern h = compile(exp2);
      java.util.regex.Matcher e = h.matcher(response);

      while (esi.find()) {
        caller.orderedDeployChance(parseInt(esi.group(synX1736String)));
      }

      while (e.find()) {
        proceedingsPlaylist.add(
            new writer.March(
                e.group(synX1737String),
                parseInt(e.group(synX1738String)),
                parseInt(e.group(synX1739String))));
      }
      System.out.println(synX1740String);
    } catch (java.lang.Exception abe) {
      System.out.println(abe.toString());
    }
    caller.situatedMethodology(proceedingsPlaylist);
    caller.courseResponsible();
  }

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String track, java.nio.charset.Charset cipher) throws IOException {
    String apexRestrictions = synX1741String;
    byte[] ciphered = readAllBytes(get(track));
    return new java.lang.String(ciphered, cipher);
  }
}
