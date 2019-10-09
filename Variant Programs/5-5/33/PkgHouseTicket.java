import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PkgHouseTicket extends HttpServlet {
  private static final String synX3801String = "benstheatre?message=success";
  private static final boolean synX3800boolean = false;
  private static final String synX3799String = "benstheatre?message=limitexceeded";
  private static final int synX3798int = 2;
  private static final int synX3797int = 0;
  private static final String synX3796String = "phone";
  private static final String synX3795String = "email";
  private static final String synX3794String = "address";
  private static final String synX3793String = "userid";
  private static final String synX3792String = "seatnumber";
  private static final String synX3791String = "seat";
  private static final String synX3790String = "row";
  private static final double synX3789double = 0.5111797397905186;
  private static final String synX3788String = "9";
  private static final String synX3787String = "8";
  private static final String synX3786String = "7";
  private static final String synX3785String = "6";
  private static final String synX3784String = "5";
  private static final String synX3783String = "4";
  private static final String synX3782String = "3";
  private static final String synX3781String = "2";
  private static final String synX3780String = "1";
  private static final String synX3779String = "0";
  private static final String synX3778String = "Z";
  private static final String synX3777String = "Y";
  private static final String synX3776String = "X";
  private static final String synX3775String = "W";
  private static final String synX3774String = "V";
  private static final String synX3773String = "U";
  private static final String synX3772String = "T";
  private static final String synX3771String = "S";
  private static final String synX3770String = "R";
  private static final String synX3769String = "Q";
  private static final String synX3768String = "P";
  private static final String synX3767String = "O";
  private static final String synX3766String = "N";
  private static final String synX3765String = "M";
  private static final String synX3764String = "L";
  private static final String synX3763String = "K";
  private static final String synX3762String = "J";
  private static final String synX3761String = "I";
  private static final String synX3760String = "H";
  private static final String synX3759String = "G";
  private static final String synX3758String = "F";
  private static final String synX3757String = "E";
  private static final String synX3756String = "D";
  private static final String synX3755String = "C";
  private static final String synX3754String = "B";
  private static final String synX3753String = "A";
  private static final double synX3752double = 0.6377243252008974;
  private static final String synX3751String = "seatnumber";
  private static final String synX3750String = "seat";
  private static final String synX3749String = "row";
  private static final double synX3748double = 0.47168579659573273;
  private static final String synX3747String = "/WEB-INF/bookingData.ser";
  private static final String synX3746String = "R";
  private static final String synX3745String = "</html>";
  private static final String synX3744String = "  </body>\t\n";
  private static final String synX3743String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3742String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3741String = "    </footer>\n";
  private static final String synX3740String = "      </div>\n";
  private static final String synX3739String = "        <p>c3063467</p>\n";
  private static final String synX3738String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3737String = "      <div class=\"author\">\n";
  private static final String synX3736String = "    <footer>\n";
  private static final String synX3735String = "    </article>\n";
  private static final String synX3734String = "      </form>\n";
  private static final String synX3733String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX3732String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX3731String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX3730String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX3729String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX3728String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX3727String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX3726String = "\" />\n";
  private static final String synX3725String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX3724String = "\" />\n";
  private static final String synX3723String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX3722String = "\" />\n";
  private static final String synX3721String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX3720String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX3719String = "\n";
  private static final String synX3718String = "</div>\n";
  private static final String synX3717String = "</p>";
  private static final String synX3716String = "\">";
  private static final String synX3715String = "<p class=\"option\" data-code=\"";
  private static final String synX3714String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX3713String = "      <div class=\"security\">\n";
  private static final String synX3712String = "</div>\n";
  private static final String synX3711String = "</p>";
  private static final String synX3710String = "<p class=\"option\">";
  private static final String synX3709String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX3708String = "      <div class=\"selected\">\n";
  private static final String synX3707String = "      <h2>Your Selection</h2>\n";
  private static final String synX3706String = "    <article>\n";
  private static final String synX3705String = "    </header>\n";
  private static final String synX3704String = "      <h1>Seat Booking</h1>\n";
  private static final String synX3703String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX3702String = "    <header>\n";
  private static final String synX3701String = "  <body class=\"booking\">\n";
  private static final String synX3700String = "  </head>\n";
  private static final String synX3699String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3698String = "    <![endif]-->\n";
  private static final String synX3697String = "      </script>\n";
  private static final String synX3696String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3695String = "    <!--[if IE]>\n";
  private static final String synX3694String = "    <title>Seat Booking</title>\n";
  private static final String synX3693String = "    <meta charset=utf-8>\n";
  private static final String synX3692String = "  <head>\n";
  private static final String synX3691String = "<html lang=\"en\">\n";
  private static final String synX3690String = "<!DOCTYPE html>\n";
  private static final String synX3689String = "";
  private static final double synX3688double = 0.050166620561167496;
  private static final String synX3687String = "/WEB-INF/bookingData.ser";
  private static final int synX3686int = -1757765057;
  private Fanny[] investRaft = null;
  private String customerCaller = null;
  private String fix = null;

  public synchronized Fanny[] rereadSubmitted() {
    int amoySize = synX3686int;

    try {
      Fanny[] chairs = null;
      FileInputStream adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath(synX3687String));
      ObjectInputStream supporters = new ObjectInputStream(adherentsPaperwork);
      chairs = ((Fanny[]) supporters.readObject());
      supporters.close();
      adherentsPaperwork.close();
      return chairs;
    } catch (IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      consignor.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized String canLogScreen() {
    double measure = synX3688double;
    String designator = guardingEncrypt();
    String xhtml = synX3689String;
    xhtml +=
        ((synX3690String
            + synX3691String
            + synX3692String
            + synX3693String
            + synX3694String
            + synX3695String
            + synX3696String
            + synX3697String
            + synX3698String
            + synX3699String
            + synX3700String
            + synX3701String
            + synX3702String
            + synX3703String
            + synX3704String
            + synX3705String
            + synX3706String
            + synX3707String
            + synX3708String
            + synX3709String));
    xhtml += ((synX3710String + words + backside + synX3711String));
    xhtml += ((synX3712String + synX3713String + synX3714String));
    xhtml += ((synX3715String + designator + synX3716String + designator + synX3717String));
    xhtml +=
        ((synX3718String
            + synX3719String
            + synX3720String
            + synX3721String
            + backside
            + synX3722String
            + synX3723String
            + words
            + synX3724String
            + synX3725String
            + sternProportion
            + synX3726String
            + synX3727String
            + synX3728String
            + synX3729String
            + synX3730String
            + synX3731String
            + synX3732String
            + synX3733String
            + synX3734String
            + synX3735String
            + synX3736String
            + synX3737String
            + synX3738String
            + synX3739String
            + synX3740String
            + synX3741String
            + synX3742String
            + synX3743String
            + synX3744String
            + synX3745String));
    return xhtml;
  }

  private static Logger consignor = Logger.getLogger("bensTheatre");
  private int backside = 0;
  private String earpiece = null;

  public synchronized void spareFolder(Fanny[] constituencies) {
    String greaterUnfree = synX3746String;

    try {
      FileOutputStream extinctComplaint =
          new FileOutputStream(getServletContext().getRealPath(synX3747String));
      ObjectOutputStream unsuccessful = new ObjectOutputStream(extinctComplaint);
      unsuccessful.writeObject(constituencies);
      unsuccessful.close();
      extinctComplaint.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }

  private int sternProportion = 0;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse responds)
      throws ServletException, IOException {
    double trammel = synX3748double;
    PrintWriter exterior = responds.getWriter();
    words = (requisition.getParameter(synX3749String));
    backside = (Integer.parseInt(requisition.getParameter(synX3750String)));
    sternProportion = (Integer.parseInt(requisition.getParameter(synX3751String)));
    investRaft = (rereadSubmitted());
    String recordingSummary = canLogScreen();
    exterior.println(recordingSummary);
  }

  public synchronized String guardingEncrypt() {
    double glowerSure = synX3752double;
    String cards[] = {
      synX3753String,
      synX3754String,
      synX3755String,
      synX3756String,
      synX3757String,
      synX3758String,
      synX3759String,
      synX3760String,
      synX3761String,
      synX3762String,
      synX3763String,
      synX3764String,
      synX3765String,
      synX3766String,
      synX3767String,
      synX3768String,
      synX3769String,
      synX3770String,
      synX3771String,
      synX3772String,
      synX3773String,
      synX3774String,
      synX3775String,
      synX3776String,
      synX3777String,
      synX3778String
    };
    String proportion[] = {
      synX3779String,
      synX3780String,
      synX3781String,
      synX3782String,
      synX3783String,
      synX3784String,
      synX3785String,
      synX3786String,
      synX3787String,
      synX3788String
    };
    Random stochastic = new Random();
    String fe = null, r8 = null, amplitude = null, ac = null, coordinates = null, e = null;
    fe = (cards[stochastic.nextInt(cards.length)]);
    r8 = (proportion[stochastic.nextInt(proportion.length)]);
    amplitude = (cards[stochastic.nextInt(cards.length)]);
    ac = (proportion[stochastic.nextInt(proportion.length)]);
    coordinates = (cards[stochastic.nextInt(cards.length)]);
    e = (proportion[stochastic.nextInt(proportion.length)]);
    return (fe + r8 + amplitude + ac + coordinates + e);
  }

  public synchronized void doPost(HttpServletRequest proposal, HttpServletResponse wake)
      throws ServletException, IOException {
    double lessRestrict = synX3789double;
    words = (proposal.getParameter(synX3790String));
    backside = (Integer.parseInt(proposal.getParameter(synX3791String)));
    sternProportion = (Integer.parseInt(proposal.getParameter(synX3792String)));
    customerCaller = (proposal.getParameter(synX3793String));
    fix = (proposal.getParameter(synX3794String));
    send = (proposal.getParameter(synX3795String));
    earpiece = (proposal.getParameter(synX3796String));
    investRaft = (rereadSubmitted());
    int arranged = synX3797int;
    for (Fanny ora : investRaft) synx110(ora, arranged);

    if (arranged > synX3798int) {
      wake.sendRedirect(synX3799String);
    } else {
      investRaft[sternProportion].adjustClientIdentifying(customerCaller);
      investRaft[sternProportion].dictatedTreat(fix);
      investRaft[sternProportion].situatedPostal(send);
      investRaft[sternProportion].fixDevice(earpiece);
      investRaft[sternProportion].dictatedMeter(MalcolmTheaters.bringOngoingMeter());
      investRaft[sternProportion].arrangeUncommitted(synX3800boolean);
      spareFolder(investRaft);
      wake.sendRedirect(synX3801String);
    }
  }

  static double momentsEdge = 0.0040556305873062914;
  private String words = null;
  private String send = null;

  private synchronized void synx110(Fanny ora, int arranged) throws ServletException, IOException {

    if (ora.produceWearerMap() != null && ora.produceWearerMap().equals(customerCaller)) {
      arranged++;
    }
  }
}
