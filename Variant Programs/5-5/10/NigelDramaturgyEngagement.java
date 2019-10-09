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

public class NigelDramaturgyEngagement extends javax.servlet.http.HttpServlet {
  private static final String synX1243String = "/WEB-INF/bookingData.ser";
  private static final double synX1242double = 0.5131270892367774;
  private static final String synX1241String = "sDgOUaVd4ogkmmH";
  private static final String synX1240String = "9";
  private static final String synX1239String = "8";
  private static final String synX1238String = "7";
  private static final String synX1237String = "6";
  private static final String synX1236String = "5";
  private static final String synX1235String = "4";
  private static final String synX1234String = "3";
  private static final String synX1233String = "2";
  private static final String synX1232String = "1";
  private static final String synX1231String = "0";
  private static final String synX1230String = "Z";
  private static final String synX1229String = "Y";
  private static final String synX1228String = "X";
  private static final String synX1227String = "W";
  private static final String synX1226String = "V";
  private static final String synX1225String = "U";
  private static final String synX1224String = "T";
  private static final String synX1223String = "S";
  private static final String synX1222String = "R";
  private static final String synX1221String = "Q";
  private static final String synX1220String = "P";
  private static final String synX1219String = "O";
  private static final String synX1218String = "N";
  private static final String synX1217String = "M";
  private static final String synX1216String = "L";
  private static final String synX1215String = "K";
  private static final String synX1214String = "J";
  private static final String synX1213String = "I";
  private static final String synX1212String = "H";
  private static final String synX1211String = "G";
  private static final String synX1210String = "F";
  private static final String synX1209String = "E";
  private static final String synX1208String = "D";
  private static final String synX1207String = "C";
  private static final String synX1206String = "B";
  private static final String synX1205String = "A";
  private static final String synX1204String = "seatnumber";
  private static final String synX1203String = "seat";
  private static final String synX1202String = "row";
  private static final double synX1201double = 0.25380033605712027;
  private static final String synX1200String = "/WEB-INF/bookingData.ser";
  private static final double synX1199double = 0.1303323247894863;
  private static final String synX1198String = "</html>";
  private static final String synX1197String = "  </body>\t\n";
  private static final String synX1196String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1195String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1194String = "    </footer>\n";
  private static final String synX1193String = "      </div>\n";
  private static final String synX1192String = "        <p>c3063467</p>\n";
  private static final String synX1191String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1190String = "      <div class=\"author\">\n";
  private static final String synX1189String = "    <footer>\n";
  private static final String synX1188String = "    </article>\n";
  private static final String synX1187String = "      </form>\n";
  private static final String synX1186String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX1185String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX1184String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX1183String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX1182String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX1181String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX1180String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX1179String = "\" />\n";
  private static final String synX1178String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX1177String = "\" />\n";
  private static final String synX1176String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX1175String = "\" />\n";
  private static final String synX1174String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX1173String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX1172String = "\n";
  private static final String synX1171String = "</div>\n";
  private static final String synX1170String = "</p>";
  private static final String synX1169String = "\">";
  private static final String synX1168String = "<p class=\"option\" data-code=\"";
  private static final String synX1167String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX1166String = "      <div class=\"security\">\n";
  private static final String synX1165String = "</div>\n";
  private static final String synX1164String = "</p>";
  private static final String synX1163String = "<p class=\"option\">";
  private static final String synX1162String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX1161String = "      <div class=\"selected\">\n";
  private static final String synX1160String = "      <h2>Your Selection</h2>\n";
  private static final String synX1159String = "    <article>\n";
  private static final String synX1158String = "    </header>\n";
  private static final String synX1157String = "      <h1>Seat Booking</h1>\n";
  private static final String synX1156String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX1155String = "    <header>\n";
  private static final String synX1154String = "  <body class=\"booking\">\n";
  private static final String synX1153String = "  </head>\n";
  private static final String synX1152String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1151String = "    <![endif]-->\n";
  private static final String synX1150String = "      </script>\n";
  private static final String synX1149String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1148String = "    <!--[if IE]>\n";
  private static final String synX1147String = "    <title>Seat Booking</title>\n";
  private static final String synX1146String = "    <meta charset=utf-8>\n";
  private static final String synX1145String = "  <head>\n";
  private static final String synX1144String = "<html lang=\"en\">\n";
  private static final String synX1143String = "<!DOCTYPE html>\n";
  private static final String synX1142String = "";
  private static final int synX1141int = 47124091;
  private static final String synX1140String = "benstheatre?message=success";
  private static final boolean synX1139boolean = false;
  private static final String synX1138String = "benstheatre?message=limitexceeded";
  private static final int synX1137int = 2;
  private static final int synX1136int = 0;
  private static final String synX1135String = "phone";
  private static final String synX1134String = "email";
  private static final String synX1133String = "address";
  private static final String synX1132String = "userid";
  private static final String synX1131String = "seatnumber";
  private static final String synX1130String = "seat";
  private static final String synX1129String = "row";
  private static final double synX1128double = 0.48616643734750675;
  private int derriere = 0;
  private Sit[] bumSelection = null;
  private java.lang.String cellphone = null;
  private java.lang.String usePhoto = null;
  private static java.util.logging.Logger chainsaw = getLogger("bensTheatre");
  private int behindTurn = 0;
  static final double juniorRestriction = 0.8751181382674112;
  private java.lang.String fix = null;

