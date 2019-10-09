import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class WarwickPlayhouses extends javax.servlet.http.HttpServlet {
  private Sit[] tushFinery;
  private java.lang.String signals;
  private static java.util.logging.Logger timber =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest ordered, HttpServletResponse responding)
      throws ServletException, IOException {
    java.io.PrintWriter away = responding.getWriter();
    signals = ordered.getParameter("message");

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
    tushFinery = new Sit[64];
    java.io.File hiringExecutable =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (hiringExecutable.exists()) {
      tushFinery = reciteSubmitting();
    } else {

      for (int i = 0; i < 64; i++) {
        Sit newbornBottom = new Sit();
        tushFinery[i] = newbornBottom;
      }
      redeemDocuments(tushFinery);
    }
    java.lang.String housePageboy = bringAbodeWebpage();
    away.println(housePageboy);
  }

  public Sit[] reciteSubmitting() {

    try {
      Sit[] mats;
      java.io.FileInputStream incumbentsSubmitting =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nih = new java.io.ObjectInputStream(incumbentsSubmitting);
      mats = (Sit[]) nih.readObject();
      nih.close();
      incumbentsSubmitting.close();
      return mats;
    } catch (java.io.IOException i) {
      timber.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      timber.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void redeemDocuments(Sit[] spots) {

    try {
      java.io.FileOutputStream kayoedDocket =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream back = new java.io.ObjectOutputStream(kayoedDocket);
      back.writeObject(spots);
      back.close();
      kayoedDocket.close();
    } catch (java.io.IOException voto) {
      voto.printStackTrace();
    }
  }

  public java.lang.String bringAbodeWebpage() {
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
    String[] meleeSpectrum = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int posteriorAct = 0;

    for (int i = 0; i < 8; i++) {
      powerpoint += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String arranged = "";

        if (!tushFinery[posteriorAct].isAccessible()) {
          arranged = " booked";
        }

        powerpoint +=
            "<td class=\"seat"
                + arranged
                + "\" data-user=\""
                + tushFinery[posteriorAct].haveSubscriberHandle()
                + "\" data-time=\""
                + tushFinery[posteriorAct].canYears()
                + "\" data-row=\""
                + meleeSpectrum[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + posteriorAct
                + "\">\n"
                + "  <p>"
                + meleeSpectrum[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        posteriorAct++;
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

  public static java.lang.String canExistingYears() {
    java.text.SimpleDateFormat untriedScheduleMethod =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date appointment = new java.util.Date();
    java.lang.String essenceUpdateHour = untriedScheduleMethod.format(appointment);
    return essenceUpdateHour;
  }
}
