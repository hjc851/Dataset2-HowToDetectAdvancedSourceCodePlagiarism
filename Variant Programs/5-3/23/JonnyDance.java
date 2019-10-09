import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JonnyDance extends javax.servlet.http.HttpServlet {
  public Posterior[] bumSelection = null;
  public java.lang.String impression = null;
  public static java.util.logging.Logger recording = null;

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse react)
      throws ServletException, IOException {
    java.io.PrintWriter exterior = react.getWriter();
    impression = suggestion.getParameter("message");

    if (impression != null) {

      if (impression.equals("success")) {
        impression = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (impression.equals("limitexceeded")) {
        impression =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      impression = "";
    }
    bumSelection = new Posterior[64];
    java.io.File ticketFolder =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketFolder.exists()) {
      bumSelection = aloudApplication();
    } else {

      for (int i = 0; i < 64; i++) {
        Posterior unusedBuns = new Posterior();
        bumSelection[i] = unusedBuns;
      }
      earnExecutable(bumSelection);
    }
    java.lang.String domesticSummary = canResidenceScreen();
    exterior.println(domesticSummary);
  }

  public synchronized Posterior[] aloudApplication() {

    try {
      Posterior[] posts = null;
      java.io.FileInputStream whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream cbs = new java.io.ObjectInputStream(whysCharge);
      posts = (Posterior[]) cbs.readObject();
      cbs.close();
      whysCharge.close();
      return posts;
    } catch (java.io.IOException i) {
      recording.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      recording.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void earnExecutable(Posterior[] positions) {

    try {
      java.io.FileOutputStream kayoedDocket =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream stunned = new java.io.ObjectOutputStream(kayoedDocket);
      stunned.writeObject(positions);
      stunned.close();
      kayoedDocket.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public synchronized java.lang.String canResidenceScreen() {
    java.lang.String powerpoint =
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
            + receiveContemporaryMoment()
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
    String[] placeBreadth = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int behindTurn = 0;

    for (int i = 0; i < 8; i++) {
      powerpoint += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String earmarked = "";

        if (!bumSelection[behindTurn].isAccessible()) {
          earmarked = " booked";
        }

        powerpoint +=
            "<td class=\"seat"
                + earmarked
                + "\" data-user=\""
                + bumSelection[behindTurn].obtainViewerEst()
                + "\" data-time=\""
                + bumSelection[behindTurn].comeClip()
                + "\" data-row=\""
                + placeBreadth[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + behindTurn
                + "\">\n"
                + "  <p>"
                + placeBreadth[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        behindTurn++;
      }
      powerpoint += "</tr>\n";
    }
    powerpoint +=
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
    return powerpoint;
  }

  public static synchronized java.lang.String receiveContemporaryMoment() {
    java.text.SimpleDateFormat newbornPaymentFile =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date year = new java.util.Date();
    java.lang.String tomPaymentThing = newbornPaymentFile.format(year);
    return tomPaymentThing;
  }

  static {
    recording = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
