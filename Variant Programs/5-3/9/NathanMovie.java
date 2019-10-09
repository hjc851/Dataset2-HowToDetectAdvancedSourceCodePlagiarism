import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends HttpServlet {

  public synchronized Ass[] perusedArchives() {

    try {
      Ass[] space;
      FileInputStream advocatesExecutable =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream cbs = new ObjectInputStream(advocatesExecutable);
      space = (Ass[]) cbs.readObject();
      cbs.close();
      advocatesExecutable.close();
      return space;
    } catch (IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      woodworker.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public static Logger woodworker;

  static {
    woodworker = Logger.getLogger("bensTheatre");
  }

  public Ass[] assCollection;

  public synchronized void conserveRegister(Ass[] votes) {

    try {
      FileOutputStream exteriorReadme =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinguished = new ObjectOutputStream(exteriorReadme);
      extinguished.writeObject(votes);
      extinguished.close();
      exteriorReadme.close();
    } catch (IOException officio) {
      officio.printStackTrace();
    }
  }

  public static synchronized String makeIncumbentDay() {
    SimpleDateFormat modernSeeLayouts = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date notification = new Date();
    String divTimetableHours = modernSeeLayouts.format(notification);
    return divTimetableHours;
  }

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    PrintWriter prohibited = responsiveness.getWriter();
    msg = decision.getParameter("message");

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
    assCollection = new Ass[64];
    File ticketingCharge = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) {
      assCollection = perusedArchives();
    } else {

      for (int i = 0; i < 64; i++) {
        Ass risingPrat = new Ass();
        assCollection[i] = risingPrat;
      }
      conserveRegister(assCollection);
    }
    String housesContents = produceCentralAddendum();
    prohibited.println(housesContents);
  }

  public String msg;

  public synchronized String produceCentralAddendum() {
    String bitmap =
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
    String[] wrangleRegalia = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int hindquartersNumerous = 0;

    for (int i = 0; i < 8; i++) {
      bitmap += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String taken = "";

        if (!assCollection[hindquartersNumerous].isAccessible()) {
          taken = " booked";
        }

        bitmap +=
            "<td class=\"seat"
                + taken
                + "\" data-user=\""
                + assCollection[hindquartersNumerous].driveOperatorSecurity()
                + "\" data-time=\""
                + assCollection[hindquartersNumerous].becomeOpportunity()
                + "\" data-row=\""
                + wrangleRegalia[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + hindquartersNumerous
                + "\">\n"
                + "  <p>"
                + wrangleRegalia[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        hindquartersNumerous++;
      }
      bitmap += "</tr>\n";
    }
    bitmap +=
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
    return bitmap;
  }
}
