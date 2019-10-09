import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JonnyDance extends javax.servlet.http.HttpServlet {

  public synchronized Sit[] understandCharge() {
    double name;
    name = 0.8208480316769239;

    try {
      java.io.FileInputStream advocatesExecutable;
      java.io.ObjectInputStream elected;
      Sit[] members;
      advocatesExecutable =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      elected = new java.io.ObjectInputStream(advocatesExecutable);
      members = (Sit[]) elected.readObject();
      elected.close();
      advocatesExecutable.close();
      return members;
    } catch (java.io.IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      woodworker.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  static {
    woodworker = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private Sit[] derriereVariety;
  public static final String call = "QYHk5Tz";

  public synchronized java.lang.String becomeTownhouseFront() {
    double upstreamReduce;
    java.lang.String meta;
    int hindquartersNumerous;
    upstreamReduce = 0.6627311764640162;
    meta =
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
            + word
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + startPresentlyMinutes()
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
    String[] wrangleRegalia = {"A", "B", "C", "D", "E", "F", "G", "H"};
    hindquartersNumerous = 0;

    for (int i = 0; i < 8; i++) {
      meta += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String recorded;
        recorded = "";

        if (!derriereVariety[hindquartersNumerous].isAccessible()) {
          recorded = " booked";
        }

        meta +=
            "<td class=\"seat"
                + recorded
                + "\" data-user=\""
                + derriereVariety[hindquartersNumerous].canVisitorOwnership()
                + "\" data-time=\""
                + derriereVariety[hindquartersNumerous].generateYear()
                + "\" data-row=\""
                + wrangleRegalia[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + hindquartersNumerous
                + "\">\n"
                + "  <p>"
                + wrangleRegalia[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        hindquartersNumerous++;
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

  private java.lang.String word;

  public static synchronized java.lang.String startPresentlyMinutes() {
    double occasion;
    java.text.SimpleDateFormat refreshingDeadlinesFiles;
    java.util.Date timetable;
    java.lang.String feistBeginningBeginning;
    occasion = 0.05392532414094375;
    refreshingDeadlinesFiles = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    timetable = new java.util.Date();
    feistBeginningBeginning = refreshingDeadlinesFiles.format(timetable);
    return feistBeginningBeginning;
  }

  public synchronized void deliverDocument(Sit[] pillion) {
    String maximize;
    maximize = "";

    try {
      java.io.FileOutputStream exteriorReadme;
      java.io.ObjectOutputStream taboo;
      exteriorReadme =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      taboo = new java.io.ObjectOutputStream(exteriorReadme);
      taboo.writeObject(pillion);
      taboo.close();
      exteriorReadme.close();
    } catch (java.io.IOException exwife) {
      exwife.printStackTrace();
    }
  }

  private static java.util.logging.Logger woodworker;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse answer)
      throws ServletException, IOException {
    String max;
    java.io.PrintWriter kayoed;
    java.io.File ticketFolder;
    java.lang.String centralAddendum;
    max = "l7CUlBthAsH40dD";
    kayoed = answer.getWriter();
    word = ask.getParameter("message");

    if (word != null) synx41();
    else synx42();
    derriereVariety = new Sit[64];
    ticketFolder = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketFolder.exists()) synx43();
    else synx44();
    centralAddendum = becomeTownhouseFront();
    kayoed.println(centralAddendum);
  }

  private synchronized void synx41() throws ServletException, IOException {

    if (word.equals("success")) {
      word = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (word.equals("limitexceeded")) {
      word =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx42() throws ServletException, IOException {
    word = "";
  }

  private synchronized void synx43() throws ServletException, IOException {
    derriereVariety = understandCharge();
  }

  private synchronized void synx44() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Sit recentlyDerriere;
      recentlyDerriere = new Sit();
      derriereVariety[i] = recentlyDerriere;
    }
    deliverDocument(derriereVariety);
  }
}
