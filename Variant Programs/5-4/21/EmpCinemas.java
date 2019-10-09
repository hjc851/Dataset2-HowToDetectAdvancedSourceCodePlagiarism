import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class EmpCinemas extends javax.servlet.http.HttpServlet {
  private Can[] posteriorGamut;
  private java.lang.String mail;
  private static java.util.logging.Logger forester;

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse react)
      throws ServletException, IOException {
    java.io.PrintWriter extinct = react.getWriter();
    mail = suggestion.getParameter("message");

    if (mail != null) {

      if (mail.equals("success")) {
        mail = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (mail.equals("limitexceeded")) {
        mail =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      mail = "";
    }
    posteriorGamut = new Can[64];
    java.io.File arrestBinder =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (arrestBinder.exists()) {
      posteriorGamut = recordExecutable();
    } else {

      for (int i = 0; i < 64; i++) {
        Can recentHindquarters = new Can();
        posteriorGamut[i] = recentHindquarters;
      }
      salvageCharge(posteriorGamut);
    }
    java.lang.String domesticSummary = letNationalTab();
    extinct.println(domesticSummary);
  }

  public synchronized Can[] recordExecutable() {

    try {
      Can[] stalls;
      java.io.FileInputStream nsisApplication =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nih = new java.io.ObjectInputStream(nsisApplication);
      stalls = (Can[]) nih.readObject();
      nih.close();
      nsisApplication.close();
      return stalls;
    } catch (java.io.IOException i) {
      forester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      forester.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Can[] tickets) {

    try {
      java.io.FileOutputStream proscribedSubmitting =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unstylish = new java.io.ObjectOutputStream(proscribedSubmitting);
      unstylish.writeObject(tickets);
      unstylish.close();
      proscribedSubmitting.close();
    } catch (java.io.IOException vet) {
      vet.printStackTrace();
    }
  }

  public synchronized java.lang.String letNationalTab() {
    java.lang.String ajax =
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
            + mail
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + sustainThisThing()
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
    int keisterRoutine = 0;

    for (int i = 0; i < 8; i++) {
      ajax += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String entered = "";

        if (!posteriorGamut[keisterRoutine].isAccessible()) {
          entered = " booked";
        }

        ajax +=
            "<td class=\"seat"
                + entered
                + "\" data-user=\""
                + posteriorGamut[keisterRoutine].sustainSomeoneSelf()
                + "\" data-time=\""
                + posteriorGamut[keisterRoutine].bringMeter()
                + "\" data-row=\""
                + rankingPortfolio[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + keisterRoutine
                + "\">\n"
                + "  <p>"
                + rankingPortfolio[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        keisterRoutine++;
      }
      ajax += "</tr>\n";
    }
    ajax +=
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
    return ajax;
  }

  public static synchronized java.lang.String sustainThisThing() {
    java.text.SimpleDateFormat untestedDeadlineApproach =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date deadlines = new java.util.Date();
    java.lang.String slobScheduledPeriod = untestedDeadlineApproach.format(deadlines);
    return slobScheduledPeriod;
  }

  static {
    forester = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