  public synchronized void doPost(HttpServletRequest appeals, HttpServletResponse reacted)
      throws ServletException, IOException {
    double greaterConstrain;
    int withheld;
    greaterConstrain = synX1128double;
    wrangle = appeals.getParameter(synX1129String);
    derriere = parseInt(appeals.getParameter(synX1130String));
    behindTurn = parseInt(appeals.getParameter(synX1131String));
    usePhoto = appeals.getParameter(synX1132String);
    fix = appeals.getParameter(synX1133String);
    messaging = appeals.getParameter(synX1134String);
    cellphone = appeals.getParameter(synX1135String);
    bumSelection = registerSubmit();
    withheld = synX1136int;
    for (Sit fh : bumSelection) synx30(fh, withheld);

    if (withheld > synX1137int) {
      reacted.sendRedirect(synX1138String);
    } else {
      bumSelection[behindTurn].arrangedLoginIdentifier(usePhoto);
      bumSelection[behindTurn].arrangeRespond(fix);
      bumSelection[behindTurn].readyMails(messaging);
      bumSelection[behindTurn].laidCall(cellphone);
      bumSelection[behindTurn].laidClip(WarwickPlayhouses.takeTopicalPeriod());
      bumSelection[behindTurn].situatedAvailability(synX1139boolean);
      avoidDatabase(bumSelection);
      reacted.sendRedirect(synX1140String);
    }
  }

  private java.lang.String wrangle = null;

  public synchronized java.lang.String fetchAppointmentLayouts() {
    int upstairsMax;
    java.lang.String identifier;
    java.lang.String plugin;
    upstairsMax = synX1141int;
    identifier = protectingEncryption();
    plugin = synX1142String;
    plugin +=
        synX1143String
            + synX1144String
            + synX1145String
            + synX1146String
            + synX1147String
            + synX1148String
            + synX1149String
            + synX1150String
            + synX1151String
            + synX1152String
            + synX1153String
            + synX1154String
            + synX1155String
            + synX1156String
            + synX1157String
            + synX1158String
            + synX1159String
            + synX1160String
            + synX1161String
            + synX1162String;
    plugin += synX1163String + wrangle + derriere + synX1164String;
    plugin += synX1165String + synX1166String + synX1167String;
    plugin += synX1168String + identifier + synX1169String + identifier + synX1170String;
    plugin +=
        synX1171String
            + synX1172String
            + synX1173String
            + synX1174String
            + derriere
            + synX1175String
            + synX1176String
            + wrangle
            + synX1177String
            + synX1178String
            + behindTurn
            + synX1179String
            + synX1180String
            + synX1181String
            + synX1182String
            + synX1183String
            + synX1184String
            + synX1185String
            + synX1186String
            + synX1187String
            + synX1188String
            + synX1189String
            + synX1190String
            + synX1191String
            + synX1192String
            + synX1193String
            + synX1194String
            + synX1195String
            + synX1196String
            + synX1197String
            + synX1198String;
    return plugin;
  }

