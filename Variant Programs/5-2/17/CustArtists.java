import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class CustArtists extends HttpServlet {
  private Fanny[] bumSelection;
  private String note;
  private static Logger recorder = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest ask, HttpServletResponse intervention)
      throws ServletException, IOException {
    PrintWriter unstylish = intervention.getWriter();
    note = ask.getParameter("message");

    if (note != null) {

      if (note.equals("success")) {
        note = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (note.equals("limitexceeded")) {
        note =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      note = "";
    }
    bumSelection = new Fanny[64];
    File gigInitiate = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (gigInitiate.exists()) {
      bumSelection = aloudApplication();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny refreshingInduct = new Fanny();
        bumSelection[i] = refreshingInduct;
      }
      relieveFolders(bumSelection);
    }
    String interiorPagination = driveCottageFolio();
    unstylish.println(interiorPagination);
  }

  public Fanny[] aloudApplication() {

    try {
      Fanny[] member;
      FileInputStream supportersDocumentation =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream supporters = new ObjectInputStream(supportersDocumentation);
      member = (Fanny[]) supporters.readObject();
      supporters.close();
      supportersDocumentation.close();
      return member;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      recorder.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void relieveFolders(Fanny[] positions) {

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unconscious = new ObjectOutputStream(outgoingArchives);
      unconscious.writeObject(positions);
      unconscious.close();
      outgoingArchives.close();
    } catch (IOException adoptee) {
      adoptee.printStackTrace();
    }
  }

  public String driveCottageFolio() {
    String plugin =
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
            + note
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + conveyFormerAmount()
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
    String[] rankedCollection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int pratStatistic = 0;

    for (int i = 0; i < 8; i++) {
      plugin += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String entered = "";

        if (!bumSelection[pratStatistic].isAccessible()) {
          entered = " booked";
        }

        plugin +=
            "<td class=\"seat"
                + entered
                + "\" data-user=\""
                + bumSelection[pratStatistic].arriveClientIdentifying()
                + "\" data-time=\""
                + bumSelection[pratStatistic].goClock()
                + "\" data-row=\""
                + rankedCollection[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + pratStatistic
                + "\">\n"
                + "  <p>"
                + rankedCollection[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        pratStatistic++;
      }
      plugin += "</tr>\n";
    }
    plugin +=
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
    return plugin;
  }

  public static String conveyFormerAmount() {
    SimpleDateFormat babyUpdatedCompress = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date appointment = new Date();
    String underbredCalendarDay = babyUpdatedCompress.format(appointment);
    return underbredCalendarDay;
  }
}
