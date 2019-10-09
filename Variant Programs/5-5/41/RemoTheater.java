import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class RemoTheater extends javax.servlet.http.HttpServlet {

  public synchronized void shaveArchives(Derriere[] spaces) {

    try {
      java.io.FileOutputStream forbiddenDocumentation;
      java.io.ObjectOutputStream away;
      forbiddenDocumentation =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      away = new java.io.ObjectOutputStream(forbiddenDocumentation);
      away.writeObject(spaces);
      away.close();
      forbiddenDocumentation.close();
    } catch (java.io.IOException tipp) {
      tipp.printStackTrace();
    }
  }

  public Derriere[] rearRange;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    java.io.PrintWriter tabu;
    java.io.File rentalDocument;
    java.lang.String familyVarlet;
    tabu = responsiveness.getWriter();
    warning = ask.getParameter("message");

    if (warning != null) synx141();
    else synx142();
    rearRange = new Derriere[64];
    rentalDocument = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) synx143();
    else synx144();
    familyVarlet = driveCottageFolio();
    tabu.println(familyVarlet);
  }

  public static synchronized java.lang.String conveyFormerAmount() {
    java.text.SimpleDateFormat newfangledCalendarVersion;
    java.util.Date yet;
    java.lang.String goddamnSchedulePeriods;
    newfangledCalendarVersion = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    yet = new java.util.Date();
    goddamnSchedulePeriods = newfangledCalendarVersion.format(yet);
    return goddamnSchedulePeriods;
  }

  public synchronized Derriere[] reciteSubmitting() {

    try {
      java.io.FileInputStream tenantsDocuments;
      java.io.ObjectInputStream establishment;
      Derriere[] slots;
      tenantsDocuments =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      establishment = new java.io.ObjectInputStream(tenantsDocuments);
      slots = (Derriere[]) establishment.readObject();
      establishment.close();
      tenantsDocuments.close();
      return slots;
    } catch (java.io.IOException i) {
      registrar.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      registrar.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public static java.util.logging.Logger registrar =
      java.util.logging.Logger.getLogger("bensTheatre");
  public java.lang.String warning;

  public synchronized java.lang.String driveCottageFolio() {
    java.lang.String url;
    int assSeveral;
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
            + warning
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + conveyFormerAmount()
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
    String[] dustupRange = {"A", "B", "C", "D", "E", "F", "G", "H"};
    assSeveral = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String allocated;
        allocated = "";

        if (!rearRange[assSeveral].isAccessible()) {
          allocated = " booked";
        }

        url +=
            "<td class=\"seat"
                + allocated
                + "\" data-user=\""
                + rearRange[assSeveral].makeUsernameDimidiate()
                + "\" data-time=\""
                + rearRange[assSeveral].findSentence()
                + "\" data-row=\""
                + dustupRange[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + assSeveral
                + "\">\n"
                + "  <p>"
                + dustupRange[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        assSeveral++;
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

  private synchronized void synx141() throws ServletException, IOException {

    if (warning.equals("success")) {
      warning = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (warning.equals("limitexceeded")) {
      warning =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx142() throws ServletException, IOException {
    warning = "";
  }

  private synchronized void synx143() throws ServletException, IOException {
    rearRange = reciteSubmitting();
  }

  private synchronized void synx144() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Derriere unprecedentedAss;
      unprecedentedAss = new Derriere();
      rearRange[i] = unprecedentedAss;
    }
    shaveArchives(rearRange);
  }
}
