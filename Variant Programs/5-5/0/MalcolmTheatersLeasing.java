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

public class MalcolmTheatersLeasing extends javax.servlet.http.HttpServlet {
  private static final String synX115String = "/WEB-INF/bookingData.ser";
  private static final double synX114double = 0.31629930262423167;
  private static final String synX113String = "/WEB-INF/bookingData.ser";
  private static final double synX112double = 0.8537907753080728;
  private static final double synX111double = 0.7680212410425595;
  private static final String synX110String = "9";
  private static final String synX109String = "8";
  private static final String synX108String = "7";
  private static final String synX107String = "6";
  private static final String synX106String = "5";
  private static final String synX105String = "4";
  private static final String synX104String = "3";
  private static final String synX103String = "2";
  private static final String synX102String = "1";
  private static final String synX101String = "0";
  private static final String synX100String = "Z";
  private static final String synX99String = "Y";
  private static final String synX98String = "X";
  private static final String synX97String = "W";
  private static final String synX96String = "V";
  private static final String synX95String = "U";
  private static final String synX94String = "T";
  private static final String synX93String = "S";
  private static final String synX92String = "R";
  private static final String synX91String = "Q";
  private static final String synX90String = "P";
  private static final String synX89String = "O";
  private static final String synX88String = "N";
  private static final String synX87String = "M";
  private static final String synX86String = "L";
  private static final String synX85String = "K";
  private static final String synX84String = "J";
  private static final String synX83String = "I";
  private static final String synX82String = "H";
  private static final String synX81String = "G";
  private static final String synX80String = "F";
  private static final String synX79String = "E";
  private static final String synX78String = "D";
  private static final String synX77String = "C";
  private static final String synX76String = "B";
  private static final String synX75String = "A";
  private static final String synX74String = "</html>";
  private static final String synX73String = "  </body>\t\n";
  private static final String synX72String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX71String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX70String = "    </footer>\n";
  private static final String synX69String = "      </div>\n";
  private static final String synX68String = "        <p>c3063467</p>\n";
  private static final String synX67String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX66String = "      <div class=\"author\">\n";
  private static final String synX65String = "    <footer>\n";
  private static final String synX64String = "    </article>\n";
  private static final String synX63String = "      </form>\n";
  private static final String synX62String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX61String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX60String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX59String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX58String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX57String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX56String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX55String = "\" />\n";
  private static final String synX54String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX53String = "\" />\n";
  private static final String synX52String = "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX51String = "\" />\n";
  private static final String synX50String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX49String = "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX48String = "\n";
  private static final String synX47String = "</div>\n";
  private static final String synX46String = "</p>";
  private static final String synX45String = "\">";
  private static final String synX44String = "<p class=\"option\" data-code=\"";
  private static final String synX43String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX42String = "      <div class=\"security\">\n";
  private static final String synX41String = "</div>\n";
  private static final String synX40String = "</p>";
  private static final String synX39String = "<p class=\"option\">";
  private static final String synX38String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX37String = "      <div class=\"selected\">\n";
  private static final String synX36String = "      <h2>Your Selection</h2>\n";
  private static final String synX35String = "    <article>\n";
  private static final String synX34String = "    </header>\n";
  private static final String synX33String = "      <h1>Seat Booking</h1>\n";
  private static final String synX32String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX31String = "    <header>\n";
  private static final String synX30String = "  <body class=\"booking\">\n";
  private static final String synX29String = "  </head>\n";
  private static final String synX28String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX27String = "    <![endif]-->\n";
  private static final String synX26String = "      </script>\n";
  private static final String synX25String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX24String = "    <!--[if IE]>\n";
  private static final String synX23String = "    <title>Seat Booking</title>\n";
  private static final String synX22String = "    <meta charset=utf-8>\n";
  private static final String synX21String = "  <head>\n";
  private static final String synX20String = "<html lang=\"en\">\n";
  private static final String synX19String = "<!DOCTYPE html>\n";
  private static final String synX18String = "";
  private static final double synX17double = 0.2112353749298962;
  private static final String synX16String = "benstheatre?message=success";
  private static final boolean synX15boolean = false;
  private static final String synX14String = "benstheatre?message=limitexceeded";
  private static final int synX13int = 2;
  private static final int synX12int = 0;
  private static final String synX11String = "phone";
  private static final String synX10String = "email";
  private static final String synX9String = "address";
  private static final String synX8String = "userid";
  private static final String synX7String = "seatnumber";
  private static final String synX6String = "seat";
  private static final String synX5String = "row";
  private static final int synX4int = -982203381;
  private static final String synX3String = "seatnumber";
  private static final String synX2String = "seat";
  private static final String synX1String = "row";
  private static final String synX0String = "4LjmVh3D";
  public static java.util.logging.Logger fisherman = getLogger("bensTheatre");
  public java.lang.String fax;
  public java.lang.String answer;
  public java.lang.String cellphone;
  public java.lang.String loginIdentifier;
  public int keister;
  public int placeList;
  public java.lang.String melee;
  static double significance = 0.04494430391472559;
  public Behind[] tooshiePortfolio;

  public synchronized void doGet(HttpServletRequest petitioning, HttpServletResponse responsive)
      throws ServletException, IOException {
    String narrowerRestrain;
    java.io.PrintWriter down;
    java.lang.String logScreen;
    narrowerRestrain = (synX0String);
    down = (responsive.getWriter());
    melee = (petitioning.getParameter(synX1String));
    keister = (parseInt(petitioning.getParameter(synX2String)));
    placeList = (parseInt(petitioning.getParameter(synX3String)));
    tooshiePortfolio = (writeDatabase());
    logScreen = (arriveOrderingPagination());
    down.println(logScreen);
  }

