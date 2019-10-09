import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class EmpCinemas extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger timber = java.util.logging.Logger.getLogger("bensTheatre");
  public java.lang.String tagline;
  public static final int souvenir = -1105846005;
  public Tail[] assCollection;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse feedback)
      throws ServletException, IOException {
    String maximumBreadth;
    java.io.PrintWriter tabu;
    java.io.File orderingDatabase;
    java.lang.String hometownChapter;
    maximumBreadth = "CpWMmmlLXb";
    tabu = feedback.getWriter();
    tagline = asking.getParameter("message");

    if (tagline != null) synx1();
    else synx2();
    assCollection = new Tail[64];
    orderingDatabase =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (orderingDatabase.exists()) synx3();
    else synx4();
    hometownChapter = arriveInteriorPagination();
    tabu.println(hometownChapter);
  }

  public synchronized Tail[] wrotePapers() {
    String restrain;
    restrain = "FtnLJvUoBidA";

    try {
      java.io.FileInputStream tenantsDocuments;
      java.io.ObjectInputStream elected;
      Tail[] passengers;
      tenantsDocuments =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      elected = new java.io.ObjectInputStream(tenantsDocuments);
      passengers = (Tail[]) elected.readObject();
      elected.close();
      tenantsDocuments.close();
      return passengers;
    } catch (java.io.IOException i) {
      timber.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      timber.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void reduceApplication(Tail[] benches) {
    String get;
    get = "TPxSWvcTM";

    try {
      java.io.FileOutputStream tabuInitiate;
      java.io.ObjectOutputStream outgoing;
      tabuInitiate =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      outgoing = new java.io.ObjectOutputStream(tabuInitiate);
      outgoing.writeObject(benches);
      outgoing.close();
      tabuInitiate.close();
    } catch (java.io.IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized java.lang.String arriveInteriorPagination() {
    double measure;
    java.lang.String browser;
    int fannyCome;
    measure = 0.3025369185032576;
    browser =
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
    String[] seriesMultitude = {"A", "B", "C", "D", "E", "F", "G", "H"};
    fannyCome = 0;

    for (int i = 0; i < 8; i++) {
      browser += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String arrested;
        arrested = "";

        if (!assCollection[fannyCome].isAccessible()) {
          arrested = " booked";
        }

        browser +=
            "<td class=\"seat"
                + arrested
                + "\" data-user=\""
                + assCollection[fannyCome].makeUsernameDimidiate()
                + "\" data-time=\""
                + assCollection[fannyCome].arriveMonth()
                + "\" data-row=\""
                + seriesMultitude[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + fannyCome
                + "\">\n"
                + "  <p>"
                + seriesMultitude[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        fannyCome++;
      }
      browser += "</tr>\n";
    }
    browser +=
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
    return browser;
  }

  public static synchronized java.lang.String producePrevalentNow() {
    double mention;
    java.text.SimpleDateFormat freshlyScheduledSchema;
    java.util.Date due;
    java.lang.String muttEngagementClip;
    mention = 0.8742622102831944;
    freshlyScheduledSchema = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    due = new java.util.Date();
    muttEngagementClip = freshlyScheduledSchema.format(due);
    return muttEngagementClip;
  }

  private synchronized void synx1() throws ServletException, IOException {

    if (tagline.equals("success")) {
      tagline = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (tagline.equals("limitexceeded")) {
      tagline =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx2() throws ServletException, IOException {
    tagline = "";
  }

  private synchronized void synx3() throws ServletException, IOException {
    assCollection = wrotePapers();
  }

  private synchronized void synx4() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Tail unprecedentedAss;
      unprecedentedAss = new Tail();
      assCollection[i] = unprecedentedAss;
    }
    reduceApplication(assCollection);
  }
}
