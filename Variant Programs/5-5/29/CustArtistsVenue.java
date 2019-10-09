import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends javax.servlet.http.HttpServlet {
  private static final String synX3108String = "</html>";
  private static final String synX3107String = "  </body>\t\n";
  private static final String synX3106String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3105String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3104String = "    </footer>\n";
  private static final String synX3103String = "      </div>\n";
  private static final String synX3102String = "        <p>c3063467</p>\n";
  private static final String synX3101String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3100String = "      <div class=\"author\">\n";
  private static final String synX3099String = "    <footer>\n";
  private static final String synX3098String = "    </article>\n";
  private static final String synX3097String = "      </form>\n";
  private static final String synX3096String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX3095String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX3094String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX3093String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX3092String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX3091String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX3090String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX3089String = "\" />\n";
  private static final String synX3088String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX3087String = "\" />\n";
  private static final String synX3086String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX3085String = "\" />\n";
  private static final String synX3084String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX3083String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX3082String = "\n";
  private static final String synX3081String = "</div>\n";
  private static final String synX3080String = "</p>";
  private static final String synX3079String = "\">";
  private static final String synX3078String = "<p class=\"option\" data-code=\"";
  private static final String synX3077String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX3076String = "      <div class=\"security\">\n";
  private static final String synX3075String = "</div>\n";
  private static final String synX3074String = "</p>";
  private static final String synX3073String = "<p class=\"option\">";
  private static final String synX3072String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX3071String = "      <div class=\"selected\">\n";
  private static final String synX3070String = "      <h2>Your Selection</h2>\n";
  private static final String synX3069String = "    <article>\n";
  private static final String synX3068String = "    </header>\n";
  private static final String synX3067String = "      <h1>Seat Booking</h1>\n";
  private static final String synX3066String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX3065String = "    <header>\n";
  private static final String synX3064String = "  <body class=\"booking\">\n";
  private static final String synX3063String = "  </head>\n";
  private static final String synX3062String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3061String = "    <![endif]-->\n";
  private static final String synX3060String = "      </script>\n";
  private static final String synX3059String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3058String = "    <!--[if IE]>\n";
  private static final String synX3057String = "    <title>Seat Booking</title>\n";
  private static final String synX3056String = "    <meta charset=utf-8>\n";
  private static final String synX3055String = "  <head>\n";
  private static final String synX3054String = "<html lang=\"en\">\n";
  private static final String synX3053String = "<!DOCTYPE html>\n";
  private static final String synX3052String = "";
  private static final int synX3051int = -1985529969;
  private static final String synX3050String = "bensTheatre";
  private static final double synX3049double = 0.010215180479224872;
  private static final String synX3048String = "9";
  private static final String synX3047String = "8";
  private static final String synX3046String = "7";
  private static final String synX3045String = "6";
  private static final String synX3044String = "5";
  private static final String synX3043String = "4";
  private static final String synX3042String = "3";
  private static final String synX3041String = "2";
  private static final String synX3040String = "1";
  private static final String synX3039String = "0";
  private static final String synX3038String = "Z";
  private static final String synX3037String = "Y";
  private static final String synX3036String = "X";
  private static final String synX3035String = "W";
  private static final String synX3034String = "V";
  private static final String synX3033String = "U";
  private static final String synX3032String = "T";
  private static final String synX3031String = "S";
  private static final String synX3030String = "R";
  private static final String synX3029String = "Q";
  private static final String synX3028String = "P";
  private static final String synX3027String = "O";
  private static final String synX3026String = "N";
  private static final String synX3025String = "M";
  private static final String synX3024String = "L";
  private static final String synX3023String = "K";
  private static final String synX3022String = "J";
  private static final String synX3021String = "I";
  private static final String synX3020String = "H";
  private static final String synX3019String = "G";
  private static final String synX3018String = "F";
  private static final String synX3017String = "E";
  private static final String synX3016String = "D";
  private static final String synX3015String = "C";
  private static final String synX3014String = "B";
  private static final String synX3013String = "A";
  private static final String synX3012String = "seatnumber";
  private static final String synX3011String = "seat";
  private static final String synX3010String = "row";
  private static final double synX3009double = 0.5406398349275692;
  private static final String synX3008String = "/WEB-INF/bookingData.ser";
  private static final double synX3007double = 0.18737438995245626;
  private static final String synX3006String = "/WEB-INF/bookingData.ser";
  private static final int synX3005int = -882887756;
  private static final String synX3004String = "benstheatre?message=success";
  private static final boolean synX3003boolean = false;
  private static final String synX3002String = "benstheatre?message=limitexceeded";
  private static final int synX3001int = 2;
  private static final int synX3000int = 0;
  private static final String synX2999String = "phone";
  private static final String synX2998String = "email";
  private static final String synX2997String = "address";
  private static final String synX2996String = "userid";
  private static final String synX2995String = "seatnumber";
  private static final String synX2994String = "seat";
  private static final String synX2993String = "row";
  private static final double synX2992double = 0.12179676731730316;
  public java.lang.String brawl;
  public int placeList;
  public Can[] assCollection;

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse responds)
      throws ServletException, IOException {
    double chthonicBound;
    int made;
    chthonicBound = (synX2992double);
    brawl = (complaint.getParameter(synX2993String));
    behind = (java.lang.Integer.parseInt(complaint.getParameter(synX2994String)));
    placeList = (java.lang.Integer.parseInt(complaint.getParameter(synX2995String)));
    clientIdentifying = (complaint.getParameter(synX2996String));
    resolve = (complaint.getParameter(synX2997String));
    electronically = (complaint.getParameter(synX2998String));
    mobile = (complaint.getParameter(synX2999String));
    assCollection = (quoteData());
    made = (synX3000int);
    for (Can waffen : assCollection) synx100(waffen, made);

    if (made > synX3001int) {
      responds.sendRedirect(synX3002String);
    } else {
      assCollection[placeList].determineEmployeePictures(clientIdentifying);
      assCollection[placeList].fixFix(resolve);
      assCollection[placeList].arrangedInbox(electronically);
      assCollection[placeList].rigidVoice(mobile);
      assCollection[placeList].fitYear(NathanMovie.catchRifeWhen());
      assCollection[placeList].layUsable(synX3003boolean);
      preserveLodge(assCollection);
      responds.sendRedirect(synX3004String);
    }
  }

  public java.lang.String clientIdentifying;

  public synchronized Can[] quoteData() {
    int backTreated;
    backTreated = (synX3005int);

    try {
      java.io.FileInputStream entriesLodge;
      java.io.ObjectInputStream officeholders;
      Can[] benches;
      entriesLodge = (new java.io.FileInputStream(getServletContext().getRealPath(synX3006String)));
      officeholders = (new java.io.ObjectInputStream(entriesLodge));
      benches = ((Can[]) officeholders.readObject());
      officeholders.close();
      entriesLodge.close();
      return benches;
    } catch (java.io.IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      chainsaw.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public java.lang.String resolve;

  public synchronized void preserveLodge(Can[] chairs) {
    double jesusExtent;
    jesusExtent = (synX3007double);

    try {
      java.io.FileOutputStream proscribedSubmitting;
      java.io.ObjectOutputStream stunned;
      proscribedSubmitting =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX3008String)));
      stunned = (new java.io.ObjectOutputStream(proscribedSubmitting));
      stunned.writeObject(chairs);
      stunned.close();
      proscribedSubmitting.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  public int behind;

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse responded)
      throws ServletException, IOException {
    double marquez;
    java.io.PrintWriter forbidden;
    java.lang.String advanceFootnote;
    marquez = (synX3009double);
    forbidden = (responded.getWriter());
    brawl = (demands.getParameter(synX3010String));
    behind = (java.lang.Integer.parseInt(demands.getParameter(synX3011String)));
    placeList = (java.lang.Integer.parseInt(demands.getParameter(synX3012String)));
    assCollection = (quoteData());
    advanceFootnote = (fetchAppointmentLayouts());
    forbidden.println(advanceFootnote);
  }

  public synchronized java.lang.String protectionCipher() {
    double get;
    java.lang.String correspondance[] = {
      synX3013String,
      synX3014String,
      synX3015String,
      synX3016String,
      synX3017String,
      synX3018String,
      synX3019String,
      synX3020String,
      synX3021String,
      synX3022String,
      synX3023String,
      synX3024String,
      synX3025String,
      synX3026String,
      synX3027String,
      synX3028String,
      synX3029String,
      synX3030String,
      synX3031String,
      synX3032String,
      synX3033String,
      synX3034String,
      synX3035String,
      synX3036String,
      synX3037String,
      synX3038String
    };
    java.lang.String size[] = {
      synX3039String,
      synX3040String,
      synX3041String,
      synX3042String,
      synX3043String,
      synX3044String,
      synX3045String,
      synX3046String,
      synX3047String,
      synX3048String
    };
    java.util.Random casual;
    java.lang.String ordinate, antigen, fc, cf, dn, ses;
    get = (synX3049double);
    casual = (new java.util.Random());
    ordinate = (correspondance[casual.nextInt(correspondance.length)]);
    antigen = (size[casual.nextInt(size.length)]);
    fc = (correspondance[casual.nextInt(correspondance.length)]);
    cf = (size[casual.nextInt(size.length)]);
    dn = (correspondance[casual.nextInt(correspondance.length)]);
    ses = (size[casual.nextInt(size.length)]);
    return (ordinate + antigen + fc + cf + dn + ses);
  }

  static {
    chainsaw = (java.util.logging.Logger.getLogger(synX3050String));
  }

  public synchronized java.lang.String fetchAppointmentLayouts() {
    int moments;
    java.lang.String encode;
    java.lang.String http;
    moments = (synX3051int);
    encode = (protectionCipher());
    http = (synX3052String);
    http +=
        ((synX3053String
            + synX3054String
            + synX3055String
            + synX3056String
            + synX3057String
            + synX3058String
            + synX3059String
            + synX3060String
            + synX3061String
            + synX3062String
            + synX3063String
            + synX3064String
            + synX3065String
            + synX3066String
            + synX3067String
            + synX3068String
            + synX3069String
            + synX3070String
            + synX3071String
            + synX3072String));
    http += ((synX3073String + brawl + behind + synX3074String));
    http += ((synX3075String + synX3076String + synX3077String));
    http += ((synX3078String + encode + synX3079String + encode + synX3080String));
    http +=
        ((synX3081String
            + synX3082String
            + synX3083String
            + synX3084String
            + behind
            + synX3085String
            + synX3086String
            + brawl
            + synX3087String
            + synX3088String
            + placeList
            + synX3089String
            + synX3090String
            + synX3091String
            + synX3092String
            + synX3093String
            + synX3094String
            + synX3095String
            + synX3096String
            + synX3097String
            + synX3098String
            + synX3099String
            + synX3100String
            + synX3101String
            + synX3102String
            + synX3103String
            + synX3104String
            + synX3105String
            + synX3106String
            + synX3107String
            + synX3108String));
    return http;
  }

  public java.lang.String electronically;
  public java.lang.String mobile;
  public static double integral = 0.5315911416185902;
  public static java.util.logging.Logger chainsaw;

  private synchronized void synx100(Can waffen, int made) throws ServletException, IOException {

    if (waffen.driveOperatorSecurity() != null
        && waffen.driveOperatorSecurity().equals(clientIdentifying)) {
      made++;
    }
  }
}
