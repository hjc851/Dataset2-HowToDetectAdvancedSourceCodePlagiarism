import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NigelDramaturgy extends javax.servlet.http.HttpServlet {

  public synchronized void rescuingReadme(Tail[] elections) {

    try {
      java.io.FileOutputStream deadSubmit =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream taboo = new java.io.ObjectOutputStream(deadSubmit);
      taboo.writeObject(elections);
      taboo.close();
      deadSubmit.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  private static java.util.logging.Logger consignor =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    java.io.PrintWriter quenched = rebuttal.getWriter();
    impression = appeal.getParameter("message");

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
    rumpRaiment = new Tail[64];
    java.io.File engagementRegister =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) {
      rumpRaiment = interpretLodge();
    } else {

      for (int i = 0; i < 64; i++) {
        Tail unprecedentedAss = new Tail();
        rumpRaiment[i] = unprecedentedAss;
      }
      rescuingReadme(rumpRaiment);
    }
    java.lang.String backyardLayouts = findDwellingHomepage();
    quenched.println(backyardLayouts);
  }

  public synchronized java.lang.String findDwellingHomepage() {
    java.lang.String http =
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
            + producePrevalentNow()
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
    String[] controversyMultiplicity = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int backsideNumeral = 0;

    for (int i = 0; i < 8; i++) {
      http += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String attributed = "";

        if (!rumpRaiment[backsideNumeral].isAccessible()) {
          attributed = " booked";
        }

        http +=
            "<td class=\"seat"
                + attributed
                + "\" data-user=\""
                + rumpRaiment[backsideNumeral].catchCustomersIbid()
                + "\" data-time=\""
                + rumpRaiment[backsideNumeral].comeClip()
                + "\" data-row=\""
                + controversyMultiplicity[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + backsideNumeral
                + "\">\n"
                + "  <p>"
                + controversyMultiplicity[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        backsideNumeral++;
      }
      http += "</tr>\n";
    }
    http +=
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
    return http;
  }

  private java.lang.String impression;

  public synchronized Tail[] interpretLodge() {

    try {
      Tail[] members;
      java.io.FileInputStream tenantsDocuments =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nii = new java.io.ObjectInputStream(tenantsDocuments);
      members = (Tail[]) nii.readObject();
      nii.close();
      tenantsDocuments.close();
      return members;
    } catch (java.io.IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      consignor.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  private Tail[] rumpRaiment;

  public static synchronized java.lang.String producePrevalentNow() {
    java.text.SimpleDateFormat earlyBeginningArrangement =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date days = new java.util.Date();
    java.lang.String cruxDaysYears = earlyBeginningArrangement.format(days);
    return cruxDaysYears;
  }
}
