import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AllanSalle extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger woodworker =
      java.util.logging.Logger.getLogger("bensTheatre");
  private java.lang.String statement = null;
  private Induct[] backsideAssortment = null;

  public synchronized void doGet(HttpServletRequest bespeak, HttpServletResponse wake)
      throws ServletException, IOException {
    java.io.PrintWriter taboo;
    java.io.File arrestBinder;
    java.lang.String baseWeb;
    taboo = wake.getWriter();
    statement = bespeak.getParameter("message");

    if (statement != null) {

      if (statement.equals("success")) {
        statement = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (statement.equals("limitexceeded")) {
        statement =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      statement = "";
    }
    backsideAssortment = new Induct[64];
    arrestBinder = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (arrestBinder.exists()) {
      backsideAssortment = readableArchiving();
    } else {

      for (int i = 0; i < 64; i++) {
        Induct revolutionaryRump;
        revolutionaryRump = new Induct();
        backsideAssortment[i] = revolutionaryRump;
      }
      savingsFilename(backsideAssortment);
    }
    baseWeb = canResidenceScreen();
    taboo.println(baseWeb);
  }

  public synchronized Induct[] readableArchiving() {

    try {
      java.io.FileInputStream adherentsPaperwork;
      java.io.ObjectInputStream nii;
      Induct[] elects = null;
      adherentsPaperwork =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new java.io.ObjectInputStream(adherentsPaperwork);
      elects = (Induct[]) nii.readObject();
      nii.close();
      adherentsPaperwork.close();
      return elects;
    } catch (java.io.IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      woodworker.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void savingsFilename(Induct[] passengers) {

    try {
      java.io.FileOutputStream extinctComplaint;
      java.io.ObjectOutputStream quenched;
      extinctComplaint =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      quenched = new java.io.ObjectOutputStream(extinctComplaint);
      quenched.writeObject(passengers);
      quenched.close();
      extinctComplaint.close();
    } catch (java.io.IOException con) {
      con.printStackTrace();
    }
  }

  public synchronized java.lang.String canResidenceScreen() {
    java.lang.String firefox;
    int bottomCaseload;
    firefox =
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
            + statement
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + makeIncumbentDay()
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
    String[] packSuite = {"A", "B", "C", "D", "E", "F", "G", "H"};
    bottomCaseload = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String arrested;
        arrested = "";

        if (!backsideAssortment[bottomCaseload].isAccessible()) {
          arrested = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + arrested
                + "\" data-user=\""
                + backsideAssortment[bottomCaseload].findLoginIdentifier()
                + "\" data-time=\""
                + backsideAssortment[bottomCaseload].findSentence()
                + "\" data-row=\""
                + packSuite[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bottomCaseload
                + "\">\n"
                + "  <p>"
                + packSuite[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bottomCaseload++;
      }
      firefox += "</tr>\n";
    }
    firefox +=
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
    return firefox;
  }

  public static synchronized java.lang.String makeIncumbentDay() {
    java.text.SimpleDateFormat recentYearStructure;
    java.util.Date due;
    java.lang.String damnTimingYear;
    recentYearStructure = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    due = new java.util.Date();
    damnTimingYear = recentYearStructure.format(due);
    return damnTimingYear;
  }
}
