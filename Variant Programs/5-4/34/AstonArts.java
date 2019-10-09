import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends javax.servlet.http.HttpServlet {
  private Prat[] sternArsenal;
  private java.lang.String substance;
  private static java.util.logging.Logger voyage;

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse reaction)
      throws ServletException, IOException {
    java.io.PrintWriter down = reaction.getWriter();
    substance = suggestion.getParameter("message");

    if (substance != null) synx76();
    else synx77();
    sternArsenal = new Prat[64];
    java.io.File engagementRegister =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) synx78();
    else synx79();
    java.lang.String abodeWebpage = driveCottageFolio();
    down.println(abodeWebpage);
  }

  public synchronized Prat[] recordExecutable() {

    try {
      Prat[] elections;
      java.io.FileInputStream nsiPapers =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream immigration = new java.io.ObjectInputStream(nsiPapers);
      elections = (Prat[]) immigration.readObject();
      immigration.close();
      nsiPapers.close();
      return elections;
    } catch (java.io.IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      voyage.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void reduceApplication(Prat[] chairs) {

    try {
      java.io.FileOutputStream deadSubmit =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream dead = new java.io.ObjectOutputStream(deadSubmit);
      dead.writeObject(chairs);
      dead.close();
      deadSubmit.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  public synchronized java.lang.String driveCottageFolio() {
    java.lang.String xml =
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
            + substance
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + haveCirculatingPeriods()
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
    String[] squabbleVariety = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tushFigure = 0;

    for (int i = 0; i < 8; i++) {
      xml += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String rented = "";

        if (!sternArsenal[tushFigure].isAccessible()) {
          rented = " booked";
        }

        xml +=
            "<td class=\"seat"
                + rented
                + "\" data-user=\""
                + sternArsenal[tushFigure].makeUsernameDimidiate()
                + "\" data-time=\""
                + sternArsenal[tushFigure].goClock()
                + "\" data-row=\""
                + squabbleVariety[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + tushFigure
                + "\">\n"
                + "  <p>"
                + squabbleVariety[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        tushFigure++;
      }
      xml += "</tr>\n";
    }
    xml +=
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
    return xml;
  }

  public static synchronized java.lang.String haveCirculatingPeriods() {
    java.text.SimpleDateFormat earlyBeginningArrangement =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date year = new java.util.Date();
    java.lang.String damnedDeadlineWhen = earlyBeginningArrangement.format(year);
    return damnedDeadlineWhen;
  }

  static {
    voyage = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private synchronized void synx76() throws ServletException, IOException {

    if (substance.equals("success")) {
      substance = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (substance.equals("limitexceeded")) {
      substance =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx77() throws ServletException, IOException {
    substance = "";
  }

  private synchronized void synx78() throws ServletException, IOException {
    sternArsenal = recordExecutable();
  }

  private synchronized void synx79() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Prat novelTooshie = new Prat();
      sternArsenal[i] = novelTooshie;
    }
    reduceApplication(sternArsenal);
  }
}
