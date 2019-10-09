import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SthTeatroRecording extends HttpServlet {
  private static final String synX4966String = "/WEB-INF/bookingData.ser";
  private static final String synX4965String = "/WEB-INF/bookingData.ser";
  private static final String synX4964String = "9";
  private static final String synX4963String = "8";
  private static final String synX4962String = "7";
  private static final String synX4961String = "6";
  private static final String synX4960String = "5";
  private static final String synX4959String = "4";
  private static final String synX4958String = "3";
  private static final String synX4957String = "2";
  private static final String synX4956String = "1";
  private static final String synX4955String = "0";
  private static final String synX4954String = "Z";
  private static final String synX4953String = "Y";
  private static final String synX4952String = "X";
  private static final String synX4951String = "W";
  private static final String synX4950String = "V";
  private static final String synX4949String = "U";
  private static final String synX4948String = "T";
  private static final String synX4947String = "S";
  private static final String synX4946String = "R";
  private static final String synX4945String = "Q";
  private static final String synX4944String = "P";
  private static final String synX4943String = "O";
  private static final String synX4942String = "N";
  private static final String synX4941String = "M";
  private static final String synX4940String = "L";
  private static final String synX4939String = "K";
  private static final String synX4938String = "J";
  private static final String synX4937String = "I";
  private static final String synX4936String = "H";
  private static final String synX4935String = "G";
  private static final String synX4934String = "F";
  private static final String synX4933String = "E";
  private static final String synX4932String = "D";
  private static final String synX4931String = "C";
  private static final String synX4930String = "B";
  private static final String synX4929String = "A";
  private static final String synX4928String = "</html>";
  private static final String synX4927String = "  </body>\t\n";
  private static final String synX4926String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4925String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4924String = "    </footer>\n";
  private static final String synX4923String = "      </div>\n";
  private static final String synX4922String = "        <p>c3063467</p>\n";
  private static final String synX4921String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4920String = "      <div class=\"author\">\n";
  private static final String synX4919String = "    <footer>\n";
  private static final String synX4918String = "    </article>\n";
  private static final String synX4917String = "      </form>\n";
  private static final String synX4916String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX4915String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX4914String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX4913String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX4912String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX4911String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX4910String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX4909String = "\" />\n";
  private static final String synX4908String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX4907String = "\" />\n";
  private static final String synX4906String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX4905String = "\" />\n";
  private static final String synX4904String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX4903String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX4902String = "\n";
  private static final String synX4901String = "</div>\n";
  private static final String synX4900String = "</p>";
  private static final String synX4899String = "\">";
  private static final String synX4898String = "<p class=\"option\" data-code=\"";
  private static final String synX4897String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX4896String = "      <div class=\"security\">\n";
  private static final String synX4895String = "</div>\n";
  private static final String synX4894String = "</p>";
  private static final String synX4893String = "<p class=\"option\">";
  private static final String synX4892String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX4891String = "      <div class=\"selected\">\n";
  private static final String synX4890String = "      <h2>Your Selection</h2>\n";
  private static final String synX4889String = "    <article>\n";
  private static final String synX4888String = "    </header>\n";
  private static final String synX4887String = "      <h1>Seat Booking</h1>\n";
  private static final String synX4886String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX4885String = "    <header>\n";
  private static final String synX4884String = "  <body class=\"booking\">\n";
  private static final String synX4883String = "  </head>\n";
  private static final String synX4882String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4881String = "    <![endif]-->\n";
  private static final String synX4880String = "      </script>\n";
  private static final String synX4879String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4878String = "    <!--[if IE]>\n";
  private static final String synX4877String = "    <title>Seat Booking</title>\n";
  private static final String synX4876String = "    <meta charset=utf-8>\n";
  private static final String synX4875String = "  <head>\n";
  private static final String synX4874String = "<html lang=\"en\">\n";
  private static final String synX4873String = "<!DOCTYPE html>\n";
  private static final String synX4872String = "";
  private static final String synX4871String = "benstheatre?message=success";
  private static final boolean synX4870boolean = false;
  private static final String synX4869String = "benstheatre?message=limitexceeded";
  private static final int synX4868int = 2;
  private static final int synX4867int = 0;
  private static final String synX4866String = "phone";
  private static final String synX4865String = "email";
  private static final String synX4864String = "address";
  private static final String synX4863String = "userid";
  private static final String synX4862String = "seatnumber";
  private static final String synX4861String = "seat";
  private static final String synX4860String = "row";
  private static final String synX4859String = "seatnumber";
  private static final String synX4858String = "seat";
  private static final String synX4857String = "row";
  private static Logger skidder = Logger.getLogger("bensTheatre");
  private String telefax = null;
  private String answer = null;
  private String mobile = null;
  private String patientNerfling = null;
  private int bum = 0;
  private int investFrequency = 0;
  private String bickering = null;
  private Buns[] keisterMyriad = null;

  public synchronized void doGet(HttpServletRequest bespeak, HttpServletResponse responding)
      throws ServletException, IOException {
    PrintWriter proscribed;
    String overbookingText;
    proscribed = responding.getWriter();
    bickering = bespeak.getParameter(synX4857String);
    bum = Integer.parseInt(bespeak.getParameter(synX4858String));
    investFrequency = Integer.parseInt(bespeak.getParameter(synX4859String));
    keisterMyriad = peruseDocket();
    overbookingText = fixRentPaper();
    proscribed.println(overbookingText);
  }

  public synchronized void doPost(HttpServletRequest insistence, HttpServletResponse reacted)
      throws ServletException, IOException {
    int arranged;
    bickering = insistence.getParameter(synX4860String);
    bum = Integer.parseInt(insistence.getParameter(synX4861String));
    investFrequency = Integer.parseInt(insistence.getParameter(synX4862String));
    patientNerfling = insistence.getParameter(synX4863String);
    answer = insistence.getParameter(synX4864String);
    telefax = insistence.getParameter(synX4865String);
    mobile = insistence.getParameter(synX4866String);
    keisterMyriad = peruseDocket();
    arranged = synX4867int;
    for (Buns fh : keisterMyriad) synx145(fh, arranged);

    if (arranged > synX4868int) {
      reacted.sendRedirect(synX4869String);
    } else {
      keisterMyriad[investFrequency].adjustClientIdentifying(patientNerfling);
      keisterMyriad[investFrequency].settledDestination(answer);
      keisterMyriad[investFrequency].prepareAddress(telefax);
      keisterMyriad[investFrequency].fitHandset(mobile);
      keisterMyriad[investFrequency].rigidAmount(VeleOpera.generateUnderwayYear());
      keisterMyriad[investFrequency].placedForthcoming(synX4870boolean);
      deliverDocument(keisterMyriad);
      reacted.sendRedirect(synX4871String);
    }
  }

  public synchronized String fixRentPaper() {
    String cypher;
    String http;
    cypher = guardPassword();
    http = synX4872String;
    http +=
        synX4873String
            + synX4874String
            + synX4875String
            + synX4876String
            + synX4877String
            + synX4878String
            + synX4879String
            + synX4880String
            + synX4881String
            + synX4882String
            + synX4883String
            + synX4884String
            + synX4885String
            + synX4886String
            + synX4887String
            + synX4888String
            + synX4889String
            + synX4890String
            + synX4891String
            + synX4892String;
    http += synX4893String + bickering + bum + synX4894String;
    http += synX4895String + synX4896String + synX4897String;
    http += synX4898String + cypher + synX4899String + cypher + synX4900String;
    http +=
        synX4901String
            + synX4902String
            + synX4903String
            + synX4904String
            + bum
            + synX4905String
            + synX4906String
            + bickering
            + synX4907String
            + synX4908String
            + investFrequency
            + synX4909String
            + synX4910String
            + synX4911String
            + synX4912String
            + synX4913String
            + synX4914String
            + synX4915String
            + synX4916String
            + synX4917String
            + synX4918String
            + synX4919String
            + synX4920String
            + synX4921String
            + synX4922String
            + synX4923String
            + synX4924String
            + synX4925String
            + synX4926String
            + synX4927String
            + synX4928String;
    return http;
  }

  public synchronized String guardPassword() {
    String submissions[] = {
      synX4929String,
      synX4930String,
      synX4931String,
      synX4932String,
      synX4933String,
      synX4934String,
      synX4935String,
      synX4936String,
      synX4937String,
      synX4938String,
      synX4939String,
      synX4940String,
      synX4941String,
      synX4942String,
      synX4943String,
      synX4944String,
      synX4945String,
      synX4946String,
      synX4947String,
      synX4948String,
      synX4949String,
      synX4950String,
      synX4951String,
      synX4952String,
      synX4953String,
      synX4954String
    };
    String scores[] = {
      synX4955String,
      synX4956String,
      synX4957String,
      synX4958String,
      synX4959String,
      synX4960String,
      synX4961String,
      synX4962String,
      synX4963String,
      synX4964String
    };
    Random unintended;
    String impedance, acetal, d2, adc, nb, ans;
    unintended = new Random();
    impedance = null;
    acetal = null;
    d2 = null;
    adc = null;
    nb = null;
    ans = null;
    impedance = submissions[unintended.nextInt(submissions.length)];
    acetal = scores[unintended.nextInt(scores.length)];
    d2 = submissions[unintended.nextInt(submissions.length)];
    adc = scores[unintended.nextInt(scores.length)];
    nb = submissions[unintended.nextInt(submissions.length)];
    ans = scores[unintended.nextInt(scores.length)];
    return impedance + acetal + d2 + adc + nb + ans;
  }

  public synchronized Buns[] peruseDocket() {

    try {
      FileInputStream proponentsDatabase;
      ObjectInputStream establishment;
      Buns[] slots = null;
      proponentsDatabase = new FileInputStream(getServletContext().getRealPath(synX4965String));
      establishment = new ObjectInputStream(proponentsDatabase);
      slots = (Buns[]) establishment.readObject();
      establishment.close();
      proponentsDatabase.close();
      return slots;
    } catch (IOException i) {
      skidder.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      skidder.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Buns[] stools) {

    try {
      FileOutputStream tabuInitiate;
      ObjectOutputStream kayoed;
      tabuInitiate = new FileOutputStream(getServletContext().getRealPath(synX4966String));
      kayoed = new ObjectOutputStream(tabuInitiate);
      kayoed.writeObject(stools);
      kayoed.close();
      tabuInitiate.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }

  private synchronized void synx145(Buns fh, int arranged) throws ServletException, IOException {

    if (fh.comeEnjoyerMilad() != null && fh.comeEnjoyerMilad().equals(patientNerfling)) {
      arranged++;
    }
  }
}
