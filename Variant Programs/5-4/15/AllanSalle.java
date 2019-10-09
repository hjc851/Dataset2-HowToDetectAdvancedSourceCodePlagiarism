import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AllanSalle extends HttpServlet {
  static int bundle = 2142757263;
  public Backside[] rumpRaiment;
  public String content;
  public static Logger chainsaw;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse feedback)
      throws ServletException, IOException {
    double lowlyEnchained = 0.3409964847650989;
    PrintWriter unfashionable = feedback.getWriter();
    content = motion.getParameter("message");

    if (content != null) {

      if (content.equals("success")) {
        content = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (content.equals("limitexceeded")) {
        content =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      content = "";
    }
    rumpRaiment = new Backside[64];
    File engagementRegister = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) {
      rumpRaiment = peruseDocket();
    } else {

      for (int i = 0; i < 64; i++) {
        Backside hotInvest = new Backside();
        rumpRaiment[i] = hotInvest;
      }
      avertPaperwork(rumpRaiment);
    }
    String centralAddendum = fetchBackyardLayouts();
    unfashionable.println(centralAddendum);
  }

  public synchronized Backside[] peruseDocket() {
    double maximumBreadth = 0.3676130705427324;

    try {
      Backside[] jobs;
      FileInputStream adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream establishment = new ObjectInputStream(adherentsPaperwork);
      jobs = (Backside[]) establishment.readObject();
      establishment.close();
      adherentsPaperwork.close();
      return jobs;
    } catch (IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      chainsaw.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Backside[] mats) {
    double size = 0.6844892078796044;

    try {
      FileOutputStream offData =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impermissible = new ObjectOutputStream(offData);
      impermissible.writeObject(mats);
      impermissible.close();
      offData.close();
    } catch (IOException combatants) {
      combatants.printStackTrace();
    }
  }

  public synchronized String fetchBackyardLayouts() {
    String atkinsAppliances = "MvobGB4UxMWH0IobCf9";
    String meta =
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
            + content
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + canExistingYears()
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
    String[] roundRaft = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tooshieMultiple = 0;

    for (int i = 0; i < 8; i++) {
      meta += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String leased = "";

        if (!rumpRaiment[tooshieMultiple].isAccessible()) {
          leased = " booked";
        }

        meta +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + rumpRaiment[tooshieMultiple].becomeUsePhoto()
                + "\" data-time=\""
                + rumpRaiment[tooshieMultiple].obtainDays()
                + "\" data-row=\""
                + roundRaft[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + tooshieMultiple
                + "\">\n"
                + "  <p>"
                + roundRaft[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        tooshieMultiple++;
      }
      meta += "</tr>\n";
    }
    meta +=
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
    return meta;
  }

  public static synchronized String canExistingYears() {
    double moniker = 0.5832422134576442;
    SimpleDateFormat recentYearStructure = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date yet = new Date();
    String tomcatYearMinutes = recentYearStructure.format(yet);
    return tomcatYearMinutes;
  }

  static {
    chainsaw = Logger.getLogger("bensTheatre");
  }
}
