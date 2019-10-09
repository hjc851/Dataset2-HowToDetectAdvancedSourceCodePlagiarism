import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SthTeatro extends HttpServlet {
  public static Logger fisherman = Logger.getLogger("bensTheatre");

  public synchronized void preventBinder(Butt[] pillion) {

    try {
      FileOutputStream unfashionableFilename;
      ObjectOutputStream stunned;
      unfashionableFilename =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      stunned = new ObjectOutputStream(unfashionableFilename);
      stunned.writeObject(pillion);
      stunned.close();
      unfashionableFilename.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }

  public synchronized String goHousePageboy() {
    String htm;
    int rearAmount;
    htm =
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
            + statement
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
    String[] meleeSpectrum = {"A", "B", "C", "D", "E", "F", "G", "H"};
    rearAmount = 0;

    for (int i = 0; i < 8; i++) {
      htm += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String attributed;
        attributed = "";

        if (!investRaft[rearAmount].isAccessible()) {
          attributed = " booked";
        }

        htm +=
            "<td class=\"seat"
                + attributed
                + "\" data-user=\""
                + investRaft[rearAmount].driveOperatorSecurity()
                + "\" data-time=\""
                + investRaft[rearAmount].findSentence()
                + "\" data-row=\""
                + meleeSpectrum[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + rearAmount
                + "\">\n"
                + "  <p>"
                + meleeSpectrum[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        rearAmount++;
      }
      htm += "</tr>\n";
    }
    htm +=
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
    return htm;
  }

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse preparedness)
      throws ServletException, IOException {
    PrintWriter unstylish;
    File ticketingCharge;
    String baseWeb;
    unstylish = preparedness.getWriter();
    statement = complaint.getParameter("message");

    if (statement != null) synx21();
    else synx22();
    investRaft = new Butt[64];
    ticketingCharge = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) synx23();
    else synx24();
    baseWeb = goHousePageboy();
    unstylish.println(baseWeb);
  }

  public Butt[] investRaft;

  public static synchronized String takeTopicalPeriod() {
    SimpleDateFormat freshEngagementArrange;
    Date escort;
    String feistBeginningBeginning;
    freshEngagementArrange = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    escort = new Date();
    feistBeginningBeginning = freshEngagementArrange.format(escort);
    return feistBeginningBeginning;
  }

  public String statement;

  public synchronized Butt[] sayFolder() {

    try {
      FileInputStream niiComplaint;
      ObjectInputStream proponents;
      Butt[] slots;
      niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      proponents = new ObjectInputStream(niiComplaint);
      slots = (Butt[]) proponents.readObject();
      proponents.close();
      niiComplaint.close();
      return slots;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      fisherman.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  private synchronized void synx21() throws ServletException, IOException {

    if (statement.equals("success")) {
      statement = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (statement.equals("limitexceeded")) {
      statement =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx22() throws ServletException, IOException {
    statement = "";
  }

  private synchronized void synx23() throws ServletException, IOException {
    investRaft = sayFolder();
  }

  private synchronized void synx24() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Butt newfoundKeister;
      newfoundKeister = new Butt();
      investRaft[i] = newfoundKeister;
    }
    preventBinder(investRaft);
  }
}
