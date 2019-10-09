import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NigelDramaturgy extends HttpServlet {
  private Bum[] derriereVariety;
  private String content;
  private static Logger forestry = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest application, HttpServletResponse riposte)
      throws ServletException, IOException {
    PrintWriter taboo = riposte.getWriter();
    content = application.getParameter("message");

    if (content != null) {

      if (content.equals("success")) {
        content = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (content.equals("limitexceeded")) {
        content =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      content = "";
    }
    derriereVariety = new Bum[64];
    File appointmentReadme = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (appointmentReadme.exists()) {
      derriereVariety = wrotePapers();
    } else {

      for (int i = 0; i < 64; i++) {
        Bum revolutionaryRump = new Bum();
        derriereVariety[i] = revolutionaryRump;
      }
      rescuingReadme(derriereVariety);
    }
    String apartmentLayout = catchDomesticSummary();
    taboo.println(apartmentLayout);
  }

  public Bum[] wrotePapers() {

    try {
      Bum[] space;
      FileInputStream supportersDocumentation =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream proponents = new ObjectInputStream(supportersDocumentation);
      space = (Bum[]) proponents.readObject();
      proponents.close();
      supportersDocumentation.close();
      return space;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      forestry.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void rescuingReadme(Bum[] ridings) {

    try {
      FileOutputStream backBinder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(backBinder);
      kayoed.writeObject(ridings);
      kayoed.close();
      backBinder.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public String catchDomesticSummary() {
    String http =
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
            + content
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + drawStreamWeek()
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
    int investFrequency = 0;

    for (int i = 0; i < 8; i++) {
      http += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String reserved = "";

        if (!derriereVariety[investFrequency].isAccessible()) {
          reserved = " booked";
        }

        http +=
            "<td class=\"seat"
                + reserved
                + "\" data-user=\""
                + derriereVariety[investFrequency].goExploiterQuod()
                + "\" data-time=\""
                + derriereVariety[investFrequency].catchWhen()
                + "\" data-row=\""
                + courseRaiment[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + investFrequency
                + "\">\n"
                + "  <p>"
                + courseRaiment[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        investFrequency++;
      }
      http += "</tr>\n";
    }
    http +=
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
    return http;
  }

  public static String drawStreamWeek() {
    SimpleDateFormat hotNotificationForm = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date notification = new Date();
    String cruxDaysYears = hotNotificationForm.format(notification);
    return cruxDaysYears;
  }
}
