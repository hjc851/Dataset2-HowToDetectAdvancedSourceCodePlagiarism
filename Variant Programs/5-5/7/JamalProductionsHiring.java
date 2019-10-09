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

public class JamalProductionsHiring extends javax.servlet.http.HttpServlet {
  private static final String synX565String = "9";
  private static final String synX564String = "8";
  private static final String synX563String = "7";
  private static final String synX562String = "6";
  private static final String synX561String = "5";
  private static final String synX560String = "4";
  private static final String synX559String = "3";
  private static final String synX558String = "2";
  private static final String synX557String = "1";
  private static final String synX556String = "0";
  private static final String synX555String = "Z";
  private static final String synX554String = "Y";
  private static final String synX553String = "X";
  private static final String synX552String = "W";
  private static final String synX551String = "V";
  private static final String synX550String = "U";
  private static final String synX549String = "T";
  private static final String synX548String = "S";
  private static final String synX547String = "R";
  private static final String synX546String = "Q";
  private static final String synX545String = "P";
  private static final String synX544String = "O";
  private static final String synX543String = "N";
  private static final String synX542String = "M";
  private static final String synX541String = "L";
  private static final String synX540String = "K";
  private static final String synX539String = "J";
  private static final String synX538String = "I";
  private static final String synX537String = "H";
  private static final String synX536String = "G";
  private static final String synX535String = "F";
  private static final String synX534String = "E";
  private static final String synX533String = "D";
  private static final String synX532String = "C";
  private static final String synX531String = "B";
  private static final String synX530String = "A";
  private static final String synX529String = "</html>";
  private static final String synX528String = "  </body>\t\n";
  private static final String synX527String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX526String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX525String = "    </footer>\n";
  private static final String synX524String = "      </div>\n";
  private static final String synX523String = "        <p>c3063467</p>\n";
  private static final String synX522String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX521String = "      <div class=\"author\">\n";
  private static final String synX520String = "    <footer>\n";
  private static final String synX519String = "    </article>\n";
  private static final String synX518String = "      </form>\n";
  private static final String synX517String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX516String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX515String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX514String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX513String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX512String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX511String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX510String = "\" />\n";
  private static final String synX509String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX508String = "\" />\n";
  private static final String synX507String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX506String = "\" />\n";
  private static final String synX505String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX504String = "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX503String = "\n";
  private static final String synX502String = "</div>\n";
  private static final String synX501String = "</p>";
  private static final String synX500String = "\">";
  private static final String synX499String = "<p class=\"option\" data-code=\"";
  private static final String synX498String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX497String = "      <div class=\"security\">\n";
  private static final String synX496String = "</div>\n";
  private static final String synX495String = "</p>";
  private static final String synX494String = "<p class=\"option\">";
  private static final String synX493String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX492String = "      <div class=\"selected\">\n";
  private static final String synX491String = "      <h2>Your Selection</h2>\n";
  private static final String synX490String = "    <article>\n";
  private static final String synX489String = "    </header>\n";
  private static final String synX488String = "      <h1>Seat Booking</h1>\n";
  private static final String synX487String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX486String = "    <header>\n";
  private static final String synX485String = "  <body class=\"booking\">\n";
  private static final String synX484String = "  </head>\n";
  private static final String synX483String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX482String = "    <![endif]-->\n";
  private static final String synX481String = "      </script>\n";
  private static final String synX480String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX479String = "    <!--[if IE]>\n";
  private static final String synX478String = "    <title>Seat Booking</title>\n";
  private static final String synX477String = "    <meta charset=utf-8>\n";
  private static final String synX476String = "  <head>\n";
  private static final String synX475String = "<html lang=\"en\">\n";
  private static final String synX474String = "<!DOCTYPE html>\n";
  private static final String synX473String = "";
  private static final String synX472String = "/WEB-INF/bookingData.ser";
  private static final String synX471String = "seatnumber";
  private static final String synX470String = "seat";
  private static final String synX469String = "row";
  private static final String synX468String = "benstheatre?message=success";
  private static final boolean synX467boolean = false;
  private static final String synX466String = "benstheatre?message=limitexceeded";
  private static final int synX465int = 2;
  private static final int synX464int = 0;
  private static final String synX463String = "phone";
  private static final String synX462String = "email";
  private static final String synX461String = "address";
  private static final String synX460String = "userid";
  private static final String synX459String = "seatnumber";
  private static final String synX458String = "seat";
  private static final String synX457String = "row";
  private static final String synX456String = "/WEB-INF/bookingData.ser";
  public static java.util.logging.Logger recorder;

