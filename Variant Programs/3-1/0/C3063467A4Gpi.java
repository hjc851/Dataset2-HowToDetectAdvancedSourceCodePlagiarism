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
  private static List<Lessee> subscribers = new LinkedList<>();

  public static void main(String[] event) {
    C2Sim smart;
    String output = "";

    if (event.length > 0) {
      for (String fh : event) {
        output = fh;
      }

      try {
        output = "./out/production/c3063467A2P2/" + output;
        output = readableArchiving(output, StandardCharsets.UTF_8);
        String warehousingReq = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern storageGlib = Pattern.compile(warehousingReq);
        Matcher storageValidator = storageGlib.matcher(output);

        while (storageValidator.find()) {
          subscribers.add(
              new Lessee(
                  Integer.parseInt(storageValidator.group("Arrive")),
                  storageValidator.group("Customer"),
                  Integer.parseInt(storageValidator.group("Eat"))));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    smart = new C2Sim(subscribers);
    smart.commencing();
  }

  private static String readableArchiving(String pattern, Charset codec) throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(pattern));
    return new String(entered, codec);
  }
}
