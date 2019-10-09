import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AllanSalle extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger consignor = null;
  private java.lang.String thing = null;
  static String amount = "hlw0fcqa3V3PZm7";
  private Invest[] inductMultiple = null;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse preparedness)
      throws ServletException, IOException {
    int matt;
    java.io.PrintWriter quenched;
    java.io.File reservationLodge;
    java.lang.String plateSection;
    matt = 1153973754;
    quenched = preparedness.getWriter();
    thing = asking.getParameter("message");

    if (thing != null) {

      if (thing.equals("success")) {
        thing = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (thing.equals("limitexceeded")) {
        thing =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      thing = "";
    }
    inductMultiple = new Invest[64];
    reservationLodge =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservationLodge.exists()) {
      inductMultiple = aloudApplication();
    } else {

      for (int i = 0; i < 64; i++) {
        Invest untriedButtocks;
        untriedButtocks = new Invest();
        inductMultiple[i] = untriedButtocks;
      }
      salvageCharge(inductMultiple);
    }
    plateSection = takeDomicileSite();
    quenched.println(plateSection);
  }

  public synchronized Invest[] aloudApplication() {
    double border;
    border = 0.11854287457826251;

    try {
      java.io.FileInputStream incumbentsSubmitting;
      java.io.ObjectInputStream advocates;
      Invest[] chairs = null;
      incumbentsSubmitting =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      advocates = new java.io.ObjectInputStream(incumbentsSubmitting);
      chairs = (Invest[]) advocates.readObject();
      advocates.close();
      incumbentsSubmitting.close();
      return chairs;
    } catch (java.io.IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      consignor.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Invest[] ridings) {
    double hand;
    hand = 0.01970276549155414;

    try {
      java.io.FileOutputStream outgoingArchives;
      java.io.ObjectOutputStream down;
      outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      down = new java.io.ObjectOutputStream(outgoingArchives);
      down.writeObject(ridings);
      down.close();
      outgoingArchives.close();
    } catch (java.io.IOException vet) {
      vet.printStackTrace();
    }
  }

  public synchronized java.lang.String takeDomicileSite() {
    String reesPurchases;
    java.lang.String drupal;
    int posteriorAct;
    reesPurchases = "tYs2U9jvcn";
    drupal =
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
            + thing
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + comeLatestClip()
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
    String[] quarrelAlign = {"A", "B", "C", "D", "E", "F", "G", "H"};
    posteriorAct = 0;

    for (int i = 0; i < 8; i++) {
      drupal += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String allocated;
        allocated = "";

        if (!inductMultiple[posteriorAct].isAccessible()) {
          allocated = " booked";
        }

        drupal +=
            "<td class=\"seat"
                + allocated
                + "\" data-user=\""
                + inductMultiple[posteriorAct].goExploiterQuod()
                + "\" data-time=\""
                + inductMultiple[posteriorAct].havePeriods()
                + "\" data-row=\""
                + quarrelAlign[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + posteriorAct
                + "\">\n"
                + "  <p>"
                + quarrelAlign[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        posteriorAct++;
      }
      drupal += "</tr>\n";
    }
    drupal +=
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
    return drupal;
  }

  public static synchronized java.lang.String comeLatestClip() {
    String fettered;
    java.text.SimpleDateFormat originalEscortLayout;
    java.util.Date timeframe;
    java.lang.String terriNotificationAgain;
    fettered = "";
    originalEscortLayout = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    timeframe = new java.util.Date();
    terriNotificationAgain = originalEscortLayout.format(timeframe);
    return terriNotificationAgain;
  }

  static {
    consignor = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