  public synchronized Sit[] registerSubmit() {
    double importance;
    importance = synX1199double;

    try {
      java.io.FileInputStream proponentsDatabase;
      java.io.ObjectInputStream establishment;
      Sit[] venues = null;
      proponentsDatabase =
          new java.io.FileInputStream(getServletContext().getRealPath(synX1200String));
      establishment = new java.io.ObjectInputStream(proponentsDatabase);
      venues = (Sit[]) establishment.readObject();
      establishment.close();
      proponentsDatabase.close();
      return venues;
    } catch (java.io.IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      chainsaw.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse explanation)
      throws ServletException, IOException {
    double figures;
    java.io.PrintWriter away;
    java.lang.String engagementVarlet;
    figures = synX1201double;
    away = explanation.getWriter();
    wrangle = complaint.getParameter(synX1202String);
    derriere = parseInt(complaint.getParameter(synX1203String));
    behindTurn = parseInt(complaint.getParameter(synX1204String));
    bumSelection = registerSubmit();
    engagementVarlet = fetchAppointmentLayouts();
    away.println(engagementVarlet);
  }

  public synchronized java.lang.String protectingEncryption() {
    String minutesWide;
    java.lang.String correspondence[] = {
      synX1205String,
      synX1206String,
      synX1207String,
      synX1208String,
      synX1209String,
      synX1210String,
      synX1211String,
      synX1212String,
      synX1213String,
      synX1214String,
      synX1215String,
      synX1216String,
      synX1217String,
      synX1218String,
      synX1219String,
      synX1220String,
      synX1221String,
      synX1222String,
      synX1223String,
      synX1224String,
      synX1225String,
      synX1226String,
      synX1227String,
      synX1228String,
      synX1229String,
      synX1230String
    };
    java.lang.String data[] = {
      synX1231String,
      synX1232String,
      synX1233String,
      synX1234String,
      synX1235String,
      synX1236String,
      synX1237String,
      synX1238String,
      synX1239String,
      synX1240String
    };
    java.util.Random stray;
    java.lang.String temperature, carboxylate, lituus, contractual, r6, c3;
    minutesWide = synX1241String;
    stray = new java.util.Random();
    temperature = null;
    carboxylate = null;
    lituus = null;
    contractual = null;
    r6 = null;
    c3 = null;
    temperature = correspondence[stray.nextInt(correspondence.length)];
    carboxylate = data[stray.nextInt(data.length)];
    lituus = correspondence[stray.nextInt(correspondence.length)];
    contractual = data[stray.nextInt(data.length)];
    r6 = correspondence[stray.nextInt(correspondence.length)];
    c3 = data[stray.nextInt(data.length)];
    return temperature + carboxylate + lituus + contractual + r6 + c3;
  }

  private java.lang.String messaging = null;

  public synchronized void avoidDatabase(Sit[] ridings) {
    double amount;
    amount = synX1242double;

    try {
      java.io.FileOutputStream downLodge;
      java.io.ObjectOutputStream prohibited;
      downLodge = new java.io.FileOutputStream(getServletContext().getRealPath(synX1243String));
      prohibited = new java.io.ObjectOutputStream(downLodge);
      prohibited.writeObject(ridings);
      prohibited.close();
      downLodge.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  private synchronized void synx30(Sit fh, int withheld) throws ServletException, IOException {

    if (fh.comeEnjoyerMilad() != null && fh.comeEnjoyerMilad().equals(usePhoto)) {
      withheld++;
    }
  }
}