  public synchronized Sit[] rereadSubmitted() {

    try {
      java.io.FileInputStream niiComplaint;
      java.io.ObjectInputStream nii;
      Sit[] beds;
      niiComplaint = new java.io.FileInputStream(getServletContext().getRealPath(synX456String));
      nii = new java.io.ObjectInputStream(niiComplaint);
      beds = (Sit[]) nii.readObject();
      nii.close();
      niiComplaint.close();
      return beds;
    } catch (java.io.IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      recorder.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public int sternProportion;
  public java.lang.String headset;

  public synchronized void doPost(HttpServletRequest quest, HttpServletResponse responds)
      throws ServletException, IOException {
    int registered;
    controversy = quest.getParameter(synX457String);
    posterior = parseInt(quest.getParameter(synX458String));
    sternProportion = parseInt(quest.getParameter(synX459String));
    usePhoto = quest.getParameter(synX460String);
    handle = quest.getParameter(synX461String);
    postal = quest.getParameter(synX462String);
    headset = quest.getParameter(synX463String);
    keisterMyriad = rereadSubmitted();
    registered = synX464int;
    for (Sit waffen : keisterMyriad) synx20(waffen, registered);

    if (registered > synX465int) {
      responds.sendRedirect(synX466String);
    } else {
      keisterMyriad[sternProportion].adjustClientIdentifying(usePhoto);
      keisterMyriad[sternProportion].laidSpeak(handle);
      keisterMyriad[sternProportion].dictatedEmailed(postal);
      keisterMyriad[sternProportion].prepareCalls(headset);
      keisterMyriad[sternProportion].situatedMinutes(VeleOpera.comeLatestClip());
      keisterMyriad[sternProportion].dictatedPurchasable(synX467boolean);
      spareFolder(keisterMyriad);
      responds.sendRedirect(synX468String);
    }
  }

  public synchronized void doGet(HttpServletRequest asked, HttpServletResponse riposte)
      throws ServletException, IOException {
    java.io.PrintWriter proscribed;
    java.lang.String hiringSheet;
    proscribed = riposte.getWriter();
    controversy = asked.getParameter(synX469String);
    posterior = parseInt(asked.getParameter(synX470String));
    sternProportion = parseInt(asked.getParameter(synX471String));
    keisterMyriad = rereadSubmitted();
    hiringSheet = beatArrestContents();
    proscribed.println(hiringSheet);
  }

  public synchronized void spareFolder(Sit[] constituencies) {

    try {
      java.io.FileOutputStream backBinder;
      java.io.ObjectOutputStream off;
      backBinder = new java.io.FileOutputStream(getServletContext().getRealPath(synX472String));
      off = new java.io.ObjectOutputStream(backBinder);
      off.writeObject(constituencies);
      off.close();
      backBinder.close();
    } catch (java.io.IOException abe) {
      abe.printStackTrace();
    }
  }

  public java.lang.String handle;

  static {
    recorder = getLogger("bensTheatre");
  }

  public synchronized java.lang.String beatArrestContents() {
    java.lang.String standards;
    java.lang.String metadata;
    standards = safeguardingDesignator();
    metadata = synX473String;
    metadata +=
        metadata
            + synX474String
            + synX475String
            + synX476String
            + synX477String
            + synX478String
            + synX479String
            + synX480String
            + synX481String
            + synX482String
            + synX483String
            + synX484String
            + synX485String
            + synX486String
            + synX487String
            + synX488String
            + synX489String
            + synX490String
            + synX491String
            + synX492String
            + synX493String;
    metadata += metadata + synX494String + controversy + posterior + synX495String;
    metadata += metadata + synX496String + synX497String + synX498String;
    metadata += metadata + synX499String + standards + synX500String + standards + synX501String;
    metadata +=
        metadata
            + synX502String
            + synX503String
            + synX504String
            + synX505String
            + posterior
            + synX506String
            + synX507String
            + controversy
            + synX508String
            + synX509String
            + sternProportion
            + synX510String
            + synX511String
            + synX512String
            + synX513String
            + synX514String
            + synX515String
            + synX516String
            + synX517String
            + synX518String
            + synX519String
            + synX520String
            + synX521String
            + synX522String
            + synX523String
            + synX524String
            + synX525String
            + synX526String
            + synX527String
            + synX528String
            + synX529String;
    return metadata;
  }

  public synchronized java.lang.String safeguardingDesignator() {
    java.lang.String memoranda[] = {
      synX530String,
      synX531String,
      synX532String,
      synX533String,
      synX534String,
      synX535String,
      synX536String,
      synX537String,
      synX538String,
      synX539String,
      synX540String,
      synX541String,
      synX542String,
      synX543String,
      synX544String,
      synX545String,
      synX546String,
      synX547String,
      synX548String,
      synX549String,
      synX550String,
      synX551String,
      synX552String,
      synX553String,
      synX554String,
      synX555String
    };
    java.lang.String statistics[] = {
      synX556String,
      synX557String,
      synX558String,
      synX559String,
      synX560String,
      synX561String,
      synX562String,
      synX563String,
      synX564String,
      synX565String
    };
    java.util.Random indiscriminate;
    java.lang.String fc, acetylcholine, coefficient, cf, m2, d;
    indiscriminate = new java.util.Random();
    fc = memoranda[indiscriminate.nextInt(memoranda.length)];
    acetylcholine = statistics[indiscriminate.nextInt(statistics.length)];
    coefficient = memoranda[indiscriminate.nextInt(memoranda.length)];
    cf = statistics[indiscriminate.nextInt(statistics.length)];
    m2 = memoranda[indiscriminate.nextInt(memoranda.length)];
    d = statistics[indiscriminate.nextInt(statistics.length)];
    return fc + acetylcholine + coefficient + cf + m2 + d;
  }

  public Sit[] keisterMyriad;
  public java.lang.String postal;
  public java.lang.String controversy;
  public int posterior;
  public java.lang.String usePhoto;

  private synchronized void synx20(Sit waffen, int registered)
      throws ServletException, IOException {

    if (waffen.comeEnjoyerMilad() != null && waffen.comeEnjoyerMilad().equals(usePhoto)) {
      registered++;
    }
  }
}
