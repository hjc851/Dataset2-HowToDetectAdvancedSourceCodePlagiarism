import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends HttpServlet {
  private Fanny[] tooshiePortfolio;
  private String signal;
  private static Logger voyage = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asks, HttpServletResponse answer)
      throws ServletException, IOException {
    PrintWriter tabu = answer.getWriter();
    signal = asks.getParameter("message");

    if (signal != null) {

      if (signal.equals("success")) {
        signal = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (signal.equals("limitexceeded")) {
        signal =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      signal = "";
    }
    tooshiePortfolio = new Fanny[64];
    File ticketingCharge = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) {
      tooshiePortfolio = writeDatabase();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny unusedBuns = new Fanny();
        tooshiePortfolio[i] = unusedBuns;
      }
      safeguardArchiving(tooshiePortfolio);
    }
    String backTable = fixInternalPaper();
    tabu.println(backTable);
  }

  public Fanny[] writeDatabase() {

    try {
      Fanny[] chairs;
      FileInputStream advocatesExecutable =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nih = new ObjectInputStream(advocatesExecutable);
      chairs = (Fanny[]) nih.readObject();
      nih.close();
      advocatesExecutable.close();
      return chairs;
    } catch (IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      voyage.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void safeguardArchiving(Fanny[] jobs) {

    try {
      FileOutputStream awayRegister =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream exterior = new ObjectOutputStream(awayRegister);
      exterior.writeObject(jobs);
      exterior.close();
      awayRegister.close();
    } catch (IOException late) {
      late.printStackTrace();
    }
  }

  public String fixInternalPaper() {
    String firefox =
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
            + signal
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + findActualSentence()
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
    String[] disputeMyriad = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bumFewer = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String confined = "";

        if (!tooshiePortfolio[bumFewer].isAccessible()) {
          confined = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + confined
                + "\" data-user=\""
                + tooshiePortfolio[bumFewer].makeUsernameDimidiate()
                + "\" data-time=\""
                + tooshiePortfolio[bumFewer].catchWhen()
                + "\" data-row=\""
                + disputeMyriad[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + bumFewer
                + "\">\n"
                + "  <p>"
                + disputeMyriad[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        bumFewer++;
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

  public static String findActualSentence() {
    SimpleDateFormat newbornPaymentFile = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date update = new Date();
    String damnedDeadlineWhen = newbornPaymentFile.format(update);
    return damnedDeadlineWhen;
  }
}
