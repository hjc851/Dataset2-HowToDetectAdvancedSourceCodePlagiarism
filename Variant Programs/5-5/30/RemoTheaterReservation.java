import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class RemoTheaterReservation extends javax.servlet.http.HttpServlet {
  private static final String synX3336String = "9";
  private static final String synX3335String = "8";
  private static final String synX3334String = "7";
  private static final String synX3333String = "6";
  private static final String synX3332String = "5";
  private static final String synX3331String = "4";
  private static final String synX3330String = "3";
  private static final String synX3329String = "2";
  private static final String synX3328String = "1";
  private static final String synX3327String = "0";
  private static final String synX3326String = "Z";
  private static final String synX3325String = "Y";
  private static final String synX3324String = "X";
  private static final String synX3323String = "W";
  private static final String synX3322String = "V";
  private static final String synX3321String = "U";
  private static final String synX3320String = "T";
  private static final String synX3319String = "S";
  private static final String synX3318String = "R";
  private static final String synX3317String = "Q";
  private static final String synX3316String = "P";
  private static final String synX3315String = "O";
  private static final String synX3314String = "N";
  private static final String synX3313String = "M";
  private static final String synX3312String = "L";
  private static final String synX3311String = "K";
  private static final String synX3310String = "J";
  private static final String synX3309String = "I";
  private static final String synX3308String = "H";
  private static final String synX3307String = "G";
  private static final String synX3306String = "F";
  private static final String synX3305String = "E";
  private static final String synX3304String = "D";
  private static final String synX3303String = "C";
  private static final String synX3302String = "B";
  private static final String synX3301String = "A";
  private static final String synX3300String = "/WEB-INF/bookingData.ser";
  private static final String synX3299String = "bensTheatre";
  private static final String synX3298String = "benstheatre?message=success";
  private static final boolean synX3297boolean = false;
  private static final String synX3296String = "benstheatre?message=limitexceeded";
  private static final int synX3295int = 2;
  private static final int synX3294int = 0;
  private static final String synX3293String = "phone";
  private static final String synX3292String = "email";
  private static final String synX3291String = "address";
  private static final String synX3290String = "userid";
  private static final String synX3289String = "seatnumber";
  private static final String synX3288String = "seat";
  private static final String synX3287String = "row";
  private static final String synX3286String = "</html>";
  private static final String synX3285String = "  </body>\t\n";
  private static final String synX3284String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3283String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3282String = "    </footer>\n";
  private static final String synX3281String = "      </div>\n";
  private static final String synX3280String = "        <p>c3063467</p>\n";
  private static final String synX3279String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3278String = "      <div class=\"author\">\n";
  private static final String synX3277String = "    <footer>\n";
  private static final String synX3276String = "    </article>\n";
  private static final String synX3275String = "      </form>\n";
  private static final String synX3274String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX3273String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX3272String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX3271String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX3270String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX3269String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX3268String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX3267String = "\" />\n";
  private static final String synX3266String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX3265String = "\" />\n";
  private static final String synX3264String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX3263String = "\" />\n";
  private static final String synX3262String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX3261String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX3260String = "\n";
  private static final String synX3259String = "</div>\n";
  private static final String synX3258String = "</p>";
  private static final String synX3257String = "\">";
  private static final String synX3256String = "<p class=\"option\" data-code=\"";
  private static final String synX3255String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX3254String = "      <div class=\"security\">\n";
  private static final String synX3253String = "</div>\n";
  private static final String synX3252String = "</p>";
  private static final String synX3251String = "<p class=\"option\">";
  private static final String synX3250String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX3249String = "      <div class=\"selected\">\n";
  private static final String synX3248String = "      <h2>Your Selection</h2>\n";
  private static final String synX3247String = "    <article>\n";
  private static final String synX3246String = "    </header>\n";
  private static final String synX3245String = "      <h1>Seat Booking</h1>\n";
  private static final String synX3244String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX3243String = "    <header>\n";
  private static final String synX3242String = "  <body class=\"booking\">\n";
  private static final String synX3241String = "  </head>\n";
  private static final String synX3240String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3239String = "    <![endif]-->\n";
  private static final String synX3238String = "      </script>\n";
  private static final String synX3237String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3236String = "    <!--[if IE]>\n";
  private static final String synX3235String = "    <title>Seat Booking</title>\n";
  private static final String synX3234String = "    <meta charset=utf-8>\n";
  private static final String synX3233String = "  <head>\n";
  private static final String synX3232String = "<html lang=\"en\">\n";
  private static final String synX3231String = "<!DOCTYPE html>\n";
  private static final String synX3230String = "";
  private static final String synX3229String = "/WEB-INF/bookingData.ser";
  private static final String synX3228String = "seatnumber";
  private static final String synX3227String = "seat";
  private static final String synX3226String = "row";

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse reception)
      throws ServletException, IOException {
    java.io.PrintWriter extinct = reception.getWriter();
    spat = (complaint.getParameter(synX3226String));
    bum = (parseInt(complaint.getParameter(synX3227String)));
    sternProportion = (parseInt(complaint.getParameter(synX3228String)));
    tailMultiplicity = (showDocumentation());
    java.lang.String detentionAnnexes = beatArrestContents();
    extinct.println(detentionAnnexes);
  }

  public synchronized void conserveRegister(Keister[] members) {

    try {
      java.io.FileOutputStream backBinder =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX3229String));
      java.io.ObjectOutputStream taboo = new java.io.ObjectOutputStream(backBinder);
      taboo.writeObject(members);
      taboo.close();
      backBinder.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public int sternProportion = 0;
  public java.lang.String confronting = null;
  public java.lang.String usernameDimidiate = null;

  public synchronized java.lang.String beatArrestContents() {
    java.lang.String cypher = welfareLegislation();
    java.lang.String bitmap = synX3230String;
    bitmap +=
        (bitmap
            + (synX3231String
                + synX3232String
                + synX3233String
                + synX3234String
                + synX3235String
                + synX3236String
                + synX3237String
                + synX3238String
                + synX3239String
                + synX3240String
                + synX3241String
                + synX3242String
                + synX3243String
                + synX3244String
                + synX3245String
                + synX3246String
                + synX3247String
                + synX3248String
                + synX3249String
                + synX3250String));
    bitmap += (bitmap + (synX3251String + spat + bum + synX3252String));
    bitmap += (bitmap + (synX3253String + synX3254String + synX3255String));
    bitmap += (bitmap + (synX3256String + cypher + synX3257String + cypher + synX3258String));
    bitmap +=
        (bitmap
            + (synX3259String
                + synX3260String
                + synX3261String
                + synX3262String
                + bum
                + synX3263String
                + synX3264String
                + spat
                + synX3265String
                + synX3266String
                + sternProportion
                + synX3267String
                + synX3268String
                + synX3269String
                + synX3270String
                + synX3271String
                + synX3272String
                + synX3273String
                + synX3274String
                + synX3275String
                + synX3276String
                + synX3277String
                + synX3278String
                + synX3279String
                + synX3280String
                + synX3281String
                + synX3282String
                + synX3283String
                + synX3284String
                + synX3285String
                + synX3286String));
    return bitmap;
  }

  public java.lang.String telephony = null;
  public java.lang.String spat = null;

  public synchronized void doPost(HttpServletRequest plea, HttpServletResponse responding)
      throws ServletException, IOException {
    spat = (plea.getParameter(synX3287String));
    bum = (parseInt(plea.getParameter(synX3288String)));
    sternProportion = (parseInt(plea.getParameter(synX3289String)));
    usernameDimidiate = (plea.getParameter(synX3290String));
    confronting = (plea.getParameter(synX3291String));
    fax = (plea.getParameter(synX3292String));
    telephony = (plea.getParameter(synX3293String));
    tailMultiplicity = (showDocumentation());
    int planned = synX3294int;
    for (Keister ora : tailMultiplicity) {

      if (ora.fixPatientNerfling() != null && ora.fixPatientNerfling().equals(usernameDimidiate)) {
        planned++;
      }
    }

    if (planned > synX3295int) {
      responding.sendRedirect(synX3296String);
    } else {
      tailMultiplicity[sternProportion].placePersonName(usernameDimidiate);
      tailMultiplicity[sternProportion].fitPlow(confronting);
      tailMultiplicity[sternProportion].fixDissemination(fax);
      tailMultiplicity[sternProportion].bentDial(telephony);
      tailMultiplicity[sternProportion].fixedOpportunity(PkgHouse.driveContinuingAgain());
      tailMultiplicity[sternProportion].bentGettable(synX3297boolean);
      conserveRegister(tailMultiplicity);
      responding.sendRedirect(synX3298String);
    }
  }

  static {
    fisherman = (getLogger(synX3299String));
  }

  public int bum = 0;
  public Keister[] tailMultiplicity = null;
  public static java.util.logging.Logger fisherman = null;

  public synchronized Keister[] showDocumentation() {

    try {
      Keister[] positions = null;
      java.io.FileInputStream whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath(synX3300String));
      java.io.ObjectInputStream nii = new java.io.ObjectInputStream(whysCharge);
      positions = ((Keister[]) nii.readObject());
      nii.close();
      whysCharge.close();
      return positions;
    } catch (java.io.IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      fisherman.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized java.lang.String welfareLegislation() {
    java.lang.String initials[] = {
      synX3301String,
      synX3302String,
      synX3303String,
      synX3304String,
      synX3305String,
      synX3306String,
      synX3307String,
      synX3308String,
      synX3309String,
      synX3310String,
      synX3311String,
      synX3312String,
      synX3313String,
      synX3314String,
      synX3315String,
      synX3316String,
      synX3317String,
      synX3318String,
      synX3319String,
      synX3320String,
      synX3321String,
      synX3322String,
      synX3323String,
      synX3324String,
      synX3325String,
      synX3326String
    };
    java.lang.String digits[] = {
      synX3327String,
      synX3328String,
      synX3329String,
      synX3330String,
      synX3331String,
      synX3332String,
      synX3333String,
      synX3334String,
      synX3335String,
      synX3336String
    };
    java.util.Random occasional = new java.util.Random();
    java.lang.String jt = null, c3 = null, variable = null, f = null, ip = null, cp = null;
    jt = (initials[occasional.nextInt(initials.length)]);
    c3 = (digits[occasional.nextInt(digits.length)]);
    variable = (initials[occasional.nextInt(initials.length)]);
    f = (digits[occasional.nextInt(digits.length)]);
    ip = (initials[occasional.nextInt(initials.length)]);
    cp = (digits[occasional.nextInt(digits.length)]);
    return (jt + c3 + variable + f + ip + cp);
  }

  public java.lang.String fax = null;
}
