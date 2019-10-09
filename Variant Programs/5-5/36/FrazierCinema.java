import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class FrazierCinema extends HttpServlet {
  private static final String synX4638String = "/WEB-INF/bookingData.ser";
  private static final double synX4637double = 0.33083928198678925;
  private static final String synX4636String = "dd-MM-YY ss-MM-HH";
  private static final double synX4635double = 0.2030484762480801;
  private static final String synX4634String = "/WEB-INF/bookingData.ser";
  private static final double synX4633double = 0.0907782672189823;
  private static final String synX4632String = "</html>";
  private static final String synX4631String = "  </body>\t\n";
  private static final String synX4630String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4629String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4628String = "    </div>\n";
  private static final String synX4627String = "      </div>\n";
  private static final String synX4626String = "        </div>\n";
  private static final String synX4625String = "          <button>OK</button>\n";
  private static final String synX4624String = "        <div class=\"close\">\n";
  private static final String synX4623String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX4622String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX4621String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX4620String = "      <div class=\"inner\">\n";
  private static final String synX4619String = "    <div id=\"popup\">\n";
  private static final String synX4618String = "    </footer>\n";
  private static final String synX4617String = "      </div>\n";
  private static final String synX4616String = "        <p>c3063467</p>\n";
  private static final String synX4615String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4614String = "      <div class=\"author\">\n";
  private static final String synX4613String = "    <footer>\n";
  private static final String synX4612String = "    </article>\n";
  private static final String synX4611String = "      </div>\n";
  private static final String synX4610String = "        </div>\n";
  private static final String synX4609String = "          <p>Booked</p>\n";
  private static final String synX4608String = "        <div class=\"booked\">\n";
  private static final String synX4607String = "        </div>\n";
  private static final String synX4606String = "          <p>Available</p>\n";
  private static final String synX4605String = "        <div class=\"available\">\n";
  private static final String synX4604String = "      <div class=\"legend\">\n";
  private static final String synX4603String = "      </table>\n";
  private static final String synX4602String = "</tbody>\n";
  private static final String synX4601String = "</tr>\n";
  private static final String synX4600String = "</td>";
  private static final String synX4599String = "</p>\n";
  private static final int synX4598int = 1;
  private static final String synX4597String = "  <p>";
  private static final String synX4596String = "\">\n";
  private static final String synX4595String = "\" data-seatNumber=\"";
  private static final int synX4594int = 1;
  private static final String synX4593String = "\" data-seat=\"";
  private static final String synX4592String = "\" data-row=\"";
  private static final String synX4591String = "\" data-time=\"";
  private static final String synX4590String = "\" data-user=\"";
  private static final String synX4589String = "<td class=\"seat";
  private static final String synX4588String = " booked";
  private static final String synX4587String = "";
  private static final int synX4586int = 8;
  private static final int synX4585int = 0;
  private static final String synX4584String = "<tr>\n";
  private static final int synX4583int = 8;
  private static final int synX4582int = 0;
  private static final int synX4581int = 0;
  private static final String synX4580String = "H";
  private static final String synX4579String = "G";
  private static final String synX4578String = "F";
  private static final String synX4577String = "E";
  private static final String synX4576String = "D";
  private static final String synX4575String = "C";
  private static final String synX4574String = "B";
  private static final String synX4573String = "A";
  private static final String synX4572String = "        <tbody>";
  private static final String synX4571String = "        </thead>\n";
  private static final String synX4570String = "          </tr>\n";
  private static final String synX4569String = "            </td>\n";
  private static final String synX4568String = "              <p>Stage</p>\n";
  private static final String synX4567String = "            <td colspan=\"8\">\n";
  private static final String synX4566String = "          <tr>\n";
  private static final String synX4565String = "        <thead>\n";
  private static final String synX4564String = "      <table>\n";
  private static final String synX4563String = "      </div>\n";
  private static final String synX4562String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX4561String = "      <div class=\"instructions\">\n";
  private static final String synX4560String = "      </div>\n";
  private static final String synX4559String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX4558String = "        <p>";
  private static final String synX4557String = "      <div class=\"time\">\n";
  private static final String synX4556String = "      <h2>Seats</h2>\n";
  private static final String synX4555String = "</p>\n";
  private static final String synX4554String = "      <p class=\"message\">";
  private static final String synX4553String = "    <article>\n";
  private static final String synX4552String = "    </header>\n";
  private static final String synX4551String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX4550String = "    <header>\n";
  private static final String synX4549String = "  <body class=\"home\">\n";
  private static final String synX4548String = "  </head>\n";
  private static final String synX4547String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4546String = "    <![endif]-->\n";
  private static final String synX4545String = "      </script>\n";
  private static final String synX4544String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4543String = "    <!--[if IE]>\n";
  private static final String synX4542String = "    <title>Theatre Booking System</title>\n";
  private static final String synX4541String = "    <meta charset=utf-8>\n";
  private static final String synX4540String = "  <head>\n";
  private static final String synX4539String = "<html lang=\"en\">\n";
  private static final String synX4538String = "<!DOCTYPE html>\n";
  private static final int synX4537int = -1350512899;
  private static final String synX4536String = "bensTheatre";
  private static final String synX4535String = "/WEB-INF/bookingData.ser";
  private static final int synX4534int = 64;
  private static final String synX4533String = "message";
  private static final String synX4532String = "VloqshG";

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse riposte)
      throws ServletException, IOException {
    String minuteBreadth = synX4532String;
    PrintWriter extinguished = riposte.getWriter();
    warning = application.getParameter(synX4533String);

    if (warning != null) synx121();
    else synx122();
    tailMultiplicity = new Buttocks[synX4534int];
    File gigInitiate = new File(getServletContext().getRealPath(synX4535String));

    if (gigInitiate.exists()) synx123();
    else synx124();
    String dwellingHomepage = driveCottageFolio();
    extinguished.println(dwellingHomepage);
  }

  static {
    forestry = Logger.getLogger(synX4536String);
  }

  public synchronized String driveCottageFolio() {
    int market = synX4537int;
    String firefox =
        synX4538String
            + synX4539String
            + synX4540String
            + synX4541String
            + synX4542String
            + synX4543String
            + synX4544String
            + synX4545String
            + synX4546String
            + synX4547String
            + synX4548String
            + synX4549String
            + synX4550String
            + synX4551String
            + synX4552String
            + synX4553String
            + synX4554String
            + warning
            + synX4555String
            + synX4556String
            + synX4557String
            + synX4558String
            + driveContinuingAgain()
            + synX4559String
            + synX4560String
            + synX4561String
            + synX4562String
            + synX4563String
            + synX4564String
            + synX4565String
            + synX4566String
            + synX4567String
            + synX4568String
            + synX4569String
            + synX4570String
            + synX4571String
            + synX4572String;
    String[] squabblingPanoply = {
      synX4573String,
      synX4574String,
      synX4575String,
      synX4576String,
      synX4577String,
      synX4578String,
      synX4579String,
      synX4580String
    };
    int buttHandful = synX4581int;

    for (int i = synX4582int; i < synX4583int; i++) {
      firefox += synX4584String;

      for (int gruss = synX4585int; gruss < synX4586int; gruss++) {
        String charged = synX4587String;

        if (!tailMultiplicity[buttHandful].isAccessible()) {
          charged = synX4588String;
        }

        firefox +=
            synX4589String
                + charged
                + synX4590String
                + tailMultiplicity[buttHandful].findLoginIdentifier()
                + synX4591String
                + tailMultiplicity[buttHandful].fixChance()
                + synX4592String
                + squabblingPanoply[i]
                + synX4593String
                + (gruss + synX4594int)
                + synX4595String
                + buttHandful
                + synX4596String
                + synX4597String
                + squabblingPanoply[i]
                + (gruss + synX4598int)
                + synX4599String
                + synX4600String;
        buttHandful++;
      }
      firefox += synX4601String;
    }
    firefox +=
        synX4602String
            + synX4603String
            + synX4604String
            + synX4605String
            + synX4606String
            + synX4607String
            + synX4608String
            + synX4609String
            + synX4610String
            + synX4611String
            + synX4612String
            + synX4613String
            + synX4614String
            + synX4615String
            + synX4616String
            + synX4617String
            + synX4618String
            + synX4619String
            + synX4620String
            + synX4621String
            + synX4622String
            + synX4623String
            + synX4624String
            + synX4625String
            + synX4626String
            + synX4627String
            + synX4628String
            + synX4629String
            + synX4630String
            + synX4631String
            + synX4632String;
    return firefox;
  }

  public synchronized void conserveRegister(Buttocks[] stools) {
    double restricted = synX4633double;

    try {
      FileOutputStream prohibitedPapers =
          new FileOutputStream(getServletContext().getRealPath(synX4634String));
      ObjectOutputStream dead = new ObjectOutputStream(prohibitedPapers);
      dead.writeObject(stools);
      dead.close();
      prohibitedPapers.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }

  public static synchronized String driveContinuingAgain() {
    double rely = synX4635double;
    SimpleDateFormat risingTimeManner = new SimpleDateFormat(synX4636String);
    Date timetable = new Date();
    String goddamnSchedulePeriods = risingTimeManner.format(timetable);
    return goddamnSchedulePeriods;
  }

  public static double charge = 0.8614732420811491;
  public static Logger forestry = null;
  public Buttocks[] tailMultiplicity = null;

  public synchronized Buttocks[] writtenFilename() {
    double restrict = synX4637double;

    try {
      Buttocks[] vacancies = null;
      FileInputStream supportersDocumentation =
          new FileInputStream(getServletContext().getRealPath(synX4638String));
      ObjectInputStream entries = new ObjectInputStream(supportersDocumentation);
      vacancies = (Buttocks[]) entries.readObject();
      entries.close();
      supportersDocumentation.close();
      return vacancies;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      forestry.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public String warning = null;

  private synchronized void synx121() throws ServletException, IOException {

    if (warning.equals("success")) {
      warning = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (warning.equals("limitexceeded")) {
      warning =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx122() throws ServletException, IOException {
    warning = "";
  }

  private synchronized void synx123() throws ServletException, IOException {
    tailMultiplicity = writtenFilename();
  }

  private synchronized void synx124() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Buttocks radicalPosterior = new Buttocks();
      tailMultiplicity[i] = radicalPosterior;
    }
    conserveRegister(tailMultiplicity);
  }
}
