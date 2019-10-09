import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class HansenComedy extends javax.servlet.http.HttpServlet {
  private Behind[] buttocksMultitude = null;
  private java.lang.String comment = null;
  private static java.util.logging.Logger woodcutter =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest calls, HttpServletResponse reply)
      throws ServletException, IOException {
    java.io.PrintWriter prohibited = reply.getWriter();
    comment = calls.getParameter("message");

    if (comment != null) {

      if (comment.equals("success")) {
        comment = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (comment.equals("limitexceeded")) {
        comment =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      comment = "";
    }
    buttocksMultitude = new Behind[64];
    java.io.File venuePapers =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (venuePapers.exists()) {
      buttocksMultitude = translateDocuments();
    } else {

      for (int i = 0; i < 64; i++) {
        Behind modernPlace = new Behind();
        buttocksMultitude[i] = modernPlace;
      }
      shaveArchives(buttocksMultitude);
    }
    java.lang.String centralAddendum = havePlateSection();
    prohibited.println(centralAddendum);
  }

  public synchronized Behind[] translateDocuments() {

    try {
      Behind[] venues = null;
      java.io.FileInputStream whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream tenants = new java.io.ObjectInputStream(whysCharge);
      venues = (Behind[]) tenants.readObject();
      tenants.close();
      whysCharge.close();
      return venues;
    } catch (java.io.IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      woodcutter.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void shaveArchives(Behind[] passengers) {

    try {
      java.io.FileOutputStream offData =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream stunned = new java.io.ObjectOutputStream(offData);
      stunned.writeObject(passengers);
      stunned.close();
      offData.close();
    } catch (java.io.IOException abel) {
      abel.printStackTrace();
    }
  }

  public synchronized java.lang.String havePlateSection() {
    java.lang.String metadata =
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
            + comment
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + haveCirculatingPeriods()
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
    String[] courseRaiment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tushFigure = 0;

    for (int i = 0; i < 8; i++) {
      metadata += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String counted = "";

        if (!buttocksMultitude[tushFigure].isAccessible()) {
          counted = " booked";
        }

        metadata +=
            "<td class=\"seat"
                + counted
                + "\" data-user=\""
                + buttocksMultitude[tushFigure].produceWearerMap()
                + "\" data-time=\""
                + buttocksMultitude[tushFigure].arriveMonth()
                + "\" data-row=\""
                + courseRaiment[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tushFigure
                + "\">\n"
                + "  <p>"
                + courseRaiment[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tushFigure++;
      }
      metadata += "</tr>\n";
    }
    metadata +=
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
    return metadata;
  }

  public static synchronized java.lang.String haveCirculatingPeriods() {
    java.text.SimpleDateFormat newbornPaymentFile =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date see = new java.util.Date();
    java.lang.String backingYetChance = newbornPaymentFile.format(see);
    return backingYetChance;
  }
}
