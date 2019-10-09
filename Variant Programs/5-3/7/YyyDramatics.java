import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class YyyDramatics extends HttpServlet {

  public synchronized Prat[] writtenFilename() {

    try {
      Prat[] elections;
      FileInputStream nihDocket =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nii = new ObjectInputStream(nihDocket);
      elections = (Prat[]) nii.readObject();
      nii.close();
      nihDocket.close();
      return elections;
    } catch (IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      rancher.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void doGet(HttpServletRequest bespeak, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    PrintWriter unfashionable = responsiveness.getWriter();
    substance = bespeak.getParameter("message");

    if (substance != null) {

      if (substance.equals("success")) {
        substance = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (substance.equals("limitexceeded")) {
        substance =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      substance = "";
    }
    inductMultiple = new Prat[64];
    File reservationsSubmit = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservationsSubmit.exists()) {
      inductMultiple = writtenFilename();
    } else {

      for (int i = 0; i < 64; i++) {
        Prat babyBum = new Prat();
        inductMultiple[i] = babyBum;
      }
      protectComplaint(inductMultiple);
    }
    String abodeWebpage = canResidenceScreen();
    unfashionable.println(abodeWebpage);
  }

  public static synchronized String conveyFormerAmount() {
    SimpleDateFormat newbornPaymentFile = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date update = new Date();
    String muttEngagementClip = newbornPaymentFile.format(update);
    return muttEngagementClip;
  }

  public Prat[] inductMultiple;
  public String substance;
  public static Logger rancher = Logger.getLogger("bensTheatre");

  public synchronized String canResidenceScreen() {
    String parser =
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
            + substance
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
    String[] disputeMyriad = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int placeList = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String arranged = "";

        if (!inductMultiple[placeList].isAccessible()) {
          arranged = " booked";
        }

        parser +=
            "<td class=\"seat"
                + arranged
                + "\" data-user=\""
                + inductMultiple[placeList].haveSubscriberHandle()
                + "\" data-time=\""
                + inductMultiple[placeList].drawWeek()
                + "\" data-row=\""
                + disputeMyriad[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + placeList
                + "\">\n"
                + "  <p>"
                + disputeMyriad[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        placeList++;
      }
      parser += "</tr>\n";
    }
    parser +=
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
    return parser;
  }

  public synchronized void protectComplaint(Prat[] jobs) {

    try {
      FileOutputStream awayRegister =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(awayRegister);
      kayoed.writeObject(jobs);
      kayoed.close();
      awayRegister.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }
}
