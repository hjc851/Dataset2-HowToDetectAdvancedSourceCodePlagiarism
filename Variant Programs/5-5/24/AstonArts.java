import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends javax.servlet.http.HttpServlet {
  private static final int synX2753int = 64;
  private static final int synX2752int = 0;
  private static final String synX2751String = "";
  private static final String synX2750String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX2749String = "limitexceeded";
  private static final String synX2748String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX2747String = "success";
  private static final String synX2746String = "/WEB-INF/bookingData.ser";
  private static final int synX2745int = 64;
  private static final String synX2744String = "message";
  private static final String synX2743String = "/WEB-INF/bookingData.ser";
  private static final String synX2742String = "</html>";
  private static final String synX2741String = "  </body>\t\n";
  private static final String synX2740String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2739String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2738String = "    </div>\n";
  private static final String synX2737String = "      </div>\n";
  private static final String synX2736String = "        </div>\n";
  private static final String synX2735String = "          <button>OK</button>\n";
  private static final String synX2734String = "        <div class=\"close\">\n";
  private static final String synX2733String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX2732String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX2731String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX2730String = "      <div class=\"inner\">\n";
  private static final String synX2729String = "    <div id=\"popup\">\n";
  private static final String synX2728String = "    </footer>\n";
  private static final String synX2727String = "      </div>\n";
  private static final String synX2726String = "        <p>c3063467</p>\n";
  private static final String synX2725String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2724String = "      <div class=\"author\">\n";
  private static final String synX2723String = "    <footer>\n";
  private static final String synX2722String = "    </article>\n";
  private static final String synX2721String = "      </div>\n";
  private static final String synX2720String = "        </div>\n";
  private static final String synX2719String = "          <p>Booked</p>\n";
  private static final String synX2718String = "        <div class=\"booked\">\n";
  private static final String synX2717String = "        </div>\n";
  private static final String synX2716String = "          <p>Available</p>\n";
  private static final String synX2715String = "        <div class=\"available\">\n";
  private static final String synX2714String = "      <div class=\"legend\">\n";
  private static final String synX2713String = "      </table>\n";
  private static final String synX2712String = "</tbody>\n";
  private static final String synX2711String = "</tr>\n";
  private static final String synX2710String = "</td>";
  private static final String synX2709String = "</p>\n";
  private static final int synX2708int = 1;
  private static final String synX2707String = "  <p>";
  private static final String synX2706String = "\">\n";
  private static final String synX2705String = "\" data-seatNumber=\"";
  private static final int synX2704int = 1;
  private static final String synX2703String = "\" data-seat=\"";
  private static final String synX2702String = "\" data-row=\"";
  private static final String synX2701String = "\" data-time=\"";
  private static final String synX2700String = "\" data-user=\"";
  private static final String synX2699String = "<td class=\"seat";
  private static final String synX2698String = " booked";
  private static final String synX2697String = "";
  private static final int synX2696int = 8;
  private static final int synX2695int = 0;
  private static final String synX2694String = "<tr>\n";
  private static final int synX2693int = 8;
  private static final int synX2692int = 0;
  private static final int synX2691int = 0;
  private static final String synX2690String = "H";
  private static final String synX2689String = "G";
  private static final String synX2688String = "F";
  private static final String synX2687String = "E";
  private static final String synX2686String = "D";
  private static final String synX2685String = "C";
  private static final String synX2684String = "B";
  private static final String synX2683String = "A";
  private static final String synX2682String = "        <tbody>";
  private static final String synX2681String = "        </thead>\n";
  private static final String synX2680String = "          </tr>\n";
  private static final String synX2679String = "            </td>\n";
  private static final String synX2678String = "              <p>Stage</p>\n";
  private static final String synX2677String = "            <td colspan=\"8\">\n";
  private static final String synX2676String = "          <tr>\n";
  private static final String synX2675String = "        <thead>\n";
  private static final String synX2674String = "      <table>\n";
  private static final String synX2673String = "      </div>\n";
  private static final String synX2672String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX2671String = "      <div class=\"instructions\">\n";
  private static final String synX2670String = "      </div>\n";
  private static final String synX2669String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX2668String = "        <p>";
  private static final String synX2667String = "      <div class=\"time\">\n";
  private static final String synX2666String = "      <h2>Seats</h2>\n";
  private static final String synX2665String = "</p>\n";
  private static final String synX2664String = "      <p class=\"message\">";
  private static final String synX2663String = "    <article>\n";
  private static final String synX2662String = "    </header>\n";
  private static final String synX2661String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX2660String = "    <header>\n";
  private static final String synX2659String = "  <body class=\"home\">\n";
  private static final String synX2658String = "  </head>\n";
  private static final String synX2657String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2656String = "    <![endif]-->\n";
  private static final String synX2655String = "      </script>\n";
  private static final String synX2654String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2653String = "    <!--[if IE]>\n";
  private static final String synX2652String = "    <title>Theatre Booking System</title>\n";
  private static final String synX2651String = "    <meta charset=utf-8>\n";
  private static final String synX2650String = "  <head>\n";
  private static final String synX2649String = "<html lang=\"en\">\n";
  private static final String synX2648String = "<!DOCTYPE html>\n";
  private static final String synX2647String = "dd-MM-YY ss-MM-HH";
  private static final String synX2646String = "/WEB-INF/bookingData.ser";

  public synchronized Rear[] quoteData() {

    try {
      java.io.FileInputStream proponentsDatabase;
      java.io.ObjectInputStream officeholders;
      Rear[] spaces = null;
      proponentsDatabase =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX2646String)));
      officeholders = (new java.io.ObjectInputStream(proponentsDatabase));
      spaces = ((Rear[]) officeholders.readObject());
      officeholders.close();
      proponentsDatabase.close();
      return spaces;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      surveyor.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public static synchronized java.lang.String beatTypicalJuncture() {
    java.text.SimpleDateFormat newfoundTimingFormula;
    java.util.Date see;
    java.lang.String slobScheduledPeriod;
    newfoundTimingFormula = (new java.text.SimpleDateFormat(synX2647String));
    see = (new java.util.Date());
    slobScheduledPeriod = (newfoundTimingFormula.format(see));
    return slobScheduledPeriod;
  }

  public synchronized java.lang.String makePlaceText() {
    java.lang.String plugin;
    int behindTurn;
    plugin =
        ((synX2648String
            + synX2649String
            + synX2650String
            + synX2651String
            + synX2652String
            + synX2653String
            + synX2654String
            + synX2655String
            + synX2656String
            + synX2657String
            + synX2658String
            + synX2659String
            + synX2660String
            + synX2661String
            + synX2662String
            + synX2663String
            + synX2664String
            + impression
            + synX2665String
            + synX2666String
            + synX2667String
            + synX2668String
            + beatTypicalJuncture()
            + synX2669String
            + synX2670String
            + synX2671String
            + synX2672String
            + synX2673String
            + synX2674String
            + synX2675String
            + synX2676String
            + synX2677String
            + synX2678String
            + synX2679String
            + synX2680String
            + synX2681String
            + synX2682String));
    String[] placeBreadth = {
      synX2683String,
      synX2684String,
      synX2685String,
      synX2686String,
      synX2687String,
      synX2688String,
      synX2689String,
      synX2690String
    };
    behindTurn = (synX2691int);
    {
      int i = synX2692int;

      while (i < synX2693int) {
        {
          {
            plugin += (synX2694String);
            {
              int gruss = synX2695int;

              while (gruss < synX2696int) {
                {
                  {
                    java.lang.String counted;
                    counted = (synX2697String);

                    if (!sternArsenal[behindTurn].isAccessible()) {
                      counted = (synX2698String);
                    }

                    plugin +=
                        ((synX2699String
                            + counted
                            + synX2700String
                            + sternArsenal[behindTurn].obtainViewerEst()
                            + synX2701String
                            + sternArsenal[behindTurn].conveyAmount()
                            + synX2702String
                            + placeBreadth[i]
                            + synX2703String
                            + (gruss + synX2704int)
                            + synX2705String
                            + behindTurn
                            + synX2706String
                            + synX2707String
                            + placeBreadth[i]
                            + (gruss + synX2708int)
                            + synX2709String
                            + synX2710String));
                    behindTurn++;
                  }
                }
                gruss++;
              }
            }
            plugin += (synX2711String);
          }
        }
        i++;
      }
    }
    plugin +=
        ((synX2712String
            + synX2713String
            + synX2714String
            + synX2715String
            + synX2716String
            + synX2717String
            + synX2718String
            + synX2719String
            + synX2720String
            + synX2721String
            + synX2722String
            + synX2723String
            + synX2724String
            + synX2725String
            + synX2726String
            + synX2727String
            + synX2728String
            + synX2729String
            + synX2730String
            + synX2731String
            + synX2732String
            + synX2733String
            + synX2734String
            + synX2735String
            + synX2736String
            + synX2737String
            + synX2738String
            + synX2739String
            + synX2740String
            + synX2741String
            + synX2742String));
    return plugin;
  }

  private Rear[] sternArsenal = null;

  public synchronized void conserveRegister(Rear[] elects) {

    try {
      java.io.FileOutputStream unfashionableFilename;
      java.io.ObjectOutputStream prohibited;
      unfashionableFilename =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX2743String)));
      prohibited = (new java.io.ObjectOutputStream(unfashionableFilename));
      prohibited.writeObject(elects);
      prohibited.close();
      unfashionableFilename.close();
    } catch (java.io.IOException abe) {
      abe.printStackTrace();
    }
  }

  private java.lang.String impression = null;
  private static java.util.logging.Logger surveyor =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse intervention)
      throws ServletException, IOException {
    java.io.PrintWriter outgoing;
    java.io.File rentApplication;
    java.lang.String townhouseFront;
    outgoing = (intervention.getWriter());
    impression = (decision.getParameter(synX2744String));

    if (impression != null) synx86();
    else synx87();
    sternArsenal = (new Rear[synX2745int]);
    rentApplication = (new java.io.File(getServletContext().getRealPath(synX2746String)));

    if (rentApplication.exists()) synx88();
    else synx89();
    townhouseFront = (makePlaceText());
    outgoing.println(townhouseFront);
  }

  private synchronized void synx86() throws ServletException, IOException {

    if (impression.equals(synX2747String)) {
      impression = (synX2748String);
    } else if (impression.equals(synX2749String)) {
      impression = (synX2750String);
    }
  }

  private synchronized void synx87() throws ServletException, IOException {
    impression = (synX2751String);
  }

  private synchronized void synx88() throws ServletException, IOException {
    sternArsenal = (quoteData());
  }

  private synchronized void synx89() throws ServletException, IOException {
    {
      int i = synX2752int;

      while (i < synX2753int) {
        {
          {
            Rear untestedBehind;
            untestedBehind = (new Rear());
            sternArsenal[i] = (untestedBehind);
          }
        }
        i++;
      }
    }
    conserveRegister(sternArsenal);
  }
}
