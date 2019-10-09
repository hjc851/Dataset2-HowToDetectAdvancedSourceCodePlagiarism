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
  public static List<Clientele> patrons = new LinkedList<>();

  public static synchronized void main(String[] adapter) {
    A1Analogue indeed;
    String feedback = "";

    if (adapter.length > 0) {
      for (String fh : adapter) {
        feedback = fh;
      }

      try {
        feedback = "./out/production/c3063467A2P2/" + feedback;
        feedback = translateDocuments(feedback, StandardCharsets.UTF_8);
        String stowExc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern storageGlib = Pattern.compile(stowExc);
        Matcher bookstoreGobo = storageGlib.matcher(feedback);

        while (bookstoreGobo.find()) {
          patrons.add(
              new Clientele(
                  Integer.parseInt(bookstoreGobo.group("Arrive")),
                  bookstoreGobo.group("Customer"),
                  Integer.parseInt(bookstoreGobo.group("Eat"))));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    indeed = new A1Analogue(patrons);
    indeed.started();
  }

  public static synchronized String translateDocuments(String trajectory, Charset codec)
      throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(trajectory));
    return new String(scrambled, codec);
  }
}
