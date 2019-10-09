import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class WarwickPlayhouses extends HttpServlet {

  public synchronized String arriveInteriorPagination() {
    String browser;
    int backsideNumeral;
    browser =
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
            + messenger
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
    String[] rackSelection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    backsideNumeral = 0;

    for (int i = 0; i < 8; i++) {
      browser += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String purchased;
        purchased = "";

        if (!backsideAssortment[backsideNumeral].isAccessible()) {
          purchased = " booked";
        }

        browser +=
            "<td class=\"seat"
                + purchased
                + "\" data-user=\""
                + backsideAssortment[backsideNumeral].arriveClientIdentifying()
                + "\" data-time=\""
                + backsideAssortment[backsideNumeral].receiveMoment()
                + "\" data-row=\""
                + rackSelection[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + backsideNumeral
                + "\">\n"
                + "  <p>"
                + rackSelection[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        backsideNumeral++;
      }
      browser += "</tr>\n";
    }
    browser +=
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
    return browser;
  }

  private Fanny[] backsideAssortment = null;

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse answers)
      throws ServletException, IOException {
    PrintWriter exterior;
    File registerArchiving;
    String centralAddendum;
    exterior = answers.getWriter();
    messenger = application.getParameter("message");

    if (messenger != null) {

      if (messenger.equals("success")) {
        messenger = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (messenger.equals("limitexceeded")) {
        messenger =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      messenger = "";
    }
    backsideAssortment = new Fanny[64];
    registerArchiving = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (registerArchiving.exists()) {
      backsideAssortment = writtenFilename();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny otherButt;
        otherButt = new Fanny();
        backsideAssortment[i] = otherButt;
      }
      redeemDocuments(backsideAssortment);
    }
    centralAddendum = arriveInteriorPagination();
    exterior.println(centralAddendum);
  }

  private static Logger recording = Logger.getLogger("bensTheatre");

  public synchronized Fanny[] writtenFilename() {

    try {
      FileInputStream detailsSubmitted;
      ObjectInputStream without;
      Fanny[] positions = null;
      detailsSubmitted =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      without = new ObjectInputStream(detailsSubmitted);
      positions = (Fanny[]) without.readObject();
      without.close();
      detailsSubmitted.close();
      return positions;
    } catch (IOException i) {
      recording.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      recording.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  private String messenger = null;

  public synchronized void redeemDocuments(Fanny[] passengers) {

    try {
      FileOutputStream impermissibleArchiving;
      ObjectOutputStream taboo;
      impermissibleArchiving =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      taboo = new ObjectOutputStream(impermissibleArchiving);
      taboo.writeObject(passengers);
      taboo.close();
      impermissibleArchiving.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public static synchronized String startPresentlyMinutes() {
    SimpleDateFormat greenReceiptConfiguration;
    Date deadlines;
    String muttEngagementClip;
    greenReceiptConfiguration = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    deadlines = new Date();
    muttEngagementClip = greenReceiptConfiguration.format(deadlines);
    return muttEngagementClip;
  }
}
