import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SuppTroupe extends HttpServlet {
  private Derriere[] sternArsenal;
  private String impression;
  private static Logger fisherman;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse preparedness)
      throws ServletException, IOException {
    PrintWriter unsuccessful = preparedness.getWriter();
    impression = requisition.getParameter("message");

    if (impression != null) {

      if (impression.equals("success")) {
        impression = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (impression.equals("limitexceeded")) {
        impression =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      impression = "";
    }
    sternArsenal = new Derriere[64];
    File orderingDatabase = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (orderingDatabase.exists()) {
      sternArsenal = writeDatabase();
    } else {

      for (int i = 0; i < 64; i++) {
        Derriere modernPlace = new Derriere();
        sternArsenal[i] = modernPlace;
      }
      resurrectPapers(sternArsenal);
    }
    String residenceScreen = fixInternalPaper();
    unsuccessful.println(residenceScreen);
  }

  public synchronized Derriere[] writeDatabase() {

    try {
      Derriere[] stalls;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream immigration = new ObjectInputStream(proponentsDatabase);
      stalls = (Derriere[]) immigration.readObject();
      immigration.close();
      proponentsDatabase.close();
      return stalls;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      fisherman.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Derriere[] beds) {

    try {
      FileOutputStream stunnedFolder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unfashionable = new ObjectOutputStream(stunnedFolder);
      unfashionable.writeObject(beds);
      unfashionable.close();
      stunnedFolder.close();
    } catch (IOException tipp) {
      tipp.printStackTrace();
    }
  }

  public synchronized String fixInternalPaper() {
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
            + becomeTheOpportunity()
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
    String[] rankingPortfolio = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String arrested = "";

        if (!sternArsenal[bunsPercentage].isAccessible()) {
          arrested = " booked";
        }

        parser +=
            "<td class=\"seat"
                + arrested
                + "\" data-user=\""
                + sternArsenal[bunsPercentage].goExploiterQuod()
                + "\" data-time=\""
                + sternArsenal[bunsPercentage].driveAgain()
                + "\" data-row=\""
                + rankingPortfolio[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + rankingPortfolio[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bunsPercentage++;
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

  public static synchronized String becomeTheOpportunity() {
    SimpleDateFormat unusedUpdateWording = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date notification = new Date();
    String essenceUpdateHour = unusedUpdateWording.format(notification);
    return essenceUpdateHour;
  }

  static {
    fisherman = Logger.getLogger("bensTheatre");
  }
}
