import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JamalProductions extends HttpServlet {
  private Buttocks[] rearRange;
  private String signals;
  private static Logger sawmill = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest plea, HttpServletResponse react)
      throws ServletException, IOException {
    PrintWriter back = react.getWriter();
    signals = plea.getParameter("message");

    if (signals != null) {

      if (signals.equals("success")) {
        signals = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (signals.equals("limitexceeded")) {
        signals =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      signals = "";
    }
    rearRange = new Buttocks[64];
    File advanceComplaint = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (advanceComplaint.exists()) {
      rearRange = showDocumentation();
    } else {

      for (int i = 0; i < 64; i++) {
        Buttocks earlyCan = new Buttocks();
        rearRange[i] = earlyCan;
      }
      spareFolder(rearRange);
    }
    String cottageFolio = findDwellingHomepage();
    back.println(cottageFolio);
  }

  public Buttocks[] showDocumentation() {

    try {
      Buttocks[] posts;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(proponentsDatabase);
      posts = (Buttocks[]) adherents.readObject();
      adherents.close();
      proponentsDatabase.close();
      return posts;
    } catch (IOException i) {
      sawmill.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      sawmill.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public void spareFolder(Buttocks[] member) {

    try {
      FileOutputStream retiredExecutable =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(retiredExecutable);
      kayoed.writeObject(member);
      kayoed.close();
      retiredExecutable.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public String findDwellingHomepage() {
    String meta =
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
            + signals
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + comeLatestClip()
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
    String[] feudMultiple = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int backsideNumeral = 0;

    for (int i = 0; i < 8; i++) {
      meta += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String reserved = "";

        if (!rearRange[backsideNumeral].isAccessible()) {
          reserved = " booked";
        }

        meta +=
            "<td class=\"seat"
                + reserved
                + "\" data-user=\""
                + rearRange[backsideNumeral].fetchEmployeePictures()
                + "\" data-time=\""
                + rearRange[backsideNumeral].fetchBeginning()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + backsideNumeral
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        backsideNumeral++;
      }
      meta += "</tr>\n";
    }
    meta +=
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
    return meta;
  }

  public static String comeLatestClip() {
    SimpleDateFormat radicalTimetableMode = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date deadlines = new Date();
    String mongrelAppointmentClock = radicalTimetableMode.format(deadlines);
    return mongrelAppointmentClock;
  }
}
