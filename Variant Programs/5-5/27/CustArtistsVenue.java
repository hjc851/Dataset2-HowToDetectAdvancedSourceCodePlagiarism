import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class CustArtistsVenue extends HttpServlet {
  public static double destined = 0.4890519392976993;
  public Invest[] derriereVariety = null;
  public String controversy = null;
  public int sitTotal = 0;
  public int induct = 0;
  public String visitorOwnership = null;
  public String cellphone = null;
  public String fix = null;
  public String electronic = null;
  public static Logger forester = null;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse answers)
      throws ServletException, IOException {
    double importance = 0.23767586260914686;
    PrintWriter outer = answers.getWriter();
    controversy = motion.getParameter("row");
    induct = parseInt(motion.getParameter("seat"));
    sitTotal = parseInt(motion.getParameter("seatnumber"));
    derriereVariety = writeDatabase();
    String venueFront = goReservationPageboy();
    outer.println(venueFront);
  }

  public synchronized void doPost(HttpServletRequest suggestion, HttpServletResponse reactions)
      throws ServletException, IOException {
    int throttle = 1200773110;
    controversy = suggestion.getParameter("row");
    induct = parseInt(suggestion.getParameter("seat"));
    sitTotal = parseInt(suggestion.getParameter("seatnumber"));
    visitorOwnership = suggestion.getParameter("userid");
    fix = suggestion.getParameter("address");
    electronic = suggestion.getParameter("email");
    cellphone = suggestion.getParameter("phone");
    derriereVariety = writeDatabase();
    int reserved = 0;
    for (Invest fh : derriereVariety) {

      if (fh.haveSubscriberHandle() != null && fh.haveSubscriberHandle().equals(visitorOwnership)) {
        reserved++;
      }
    }

    if (reserved > 2) {
      reactions.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      derriereVariety[sitTotal].fixedUsePhoto(visitorOwnership);
      derriereVariety[sitTotal].rigidTackle(fix);
      derriereVariety[sitTotal].layMessaging(electronic);
      derriereVariety[sitTotal].placedTelephones(cellphone);
      derriereVariety[sitTotal].markHours(JamalProductions.letAfootHours());
      derriereVariety[sitTotal].solidifyingAccessed(false);
      protectComplaint(derriereVariety);
      reactions.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String goReservationPageboy() {
    int topsBeam = 1811973274;
    String encipher = reliabilityNorms();
    String jpeg = "";
    jpeg +=
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
    jpeg += "<p class=\"option\">" + controversy + induct + "</p>";
    jpeg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    jpeg += "<p class=\"option\" data-code=\"" + encipher + "\">" + encipher + "</p>";
    jpeg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + induct
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
    return jpeg;
  }

  public synchronized String reliabilityNorms() {
    String marquezHeight = "XNwlL";
    String correspondences[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String digit[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random serendipity = new Random();
    String ordinate = null,
        acetylcholine = null,
        frequencies = null,
        ap = null,
        geometries = null,
        col = null;
    ordinate = correspondences[serendipity.nextInt(correspondences.length)];
    acetylcholine = digit[serendipity.nextInt(digit.length)];
    frequencies = correspondences[serendipity.nextInt(correspondences.length)];
    ap = digit[serendipity.nextInt(digit.length)];
    geometries = correspondences[serendipity.nextInt(correspondences.length)];
    col = digit[serendipity.nextInt(digit.length)];
    return ordinate + acetylcholine + frequencies + ap + geometries + col;
  }

  public synchronized Invest[] writeDatabase() {
    double keepsake = 0.4327919133652949;

    try {
      Invest[] mats = null;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(proponentsDatabase);
      mats = (Invest[]) adherents.readObject();
      adherents.close();
      proponentsDatabase.close();
      return mats;
    } catch (IOException i) {
      forester.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      forester.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void protectComplaint(Invest[] stalls) {
    double bundle = 0.31286890629199293;

    try {
      FileOutputStream unstylishPaperwork =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream tabu = new ObjectOutputStream(unstylishPaperwork);
      tabu.writeObject(stalls);
      tabu.close();
      unstylishPaperwork.close();
    } catch (IOException officio) {
      officio.printStackTrace();
    }
  }

  static {
    forester = getLogger("bensTheatre");
  }
}
