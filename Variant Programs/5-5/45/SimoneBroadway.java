import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class SimoneBroadway extends javax.servlet.http.HttpServlet {
  private static final int synX5534int = 64;
  private static final int synX5533int = 0;
  private static final String synX5532String = "";
  private static final String synX5531String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX5530String = "limitexceeded";
  private static final String synX5529String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX5528String = "success";
  private static final String synX5527String = "bensTheatre";
  private static final String synX5526String = "dd-MM-YY ss-MM-HH";
  private static final String synX5525String = "</html>";
  private static final String synX5524String = "  </body>\t\n";
  private static final String synX5523String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX5522String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX5521String = "    </div>\n";
  private static final String synX5520String = "      </div>\n";
  private static final String synX5519String = "        </div>\n";
  private static final String synX5518String = "          <button>OK</button>\n";
  private static final String synX5517String = "        <div class=\"close\">\n";
  private static final String synX5516String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX5515String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX5514String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX5513String = "      <div class=\"inner\">\n";
  private static final String synX5512String = "    <div id=\"popup\">\n";
  private static final String synX5511String = "    </footer>\n";
  private static final String synX5510String = "      </div>\n";
  private static final String synX5509String = "        <p>c3063467</p>\n";
  private static final String synX5508String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX5507String = "      <div class=\"author\">\n";
  private static final String synX5506String = "    <footer>\n";
  private static final String synX5505String = "    </article>\n";
  private static final String synX5504String = "      </div>\n";
  private static final String synX5503String = "        </div>\n";
  private static final String synX5502String = "          <p>Booked</p>\n";
  private static final String synX5501String = "        <div class=\"booked\">\n";
  private static final String synX5500String = "        </div>\n";
  private static final String synX5499String = "          <p>Available</p>\n";
  private static final String synX5498String = "        <div class=\"available\">\n";
  private static final String synX5497String = "      <div class=\"legend\">\n";
  private static final String synX5496String = "      </table>\n";
  private static final String synX5495String = "</tbody>\n";
  private static final String synX5494String = "</tr>\n";
  private static final String synX5493String = "</td>";
  private static final String synX5492String = "</p>\n";
  private static final int synX5491int = 1;
  private static final String synX5490String = "  <p>";
  private static final String synX5489String = "\">\n";
  private static final String synX5488String = "\" data-seatNumber=\"";
  private static final int synX5487int = 1;
  private static final String synX5486String = "\" data-seat=\"";
  private static final String synX5485String = "\" data-row=\"";
  private static final String synX5484String = "\" data-time=\"";
  private static final String synX5483String = "\" data-user=\"";
  private static final String synX5482String = "<td class=\"seat";
  private static final String synX5481String = " booked";
  private static final String synX5480String = "";
  private static final int synX5479int = 8;
  private static final int synX5478int = 0;
  private static final String synX5477String = "<tr>\n";
  private static final int synX5476int = 8;
  private static final int synX5475int = 0;
  private static final int synX5474int = 0;
  private static final String synX5473String = "H";
  private static final String synX5472String = "G";
  private static final String synX5471String = "F";
  private static final String synX5470String = "E";
  private static final String synX5469String = "D";
  private static final String synX5468String = "C";
  private static final String synX5467String = "B";
  private static final String synX5466String = "A";
  private static final String synX5465String = "        <tbody>";
  private static final String synX5464String = "        </thead>\n";
  private static final String synX5463String = "          </tr>\n";
  private static final String synX5462String = "            </td>\n";
  private static final String synX5461String = "              <p>Stage</p>\n";
  private static final String synX5460String = "            <td colspan=\"8\">\n";
  private static final String synX5459String = "          <tr>\n";
  private static final String synX5458String = "        <thead>\n";
  private static final String synX5457String = "      <table>\n";
  private static final String synX5456String = "      </div>\n";
  private static final String synX5455String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX5454String = "      <div class=\"instructions\">\n";
  private static final String synX5453String = "      </div>\n";
  private static final String synX5452String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX5451String = "        <p>";
  private static final String synX5450String = "      <div class=\"time\">\n";
  private static final String synX5449String = "      <h2>Seats</h2>\n";
  private static final String synX5448String = "</p>\n";
  private static final String synX5447String = "      <p class=\"message\">";
  private static final String synX5446String = "    <article>\n";
  private static final String synX5445String = "    </header>\n";
  private static final String synX5444String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX5443String = "    <header>\n";
  private static final String synX5442String = "  <body class=\"home\">\n";
  private static final String synX5441String = "  </head>\n";
  private static final String synX5440String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX5439String = "    <![endif]-->\n";
  private static final String synX5438String = "      </script>\n";
  private static final String synX5437String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX5436String = "    <!--[if IE]>\n";
  private static final String synX5435String = "    <title>Theatre Booking System</title>\n";
  private static final String synX5434String = "    <meta charset=utf-8>\n";
  private static final String synX5433String = "  <head>\n";
  private static final String synX5432String = "<html lang=\"en\">\n";
  private static final String synX5431String = "<!DOCTYPE html>\n";
  private static final String synX5430String = "/WEB-INF/bookingData.ser";
  private static final String synX5429String = "/WEB-INF/bookingData.ser";
  private static final String synX5428String = "/WEB-INF/bookingData.ser";
  private static final int synX5427int = 64;
  private static final String synX5426String = "message";
  public static java.util.logging.Logger recording;
  public java.lang.String messenger;
  public Bottom[] tooshiePortfolio;

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse intervention)
      throws ServletException, IOException {
    java.io.PrintWriter retired;
    java.io.File orderingDatabase;
    java.lang.String housePageboy;
    retired = intervention.getWriter();
    messenger = wishes.getParameter(synX5426String);

    if (messenger != null) synx156();
    else synx157();
    tooshiePortfolio = new Bottom[synX5427int];
    orderingDatabase = new java.io.File(getServletContext().getRealPath(synX5428String));

    if (orderingDatabase.exists()) synx158();
    else synx159();
    housePageboy = produceCentralAddendum();
    retired.println(housePageboy);
  }

  public synchronized Bottom[] readerInitiate() {

    try {
      java.io.FileInputStream proponentsDatabase;
      java.io.ObjectInputStream cbs;
      Bottom[] jobs;
      proponentsDatabase =
          new java.io.FileInputStream(getServletContext().getRealPath(synX5429String));
      cbs = new java.io.ObjectInputStream(proponentsDatabase);
      jobs = (Bottom[]) cbs.readObject();
      cbs.close();
      proponentsDatabase.close();
      return jobs;
    } catch (java.io.IOException i) {
      recording.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      recording.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void earnExecutable(Bottom[] chairs) {

    try {
      java.io.FileOutputStream outerSubmitted;
      java.io.ObjectOutputStream back;
      outerSubmitted =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX5430String));
      back = new java.io.ObjectOutputStream(outerSubmitted);
      back.writeObject(chairs);
      back.close();
      outerSubmitted.close();
    } catch (java.io.IOException officio) {
      officio.printStackTrace();
    }
  }

  public synchronized java.lang.String produceCentralAddendum() {
    java.lang.String powerpoint;
    int hindquartersNumerous;
    powerpoint =
        synX5431String
            + synX5432String
            + synX5433String
            + synX5434String
            + synX5435String
            + synX5436String
            + synX5437String
            + synX5438String
            + synX5439String
            + synX5440String
            + synX5441String
            + synX5442String
            + synX5443String
            + synX5444String
            + synX5445String
            + synX5446String
            + synX5447String
            + messenger
            + synX5448String
            + synX5449String
            + synX5450String
            + synX5451String
            + findActualSentence()
            + synX5452String
            + synX5453String
            + synX5454String
            + synX5455String
            + synX5456String
            + synX5457String
            + synX5458String
            + synX5459String
            + synX5460String
            + synX5461String
            + synX5462String
            + synX5463String
            + synX5464String
            + synX5465String;
    String[] packSuite = {
      synX5466String,
      synX5467String,
      synX5468String,
      synX5469String,
      synX5470String,
      synX5471String,
      synX5472String,
      synX5473String
    };
    hindquartersNumerous = synX5474int;
    {
      int i = synX5475int;

      while (i < synX5476int) {
        {
          {
            powerpoint += synX5477String;
            {
              int flier = synX5478int;

              while (flier < synX5479int) {
                {
                  {
                    java.lang.String leased;
                    leased = synX5480String;

                    if (!tooshiePortfolio[hindquartersNumerous].isAccessible()) {
                      leased = synX5481String;
                    }

                    powerpoint +=
                        synX5482String
                            + leased
                            + synX5483String
                            + tooshiePortfolio[hindquartersNumerous].receiveUsabilityCard()
                            + synX5484String
                            + tooshiePortfolio[hindquartersNumerous].drawWeek()
                            + synX5485String
                            + packSuite[i]
                            + synX5486String
                            + (flier + synX5487int)
                            + synX5488String
                            + hindquartersNumerous
                            + synX5489String
                            + synX5490String
                            + packSuite[i]
                            + (flier + synX5491int)
                            + synX5492String
                            + synX5493String;
                    hindquartersNumerous++;
                  }
                }
                flier++;
              }
            }
            powerpoint += synX5494String;
          }
        }
        i++;
      }
    }
    powerpoint +=
        synX5495String
            + synX5496String
            + synX5497String
            + synX5498String
            + synX5499String
            + synX5500String
            + synX5501String
            + synX5502String
            + synX5503String
            + synX5504String
            + synX5505String
            + synX5506String
            + synX5507String
            + synX5508String
            + synX5509String
            + synX5510String
            + synX5511String
            + synX5512String
            + synX5513String
            + synX5514String
            + synX5515String
            + synX5516String
            + synX5517String
            + synX5518String
            + synX5519String
            + synX5520String
            + synX5521String
            + synX5522String
            + synX5523String
            + synX5524String
            + synX5525String;
    return powerpoint;
  }

  public static synchronized java.lang.String findActualSentence() {
    java.text.SimpleDateFormat newfoundTimingFormula;
    java.util.Date days;
    java.lang.String muttEngagementClip;
    newfoundTimingFormula = new java.text.SimpleDateFormat(synX5526String);
    days = new java.util.Date();
    muttEngagementClip = newfoundTimingFormula.format(days);
    return muttEngagementClip;
  }

  static {
    recording = getLogger(synX5527String);
  }

  private synchronized void synx156() throws ServletException, IOException {

    if (messenger.equals(synX5528String)) {
      messenger = synX5529String;
    } else if (messenger.equals(synX5530String)) {
      messenger = synX5531String;
    }
  }

  private synchronized void synx157() throws ServletException, IOException {
    messenger = synX5532String;
  }

  private synchronized void synx158() throws ServletException, IOException {
    tooshiePortfolio = readerInitiate();
  }

  private synchronized void synx159() throws ServletException, IOException {
    {
      int i = synX5533int;

      while (i < synX5534int) {
        {
          {
            Bottom refreshingInduct;
            refreshingInduct = new Bottom();
            tooshiePortfolio[i] = refreshingInduct;
          }
        }
        i++;
      }
    }
    earnExecutable(tooshiePortfolio);
  }
}
