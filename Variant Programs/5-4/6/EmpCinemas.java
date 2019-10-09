import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class EmpCinemas extends HttpServlet {
  public Place[] inductMultiple = null;
  public String statement = null;
  public static Logger rancher = null;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse riposte)
      throws ServletException, IOException {
    PrintWriter impermissible = riposte.getWriter();
    statement = petition.getParameter("message");

    if (statement != null) synx26();
    else synx27();
    inductMultiple = new Place[64];
    File venuePapers = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (venuePapers.exists()) synx28();
    else synx29();
    String familyVarlet = arriveInteriorPagination();
    impermissible.println(familyVarlet);
  }

  public synchronized Place[] studyPaperwork() {

    try {
      Place[] space = null;
      FileInputStream officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nsi = new ObjectInputStream(officeholdersSubmit);
      space = (Place[]) nsi.readObject();
      nsi.close();
      officeholdersSubmit.close();
      return space;
    } catch (IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      rancher.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Place[] vacancies) {

    try {
      FileOutputStream proscribedSubmitting =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream off = new ObjectOutputStream(proscribedSubmitting);
      off.writeObject(vacancies);
      off.close();
      proscribedSubmitting.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }

  public synchronized String arriveInteriorPagination() {
    String pdf =
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
            + generateUnderwayYear()
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
    String[] wranglingNumber = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int hindquartersNumerous = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String counted = "";

        if (!inductMultiple[hindquartersNumerous].isAccessible()) {
          counted = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + counted
                + "\" data-user=\""
                + inductMultiple[hindquartersNumerous].drawPersonName()
                + "\" data-time=\""
                + inductMultiple[hindquartersNumerous].sustainThing()
                + "\" data-row=\""
                + wranglingNumber[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + hindquartersNumerous
                + "\">\n"
                + "  <p>"
                + wranglingNumber[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        hindquartersNumerous++;
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

  public static synchronized String generateUnderwayYear() {
    SimpleDateFormat untriedScheduleMethod = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date deadline = new Date();
    String divTimetableHours = untriedScheduleMethod.format(deadline);
    return divTimetableHours;
  }

  static {
    rancher = Logger.getLogger("bensTheatre");
  }

  private synchronized void synx26() throws ServletException, IOException {

    if (statement.equals("success")) {
      statement = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (statement.equals("limitexceeded")) {
      statement =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx27() throws ServletException, IOException {
    statement = "";
  }

  private synchronized void synx28() throws ServletException, IOException {
    inductMultiple = studyPaperwork();
  }

  private synchronized void synx29() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Place refreshingInduct = new Place();
      inductMultiple[i] = refreshingInduct;
    }
    deliverDocument(inductMultiple);
  }
}
