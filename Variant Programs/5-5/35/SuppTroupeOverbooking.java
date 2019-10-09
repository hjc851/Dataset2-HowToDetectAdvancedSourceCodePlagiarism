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

public class SuppTroupeOverbooking extends javax.servlet.http.HttpServlet {
  private static final String synX4281String = "</html>";
  private static final String synX4280String = "  </body>\t\n";
  private static final String synX4279String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4278String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4277String = "    </footer>\n";
  private static final String synX4276String = "      </div>\n";
  private static final String synX4275String = "        <p>c3063467</p>\n";
  private static final String synX4274String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4273String = "      <div class=\"author\">\n";
  private static final String synX4272String = "    <footer>\n";
  private static final String synX4271String = "    </article>\n";
  private static final String synX4270String = "      </form>\n";
  private static final String synX4269String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX4268String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX4267String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX4266String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX4265String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX4264String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX4263String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX4262String = "\" />\n";
  private static final String synX4261String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX4260String = "\" />\n";
  private static final String synX4259String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX4258String = "\" />\n";
  private static final String synX4257String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX4256String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX4255String = "\n";
  private static final String synX4254String = "</div>\n";
  private static final String synX4253String = "</p>";
  private static final String synX4252String = "\">";
  private static final String synX4251String = "<p class=\"option\" data-code=\"";
  private static final String synX4250String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX4249String = "      <div class=\"security\">\n";
  private static final String synX4248String = "</div>\n";
  private static final String synX4247String = "</p>";
  private static final String synX4246String = "<p class=\"option\">";
  private static final String synX4245String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX4244String = "      <div class=\"selected\">\n";
  private static final String synX4243String = "      <h2>Your Selection</h2>\n";
  private static final String synX4242String = "    <article>\n";
  private static final String synX4241String = "    </header>\n";
  private static final String synX4240String = "      <h1>Seat Booking</h1>\n";
  private static final String synX4239String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX4238String = "    <header>\n";
  private static final String synX4237String = "  <body class=\"booking\">\n";
  private static final String synX4236String = "  </head>\n";
  private static final String synX4235String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4234String = "    <![endif]-->\n";
  private static final String synX4233String = "      </script>\n";
  private static final String synX4232String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4231String = "    <!--[if IE]>\n";
  private static final String synX4230String = "    <title>Seat Booking</title>\n";
  private static final String synX4229String = "    <meta charset=utf-8>\n";
  private static final String synX4228String = "  <head>\n";
  private static final String synX4227String = "<html lang=\"en\">\n";
  private static final String synX4226String = "<!DOCTYPE html>\n";
  private static final String synX4225String = "";
  private static final int synX4224int = 1131911373;
  private static final String synX4223String = "/WEB-INF/bookingData.ser";
  private static final int synX4222int = -501215858;
  private static final String synX4221String = "benstheatre?message=success";
  private static final boolean synX4220boolean = false;
  private static final String synX4219String = "benstheatre?message=limitexceeded";
  private static final int synX4218int = 2;
  private static final int synX4217int = 0;
  private static final String synX4216String = "phone";
  private static final String synX4215String = "email";
  private static final String synX4214String = "address";
  private static final String synX4213String = "userid";
  private static final String synX4212String = "seatnumber";
  private static final String synX4211String = "seat";
  private static final String synX4210String = "row";
  private static final String synX4209String = "ClwLxZsvXy9Wyvj";
  private static final String synX4208String = "Gkxx7bBXrrKYanIqr";
  private static final String synX4207String = "9";
  private static final String synX4206String = "8";
  private static final String synX4205String = "7";
  private static final String synX4204String = "6";
  private static final String synX4203String = "5";
  private static final String synX4202String = "4";
  private static final String synX4201String = "3";
  private static final String synX4200String = "2";
  private static final String synX4199String = "1";
  private static final String synX4198String = "0";
  private static final String synX4197String = "Z";
  private static final String synX4196String = "Y";
  private static final String synX4195String = "X";
  private static final String synX4194String = "W";
  private static final String synX4193String = "V";
  private static final String synX4192String = "U";
  private static final String synX4191String = "T";
  private static final String synX4190String = "S";
  private static final String synX4189String = "R";
  private static final String synX4188String = "Q";
  private static final String synX4187String = "P";
  private static final String synX4186String = "O";
  private static final String synX4185String = "N";
  private static final String synX4184String = "M";
  private static final String synX4183String = "L";
  private static final String synX4182String = "K";
  private static final String synX4181String = "J";
  private static final String synX4180String = "I";
  private static final String synX4179String = "H";
  private static final String synX4178String = "G";
  private static final String synX4177String = "F";
  private static final String synX4176String = "E";
  private static final String synX4175String = "D";
  private static final String synX4174String = "C";
  private static final String synX4173String = "B";
  private static final String synX4172String = "A";
  private static final String synX4171String = "bensTheatre";
  private static final String synX4170String = "/WEB-INF/bookingData.ser";
  private static final double synX4169double = 0.6295370501343591;
  private static final String synX4168String = "seatnumber";
  private static final String synX4167String = "seat";
  private static final String synX4166String = "row";
  private static final String synX4165String = "kxFsqx1bKCLN";
  private Can[] inductMultiple;
  private int behind;

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse responsive)
      throws ServletException, IOException {
    String tedAccessories;
    java.io.PrintWriter taboo;
    java.lang.String logScreen;
    tedAccessories = (synX4165String);
    taboo = (responsive.getWriter());
    dustup = (appeal.getParameter(synX4166String));
    behind = (parseInt(appeal.getParameter(synX4167String)));
    inductBit = (parseInt(appeal.getParameter(synX4168String)));
    inductMultiple = (recordExecutable());
    logScreen = (conveyDetentionAnnexes());
    taboo.println(logScreen);
  }

  static final double minimal = 0.13625414092072086;

  public synchronized Can[] recordExecutable() {
    double confine;
    confine = (synX4169double);

    try {
      java.io.FileInputStream adherentsPaperwork;
      java.io.ObjectInputStream cbs;
      Can[] pillion;
      adherentsPaperwork =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX4170String)));
      cbs = (new java.io.ObjectInputStream(adherentsPaperwork));
      pillion = ((Can[]) cbs.readObject());
      cbs.close();
      adherentsPaperwork.close();
      return pillion;
    } catch (java.io.IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      recorder.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  static {
    recorder = (getLogger(synX4171String));
  }

  private java.lang.String mailing;
  private java.lang.String dustup;

  public synchronized java.lang.String protectionCipher() {
    String berParticular;
    java.lang.String correspondance[] = {
      synX4172String,
      synX4173String,
      synX4174String,
      synX4175String,
      synX4176String,
      synX4177String,
      synX4178String,
      synX4179String,
      synX4180String,
      synX4181String,
      synX4182String,
      synX4183String,
      synX4184String,
      synX4185String,
      synX4186String,
      synX4187String,
      synX4188String,
      synX4189String,
      synX4190String,
      synX4191String,
      synX4192String,
      synX4193String,
      synX4194String,
      synX4195String,
      synX4196String,
      synX4197String
    };
    java.lang.String count[] = {
      synX4198String,
      synX4199String,
      synX4200String,
      synX4201String,
      synX4202String,
      synX4203String,
      synX4204String,
      synX4205String,
      synX4206String,
      synX4207String
    };
    java.util.Random randomization;
    java.lang.String durations, acetylcholine, intercept, fgf, rl, g;
    berParticular = (synX4208String);
    randomization = (new java.util.Random());
    durations = (correspondance[randomization.nextInt(correspondance.length)]);
    acetylcholine = (count[randomization.nextInt(count.length)]);
    intercept = (correspondance[randomization.nextInt(correspondance.length)]);
    fgf = (count[randomization.nextInt(count.length)]);
    rl = (correspondance[randomization.nextInt(correspondance.length)]);
    g = (count[randomization.nextInt(count.length)]);
    return (durations + acetylcholine + intercept + fgf + rl + g);
  }

  public synchronized void doPost(HttpServletRequest suggestion, HttpServletResponse preparedness)
      throws ServletException, IOException {
    String constrained;
    int withheld;
    constrained = (synX4209String);
    dustup = (suggestion.getParameter(synX4210String));
    behind = (parseInt(suggestion.getParameter(synX4211String)));
    inductBit = (parseInt(suggestion.getParameter(synX4212String)));
    visitorOwnership = (suggestion.getParameter(synX4213String));
    destination = (suggestion.getParameter(synX4214String));
    mailing = (suggestion.getParameter(synX4215String));
    switchboard = (suggestion.getParameter(synX4216String));
    inductMultiple = (recordExecutable());
    withheld = (synX4217int);
    for (Can fh : inductMultiple) synx115(fh, withheld);

    if (withheld > synX4218int) {
      preparedness.sendRedirect(synX4219String);
    } else {
      inductMultiple[inductBit].placePersonName(visitorOwnership);
      inductMultiple[inductBit].settledDestination(destination);
      inductMultiple[inductBit].settledCorrespondence(mailing);
      inductMultiple[inductBit].doLaptop(switchboard);
      inductMultiple[inductBit].determinedDays(SimoneBroadway.developPreviousHour());
      inductMultiple[inductBit].arrangedProcurable(synX4220boolean);
      safeguardArchiving(inductMultiple);
      preparedness.sendRedirect(synX4221String);
    }
  }

  private java.lang.String switchboard;

  public synchronized void safeguardArchiving(Can[] elections) {
    int forename;
    forename = (synX4222int);

    try {
      java.io.FileOutputStream stunnedFolder;
      java.io.ObjectOutputStream unsuccessful;
      stunnedFolder =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX4223String)));
      unsuccessful = (new java.io.ObjectOutputStream(stunnedFolder));
      unsuccessful.writeObject(elections);
      unsuccessful.close();
      stunnedFolder.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  private int inductBit;
  private java.lang.String destination;

  public synchronized java.lang.String conveyDetentionAnnexes() {
    int minuteBreadth;
    java.lang.String cypher;
    java.lang.String browser;
    minuteBreadth = (synX4224int);
    cypher = (protectionCipher());
    browser = (synX4225String);
    browser +=
        (browser
            + (synX4226String
                + synX4227String
                + synX4228String
                + synX4229String
                + synX4230String
                + synX4231String
                + synX4232String
                + synX4233String
                + synX4234String
                + synX4235String
                + synX4236String
                + synX4237String
                + synX4238String
                + synX4239String
                + synX4240String
                + synX4241String
                + synX4242String
                + synX4243String
                + synX4244String
                + synX4245String));
    browser += (browser + (synX4246String + dustup + behind + synX4247String));
    browser += (browser + (synX4248String + synX4249String + synX4250String));
    browser += (browser + (synX4251String + cypher + synX4252String + cypher + synX4253String));
    browser +=
        (browser
            + (synX4254String
                + synX4255String
                + synX4256String
                + synX4257String
                + behind
                + synX4258String
                + synX4259String
                + dustup
                + synX4260String
                + synX4261String
                + inductBit
                + synX4262String
                + synX4263String
                + synX4264String
                + synX4265String
                + synX4266String
                + synX4267String
                + synX4268String
                + synX4269String
                + synX4270String
                + synX4271String
                + synX4272String
                + synX4273String
                + synX4274String
                + synX4275String
                + synX4276String
                + synX4277String
                + synX4278String
                + synX4279String
                + synX4280String
                + synX4281String));
    return browser;
  }

  private java.lang.String visitorOwnership;
  private static java.util.logging.Logger recorder;

  private synchronized void synx115(Can fh, int withheld) throws ServletException, IOException {

    if (fh.startDeveloperPicture() != null && fh.startDeveloperPicture().equals(visitorOwnership)) {
      withheld++;
    }
  }
}
