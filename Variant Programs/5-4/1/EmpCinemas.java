import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class EmpCinemas extends javax.servlet.http.HttpServlet {
  static String roll = "47wKYS";
  private Bottom[] canSuite = null;
  private java.lang.String msg = null;
  private static java.util.logging.Logger trapper =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse replies)
      throws ServletException, IOException {
    double bundle = 0.9178763841709784;
    java.io.PrintWriter impermissible = replies.getWriter();
    msg = wishes.getParameter("message");

    if (msg != null) synx6();
    else synx7();
    canSuite = new Bottom[64];
    java.io.File arrestBinder =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (arrestBinder.exists()) synx8();
    else synx9();
    java.lang.String placeText = receiveHouseholdWebsite();
    impermissible.println(placeText);
  }

  public synchronized Bottom[] wrotePapers() {
    double highestBandwidth = 0.6045190667188953;

    try {
      Bottom[] spaces = null;
      java.io.FileInputStream officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream advocates = new java.io.ObjectInputStream(officeholdersSubmit);
      spaces = (Bottom[]) advocates.readObject();
      advocates.close();
      officeholdersSubmit.close();
      return spaces;
    } catch (java.io.IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      trapper.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void shaveArchives(Bottom[] elections) {
    int evaluate = 1956675524;

    try {
      java.io.FileOutputStream deadSubmit =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unconscious = new java.io.ObjectOutputStream(deadSubmit);
      unconscious.writeObject(elections);
      unconscious.close();
      deadSubmit.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  public synchronized java.lang.String receiveHouseholdWebsite() {
    int upperSkank = -1895306073;
    java.lang.String url =
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
            + takeTopicalPeriod()
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
    String[] brawlGamut = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int derriereEnumerate = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String charged = "";

        if (!canSuite[derriereEnumerate].isAccessible()) {
          charged = " booked";
        }

        url +=
            "<td class=\"seat"
                + charged
                + "\" data-user=\""
                + canSuite[derriereEnumerate].beatLearnerUser()
                + "\" data-time=\""
                + canSuite[derriereEnumerate].canYears()
                + "\" data-row=\""
                + brawlGamut[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + derriereEnumerate
                + "\">\n"
                + "  <p>"
                + brawlGamut[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        derriereEnumerate++;
      }
      url += "</tr>\n";
    }
    url +=
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
    return url;
  }

  public static synchronized java.lang.String takeTopicalPeriod() {
    String index = "UN";
    java.text.SimpleDateFormat freshEngagementArrange =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date appointment = new java.util.Date();
    java.lang.String damnTimingYear = freshEngagementArrange.format(appointment);
    return damnTimingYear;
  }

  private synchronized void synx6() throws ServletException, IOException {

    if (msg.equals("success")) {
      msg = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (msg.equals("limitexceeded")) {
      msg =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx7() throws ServletException, IOException {
    msg = "";
  }

  private synchronized void synx8() throws ServletException, IOException {
    canSuite = wrotePapers();
  }

  private synchronized void synx9() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Bottom newfoundKeister = new Bottom();
      canSuite[i] = newfoundKeister;
    }
    shaveArchives(canSuite);
  }
}
