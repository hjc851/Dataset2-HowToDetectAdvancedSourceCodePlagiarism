import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class WarwickPlayhouses extends HttpServlet {
  private Hindquarters[] buttMix;
  private String signals;
  private static Logger recorder = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest complaint, HttpServletResponse replies)
      throws ServletException, IOException {
    PrintWriter outgoing = replies.getWriter();
    signals = complaint.getParameter("message");

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
    buttMix = new Hindquarters[64];
    File overbookingFolders = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (overbookingFolders.exists()) {
      buttMix = reciteSubmitting();
    } else {

      for (int i = 0; i < 64; i++) {
        Hindquarters unusedBuns = new Hindquarters();
        buttMix[i] = unusedBuns;
      }
      savingsFilename(buttMix);
    }
    String habitationSheet = developApartmentLayout();
    outgoing.println(habitationSheet);
  }

  public Hindquarters[] reciteSubmitting() {

    try {
      Hindquarters[] tickets;
      FileInputStream nsisApplication =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream advocates = new ObjectInputStream(nsisApplication);
      tickets = (Hindquarters[]) advocates.readObject();
      advocates.close();
      nsisApplication.close();
      return tickets;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      recorder.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void savingsFilename(Hindquarters[] stools) {

    try {
      FileOutputStream backBinder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream stunned = new ObjectOutputStream(backBinder);
      stunned.writeObject(stools);
      stunned.close();
      backBinder.close();
    } catch (IOException post) {
      post.printStackTrace();
    }
  }

  public String developApartmentLayout() {
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
            + signals
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + bringOngoingMeter()
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
    String[] wordsFinery = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tooshieMultiple = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String leased = "";

        if (!buttMix[tooshieMultiple].isAccessible()) {
          leased = " booked";
        }

        parser +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + buttMix[tooshieMultiple].startDeveloperPicture()
                + "\" data-time=\""
                + buttMix[tooshieMultiple].startMinutes()
                + "\" data-row=\""
                + wordsFinery[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tooshieMultiple
                + "\">\n"
                + "  <p>"
                + wordsFinery[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tooshieMultiple++;
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

  public static String bringOngoingMeter() {
    SimpleDateFormat babyUpdatedCompress = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date commencement = new Date();
    String underbredCalendarDay = babyUpdatedCompress.format(commencement);
    return underbredCalendarDay;
  }
}
