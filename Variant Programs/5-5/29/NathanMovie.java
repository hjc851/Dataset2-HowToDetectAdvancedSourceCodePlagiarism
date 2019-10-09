import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends javax.servlet.http.HttpServlet {
  private static final String synX3225String = "</html>";
  private static final String synX3224String = "  </body>\t\n";
  private static final String synX3223String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3222String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3221String = "    </div>\n";
  private static final String synX3220String = "      </div>\n";
  private static final String synX3219String = "        </div>\n";
  private static final String synX3218String = "          <button>OK</button>\n";
  private static final String synX3217String = "        <div class=\"close\">\n";
  private static final String synX3216String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX3215String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX3214String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX3213String = "      <div class=\"inner\">\n";
  private static final String synX3212String = "    <div id=\"popup\">\n";
  private static final String synX3211String = "    </footer>\n";
  private static final String synX3210String = "      </div>\n";
  private static final String synX3209String = "        <p>c3063467</p>\n";
  private static final String synX3208String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3207String = "      <div class=\"author\">\n";
  private static final String synX3206String = "    <footer>\n";
  private static final String synX3205String = "    </article>\n";
  private static final String synX3204String = "      </div>\n";
  private static final String synX3203String = "        </div>\n";
  private static final String synX3202String = "          <p>Booked</p>\n";
  private static final String synX3201String = "        <div class=\"booked\">\n";
  private static final String synX3200String = "        </div>\n";
  private static final String synX3199String = "          <p>Available</p>\n";
  private static final String synX3198String = "        <div class=\"available\">\n";
  private static final String synX3197String = "      <div class=\"legend\">\n";
  private static final String synX3196String = "      </table>\n";
  private static final String synX3195String = "</tbody>\n";
  private static final String synX3194String = "</tr>\n";
  private static final String synX3193String = "</td>";
  private static final String synX3192String = "</p>\n";
  private static final int synX3191int = 1;
  private static final String synX3190String = "  <p>";
  private static final String synX3189String = "\">\n";
  private static final String synX3188String = "\" data-seatNumber=\"";
  private static final int synX3187int = 1;
  private static final String synX3186String = "\" data-seat=\"";
  private static final String synX3185String = "\" data-row=\"";
  private static final String synX3184String = "\" data-time=\"";
  private static final String synX3183String = "\" data-user=\"";
  private static final String synX3182String = "<td class=\"seat";
  private static final String synX3181String = " booked";
  private static final String synX3180String = "";
  private static final int synX3179int = 8;
  private static final int synX3178int = 0;
  private static final String synX3177String = "<tr>\n";
  private static final int synX3176int = 8;
  private static final int synX3175int = 0;
  private static final int synX3174int = 0;
  private static final String synX3173String = "H";
  private static final String synX3172String = "G";
  private static final String synX3171String = "F";
  private static final String synX3170String = "E";
  private static final String synX3169String = "D";
  private static final String synX3168String = "C";
  private static final String synX3167String = "B";
  private static final String synX3166String = "A";
  private static final String synX3165String = "        <tbody>";
  private static final String synX3164String = "        </thead>\n";
  private static final String synX3163String = "          </tr>\n";
  private static final String synX3162String = "            </td>\n";
  private static final String synX3161String = "              <p>Stage</p>\n";
  private static final String synX3160String = "            <td colspan=\"8\">\n";
  private static final String synX3159String = "          <tr>\n";
  private static final String synX3158String = "        <thead>\n";
  private static final String synX3157String = "      <table>\n";
  private static final String synX3156String = "      </div>\n";
  private static final String synX3155String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX3154String = "      <div class=\"instructions\">\n";
  private static final String synX3153String = "      </div>\n";
  private static final String synX3152String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX3151String = "        <p>";
  private static final String synX3150String = "      <div class=\"time\">\n";
  private static final String synX3149String = "      <h2>Seats</h2>\n";
  private static final String synX3148String = "</p>\n";
  private static final String synX3147String = "      <p class=\"message\">";
  private static final String synX3146String = "    <article>\n";
  private static final String synX3145String = "    </header>\n";
  private static final String synX3144String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX3143String = "    <header>\n";
  private static final String synX3142String = "  <body class=\"home\">\n";
  private static final String synX3141String = "  </head>\n";
  private static final String synX3140String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3139String = "    <![endif]-->\n";
  private static final String synX3138String = "      </script>\n";
  private static final String synX3137String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3136String = "    <!--[if IE]>\n";
  private static final String synX3135String = "    <title>Theatre Booking System</title>\n";
  private static final String synX3134String = "    <meta charset=utf-8>\n";
  private static final String synX3133String = "  <head>\n";
  private static final String synX3132String = "<html lang=\"en\">\n";
  private static final String synX3131String = "<!DOCTYPE html>\n";
  private static final double synX3130double = 0.7860223637979441;
  private static final String synX3129String = "/WEB-INF/bookingData.ser";
  private static final double synX3128double = 0.9733412319527673;
  private static final String synX3127String = "/WEB-INF/bookingData.ser";
  private static final double synX3126double = 0.6343620395010438;
  private static final String synX3125String = "dd-MM-YY ss-MM-HH";
  private static final String synX3124String = "4J4hCnX2eJa";
  private static final String synX3123String = "/WEB-INF/bookingData.ser";
  private static final int synX3122int = 64;
  private static final String synX3121String = "message";
  private static final String synX3120String = "5xuGu42";
  private static final String synX3119String = "bensTheatre";

  static {
    surveyor = (java.util.logging.Logger.getLogger(synX3119String));
  }

  public Can[] tailMultiplicity;
  public static java.util.logging.Logger surveyor;
  public java.lang.String letter;

  public synchronized void doGet(HttpServletRequest calls, HttpServletResponse wake)
      throws ServletException, IOException {
    String lessRestrict;
    java.io.PrintWriter taboo;
    java.io.File gigInitiate;
    java.lang.String cottageFolio;
    lessRestrict = (synX3120String);
    taboo = (wake.getWriter());
    letter = (calls.getParameter(synX3121String));

    if (letter != null) synx101();
    else synx102();
    tailMultiplicity = (new Can[synX3122int]);
    gigInitiate = (new java.io.File(getServletContext().getRealPath(synX3123String)));

    if (gigInitiate.exists()) synx103();
    else synx104();
    cottageFolio = (bringAbodeWebpage());
    taboo.println(cottageFolio);
  }

  public static synchronized java.lang.String catchRifeWhen() {
    String restrain;
    java.text.SimpleDateFormat refreshingDeadlinesFiles;
    java.util.Date yet;
    java.lang.String crossbredSeeMeter;
    restrain = (synX3124String);
    refreshingDeadlinesFiles = (new java.text.SimpleDateFormat(synX3125String));
    yet = (new java.util.Date());
    crossbredSeeMeter = (refreshingDeadlinesFiles.format(yet));
    return crossbredSeeMeter;
  }

  public synchronized Can[] aloudApplication() {
    double epithet;
    epithet = (synX3126double);

    try {
      java.io.FileInputStream adherentsPaperwork;
      java.io.ObjectInputStream incumbents;
      Can[] posts;
      adherentsPaperwork =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX3127String)));
      incumbents = (new java.io.ObjectInputStream(adherentsPaperwork));
      posts = ((Can[]) incumbents.readObject());
      incumbents.close();
      adherentsPaperwork.close();
      return posts;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      surveyor.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Can[] pillion) {
    double high;
    high = (synX3128double);

    try {
      java.io.FileOutputStream extinguishedDocument;
      java.io.ObjectOutputStream exterior;
      extinguishedDocument =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX3129String)));
      exterior = (new java.io.ObjectOutputStream(extinguishedDocument));
      exterior.writeObject(pillion);
      exterior.close();
      extinguishedDocument.close();
    } catch (java.io.IOException tipp) {
      tipp.printStackTrace();
    }
  }

  public synchronized java.lang.String bringAbodeWebpage() {
    double minh;
    java.lang.String jpeg;
    int backsideNumeral;
    minh = (synX3130double);
    jpeg =
        ((synX3131String
            + synX3132String
            + synX3133String
            + synX3134String
            + synX3135String
            + synX3136String
            + synX3137String
            + synX3138String
            + synX3139String
            + synX3140String
            + synX3141String
            + synX3142String
            + synX3143String
            + synX3144String
            + synX3145String
            + synX3146String
            + synX3147String
            + letter
            + synX3148String
            + synX3149String
            + synX3150String
            + synX3151String
            + catchRifeWhen()
            + synX3152String
            + synX3153String
            + synX3154String
            + synX3155String
            + synX3156String
            + synX3157String
            + synX3158String
            + synX3159String
            + synX3160String
            + synX3161String
            + synX3162String
            + synX3163String
            + synX3164String
            + synX3165String));
    String[] brawlGamut = {
      synX3166String,
      synX3167String,
      synX3168String,
      synX3169String,
      synX3170String,
      synX3171String,
      synX3172String,
      synX3173String
    };
    backsideNumeral = (synX3174int);

    for (int i = synX3175int; i < synX3176int; i++) {
      jpeg += (synX3177String);

      for (int flier = synX3178int; flier < synX3179int; flier++) {
        java.lang.String attributed;
        attributed = (synX3180String);

        if (!tailMultiplicity[backsideNumeral].isAccessible()) {
          attributed = (synX3181String);
        }

        jpeg +=
            ((synX3182String
                + attributed
                + synX3183String
                + tailMultiplicity[backsideNumeral].driveOperatorSecurity()
                + synX3184String
                + tailMultiplicity[backsideNumeral].sustainThing()
                + synX3185String
                + brawlGamut[i]
                + synX3186String
                + (flier + synX3187int)
                + synX3188String
                + backsideNumeral
                + synX3189String
                + synX3190String
                + brawlGamut[i]
                + (flier + synX3191int)
                + synX3192String
                + synX3193String));
        backsideNumeral++;
      }
      jpeg += (synX3194String);
    }
    jpeg +=
        ((synX3195String
            + synX3196String
            + synX3197String
            + synX3198String
            + synX3199String
            + synX3200String
            + synX3201String
            + synX3202String
            + synX3203String
            + synX3204String
            + synX3205String
            + synX3206String
            + synX3207String
            + synX3208String
            + synX3209String
            + synX3210String
            + synX3211String
            + synX3212String
            + synX3213String
            + synX3214String
            + synX3215String
            + synX3216String
            + synX3217String
            + synX3218String
            + synX3219String
            + synX3220String
            + synX3221String
            + synX3222String
            + synX3223String
            + synX3224String
            + synX3225String));
    return jpeg;
  }

  static double cksMaterials = 0.8875120573228386;

  private synchronized void synx101() throws ServletException, IOException {

    if (letter.equals("success")) {
      letter = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (letter.equals("limitexceeded")) {
      letter =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx102() throws ServletException, IOException {
    letter = ("");
  }

  private synchronized void synx103() throws ServletException, IOException {
    tailMultiplicity = (aloudApplication());
  }

  private synchronized void synx104() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Can newbornBottom;
      newbornBottom = (new Can());
      tailMultiplicity[i] = (newbornBottom);
    }
    salvageCharge(tailMultiplicity);
  }
}
