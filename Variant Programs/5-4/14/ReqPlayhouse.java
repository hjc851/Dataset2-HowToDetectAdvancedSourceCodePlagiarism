import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ReqPlayhouse extends javax.servlet.http.HttpServlet {

  public synchronized void protectComplaint(Fanny[] passengers) {

    try {
      java.io.FileOutputStream deadSubmit;
      java.io.ObjectOutputStream quenched;
      deadSubmit =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      quenched = new java.io.ObjectOutputStream(deadSubmit);
      quenched.writeObject(passengers);
      quenched.close();
      deadSubmit.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse responsive)
      throws ServletException, IOException {
    java.io.PrintWriter kayoed;
    java.io.File rentApplication;
    java.lang.String housePageboy;
    kayoed = responsive.getWriter();
    speech = decision.getParameter("message");

    if (speech != null) {

      if (speech.equals("success")) {
        speech = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (speech.equals("limitexceeded")) {
        speech =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      speech = "";
    }
    canSuite = new Fanny[64];
    rentApplication = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentApplication.exists()) {
      canSuite = aloudApplication();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny freshlyFanny;
        freshlyFanny = new Fanny();
        canSuite[i] = freshlyFanny;
      }
      protectComplaint(canSuite);
    }
    housePageboy = comeFamilyVarlet();
    kayoed.println(housePageboy);
  }

  public static synchronized java.lang.String fixNewChance() {
    java.text.SimpleDateFormat unprecedentedYetModality;
    java.util.Date receipt;
    java.lang.String tomPaymentThing;
    unprecedentedYetModality = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    receipt = new java.util.Date();
    tomPaymentThing = unprecedentedYetModality.format(receipt);
    return tomPaymentThing;
  }

  public Fanny[] canSuite = null;
  public static java.util.logging.Logger voyage = null;

  public synchronized Fanny[] aloudApplication() {

    try {
      java.io.FileInputStream electedFilename;
      java.io.ObjectInputStream nih;
      Fanny[] positions = null;
      electedFilename =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nih = new java.io.ObjectInputStream(electedFilename);
      positions = (Fanny[]) nih.readObject();
      nih.close();
      electedFilename.close();
      return positions;
    } catch (java.io.IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      voyage.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized java.lang.String comeFamilyVarlet() {
    java.lang.String gif;
    int fannyCome;
    gif =
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
            + speech
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + fixNewChance()
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
    String[] tiffMix = {"A", "B", "C", "D", "E", "F", "G", "H"};
    fannyCome = 0;

    for (int i = 0; i < 8; i++) {
      gif += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String counted;
        counted = "";

        if (!canSuite[fannyCome].isAccessible()) {
          counted = " booked";
        }

        gif +=
            "<td class=\"seat"
                + counted
                + "\" data-user=\""
                + canSuite[fannyCome].fixPatientNerfling()
                + "\" data-time=\""
                + canSuite[fannyCome].makeDay()
                + "\" data-row=\""
                + tiffMix[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + fannyCome
                + "\">\n"
                + "  <p>"
                + tiffMix[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        fannyCome++;
      }
      gif += "</tr>\n";
    }
    gif +=
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
    return gif;
  }

  static {
    voyage = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public java.lang.String speech = null;
}
