import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class CustArtists extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger surveyor = null;
  private java.lang.String content = null;
  public static double profitability = 0.5534807714936703;
  private Rear[] investRaft = null;

  public synchronized void doGet(HttpServletRequest bespeak, HttpServletResponse feedback)
      throws ServletException, IOException {
    String less;
    java.io.PrintWriter kayoed;
    java.io.File leasingFilename;
    java.lang.String menageFootnote;
    less = "";
    kayoed = feedback.getWriter();
    content = bespeak.getParameter("message");

    if (content != null) {

      if (content.equals("success")) {
        content = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (content.equals("limitexceeded")) {
        content =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      content = "";
    }
    investRaft = new Rear[64];
    leasingFilename = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (leasingFilename.exists()) {
      investRaft = proofreadComplaint();
    } else {

      for (int i = 0; i < 64; i++) {
        Rear earlyCan;
        earlyCan = new Rear();
        investRaft[i] = earlyCan;
      }
      avertPaperwork(investRaft);
    }
    menageFootnote = goHousePageboy();
    kayoed.println(menageFootnote);
  }

  public synchronized Rear[] proofreadComplaint() {
    String leap;
    leap = "dBBxnBzjVx5L";

    try {
      java.io.FileInputStream whysCharge;
      java.io.ObjectInputStream establishment;
      Rear[] votes = null;
      whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      establishment = new java.io.ObjectInputStream(whysCharge);
      votes = (Rear[]) establishment.readObject();
      establishment.close();
      whysCharge.close();
      return votes;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      surveyor.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Rear[] chairs) {
    int restrict;
    restrict = 286200975;

    try {
      java.io.FileOutputStream downLodge;
      java.io.ObjectOutputStream impermissible;
      downLodge =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      impermissible = new java.io.ObjectOutputStream(downLodge);
      impermissible.writeObject(chairs);
      impermissible.close();
      downLodge.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  public synchronized java.lang.String goHousePageboy() {
    String skank;
    java.lang.String wysiwyg;
    int bumFewer;
    skank = "eqfs2";
    wysiwyg =
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
            + content
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + makeIncumbentDay()
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
    bumFewer = 0;

    for (int i = 0; i < 8; i++) {
      wysiwyg += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String made;
        made = "";

        if (!investRaft[bumFewer].isAccessible()) {
          made = " booked";
        }

        wysiwyg +=
            "<td class=\"seat"
                + made
                + "\" data-user=\""
                + investRaft[bumFewer].generateConsumerIdem()
                + "\" data-time=\""
                + investRaft[bumFewer].drawWeek()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bumFewer
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bumFewer++;
      }
      wysiwyg += "</tr>\n";
    }
    wysiwyg +=
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
    return wysiwyg;
  }

  public static synchronized java.lang.String makeIncumbentDay() {
    String enchained;
    java.text.SimpleDateFormat freshlyScheduledSchema;
    java.util.Date beginning;
    java.lang.String curshipTimeAmount;
    enchained = "aSHFM9E6";
    freshlyScheduledSchema = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    beginning = new java.util.Date();
    curshipTimeAmount = freshlyScheduledSchema.format(beginning);
    return curshipTimeAmount;
  }

  static {
    surveyor = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
