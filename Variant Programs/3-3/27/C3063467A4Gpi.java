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

  private static synchronized java.lang.String wrotePapers(
      java.lang.String roadway, java.nio.charset.Charset encrypt) throws IOException {
    byte[] captioned = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(captioned, encrypt);
  }

  public static synchronized void main(String[] specified) {
    EPrototype intelligent;
    java.lang.String involvement;
    intelligent = null;
    involvement = "";

    if (specified.length > 0) {
      for (java.lang.String ora : specified) {
        involvement = ora;
      }

      try {
        java.lang.String boughtenSkil;
        java.util.regex.Pattern storageGlib;
        java.util.regex.Matcher stowCollator;
        involvement = "./out/production/c3063467A2P2/" + involvement;
        involvement = wrotePapers(involvement, StandardCharsets.UTF_8);
        boughtenSkil = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        storageGlib = java.util.regex.Pattern.compile(boughtenSkil);
        stowCollator = storageGlib.matcher(involvement);

        while (stowCollator.find()) {
          patrons.add(
              new Subscribers(
                  java.lang.Integer.parseInt(stowCollator.group("Arrive")),
                  stowCollator.group("Customer"),
                  java.lang.Integer.parseInt(stowCollator.group("Eat"))));
        }
      } catch (java.io.IOException voto) {
        System.out.println("");
      }
    }

    intelligent = new EPrototype(patrons);
    intelligent.hold();
  }

  private static java.util.List<Subscribers> patrons = new java.util.LinkedList<>();
}
