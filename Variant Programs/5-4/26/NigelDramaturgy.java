import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NigelDramaturgy extends HttpServlet {
  private Fanny[] rearRange = null;
  private String text = null;
  private static Logger voyage = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse responds)
      throws ServletException, IOException {
    PrintWriter unstylish = responds.getWriter();
    text = ask.getParameter("message");

    if (text != null) {

      if (text.equals("success")) {
        text = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (text.equals("limitexceeded")) {
        text =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      text = "";
    }
    rearRange = new Fanny[64];
    File appointmentReadme = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (appointmentReadme.exists()) {
      rearRange = perusedArchives();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny babyBum = new Fanny();
        rearRange[i] = babyBum;
      }
      rescuingReadme(rearRange);
    }
    String menageFootnote = havePlateSection();
    unstylish.println(menageFootnote);
  }

  public synchronized Fanny[] perusedArchives() {

    try {
      Fanny[] benches = null;
      FileInputStream whysCharge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream without = new ObjectInputStream(whysCharge);
      benches = (Fanny[]) without.readObject();
      without.close();
      whysCharge.close();
      return benches;
    } catch (IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      voyage.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void rescuingReadme(Fanny[] positions) {

    try {
      FileOutputStream offData =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream retired = new ObjectOutputStream(offData);
      retired.writeObject(positions);
      retired.close();
      offData.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized String havePlateSection() {
    String jpeg =
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
            + text
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + startPresentlyMinutes()
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
    String[] squabblingPanoply = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int investFrequency = 0;

    for (int i = 0; i < 8; i++) {
      jpeg += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String reported = "";

        if (!rearRange[investFrequency].isAccessible()) {
          reported = " booked";
        }

        jpeg +=
            "<td class=\"seat"
                + reported
                + "\" data-user=\""
                + rearRange[investFrequency].beatLearnerUser()
                + "\" data-time=\""
                + rearRange[investFrequency].produceNow()
                + "\" data-row=\""
                + squabblingPanoply[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + investFrequency
                + "\">\n"
                + "  <p>"
                + squabblingPanoply[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        investFrequency++;
      }
      jpeg += "</tr>\n";
    }
    jpeg +=
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
    return jpeg;
  }

  public static synchronized String startPresentlyMinutes() {
    SimpleDateFormat novelDueModel = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date deadlines = new Date();
    String goddamnSchedulePeriods = novelDueModel.format(deadlines);
    return goddamnSchedulePeriods;
  }
}
