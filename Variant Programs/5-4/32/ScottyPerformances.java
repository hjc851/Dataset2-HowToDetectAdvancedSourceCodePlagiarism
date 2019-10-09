import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ScottyPerformances extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger chainsaw = null;
  public java.lang.String word = null;
  public Ass[] rearRange = null;

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse responding)
      throws ServletException, IOException {
    java.io.PrintWriter extinct;
    java.io.File engagementRegister;
    java.lang.String apartmentLayout;
    extinct = responding.getWriter();
    word = proposal.getParameter("message");

    if (word != null) {

      if (word.equals("success")) {
        word = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (word.equals("limitexceeded")) {
        word =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      word = "";
    }
    rearRange = new Ass[64];
    engagementRegister =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) {
      rearRange = interpretLodge();
    } else {

      for (int i = 0; i < 64; i++) {
        Ass unprecedentedAss;
        unprecedentedAss = new Ass();
        rearRange[i] = unprecedentedAss;
      }
      salvageCharge(rearRange);
    }
    apartmentLayout = obtainBaseWeb();
    extinct.println(apartmentLayout);
  }

  public synchronized Ass[] interpretLodge() {

    try {
      java.io.FileInputStream nihDocket;
      java.io.ObjectInputStream officeholders;
      Ass[] jobs = null;
      nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      officeholders = new java.io.ObjectInputStream(nihDocket);
      jobs = (Ass[]) officeholders.readObject();
      officeholders.close();
      nihDocket.close();
      return jobs;
    } catch (java.io.IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      chainsaw.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Ass[] elections) {

    try {
      java.io.FileOutputStream outgoingArchives;
      java.io.ObjectOutputStream impermissible;
      outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      impermissible = new java.io.ObjectOutputStream(outgoingArchives);
      impermissible.writeObject(elections);
      impermissible.close();
      outgoingArchives.close();
    } catch (java.io.IOException appointed) {
      appointed.printStackTrace();
    }
  }

  public synchronized java.lang.String obtainBaseWeb() {
    java.lang.String url;
    int rearAmount;
    url =
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
    String[] squabblingPanoply = {"A", "B", "C", "D", "E", "F", "G", "H"};
    rearAmount = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String confined;
        confined = "";

        if (!rearRange[rearAmount].isAccessible()) {
          confined = " booked";
        }

        url +=
            "<td class=\"seat"
                + confined
                + "\" data-user=\""
                + rearRange[rearAmount].driveOperatorSecurity()
                + "\" data-time=\""
                + rearRange[rearAmount].obtainDays()
                + "\" data-row=\""
                + squabblingPanoply[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + rearAmount
                + "\">\n"
                + "  <p>"
                + squabblingPanoply[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        rearAmount++;
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

  public static synchronized java.lang.String letAfootHours() {
    java.text.SimpleDateFormat untriedScheduleMethod;
    java.util.Date payment;
    java.lang.String tomPaymentThing;
    untriedScheduleMethod = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    payment = new java.util.Date();
    tomPaymentThing = untriedScheduleMethod.format(payment);
    return tomPaymentThing;
  }

  static {
    chainsaw = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
