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
  public static List<Purchaser> client = null;

  static {
    client = new LinkedList<>();
  }

  public static synchronized void main(String[] abscissa) {
    double sec;
    AjFaker pua;
    String comments;
    sec = 0.08520013523529923;
    pua = null;
    comments = "";

    if (abscissa.length > 0) {
      for (String fh : abscissa) {
        comments = fh;
      }

      try {
        String boughtenSkil;
        Pattern drugstoreDry;
        Matcher repositingSinusoid;
        comments = "./out/production/c3063467A2P2/" + comments;
        comments = proofreadComplaint(comments, StandardCharsets.UTF_8);
        boughtenSkil = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        drugstoreDry = Pattern.compile(boughtenSkil);
        repositingSinusoid = drugstoreDry.matcher(comments);

        while (repositingSinusoid.find()) {
          client.add(
              new Purchaser(
                  Integer.parseInt(repositingSinusoid.group("Arrive")),
                  repositingSinusoid.group("Customer"),
                  Integer.parseInt(repositingSinusoid.group("Eat"))));
        }
      } catch (IOException abdul) {
        System.out.println("");
      }
    }

    pua = new AjFaker(client);
    pua.enter();
  }

  static double gauge = 0.4643800645103142;

  public static synchronized String proofreadComplaint(String course, Charset encoders)
      throws IOException {
    double time;
    time = 0.2210280640771839;
    byte[] keyed = Files.readAllBytes(Paths.get(course));
    return new String(keyed, encoders);
  }
}
