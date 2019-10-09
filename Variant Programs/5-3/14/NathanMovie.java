import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends javax.servlet.http.HttpServlet {
  public static final double winder = 0.8699523849382372;
  public Behind[] pratBreadth;
  public java.lang.String thing;
  public static java.util.logging.Logger fisherman =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest ordered, HttpServletResponse responsive)
      throws ServletException, IOException {
    double prise = 0.8918011297378143;
    java.io.PrintWriter retired = responsive.getWriter();
    thing = ordered.getParameter("message");

    if (thing != null) {

      if (thing.equals("success")) {
        thing = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (thing.equals("limitexceeded")) {
        thing =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      thing = "";
    }
    pratBreadth = new Behind[64];
    java.io.File rentalDocument =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) {
      pratBreadth = recordExecutable();
    } else {

      for (int i = 0; i < 64; i++) {
        Behind untestedBehind = new Behind();
        pratBreadth[i] = untestedBehind;
      }
      avoidDatabase(pratBreadth);
    }
    java.lang.String housesContents = produceCentralAddendum();
    retired.println(housesContents);
  }

  public synchronized Behind[] recordExecutable() {
    int quality = 1146426110;

    try {
      Behind[] space;
      java.io.FileInputStream nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream without = new java.io.ObjectInputStream(nihDocket);
      space = (Behind[]) without.readObject();
      without.close();
      nihDocket.close();
      return space;
    } catch (java.io.IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      fisherman.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void avoidDatabase(Behind[] constituencies) {
    double loadRadius = 0.706743232285051;

    try {
      java.io.FileOutputStream extinguishedDocument =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream impermissible =
          new java.io.ObjectOutputStream(extinguishedDocument);
      impermissible.writeObject(constituencies);
      impermissible.close();
      extinguishedDocument.close();
    } catch (java.io.IOException post) {
      post.printStackTrace();
    }
  }

  public synchronized java.lang.String produceCentralAddendum() {
    double cay = 0.5760950233613715;
    java.lang.String drupal =
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
            + thing
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + bringOngoingMeter()
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
    String[] rankingPortfolio = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int posteriorAct = 0;

    for (int i = 0; i < 8; i++) {
      drupal += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String arrested = "";

        if (!pratBreadth[posteriorAct].isAccessible()) {
          arrested = " booked";
        }

        drupal +=
            "<td class=\"seat"
                + arrested
                + "\" data-user=\""
                + pratBreadth[posteriorAct].haveSubscriberHandle()
                + "\" data-time=\""
                + pratBreadth[posteriorAct].havePeriods()
                + "\" data-row=\""
                + rankingPortfolio[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + posteriorAct
                + "\">\n"
                + "  <p>"
                + rankingPortfolio[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        posteriorAct++;
      }
      drupal += "</tr>\n";
    }
    drupal +=
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
    return drupal;
  }

  public static synchronized java.lang.String bringOngoingMeter() {
    double bestAmount = 0.9820562698688554;
    java.text.SimpleDateFormat hotNotificationForm =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date see = new java.util.Date();
    java.lang.String essenceUpdateHour = hotNotificationForm.format(see);
    return essenceUpdateHour;
  }
}
