import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class YyyDramaticsTicketing extends HttpServlet {
  private static final String synX347String = "/WEB-INF/bookingData.ser";
  private static final String synX346String = "/WEB-INF/bookingData.ser";
  private static final String synX345String = "9";
  private static final String synX344String = "8";
  private static final String synX343String = "7";
  private static final String synX342String = "6";
  private static final String synX341String = "5";
  private static final String synX340String = "4";
  private static final String synX339String = "3";
  private static final String synX338String = "2";
  private static final String synX337String = "1";
  private static final String synX336String = "0";
  private static final String synX335String = "Z";
  private static final String synX334String = "Y";
  private static final String synX333String = "X";
  private static final String synX332String = "W";
  private static final String synX331String = "V";
  private static final String synX330String = "U";
  private static final String synX329String = "T";
  private static final String synX328String = "S";
  private static final String synX327String = "R";
  private static final String synX326String = "Q";
  private static final String synX325String = "P";
  private static final String synX324String = "O";
  private static final String synX323String = "N";
  private static final String synX322String = "M";
  private static final String synX321String = "L";
  private static final String synX320String = "K";
  private static final String synX319String = "J";
  private static final String synX318String = "I";
  private static final String synX317String = "H";
  private static final String synX316String = "G";
  private static final String synX315String = "F";
  private static final String synX314String = "E";
  private static final String synX313String = "D";
  private static final String synX312String = "C";
  private static final String synX311String = "B";
  private static final String synX310String = "A";
  private static final String synX309String = "</html>";
  private static final String synX308String = "  </body>\t\n";
  private static final String synX307String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX306String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX305String = "    </footer>\n";
  private static final String synX304String = "      </div>\n";
  private static final String synX303String = "        <p>c3063467</p>\n";
  private static final String synX302String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX301String = "      <div class=\"author\">\n";
  private static final String synX300String = "    <footer>\n";
  private static final String synX299String = "    </article>\n";
  private static final String synX298String = "      </form>\n";
  private static final String synX297String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX296String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX295String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX294String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX293String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX292String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX291String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX290String = "\" />\n";
  private static final String synX289String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX288String = "\" />\n";
  private static final String synX287String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX286String = "\" />\n";
  private static final String synX285String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX284String = "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX283String = "\n";
  private static final String synX282String = "</div>\n";
  private static final String synX281String = "</p>";
  private static final String synX280String = "\">";
  private static final String synX279String = "<p class=\"option\" data-code=\"";
  private static final String synX278String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX277String = "      <div class=\"security\">\n";
  private static final String synX276String = "</div>\n";
  private static final String synX275String = "</p>";
  private static final String synX274String = "<p class=\"option\">";
  private static final String synX273String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX272String = "      <div class=\"selected\">\n";
  private static final String synX271String = "      <h2>Your Selection</h2>\n";
  private static final String synX270String = "    <article>\n";
  private static final String synX269String = "    </header>\n";
  private static final String synX268String = "      <h1>Seat Booking</h1>\n";
  private static final String synX267String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX266String = "    <header>\n";
  private static final String synX265String = "  <body class=\"booking\">\n";
  private static final String synX264String = "  </head>\n";
  private static final String synX263String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX262String = "    <![endif]-->\n";
  private static final String synX261String = "      </script>\n";
  private static final String synX260String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX259String = "    <!--[if IE]>\n";
  private static final String synX258String = "    <title>Seat Booking</title>\n";
  private static final String synX257String = "    <meta charset=utf-8>\n";
  private static final String synX256String = "  <head>\n";
  private static final String synX255String = "<html lang=\"en\">\n";
  private static final String synX254String = "<!DOCTYPE html>\n";
  private static final String synX253String = "";
  private static final String synX252String = "benstheatre?message=success";
  private static final boolean synX251boolean = false;
  private static final String synX250String = "benstheatre?message=limitexceeded";
  private static final int synX249int = 2;
  private static final int synX248int = 0;
  private static final String synX247String = "phone";
  private static final String synX246String = "email";
  private static final String synX245String = "address";
  private static final String synX244String = "userid";
  private static final String synX243String = "seatnumber";
  private static final String synX242String = "seat";
  private static final String synX241String = "row";
  private static final String synX240String = "seatnumber";
  private static final String synX239String = "seat";
  private static final String synX238String = "row";
  public static Logger fisherman = Logger.getLogger("bensTheatre");
  public String inbox = null;
  public String respond = null;
  public String switchboard = null;
  public String personName = null;
  public int tail = 0;
  public int sternProportion = 0;
  public String ranking = null;
  public Tooshie[] buttMix = null;

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse reception)
      throws ServletException, IOException {
    PrintWriter forbidden;
    String subscriptionTable;
    forbidden = (reception.getWriter());
    ranking = (asks.getParameter(synX238String));
    tail = (Integer.parseInt(asks.getParameter(synX239String)));
    sternProportion = (Integer.parseInt(asks.getParameter(synX240String)));
    buttMix = (registerSubmit());
    subscriptionTable = (becomeVenueFront());
    forbidden.println(subscriptionTable);
  }

  public synchronized void doPost(HttpServletRequest decision, HttpServletResponse replies)
      throws ServletException, IOException {
    int purchased;
    ranking = (decision.getParameter(synX241String));
    tail = (Integer.parseInt(decision.getParameter(synX242String)));
    sternProportion = (Integer.parseInt(decision.getParameter(synX243String)));
    personName = (decision.getParameter(synX244String));
    respond = (decision.getParameter(synX245String));
    inbox = (decision.getParameter(synX246String));
    switchboard = (decision.getParameter(synX247String));
    buttMix = (registerSubmit());
    purchased = (synX248int);
    for (Tooshie waffen : buttMix) {

      if (waffen.receiveUsabilityCard() != null
          && waffen.receiveUsabilityCard().equals(personName)) {
        purchased++;
      }
    }

    if (purchased > synX249int) {
      replies.sendRedirect(synX250String);
    } else {
      buttMix[sternProportion].laidEnjoyerMilad(personName);
      buttMix[sternProportion].placedDirect(respond);
      buttMix[sternProportion].bentCourier(inbox);
      buttMix[sternProportion].markMobile(switchboard);
      buttMix[sternProportion].fixThing(IainAmphitheatre.takeTopicalPeriod());
      buttMix[sternProportion].arrangedProcurable(synX251boolean);
      safeguardArchiving(buttMix);
      replies.sendRedirect(synX252String);
    }
  }

  public synchronized String becomeVenueFront() {
    String encode;
    String firefox;
    encode = (protectingEncryption());
    firefox = (synX253String);
    firefox +=
        (firefox
            + (synX254String
                + synX255String
                + synX256String
                + synX257String
                + synX258String
                + synX259String
                + synX260String
                + synX261String
                + synX262String
                + synX263String
                + synX264String
                + synX265String
                + synX266String
                + synX267String
                + synX268String
                + synX269String
                + synX270String
                + synX271String
                + synX272String
                + synX273String));
    firefox += (firefox + (synX274String + ranking + tail + synX275String));
    firefox += (firefox + (synX276String + synX277String + synX278String));
    firefox += (firefox + (synX279String + encode + synX280String + encode + synX281String));
    firefox +=
        (firefox
            + (synX282String
                + synX283String
                + synX284String
                + synX285String
                + tail
                + synX286String
                + synX287String
                + ranking
                + synX288String
                + synX289String
                + sternProportion
                + synX290String
                + synX291String
                + synX292String
                + synX293String
                + synX294String
                + synX295String
                + synX296String
                + synX297String
                + synX298String
                + synX299String
                + synX300String
                + synX301String
                + synX302String
                + synX303String
                + synX304String
                + synX305String
                + synX306String
                + synX307String
                + synX308String
                + synX309String));
    return firefox;
  }

  public synchronized String protectingEncryption() {
    String words[] = {
      synX310String,
      synX311String,
      synX312String,
      synX313String,
      synX314String,
      synX315String,
      synX316String,
      synX317String,
      synX318String,
      synX319String,
      synX320String,
      synX321String,
      synX322String,
      synX323String,
      synX324String,
      synX325String,
      synX326String,
      synX327String,
      synX328String,
      synX329String,
      synX330String,
      synX331String,
      synX332String,
      synX333String,
      synX334String,
      synX335String
    };
    String digits[] = {
      synX336String,
      synX337String,
      synX338String,
      synX339String,
      synX340String,
      synX341String,
      synX342String,
      synX343String,
      synX344String,
      synX345String
    };
    Random unselected;
    String radius, r6, frequencies, correspond, coordinates, mx;
    unselected = (new Random());
    radius = (null);
    r6 = (null);
    frequencies = (null);
    correspond = (null);
    coordinates = (null);
    mx = (null);
    radius = (words[unselected.nextInt(words.length)]);
    r6 = (digits[unselected.nextInt(digits.length)]);
    frequencies = (words[unselected.nextInt(words.length)]);
    correspond = (digits[unselected.nextInt(digits.length)]);
    coordinates = (words[unselected.nextInt(words.length)]);
    mx = (digits[unselected.nextInt(digits.length)]);
    return (radius + r6 + frequencies + correspond + coordinates + mx);
  }

  public synchronized Tooshie[] registerSubmit() {

    try {
      FileInputStream entriesLodge;
      ObjectInputStream cbs;
      Tooshie[] ridings = null;
      entriesLodge = (new FileInputStream(getServletContext().getRealPath(synX346String)));
      cbs = (new ObjectInputStream(entriesLodge));
      ridings = ((Tooshie[]) cbs.readObject());
      cbs.close();
      entriesLodge.close();
      return ridings;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      fisherman.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void safeguardArchiving(Tooshie[] benches) {

    try {
      FileOutputStream tabuInitiate;
      ObjectOutputStream unstylish;
      tabuInitiate = (new FileOutputStream(getServletContext().getRealPath(synX347String)));
      unstylish = (new ObjectOutputStream(tabuInitiate));
      unstylish.writeObject(benches);
      unstylish.close();
      tabuInitiate.close();
    } catch (IOException adoptee) {
      adoptee.printStackTrace();
    }
  }
}
