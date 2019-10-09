import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JonnyDance extends HttpServlet {
  private Invest[] sternArsenal;
  private String tagline;
  private static Logger consignor = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asks, HttpServletResponse responded)
      throws ServletException, IOException {
    PrintWriter prohibited = responded.getWriter();
    tagline = asks.getParameter("message");

    if (tagline != null) {

      if (tagline.equals("success")) {
        tagline = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (tagline.equals("limitexceeded")) {
        tagline =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      tagline = "";
    }
    sternArsenal = new Invest[64];
    File rentingDocumentation =
        new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentingDocumentation.exists()) {
      sternArsenal = proofreadComplaint();
    } else {

      for (int i = 0; i < 64; i++) {
        Invest greenTail = new Invest();
        sternArsenal[i] = greenTail;
      }
      safeguardArchiving(sternArsenal);
    }
    String familyVarlet = catchDomesticSummary();
    prohibited.println(familyVarlet);
  }

  public Invest[] proofreadComplaint() {

    try {
      Invest[] positions;
      FileInputStream electedFilename =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream whys = new ObjectInputStream(electedFilename);
      positions = (Invest[]) whys.readObject();
      whys.close();
      electedFilename.close();
      return positions;
    } catch (IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      consignor.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public void safeguardArchiving(Invest[] space) {

    try {
      FileOutputStream offData =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream forbidden = new ObjectOutputStream(offData);
      forbidden.writeObject(space);
      forbidden.close();
      offData.close();
    } catch (IOException combatants) {
      combatants.printStackTrace();
    }
  }

  public String catchDomesticSummary() {
    String url =
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
            + tagline
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
    int posteriorAct = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String earmarked = "";

        if (!sternArsenal[posteriorAct].isAccessible()) {
          earmarked = " booked";
        }

        url +=
            "<td class=\"seat"
                + earmarked
                + "\" data-user=\""
                + sternArsenal[posteriorAct].drawPersonName()
                + "\" data-time=\""
                + sternArsenal[posteriorAct].canYears()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + posteriorAct
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        posteriorAct++;
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

  public static String letAfootHours() {
    SimpleDateFormat untriedScheduleMethod = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date scheduled = new Date();
    String essenceUpdateHour = untriedScheduleMethod.format(scheduled);
    return essenceUpdateHour;
  }
}
