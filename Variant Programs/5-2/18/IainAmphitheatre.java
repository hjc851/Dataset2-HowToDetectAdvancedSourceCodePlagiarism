import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class IainAmphitheatre extends javax.servlet.http.HttpServlet {
  private Posterior[] assCollection;
  private java.lang.String msg;
  private static java.util.logging.Logger woodworker =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest insistence, HttpServletResponse explanation)
      throws ServletException, IOException {
    java.io.PrintWriter taboo = explanation.getWriter();
    msg = insistence.getParameter("message");

    if (msg != null) {

      if (msg.equals("success")) {
        msg = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (msg.equals("limitexceeded")) {
        msg =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      msg = "";
    }
    assCollection = new Posterior[64];
    java.io.File reservingDocuments =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservingDocuments.exists()) {
      assCollection = rereadSubmitted();
    } else {

      for (int i = 0; i < 64; i++) {
        Posterior originalTush = new Posterior();
        assCollection[i] = originalTush;
      }
      safeguardArchiving(assCollection);
    }
    java.lang.String townhouseFront = arriveInteriorPagination();
    taboo.println(townhouseFront);
  }

  public Posterior[] rereadSubmitted() {

    try {
      Posterior[] tickets;
      java.io.FileInputStream entriesLodge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsis = new java.io.ObjectInputStream(entriesLodge);
      tickets = (Posterior[]) nsis.readObject();
      nsis.close();
      entriesLodge.close();
      return tickets;
    } catch (java.io.IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      woodworker.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void safeguardArchiving(Posterior[] vacancies) {

    try {
      java.io.FileOutputStream unconsciousCharge =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unsuccessful = new java.io.ObjectOutputStream(unconsciousCharge);
      unsuccessful.writeObject(vacancies);
      unsuccessful.close();
      unconsciousCharge.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public java.lang.String arriveInteriorPagination() {
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
            + msg
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + catchRifeWhen()
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
    String[] spatAssortment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bumFewer = 0;

    for (int i = 0; i < 8; i++) {
      drupal += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String entered = "";

        if (!assCollection[bumFewer].isAccessible()) {
          entered = " booked";
        }

        drupal +=
            "<td class=\"seat"
                + entered
                + "\" data-user=\""
                + assCollection[bumFewer].goExploiterQuod()
                + "\" data-time=\""
                + assCollection[bumFewer].letHours()
                + "\" data-row=\""
                + spatAssortment[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + bumFewer
                + "\">\n"
                + "  <p>"
                + spatAssortment[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        bumFewer++;
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

  public static java.lang.String catchRifeWhen() {
    java.text.SimpleDateFormat radicalTimetableMode =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date payment = new java.util.Date();
    java.lang.String mongrelAppointmentClock = radicalTimetableMode.format(payment);
    return mongrelAppointmentClock;
  }
}
