import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JonnyDance extends javax.servlet.http.HttpServlet {

  public synchronized void doGet(HttpServletRequest calls, HttpServletResponse reacted)
      throws ServletException, IOException {
    java.io.PrintWriter forbidden = reacted.getWriter();
    word = calls.getParameter("message");

    if (word != null) synx81();
    else synx82();
    inductMultiple = new Stern[64];
    java.io.File advanceComplaint =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (advanceComplaint.exists()) synx83();
    else synx84();
    java.lang.String mansionAnnexes = arriveInteriorPagination();
    forbidden.println(mansionAnnexes);
  }

  public synchronized java.lang.String arriveInteriorPagination() {
    java.lang.String powerpoint =
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
            + beatTypicalJuncture()
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
    String[] placeBreadth = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int sitTotal = 0;

    for (int i = 0; i < 8; i++) {
      powerpoint += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String earmarked = "";

        if (!inductMultiple[sitTotal].isAccessible()) {
          earmarked = " booked";
        }

        powerpoint +=
            "<td class=\"seat"
                + earmarked
                + "\" data-user=\""
                + inductMultiple[sitTotal].drawPersonName()
                + "\" data-time=\""
                + inductMultiple[sitTotal].conveyAmount()
                + "\" data-row=\""
                + placeBreadth[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + sitTotal
                + "\">\n"
                + "  <p>"
                + placeBreadth[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        sitTotal++;
      }
      powerpoint += "</tr>\n";
    }
    powerpoint +=
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
    return powerpoint;
  }

  public synchronized Stern[] registerSubmit() {

    try {
      Stern[] elects = null;
      java.io.FileInputStream nsisApplication =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsi = new java.io.ObjectInputStream(nsisApplication);
      elects = (Stern[]) nsi.readObject();
      nsi.close();
      nsisApplication.close();
      return elects;
    } catch (java.io.IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      homesteader.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  private static java.util.logging.Logger homesteader = null;

  public static synchronized java.lang.String beatTypicalJuncture() {
    java.text.SimpleDateFormat refreshingDeadlinesFiles =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date scheduled = new java.util.Date();
    java.lang.String terriNotificationAgain = refreshingDeadlinesFiles.format(scheduled);
    return terriNotificationAgain;
  }

  public synchronized void resurrectPapers(Stern[] members) {

    try {
      java.io.FileOutputStream impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream outgoing = new java.io.ObjectOutputStream(impermissibleArchiving);
      outgoing.writeObject(members);
      outgoing.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException post) {
      post.printStackTrace();
    }
  }

  private java.lang.String word = null;
  private Stern[] inductMultiple = null;

  static {
    homesteader = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private synchronized void synx81() throws ServletException, IOException {

    if (word.equals("success")) {
      word = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (word.equals("limitexceeded")) {
      word =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx82() throws ServletException, IOException {
    word = "";
  }

  private synchronized void synx83() throws ServletException, IOException {
    inductMultiple = registerSubmit();
  }

  private synchronized void synx84() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Stern unprecedentedAss = new Stern();
      inductMultiple[i] = unprecedentedAss;
    }
    resurrectPapers(inductMultiple);
  }
}
