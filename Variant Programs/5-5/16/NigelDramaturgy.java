import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class NigelDramaturgy extends HttpServlet {
  private Invest[] sternArsenal;

  public static synchronized String goPrevailingClock() {
    SimpleDateFormat novelDueModel;
    Date update;
    String heartCommencementNow;
    novelDueModel = (new SimpleDateFormat("dd-MM-YY ss-MM-HH"));
    update = (new Date());
    heartCommencementNow = (novelDueModel.format(update));
    return heartCommencementNow;
  }

  public synchronized String comeFamilyVarlet() {
    String powerpoint;
    int posteriorAct;
    powerpoint =
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
            + voicemail
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + goPrevailingClock()
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
    String[] feudMultiple = {"A", "B", "C", "D", "E", "F", "G", "H"};
    posteriorAct = (0);

    for (int i = 0; i < 8; i++) {
      powerpoint += ("<tr>\n");

      for (int flier = 0; flier < 8; flier++) {
        String reported;
        reported = ("");

        if (!sternArsenal[posteriorAct].isAccessible()) {
          reported = (" booked");
        }

        powerpoint +=
            (("<td class=\"seat"
                + reported
                + "\" data-user=\""
                + sternArsenal[posteriorAct].fixPatientNerfling()
                + "\" data-time=\""
                + sternArsenal[posteriorAct].driveAgain()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + posteriorAct
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>"));
        posteriorAct++;
      }
      powerpoint += ("</tr>\n");
    }
    powerpoint +=
        (("</tbody>\n"
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
    return powerpoint;
  }

  private static Logger woodcutter = getLogger("bensTheatre");
  private String voicemail;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse responsive)
      throws ServletException, IOException {
    PrintWriter prohibited;
    File rearrestDocket;
    String backTable;
    prohibited = (responsive.getWriter());
    voicemail = (petition.getParameter("message"));

    if (voicemail != null) synx56();
    else synx57();
    sternArsenal = (new Invest[64]);
    rearrestDocket = (new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));

    if (rearrestDocket.exists()) synx58();
    else synx59();
    backTable = (comeFamilyVarlet());
    prohibited.println(backTable);
  }

  public synchronized Invest[] wrotePapers() {

    try {
      FileInputStream electedFilename;
      ObjectInputStream entries;
      Invest[] elects;
      electedFilename =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      entries = (new ObjectInputStream(electedFilename));
      elects = ((Invest[]) entries.readObject());
      entries.close();
      electedFilename.close();
      return elects;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      woodcutter.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Invest[] spots) {

    try {
      FileOutputStream proscribedSubmitting;
      ObjectOutputStream taboo;
      proscribedSubmitting =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      taboo = (new ObjectOutputStream(proscribedSubmitting));
      taboo.writeObject(spots);
      taboo.close();
      proscribedSubmitting.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }

  private synchronized void synx56() throws ServletException, IOException {

    if (voicemail.equals("success")) {
      voicemail = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (voicemail.equals("limitexceeded")) {
      voicemail =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx57() throws ServletException, IOException {
    voicemail = ("");
  }

  private synchronized void synx58() throws ServletException, IOException {
    sternArsenal = (wrotePapers());
  }

  private synchronized void synx59() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Invest radicalPosterior;
      radicalPosterior = (new Invest());
      sternArsenal[i] = (radicalPosterior);
    }
    avertPaperwork(sternArsenal);
  }
}
