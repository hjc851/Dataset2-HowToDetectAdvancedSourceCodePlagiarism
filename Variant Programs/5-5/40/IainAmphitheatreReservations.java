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

public class IainAmphitheatreReservations extends HttpServlet {
  private static final String synX4748String = "/WEB-INF/bookingData.ser";
  private static final String synX4747String = "/WEB-INF/bookingData.ser";
  private static final String synX4746String = "9";
  private static final String synX4745String = "8";
  private static final String synX4744String = "7";
  private static final String synX4743String = "6";
  private static final String synX4742String = "5";
  private static final String synX4741String = "4";
  private static final String synX4740String = "3";
  private static final String synX4739String = "2";
  private static final String synX4738String = "1";
  private static final String synX4737String = "0";
  private static final String synX4736String = "Z";
  private static final String synX4735String = "Y";
  private static final String synX4734String = "X";
  private static final String synX4733String = "W";
  private static final String synX4732String = "V";
  private static final String synX4731String = "U";
  private static final String synX4730String = "T";
  private static final String synX4729String = "S";
  private static final String synX4728String = "R";
  private static final String synX4727String = "Q";
  private static final String synX4726String = "P";
  private static final String synX4725String = "O";
  private static final String synX4724String = "N";
  private static final String synX4723String = "M";
  private static final String synX4722String = "L";
  private static final String synX4721String = "K";
  private static final String synX4720String = "J";
  private static final String synX4719String = "I";
  private static final String synX4718String = "H";
  private static final String synX4717String = "G";
  private static final String synX4716String = "F";
  private static final String synX4715String = "E";
  private static final String synX4714String = "D";
  private static final String synX4713String = "C";
  private static final String synX4712String = "B";
  private static final String synX4711String = "A";
  private static final String synX4710String = "</html>";
  private static final String synX4709String = "  </body>\t\n";
  private static final String synX4708String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4707String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4706String = "    </footer>\n";
  private static final String synX4705String = "      </div>\n";
  private static final String synX4704String = "        <p>c3063467</p>\n";
  private static final String synX4703String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4702String = "      <div class=\"author\">\n";
  private static final String synX4701String = "    <footer>\n";
  private static final String synX4700String = "    </article>\n";
  private static final String synX4699String = "      </form>\n";
  private static final String synX4698String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX4697String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX4696String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX4695String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX4694String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX4693String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX4692String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX4691String = "\" />\n";
  private static final String synX4690String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX4689String = "\" />\n";
  private static final String synX4688String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX4687String = "\" />\n";
  private static final String synX4686String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX4685String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX4684String = "\n";
  private static final String synX4683String = "</div>\n";
  private static final String synX4682String = "</p>";
  private static final String synX4681String = "\">";
  private static final String synX4680String = "<p class=\"option\" data-code=\"";
  private static final String synX4679String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX4678String = "      <div class=\"security\">\n";
  private static final String synX4677String = "</div>\n";
  private static final String synX4676String = "</p>";
  private static final String synX4675String = "<p class=\"option\">";
  private static final String synX4674String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX4673String = "      <div class=\"selected\">\n";
  private static final String synX4672String = "      <h2>Your Selection</h2>\n";
  private static final String synX4671String = "    <article>\n";
  private static final String synX4670String = "    </header>\n";
  private static final String synX4669String = "      <h1>Seat Booking</h1>\n";
  private static final String synX4668String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX4667String = "    <header>\n";
  private static final String synX4666String = "  <body class=\"booking\">\n";
  private static final String synX4665String = "  </head>\n";
  private static final String synX4664String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4663String = "    <![endif]-->\n";
  private static final String synX4662String = "      </script>\n";
  private static final String synX4661String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4660String = "    <!--[if IE]>\n";
  private static final String synX4659String = "    <title>Seat Booking</title>\n";
  private static final String synX4658String = "    <meta charset=utf-8>\n";
  private static final String synX4657String = "  <head>\n";
  private static final String synX4656String = "<html lang=\"en\">\n";
  private static final String synX4655String = "<!DOCTYPE html>\n";
  private static final String synX4654String = "";
  private static final String synX4653String = "benstheatre?message=success";
  private static final boolean synX4652boolean = false;
  private static final String synX4651String = "benstheatre?message=limitexceeded";
  private static final int synX4650int = 2;
  private static final int synX4649int = 0;
  private static final String synX4648String = "phone";
  private static final String synX4647String = "email";
  private static final String synX4646String = "address";
  private static final String synX4645String = "userid";
  private static final String synX4644String = "seatnumber";
  private static final String synX4643String = "seat";
  private static final String synX4642String = "row";
  private static final String synX4641String = "seatnumber";
  private static final String synX4640String = "seat";
  private static final String synX4639String = "row";
  public Posterior[] sternArsenal = null;
  public String wrangling = null;
  public int bottomCaseload = 0;
  public int bottom = 0;
  public String employeePictures = null;
  public String calling = null;
  public String respond = null;
  public String post = null;
  public static Logger surveyor = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse reacting)
      throws ServletException, IOException {
    PrintWriter unstylish = reacting.getWriter();
    wrangling = petition.getParameter(synX4639String);
    bottom = parseInt(petition.getParameter(synX4640String));
    bottomCaseload = parseInt(petition.getParameter(synX4641String));
    sternArsenal = perusedArchives();
    String registrationTab = catchRecordingSummary();
    unstylish.println(registrationTab);
  }

  public synchronized void doPost(HttpServletRequest ordered, HttpServletResponse explanation)
      throws ServletException, IOException {
    wrangling = ordered.getParameter(synX4642String);
    bottom = parseInt(ordered.getParameter(synX4643String));
    bottomCaseload = parseInt(ordered.getParameter(synX4644String));
    employeePictures = ordered.getParameter(synX4645String);
    respond = ordered.getParameter(synX4646String);
    post = ordered.getParameter(synX4647String);
    calling = ordered.getParameter(synX4648String);
    sternArsenal = perusedArchives();
    int reported = synX4649int;
    for (Posterior waffen : sternArsenal) synx135(waffen, reported);

    if (reported > synX4650int) {
      explanation.sendRedirect(synX4651String);
    } else {
      sternArsenal[bottomCaseload].rigidAdopterTag(employeePictures);
      sternArsenal[bottomCaseload].laidSpeak(respond);
      sternArsenal[bottomCaseload].primedMailing(post);
      sternArsenal[bottomCaseload].fixDevice(calling);
      sternArsenal[bottomCaseload].fixThing(WarwickPlayhouses.takeTopicalPeriod());
      sternArsenal[bottomCaseload].settledVisible(synX4652boolean);
      avertPaperwork(sternArsenal);
      explanation.sendRedirect(synX4653String);
    }
  }

  public synchronized String catchRecordingSummary() {
    String norms = suretyCodification();
    String pdf = synX4654String;
    pdf +=
        synX4655String
            + synX4656String
            + synX4657String
            + synX4658String
            + synX4659String
            + synX4660String
            + synX4661String
            + synX4662String
            + synX4663String
            + synX4664String
            + synX4665String
            + synX4666String
            + synX4667String
            + synX4668String
            + synX4669String
            + synX4670String
            + synX4671String
            + synX4672String
            + synX4673String
            + synX4674String;
    pdf += synX4675String + wrangling + bottom + synX4676String;
    pdf += synX4677String + synX4678String + synX4679String;
    pdf += synX4680String + norms + synX4681String + norms + synX4682String;
    pdf +=
        synX4683String
            + synX4684String
            + synX4685String
            + synX4686String
            + bottom
            + synX4687String
            + synX4688String
            + wrangling
            + synX4689String
            + synX4690String
            + bottomCaseload
            + synX4691String
            + synX4692String
            + synX4693String
            + synX4694String
            + synX4695String
            + synX4696String
            + synX4697String
            + synX4698String
            + synX4699String
            + synX4700String
            + synX4701String
            + synX4702String
            + synX4703String
            + synX4704String
            + synX4705String
            + synX4706String
            + synX4707String
            + synX4708String
            + synX4709String
            + synX4710String;
    return pdf;
  }

  public synchronized String suretyCodification() {
    String mailings[] = {
      synX4711String,
      synX4712String,
      synX4713String,
      synX4714String,
      synX4715String,
      synX4716String,
      synX4717String,
      synX4718String,
      synX4719String,
      synX4720String,
      synX4721String,
      synX4722String,
      synX4723String,
      synX4724String,
      synX4725String,
      synX4726String,
      synX4727String,
      synX4728String,
      synX4729String,
      synX4730String,
      synX4731String,
      synX4732String,
      synX4733String,
      synX4734String,
      synX4735String,
      synX4736String
    };
    String proportions[] = {
      synX4737String,
      synX4738String,
      synX4739String,
      synX4740String,
      synX4741String,
      synX4742String,
      synX4743String,
      synX4744String,
      synX4745String,
      synX4746String
    };
    Random sampling = new Random();
    String diameters = null, c3 = null, android = null, bt = null, coordinates = null, d = null;
    diameters = mailings[sampling.nextInt(mailings.length)];
    c3 = proportions[sampling.nextInt(proportions.length)];
    android = mailings[sampling.nextInt(mailings.length)];
    bt = proportions[sampling.nextInt(proportions.length)];
    coordinates = mailings[sampling.nextInt(mailings.length)];
    d = proportions[sampling.nextInt(proportions.length)];
    return diameters + c3 + android + bt + coordinates + d;
  }

  public synchronized Posterior[] perusedArchives() {

    try {
      Posterior[] pillion = null;
      FileInputStream withoutRegister =
          new FileInputStream(getServletContext().getRealPath(synX4747String));
      ObjectInputStream details = new ObjectInputStream(withoutRegister);
      pillion = (Posterior[]) details.readObject();
      details.close();
      withoutRegister.close();
      return pillion;
    } catch (IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      surveyor.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Posterior[] member) {

    try {
      FileOutputStream quenchedDatabase =
          new FileOutputStream(getServletContext().getRealPath(synX4748String));
      ObjectOutputStream dead = new ObjectOutputStream(quenchedDatabase);
      dead.writeObject(member);
      dead.close();
      quenchedDatabase.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }

  private synchronized void synx135(Posterior waffen, int reported)
      throws ServletException, IOException {

    if (waffen.letSearcherIdentification() != null
        && waffen.letSearcherIdentification().equals(employeePictures)) {
      reported++;
    }
  }
}
