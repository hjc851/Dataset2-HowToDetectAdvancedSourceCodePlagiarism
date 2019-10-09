import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class JamalProductions extends HttpServlet {
  static String radius = "td2SE5e";
  public Invest[] keisterMyriad = null;
  public String note = null;
  public static Logger forestry = null;

  public synchronized void doGet(HttpServletRequest petitioning, HttpServletResponse reaction)
      throws ServletException, IOException {
    String bersToken = "Yo6K5YeHtwjGbH";
    PrintWriter extinguished = reaction.getWriter();
    note = petitioning.getParameter("message");

    if (note != null) {

      if (note.equals("success")) {
        note = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (note.equals("limitexceeded")) {
        note =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      note = "";
    }
    keisterMyriad = new Invest[64];
    File ticketFolder = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketFolder.exists()) {
      keisterMyriad = readableArchiving();
    } else {

      for (int i = 0; i < 64; i++) {
        Invest recentlyDerriere = new Invest();
        keisterMyriad[i] = recentlyDerriere;
      }
      preserveLodge(keisterMyriad);
    }
    String placeText = arriveInteriorPagination();
    extinguished.println(placeText);
  }

  public synchronized Invest[] readableArchiving() {
    String symbolism = "ctbYLv4pll";

    try {
      Invest[] members = null;
      FileInputStream electedFilename =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream advocates = new ObjectInputStream(electedFilename);
      members = (Invest[]) advocates.readObject();
      advocates.close();
      electedFilename.close();
      return members;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      forestry.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void preserveLodge(Invest[] beds) {
    double describe = 0.3749463357938957;

    try {
      FileOutputStream exteriorReadme =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unconscious = new ObjectOutputStream(exteriorReadme);
      unconscious.writeObject(beds);
      unconscious.close();
      exteriorReadme.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized String arriveInteriorPagination() {
    int critical = 823282840;
    String aspx =
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Theatre Booking System</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"home\">\n"
            + "    <header>\n"
            + "      <h1>Theatre Booking System</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <p class=\"message\">"
            + note
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + letAfootHours()
            + " (DD-MM-YY SS-MM-HH)</p>\n"
            + "      </div>\n"
            + "      <div class=\"instructions\">\n"
            + "        <p>Select a seat below to place your booking...</p>\n"
            + "      </div>\n"
            + "      <table>\n"
            + "        <thead>\n"
            + "          <tr>\n"
            + "            <td colspan=\"8\">\n"
            + "              <p>Stage</p>\n"
            + "            </td>\n"
            + "          </tr>\n"
            + "        </thead>\n"
            + "        <tbody>";
    String[] roundRaft = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int rearAmount = 0;

    for (int i = 0; i < 8; i++) {
      aspx += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String registered = "";

        if (!keisterMyriad[rearAmount].isAccessible()) {
          registered = " booked";
        }

        aspx +=
            "<td class=\"seat"
                + registered
                + "\" data-user=\""
                + keisterMyriad[rearAmount].haveSubscriberHandle()
                + "\" data-time=\""
                + keisterMyriad[rearAmount].driveAgain()
                + "\" data-row=\""
                + roundRaft[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + rearAmount
                + "\">\n"
                + "  <p>"
                + roundRaft[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        rearAmount++;
      }
      aspx += "</tr>\n";
    }
    aspx +=
        "</tbody>\n"
            + "      </table>\n"
            + "      <div class=\"legend\">\n"
            + "        <div class=\"available\">\n"
            + "          <p>Available</p>\n"
            + "        </div>\n"
            + "        <div class=\"booked\">\n"
            + "          <p>Booked</p>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <div id=\"popup\">\n"
            + "      <div class=\"inner\">\n"
            + "        <h3>This seat is already booked.</h3>\n"
            + "        <p>Booked By:<span class=\"booked-name\"></span></p>\n"
            + "        <p>Booked On:<span class=\"booked-time\"></span></p>\n"
            + "        <div class=\"close\">\n"
            + "          <button>OK</button>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>";
    return aspx;
  }

  public static synchronized String letAfootHours() {
    int namDetail = 1986864617;
    SimpleDateFormat recentlyTimelineStyle = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date beginning = new Date();
    String curshipTimeAmount = recentlyTimelineStyle.format(beginning);
    return curshipTimeAmount;
  }

  static {
    forestry = getLogger("bensTheatre");
  }
}
