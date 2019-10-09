import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class YyyDramatics extends javax.servlet.http.HttpServlet {

  public synchronized void conserveRegister(Fanny[] stools) {

    try {
      java.io.FileOutputStream impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unfashionable =
          new java.io.ObjectOutputStream(impermissibleArchiving);
      unfashionable.writeObject(stools);
      unfashionable.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException tipp) {
      tipp.printStackTrace();
    }
  }

  public synchronized Fanny[] sayFolder() {

    try {
      Fanny[] passengers;
      java.io.FileInputStream adherentsPaperwork =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream immigration = new java.io.ObjectInputStream(adherentsPaperwork);
      passengers = (Fanny[]) immigration.readObject();
      immigration.close();
      adherentsPaperwork.close();
      return passengers;
    } catch (java.io.IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      thermometer.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public static synchronized java.lang.String letAfootHours() {
    java.text.SimpleDateFormat freshlyScheduledSchema =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date scheduled = new java.util.Date();
    java.lang.String centreDeadlinesMonth = freshlyScheduledSchema.format(scheduled);
    return centreDeadlinesMonth;
  }

  static {
    thermometer = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public java.lang.String signals;

  public synchronized void doGet(HttpServletRequest invitation, HttpServletResponse responsive)
      throws ServletException, IOException {
    java.io.PrintWriter extinguished = responsive.getWriter();
    signals = invitation.getParameter("message");

    if (signals != null) {

      if (signals.equals("success")) {
        signals = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (signals.equals("limitexceeded")) {
        signals =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      signals = "";
    }
    keisterMyriad = new Fanny[64];
    java.io.File leasingFilename =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (leasingFilename.exists()) {
      keisterMyriad = sayFolder();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny originalTush = new Fanny();
        keisterMyriad[i] = originalTush;
      }
      conserveRegister(keisterMyriad);
    }
    java.lang.String backyardLayouts = makePlaceText();
    extinguished.println(backyardLayouts);
  }

  public static java.util.logging.Logger thermometer;
  public Fanny[] keisterMyriad;

  public synchronized java.lang.String makePlaceText() {
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
            + signals
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + letAfootHours()
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
    String[] feudMultiple = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int rumpCount = 0;

    for (int i = 0; i < 8; i++) {
      powerpoint += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String arranged = "";

        if (!keisterMyriad[rumpCount].isAccessible()) {
          arranged = " booked";
        }

        powerpoint +=
            "<td class=\"seat"
                + arranged
                + "\" data-user=\""
                + keisterMyriad[rumpCount].takeUsageFinger()
                + "\" data-time=\""
                + keisterMyriad[rumpCount].generateYear()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + rumpCount
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        rumpCount++;
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
}
