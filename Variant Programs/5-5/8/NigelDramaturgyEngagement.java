import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static java.lang.Integer.parseInt;

public class NigelDramaturgyEngagement extends javax.servlet.http.HttpServlet {
  private static final String synX778String = "benstheatre?message=success";
  private static final boolean synX777boolean = false;
  private static final String synX776String = "benstheatre?message=limitexceeded";
  private static final int synX775int = 2;
  private static final int synX774int = 0;
  private static final String synX773String = "phone";
  private static final String synX772String = "email";
  private static final String synX771String = "address";
  private static final String synX770String = "userid";
  private static final String synX769String = "seatnumber";
  private static final String synX768String = "seat";
  private static final String synX767String = "row";
  private static final String synX766String = "seatnumber";
  private static final String synX765String = "seat";
  private static final String synX764String = "row";
  private static final String synX763String = "/WEB-INF/bookingData.ser";
  private static final String synX762String = "/WEB-INF/bookingData.ser";
  private static final String synX761String = "bensTheatre";
  private static final String synX760String = "9";
  private static final String synX759String = "8";
  private static final String synX758String = "7";
  private static final String synX757String = "6";
  private static final String synX756String = "5";
  private static final String synX755String = "4";
  private static final String synX754String = "3";
  private static final String synX753String = "2";
  private static final String synX752String = "1";
  private static final String synX751String = "0";
  private static final String synX750String = "Z";
  private static final String synX749String = "Y";
  private static final String synX748String = "X";
  private static final String synX747String = "W";
  private static final String synX746String = "V";
  private static final String synX745String = "U";
  private static final String synX744String = "T";
  private static final String synX743String = "S";
  private static final String synX742String = "R";
  private static final String synX741String = "Q";
  private static final String synX740String = "P";
  private static final String synX739String = "O";
  private static final String synX738String = "N";
  private static final String synX737String = "M";
  private static final String synX736String = "L";
  private static final String synX735String = "K";
  private static final String synX734String = "J";
  private static final String synX733String = "I";
  private static final String synX732String = "H";
  private static final String synX731String = "G";
  private static final String synX730String = "F";
  private static final String synX729String = "E";
  private static final String synX728String = "D";
  private static final String synX727String = "C";
  private static final String synX726String = "B";
  private static final String synX725String = "A";
  private static final String synX724String = "</html>";
  private static final String synX723String = "  </body>\t\n";
  private static final String synX722String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX721String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX720String = "    </footer>\n";
  private static final String synX719String = "      </div>\n";
  private static final String synX718String = "        <p>c3063467</p>\n";
  private static final String synX717String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX716String = "      <div class=\"author\">\n";
  private static final String synX715String = "    <footer>\n";
  private static final String synX714String = "    </article>\n";
  private static final String synX713String = "      </form>\n";
  private static final String synX712String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX711String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX710String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX709String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX708String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX707String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX706String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX705String = "\" />\n";
  private static final String synX704String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX703String = "\" />\n";
  private static final String synX702String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX701String = "\" />\n";
  private static final String synX700String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX699String = "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX698String = "\n";
  private static final String synX697String = "</div>\n";
  private static final String synX696String = "</p>";
  private static final String synX695String = "\">";
  private static final String synX694String = "<p class=\"option\" data-code=\"";
  private static final String synX693String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX692String = "      <div class=\"security\">\n";
  private static final String synX691String = "</div>\n";
  private static final String synX690String = "</p>";
  private static final String synX689String = "<p class=\"option\">";
  private static final String synX688String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX687String = "      <div class=\"selected\">\n";
  private static final String synX686String = "      <h2>Your Selection</h2>\n";
  private static final String synX685String = "    <article>\n";
  private static final String synX684String = "    </header>\n";
  private static final String synX683String = "      <h1>Seat Booking</h1>\n";
  private static final String synX682String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX681String = "    <header>\n";
  private static final String synX680String = "  <body class=\"booking\">\n";
  private static final String synX679String = "  </head>\n";
  private static final String synX678String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX677String = "    <![endif]-->\n";
  private static final String synX676String = "      </script>\n";
  private static final String synX675String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX674String = "    <!--[if IE]>\n";
  private static final String synX673String = "    <title>Seat Booking</title>\n";
  private static final String synX672String = "    <meta charset=utf-8>\n";
  private static final String synX671String = "  <head>\n";
  private static final String synX670String = "<html lang=\"en\">\n";
  private static final String synX669String = "<!DOCTYPE html>\n";
  private static final String synX668String = "";

  public synchronized java.lang.String generateHiringSheet() {
    java.lang.String law;
    java.lang.String keyword;
    law = (firewallEncode());
    keyword = (synX668String);
    keyword +=
        ((synX669String
            + synX670String
            + synX671String
            + synX672String
            + synX673String
            + synX674String
            + synX675String
            + synX676String
            + synX677String
            + synX678String
            + synX679String
            + synX680String
            + synX681String
            + synX682String
            + synX683String
            + synX684String
            + synX685String
            + synX686String
            + synX687String
            + synX688String));
    keyword += ((synX689String + wrangle + posterior + synX690String));
    keyword += ((synX691String + synX692String + synX693String));
    keyword += ((synX694String + law + synX695String + law + synX696String));
    keyword +=
        ((synX697String
            + synX698String
            + synX699String
            + synX700String
            + posterior
            + synX701String
            + synX702String
            + wrangle
            + synX703String
            + synX704String
            + placeList
            + synX705String
            + synX706String
            + synX707String
            + synX708String
            + synX709String
            + synX710String
            + synX711String
            + synX712String
            + synX713String
            + synX714String
            + synX715String
            + synX716String
            + synX717String
            + synX718String
            + synX719String
            + synX720String
            + synX721String
            + synX722String
            + synX723String
            + synX724String));
    return keyword;
  }

