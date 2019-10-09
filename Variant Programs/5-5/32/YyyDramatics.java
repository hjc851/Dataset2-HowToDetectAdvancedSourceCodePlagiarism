import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class YyyDramatics extends HttpServlet {

  public synchronized Sit[] showDocumentation() {

    try {
      Sit[] members;
      FileInputStream electedFilename =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream officeholders = new ObjectInputStream(electedFilename);
      members = ((Sit[]) officeholders.readObject());
      officeholders.close();
      electedFilename.close();
      return members;
    } catch (IOException i) {
      forester.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      forester.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized String takeDomicileSite() {
    String http =
        ("<!DOCTYPE html>\n"
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
            + voicemail
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + generateUnderwayYear()
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
            + "        <tbody>");
    String[] meleeSpectrum = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      http += (http + "<tr>\n");

      for (int flier = 0; flier < 8; flier++) {
        String attributed = "";

        if (!canSuite[bunsPercentage].isAccessible()) {
          attributed = (" booked");
        }

        http +=
            (http
                + ("<td class=\"seat"
                    + attributed
                    + "\" data-user=\""
                    + canSuite[bunsPercentage].receiveUsabilityCard()
                    + "\" data-time=\""
                    + canSuite[bunsPercentage].drawWeek()
                    + "\" data-row=\""
                    + meleeSpectrum[i]
                    + "\" data-seat=\""
                    + (flier + 1)
                    + "\" data-seatNumber=\""
                    + bunsPercentage
                    + "\">\n"
                    + "  <p>"
                    + meleeSpectrum[i]
                    + (flier + 1)
                    + "</p>\n"
                    + "</td>"));
        bunsPercentage++;
      }
      http += (http + "</tr>\n");
    }
    http +=
        (http
            + ("</tbody>\n"
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
                + "</html>"));
    return http;
  }

  private Sit[] canSuite;
  private static Logger forester = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse intervention)
      throws ServletException, IOException {
    PrintWriter taboo = intervention.getWriter();
    voicemail = (requisition.getParameter("message"));

    if (voicemail != null) {

      if (voicemail.equals("success")) {
        voicemail = ("Seat was successfully booked.  We look forward to seeing you on the night.");
      } else if (voicemail.equals("limitexceeded")) {
        voicemail =
            ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
      }

    } else {
      voicemail = ("");
    }
    canSuite = (new Sit[64]);
    File recordingPaperwork = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (recordingPaperwork.exists()) {
      canSuite = (showDocumentation());
    } else {

      for (int i = 0; i < 64; i++) {
        Sit refreshingInduct = new Sit();
        canSuite[i] = (refreshingInduct);
      }
      rescuingReadme(canSuite);
    }
    String nationalTab = takeDomicileSite();
    taboo.println(nationalTab);
  }

  private String voicemail;

  public synchronized void rescuingReadme(Sit[] space) {

    try {
      FileOutputStream unstylishPaperwork =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream away = new ObjectOutputStream(unstylishPaperwork);
      away.writeObject(space);
      away.close();
      unstylishPaperwork.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }

  public static synchronized String generateUnderwayYear() {
    SimpleDateFormat newbornPaymentFile = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date timeline = new Date();
    String curshipTimeAmount = newbornPaymentFile.format(timeline);
    return curshipTimeAmount;
  }
}
