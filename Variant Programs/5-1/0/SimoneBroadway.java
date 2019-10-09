import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SimoneBroadway extends HttpServlet {
  private Prat[] bunsNumber;
  private String thing;
  private static Logger surveyor = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest petitioning, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    PrintWriter kayoed = rebuttal.getWriter();
    thing = petitioning.getParameter("message");

    if (thing != null) {

      if (thing.equals("success")) {
        thing = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (thing.equals("limitexceeded")) {
        thing =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      thing = "";
    }
    bunsNumber = new Prat[64];
    File orderingDatabase = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (orderingDatabase.exists()) {
      bunsNumber = takeDocument();
    } else {

      for (int i = 0; i < 64; i++) {
        Prat earlyCan = new Prat();
        bunsNumber[i] = earlyCan;
      }
      safeguardArchiving(bunsNumber);
    }
    String mansionAnnexes = developApartmentLayout();
    kayoed.println(mansionAnnexes);
  }

  public Prat[] takeDocument() {

    try {
      Prat[] elections;
      FileInputStream adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream entries = new ObjectInputStream(adherentsPaperwork);
      elections = (Prat[]) entries.readObject();
      entries.close();
      adherentsPaperwork.close();
      return elections;
    } catch (IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      surveyor.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void safeguardArchiving(Prat[] positions) {

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream stunned = new ObjectOutputStream(outgoingArchives);
      stunned.writeObject(positions);
      stunned.close();
      outgoingArchives.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }

  public String developApartmentLayout() {
    String url =
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
            + thing
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + developPreviousHour()
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
    String[] rackSelection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int hindquartersNumerous = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String counted = "";

        if (!bunsNumber[hindquartersNumerous].isAccessible()) {
          counted = " booked";
        }

        url +=
            "<td class=\"seat"
                + counted
                + "\" data-user=\""
                + bunsNumber[hindquartersNumerous].produceWearerMap()
                + "\" data-time=\""
                + bunsNumber[hindquartersNumerous].havePeriods()
                + "\" data-row=\""
                + rackSelection[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + hindquartersNumerous
                + "\">\n"
                + "  <p>"
                + rackSelection[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        hindquartersNumerous++;
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

  public static String developPreviousHour() {
    SimpleDateFormat freshlyScheduledSchema = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date timeline = new Date();
    String underbredCalendarDay = freshlyScheduledSchema.format(timeline);
    return underbredCalendarDay;
  }
}