  public java.lang.String speech = null;
  public Bum[] fannyPlethora = null;
  public java.lang.String correspondence = null;
  public int posterior = 0;
  public static java.util.logging.Logger recording = null;

  public synchronized java.lang.String firewallEncode() {
    java.lang.String mailings[] = {
      synX725String,
      synX726String,
      synX727String,
      synX728String,
      synX729String,
      synX730String,
      synX731String,
      synX732String,
      synX733String,
      synX734String,
      synX735String,
      synX736String,
      synX737String,
      synX738String,
      synX739String,
      synX740String,
      synX741String,
      synX742String,
      synX743String,
      synX744String,
      synX745String,
      synX746String,
      synX747String,
      synX748String,
      synX749String,
      synX750String
    };
    java.lang.String figure[] = {
      synX751String,
      synX752String,
      synX753String,
      synX754String,
      synX755String,
      synX756String,
      synX757String,
      synX758String,
      synX759String,
      synX760String
    };
    java.util.Random sporadic;
    java.lang.String momenta, a1, crh, cf, logarithm, ri;
    sporadic = (new java.util.Random());
    momenta = (null);
    a1 = (null);
    crh = (null);
    cf = (null);
    logarithm = (null);
    ri = (null);
    momenta = (mailings[sporadic.nextInt(mailings.length)]);
    a1 = (figure[sporadic.nextInt(figure.length)]);
    crh = (mailings[sporadic.nextInt(mailings.length)]);
    cf = (figure[sporadic.nextInt(figure.length)]);
    logarithm = (mailings[sporadic.nextInt(mailings.length)]);
    ri = (figure[sporadic.nextInt(figure.length)]);
    return (momenta + a1 + crh + cf + logarithm + ri);
  }

  static {
    recording = (getLogger(synX761String));
  }

  public synchronized Bum[] quoteData() {

    try {
      java.io.FileInputStream immigrationFolder;
      java.io.ObjectInputStream adherents;
      Bum[] chairs = null;
      immigrationFolder =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX762String)));
      adherents = (new java.io.ObjectInputStream(immigrationFolder));
      chairs = ((Bum[]) adherents.readObject());
      adherents.close();
      immigrationFolder.close();
      return chairs;
    } catch (java.io.IOException i) {
      recording.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      recording.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public java.lang.String telephones = null;

  public synchronized void safeguardArchiving(Bum[] spaces) {

    try {
      java.io.FileOutputStream unstylishPaperwork;
      java.io.ObjectOutputStream retired;
      unstylishPaperwork =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX763String)));
      retired = (new java.io.ObjectOutputStream(unstylishPaperwork));
      retired.writeObject(spaces);
      retired.close();
      unstylishPaperwork.close();
    } catch (java.io.IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse reacting)
      throws ServletException, IOException {
    java.io.PrintWriter taboo;
    java.lang.String orderingPagination;
    taboo = (reacting.getWriter());
    wrangle = (ask.getParameter(synX764String));
    posterior = (parseInt(ask.getParameter(synX765String)));
    placeList = (parseInt(ask.getParameter(synX766String)));
    fannyPlethora = (quoteData());
    orderingPagination = (generateHiringSheet());
    taboo.println(orderingPagination);
  }

  public int placeList = 0;
  public java.lang.String wrangle = null;

  public synchronized void doPost(HttpServletRequest petitioning, HttpServletResponse feedback)
      throws ServletException, IOException {
    int entered;
    wrangle = (petitioning.getParameter(synX767String));
    posterior = (parseInt(petitioning.getParameter(synX768String)));
    placeList = (parseInt(petitioning.getParameter(synX769String)));
    wearerMap = (petitioning.getParameter(synX770String));
    speech = (petitioning.getParameter(synX771String));
    correspondence = (petitioning.getParameter(synX772String));
    telephones = (petitioning.getParameter(synX773String));
    fannyPlethora = (quoteData());
    entered = (synX774int);
    for (Bum waffen : fannyPlethora) {

      if (waffen.comeEnjoyerMilad() != null && waffen.comeEnjoyerMilad().equals(wearerMap)) {
        entered++;
      }
    }

    if (entered > synX775int) {
      feedback.sendRedirect(synX776String);
    } else {
      fannyPlethora[placeList].determineEmployeePictures(wearerMap);
      fannyPlethora[placeList].arrangeRespond(speech);
      fannyPlethora[placeList].situatedPostal(correspondence);
      fannyPlethora[placeList].readyRing(telephones);
      fannyPlethora[placeList].fitYear(AstonArts.conveyFormerAmount());
      fannyPlethora[placeList].doUnavailable(synX777boolean);
      safeguardArchiving(fannyPlethora);
      feedback.sendRedirect(synX778String);
    }
  }

  public java.lang.String wearerMap = null;
}
