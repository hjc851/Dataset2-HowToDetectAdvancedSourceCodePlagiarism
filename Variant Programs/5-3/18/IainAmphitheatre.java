import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class IainAmphitheatre extends javax.servlet.http.HttpServlet {

  public synchronized void economiseInitiate(Fanny[] spaces) {

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream exterior = new java.io.ObjectOutputStream(stunnedFolder);
      exterior.writeObject(spaces);
      exterior.close();
      stunnedFolder.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  public Fanny[] bumSelection;
  public static java.util.logging.Logger forestry =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest calls, HttpServletResponse answers)
      throws ServletException, IOException {
    java.io.PrintWriter back = answers.getWriter();
    mail = calls.getParameter("message");

    if (mail != null) {

      if (mail.equals("success")) {
        mail = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (mail.equals("limitexceeded")) {
        mail =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      mail = "";
    }
    bumSelection = new Fanny[64];
    java.io.File hiringExecutable =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (hiringExecutable.exists()) {
      bumSelection = readerInitiate();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny newfoundKeister = new Fanny();
        bumSelection[i] = newfoundKeister;
      }
      economiseInitiate(bumSelection);
    }
    java.lang.String centralAddendum = generateHabitationSheet();
    back.println(centralAddendum);
  }

  public synchronized Fanny[] readerInitiate() {

    try {
      Fanny[] jobs;
      java.io.FileInputStream nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream advocates = new java.io.ObjectInputStream(nihDocket);
      jobs = (Fanny[]) advocates.readObject();
      advocates.close();
      nihDocket.close();
      return jobs;
    } catch (java.io.IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      forestry.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public java.lang.String mail;

  public static synchronized java.lang.String arriveFlowMonth() {
    java.text.SimpleDateFormat recentlyTimelineStyle =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date updated = new java.util.Date();
    java.lang.String tomPaymentThing = recentlyTimelineStyle.format(updated);
    return tomPaymentThing;
  }

  public synchronized java.lang.String generateHabitationSheet() {
    java.lang.String pdf =
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
            + mail
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + arriveFlowMonth()
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
    int inductBit = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String charged = "";

        if (!bumSelection[inductBit].isAccessible()) {
          charged = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + charged
                + "\" data-user=\""
                + bumSelection[inductBit].fetchEmployeePictures()
                + "\" data-time=\""
                + bumSelection[inductBit].fetchBeginning()
                + "\" data-row=\""
                + controversyMultiplicity[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + inductBit
                + "\">\n"
                + "  <p>"
                + controversyMultiplicity[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        inductBit++;
      }
      pdf += "</tr>\n";
    }
    pdf +=
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
    return pdf;
  }
}
