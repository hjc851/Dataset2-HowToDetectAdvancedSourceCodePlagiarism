import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PhillipsAuditoriumSubscription extends javax.servlet.http.HttpServlet {
  private static final String synX5191String = "benstheatre?message=success";
  private static final boolean synX5190boolean = false;
  private static final String synX5189String = "benstheatre?message=limitexceeded";
  private static final int synX5188int = 2;
  private static final int synX5187int = 0;
  private static final String synX5186String = "phone";
  private static final String synX5185String = "email";
  private static final String synX5184String = "address";
  private static final String synX5183String = "userid";
  private static final String synX5182String = "seatnumber";
  private static final String synX5181String = "seat";
  private static final String synX5180String = "row";
  private static final double synX5179double = 0.72915531327586;
  private static final String synX5178String = "bensTheatre";
  private static final String synX5177String = "seatnumber";
  private static final String synX5176String = "seat";
  private static final String synX5175String = "row";
  private static final String synX5174String = "NhcqFzLnedrtm8UiZ";
  private static final String synX5173String = "/WEB-INF/bookingData.ser";
  private static final double synX5172double = 0.32471176998005724;
  private static final String synX5171String = "9";
  private static final String synX5170String = "8";
  private static final String synX5169String = "7";
  private static final String synX5168String = "6";
  private static final String synX5167String = "5";
  private static final String synX5166String = "4";
  private static final String synX5165String = "3";
  private static final String synX5164String = "2";
  private static final String synX5163String = "1";
  private static final String synX5162String = "0";
  private static final String synX5161String = "Z";
  private static final String synX5160String = "Y";
  private static final String synX5159String = "X";
  private static final String synX5158String = "W";
  private static final String synX5157String = "V";
  private static final String synX5156String = "U";
  private static final String synX5155String = "T";
  private static final String synX5154String = "S";
  private static final String synX5153String = "R";
  private static final String synX5152String = "Q";
  private static final String synX5151String = "P";
  private static final String synX5150String = "O";
  private static final String synX5149String = "N";
  private static final String synX5148String = "M";
  private static final String synX5147String = "L";
  private static final String synX5146String = "K";
  private static final String synX5145String = "J";
  private static final String synX5144String = "I";
  private static final String synX5143String = "H";
  private static final String synX5142String = "G";
  private static final String synX5141String = "F";
  private static final String synX5140String = "E";
  private static final String synX5139String = "D";
  private static final String synX5138String = "C";
  private static final String synX5137String = "B";
  private static final String synX5136String = "A";
  private static final int synX5135int = -853424787;
  private static final String synX5134String = "</html>";
  private static final String synX5133String = "  </body>\t\n";
  private static final String synX5132String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX5131String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX5130String = "    </footer>\n";
  private static final String synX5129String = "      </div>\n";
  private static final String synX5128String = "        <p>c3063467</p>\n";
  private static final String synX5127String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX5126String = "      <div class=\"author\">\n";
  private static final String synX5125String = "    <footer>\n";
  private static final String synX5124String = "    </article>\n";
  private static final String synX5123String = "      </form>\n";
  private static final String synX5122String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX5121String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX5120String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX5119String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX5118String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX5117String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX5116String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX5115String = "\" />\n";
  private static final String synX5114String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX5113String = "\" />\n";
  private static final String synX5112String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX5111String = "\" />\n";
  private static final String synX5110String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX5109String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX5108String = "\n";
  private static final String synX5107String = "</div>\n";
  private static final String synX5106String = "</p>";
  private static final String synX5105String = "\">";
  private static final String synX5104String = "<p class=\"option\" data-code=\"";
  private static final String synX5103String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX5102String = "      <div class=\"security\">\n";
  private static final String synX5101String = "</div>\n";
  private static final String synX5100String = "</p>";
  private static final String synX5099String = "<p class=\"option\">";
  private static final String synX5098String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX5097String = "      <div class=\"selected\">\n";
  private static final String synX5096String = "      <h2>Your Selection</h2>\n";
  private static final String synX5095String = "    <article>\n";
  private static final String synX5094String = "    </header>\n";
  private static final String synX5093String = "      <h1>Seat Booking</h1>\n";
  private static final String synX5092String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX5091String = "    <header>\n";
  private static final String synX5090String = "  <body class=\"booking\">\n";
  private static final String synX5089String = "  </head>\n";
  private static final String synX5088String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX5087String = "    <![endif]-->\n";
  private static final String synX5086String = "      </script>\n";
  private static final String synX5085String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX5084String = "    <!--[if IE]>\n";
  private static final String synX5083String = "    <title>Seat Booking</title>\n";
  private static final String synX5082String = "    <meta charset=utf-8>\n";
  private static final String synX5081String = "  <head>\n";
  private static final String synX5080String = "<html lang=\"en\">\n";
  private static final String synX5079String = "<!DOCTYPE html>\n";
  private static final String synX5078String = "";
  private static final double synX5077double = 0.18990600727367024;
  private static final String synX5076String = "/WEB-INF/bookingData.ser";
  private static final String synX5075String = "VuxBpOsTQ1N";

  public synchronized Rear[] scanFolders() {
    String testimonial = synX5075String;

    try {
      Rear[] members = null;
      java.io.FileInputStream withoutRegister =
          new java.io.FileInputStream(getServletContext().getRealPath(synX5076String));
      java.io.ObjectInputStream nih = new java.io.ObjectInputStream(withoutRegister);
      members = ((Rear[]) nih.readObject());
      nih.close();
      withoutRegister.close();
      return members;
    } catch (java.io.IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      lumberman.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public java.lang.String usePhoto = null;

  public synchronized java.lang.String makeOverbookingText() {
    double premiumDepth = synX5077double;
    java.lang.String cipher = safetyInscribe();
    java.lang.String browser = synX5078String;
    browser +=
        ((synX5079String
            + synX5080String
            + synX5081String
            + synX5082String
            + synX5083String
            + synX5084String
            + synX5085String
            + synX5086String
            + synX5087String
            + synX5088String
            + synX5089String
            + synX5090String
            + synX5091String
            + synX5092String
            + synX5093String
            + synX5094String
            + synX5095String
            + synX5096String
            + synX5097String
            + synX5098String));
    browser += ((synX5099String + quarrel + posterior + synX5100String));
    browser += ((synX5101String + synX5102String + synX5103String));
    browser += ((synX5104String + cipher + synX5105String + cipher + synX5106String));
    browser +=
        ((synX5107String
            + synX5108String
            + synX5109String
            + synX5110String
            + posterior
            + synX5111String
            + synX5112String
            + quarrel
            + synX5113String
            + synX5114String
            + backsideNumeral
            + synX5115String
            + synX5116String
            + synX5117String
            + synX5118String
            + synX5119String
            + synX5120String
            + synX5121String
            + synX5122String
            + synX5123String
            + synX5124String
            + synX5125String
            + synX5126String
            + synX5127String
            + synX5128String
            + synX5129String
            + synX5130String
            + synX5131String
            + synX5132String
            + synX5133String
            + synX5134String));
    return browser;
  }

  public java.lang.String deal = null;

  public synchronized java.lang.String safetyInscribe() {
    int maximize = synX5135int;
    java.lang.String submissions[] = {
      synX5136String,
      synX5137String,
      synX5138String,
      synX5139String,
      synX5140String,
      synX5141String,
      synX5142String,
      synX5143String,
      synX5144String,
      synX5145String,
      synX5146String,
      synX5147String,
      synX5148String,
      synX5149String,
      synX5150String,
      synX5151String,
      synX5152String,
      synX5153String,
      synX5154String,
      synX5155String,
      synX5156String,
      synX5157String,
      synX5158String,
      synX5159String,
      synX5160String,
      synX5161String
    };
    java.lang.String statistics[] = {
      synX5162String,
      synX5163String,
      synX5164String,
      synX5165String,
      synX5166String,
      synX5167String,
      synX5168String,
      synX5169String,
      synX5170String,
      synX5171String
    };
    java.util.Random stray = new java.util.Random();
    java.lang.String ff = null, a = null, a2 = null, correspond = null, dn = null, ri = null;
    ff = (submissions[stray.nextInt(submissions.length)]);
    a = (statistics[stray.nextInt(statistics.length)]);
    a2 = (submissions[stray.nextInt(submissions.length)]);
    correspond = (statistics[stray.nextInt(statistics.length)]);
    dn = (submissions[stray.nextInt(submissions.length)]);
    ri = (statistics[stray.nextInt(statistics.length)]);
    return (ff + a + a2 + correspond + dn + ri);
  }

  public int backsideNumeral = 0;

  public synchronized void keepSubmit(Rear[] chairs) {
    double nungWeighting = synX5172double;

    try {
      java.io.FileOutputStream outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX5173String));
      java.io.ObjectOutputStream extinguished = new java.io.ObjectOutputStream(outgoingArchives);
      extinguished.writeObject(chairs);
      extinguished.close();
      outgoingArchives.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse responded)
      throws ServletException, IOException {
    String glowerSure = synX5174String;
    java.io.PrintWriter unsuccessful = responded.getWriter();
    quarrel = (petition.getParameter(synX5175String));
    posterior = (java.lang.Integer.parseInt(petition.getParameter(synX5176String)));
    backsideNumeral = (java.lang.Integer.parseInt(petition.getParameter(synX5177String)));
    investRaft = (scanFolders());
    java.lang.String subscriptionTable = makeOverbookingText();
    unsuccessful.println(subscriptionTable);
  }

  static {
    lumberman = (java.util.logging.Logger.getLogger(synX5178String));
  }

  static final String identify = "VGH";
  public java.lang.String quarrel = null;
  public Rear[] investRaft = null;
  public java.lang.String earpiece = null;
  public static java.util.logging.Logger lumberman = null;
  public int posterior = 0;
  public java.lang.String correspondence = null;

  public synchronized void doPost(HttpServletRequest plea, HttpServletResponse reaction)
      throws ServletException, IOException {
    double fettered = synX5179double;
    quarrel = (plea.getParameter(synX5180String));
    posterior = (java.lang.Integer.parseInt(plea.getParameter(synX5181String)));
    backsideNumeral = (java.lang.Integer.parseInt(plea.getParameter(synX5182String)));
    usePhoto = (plea.getParameter(synX5183String));
    deal = (plea.getParameter(synX5184String));
    correspondence = (plea.getParameter(synX5185String));
    earpiece = (plea.getParameter(synX5186String));
    investRaft = (scanFolders());
    int logged = synX5187int;
    for (Rear fh : investRaft) synx150(fh, logged);

    if (logged > synX5188int) {
      reaction.sendRedirect(synX5189String);
    } else {
      investRaft[backsideNumeral].readyUsernameDimidiate(usePhoto);
      investRaft[backsideNumeral].situatedMitigate(deal);
      investRaft[backsideNumeral].placeFacsimile(correspondence);
      investRaft[backsideNumeral].settledLandline(earpiece);
      investRaft[backsideNumeral].determineBeginning(JonnyDance.fixNewChance());
      investRaft[backsideNumeral].dictatedPurchasable(synX5190boolean);
      keepSubmit(investRaft);
      reaction.sendRedirect(synX5191String);
    }
  }

  private synchronized void synx150(Rear fh, int logged) throws ServletException, IOException {

    if (fh.findLoginIdentifier() != null && fh.findLoginIdentifier().equals(usePhoto)) {
      logged++;
    }
  }
}
