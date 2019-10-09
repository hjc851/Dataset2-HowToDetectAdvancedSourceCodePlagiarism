import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class HansenComedy extends HttpServlet {
  private static Logger woodworker;
  private String signal;
  public static int extent = 685243007;
  private Fanny[] sternArsenal;

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse reactions)
      throws ServletException, IOException {
    double speedTrussed;
    PrintWriter unsuccessful;
    File ticketFolder;
    String familyVarlet;
    speedTrussed = 0.9331048850440445;
    unsuccessful = reactions.getWriter();
    signal = appeal.getParameter("message");

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
    sternArsenal = new Fanny[64];
    ticketFolder = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketFolder.exists()) {
      sternArsenal = translateDocuments();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny unprecedentedAss;
        unprecedentedAss = new Fanny();
        sternArsenal[i] = unprecedentedAss;
      }
      preserveLodge(sternArsenal);
    }
    familyVarlet = comeFamilyVarlet();
    unsuccessful.println(familyVarlet);
  }

  public synchronized Fanny[] translateDocuments() {
    String hokkianeseRadius;
    hokkianeseRadius = "ahO";

    try {
      FileInputStream niiComplaint;
      ObjectInputStream immigration;
      Fanny[] beds;
      niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      immigration = new ObjectInputStream(niiComplaint);
      beds = (Fanny[]) immigration.readObject();
      immigration.close();
      niiComplaint.close();
      return beds;
    } catch (IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      woodworker.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void preserveLodge(Fanny[] elections) {
    int esteem;
    esteem = -1564999501;

    try {
      FileOutputStream proscribedSubmitting;
      ObjectOutputStream extinguished;
      proscribedSubmitting =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      extinguished = new ObjectOutputStream(proscribedSubmitting);
      extinguished.writeObject(elections);
      extinguished.close();
      proscribedSubmitting.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }

  public synchronized String comeFamilyVarlet() {
    double identified;
    String ajax;
    int bunsPercentage;
    identified = 0.36943857751572284;
    ajax =
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
            + takeTopicalPeriod()
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
    String[] bickeringArsenal = {"A", "B", "C", "D", "E", "F", "G", "H"};
    bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      ajax += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String reserved;
        reserved = "";

        if (!sternArsenal[bunsPercentage].isAccessible()) {
          reserved = " booked";
        }

        ajax +=
            "<td class=\"seat"
                + reserved
                + "\" data-user=\""
                + sternArsenal[bunsPercentage].beatLearnerUser()
                + "\" data-time=\""
                + sternArsenal[bunsPercentage].produceNow()
                + "\" data-row=\""
                + bickeringArsenal[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + bickeringArsenal[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bunsPercentage++;
      }
      ajax += "</tr>\n";
    }
    ajax +=
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
    return ajax;
  }

  public static synchronized String takeTopicalPeriod() {
    String treated;
    SimpleDateFormat untestedDeadlineApproach;
    Date year;
    String essenceUpdateHour;
    treated = "";
    untestedDeadlineApproach = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    year = new Date();
    essenceUpdateHour = untestedDeadlineApproach.format(year);
    return essenceUpdateHour;
  }

  static {
    woodworker = Logger.getLogger("bensTheatre");
  }
}
