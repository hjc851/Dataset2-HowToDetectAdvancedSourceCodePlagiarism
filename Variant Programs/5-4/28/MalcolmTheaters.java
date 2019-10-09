import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class MalcolmTheaters extends HttpServlet {
  public static Logger skidder = Logger.getLogger("bensTheatre");
  static final int indictment = -885358835;

  public synchronized String developApartmentLayout() {
    int restrain;
    String powerpoint;
    int canQuantity;
    restrain = 1490758398;
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
            + impression
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
    String[] wordsFinery = {"A", "B", "C", "D", "E", "F", "G", "H"};
    canQuantity = 0;

    for (int i = 0; i < 8; i++) {
      powerpoint += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String confined;
        confined = "";

        if (!assCollection[canQuantity].isAccessible()) {
          confined = " booked";
        }

        powerpoint +=
            "<td class=\"seat"
                + confined
                + "\" data-user=\""
                + assCollection[canQuantity].receiveUsabilityCard()
                + "\" data-time=\""
                + assCollection[canQuantity].takePeriod()
                + "\" data-row=\""
                + wordsFinery[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + canQuantity
                + "\">\n"
                + "  <p>"
                + wordsFinery[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        canQuantity++;
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

  public synchronized void safeguardArchiving(Tooshie[] beds) {
    double maximumBreadth;
    maximumBreadth = 0.7553337216731044;

    try {
      FileOutputStream downLodge;
      ObjectOutputStream outgoing;
      downLodge = new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      outgoing = new ObjectOutputStream(downLodge);
      outgoing.writeObject(beds);
      outgoing.close();
      downLodge.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public Tooshie[] assCollection;

  public synchronized Tooshie[] aloudApplication() {
    double numeration;
    numeration = 0.657859143545744;

    try {
      FileInputStream withoutRegister;
      ObjectInputStream nsis;
      Tooshie[] jobs;
      withoutRegister =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsis = new ObjectInputStream(withoutRegister);
      jobs = (Tooshie[]) nsis.readObject();
      nsis.close();
      withoutRegister.close();
      return jobs;
    } catch (IOException i) {
      skidder.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      skidder.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public String impression;

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse reactions)
      throws ServletException, IOException {
    int greatest;
    PrintWriter retired;
    File rentalDocument;
    String menageFootnote;
    greatest = -945015760;
    retired = reactions.getWriter();
    impression = suggestion.getParameter("message");

    if (impression != null) {

      if (impression.equals("success")) {
        impression = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (impression.equals("limitexceeded")) {
        impression =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      impression = "";
    }
    assCollection = new Tooshie[64];
    rentalDocument = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) {
      assCollection = aloudApplication();
    } else {

      for (int i = 0; i < 64; i++) {
        Tooshie otherButt;
        otherButt = new Tooshie();
        assCollection[i] = otherButt;
      }
      safeguardArchiving(assCollection);
    }
    menageFootnote = developApartmentLayout();
    retired.println(menageFootnote);
  }

  public static synchronized String conveyFormerAmount() {
    double operative;
    SimpleDateFormat hotNotificationForm;
    Date calendar;
    String coreReceiptWeek;
    operative = 0.08559269923425783;
    hotNotificationForm = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    calendar = new Date();
    coreReceiptWeek = hotNotificationForm.format(calendar);
    return coreReceiptWeek;
  }
}
