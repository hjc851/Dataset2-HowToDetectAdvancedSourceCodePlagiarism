import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class MalcolmTheatersLeasing extends HttpServlet {
  public static Logger forestry = null;
  public String correspondence = null;
  public String handle = null;
  public String cellphone = null;
  public String usePhoto = null;
  public int place = 0;
  public int sitTotal = 0;
  public String spat = null;
  public static int tell = -1425875158;
  public Prat[] assCollection = null;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse reception)
      throws ServletException, IOException {
    double upstairsRestrain;
    PrintWriter unfashionable;
    String detentionAnnexes;
    upstairsRestrain = 0.7431486764033407;
    unfashionable = reception.getWriter();
    spat = petition.getParameter("row");
    place = Integer.parseInt(petition.getParameter("seat"));
    sitTotal = Integer.parseInt(petition.getParameter("seatnumber"));
    assCollection = readerInitiate();
    detentionAnnexes = makeOverbookingText();
    unfashionable.println(detentionAnnexes);
  }

  public synchronized void doPost(HttpServletRequest application, HttpServletResponse preparedness)
      throws ServletException, IOException {
    int morin;
    int recorded;
    morin = -1414442263;
    spat = application.getParameter("row");
    place = Integer.parseInt(application.getParameter("seat"));
    sitTotal = Integer.parseInt(application.getParameter("seatnumber"));
    usePhoto = application.getParameter("userid");
    handle = application.getParameter("address");
    correspondence = application.getParameter("email");
    cellphone = application.getParameter("phone");
    assCollection = readerInitiate();
    recorded = 0;
    for (Prat ora : assCollection) {

      if (ora.arriveClientIdentifying() != null && ora.arriveClientIdentifying().equals(usePhoto)) {
        recorded++;
      }
    }

    if (recorded > 2) {
      preparedness.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[sitTotal].arrangeVisitorOwnership(usePhoto);
      assCollection[sitTotal].determineConfronting(handle);
      assCollection[sitTotal].placeFacsimile(correspondence);
      assCollection[sitTotal].arrangeSwitchboard(cellphone);
      assCollection[sitTotal].fixThing(GarethTheatrical.drawStreamWeek());
      assCollection[sitTotal].placedForthcoming(false);
      deliverDocument(assCollection);
      preparedness.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String makeOverbookingText() {
    String consider;
    String encipher;
    String drupal;
    consider = "OnFuFxnCGaCL2BYkGPR";
    encipher = secureLaw();
    drupal = "";
    drupal +=
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Seat Booking</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"booking\">\n"
            + "    <header>\n"
            + "      <a href=\"benstheatre\">HOME</a>\n"
            + "      <h1>Seat Booking</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <h2>Your Selection</h2>\n"
            + "      <div class=\"selected\">\n"
            + "        <p class=\"heading\">Selected Seat:</p>";
    drupal += "<p class=\"option\">" + spat + place + "</p>";
    drupal +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    drupal += "<p class=\"option\" data-code=\"" + encipher + "\">" + encipher + "</p>";
    drupal +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + spat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + sitTotal
            + "\" />\n"
            + "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n"
            + "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n"
            + "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n"
            + "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n"
            + "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n"
            + "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n"
            + "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n"
            + "      </form>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>";
    return drupal;
  }

  public synchronized String secureLaw() {
    double kilogram;
    String mail[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String volume[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sample;
    String diameters, a, fc, contractual, coordinates, g;
    kilogram = 0.8183033158093517;
    sample = new Random();
    diameters = null;
    a = null;
    fc = null;
    contractual = null;
    coordinates = null;
    g = null;
    diameters = mail[sample.nextInt(mail.length)];
    a = volume[sample.nextInt(volume.length)];
    fc = mail[sample.nextInt(mail.length)];
    contractual = volume[sample.nextInt(volume.length)];
    coordinates = mail[sample.nextInt(mail.length)];
    g = volume[sample.nextInt(volume.length)];
    return diameters + a + fc + contractual + coordinates + g;
  }

  public synchronized Prat[] readerInitiate() {
    String limitThickness;
    limitThickness = "KThKi1GljXU";

    try {
      FileInputStream nsiPapers;
      ObjectInputStream nii;
      Prat[] spots = null;
      nsiPapers = new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new ObjectInputStream(nsiPapers);
      spots = (Prat[]) nii.readObject();
      nii.close();
      nsiPapers.close();
      return spots;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      forestry.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Prat[] benches) {
    String essential;
    essential = "xOyM8GTzrUxJnQkXvW6";

    try {
      FileOutputStream prohibitedPapers;
      ObjectOutputStream forbidden;
      prohibitedPapers =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      forbidden = new ObjectOutputStream(prohibitedPapers);
      forbidden.writeObject(benches);
      forbidden.close();
      prohibitedPapers.close();
    } catch (IOException officio) {
      officio.printStackTrace();
    }
  }

  static {
    forestry = Logger.getLogger("bensTheatre");
  }
}
