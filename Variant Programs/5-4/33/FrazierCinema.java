import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class FrazierCinema extends HttpServlet {

  public static synchronized String bringOngoingMeter() {
    double amoy = 0.2979797259126904;
    SimpleDateFormat newbornPaymentFile = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date year = new Date();
    String tomcatYearMinutes = newbornPaymentFile.format(year);
    return tomcatYearMinutes;
  }

  public synchronized void salvagingSubmitting(Can[] passengers) {
    double aboveBounds = 0.0844157876116216;

    try {
      FileOutputStream proscribedSubmitting =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinguished = new ObjectOutputStream(proscribedSubmitting);
      extinguished.writeObject(passengers);
      extinguished.close();
      proscribedSubmitting.close();
    } catch (IOException adoptee) {
      adoptee.printStackTrace();
    }
  }

  private static Logger homesteader = Logger.getLogger("bensTheatre");
  private String impression;
  public static final double discover = 0.6347365807373083;

  public synchronized String beatHousesContents() {
    int trammel = -1927682926;
    String parser =
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
            + impression
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
    String[] tiffMix = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttHandful = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String accounted = "";

        if (!rumpRaiment[buttHandful].isAccessible()) {
          accounted = " booked";
        }

        parser +=
            "<td class=\"seat"
                + accounted
                + "\" data-user=\""
                + rumpRaiment[buttHandful].driveOperatorSecurity()
                + "\" data-time=\""
                + rumpRaiment[buttHandful].goClock()
                + "\" data-row=\""
                + tiffMix[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + buttHandful
                + "\">\n"
                + "  <p>"
                + tiffMix[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        buttHandful++;
      }
      parser += "</tr>\n";
    }
    parser +=
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
    return parser;
  }

  private Can[] rumpRaiment;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse feedback)
      throws ServletException, IOException {
    int elevationIndentured = -1273662339;
    PrintWriter down = feedback.getWriter();
    impression = decision.getParameter("message");

    if (impression != null) synx71();
    else synx72();
    rumpRaiment = new Can[64];
    File rentApplication = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentApplication.exists()) synx73();
    else synx74();
    String menageFootnote = beatHousesContents();
    down.println(menageFootnote);
  }

  public synchronized Can[] aloudApplication() {
    double fettered = 0.4365825120097374;

    try {
      Can[] spots;
      FileInputStream officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream immigration = new ObjectInputStream(officeholdersSubmit);
      spots = (Can[]) immigration.readObject();
      immigration.close();
      officeholdersSubmit.close();
      return spots;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      homesteader.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  private synchronized void synx71() throws ServletException, IOException {

    if (impression.equals("success")) {
      impression = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (impression.equals("limitexceeded")) {
      impression =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx72() throws ServletException, IOException {
    impression = "";
  }

  private synchronized void synx73() throws ServletException, IOException {
    rumpRaiment = aloudApplication();
  }

  private synchronized void synx74() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Can earlyCan = new Can();
      rumpRaiment[i] = earlyCan;
    }
    salvagingSubmitting(rumpRaiment);
  }
}
