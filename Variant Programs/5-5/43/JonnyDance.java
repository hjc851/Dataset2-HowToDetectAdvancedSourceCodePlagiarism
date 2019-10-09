import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JonnyDance extends javax.servlet.http.HttpServlet {
  private static final int synX5314int = 64;
  private static final int synX5313int = 0;
  private static final String synX5312String = "";
  private static final String synX5311String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX5310String = "limitexceeded";
  private static final String synX5309String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX5308String = "success";
  private static final String synX5307String = "/WEB-INF/bookingData.ser";
  private static final String synX5306String = "XZKvtX0";
  private static final String synX5305String = "dd-MM-YY ss-MM-HH";
  private static final double synX5304double = 0.3133227315546099;
  private static final String synX5303String = "/WEB-INF/bookingData.ser";
  private static final double synX5302double = 0.22528606403657347;
  private static final String synX5301String = "</html>";
  private static final String synX5300String = "  </body>\t\n";
  private static final String synX5299String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX5298String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX5297String = "    </div>\n";
  private static final String synX5296String = "      </div>\n";
  private static final String synX5295String = "        </div>\n";
  private static final String synX5294String = "          <button>OK</button>\n";
  private static final String synX5293String = "        <div class=\"close\">\n";
  private static final String synX5292String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX5291String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX5290String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX5289String = "      <div class=\"inner\">\n";
  private static final String synX5288String = "    <div id=\"popup\">\n";
  private static final String synX5287String = "    </footer>\n";
  private static final String synX5286String = "      </div>\n";
  private static final String synX5285String = "        <p>c3063467</p>\n";
  private static final String synX5284String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX5283String = "      <div class=\"author\">\n";
  private static final String synX5282String = "    <footer>\n";
  private static final String synX5281String = "    </article>\n";
  private static final String synX5280String = "      </div>\n";
  private static final String synX5279String = "        </div>\n";
  private static final String synX5278String = "          <p>Booked</p>\n";
  private static final String synX5277String = "        <div class=\"booked\">\n";
  private static final String synX5276String = "        </div>\n";
  private static final String synX5275String = "          <p>Available</p>\n";
  private static final String synX5274String = "        <div class=\"available\">\n";
  private static final String synX5273String = "      <div class=\"legend\">\n";
  private static final String synX5272String = "      </table>\n";
  private static final String synX5271String = "</tbody>\n";
  private static final String synX5270String = "</tr>\n";
  private static final String synX5269String = "</td>";
  private static final String synX5268String = "</p>\n";
  private static final int synX5267int = 1;
  private static final String synX5266String = "  <p>";
  private static final String synX5265String = "\">\n";
  private static final String synX5264String = "\" data-seatNumber=\"";
  private static final int synX5263int = 1;
  private static final String synX5262String = "\" data-seat=\"";
  private static final String synX5261String = "\" data-row=\"";
  private static final String synX5260String = "\" data-time=\"";
  private static final String synX5259String = "\" data-user=\"";
  private static final String synX5258String = "<td class=\"seat";
  private static final String synX5257String = " booked";
  private static final String synX5256String = "";
  private static final int synX5255int = 8;
  private static final int synX5254int = 0;
  private static final String synX5253String = "<tr>\n";
  private static final int synX5252int = 8;
  private static final int synX5251int = 0;
  private static final int synX5250int = 0;
  private static final String synX5249String = "H";
  private static final String synX5248String = "G";
  private static final String synX5247String = "F";
  private static final String synX5246String = "E";
  private static final String synX5245String = "D";
  private static final String synX5244String = "C";
  private static final String synX5243String = "B";
  private static final String synX5242String = "A";
  private static final String synX5241String = "        <tbody>";
  private static final String synX5240String = "        </thead>\n";
  private static final String synX5239String = "          </tr>\n";
  private static final String synX5238String = "            </td>\n";
  private static final String synX5237String = "              <p>Stage</p>\n";
  private static final String synX5236String = "            <td colspan=\"8\">\n";
  private static final String synX5235String = "          <tr>\n";
  private static final String synX5234String = "        <thead>\n";
  private static final String synX5233String = "      <table>\n";
  private static final String synX5232String = "      </div>\n";
  private static final String synX5231String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX5230String = "      <div class=\"instructions\">\n";
  private static final String synX5229String = "      </div>\n";
  private static final String synX5228String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX5227String = "        <p>";
  private static final String synX5226String = "      <div class=\"time\">\n";
  private static final String synX5225String = "      <h2>Seats</h2>\n";
  private static final String synX5224String = "</p>\n";
  private static final String synX5223String = "      <p class=\"message\">";
  private static final String synX5222String = "    <article>\n";
  private static final String synX5221String = "    </header>\n";
  private static final String synX5220String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX5219String = "    <header>\n";
  private static final String synX5218String = "  <body class=\"home\">\n";
  private static final String synX5217String = "  </head>\n";
  private static final String synX5216String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX5215String = "    <![endif]-->\n";
  private static final String synX5214String = "      </script>\n";
  private static final String synX5213String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX5212String = "    <!--[if IE]>\n";
  private static final String synX5211String = "    <title>Theatre Booking System</title>\n";
  private static final String synX5210String = "    <meta charset=utf-8>\n";
  private static final String synX5209String = "  <head>\n";
  private static final String synX5208String = "<html lang=\"en\">\n";
  private static final String synX5207String = "<!DOCTYPE html>\n";
  private static final double synX5206double = 0.6243049030422311;
  private static final String synX5205String = "/WEB-INF/bookingData.ser";
  private static final int synX5204int = 64;
  private static final String synX5203String = "message";
  private static final double synX5202double = 0.11528956657026346;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse reacting)
      throws ServletException, IOException {
    double characteristic = synX5202double;
    java.io.PrintWriter quenched = reacting.getWriter();
    telegram = (asking.getParameter(synX5203String));

    if (telegram != null) synx151();
    else synx152();
    tooshiePortfolio = (new Rear[synX5204int]);
    java.io.File hiringExecutable =
        new java.io.File(getServletContext().getRealPath(synX5205String));

    if (hiringExecutable.exists()) synx153();
    else synx154();
    java.lang.String menageFootnote = becomeTownhouseFront();
    quenched.println(menageFootnote);
  }

  public synchronized java.lang.String becomeTownhouseFront() {
    double distinguish = synX5206double;
    java.lang.String powerpoint =
        (synX5207String
            + synX5208String
            + synX5209String
            + synX5210String
            + synX5211String
            + synX5212String
            + synX5213String
            + synX5214String
            + synX5215String
            + synX5216String
            + synX5217String
            + synX5218String
            + synX5219String
            + synX5220String
            + synX5221String
            + synX5222String
            + synX5223String
            + telegram
            + synX5224String
            + synX5225String
            + synX5226String
            + synX5227String
            + fixNewChance()
            + synX5228String
            + synX5229String
            + synX5230String
            + synX5231String
            + synX5232String
            + synX5233String
            + synX5234String
            + synX5235String
            + synX5236String
            + synX5237String
            + synX5238String
            + synX5239String
            + synX5240String
            + synX5241String);
    String[] penaltyPalette = {
      synX5242String,
      synX5243String,
      synX5244String,
      synX5245String,
      synX5246String,
      synX5247String,
      synX5248String,
      synX5249String
    };
    int assSeveral = synX5250int;

    for (int i = synX5251int; i < synX5252int; i++) {
      powerpoint += (synX5253String);

      for (int flier = synX5254int; flier < synX5255int; flier++) {
        java.lang.String leased = synX5256String;

        if (!tooshiePortfolio[assSeveral].isAccessible()) {
          leased = (synX5257String);
        }

        powerpoint +=
            ((synX5258String
                + leased
                + synX5259String
                + tooshiePortfolio[assSeveral].findLoginIdentifier()
                + synX5260String
                + tooshiePortfolio[assSeveral].receiveMoment()
                + synX5261String
                + penaltyPalette[i]
                + synX5262String
                + (flier + synX5263int)
                + synX5264String
                + assSeveral
                + synX5265String
                + synX5266String
                + penaltyPalette[i]
                + (flier + synX5267int)
                + synX5268String
                + synX5269String));
        assSeveral++;
      }
      powerpoint += (synX5270String);
    }
    powerpoint +=
        ((synX5271String
            + synX5272String
            + synX5273String
            + synX5274String
            + synX5275String
            + synX5276String
            + synX5277String
            + synX5278String
            + synX5279String
            + synX5280String
            + synX5281String
            + synX5282String
            + synX5283String
            + synX5284String
            + synX5285String
            + synX5286String
            + synX5287String
            + synX5288String
            + synX5289String
            + synX5290String
            + synX5291String
            + synX5292String
            + synX5293String
            + synX5294String
            + synX5295String
            + synX5296String
            + synX5297String
            + synX5298String
            + synX5299String
            + synX5300String
            + synX5301String));
    return powerpoint;
  }

  public synchronized void earnExecutable(Rear[] beds) {
    double netherTrammel = synX5302double;

    try {
      java.io.FileOutputStream unsuccessfulFolders =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX5303String));
      java.io.ObjectOutputStream outer = new java.io.ObjectOutputStream(unsuccessfulFolders);
      outer.writeObject(beds);
      outer.close();
      unsuccessfulFolders.close();
    } catch (java.io.IOException pro) {
      pro.printStackTrace();
    }
  }

  public static synchronized java.lang.String fixNewChance() {
    double demarcation = synX5304double;
    java.text.SimpleDateFormat recentYearStructure = new java.text.SimpleDateFormat(synX5305String);
    java.util.Date timing = new java.util.Date();
    java.lang.String essenceUpdateHour = recentYearStructure.format(timing);
    return essenceUpdateHour;
  }

  public Rear[] tooshiePortfolio = null;
  public static java.util.logging.Logger forester = null;
  public java.lang.String telegram = null;
  static final double nameBelongings = 0.9286840236152273;

  static {
    forester = (java.util.logging.Logger.getLogger("bensTheatre"));
  }

  public synchronized Rear[] showDocumentation() {
    String decreaseThresholds = synX5306String;

    try {
      Rear[] tickets = null;
      java.io.FileInputStream advocatesExecutable =
          new java.io.FileInputStream(getServletContext().getRealPath(synX5307String));
      java.io.ObjectInputStream proponents = new java.io.ObjectInputStream(advocatesExecutable);
      tickets = ((Rear[]) proponents.readObject());
      proponents.close();
      advocatesExecutable.close();
      return tickets;
    } catch (java.io.IOException i) {
      forester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      forester.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  private synchronized void synx151() throws ServletException, IOException {

    if (telegram.equals(synX5308String)) {
      telegram = (synX5309String);
    } else if (telegram.equals(synX5310String)) {
      telegram = (synX5311String);
    }
  }

  private synchronized void synx152() throws ServletException, IOException {
    telegram = (synX5312String);
  }

  private synchronized void synx153() throws ServletException, IOException {
    tooshiePortfolio = (showDocumentation());
  }

  private synchronized void synx154() throws ServletException, IOException {

    for (int i = synX5313int; i < synX5314int; i++) {
      Rear risingPrat = new Rear();
      tooshiePortfolio[i] = (risingPrat);
    }
    earnExecutable(tooshiePortfolio);
  }
}
