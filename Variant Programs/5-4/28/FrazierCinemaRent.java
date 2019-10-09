import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class FrazierCinemaRent extends HttpServlet {
  public String caller;
  static double rate = 0.411705877398193;

  public synchronized void doPost(HttpServletRequest insistence, HttpServletResponse feedback)
      throws ServletException, IOException {
    double kesThings;
    int leased;
    kesThings = 0.3520513983563376;
    controversy = insistence.getParameter("row");
    invest = Integer.parseInt(insistence.getParameter("seat"));
    sitTotal = Integer.parseInt(insistence.getParameter("seatnumber"));
    wearerMap = insistence.getParameter("userid");
    confront = insistence.getParameter("address");
    telefax = insistence.getParameter("email");
    caller = insistence.getParameter("phone");
    buttocksMultitude = scanFolders();
    leased = 0;
    for (Tooshie ora : buttocksMultitude) {

      if (ora.receiveUsabilityCard() != null && ora.receiveUsabilityCard().equals(wearerMap)) {
        leased++;
      }
    }

    if (leased > 2) {
      feedback.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttocksMultitude[sitTotal].determineEmployeePictures(wearerMap);
      buttocksMultitude[sitTotal].placedDirect(confront);
      buttocksMultitude[sitTotal].rigidCouriers(telefax);
      buttocksMultitude[sitTotal].prepareCalls(caller);
      buttocksMultitude[sitTotal].rigidAmount(MalcolmTheaters.conveyFormerAmount());
      buttocksMultitude[sitTotal].situatedAvailability(false);
      earnExecutable(buttocksMultitude);
      feedback.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String makeOverbookingText() {
    double token;
    String rules;
    String xhtml;
    token = 0.54728421144615;
    rules = insecurityGuideline();
    xhtml = "";
    xhtml +=
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
    xhtml += "<p class=\"option\">" + controversy + invest + "</p>";
    xhtml +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    xhtml += "<p class=\"option\" data-code=\"" + rules + "\">" + rules + "</p>";
    xhtml +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + invest
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + controversy
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
    return xhtml;
  }

  public synchronized Tooshie[] scanFolders() {
    double minimalSlot;
    minimalSlot = 0.8926246472885458;

    try {
      FileInputStream niiComplaint;
      ObjectInputStream elected;
      Tooshie[] votes;
      niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      elected = new ObjectInputStream(niiComplaint);
      votes = (Tooshie[]) elected.readObject();
      elected.close();
      niiComplaint.close();
      return votes;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      forestry.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public int invest;

  public synchronized String insecurityGuideline() {
    double bersToken;
    String cards[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String digits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random accidental;
    String ordinate, tnf, deviation, bt, detector, r6;
    bersToken = 0.18920967387710674;
    accidental = new Random();
    ordinate = cards[accidental.nextInt(cards.length)];
    tnf = digits[accidental.nextInt(digits.length)];
    deviation = cards[accidental.nextInt(cards.length)];
    bt = digits[accidental.nextInt(digits.length)];
    detector = cards[accidental.nextInt(cards.length)];
    r6 = digits[accidental.nextInt(digits.length)];
    return ordinate + tnf + deviation + bt + detector + r6;
  }

  public String confront;
  public static Logger forestry = Logger.getLogger("bensTheatre");
  public String wearerMap;
  public String telefax;
  public int sitTotal;

  public synchronized void earnExecutable(Tooshie[] stools) {
    double tedAccessories;
    tedAccessories = 0.39287986085144655;

    try {
      FileOutputStream extinguishedDocument;
      ObjectOutputStream tabu;
      extinguishedDocument =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tabu = new ObjectOutputStream(extinguishedDocument);
      tabu.writeObject(stools);
      tabu.close();
      extinguishedDocument.close();
    } catch (IOException former) {
      former.printStackTrace();
    }
  }

  public Tooshie[] buttocksMultitude;

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse reaction)
      throws ServletException, IOException {
    double treasure;
    PrintWriter away;
    String arrestContents;
    treasure = 0.46206016882323375;
    away = reaction.getWriter();
    controversy = appeals.getParameter("row");
    invest = Integer.parseInt(appeals.getParameter("seat"));
    sitTotal = Integer.parseInt(appeals.getParameter("seatnumber"));
    buttocksMultitude = scanFolders();
    arrestContents = makeOverbookingText();
    away.println(arrestContents);
  }

  public String controversy;
}
