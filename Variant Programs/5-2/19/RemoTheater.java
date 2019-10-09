import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class RemoTheater extends javax.servlet.http.HttpServlet {
  private Tooshie[] fannyPlethora;
  private java.lang.String signals;
  private static java.util.logging.Logger chainsaw =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asking, HttpServletResponse intervention)
      throws ServletException, IOException {
    java.io.PrintWriter proscribed = intervention.getWriter();
    signals = asking.getParameter("message");

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
    fannyPlethora = new Tooshie[64];
    java.io.File detentionData =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (detentionData.exists()) {
      fannyPlethora = writtenFilename();
    } else {

      for (int i = 0; i < 64; i++) {
        Tooshie greenTail = new Tooshie();
        fannyPlethora[i] = greenTail;
      }
      redeemDocuments(fannyPlethora);
    }
    java.lang.String interiorPagination = startHometownChapter();
    proscribed.println(interiorPagination);
  }

  public Tooshie[] writtenFilename() {

    try {
      Tooshie[] vacancies;
      java.io.FileInputStream entriesLodge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream officeholders = new java.io.ObjectInputStream(entriesLodge);
      vacancies = (Tooshie[]) officeholders.readObject();
      officeholders.close();
      entriesLodge.close();
      return vacancies;
    } catch (java.io.IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      chainsaw.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void redeemDocuments(Tooshie[] chairs) {

    try {
      java.io.FileOutputStream exteriorReadme =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream retired = new java.io.ObjectOutputStream(exteriorReadme);
      retired.writeObject(chairs);
      retired.close();
      exteriorReadme.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public java.lang.String startHometownChapter() {
    java.lang.String plugin =
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
            + fixNewChance()
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
    String[] spatAssortment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttHandful = 0;

    for (int i = 0; i < 8; i++) {
      plugin += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String engaged = "";

        if (!fannyPlethora[buttHandful].isAccessible()) {
          engaged = " booked";
        }

        plugin +=
            "<td class=\"seat"
                + engaged
                + "\" data-user=\""
                + fannyPlethora[buttHandful].startDeveloperPicture()
                + "\" data-time=\""
                + fannyPlethora[buttHandful].letHours()
                + "\" data-row=\""
                + spatAssortment[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + buttHandful
                + "\">\n"
                + "  <p>"
                + spatAssortment[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        buttHandful++;
      }
      plugin += "</tr>\n";
    }
    plugin +=
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
    return plugin;
  }

  public static java.lang.String fixNewChance() {
    java.text.SimpleDateFormat babyUpdatedCompress =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date updated = new java.util.Date();
    java.lang.String essenceUpdateHour = babyUpdatedCompress.format(updated);
    return essenceUpdateHour;
  }
}
