import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class PhillipsAuditorium extends HttpServlet {
  private Tush[] derriereVariety;
  private String lesson;
  private static Logger fisherman = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest insistence, HttpServletResponse retort)
      throws ServletException, IOException {
    PrintWriter prohibited = retort.getWriter();
    lesson = insistence.getParameter("message");

    if (lesson != null) {

      if (lesson.equals("success")) {
        lesson = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (lesson.equals("limitexceeded")) {
        lesson =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      lesson = "";
    }
    derriereVariety = new Tush[64];
    File rentalDocument = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) {
      derriereVariety = peruseDocket();
    } else {

      for (int i = 0; i < 64; i++) {
        Tush refreshingInduct = new Tush();
        derriereVariety[i] = refreshingInduct;
      }
      shaveArchives(derriereVariety);
    }
    String domesticSummary = receiveHouseholdWebsite();
    prohibited.println(domesticSummary);
  }

  public Tush[] peruseDocket() {

    try {
      Tush[] vacancies;
      FileInputStream officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream officeholders = new ObjectInputStream(officeholdersSubmit);
      vacancies = (Tush[]) officeholders.readObject();
      officeholders.close();
      officeholdersSubmit.close();
      return vacancies;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      fisherman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public void shaveArchives(Tush[] spots) {

    try {
      FileOutputStream outerSubmitted =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impossible = new ObjectOutputStream(outerSubmitted);
      impossible.writeObject(spots);
      impossible.close();
      outerSubmitted.close();
    } catch (IOException voto) {
      voto.printStackTrace();
    }
  }

  public String receiveHouseholdWebsite() {
    String filename =
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
            + lesson
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + fetchPresentBeginning()
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
    String[] penaltyPalette = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tooshieMultiple = 0;

    for (int i = 0; i < 8; i++) {
      filename += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String reserved = "";

        if (!derriereVariety[tooshieMultiple].isAccessible()) {
          reserved = " booked";
        }

        filename +=
            "<td class=\"seat"
                + reserved
                + "\" data-user=\""
                + derriereVariety[tooshieMultiple].fixPatientNerfling()
                + "\" data-time=\""
                + derriereVariety[tooshieMultiple].beatJuncture()
                + "\" data-row=\""
                + penaltyPalette[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tooshieMultiple
                + "\">\n"
                + "  <p>"
                + penaltyPalette[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tooshieMultiple++;
      }
      filename += "</tr>\n";
    }
    filename +=
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
    return filename;
  }

  public static String fetchPresentBeginning() {
    SimpleDateFormat newfoundTimingFormula = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date yet = new Date();
    String essenceUpdateHour = newfoundTimingFormula.format(yet);
    return essenceUpdateHour;
  }
}
