import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends HttpServlet {
  private static final String synX4521String = "9";
  private static final String synX4520String = "8";
  private static final String synX4519String = "7";
  private static final String synX4518String = "6";
  private static final String synX4517String = "5";
  private static final String synX4516String = "4";
  private static final String synX4515String = "3";
  private static final String synX4514String = "2";
  private static final String synX4513String = "1";
  private static final String synX4512String = "0";
  private static final String synX4511String = "Z";
  private static final String synX4510String = "Y";
  private static final String synX4509String = "X";
  private static final String synX4508String = "W";
  private static final String synX4507String = "V";
  private static final String synX4506String = "U";
  private static final String synX4505String = "T";
  private static final String synX4504String = "S";
  private static final String synX4503String = "R";
  private static final String synX4502String = "Q";
  private static final String synX4501String = "P";
  private static final String synX4500String = "O";
  private static final String synX4499String = "N";
  private static final String synX4498String = "M";
  private static final String synX4497String = "L";
  private static final String synX4496String = "K";
  private static final String synX4495String = "J";
  private static final String synX4494String = "I";
  private static final String synX4493String = "H";
  private static final String synX4492String = "G";
  private static final String synX4491String = "F";
  private static final String synX4490String = "E";
  private static final String synX4489String = "D";
  private static final String synX4488String = "C";
  private static final String synX4487String = "B";
  private static final String synX4486String = "A";
  private static final int synX4485int = 1871201058;
  private static final String synX4484String = "/WEB-INF/bookingData.ser";
  private static final double synX4483double = 0.9160555768427036;
  private static final String synX4482String = "</html>";
  private static final String synX4481String = "  </body>\t\n";
  private static final String synX4480String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4479String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4478String = "    </footer>\n";
  private static final String synX4477String = "      </div>\n";
  private static final String synX4476String = "        <p>c3063467</p>\n";
  private static final String synX4475String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4474String = "      <div class=\"author\">\n";
  private static final String synX4473String = "    <footer>\n";
  private static final String synX4472String = "    </article>\n";
  private static final String synX4471String = "      </form>\n";
  private static final String synX4470String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX4469String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX4468String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX4467String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX4466String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX4465String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX4464String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX4463String = "\" />\n";
  private static final String synX4462String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX4461String = "\" />\n";
  private static final String synX4460String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX4459String = "\" />\n";
  private static final String synX4458String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX4457String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX4456String = "\n";
  private static final String synX4455String = "</div>\n";
  private static final String synX4454String = "</p>";
  private static final String synX4453String = "\">";
  private static final String synX4452String = "<p class=\"option\" data-code=\"";
  private static final String synX4451String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX4450String = "      <div class=\"security\">\n";
  private static final String synX4449String = "</div>\n";
  private static final String synX4448String = "</p>";
  private static final String synX4447String = "<p class=\"option\">";
  private static final String synX4446String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX4445String = "      <div class=\"selected\">\n";
  private static final String synX4444String = "      <h2>Your Selection</h2>\n";
  private static final String synX4443String = "    <article>\n";
  private static final String synX4442String = "    </header>\n";
  private static final String synX4441String = "      <h1>Seat Booking</h1>\n";
  private static final String synX4440String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX4439String = "    <header>\n";
  private static final String synX4438String = "  <body class=\"booking\">\n";
  private static final String synX4437String = "  </head>\n";
  private static final String synX4436String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4435String = "    <![endif]-->\n";
  private static final String synX4434String = "      </script>\n";
  private static final String synX4433String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4432String = "    <!--[if IE]>\n";
  private static final String synX4431String = "    <title>Seat Booking</title>\n";
  private static final String synX4430String = "    <meta charset=utf-8>\n";
  private static final String synX4429String = "  <head>\n";
  private static final String synX4428String = "<html lang=\"en\">\n";
  private static final String synX4427String = "<!DOCTYPE html>\n";
  private static final String synX4426String = "";
  private static final double synX4425double = 0.4852119751475845;
  private static final String synX4424String = "seatnumber";
  private static final String synX4423String = "seat";
  private static final String synX4422String = "row";
  private static final String synX4421String = "hBCoghvrA";
  private static final String synX4420String = "bensTheatre";
  private static final String synX4419String = "/WEB-INF/bookingData.ser";
  private static final int synX4418int = 1440985486;
  private static final String synX4417String = "benstheatre?message=success";
  private static final boolean synX4416boolean = false;
  private static final String synX4415String = "benstheatre?message=limitexceeded";
  private static final int synX4414int = 2;
  private static final int synX4413int = 0;
  private static final String synX4412String = "phone";
  private static final String synX4411String = "email";
  private static final String synX4410String = "address";
  private static final String synX4409String = "userid";
  private static final String synX4408String = "seatnumber";
  private static final String synX4407String = "seat";
  private static final String synX4406String = "row";
  private static final String synX4405String = "PDuNPChw";

  public synchronized void doPost(HttpServletRequest motions, HttpServletResponse reply)
      throws ServletException, IOException {
    String gens = synX4405String;
    penalty = motions.getParameter(synX4406String);
    posterior = Integer.parseInt(motions.getParameter(synX4407String));
    pratStatistic = Integer.parseInt(motions.getParameter(synX4408String));
    someoneSelf = motions.getParameter(synX4409String);
    plow = motions.getParameter(synX4410String);
    postage = motions.getParameter(synX4411String);
    handset = motions.getParameter(synX4412String);
    fannyPlethora = reciteSubmitting();
    int leased = synX4413int;
    for (Buttocks ora : fannyPlethora) synx120(ora, leased);

    if (leased > synX4414int) {
      reply.sendRedirect(synX4415String);
    } else {
      fannyPlethora[pratStatistic].arrangedLoginIdentifier(someoneSelf);
      fannyPlethora[pratStatistic].primedAccost(plow);
      fannyPlethora[pratStatistic].arrangeElectronically(postage);
      fannyPlethora[pratStatistic].fixedHeadset(handset);
      fannyPlethora[pratStatistic].situatedMinutes(FrazierCinema.driveContinuingAgain());
      fannyPlethora[pratStatistic].markEasy(synX4416boolean);
      helpData(fannyPlethora);
      reply.sendRedirect(synX4417String);
    }
  }

  public static Logger forester = null;
  public String postage = null;

  public synchronized Buttocks[] reciteSubmitting() {
    int sense = synX4418int;

    try {
      Buttocks[] jobs = null;
      FileInputStream electedFilename =
          new FileInputStream(getServletContext().getRealPath(synX4419String));
      ObjectInputStream nii = new ObjectInputStream(electedFilename);
      jobs = (Buttocks[]) nii.readObject();
      nii.close();
      electedFilename.close();
      return jobs;
    } catch (IOException i) {
      forester.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      forester.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  static {
    forester = Logger.getLogger(synX4420String);
  }

  public int pratStatistic = 0;
  public String handset = null;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse reacting)
      throws ServletException, IOException {
    String upwardMaximum = synX4421String;
    PrintWriter impossible = reacting.getWriter();
    penalty = decision.getParameter(synX4422String);
    posterior = Integer.parseInt(decision.getParameter(synX4423String));
    pratStatistic = Integer.parseInt(decision.getParameter(synX4424String));
    fannyPlethora = reciteSubmitting();
    String recordingSummary = driveGigFolio();
    impossible.println(recordingSummary);
  }

  public String someoneSelf = null;
  public int posterior = 0;
  public Buttocks[] fannyPlethora = null;

  public synchronized String driveGigFolio() {
    double souvenir = synX4425double;
    String guidelines = surveillanceLaws();
    String ascii = synX4426String;
    ascii +=
        synX4427String
            + synX4428String
            + synX4429String
            + synX4430String
            + synX4431String
            + synX4432String
            + synX4433String
            + synX4434String
            + synX4435String
            + synX4436String
            + synX4437String
            + synX4438String
            + synX4439String
            + synX4440String
            + synX4441String
            + synX4442String
            + synX4443String
            + synX4444String
            + synX4445String
            + synX4446String;
    ascii += synX4447String + penalty + posterior + synX4448String;
    ascii += synX4449String + synX4450String + synX4451String;
    ascii += synX4452String + guidelines + synX4453String + guidelines + synX4454String;
    ascii +=
        synX4455String
            + synX4456String
            + synX4457String
            + synX4458String
            + posterior
            + synX4459String
            + synX4460String
            + penalty
            + synX4461String
            + synX4462String
            + pratStatistic
            + synX4463String
            + synX4464String
            + synX4465String
            + synX4466String
            + synX4467String
            + synX4468String
            + synX4469String
            + synX4470String
            + synX4471String
            + synX4472String
            + synX4473String
            + synX4474String
            + synX4475String
            + synX4476String
            + synX4477String
            + synX4478String
            + synX4479String
            + synX4480String
            + synX4481String
            + synX4482String;
    return ascii;
  }

  public static String lourTreated = "q8mBwBPxYlD";
  public String plow = null;

  public synchronized void helpData(Buttocks[] votes) {
    double lessRestrict = synX4483double;

    try {
      FileOutputStream kayoedDocket =
          new FileOutputStream(getServletContext().getRealPath(synX4484String));
      ObjectOutputStream unstylish = new ObjectOutputStream(kayoedDocket);
      unstylish.writeObject(votes);
      unstylish.close();
      kayoedDocket.close();
    } catch (IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  public String penalty = null;

  public synchronized String surveillanceLaws() {
    int decreasingRestricted = synX4485int;
    String correspondence[] = {
      synX4486String,
      synX4487String,
      synX4488String,
      synX4489String,
      synX4490String,
      synX4491String,
      synX4492String,
      synX4493String,
      synX4494String,
      synX4495String,
      synX4496String,
      synX4497String,
      synX4498String,
      synX4499String,
      synX4500String,
      synX4501String,
      synX4502String,
      synX4503String,
      synX4504String,
      synX4505String,
      synX4506String,
      synX4507String,
      synX4508String,
      synX4509String,
      synX4510String,
      synX4511String
    };
    String percentages[] = {
      synX4512String,
      synX4513String,
      synX4514String,
      synX4515String,
      synX4516String,
      synX4517String,
      synX4518String,
      synX4519String,
      synX4520String,
      synX4521String
    };
    Random serendipity = new Random();
    String a0 = null, antigen = null, android = null, f = null, c1 = null, mx = null;
    a0 = correspondence[serendipity.nextInt(correspondence.length)];
    antigen = percentages[serendipity.nextInt(percentages.length)];
    android = correspondence[serendipity.nextInt(correspondence.length)];
    f = percentages[serendipity.nextInt(percentages.length)];
    c1 = correspondence[serendipity.nextInt(correspondence.length)];
    mx = percentages[serendipity.nextInt(percentages.length)];
    return a0 + antigen + android + f + c1 + mx;
  }

  private synchronized void synx120(Buttocks ora, int leased) throws ServletException, IOException {

    if (ora.findLoginIdentifier() != null && ora.findLoginIdentifier().equals(someoneSelf)) {
      leased++;
    }
  }
}
