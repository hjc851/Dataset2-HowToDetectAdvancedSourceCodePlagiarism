import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class IainAmphitheatre extends javax.servlet.http.HttpServlet {

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse respond)
      throws ServletException, IOException {
    double indictment;
    java.io.PrintWriter impossible;
    java.io.File subscriptionArchives;
    java.lang.String hometownChapter;
    indictment = 0.5235330721055326;
    impossible = respond.getWriter();
    word = appeal.getParameter("message");

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
    keisterMyriad = new Invest[64];
    subscriptionArchives =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (subscriptionArchives.exists()) {
      keisterMyriad = proofreadComplaint();
    } else {

      for (int i = 0; i < 64; i++) {
        Invest newbornBottom;
        newbornBottom = new Invest();
        keisterMyriad[i] = newbornBottom;
      }
      salvageCharge(keisterMyriad);
    }
    hometownChapter = bringAbodeWebpage();
    impossible.println(hometownChapter);
  }

  public java.lang.String word = null;

  public static synchronized java.lang.String arriveFlowMonth() {
    int sure;
    java.text.SimpleDateFormat revolutionaryTimeframeTemplate;
    java.util.Date receipt;
    java.lang.String crossbredSeeMeter;
    sure = 539694675;
    revolutionaryTimeframeTemplate = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    receipt = new java.util.Date();
    crossbredSeeMeter = revolutionaryTimeframeTemplate.format(receipt);
    return crossbredSeeMeter;
  }

  public Invest[] keisterMyriad = null;

  public synchronized Invest[] proofreadComplaint() {
    String narrowerMax;
    narrowerMax = "8vdIHf";

    try {
      java.io.FileInputStream officeholdersSubmit;
      java.io.ObjectInputStream elected;
      Invest[] mats = null;
      officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      elected = new java.io.ObjectInputStream(officeholdersSubmit);
      mats = (Invest[]) elected.readObject();
      elected.close();
      officeholdersSubmit.close();
      return mats;
    } catch (java.io.IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      forestry.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Invest[] space) {
    double tied;
    tied = 0.5094681947314503;

    try {
      java.io.FileOutputStream awayRegister;
      java.io.ObjectOutputStream proscribed;
      awayRegister =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      proscribed = new java.io.ObjectOutputStream(awayRegister);
      proscribed.writeObject(space);
      proscribed.close();
      awayRegister.close();
    } catch (java.io.IOException appointed) {
      appointed.printStackTrace();
    }
  }

  static double cite = 0.6290368841418619;
  public static java.util.logging.Logger forestry =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized java.lang.String bringAbodeWebpage() {
    double sense;
    java.lang.String drupal;
    int keisterRoutine;
    sense = 0.1315466607195379;
    drupal =
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
    String[] wranglingNumber = {"A", "B", "C", "D", "E", "F", "G", "H"};
    keisterRoutine = 0;

    for (int i = 0; i < 8; i++) {
      drupal += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String entered;
        entered = "";

        if (!keisterMyriad[keisterRoutine].isAccessible()) {
          entered = " booked";
        }

        drupal +=
            "<td class=\"seat"
                + entered
                + "\" data-user=\""
                + keisterMyriad[keisterRoutine].comeEnjoyerMilad()
                + "\" data-time=\""
                + keisterMyriad[keisterRoutine].comeClip()
                + "\" data-row=\""
                + wranglingNumber[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + keisterRoutine
                + "\">\n"
                + "  <p>"
                + wranglingNumber[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        keisterRoutine++;
      }
      drupal += "</tr>\n";
    }
    drupal +=
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
    return drupal;
  }
}
