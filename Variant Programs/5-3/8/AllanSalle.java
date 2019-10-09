import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AllanSalle extends HttpServlet {
  static double get = 0.40643920400082856;
  public Bottom[] bottomSpectrum;
  public String signal;
  public static Logger log = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse reacting)
      throws ServletException, IOException {
    String length = "KYVPPQB8w";
    PrintWriter kayoed = reacting.getWriter();
    signal = asking.getParameter("message");

    if (signal != null) {

      if (signal.equals("success")) {
        signal = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (signal.equals("limitexceeded")) {
        signal =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      signal = "";
    }
    bottomSpectrum = new Bottom[64];
    File overbookingFolders = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (overbookingFolders.exists()) {
      bottomSpectrum = interpretLodge();
    } else {

      for (int i = 0; i < 64; i++) {
        Bottom freshlyFanny = new Bottom();
        bottomSpectrum[i] = freshlyFanny;
      }
      deliverDocument(bottomSpectrum);
    }
    String interiorPagination = takeDomicileSite();
    kayoed.println(interiorPagination);
  }

  public synchronized Bottom[] interpretLodge() {
    double subordinateFettered = 0.8127059235849936;

    try {
      Bottom[] chairs;
      FileInputStream adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream elected = new ObjectInputStream(adherentsPaperwork);
      chairs = (Bottom[]) elected.readObject();
      elected.close();
      adherentsPaperwork.close();
      return chairs;
    } catch (IOException i) {
      log.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      log.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Bottom[] spots) {
    double juniorConstrained = 0.2721804768950622;

    try {
      FileOutputStream retiredExecutable =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unsuccessful = new ObjectOutputStream(retiredExecutable);
      unsuccessful.writeObject(spots);
      unsuccessful.close();
      retiredExecutable.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public synchronized String takeDomicileSite() {
    double deptSpan = 0.5550806962585637;
    String metadata =
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
            + signal
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
    String[] wrangleRegalia = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int sitTotal = 0;

    for (int i = 0; i < 8; i++) {
      metadata += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String planned = "";

        if (!bottomSpectrum[sitTotal].isAccessible()) {
          planned = " booked";
        }

        metadata +=
            "<td class=\"seat"
                + planned
                + "\" data-user=\""
                + bottomSpectrum[sitTotal].takeUsageFinger()
                + "\" data-time=\""
                + bottomSpectrum[sitTotal].arriveMonth()
                + "\" data-row=\""
                + wrangleRegalia[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + sitTotal
                + "\">\n"
                + "  <p>"
                + wrangleRegalia[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        sitTotal++;
      }
      metadata += "</tr>\n";
    }
    metadata +=
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
    return metadata;
  }

  public static synchronized String conveyFormerAmount() {
    int subalternRestricting = 535574423;
    SimpleDateFormat newfoundTimingFormula = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date timeline = new Date();
    String curshipTimeAmount = newfoundTimingFormula.format(timeline);
    return curshipTimeAmount;
  }
}