  public synchronized void doPost(HttpServletRequest asked, HttpServletResponse reacting)
      throws ServletException, IOException {
    int deptSpan;
    int logged;
    deptSpan = (synX4int);
    melee = (asked.getParameter(synX5String));
    keister = (parseInt(asked.getParameter(synX6String)));
    placeList = (parseInt(asked.getParameter(synX7String)));
    loginIdentifier = (asked.getParameter(synX8String));
    answer = (asked.getParameter(synX9String));
    fax = (asked.getParameter(synX10String));
    cellphone = (asked.getParameter(synX11String));
    tooshiePortfolio = (writeDatabase());
    logged = (synX12int);
    for (Behind ora : tooshiePortfolio) synx0(ora, logged);

    if (logged > synX13int) {
      reacting.sendRedirect(synX14String);
    } else {
      tooshiePortfolio[placeList].placedCustomersIbid(loginIdentifier);
      tooshiePortfolio[placeList].arrangedHandle(answer);
      tooshiePortfolio[placeList].situatedPostal(fax);
      tooshiePortfolio[placeList].primedCellphone(cellphone);
      tooshiePortfolio[placeList].situatedMinutes(HansenComedy.haveCirculatingPeriods());
      tooshiePortfolio[placeList].rigidProvided(synX15boolean);
      preserveLodge(tooshiePortfolio);
      reacting.sendRedirect(synX16String);
    }
  }

  public synchronized java.lang.String arriveOrderingPagination() {
    double littleRoll;
    java.lang.String identifier;
    java.lang.String gif;
    littleRoll = (synX17double);
    identifier = (certificateCypher());
    gif = (synX18String);
    gif +=
        ((synX19String
            + synX20String
            + synX21String
            + synX22String
            + synX23String
            + synX24String
            + synX25String
            + synX26String
            + synX27String
            + synX28String
            + synX29String
            + synX30String
            + synX31String
            + synX32String
            + synX33String
            + synX34String
            + synX35String
            + synX36String
            + synX37String
            + synX38String));
    gif += ((synX39String + melee + keister + synX40String));
    gif += ((synX41String + synX42String + synX43String));
    gif += ((synX44String + identifier + synX45String + identifier + synX46String));
    gif +=
        ((synX47String
            + synX48String
            + synX49String
            + synX50String
            + keister
            + synX51String
            + synX52String
            + melee
            + synX53String
            + synX54String
            + placeList
            + synX55String
            + synX56String
            + synX57String
            + synX58String
            + synX59String
            + synX60String
            + synX61String
            + synX62String
            + synX63String
            + synX64String
            + synX65String
            + synX66String
            + synX67String
            + synX68String
            + synX69String
            + synX70String
            + synX71String
            + synX72String
            + synX73String
            + synX74String));
    return gif;
  }

  public synchronized java.lang.String certificateCypher() {
    double compelled;
    java.lang.String notices[] = {
      synX75String,
      synX76String,
      synX77String,
      synX78String,
      synX79String,
      synX80String,
      synX81String,
      synX82String,
      synX83String,
      synX84String,
      synX85String,
      synX86String,
      synX87String,
      synX88String,
      synX89String,
      synX90String,
      synX91String,
      synX92String,
      synX93String,
      synX94String,
      synX95String,
      synX96String,
      synX97String,
      synX98String,
      synX99String,
      synX100String
    };
    java.lang.String digits[] = {
      synX101String,
      synX102String,
      synX103String,
      synX104String,
      synX105String,
      synX106String,
      synX107String,
      synX108String,
      synX109String,
      synX110String
    };
    java.util.Random spontaneous;
    java.lang.String durations, ao, amplitude, ac, logarithm, fgf;
    compelled = (synX111double);
    spontaneous = (new java.util.Random());
    durations = (notices[spontaneous.nextInt(notices.length)]);
    ao = (digits[spontaneous.nextInt(digits.length)]);
    amplitude = (notices[spontaneous.nextInt(notices.length)]);
    ac = (digits[spontaneous.nextInt(digits.length)]);
    logarithm = (notices[spontaneous.nextInt(notices.length)]);
    fgf = (digits[spontaneous.nextInt(digits.length)]);
    return (durations + ao + amplitude + ac + logarithm + fgf);
  }

  public synchronized Behind[] writeDatabase() {
    double make;
    make = (synX112double);

    try {
      java.io.FileInputStream nsisApplication;
      java.io.ObjectInputStream nsi;
      Behind[] vacancies;
      nsisApplication =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX113String)));
      nsi = (new java.io.ObjectInputStream(nsisApplication));
      vacancies = ((Behind[]) nsi.readObject());
      nsi.close();
      nsisApplication.close();
      return vacancies;
    } catch (java.io.IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      fisherman.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void preserveLodge(Behind[] slots) {
    double magnitude;
    magnitude = (synX114double);

    try {
      java.io.FileOutputStream tabuInitiate;
      java.io.ObjectOutputStream proscribed;
      tabuInitiate = (new java.io.FileOutputStream(getServletContext().getRealPath(synX115String)));
      proscribed = (new java.io.ObjectOutputStream(tabuInitiate));
      proscribed.writeObject(slots);
      proscribed.close();
      tabuInitiate.close();
    } catch (java.io.IOException abbe) {
      abbe.printStackTrace();
    }
  }

  private synchronized void synx0(Behind ora, int logged) throws ServletException, IOException {

    if (ora.produceWearerMap() != null && ora.produceWearerMap().equals(loginIdentifier)) {
      logged++;
    }
  }
}
