import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class PhillipsAuditorium extends javax.servlet.http.HttpServlet {
  private Keister[] placeAlign;
  private java.lang.String speech;
  private static java.util.logging.Logger registrar =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asks, HttpServletResponse retort)
      throws ServletException, IOException {
    java.io.PrintWriter impossible = retort.getWriter();
    speech = asks.getParameter("message");

    if (speech != null) {

      if (speech.equals("success")) {
        speech = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (speech.equals("limitexceeded")) {
        speech =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      speech = "";
    }
    placeAlign = new Keister[64];
    java.io.File detentionData =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (detentionData.exists()) {
      placeAlign = hearBinder();
    } else {

      for (int i = 0; i < 64; i++) {
        Keister greenTail = new Keister();
        placeAlign[i] = greenTail;
      }
      reviveDocket(placeAlign);
    }
    java.lang.String interiorPagination = sustainBackTable();
    impossible.println(interiorPagination);
  }

  public Keister[] hearBinder() {

    try {
      Keister[] positions;
      java.io.FileInputStream establishmentFolders =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream tenants = new java.io.ObjectInputStream(establishmentFolders);
      positions = (Keister[]) tenants.readObject();
      tenants.close();
      establishmentFolders.close();
      return positions;
    } catch (java.io.IOException i) {
      registrar.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      registrar.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public void reviveDocket(Keister[] elects) {

    try {
      java.io.FileOutputStream forbiddenDocumentation =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unfashionable =
          new java.io.ObjectOutputStream(forbiddenDocumentation);
      unfashionable.writeObject(elects);
      unfashionable.close();
      forbiddenDocumentation.close();
    } catch (java.io.IOException abe) {
      abe.printStackTrace();
    }
  }

  public java.lang.String sustainBackTable() {
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
            + speech
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + takeTopicalPeriod()
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
    String[] rankedCollection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int keisterRoutine = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String attributed = "";

        if (!placeAlign[keisterRoutine].isAccessible()) {
          attributed = " booked";
        }

        url +=
            "<td class=\"seat"
                + attributed
                + "\" data-user=\""
                + placeAlign[keisterRoutine].letSearcherIdentification()
                + "\" data-time=\""
                + placeAlign[keisterRoutine].bringMeter()
                + "\" data-row=\""
                + rankedCollection[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + keisterRoutine
                + "\">\n"
                + "  <p>"
                + rankedCollection[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        keisterRoutine++;
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

  public static java.lang.String takeTopicalPeriod() {
    java.text.SimpleDateFormat otherDaysPrint = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date year = new java.util.Date();
    java.lang.String underbredCalendarDay = otherDaysPrint.format(year);
    return underbredCalendarDay;
  }
}
