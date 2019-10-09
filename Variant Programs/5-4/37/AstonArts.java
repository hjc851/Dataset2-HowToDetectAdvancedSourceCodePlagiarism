import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends HttpServlet {
  public static Logger recorder;
  public String word;
  public Place[] keisterMyriad;

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse react)
      throws ServletException, IOException {
    PrintWriter forbidden;
    File leasingFilename;
    String baseWeb;
    forbidden = react.getWriter();
    word = demands.getParameter("message");

    if (word != null) {

      if (word.equals("success")) {
        word = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (word.equals("limitexceeded")) {
        word =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      word = "";
    }
    keisterMyriad = new Place[64];
    leasingFilename = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (leasingFilename.exists()) {
      keisterMyriad = showDocumentation();
    } else {

      for (int i = 0; i < 64; i++) {
        Place newfoundKeister;
        newfoundKeister = new Place();
        keisterMyriad[i] = newfoundKeister;
      }
      spareFolder(keisterMyriad);
    }
    baseWeb = startHometownChapter();
    forbidden.println(baseWeb);
  }

  public synchronized Place[] showDocumentation() {

    try {
      FileInputStream niiComplaint;
      ObjectInputStream entries;
      Place[] mats;
      niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      entries = new ObjectInputStream(niiComplaint);
      mats = (Place[]) entries.readObject();
      entries.close();
      niiComplaint.close();
      return mats;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      recorder.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void spareFolder(Place[] tickets) {

    try {
      FileOutputStream downLodge;
      ObjectOutputStream exterior;
      downLodge = new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      exterior = new ObjectOutputStream(downLodge);
      exterior.writeObject(tickets);
      exterior.close();
      downLodge.close();
    } catch (IOException con) {
      con.printStackTrace();
    }
  }

  public synchronized String startHometownChapter() {
    String url;
    int fannyCome;
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
            + word
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + goPrevailingClock()
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
    String[] wordsFinery = {"A", "B", "C", "D", "E", "F", "G", "H"};
    fannyCome = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String leased;
        leased = "";

        if (!keisterMyriad[fannyCome].isAccessible()) {
          leased = " booked";
        }

        url +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + keisterMyriad[fannyCome].letSearcherIdentification()
                + "\" data-time=\""
                + keisterMyriad[fannyCome].havePeriods()
                + "\" data-row=\""
                + wordsFinery[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + fannyCome
                + "\">\n"
                + "  <p>"
                + wordsFinery[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        fannyCome++;
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

  public static synchronized String goPrevailingClock() {
    SimpleDateFormat otherDaysPrint;
    Date appointment;
    String muttEngagementClip;
    otherDaysPrint = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    appointment = new Date();
    muttEngagementClip = otherDaysPrint.format(appointment);
    return muttEngagementClip;
  }

  static {
    recorder = Logger.getLogger("bensTheatre");
  }
}
