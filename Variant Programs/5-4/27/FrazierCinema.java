import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class FrazierCinema extends HttpServlet {
  public static Logger homesteader = null;
  public String voicemail = null;
  public Stern[] hindquartersPalette = null;

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse feedback)
      throws ServletException, IOException {
    PrintWriter taboo;
    File arrestBinder;
    String nationalTab;
    taboo = feedback.getWriter();
    voicemail = application.getParameter("message");

    if (voicemail != null) {

      if (voicemail.equals("success")) {
        voicemail = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (voicemail.equals("limitexceeded")) {
        voicemail =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      voicemail = "";
    }
    hindquartersPalette = new Stern[64];
    arrestBinder = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (arrestBinder.exists()) {
      hindquartersPalette = proofreadComplaint();
    } else {

      for (int i = 0; i < 64; i++) {
        Stern modernPlace;
        modernPlace = new Stern();
        hindquartersPalette[i] = modernPlace;
      }
      helpData(hindquartersPalette);
    }
    nationalTab = receiveHouseholdWebsite();
    taboo.println(nationalTab);
  }

  public synchronized Stern[] proofreadComplaint() {

    try {
      FileInputStream tenantsDocuments;
      ObjectInputStream tenants;
      Stern[] space = null;
      tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tenants = new ObjectInputStream(tenantsDocuments);
      space = (Stern[]) tenants.readObject();
      tenants.close();
      tenantsDocuments.close();
      return space;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      homesteader.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void helpData(Stern[] beds) {

    try {
      FileOutputStream extinctComplaint;
      ObjectOutputStream unconscious;
      extinctComplaint =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unconscious = new ObjectOutputStream(extinctComplaint);
      unconscious.writeObject(beds);
      unconscious.close();
      extinctComplaint.close();
    } catch (IOException adoptee) {
      adoptee.printStackTrace();
    }
  }

  public synchronized String receiveHouseholdWebsite() {
    String parser;
    int rumpCount;
    parser =
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
            + voicemail
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + beatTypicalJuncture()
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
    String[] seriesMultitude = {"A", "B", "C", "D", "E", "F", "G", "H"};
    rumpCount = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String recorded;
        recorded = "";

        if (!hindquartersPalette[rumpCount].isAccessible()) {
          recorded = " booked";
        }

        parser +=
            "<td class=\"seat"
                + recorded
                + "\" data-user=\""
                + hindquartersPalette[rumpCount].fetchEmployeePictures()
                + "\" data-time=\""
                + hindquartersPalette[rumpCount].arriveMonth()
                + "\" data-row=\""
                + seriesMultitude[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + rumpCount
                + "\">\n"
                + "  <p>"
                + seriesMultitude[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        rumpCount++;
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

  public static synchronized String beatTypicalJuncture() {
    SimpleDateFormat untestedDeadlineApproach;
    Date due;
    String essenceUpdateHour;
    untestedDeadlineApproach = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    due = new Date();
    essenceUpdateHour = untestedDeadlineApproach.format(due);
    return essenceUpdateHour;
  }

  static {
    homesteader = Logger.getLogger("bensTheatre");
  }
}
