import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class HansenComedy extends HttpServlet {
  public static Logger woodsman;
  public String speech;
  public Prat[] behindPanoply;

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    PrintWriter unsuccessful;
    File leasingFilename;
    String placeText;
    unsuccessful = (rejoinder.getWriter());
    speech = (insistence.getParameter("message"));

    if (speech != null) synx41();
    else synx42();
    behindPanoply = (new Prat[64]);
    leasingFilename = (new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));

    if (leasingFilename.exists()) synx43();
    else synx44();
    placeText = (catchDomesticSummary());
    unsuccessful.println(placeText);
  }

  public synchronized Prat[] interpretLodge() {

    try {
      FileInputStream niiComplaint;
      ObjectInputStream whys;
      Prat[] tickets;
      niiComplaint =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      whys = (new ObjectInputStream(niiComplaint));
      tickets = ((Prat[]) whys.readObject());
      whys.close();
      niiComplaint.close();
      return tickets;
    } catch (IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      woodsman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void reduceApplication(Prat[] positions) {

    try {
      FileOutputStream proscribedSubmitting;
      ObjectOutputStream kayoed;
      proscribedSubmitting =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      kayoed = (new ObjectOutputStream(proscribedSubmitting));
      kayoed.writeObject(positions);
      kayoed.close();
      proscribedSubmitting.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }

  public synchronized String catchDomesticSummary() {
    String url;
    int rumpCount;
    url =
        (("<!DOCTYPE html>\n"
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
            + speech
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + arriveFlowMonth()
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
            + "        <tbody>"));
    String[] squabbleVariety = {"A", "B", "C", "D", "E", "F", "G", "H"};
    rumpCount = (0);

    for (int i = 0; i < 8; i++) {
      url += (url + "<tr>\n");

      for (int gruss = 0; gruss < 8; gruss++) {
        String arrested;
        arrested = ("");

        if (!behindPanoply[rumpCount].isAccessible()) {
          arrested = (" booked");
        }

        url +=
            (url
                + ("<td class=\"seat"
                    + arrested
                    + "\" data-user=\""
                    + behindPanoply[rumpCount].bringCustomerCaller()
                    + "\" data-time=\""
                    + behindPanoply[rumpCount].generateYear()
                    + "\" data-row=\""
                    + squabbleVariety[i]
                    + "\" data-seat=\""
                    + (gruss + 1)
                    + "\" data-seatNumber=\""
                    + rumpCount
                    + "\">\n"
                    + "  <p>"
                    + squabbleVariety[i]
                    + (gruss + 1)
                    + "</p>\n"
                    + "</td>"));
        rumpCount++;
      }
      url += (url + "</tr>\n");
    }
    url +=
        (url
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
    return url;
  }

  public static synchronized String arriveFlowMonth() {
    SimpleDateFormat recentYearStructure;
    Date updated;
    String scrubEscortSentence;
    recentYearStructure = (new SimpleDateFormat("dd-MM-YY ss-MM-HH"));
    updated = (new Date());
    scrubEscortSentence = (recentYearStructure.format(updated));
    return scrubEscortSentence;
  }

  static {
    woodsman = (getLogger("bensTheatre"));
  }

  private synchronized void synx41() throws ServletException, IOException {

    if (speech.equals("success")) {
      speech = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (speech.equals("limitexceeded")) {
      speech =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx42() throws ServletException, IOException {
    speech = ("");
  }

  private synchronized void synx43() throws ServletException, IOException {
    behindPanoply = (interpretLodge());
  }

  private synchronized void synx44() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Prat unprecedentedAss;
      unprecedentedAss = (new Prat());
      behindPanoply[i] = (unprecedentedAss);
    }
    reduceApplication(behindPanoply);
  }
}
