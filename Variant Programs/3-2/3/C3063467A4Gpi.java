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
  private static java.util.List<User> services = new java.util.LinkedList<>();

  public static void main(String[] arguments) {
    KRobot ims;
    java.lang.String stimulation = "";

    if (arguments.length > 0) {
      for (java.lang.String fh : arguments) {
        stimulation = fh;
      }

      try {
        stimulation = "./out/production/c3063467A2P2/" + stimulation;
        stimulation = scanFolders(stimulation, StandardCharsets.UTF_8);
        java.lang.String bookstoreCust =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storageGlib = java.util.regex.Pattern.compile(bookstoreCust);
        java.util.regex.Matcher deliColorimetry = storageGlib.matcher(stimulation);

        while (deliColorimetry.find()) {
          services.add(
              new User(
                  java.lang.Integer.parseInt(deliColorimetry.group("Arrive")),
                  deliColorimetry.group("Customer"),
                  java.lang.Integer.parseInt(deliColorimetry.group("Eat"))));
        }
      } catch (java.io.IOException eden) {
        System.out.println("");
      }
    }

    ims = new KRobot(services);
    ims.initiate();
  }

  private static java.lang.String scanFolders(
      java.lang.String routes, java.nio.charset.Charset scrambling) throws IOException {
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(stored, scrambling);
  }
}
