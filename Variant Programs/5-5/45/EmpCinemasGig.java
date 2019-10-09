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

public class EmpCinemasGig extends javax.servlet.http.HttpServlet {
  private static final String synX5425String = "bensTheatre";
  private static final String synX5424String = "/WEB-INF/bookingData.ser";
  private static final String synX5423String = "/WEB-INF/bookingData.ser";
  private static final String synX5422String = "9";
  private static final String synX5421String = "8";
  private static final String synX5420String = "7";
  private static final String synX5419String = "6";
  private static final String synX5418String = "5";
  private static final String synX5417String = "4";
  private static final String synX5416String = "3";
  private static final String synX5415String = "2";
  private static final String synX5414String = "1";
  private static final String synX5413String = "0";
  private static final String synX5412String = "Z";
  private static final String synX5411String = "Y";
  private static final String synX5410String = "X";
  private static final String synX5409String = "W";
  private static final String synX5408String = "V";
  private static final String synX5407String = "U";
  private static final String synX5406String = "T";
  private static final String synX5405String = "S";
  private static final String synX5404String = "R";
  private static final String synX5403String = "Q";
  private static final String synX5402String = "P";
  private static final String synX5401String = "O";
  private static final String synX5400String = "N";
  private static final String synX5399String = "M";
  private static final String synX5398String = "L";
  private static final String synX5397String = "K";
  private static final String synX5396String = "J";
  private static final String synX5395String = "I";
  private static final String synX5394String = "H";
  private static final String synX5393String = "G";
  private static final String synX5392String = "F";
  private static final String synX5391String = "E";
  private static final String synX5390String = "D";
  private static final String synX5389String = "C";
  private static final String synX5388String = "B";
  private static final String synX5387String = "A";
  private static final String synX5386String = "</html>";
  private static final String synX5385String = "  </body>\t\n";
  private static final String synX5384String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX5383String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX5382String = "    </footer>\n";
  private static final String synX5381String = "      </div>\n";
  private static final String synX5380String = "        <p>c3063467</p>\n";
  private static final String synX5379String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX5378String = "      <div class=\"author\">\n";
  private static final String synX5377String = "    <footer>\n";
  private static final String synX5376String = "    </article>\n";
  private static final String synX5375String = "      </form>\n";
  private static final String synX5374String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX5373String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX5372String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX5371String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX5370String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX5369String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX5368String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX5367String = "\" />\n";
  private static final String synX5366String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX5365String = "\" />\n";
  private static final String synX5364String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX5363String = "\" />\n";
  private static final String synX5362String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX5361String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX5360String = "\n";
  private static final String synX5359String = "</div>\n";
  private static final String synX5358String = "</p>";
  private static final String synX5357String = "\">";
  private static final String synX5356String = "<p class=\"option\" data-code=\"";
  private static final String synX5355String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX5354String = "      <div class=\"security\">\n";
  private static final String synX5353String = "</div>\n";
  private static final String synX5352String = "</p>";
  private static final String synX5351String = "<p class=\"option\">";
  private static final String synX5350String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX5349String = "      <div class=\"selected\">\n";
  private static final String synX5348String = "      <h2>Your Selection</h2>\n";
  private static final String synX5347String = "    <article>\n";
  private static final String synX5346String = "    </header>\n";
  private static final String synX5345String = "      <h1>Seat Booking</h1>\n";
  private static final String synX5344String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX5343String = "    <header>\n";
  private static final String synX5342String = "  <body class=\"booking\">\n";
  private static final String synX5341String = "  </head>\n";
  private static final String synX5340String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX5339String = "    <![endif]-->\n";
  private static final String synX5338String = "      </script>\n";
  private static final String synX5337String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX5336String = "    <!--[if IE]>\n";
  private static final String synX5335String = "    <title>Seat Booking</title>\n";
  private static final String synX5334String = "    <meta charset=utf-8>\n";
  private static final String synX5333String = "  <head>\n";
  private static final String synX5332String = "<html lang=\"en\">\n";
  private static final String synX5331String = "<!DOCTYPE html>\n";
  private static final String synX5330String = "";
  private static final String synX5329String = "benstheatre?message=success";
  private static final boolean synX5328boolean = false;
  private static final String synX5327String = "benstheatre?message=limitexceeded";
  private static final int synX5326int = 2;
  private static final int synX5325int = 0;
  private static final String synX5324String = "phone";
  private static final String synX5323String = "email";
  private static final String synX5322String = "address";
  private static final String synX5321String = "userid";
  private static final String synX5320String = "seatnumber";
  private static final String synX5319String = "seat";
  private static final String synX5318String = "row";
  private static final String synX5317String = "seatnumber";
  private static final String synX5316String = "seat";
  private static final String synX5315String = "row";
  public static java.util.logging.Logger homesteader;
  public java.lang.String courier;
  public java.lang.String rectify;
  public java.lang.String switchboard;
  public java.lang.String patientNerfling;
  public int fanny;
  public int derriereEnumerate;
  public java.lang.String series;
  public Bottom[] bumSelection;

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse responds)
      throws ServletException, IOException {
    java.io.PrintWriter down;
    java.lang.String rentalSite;
    down = responds.getWriter();
    series = quest.getParameter(synX5315String);
    fanny = parseInt(quest.getParameter(synX5316String));
    derriereEnumerate = parseInt(quest.getParameter(synX5317String));
    bumSelection = wrotePapers();
    rentalSite = bringTicketingWebpage();
    down.println(rentalSite);
  }

  public synchronized void doPost(HttpServletRequest asks, HttpServletResponse reaction)
      throws ServletException, IOException {
    int entered;
    series = asks.getParameter(synX5318String);
    fanny = parseInt(asks.getParameter(synX5319String));
    derriereEnumerate = parseInt(asks.getParameter(synX5320String));
    patientNerfling = asks.getParameter(synX5321String);
    rectify = asks.getParameter(synX5322String);
    courier = asks.getParameter(synX5323String);
    switchboard = asks.getParameter(synX5324String);
    bumSelection = wrotePapers();
    entered = synX5325int;
    for (Bottom fh : bumSelection) synx155(fh, entered);

    if (entered > synX5326int) {
      reaction.sendRedirect(synX5327String);
    } else {
      bumSelection[derriereEnumerate].arrangeVisitorOwnership(patientNerfling);
      bumSelection[derriereEnumerate].adjustSolve(rectify);
      bumSelection[derriereEnumerate].adjustUrl(courier);
      bumSelection[derriereEnumerate].arrangedEarphone(switchboard);
      bumSelection[derriereEnumerate].layMoment(SimoneBroadway.findActualSentence());
      bumSelection[derriereEnumerate].dictatedPurchasable(synX5328boolean);
      salvagingSubmitting(bumSelection);
      reaction.sendRedirect(synX5329String);
    }
  }

  public synchronized java.lang.String bringTicketingWebpage() {
    java.lang.String legislation;
    java.lang.String ajax;
    legislation = stabilityRules();
    ajax = synX5330String;
    ajax +=
        synX5331String
            + synX5332String
            + synX5333String
            + synX5334String
            + synX5335String
            + synX5336String
            + synX5337String
            + synX5338String
            + synX5339String
            + synX5340String
            + synX5341String
            + synX5342String
            + synX5343String
            + synX5344String
            + synX5345String
            + synX5346String
            + synX5347String
            + synX5348String
            + synX5349String
            + synX5350String;
    ajax += synX5351String + series + fanny + synX5352String;
    ajax += synX5353String + synX5354String + synX5355String;
    ajax += synX5356String + legislation + synX5357String + legislation + synX5358String;
    ajax +=
        synX5359String
            + synX5360String
            + synX5361String
            + synX5362String
            + fanny
            + synX5363String
            + synX5364String
            + series
            + synX5365String
            + synX5366String
            + derriereEnumerate
            + synX5367String
            + synX5368String
            + synX5369String
            + synX5370String
            + synX5371String
            + synX5372String
            + synX5373String
            + synX5374String
            + synX5375String
            + synX5376String
            + synX5377String
            + synX5378String
            + synX5379String
            + synX5380String
            + synX5381String
            + synX5382String
            + synX5383String
            + synX5384String
            + synX5385String
            + synX5386String;
    return ajax;
  }

  public synchronized java.lang.String stabilityRules() {
    java.lang.String memos[] = {
      synX5387String,
      synX5388String,
      synX5389String,
      synX5390String,
      synX5391String,
      synX5392String,
      synX5393String,
      synX5394String,
      synX5395String,
      synX5396String,
      synX5397String,
      synX5398String,
      synX5399String,
      synX5400String,
      synX5401String,
      synX5402String,
      synX5403String,
      synX5404String,
      synX5405String,
      synX5406String,
      synX5407String,
      synX5408String,
      synX5409String,
      synX5410String,
      synX5411String,
      synX5412String
    };
    java.lang.String figure[] = {
      synX5413String,
      synX5414String,
      synX5415String,
      synX5416String,
      synX5417String,
      synX5418String,
      synX5419String,
      synX5420String,
      synX5421String,
      synX5422String
    };
    java.util.Random arbitrary;
    java.lang.String p, ao, interval, fgf, ri, mx;
    arbitrary = new java.util.Random();
    p = memos[arbitrary.nextInt(memos.length)];
    ao = figure[arbitrary.nextInt(figure.length)];
    interval = memos[arbitrary.nextInt(memos.length)];
    fgf = figure[arbitrary.nextInt(figure.length)];
    ri = memos[arbitrary.nextInt(memos.length)];
    mx = figure[arbitrary.nextInt(figure.length)];
    return p + ao + interval + fgf + ri + mx;
  }

  public synchronized Bottom[] wrotePapers() {

    try {
      java.io.FileInputStream advocatesExecutable;
      java.io.ObjectInputStream adherents;
      Bottom[] beds;
      advocatesExecutable =
          new java.io.FileInputStream(getServletContext().getRealPath(synX5423String));
      adherents = new java.io.ObjectInputStream(advocatesExecutable);
      beds = (Bottom[]) adherents.readObject();
      adherents.close();
      advocatesExecutable.close();
      return beds;
    } catch (java.io.IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      homesteader.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void salvagingSubmitting(Bottom[] constituencies) {

    try {
      java.io.FileOutputStream unfashionableFilename;
      java.io.ObjectOutputStream stunned;
      unfashionableFilename =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX5424String));
      stunned = new java.io.ObjectOutputStream(unfashionableFilename);
      stunned.writeObject(constituencies);
      stunned.close();
      unfashionableFilename.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  static {
    homesteader = getLogger(synX5425String);
  }

  private synchronized void synx155(Bottom fh, int entered) throws ServletException, IOException {

    if (fh.receiveUsabilityCard() != null && fh.receiveUsabilityCard().equals(patientNerfling)) {
      entered++;
    }
  }
}
