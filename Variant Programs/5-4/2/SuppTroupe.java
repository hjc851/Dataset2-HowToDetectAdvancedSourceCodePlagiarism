import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SuppTroupe extends javax.servlet.http.HttpServlet {
  public Invest[] tushFinery = null;

  public synchronized Invest[] aloudApplication() {

    try {
      Invest[] tickets = null;
      java.io.FileInputStream establishmentFolders =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream without = new java.io.ObjectInputStream(establishmentFolders);
      tickets = (Invest[]) without.readObject();
      without.close();
      establishmentFolders.close();
      return tickets;
    } catch (java.io.IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      fisherman.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public java.lang.String impression = null;

  public static synchronized java.lang.String sustainThisThing() {
    java.text.SimpleDateFormat greenReceiptConfiguration =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date timeframe = new java.util.Date();
    java.lang.String heartCommencementNow = greenReceiptConfiguration.format(timeframe);
    return heartCommencementNow;
  }

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    java.io.PrintWriter back = responsiveness.getWriter();
    impression = appeals.getParameter("message");

    if (impression != null) synx11();
    else synx12();
    tushFinery = new Invest[64];
    java.io.File engagementRegister =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) synx13();
    else synx14();
    java.lang.String baseWeb = startHometownChapter();
    back.println(baseWeb);
  }

  public synchronized void reviveDocket(Invest[] elects) {

    try {
      java.io.FileOutputStream backBinder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream kayoed = new java.io.ObjectOutputStream(backBinder);
      kayoed.writeObject(elects);
      kayoed.close();
      backBinder.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }

  static {
    fisherman = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public synchronized java.lang.String startHometownChapter() {
    java.lang.String url =
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
            + impression
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + sustainThisThing()
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
    int canQuantity = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String made = "";

        if (!tushFinery[canQuantity].isAccessible()) {
          made = " booked";
        }

        url +=
            "<td class=\"seat"
                + made
                + "\" data-user=\""
                + tushFinery[canQuantity].goExploiterQuod()
                + "\" data-time=\""
                + tushFinery[canQuantity].obtainDays()
                + "\" data-row=\""
                + roundRaft[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + canQuantity
                + "\">\n"
                + "  <p>"
                + roundRaft[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        canQuantity++;
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

  public static java.util.logging.Logger fisherman = null;

  private synchronized void synx11() throws ServletException, IOException {

    if (impression.equals("success")) {
      impression = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (impression.equals("limitexceeded")) {
      impression =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx12() throws ServletException, IOException {
    impression = "";
  }

  private synchronized void synx13() throws ServletException, IOException {
    tushFinery = aloudApplication();
  }

  private synchronized void synx14() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Invest revolutionaryRump = new Invest();
      tushFinery[i] = revolutionaryRump;
    }
    reviveDocket(tushFinery);
  }
}
