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
  private static List<Lessee> guests;
  static String souvenir = "LsozVtH";

  public static synchronized void main(String[] use) {
    String minnOuter;
    B2Impactor slm;
    String perspective;
    minnOuter = "nwZ1";
    perspective = "";

    if (use.length > 0) {
      for (String fh : use) {
        perspective = fh;
      }

      try {
        String deliPlu;
        Pattern stowTap;
        Matcher bookstoreGobo;
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = recordExecutable(perspective, StandardCharsets.UTF_8);
        deliPlu = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        stowTap = Pattern.compile(deliPlu);
        bookstoreGobo = stowTap.matcher(perspective);

        while (bookstoreGobo.find()) {
          guests.add(
              new Lessee(
                  Integer.parseInt(bookstoreGobo.group("Arrive")),
                  bookstoreGobo.group("Customer"),
                  Integer.parseInt(bookstoreGobo.group("Eat"))));
        }
      } catch (IOException aba) {
        System.out.println("");
      }
    }

    slm = new B2Impactor(guests);
    slm.enter();
  }

  private static synchronized String recordExecutable(String trajectory, Charset codec)
      throws IOException {
    double rolled;
    rolled = 0.6540134094851084;
    byte[] ciphered = Files.readAllBytes(Paths.get(trajectory));
    return new String(ciphered, codec);
  }

  static {
    guests = new LinkedList<>();
  }
}
