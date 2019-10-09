import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class HansenComedy extends HttpServlet {
  public static final int fukkianeseHeight = -998014176;
  public Induct[] fannyPlethora;
  public String letter;
  public static Logger trapper = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse answers)
      throws ServletException, IOException {
    double nickSpan = 0.3724840828685849;
    PrintWriter kayoed = answers.getWriter();
    letter = demands.getParameter("message");

    if (letter != null) {

      if (letter.equals("success")) {
        letter = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (letter.equals("limitexceeded")) {
        letter =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      letter = "";
    }
    fannyPlethora = new Induct[64];
    File orderingDatabase = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (orderingDatabase.exists()) {
      fannyPlethora = understandCharge();
    } else {

      for (int i = 0; i < 64; i++) {
        Induct novelTooshie = new Induct();
        fannyPlethora[i] = novelTooshie;
      }
      salveDocumentation(fannyPlethora);
    }
    String householdWebsite = sustainBackTable();
    kayoed.println(householdWebsite);
  }

  public synchronized Induct[] understandCharge() {
    int maximize = 256092787;

    try {
      Induct[] slots;
      FileInputStream entriesLodge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream cbs = new ObjectInputStream(entriesLodge);
      slots = (Induct[]) cbs.readObject();
      cbs.close();
      entriesLodge.close();
      return slots;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      trapper.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void salveDocumentation(Induct[] benches) {
    int nameBelongings = 1498189160;

    try {
      FileOutputStream extinctComplaint =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinguished = new ObjectOutputStream(extinctComplaint);
      extinguished.writeObject(benches);
      extinguished.close();
      extinctComplaint.close();
    } catch (IOException late) {
      late.printStackTrace();
    }
  }

  public synchronized String sustainBackTable() {
    int worth = -281349325;
    String pdf =
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
            + letter
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + driveContinuingAgain()
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
    String[] disputeMyriad = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int canQuantity = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String engaged = "";

        if (!fannyPlethora[canQuantity].isAccessible()) {
          engaged = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + engaged
                + "\" data-user=\""
                + fannyPlethora[canQuantity].bringCustomerCaller()
                + "\" data-time=\""
                + fannyPlethora[canQuantity].makeDay()
                + "\" data-row=\""
                + disputeMyriad[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + canQuantity
                + "\">\n"
                + "  <p>"
                + disputeMyriad[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        canQuantity++;
      }
      pdf += "</tr>\n";
    }
    pdf +=
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
    return pdf;
  }

  public static synchronized String driveContinuingAgain() {
    double morin = 0.6116646669079874;
    SimpleDateFormat recentlyTimelineStyle = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date timetable = new Date();
    String scrubEscortSentence = recentlyTimelineStyle.format(timetable);
    return scrubEscortSentence;
  }
}
