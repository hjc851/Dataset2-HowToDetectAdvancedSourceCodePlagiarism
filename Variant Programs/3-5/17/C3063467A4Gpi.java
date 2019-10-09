import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  private static final double synX314double = 0.6692195477129715;
  private static final String synX313String = "";
  private static final String synX312String = "Eat";
  private static final String synX311String = "Customer";
  private static final String synX310String = "Arrive";
  private static final String synX309String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX308String = "./out/production/c3063467A2P2/";
  private static final int synX307int = 0;
  private static final String synX306String = "";
  private static final String synX305String = "ZeRna6DcQd";
  private static java.util.List<Tenant> buyers = new java.util.LinkedList<>();
  public static final String call = "xr";

  public static synchronized void main(String[] using) {
    String discover;
    BlSimulations intelligent;
    java.lang.String support;
    discover = (synX305String);
    intelligent = (null);
    support = (synX306String);

    if (using.length > synX307int) {
      for (java.lang.String waffen : using) {
        support = (waffen);
      }

      try {
        java.lang.String mallMgr;
        java.util.regex.Pattern storageGlib;
        java.util.regex.Matcher memorySpecifier;
        support = (synX308String + support);
        support = (translateDocuments(support, UTF_8));
        mallMgr = (synX309String);
        storageGlib = (compile(mallMgr));
        memorySpecifier = (storageGlib.matcher(support));

        while (memorySpecifier.find()) {
          buyers.add(
              new Tenant(
                  parseInt(memorySpecifier.group(synX310String)),
                  memorySpecifier.group(synX311String),
                  parseInt(memorySpecifier.group(synX312String))));
        }
      } catch (java.io.IOException pro) {
        out.println(synX313String);
      }
    }

    intelligent = (new BlSimulations(buyers));
    intelligent.inaugurate();
  }

  private static synchronized java.lang.String translateDocuments(
      java.lang.String route, java.nio.charset.Charset coding) throws IOException {
    double minusExtent;
    minusExtent = (synX314double);
    byte[] synthesized = readAllBytes(get(route));
    return new java.lang.String(synthesized, coding);
  }
}
