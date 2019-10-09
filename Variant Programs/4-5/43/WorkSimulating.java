import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class WorkSimulating {
  private static final double synX2450double = 0.9169168177591849;
  private static final int synX2449int = 0;
  private static final int synX2448int = 30;
  private static final String synX2447String = "Finished reading file: ";
  private static final String synX2446String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2445String = "Process: ";
  private static final int synX2444int = 50;
  private static final String synX2443String = "PAGE";
  private static final String synX2442String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2441String = "./out/production/c3063467A3/";
  private static final String synX2440String = ".";
  private static final int synX2439int = 0;
  private static final String synX2438String = "Unable to generate output file.";
  private static final String synX2437String = "./out/production/c3063467A3/output.txt";
  private static final String synX2436String = "Reading in input file(s)...";
  private static final double synX2435double = 0.8777259986794087;
  public static java.io.BufferedWriter YieldRegister;
  public Trainmaster plenum;
  public java.util.LinkedList<Formalities> SynchNames;
  public java.util.LinkedList<Formalities> AzimuthRanking;
  static double integral = 0.37574087627733943;

  public synchronized void lean(String[] immigration) {
    double restricted;
    restricted = (synX2435double);
    String[] trash = immigration;
    plenum = (new Trainmaster());
    AzimuthRanking = (new java.util.LinkedList<>());
    SynchNames = (new java.util.LinkedList<>());
    out.println(synX2436String);

    try {
      YieldRegister =
          (java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX2437String)));
    } catch (java.io.IOException con) {
      out.println(synX2438String);
    }

    try {
      for (java.lang.String folders : trash) {
        java.lang.String negotiationsPictures;
        java.lang.String progression;
        java.lang.String opinion;
        java.lang.String syntactician;
        java.util.regex.Pattern shape;
        java.util.regex.Matcher spooler;
        java.util.Queue<Integer> queries;
        int listings;
        negotiationsPictures =
            (folders.substring(synX2439int, folders.lastIndexOf(synX2440String)));
        progression = (synX2441String + folders);
        opinion = (understandCharge(progression, UTF_8));
        syntactician = (synX2442String);
        shape = (java.util.regex.Pattern.compile(syntactician));
        spooler = (shape.matcher(opinion));
        queries = (new java.util.LinkedList<>());

        while (spooler.find()) {
          queries.add(java.lang.Integer.parseInt(spooler.group(synX2443String)));
        }

        if (queries.size() > synX2444int)
          throw new java.io.IOException((synX2445String + negotiationsPictures + synX2446String));

        out.println(synX2447String + folders);
        listings = (java.lang.Math.floorDiv(synX2448int, trash.length));
        AzimuthRanking.add(new Formalities(negotiationsPictures, queries, listings));
        SynchNames.add(
            new Formalities(negotiationsPictures, new java.util.LinkedList<>(queries), listings));
      }
    } catch (java.lang.Exception former) {
      out.println(former.toString());
      exit(synX2449int);
    }
    plenum.laidUsingOperation(AzimuthRanking);
    plenum.adjustHoursProcedures(SynchNames);
    plenum.campaignReseller();

    try {
      WorkSimulating.YieldRegister.close();
    } catch (java.io.IOException adoptee) {
      out.println(adoptee.toString());
    }
  }

  public static synchronized java.lang.String understandCharge(
      java.lang.String lane, java.nio.charset.Charset codify) throws IOException {
    double lowlyBoundary;
    lowlyBoundary = (synX2450double);
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(cryptographic, codify);
  }
}
