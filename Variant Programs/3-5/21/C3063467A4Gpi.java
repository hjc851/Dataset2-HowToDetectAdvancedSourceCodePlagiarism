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
  private static List<Lessee> guests = new LinkedList<>();

  public static synchronized void main(String[] ing) {
    ApMoot favour;
    String information = "";

    if (ing.length > 0) {
      for (String fh : ing) {
        information = (fh);
      }

      try {
        information = ("./out/production/c3063467A2P2/" + information);
        information = (interpretLodge(information, StandardCharsets.UTF_8));
        String retailerLic = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern stowTap = Pattern.compile(retailerLic);
        Matcher bookstoreGobo = stowTap.matcher(information);

        while (bookstoreGobo.find()) {
          guests.add(
              new Lessee(
                  Integer.parseInt(bookstoreGobo.group("Arrive")),
                  bookstoreGobo.group("Customer"),
                  Integer.parseInt(bookstoreGobo.group("Eat"))));
        }
      } catch (IOException adrian) {
        System.out.println("");
      }
    }

    favour = (new ApMoot(guests));
    favour.commence();
  }

  private static synchronized String interpretLodge(String footpath, Charset decoding)
      throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(footpath));
    return new String(keyed, decoding);
  }
}
