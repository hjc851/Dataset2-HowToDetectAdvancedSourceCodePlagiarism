import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class YyyDramatics extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger timber = java.util.logging.Logger.getLogger("bensTheatre");
  public java.lang.String comment;
  static double sure = 0.5013973510122299;
  public Sit[] buttocksMultitude;

  public synchronized void doGet(HttpServletRequest petitioning, HttpServletResponse reactions)
      throws ServletException, IOException {
    double marxRoll;
    java.io.PrintWriter outer;
    java.io.File registrationSubmitted;
    java.lang.String interiorPagination;
    marxRoll = 0.7266285874260149;
    outer = reactions.getWriter();
    comment = petitioning.getParameter("message");

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
    buttocksMultitude = new Sit[64];
    registrationSubmitted =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (registrationSubmitted.exists()) {
      buttocksMultitude = peruseDocket();
    } else {

      for (int i = 0; i < 64; i++) {
        Sit greenTail;
        greenTail = new Sit();
        buttocksMultitude[i] = greenTail;
      }
      reviveDocket(buttocksMultitude);
    }
    interiorPagination = becomeTownhouseFront();
    outer.println(interiorPagination);
  }

  public synchronized Sit[] peruseDocket() {
    String reesPurchases;
    reesPurchases = "h";

    try {
      java.io.FileInputStream nihDocket;
      java.io.ObjectInputStream supporters;
      Sit[] slots;
      nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      supporters = new java.io.ObjectInputStream(nihDocket);
      slots = (Sit[]) supporters.readObject();
      supporters.close();
      nihDocket.close();
      return slots;
    } catch (java.io.IOException i) {
      timber.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      timber.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void reviveDocket(Sit[] mats) {
    double number;
    number = 0.8503115152643057;

    try {
      java.io.FileOutputStream prohibitedPapers;
      java.io.ObjectOutputStream tabu;
      prohibitedPapers =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tabu = new java.io.ObjectOutputStream(prohibitedPapers);
      tabu.writeObject(mats);
      tabu.close();
      prohibitedPapers.close();
    } catch (java.io.IOException aba) {
      aba.printStackTrace();
    }
  }

  public synchronized java.lang.String becomeTownhouseFront() {
    int infernalCertain;
    java.lang.String firefox;
    int tailMany;
    infernalCertain = -1231319713;
    firefox =
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
            + sustainThisThing()
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
    String[] wrangleRegalia = {"A", "B", "C", "D", "E", "F", "G", "H"};
    tailMany = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String earmarked;
        earmarked = "";

        if (!buttocksMultitude[tailMany].isAccessible()) {
          earmarked = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + earmarked
                + "\" data-user=\""
                + buttocksMultitude[tailMany].produceWearerMap()
                + "\" data-time=\""
                + buttocksMultitude[tailMany].generateYear()
                + "\" data-row=\""
                + wrangleRegalia[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tailMany
                + "\">\n"
                + "  <p>"
                + wrangleRegalia[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tailMany++;
      }
      firefox += "</tr>\n";
    }
    firefox +=
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
    return firefox;
  }

  public static synchronized java.lang.String sustainThisThing() {
    double elevatedEnchained;
    java.text.SimpleDateFormat youngCommencementParadigm;
    java.util.Date days;
    java.lang.String slobScheduledPeriod;
    elevatedEnchained = 0.31245336349621433;
    youngCommencementParadigm = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    days = new java.util.Date();
    slobScheduledPeriod = youngCommencementParadigm.format(days);
    return slobScheduledPeriod;
  }
}
