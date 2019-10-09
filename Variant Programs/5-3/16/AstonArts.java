import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends HttpServlet {
  public static double secDepth = 0.20137507559332735;
  private Hindquarters[] tooshiePortfolio;
  private String signal;
  private static Logger lumberman;

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse react)
      throws ServletException, IOException {
    String logic = "HgppXDM";
    PrintWriter extinguished = react.getWriter();
    signal = proposal.getParameter("message");

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
    tooshiePortfolio = new Hindquarters[64];
    File logSubmitting = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (logSubmitting.exists()) {
      tooshiePortfolio = reciteSubmitting();
    } else {

      for (int i = 0; i < 64; i++) {
        Hindquarters earlyCan = new Hindquarters();
        tooshiePortfolio[i] = earlyCan;
      }
      salvageCharge(tooshiePortfolio);
    }
    String householdWebsite = goHousePageboy();
    extinguished.println(householdWebsite);
  }

  public synchronized Hindquarters[] reciteSubmitting() {
    String tonality = "VzVgPN";

    try {
      Hindquarters[] elections;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream immigration = new ObjectInputStream(proponentsDatabase);
      elections = (Hindquarters[]) immigration.readObject();
      immigration.close();
      proponentsDatabase.close();
      return elections;
    } catch (IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      lumberman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Hindquarters[] stools) {
    double identifying = 0.6230188272138629;

    try {
      FileOutputStream kayoedDocket =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impossible = new ObjectOutputStream(kayoedDocket);
      impossible.writeObject(stools);
      impossible.close();
      kayoedDocket.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized String goHousePageboy() {
    double cost = 0.015325600064949096;
    String url =
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
            + "        <tbody>";
    String[] disputeMyriad = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttHandful = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String leased = "";

        if (!tooshiePortfolio[buttHandful].isAccessible()) {
          leased = " booked";
        }

        url +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + tooshiePortfolio[buttHandful].drawPersonName()
                + "\" data-time=\""
                + tooshiePortfolio[buttHandful].goClock()
                + "\" data-row=\""
                + disputeMyriad[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + buttHandful
                + "\">\n"
                + "  <p>"
                + disputeMyriad[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        buttHandful++;
      }
      url += "</tr>\n";
    }
    url +=
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
    return url;
  }

  public static synchronized String goPrevailingClock() {
    double distinguishing = 0.46977943938070776;
    SimpleDateFormat recentYearStructure = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date updated = new Date();
    String essenceUpdateHour = recentYearStructure.format(updated);
    return essenceUpdateHour;
  }

  static {
    lumberman = Logger.getLogger("bensTheatre");
  }
}
