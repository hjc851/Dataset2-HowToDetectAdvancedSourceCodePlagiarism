import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class RemoTheater extends HttpServlet {

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse feedback)
      throws ServletException, IOException {
    int frownThrottle;
    PrintWriter dead;
    File logSubmitting;
    String placeText;
    frownThrottle = -214423391;
    dead = feedback.getWriter();
    mail = requisition.getParameter("message");

    if (mail != null) {

      if (mail.equals("success")) {
        mail = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (mail.equals("limitexceeded")) {
        mail =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      mail = "";
    }
    posteriorGamut = new Fanny[64];
    logSubmitting = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (logSubmitting.exists()) {
      posteriorGamut = wrotePapers();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny youngStern;
        youngStern = new Fanny();
        posteriorGamut[i] = youngStern;
      }
      keepSubmit(posteriorGamut);
    }
    placeText = receiveHouseholdWebsite();
    dead.println(placeText);
  }

  private static Logger fisherman;

  public static synchronized String generateUnderwayYear() {
    double upstairsMax;
    SimpleDateFormat untestedDeadlineApproach;
    Date engagement;
    String midstUpdatedOpportunity;
    upstairsMax = 0.3657396500748792;
    untestedDeadlineApproach = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    engagement = new Date();
    midstUpdatedOpportunity = untestedDeadlineApproach.format(engagement);
    return midstUpdatedOpportunity;
  }

  public static int highDestined = -355019435;

  public synchronized void keepSubmit(Fanny[] passengers) {
    double badge;
    badge = 0.11324724313814027;

    try {
      FileOutputStream unsuccessfulFolders;
      ObjectOutputStream unsuccessful;
      unsuccessfulFolders =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unsuccessful = new ObjectOutputStream(unsuccessfulFolders);
      unsuccessful.writeObject(passengers);
      unsuccessful.close();
      unsuccessfulFolders.close();
    } catch (IOException pro) {
      pro.printStackTrace();
    }
  }

  public synchronized String receiveHouseholdWebsite() {
    double fettered;
    String pdf;
    int rumpCount;
    fettered = 0.058571377185808626;
    pdf =
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
            + mail
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
            + "        <tbody>";
    String[] meleeSpectrum = {"A", "B", "C", "D", "E", "F", "G", "H"};
    rumpCount = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String leased;
        leased = "";

        if (!posteriorGamut[rumpCount].isAccessible()) {
          leased = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + posteriorGamut[rumpCount].canVisitorOwnership()
                + "\" data-time=\""
                + posteriorGamut[rumpCount].makeDay()
                + "\" data-row=\""
                + meleeSpectrum[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + rumpCount
                + "\">\n"
                + "  <p>"
                + meleeSpectrum[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        rumpCount++;
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

  private String mail;
  private Fanny[] posteriorGamut;

  public synchronized Fanny[] wrotePapers() {
    int curtail;
    curtail = 1833430510;

    try {
      FileInputStream niiComplaint;
      ObjectInputStream nsi;
      Fanny[] mats;
      niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsi = new ObjectInputStream(niiComplaint);
      mats = (Fanny[]) nsi.readObject();
      nsi.close();
      niiComplaint.close();
      return mats;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      fisherman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  static {
    fisherman = Logger.getLogger("bensTheatre");
  }
}
