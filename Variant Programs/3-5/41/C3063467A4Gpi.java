import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Gpi {
  private static final String synX912String = "";
  private static final String synX911String = "Eat";
  private static final String synX910String = "Customer";
  private static final String synX909String = "Arrive";
  private static final String synX908String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX907String = "./out/production/c3063467A2P2/";
  private static final int synX906int = 0;
  private static final String synX905String = "";

  static {
    buyers = new java.util.LinkedList<>();
  }

  public static synchronized void main(String[] param) {
    RibuloseTrainer pua;
    java.lang.String contributions;
    contributions = synX905String;

    if (param.length > synX906int) {
      for (java.lang.String waffen : param) {
        contributions = waffen;
      }

      try {
        java.lang.String stowExc;
        java.util.regex.Pattern storageGlib;
        java.util.regex.Matcher storageValidator;
        contributions = synX907String + contributions;
        contributions = recordExecutable(contributions, StandardCharsets.UTF_8);
        stowExc = synX908String;
        storageGlib = java.util.regex.Pattern.compile(stowExc);
        storageValidator = storageGlib.matcher(contributions);

        while (storageValidator.find()) {
          buyers.add(
              new Subscribers(
                  java.lang.Integer.parseInt(storageValidator.group(synX909String)),
                  storageValidator.group(synX910String),
                  java.lang.Integer.parseInt(storageValidator.group(synX911String))));
        }
      } catch (java.io.IOException voto) {
        System.out.println(synX912String);
      }
    }

    pua = new RibuloseTrainer(buyers);
    pua.take();
  }

  public static synchronized java.lang.String recordExecutable(
      java.lang.String footpath, java.nio.charset.Charset codec) throws IOException {
    byte[] concatenated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(concatenated, codec);
  }

  public static java.util.List<Subscribers> buyers;
}
