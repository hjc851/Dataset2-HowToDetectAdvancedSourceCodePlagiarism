import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class GarethTheatrical extends javax.servlet.http.HttpServlet {
  private static final String synX2991String = "dd-MM-YY ss-MM-HH";
  private static final String synX2990String = "";
  private static final String synX2989String = "</html>";
  private static final String synX2988String = "  </body>\t\n";
  private static final String synX2987String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2986String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2985String = "    </div>\n";
  private static final String synX2984String = "      </div>\n";
  private static final String synX2983String = "        </div>\n";
  private static final String synX2982String = "          <button>OK</button>\n";
  private static final String synX2981String = "        <div class=\"close\">\n";
  private static final String synX2980String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX2979String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX2978String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX2977String = "      <div class=\"inner\">\n";
  private static final String synX2976String = "    <div id=\"popup\">\n";
  private static final String synX2975String = "    </footer>\n";
  private static final String synX2974String = "      </div>\n";
  private static final String synX2973String = "        <p>c3063467</p>\n";
  private static final String synX2972String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2971String = "      <div class=\"author\">\n";
  private static final String synX2970String = "    <footer>\n";
  private static final String synX2969String = "    </article>\n";
  private static final String synX2968String = "      </div>\n";
  private static final String synX2967String = "        </div>\n";
  private static final String synX2966String = "          <p>Booked</p>\n";
  private static final String synX2965String = "        <div class=\"booked\">\n";
  private static final String synX2964String = "        </div>\n";
  private static final String synX2963String = "          <p>Available</p>\n";
  private static final String synX2962String = "        <div class=\"available\">\n";
  private static final String synX2961String = "      <div class=\"legend\">\n";
  private static final String synX2960String = "      </table>\n";
  private static final String synX2959String = "</tbody>\n";
  private static final String synX2958String = "</tr>\n";
  private static final String synX2957String = "</td>";
  private static final String synX2956String = "</p>\n";
  private static final int synX2955int = 1;
  private static final String synX2954String = "  <p>";
  private static final String synX2953String = "\">\n";
  private static final String synX2952String = "\" data-seatNumber=\"";
  private static final int synX2951int = 1;
  private static final String synX2950String = "\" data-seat=\"";
  private static final String synX2949String = "\" data-row=\"";
  private static final String synX2948String = "\" data-time=\"";
  private static final String synX2947String = "\" data-user=\"";
  private static final String synX2946String = "<td class=\"seat";
  private static final String synX2945String = " booked";
  private static final String synX2944String = "";
  private static final int synX2943int = 8;
  private static final int synX2942int = 0;
  private static final String synX2941String = "<tr>\n";
  private static final int synX2940int = 8;
  private static final int synX2939int = 0;
  private static final int synX2938int = 0;
  private static final String synX2937String = "H";
  private static final String synX2936String = "G";
  private static final String synX2935String = "F";
  private static final String synX2934String = "E";
  private static final String synX2933String = "D";
  private static final String synX2932String = "C";
  private static final String synX2931String = "B";
  private static final String synX2930String = "A";
  private static final String synX2929String = "        <tbody>";
  private static final String synX2928String = "        </thead>\n";
  private static final String synX2927String = "          </tr>\n";
  private static final String synX2926String = "            </td>\n";
  private static final String synX2925String = "              <p>Stage</p>\n";
  private static final String synX2924String = "            <td colspan=\"8\">\n";
  private static final String synX2923String = "          <tr>\n";
  private static final String synX2922String = "        <thead>\n";
  private static final String synX2921String = "      <table>\n";
  private static final String synX2920String = "      </div>\n";
  private static final String synX2919String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX2918String = "      <div class=\"instructions\">\n";
  private static final String synX2917String = "      </div>\n";
  private static final String synX2916String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX2915String = "        <p>";
  private static final String synX2914String = "      <div class=\"time\">\n";
  private static final String synX2913String = "      <h2>Seats</h2>\n";
  private static final String synX2912String = "</p>\n";
  private static final String synX2911String = "      <p class=\"message\">";
  private static final String synX2910String = "    <article>\n";
  private static final String synX2909String = "    </header>\n";
  private static final String synX2908String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX2907String = "    <header>\n";
  private static final String synX2906String = "  <body class=\"home\">\n";
  private static final String synX2905String = "  </head>\n";
  private static final String synX2904String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2903String = "    <![endif]-->\n";
  private static final String synX2902String = "      </script>\n";
  private static final String synX2901String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2900String = "    <!--[if IE]>\n";
  private static final String synX2899String = "    <title>Theatre Booking System</title>\n";
  private static final String synX2898String = "    <meta charset=utf-8>\n";
  private static final String synX2897String = "  <head>\n";
  private static final String synX2896String = "<html lang=\"en\">\n";
  private static final String synX2895String = "<!DOCTYPE html>\n";
  private static final String synX2894String = "8YCKkfGUTxXi";
  private static final String synX2893String = "/WEB-INF/bookingData.ser";
  private static final int synX2892int = 887649722;
  private static final String synX2891String = "/WEB-INF/bookingData.ser";
  private static final String synX2890String = "vFLi6sfntFfD";
  private static final int synX2889int = 64;
  private static final int synX2888int = 0;
  private static final String synX2887String = "/WEB-INF/bookingData.ser";
  private static final int synX2886int = 64;
  private static final String synX2885String = "";
  private static final String synX2884String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX2883String = "limitexceeded";
  private static final String synX2882String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX2881String = "success";
  private static final String synX2880String = "message";
  private static final String synX2879String = "4I3s7H9JEgZrx";
  static int hawnContents = 256742187;
  private Bottom[] buttocksMultitude = null;
  private java.lang.String voicemail = null;
  private static java.util.logging.Logger lumberjack =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    String momentsEdge = synX2879String;
    java.io.PrintWriter proscribed = rejoinder.getWriter();
    voicemail = appeal.getParameter(synX2880String);

    if (voicemail != null) {

      if (voicemail.equals(synX2881String)) {
        voicemail = synX2882String;
      } else if (voicemail.equals(synX2883String)) {
        voicemail = synX2884String;
      }

    } else {
      voicemail = synX2885String;
    }
    buttocksMultitude = new Bottom[synX2886int];
    java.io.File advanceComplaint =
        new java.io.File(getServletContext().getRealPath(synX2887String));

    if (advanceComplaint.exists()) {
      buttocksMultitude = readableArchiving();
    } else {
      {
        int i = synX2888int;

        while (i < synX2889int) {
          {
            {
              Bottom unusedBuns = new Bottom();
              buttocksMultitude[i] = unusedBuns;
            }
          }
          i++;
        }
      }
      spareFolder(buttocksMultitude);
    }
    java.lang.String domesticSummary = canResidenceScreen();
    proscribed.println(domesticSummary);
  }

  public synchronized Bottom[] readableArchiving() {
    String thresholds = synX2890String;

    try {
      Bottom[] space = null;
      java.io.FileInputStream detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath(synX2891String));
      java.io.ObjectInputStream cbs = new java.io.ObjectInputStream(detailsSubmitted);
      space = (Bottom[]) cbs.readObject();
      cbs.close();
      detailsSubmitted.close();
      return space;
    } catch (java.io.IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      lumberjack.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void spareFolder(Bottom[] beds) {
    int designators = synX2892int;

    try {
      java.io.FileOutputStream exteriorReadme =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX2893String));
      java.io.ObjectOutputStream exterior = new java.io.ObjectOutputStream(exteriorReadme);
      exterior.writeObject(beds);
      exterior.close();
      exteriorReadme.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized java.lang.String canResidenceScreen() {
    String length = synX2894String;
    java.lang.String http =
        synX2895String
            + synX2896String
            + synX2897String
            + synX2898String
            + synX2899String
            + synX2900String
            + synX2901String
            + synX2902String
            + synX2903String
            + synX2904String
            + synX2905String
            + synX2906String
            + synX2907String
            + synX2908String
            + synX2909String
            + synX2910String
            + synX2911String
            + voicemail
            + synX2912String
            + synX2913String
            + synX2914String
            + synX2915String
            + findActualSentence()
            + synX2916String
            + synX2917String
            + synX2918String
            + synX2919String
            + synX2920String
            + synX2921String
            + synX2922String
            + synX2923String
            + synX2924String
            + synX2925String
            + synX2926String
            + synX2927String
            + synX2928String
            + synX2929String;
    String[] rackSelection = {
      synX2930String,
      synX2931String,
      synX2932String,
      synX2933String,
      synX2934String,
      synX2935String,
      synX2936String,
      synX2937String
    };
    int investFrequency = synX2938int;
    {
      int i = synX2939int;

      while (i < synX2940int) {
        {
          {
            http += synX2941String;
            {
              int flier = synX2942int;

              while (flier < synX2943int) {
                {
                  {
                    java.lang.String rented = synX2944String;

                    if (!buttocksMultitude[investFrequency].isAccessible()) {
                      rented = synX2945String;
                    }

                    http +=
                        synX2946String
                            + rented
                            + synX2947String
                            + buttocksMultitude[investFrequency].arriveClientIdentifying()
                            + synX2948String
                            + buttocksMultitude[investFrequency].letHours()
                            + synX2949String
                            + rackSelection[i]
                            + synX2950String
                            + (flier + synX2951int)
                            + synX2952String
                            + investFrequency
                            + synX2953String
                            + synX2954String
                            + rackSelection[i]
                            + (flier + synX2955int)
                            + synX2956String
                            + synX2957String;
                    investFrequency++;
                  }
                }
                flier++;
              }
            }
            http += synX2958String;
          }
        }
        i++;
      }
    }
    http +=
        synX2959String
            + synX2960String
            + synX2961String
            + synX2962String
            + synX2963String
            + synX2964String
            + synX2965String
            + synX2966String
            + synX2967String
            + synX2968String
            + synX2969String
            + synX2970String
            + synX2971String
            + synX2972String
            + synX2973String
            + synX2974String
            + synX2975String
            + synX2976String
            + synX2977String
            + synX2978String
            + synX2979String
            + synX2980String
            + synX2981String
            + synX2982String
            + synX2983String
            + synX2984String
            + synX2985String
            + synX2986String
            + synX2987String
            + synX2988String
            + synX2989String;
    return http;
  }

  public static synchronized java.lang.String findActualSentence() {
    String nbrNecessities = synX2990String;
    java.text.SimpleDateFormat freshlyScheduledSchema =
        new java.text.SimpleDateFormat(synX2991String);
    java.util.Date commencement = new java.util.Date();
    java.lang.String backingYetChance = freshlyScheduledSchema.format(commencement);
    return backingYetChance;
  }
}
