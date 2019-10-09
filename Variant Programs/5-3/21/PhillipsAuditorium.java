import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class PhillipsAuditorium extends javax.servlet.http.HttpServlet {
  static {
    voyage = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public synchronized java.lang.String generateHabitationSheet() {
    double restricts;
    java.lang.String url;
    int sitTotal;
    restricts = 0.4586605699479722;
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
            + msg
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + fetchPresentBeginning()
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
    sitTotal = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String made;
        made = "";

        if (!sternArsenal[sitTotal].isAccessible()) {
          made = " booked";
        }

        url +=
            "<td class=\"seat"
                + made
                + "\" data-user=\""
                + sternArsenal[sitTotal].becomeUsePhoto()
                + "\" data-time=\""
                + sternArsenal[sitTotal].becomeOpportunity()
                + "\" data-row=\""
                + courseRaiment[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + sitTotal
                + "\">\n"
                + "  <p>"
                + courseRaiment[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        sitTotal++;
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

  private java.lang.String msg;
  public static final int token = -1282011457;
  private Tooshie[] sternArsenal;
  private static java.util.logging.Logger voyage;

  public synchronized void helpData(Tooshie[] mats) {
    String demarcation;
    demarcation = "XyoIdj";

    try {
      java.io.FileOutputStream retiredExecutable;
      java.io.ObjectOutputStream back;
      retiredExecutable =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      back = new java.io.ObjectOutputStream(retiredExecutable);
      back.writeObject(mats);
      back.close();
      retiredExecutable.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse answers)
      throws ServletException, IOException {
    double apexRestrictions;
    java.io.PrintWriter proscribed;
    java.io.File detentionData;
    java.lang.String abodeWebpage;
    apexRestrictions = 0.2187150834379492;
    proscribed = answers.getWriter();
    msg = wishes.getParameter("message");

    if (msg != null) {

      if (msg.equals("success")) {
        msg = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (msg.equals("limitexceeded")) {
        msg =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      msg = "";
    }
    sternArsenal = new Tooshie[64];
    detentionData = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (detentionData.exists()) {
      sternArsenal = registerSubmit();
    } else {

      for (int i = 0; i < 64; i++) {
        Tooshie unprecedentedAss;
        unprecedentedAss = new Tooshie();
        sternArsenal[i] = unprecedentedAss;
      }
      helpData(sternArsenal);
    }
    abodeWebpage = generateHabitationSheet();
    proscribed.println(abodeWebpage);
  }

  public synchronized Tooshie[] registerSubmit() {
    double roll;
    roll = 0.0013033833598794509;

    try {
      java.io.FileInputStream establishmentFolders;
      java.io.ObjectInputStream adherents;
      Tooshie[] ridings;
      establishmentFolders =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      adherents = new java.io.ObjectInputStream(establishmentFolders);
      ridings = (Tooshie[]) adherents.readObject();
      adherents.close();
      establishmentFolders.close();
      return ridings;
    } catch (java.io.IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      voyage.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public static synchronized java.lang.String fetchPresentBeginning() {
    int bersToken;
    java.text.SimpleDateFormat radicalTimetableMode;
    java.util.Date timeline;
    java.lang.String tomPaymentThing;
    bersToken = 1202659851;
    radicalTimetableMode = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    timeline = new java.util.Date();
    tomPaymentThing = radicalTimetableMode.format(timeline);
    return tomPaymentThing;
  }
}
