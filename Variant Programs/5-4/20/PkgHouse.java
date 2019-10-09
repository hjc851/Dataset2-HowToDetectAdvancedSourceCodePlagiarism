import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class PkgHouse extends HttpServlet {

  public static synchronized String driveContinuingAgain() {
    double lessDestined;
    SimpleDateFormat untestedDeadlineApproach;
    Date escort;
    String tomPaymentThing;
    lessDestined = 0.031912024040666176;
    untestedDeadlineApproach = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    escort = new Date();
    tomPaymentThing = untestedDeadlineApproach.format(escort);
    return tomPaymentThing;
  }

  public synchronized void rescuingReadme(Rear[] slots) {
    String elevationDemarcation;
    elevationDemarcation = "eGErlNqS8OR0nG4";

    try {
      FileOutputStream exteriorReadme;
      ObjectOutputStream proscribed;
      exteriorReadme =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      proscribed = new ObjectOutputStream(exteriorReadme);
      proscribed.writeObject(slots);
      proscribed.close();
      exteriorReadme.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }

  private String note;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse reply)
      throws ServletException, IOException {
    double limit;
    PrintWriter quenched;
    File detentionData;
    String interiorPagination;
    limit = 0.3702525812691321;
    quenched = reply.getWriter();
    note = asking.getParameter("message");

    if (note != null) {

      if (note.equals("success")) {
        note = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (note.equals("limitexceeded")) {
        note =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      note = "";
    }
    placeAlign = new Rear[64];
    detentionData = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (detentionData.exists()) {
      placeAlign = understandCharge();
    } else {

      for (int i = 0; i < 64; i++) {
        Rear untestedBehind;
        untestedBehind = new Rear();
        placeAlign[i] = untestedBehind;
      }
      rescuingReadme(placeAlign);
    }
    interiorPagination = sustainBackTable();
    quenched.println(interiorPagination);
  }

  private Rear[] placeAlign;

  static {
    voyage = Logger.getLogger("bensTheatre");
  }

  public synchronized String sustainBackTable() {
    int reduceConstrain;
    String powerpoint;
    int buttHandful;
    reduceConstrain = 974254386;
    powerpoint =
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
            + note
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + driveContinuingAgain()
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
    buttHandful = 0;

    for (int i = 0; i < 8; i++) {
      powerpoint += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String rented;
        rented = "";

        if (!placeAlign[buttHandful].isAccessible()) {
          rented = " booked";
        }

        powerpoint +=
            "<td class=\"seat"
                + rented
                + "\" data-user=\""
                + placeAlign[buttHandful].beatLearnerUser()
                + "\" data-time=\""
                + placeAlign[buttHandful].comeClip()
                + "\" data-row=\""
                + dustupRange[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + buttHandful
                + "\">\n"
                + "  <p>"
                + dustupRange[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        buttHandful++;
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

  private static Logger voyage;
  static final int measure = 324611885;

  public synchronized Rear[] understandCharge() {
    double circumscribe;
    circumscribe = 0.3342060974634925;

    try {
      FileInputStream incumbentsSubmitting;
      ObjectInputStream immigration;
      Rear[] elects;
      incumbentsSubmitting =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      immigration = new ObjectInputStream(incumbentsSubmitting);
      elects = (Rear[]) immigration.readObject();
      immigration.close();
      incumbentsSubmitting.close();
      return elects;
    } catch (IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      voyage.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }
}
