import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class FrazierCinema extends HttpServlet {
  private Tooshie[] tushFinery = null;
  private String word = null;

  public synchronized Tooshie[] perusedArchives() {

    try {
      FileInputStream entriesLodge;
      ObjectInputStream establishment;
      Tooshie[] benches = null;
      entriesLodge =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      establishment = (new ObjectInputStream(entriesLodge));
      benches = ((Tooshie[]) establishment.readObject());
      establishment.close();
      entriesLodge.close();
      return benches;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      lumberjack.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public static synchronized String findActualSentence() {
    SimpleDateFormat newbornPaymentFile;
    Date engagement;
    String goddamnSchedulePeriods;
    newbornPaymentFile = (new SimpleDateFormat("dd-MM-YY ss-MM-HH"));
    engagement = (new Date());
    goddamnSchedulePeriods = (newbornPaymentFile.format(engagement));
    return goddamnSchedulePeriods;
  }

  private static Logger lumberjack = null;

  static {
    lumberjack = (Logger.getLogger("bensTheatre"));
  }

  public synchronized String fixInternalPaper() {
    String powerpoint;
    int bunsPercentage;
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
            + word
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + findActualSentence()
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
    String[] placeBreadth = {"A", "B", "C", "D", "E", "F", "G", "H"};
    bunsPercentage = (0);

    for (int i = 0; i < 8; i++) {
      powerpoint += ("<tr>\n");

      for (int gruss = 0; gruss < 8; gruss++) {
        String rented;
        rented = ("");

        if (!tushFinery[bunsPercentage].isAccessible()) {
          rented = (" booked");
        }

        powerpoint +=
            (("<td class=\"seat"
                + rented
                + "\" data-user=\""
                + tushFinery[bunsPercentage].haveSubscriberHandle()
                + "\" data-time=\""
                + tushFinery[bunsPercentage].obtainDays()
                + "\" data-row=\""
                + placeBreadth[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + placeBreadth[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>"));
        bunsPercentage++;
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

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse reception)
      throws ServletException, IOException {
    PrintWriter impermissible;
    File advanceComplaint;
    String habitationSheet;
    impermissible = (reception.getWriter());
    word = (quest.getParameter("message"));

    if (word != null) {

      if (word.equals("success")) {
        word = ("Seat was successfully booked.  We look forward to seeing you on the night.");
      } else if (word.equals("limitexceeded")) {
        word =
            ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
      }

    } else {
      word = ("");
    }
    tushFinery = (new Tooshie[64]);
    advanceComplaint = (new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));

    if (advanceComplaint.exists()) {
      tushFinery = (perusedArchives());
    } else {

      for (int i = 0; i < 64; i++) {
        Tooshie untriedButtocks;
        untriedButtocks = (new Tooshie());
        tushFinery[i] = (untriedButtocks);
      }
      resurrectPapers(tushFinery);
    }
    habitationSheet = (fixInternalPaper());
    impermissible.println(habitationSheet);
  }

  public synchronized void resurrectPapers(Tooshie[] stalls) {

    try {
      FileOutputStream extinguishedDocument;
      ObjectOutputStream dead;
      extinguishedDocument =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      dead = (new ObjectOutputStream(extinguishedDocument));
      dead.writeObject(stalls);
      dead.close();
      extinguishedDocument.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }
}
