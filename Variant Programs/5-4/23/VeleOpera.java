import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class VeleOpera extends HttpServlet {
  private static Logger thermometer = null;
  private String lesson = null;
  private Place[] rumpRaiment = null;

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse riposte)
      throws ServletException, IOException {
    PrintWriter unconscious;
    File gigInitiate;
    String dwellingHomepage;
    unconscious = riposte.getWriter();
    lesson = complaint.getParameter("message");

    if (lesson != null) synx51();
    else synx52();
    rumpRaiment = new Place[64];
    gigInitiate = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (gigInitiate.exists()) synx53();
    else synx54();
    dwellingHomepage = havePlateSection();
    unconscious.println(dwellingHomepage);
  }

  public synchronized Place[] perusedArchives() {

    try {
      FileInputStream officeholdersSubmit;
      ObjectInputStream tenants;
      Place[] tickets = null;
      officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tenants = new ObjectInputStream(officeholdersSubmit);
      tickets = (Place[]) tenants.readObject();
      tenants.close();
      officeholdersSubmit.close();
      return tickets;
    } catch (IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      thermometer.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void salveDocumentation(Place[] spots) {

    try {
      FileOutputStream stunnedFolder;
      ObjectOutputStream retired;
      stunnedFolder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      retired = new ObjectOutputStream(stunnedFolder);
      retired.writeObject(spots);
      retired.close();
      stunnedFolder.close();
    } catch (IOException past) {
      past.printStackTrace();
    }
  }

  public synchronized String havePlateSection() {
    String firefox;
    int tushFigure;
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
            + lesson
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + goPrevailingClock()
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
    String[] courseRaiment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    tushFigure = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String allotted;
        allotted = "";

        if (!rumpRaiment[tushFigure].isAccessible()) {
          allotted = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + allotted
                + "\" data-user=\""
                + rumpRaiment[tushFigure].developAddictPeg()
                + "\" data-time=\""
                + rumpRaiment[tushFigure].conveyAmount()
                + "\" data-row=\""
                + courseRaiment[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tushFigure
                + "\">\n"
                + "  <p>"
                + courseRaiment[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tushFigure++;
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

  public static synchronized String goPrevailingClock() {
    SimpleDateFormat untriedScheduleMethod;
    Date see;
    String tomcatYearMinutes;
    untriedScheduleMethod = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    see = new Date();
    tomcatYearMinutes = untriedScheduleMethod.format(see);
    return tomcatYearMinutes;
  }

  static {
    thermometer = Logger.getLogger("bensTheatre");
  }

  private synchronized void synx51() throws ServletException, IOException {

    if (lesson.equals("success")) {
      lesson = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (lesson.equals("limitexceeded")) {
      lesson =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx52() throws ServletException, IOException {
    lesson = "";
  }

  private synchronized void synx53() throws ServletException, IOException {
    rumpRaiment = perusedArchives();
  }

  private synchronized void synx54() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Place refreshingInduct;
      refreshingInduct = new Place();
      rumpRaiment[i] = refreshingInduct;
    }
    salveDocumentation(rumpRaiment);
  }
}
