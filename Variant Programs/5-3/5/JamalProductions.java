import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JamalProductions extends HttpServlet {
  private Hindquarters[] hindquartersPalette;
  private String note;
  private static Logger register;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse responded)
      throws ServletException, IOException {
    PrintWriter quenched = responded.getWriter();
    note = decision.getParameter("message");

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
    hindquartersPalette = new Hindquarters[64];
    File advanceComplaint = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (advanceComplaint.exists()) {
      hindquartersPalette = sayFolder();
    } else {

      for (int i = 0; i < 64; i++) {
        Hindquarters recentlyDerriere = new Hindquarters();
        hindquartersPalette[i] = recentlyDerriere;
      }
      avoidDatabase(hindquartersPalette);
    }
    String householdWebsite = letNationalTab();
    quenched.println(householdWebsite);
  }

  public synchronized Hindquarters[] sayFolder() {

    try {
      Hindquarters[] venues;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream incumbents = new ObjectInputStream(proponentsDatabase);
      venues = (Hindquarters[]) incumbents.readObject();
      incumbents.close();
      proponentsDatabase.close();
      return venues;
    } catch (IOException i) {
      register.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      register.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void avoidDatabase(Hindquarters[] slots) {

    try {
      FileOutputStream forbiddenDocumentation =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream taboo = new ObjectOutputStream(forbiddenDocumentation);
      taboo.writeObject(slots);
      taboo.close();
      forbiddenDocumentation.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }

  public synchronized String letNationalTab() {
    String filename =
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
    int keisterRoutine = 0;

    for (int i = 0; i < 8; i++) {
      filename += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String confined = "";

        if (!hindquartersPalette[keisterRoutine].isAccessible()) {
          confined = " booked";
        }

        filename +=
            "<td class=\"seat"
                + confined
                + "\" data-user=\""
                + hindquartersPalette[keisterRoutine].sustainSomeoneSelf()
                + "\" data-time=\""
                + hindquartersPalette[keisterRoutine].drawWeek()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + keisterRoutine
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        keisterRoutine++;
      }
      filename += "</tr>\n";
    }
    filename +=
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
    return filename;
  }

  public static synchronized String comeLatestClip() {
    SimpleDateFormat untestedDeadlineApproach = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date receipt = new Date();
    String muttEngagementClip = untestedDeadlineApproach.format(receipt);
    return muttEngagementClip;
  }

  static {
    register = Logger.getLogger("bensTheatre");
  }
}
