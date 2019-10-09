import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class AstonArts extends javax.servlet.http.HttpServlet {
  private static final String synX887String = "dd-MM-YY ss-MM-HH";
  private static final String synX886String = "/WEB-INF/bookingData.ser";
  private static final String synX885String = "</html>";
  private static final String synX884String = "  </body>\t\n";
  private static final String synX883String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX882String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX881String = "    </div>\n";
  private static final String synX880String = "      </div>\n";
  private static final String synX879String = "        </div>\n";
  private static final String synX878String = "          <button>OK</button>\n";
  private static final String synX877String = "        <div class=\"close\">\n";
  private static final String synX876String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX875String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX874String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX873String = "      <div class=\"inner\">\n";
  private static final String synX872String = "    <div id=\"popup\">\n";
  private static final String synX871String = "    </footer>\n";
  private static final String synX870String = "      </div>\n";
  private static final String synX869String = "        <p>c3063467</p>\n";
  private static final String synX868String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX867String = "      <div class=\"author\">\n";
  private static final String synX866String = "    <footer>\n";
  private static final String synX865String = "    </article>\n";
  private static final String synX864String = "      </div>\n";
  private static final String synX863String = "        </div>\n";
  private static final String synX862String = "          <p>Booked</p>\n";
  private static final String synX861String = "        <div class=\"booked\">\n";
  private static final String synX860String = "        </div>\n";
  private static final String synX859String = "          <p>Available</p>\n";
  private static final String synX858String = "        <div class=\"available\">\n";
  private static final String synX857String = "      <div class=\"legend\">\n";
  private static final String synX856String = "      </table>\n";
  private static final String synX855String = "</tbody>\n";
  private static final String synX854String = "</tr>\n";
  private static final String synX853String = "</td>";
  private static final String synX852String = "</p>\n";
  private static final int synX851int = 1;
  private static final String synX850String = "  <p>";
  private static final String synX849String = "\">\n";
  private static final String synX848String = "\" data-seatNumber=\"";
  private static final int synX847int = 1;
  private static final String synX846String = "\" data-seat=\"";
  private static final String synX845String = "\" data-row=\"";
  private static final String synX844String = "\" data-time=\"";
  private static final String synX843String = "\" data-user=\"";
  private static final String synX842String = "<td class=\"seat";
  private static final String synX841String = " booked";
  private static final String synX840String = "";
  private static final int synX839int = 8;
  private static final int synX838int = 0;
  private static final String synX837String = "<tr>\n";
  private static final int synX836int = 8;
  private static final int synX835int = 0;
  private static final int synX834int = 0;
  private static final String synX833String = "H";
  private static final String synX832String = "G";
  private static final String synX831String = "F";
  private static final String synX830String = "E";
  private static final String synX829String = "D";
  private static final String synX828String = "C";
  private static final String synX827String = "B";
  private static final String synX826String = "A";
  private static final String synX825String = "        <tbody>";
  private static final String synX824String = "        </thead>\n";
  private static final String synX823String = "          </tr>\n";
  private static final String synX822String = "            </td>\n";
  private static final String synX821String = "              <p>Stage</p>\n";
  private static final String synX820String = "            <td colspan=\"8\">\n";
  private static final String synX819String = "          <tr>\n";
  private static final String synX818String = "        <thead>\n";
  private static final String synX817String = "      <table>\n";
  private static final String synX816String = "      </div>\n";
  private static final String synX815String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX814String = "      <div class=\"instructions\">\n";
  private static final String synX813String = "      </div>\n";
  private static final String synX812String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX811String = "        <p>";
  private static final String synX810String = "      <div class=\"time\">\n";
  private static final String synX809String = "      <h2>Seats</h2>\n";
  private static final String synX808String = "</p>\n";
  private static final String synX807String = "      <p class=\"message\">";
  private static final String synX806String = "    <article>\n";
  private static final String synX805String = "    </header>\n";
  private static final String synX804String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX803String = "    <header>\n";
  private static final String synX802String = "  <body class=\"home\">\n";
  private static final String synX801String = "  </head>\n";
  private static final String synX800String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX799String = "    <![endif]-->\n";
  private static final String synX798String = "      </script>\n";
  private static final String synX797String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX796String = "    <!--[if IE]>\n";
  private static final String synX795String = "    <title>Theatre Booking System</title>\n";
  private static final String synX794String = "    <meta charset=utf-8>\n";
  private static final String synX793String = "  <head>\n";
  private static final String synX792String = "<html lang=\"en\">\n";
  private static final String synX791String = "<!DOCTYPE html>\n";
  private static final String synX790String = "/WEB-INF/bookingData.ser";
  private static final int synX789int = 64;
  private static final int synX788int = 0;
  private static final String synX787String = "/WEB-INF/bookingData.ser";
  private static final int synX786int = 64;
  private static final String synX785String = "";
  private static final String synX784String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX783String = "limitexceeded";
  private static final String synX782String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX781String = "success";
  private static final String synX780String = "message";

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse reply)
      throws ServletException, IOException {
    java.io.PrintWriter dead;
    java.io.File registerArchiving;
    java.lang.String menageFootnote;
    dead = (reply.getWriter());
    substance = (quest.getParameter(synX780String));

    if (substance != null) {

      if (substance.equals(synX781String)) {
        substance = (synX782String);
      } else if (substance.equals(synX783String)) {
        substance = (synX784String);
      }

    } else {
      substance = (synX785String);
    }
    tooshiePortfolio = (new Bum[synX786int]);
    registerArchiving = (new java.io.File(getServletContext().getRealPath(synX787String)));

    if (registerArchiving.exists()) {
      tooshiePortfolio = (peruseDocket());
    } else {
      {
        int i = synX788int;

        while (i < synX789int) {
          {
            {
              Bum otherButt;
              otherButt = (new Bum());
              tooshiePortfolio[i] = (otherButt);
            }
          }
          i++;
        }
      }
      redeemDocuments(tooshiePortfolio);
    }
    menageFootnote = (letNationalTab());
    dead.println(menageFootnote);
  }

  public synchronized Bum[] peruseDocket() {

    try {
      java.io.FileInputStream establishmentFolders;
      java.io.ObjectInputStream tenants;
      Bum[] tickets = null;
      establishmentFolders =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX790String)));
      tenants = (new java.io.ObjectInputStream(establishmentFolders));
      tickets = ((Bum[]) tenants.readObject());
      tenants.close();
      establishmentFolders.close();
      return tickets;
    } catch (java.io.IOException i) {
      timber.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      timber.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public static java.util.logging.Logger timber = null;
  public Bum[] tooshiePortfolio = null;

  static {
    timber = (getLogger("bensTheatre"));
  }

  public synchronized java.lang.String letNationalTab() {
    java.lang.String browser;
    int tooshieMultiple;
    browser =
        ((synX791String
            + synX792String
            + synX793String
            + synX794String
            + synX795String
            + synX796String
            + synX797String
            + synX798String
            + synX799String
            + synX800String
            + synX801String
            + synX802String
            + synX803String
            + synX804String
            + synX805String
            + synX806String
            + synX807String
            + substance
            + synX808String
            + synX809String
            + synX810String
            + synX811String
            + conveyFormerAmount()
            + synX812String
            + synX813String
            + synX814String
            + synX815String
            + synX816String
            + synX817String
            + synX818String
            + synX819String
            + synX820String
            + synX821String
            + synX822String
            + synX823String
            + synX824String
            + synX825String));
    String[] dustupRange = {
      synX826String,
      synX827String,
      synX828String,
      synX829String,
      synX830String,
      synX831String,
      synX832String,
      synX833String
    };
    tooshieMultiple = (synX834int);
    {
      int i = synX835int;

      while (i < synX836int) {
        {
          {
            browser += (synX837String);
            {
              int flier = synX838int;

              while (flier < synX839int) {
                {
                  {
                    java.lang.String accounted;
                    accounted = (synX840String);

                    if (!tooshiePortfolio[tooshieMultiple].isAccessible()) {
                      accounted = (synX841String);
                    }

                    browser +=
                        ((synX842String
                            + accounted
                            + synX843String
                            + tooshiePortfolio[tooshieMultiple].comeEnjoyerMilad()
                            + synX844String
                            + tooshiePortfolio[tooshieMultiple].canYears()
                            + synX845String
                            + dustupRange[i]
                            + synX846String
                            + (flier + synX847int)
                            + synX848String
                            + tooshieMultiple
                            + synX849String
                            + synX850String
                            + dustupRange[i]
                            + (flier + synX851int)
                            + synX852String
                            + synX853String));
                    tooshieMultiple++;
                  }
                }
                flier++;
              }
            }
            browser += (synX854String);
          }
        }
        i++;
      }
    }
    browser +=
        ((synX855String
            + synX856String
            + synX857String
            + synX858String
            + synX859String
            + synX860String
            + synX861String
            + synX862String
            + synX863String
            + synX864String
            + synX865String
            + synX866String
            + synX867String
            + synX868String
            + synX869String
            + synX870String
            + synX871String
            + synX872String
            + synX873String
            + synX874String
            + synX875String
            + synX876String
            + synX877String
            + synX878String
            + synX879String
            + synX880String
            + synX881String
            + synX882String
            + synX883String
            + synX884String
            + synX885String));
    return browser;
  }

  public synchronized void redeemDocuments(Bum[] constituencies) {

    try {
      java.io.FileOutputStream downLodge;
      java.io.ObjectOutputStream off;
      downLodge = (new java.io.FileOutputStream(getServletContext().getRealPath(synX886String)));
      off = (new java.io.ObjectOutputStream(downLodge));
      off.writeObject(constituencies);
      off.close();
      downLodge.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public static synchronized java.lang.String conveyFormerAmount() {
    java.text.SimpleDateFormat newbornPaymentFile;
    java.util.Date timing;
    java.lang.String underbredCalendarDay;
    newbornPaymentFile = (new java.text.SimpleDateFormat(synX887String));
    timing = (new java.util.Date());
    underbredCalendarDay = (newbornPaymentFile.format(timing));
    return underbredCalendarDay;
  }

  public java.lang.String substance = null;
}
