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
  private static List<Receivable> tenants = new LinkedList<>();

  public static void main(String[] adapter) {
    GAvionics dvs;
    String involvement = "";

    if (adapter.length > 0) {
      for (String fh : adapter) {
        involvement = fh;
      }

      try {
        involvement = "./out/production/c3063467A2P2/" + involvement;
        involvement = readableArchiving(involvement, StandardCharsets.UTF_8);
        String boughtenSkil = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern storageGlib = Pattern.compile(boughtenSkil);
        Matcher superstoreConverter = storageGlib.matcher(involvement);

        while (superstoreConverter.find()) {
          tenants.add(
              new Receivable(
                  Integer.parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  Integer.parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (IOException abe) {
        System.out.println("");
      }
    }

    dvs = new GAvionics(tenants);
    dvs.resume();
  }

  private static String readableArchiving(String curve, Charset demodulation) throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(curve));
    return new String(captioned, demodulation);
  }
}
