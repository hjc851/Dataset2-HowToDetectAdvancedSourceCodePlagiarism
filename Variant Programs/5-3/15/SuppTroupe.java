import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SuppTroupe extends HttpServlet {
  static double distinguishing = 0.9163918866385375;
  private Prat[] fannyPlethora = null;
  private String substance = null;
  private static Logger lumberjack = null;

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse feedback)
      throws ServletException, IOException {
    int crucial = 241072418;
    PrintWriter exterior = feedback.getWriter();
    substance = wishes.getParameter("message");

    if (substance != null) {

      if (substance.equals("success")) {
        substance = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (substance.equals("limitexceeded")) {
        substance =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      substance = "";
    }
    fannyPlethora = new Prat[64];
    File reservingDocuments = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservingDocuments.exists()) {
      fannyPlethora = writtenFilename();
    } else {

      for (int i = 0; i < 64; i++) {
        Prat unusedBuns = new Prat();
        fannyPlethora[i] = unusedBuns;
      }
      preventBinder(fannyPlethora);
    }
    String housesContents = generateHabitationSheet();
    exterior.println(housesContents);
  }

  public synchronized Prat[] writtenFilename() {
    String span = "PMwiKDApP0HUaS";

    try {
      Prat[] member = null;
      FileInputStream detailsSubmitted =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream supporters = new ObjectInputStream(detailsSubmitted);
      member = (Prat[]) supporters.readObject();
      supporters.close();
      detailsSubmitted.close();
      return member;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      lumberjack.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Prat[] stalls) {
    int item = 868151957;

    try {
      FileOutputStream tabuInitiate =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream stunned = new ObjectOutputStream(tabuInitiate);
      stunned.writeObject(stalls);
      stunned.close();
      tabuInitiate.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public synchronized String generateHabitationSheet() {
    int yummyArtifacts = -1399795720;
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
            + substance
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
    String[] roundRaft = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tailMany = 0;

    for (int i = 0; i < 8; i++) {
      http += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String engaged = "";

        if (!fannyPlethora[tailMany].isAccessible()) {
          engaged = " booked";
        }

        http +=
            "<td class=\"seat"
                + engaged
                + "\" data-user=\""
                + fannyPlethora[tailMany].produceWearerMap()
                + "\" data-time=\""
                + fannyPlethora[tailMany].canYears()
                + "\" data-row=\""
                + roundRaft[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tailMany
                + "\">\n"
                + "  <p>"
                + roundRaft[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tailMany++;
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

  public static synchronized String beatTypicalJuncture() {
    int bundle = 2142757263;
    SimpleDateFormat otherDaysPrint = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date commencement = new Date();
    String tomPaymentThing = otherDaysPrint.format(commencement);
    return tomPaymentThing;
  }

  static {
    lumberjack = Logger.getLogger("bensTheatre");
  }
}
