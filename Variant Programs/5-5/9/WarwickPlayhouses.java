import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class WarwickPlayhouses extends HttpServlet {
  private static final int synX1127int = 64;
  private static final int synX1126int = 0;
  private static final String synX1125String = "";
  private static final String synX1124String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX1123String = "limitexceeded";
  private static final String synX1122String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX1121String = "success";
  private static final String synX1120String = "bensTheatre";
  private static final String synX1119String = "dd-MM-YY ss-MM-HH";
  private static final double synX1118double = 0.025287292175400378;
  private static final String synX1117String = "</html>";
  private static final String synX1116String = "  </body>\t\n";
  private static final String synX1115String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1114String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1113String = "    </div>\n";
  private static final String synX1112String = "      </div>\n";
  private static final String synX1111String = "        </div>\n";
  private static final String synX1110String = "          <button>OK</button>\n";
  private static final String synX1109String = "        <div class=\"close\">\n";
  private static final String synX1108String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX1107String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX1106String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX1105String = "      <div class=\"inner\">\n";
  private static final String synX1104String = "    <div id=\"popup\">\n";
  private static final String synX1103String = "    </footer>\n";
  private static final String synX1102String = "      </div>\n";
  private static final String synX1101String = "        <p>c3063467</p>\n";
  private static final String synX1100String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1099String = "      <div class=\"author\">\n";
  private static final String synX1098String = "    <footer>\n";
  private static final String synX1097String = "    </article>\n";
  private static final String synX1096String = "      </div>\n";
  private static final String synX1095String = "        </div>\n";
  private static final String synX1094String = "          <p>Booked</p>\n";
  private static final String synX1093String = "        <div class=\"booked\">\n";
  private static final String synX1092String = "        </div>\n";
  private static final String synX1091String = "          <p>Available</p>\n";
  private static final String synX1090String = "        <div class=\"available\">\n";
  private static final String synX1089String = "      <div class=\"legend\">\n";
  private static final String synX1088String = "      </table>\n";
  private static final String synX1087String = "</tbody>\n";
  private static final String synX1086String = "</tr>\n";
  private static final String synX1085String = "</td>";
  private static final String synX1084String = "</p>\n";
  private static final int synX1083int = 1;
  private static final String synX1082String = "  <p>";
  private static final String synX1081String = "\">\n";
  private static final String synX1080String = "\" data-seatNumber=\"";
  private static final int synX1079int = 1;
  private static final String synX1078String = "\" data-seat=\"";
  private static final String synX1077String = "\" data-row=\"";
  private static final String synX1076String = "\" data-time=\"";
  private static final String synX1075String = "\" data-user=\"";
  private static final String synX1074String = "<td class=\"seat";
  private static final String synX1073String = " booked";
  private static final String synX1072String = "";
  private static final int synX1071int = 8;
  private static final int synX1070int = 0;
  private static final String synX1069String = "<tr>\n";
  private static final int synX1068int = 8;
  private static final int synX1067int = 0;
  private static final int synX1066int = 0;
  private static final String synX1065String = "H";
  private static final String synX1064String = "G";
  private static final String synX1063String = "F";
  private static final String synX1062String = "E";
  private static final String synX1061String = "D";
  private static final String synX1060String = "C";
  private static final String synX1059String = "B";
  private static final String synX1058String = "A";
  private static final String synX1057String = "        <tbody>";
  private static final String synX1056String = "        </thead>\n";
  private static final String synX1055String = "          </tr>\n";
  private static final String synX1054String = "            </td>\n";
  private static final String synX1053String = "              <p>Stage</p>\n";
  private static final String synX1052String = "            <td colspan=\"8\">\n";
  private static final String synX1051String = "          <tr>\n";
  private static final String synX1050String = "        <thead>\n";
  private static final String synX1049String = "      <table>\n";
  private static final String synX1048String = "      </div>\n";
  private static final String synX1047String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX1046String = "      <div class=\"instructions\">\n";
  private static final String synX1045String = "      </div>\n";
  private static final String synX1044String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX1043String = "        <p>";
  private static final String synX1042String = "      <div class=\"time\">\n";
  private static final String synX1041String = "      <h2>Seats</h2>\n";
  private static final String synX1040String = "</p>\n";
  private static final String synX1039String = "      <p class=\"message\">";
  private static final String synX1038String = "    <article>\n";
  private static final String synX1037String = "    </header>\n";
  private static final String synX1036String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX1035String = "    <header>\n";
  private static final String synX1034String = "  <body class=\"home\">\n";
  private static final String synX1033String = "  </head>\n";
  private static final String synX1032String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1031String = "    <![endif]-->\n";
  private static final String synX1030String = "      </script>\n";
  private static final String synX1029String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1028String = "    <!--[if IE]>\n";
  private static final String synX1027String = "    <title>Theatre Booking System</title>\n";
  private static final String synX1026String = "    <meta charset=utf-8>\n";
  private static final String synX1025String = "  <head>\n";
  private static final String synX1024String = "<html lang=\"en\">\n";
  private static final String synX1023String = "<!DOCTYPE html>\n";
  private static final String synX1022String = "rvENP6AS";
  private static final String synX1021String = "/WEB-INF/bookingData.ser";
  private static final double synX1020double = 0.28190008980957426;
  private static final String synX1019String = "/WEB-INF/bookingData.ser";
  private static final int synX1018int = -931387200;
  private static final String synX1017String = "/WEB-INF/bookingData.ser";
  private static final int synX1016int = 64;
  private static final String synX1015String = "message";
  private static final double synX1014double = 0.718485755434668;
  private static Logger trapper;
  private String speech;
  public static int upstreamReduce = -696091760;
  private Prat[] bottomSpectrum;

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    double designation;
    PrintWriter unfashionable;
    File rentApplication;
    String townhouseFront;
    designation = synX1014double;
    unfashionable = rejoinder.getWriter();
    speech = asks.getParameter(synX1015String);

    if (speech != null) synx26();
    else synx27();
    bottomSpectrum = new Prat[synX1016int];
    rentApplication = new File(getServletContext().getRealPath(synX1017String));

    if (rentApplication.exists()) synx28();
    else synx29();
    townhouseFront = sustainBackTable();
    unfashionable.println(townhouseFront);
  }

  public synchronized Prat[] writeDatabase() {
    int occasion;
    occasion = synX1018int;

    try {
      FileInputStream whysCharge;
      ObjectInputStream elected;
      Prat[] members;
      whysCharge = new FileInputStream(getServletContext().getRealPath(synX1019String));
      elected = new ObjectInputStream(whysCharge);
      members = (Prat[]) elected.readObject();
      elected.close();
      whysCharge.close();
      return members;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      trapper.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void avoidDatabase(Prat[] stalls) {
    double discover;
    discover = synX1020double;

    try {
      FileOutputStream downLodge;
      ObjectOutputStream tabu;
      downLodge = new FileOutputStream(getServletContext().getRealPath(synX1021String));
      tabu = new ObjectOutputStream(downLodge);
      tabu.writeObject(stalls);
      tabu.close();
      downLodge.close();
    } catch (IOException appointed) {
      appointed.printStackTrace();
    }
  }

  public synchronized String sustainBackTable() {
    String beacon;
    String ajax;
    int behindTurn;
    beacon = synX1022String;
    ajax =
        synX1023String
            + synX1024String
            + synX1025String
            + synX1026String
            + synX1027String
            + synX1028String
            + synX1029String
            + synX1030String
            + synX1031String
            + synX1032String
            + synX1033String
            + synX1034String
            + synX1035String
            + synX1036String
            + synX1037String
            + synX1038String
            + synX1039String
            + speech
            + synX1040String
            + synX1041String
            + synX1042String
            + synX1043String
            + findActualSentence()
            + synX1044String
            + synX1045String
            + synX1046String
            + synX1047String
            + synX1048String
            + synX1049String
            + synX1050String
            + synX1051String
            + synX1052String
            + synX1053String
            + synX1054String
            + synX1055String
            + synX1056String
            + synX1057String;
    String[] dustupRange = {
      synX1058String,
      synX1059String,
      synX1060String,
      synX1061String,
      synX1062String,
      synX1063String,
      synX1064String,
      synX1065String
    };
    behindTurn = synX1066int;

    for (int i = synX1067int; i < synX1068int; i++) {
      ajax += synX1069String;

      for (int flier = synX1070int; flier < synX1071int; flier++) {
        String logged;
        logged = synX1072String;

        if (!bottomSpectrum[behindTurn].isAccessible()) {
          logged = synX1073String;
        }

        ajax +=
            synX1074String
                + logged
                + synX1075String
                + bottomSpectrum[behindTurn].obtainViewerEst()
                + synX1076String
                + bottomSpectrum[behindTurn].takePeriod()
                + synX1077String
                + dustupRange[i]
                + synX1078String
                + (flier + synX1079int)
                + synX1080String
                + behindTurn
                + synX1081String
                + synX1082String
                + dustupRange[i]
                + (flier + synX1083int)
                + synX1084String
                + synX1085String;
        behindTurn++;
      }
      ajax += synX1086String;
    }
    ajax +=
        synX1087String
            + synX1088String
            + synX1089String
            + synX1090String
            + synX1091String
            + synX1092String
            + synX1093String
            + synX1094String
            + synX1095String
            + synX1096String
            + synX1097String
            + synX1098String
            + synX1099String
            + synX1100String
            + synX1101String
            + synX1102String
            + synX1103String
            + synX1104String
            + synX1105String
            + synX1106String
            + synX1107String
            + synX1108String
            + synX1109String
            + synX1110String
            + synX1111String
            + synX1112String
            + synX1113String
            + synX1114String
            + synX1115String
            + synX1116String
            + synX1117String;
    return ajax;
  }

  public static synchronized String findActualSentence() {
    double prices;
    SimpleDateFormat radicalTimetableMode;
    Date beginning;
    String tomcatYearMinutes;
    prices = synX1118double;
    radicalTimetableMode = new SimpleDateFormat(synX1119String);
    beginning = new Date();
    tomcatYearMinutes = radicalTimetableMode.format(beginning);
    return tomcatYearMinutes;
  }

  static {
    trapper = Logger.getLogger(synX1120String);
  }

  private synchronized void synx26() throws ServletException, IOException {

    if (speech.equals(synX1121String)) {
      speech = synX1122String;
    } else if (speech.equals(synX1123String)) {
      speech = synX1124String;
    }
  }

  private synchronized void synx27() throws ServletException, IOException {
    speech = synX1125String;
  }

  private synchronized void synx28() throws ServletException, IOException {
    bottomSpectrum = writeDatabase();
  }

  private synchronized void synx29() throws ServletException, IOException {

    for (int i = synX1126int; i < synX1127int; i++) {
      Prat untriedButtocks;
      untriedButtocks = new Prat();
      bottomSpectrum[i] = untriedButtocks;
    }
    avoidDatabase(bottomSpectrum);
  }
}
