import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class IainAmphitheatre extends HttpServlet {
  private static final String synX455String = "dd-MM-YY ss-MM-HH";
  private static final String synX454String = "</html>";
  private static final String synX453String = "  </body>\t\n";
  private static final String synX452String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX451String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX450String = "    </div>\n";
  private static final String synX449String = "      </div>\n";
  private static final String synX448String = "        </div>\n";
  private static final String synX447String = "          <button>OK</button>\n";
  private static final String synX446String = "        <div class=\"close\">\n";
  private static final String synX445String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX444String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX443String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX442String = "      <div class=\"inner\">\n";
  private static final String synX441String = "    <div id=\"popup\">\n";
  private static final String synX440String = "    </footer>\n";
  private static final String synX439String = "      </div>\n";
  private static final String synX438String = "        <p>c3063467</p>\n";
  private static final String synX437String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX436String = "      <div class=\"author\">\n";
  private static final String synX435String = "    <footer>\n";
  private static final String synX434String = "    </article>\n";
  private static final String synX433String = "      </div>\n";
  private static final String synX432String = "        </div>\n";
  private static final String synX431String = "          <p>Booked</p>\n";
  private static final String synX430String = "        <div class=\"booked\">\n";
  private static final String synX429String = "        </div>\n";
  private static final String synX428String = "          <p>Available</p>\n";
  private static final String synX427String = "        <div class=\"available\">\n";
  private static final String synX426String = "      <div class=\"legend\">\n";
  private static final String synX425String = "      </table>\n";
  private static final String synX424String = "</tbody>\n";
  private static final String synX423String = "</tr>\n";
  private static final String synX422String = "</td>";
  private static final String synX421String = "</p>\n";
  private static final int synX420int = 1;
  private static final String synX419String = "  <p>";
  private static final String synX418String = "\">\n";
  private static final String synX417String = "\" data-seatNumber=\"";
  private static final int synX416int = 1;
  private static final String synX415String = "\" data-seat=\"";
  private static final String synX414String = "\" data-row=\"";
  private static final String synX413String = "\" data-time=\"";
  private static final String synX412String = "\" data-user=\"";
  private static final String synX411String = "<td class=\"seat";
  private static final String synX410String = " booked";
  private static final String synX409String = "";
  private static final int synX408int = 8;
  private static final int synX407int = 0;
  private static final String synX406String = "<tr>\n";
  private static final int synX405int = 8;
  private static final int synX404int = 0;
  private static final int synX403int = 0;
  private static final String synX402String = "H";
  private static final String synX401String = "G";
  private static final String synX400String = "F";
  private static final String synX399String = "E";
  private static final String synX398String = "D";
  private static final String synX397String = "C";
  private static final String synX396String = "B";
  private static final String synX395String = "A";
  private static final String synX394String = "        <tbody>";
  private static final String synX393String = "        </thead>\n";
  private static final String synX392String = "          </tr>\n";
  private static final String synX391String = "            </td>\n";
  private static final String synX390String = "              <p>Stage</p>\n";
  private static final String synX389String = "            <td colspan=\"8\">\n";
  private static final String synX388String = "          <tr>\n";
  private static final String synX387String = "        <thead>\n";
  private static final String synX386String = "      <table>\n";
  private static final String synX385String = "      </div>\n";
  private static final String synX384String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX383String = "      <div class=\"instructions\">\n";
  private static final String synX382String = "      </div>\n";
  private static final String synX381String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX380String = "        <p>";
  private static final String synX379String = "      <div class=\"time\">\n";
  private static final String synX378String = "      <h2>Seats</h2>\n";
  private static final String synX377String = "</p>\n";
  private static final String synX376String = "      <p class=\"message\">";
  private static final String synX375String = "    <article>\n";
  private static final String synX374String = "    </header>\n";
  private static final String synX373String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX372String = "    <header>\n";
  private static final String synX371String = "  <body class=\"home\">\n";
  private static final String synX370String = "  </head>\n";
  private static final String synX369String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX368String = "    <![endif]-->\n";
  private static final String synX367String = "      </script>\n";
  private static final String synX366String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX365String = "    <!--[if IE]>\n";
  private static final String synX364String = "    <title>Theatre Booking System</title>\n";
  private static final String synX363String = "    <meta charset=utf-8>\n";
  private static final String synX362String = "  <head>\n";
  private static final String synX361String = "<html lang=\"en\">\n";
  private static final String synX360String = "<!DOCTYPE html>\n";
  private static final String synX359String = "/WEB-INF/bookingData.ser";
  private static final String synX358String = "/WEB-INF/bookingData.ser";
  private static final int synX357int = 64;
  private static final int synX356int = 0;
  private static final String synX355String = "/WEB-INF/bookingData.ser";
  private static final int synX354int = 64;
  private static final String synX353String = "";
  private static final String synX352String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX351String = "limitexceeded";
  private static final String synX350String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX349String = "success";
  private static final String synX348String = "message";
  public static Logger voyage = Logger.getLogger("bensTheatre");
  public String impression = null;
  public Tooshie[] tooshiePortfolio = null;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse responded)
      throws ServletException, IOException {
    PrintWriter unconscious;
    File ticketFolder;
    String housesContents;
    unconscious = (responded.getWriter());
    impression = (motion.getParameter(synX348String));

    if (impression != null) {

      if (impression.equals(synX349String)) {
        impression = (synX350String);
      } else if (impression.equals(synX351String)) {
        impression = (synX352String);
      }

    } else {
      impression = (synX353String);
    }
    tooshiePortfolio = (new Tooshie[synX354int]);
    ticketFolder = (new File(getServletContext().getRealPath(synX355String)));

    if (ticketFolder.exists()) {
      tooshiePortfolio = (hearBinder());
    } else {

      for (int i = synX356int; i < synX357int; i++) {
        Tooshie recentlyDerriere;
        recentlyDerriere = (new Tooshie());
        tooshiePortfolio[i] = (recentlyDerriere);
      }
      salveDocumentation(tooshiePortfolio);
    }
    housesContents = (conveyMansionAnnexes());
    unconscious.println(housesContents);
  }

  public synchronized Tooshie[] hearBinder() {

    try {
      FileInputStream establishmentFolders;
      ObjectInputStream tenants;
      Tooshie[] passengers = null;
      establishmentFolders = (new FileInputStream(getServletContext().getRealPath(synX358String)));
      tenants = (new ObjectInputStream(establishmentFolders));
      passengers = ((Tooshie[]) tenants.readObject());
      tenants.close();
      establishmentFolders.close();
      return passengers;
    } catch (IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      voyage.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void salveDocumentation(Tooshie[] votes) {

    try {
      FileOutputStream stunnedFolder;
      ObjectOutputStream extinguished;
      stunnedFolder = (new FileOutputStream(getServletContext().getRealPath(synX359String)));
      extinguished = (new ObjectOutputStream(stunnedFolder));
      extinguished.writeObject(votes);
      extinguished.close();
      stunnedFolder.close();
    } catch (IOException former) {
      former.printStackTrace();
    }
  }

  public synchronized String conveyMansionAnnexes() {
    String bitmap;
    int sitTotal;
    bitmap =
        ((synX360String
            + synX361String
            + synX362String
            + synX363String
            + synX364String
            + synX365String
            + synX366String
            + synX367String
            + synX368String
            + synX369String
            + synX370String
            + synX371String
            + synX372String
            + synX373String
            + synX374String
            + synX375String
            + synX376String
            + impression
            + synX377String
            + synX378String
            + synX379String
            + synX380String
            + takeTopicalPeriod()
            + synX381String
            + synX382String
            + synX383String
            + synX384String
            + synX385String
            + synX386String
            + synX387String
            + synX388String
            + synX389String
            + synX390String
            + synX391String
            + synX392String
            + synX393String
            + synX394String));
    String[] tiffMix = {
      synX395String,
      synX396String,
      synX397String,
      synX398String,
      synX399String,
      synX400String,
      synX401String,
      synX402String
    };
    sitTotal = (synX403int);

    for (int i = synX404int; i < synX405int; i++) {
      bitmap += (bitmap + synX406String);

      for (int flier = synX407int; flier < synX408int; flier++) {
        String withheld;
        withheld = (synX409String);

        if (!tooshiePortfolio[sitTotal].isAccessible()) {
          withheld = (synX410String);
        }

        bitmap +=
            (bitmap
                + (synX411String
                    + withheld
                    + synX412String
                    + tooshiePortfolio[sitTotal].receiveUsabilityCard()
                    + synX413String
                    + tooshiePortfolio[sitTotal].beatJuncture()
                    + synX414String
                    + tiffMix[i]
                    + synX415String
                    + (flier + synX416int)
                    + synX417String
                    + sitTotal
                    + synX418String
                    + synX419String
                    + tiffMix[i]
                    + (flier + synX420int)
                    + synX421String
                    + synX422String));
        sitTotal++;
      }
      bitmap += (bitmap + synX423String);
    }
    bitmap +=
        (bitmap
            + (synX424String
                + synX425String
                + synX426String
                + synX427String
                + synX428String
                + synX429String
                + synX430String
                + synX431String
                + synX432String
                + synX433String
                + synX434String
                + synX435String
                + synX436String
                + synX437String
                + synX438String
                + synX439String
                + synX440String
                + synX441String
                + synX442String
                + synX443String
                + synX444String
                + synX445String
                + synX446String
                + synX447String
                + synX448String
                + synX449String
                + synX450String
                + synX451String
                + synX452String
                + synX453String
                + synX454String));
    return bitmap;
  }

  public static synchronized String takeTopicalPeriod() {
    SimpleDateFormat recentYearStructure;
    Date notification;
    String midstUpdatedOpportunity;
    recentYearStructure = (new SimpleDateFormat(synX455String));
    notification = (new Date());
    midstUpdatedOpportunity = (recentYearStructure.format(notification));
    return midstUpdatedOpportunity;
  }
}
