import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class HansenComedyOrdering extends javax.servlet.http.HttpServlet {
  private static final String synX2869String = "/WEB-INF/bookingData.ser";
  private static final double synX2868double = 0.844177533390344;
  private static final String synX2867String = "/WEB-INF/bookingData.ser";
  private static final String synX2866String = "UJBj";
  private static final String synX2865String = "9";
  private static final String synX2864String = "8";
  private static final String synX2863String = "7";
  private static final String synX2862String = "6";
  private static final String synX2861String = "5";
  private static final String synX2860String = "4";
  private static final String synX2859String = "3";
  private static final String synX2858String = "2";
  private static final String synX2857String = "1";
  private static final String synX2856String = "0";
  private static final String synX2855String = "Z";
  private static final String synX2854String = "Y";
  private static final String synX2853String = "X";
  private static final String synX2852String = "W";
  private static final String synX2851String = "V";
  private static final String synX2850String = "U";
  private static final String synX2849String = "T";
  private static final String synX2848String = "S";
  private static final String synX2847String = "R";
  private static final String synX2846String = "Q";
  private static final String synX2845String = "P";
  private static final String synX2844String = "O";
  private static final String synX2843String = "N";
  private static final String synX2842String = "M";
  private static final String synX2841String = "L";
  private static final String synX2840String = "K";
  private static final String synX2839String = "J";
  private static final String synX2838String = "I";
  private static final String synX2837String = "H";
  private static final String synX2836String = "G";
  private static final String synX2835String = "F";
  private static final String synX2834String = "E";
  private static final String synX2833String = "D";
  private static final String synX2832String = "C";
  private static final String synX2831String = "B";
  private static final String synX2830String = "A";
  private static final String synX2829String = "Epw3WAe";
  private static final String synX2828String = "</html>";
  private static final String synX2827String = "  </body>\t\n";
  private static final String synX2826String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2825String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2824String = "    </footer>\n";
  private static final String synX2823String = "      </div>\n";
  private static final String synX2822String = "        <p>c3063467</p>\n";
  private static final String synX2821String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2820String = "      <div class=\"author\">\n";
  private static final String synX2819String = "    <footer>\n";
  private static final String synX2818String = "    </article>\n";
  private static final String synX2817String = "      </form>\n";
  private static final String synX2816String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX2815String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX2814String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX2813String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX2812String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX2811String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX2810String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX2809String = "\" />\n";
  private static final String synX2808String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX2807String = "\" />\n";
  private static final String synX2806String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX2805String = "\" />\n";
  private static final String synX2804String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX2803String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX2802String = "\n";
  private static final String synX2801String = "</div>\n";
  private static final String synX2800String = "</p>";
  private static final String synX2799String = "\">";
  private static final String synX2798String = "<p class=\"option\" data-code=\"";
  private static final String synX2797String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX2796String = "      <div class=\"security\">\n";
  private static final String synX2795String = "</div>\n";
  private static final String synX2794String = "</p>";
  private static final String synX2793String = "<p class=\"option\">";
  private static final String synX2792String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX2791String = "      <div class=\"selected\">\n";
  private static final String synX2790String = "      <h2>Your Selection</h2>\n";
  private static final String synX2789String = "    <article>\n";
  private static final String synX2788String = "    </header>\n";
  private static final String synX2787String = "      <h1>Seat Booking</h1>\n";
  private static final String synX2786String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX2785String = "    <header>\n";
  private static final String synX2784String = "  <body class=\"booking\">\n";
  private static final String synX2783String = "  </head>\n";
  private static final String synX2782String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2781String = "    <![endif]-->\n";
  private static final String synX2780String = "      </script>\n";
  private static final String synX2779String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2778String = "    <!--[if IE]>\n";
  private static final String synX2777String = "    <title>Seat Booking</title>\n";
  private static final String synX2776String = "    <meta charset=utf-8>\n";
  private static final String synX2775String = "  <head>\n";
  private static final String synX2774String = "<html lang=\"en\">\n";
  private static final String synX2773String = "<!DOCTYPE html>\n";
  private static final String synX2772String = "";
  private static final int synX2771int = -235139132;
  private static final String synX2770String = "benstheatre?message=success";
  private static final boolean synX2769boolean = false;
  private static final String synX2768String = "benstheatre?message=limitexceeded";
  private static final int synX2767int = 2;
  private static final int synX2766int = 0;
  private static final String synX2765String = "phone";
  private static final String synX2764String = "email";
  private static final String synX2763String = "address";
  private static final String synX2762String = "userid";
  private static final String synX2761String = "seatnumber";
  private static final String synX2760String = "seat";
  private static final String synX2759String = "row";
  private static final double synX2758double = 0.8424601264435967;
  private static final String synX2757String = "seatnumber";
  private static final String synX2756String = "seat";
  private static final String synX2755String = "row";
  private static final double synX2754double = 0.34531801804374584;
  public static final String postSouvenirs = "wkDggJKM2Di";
  private Bottom[] sternArsenal = null;
  private java.lang.String controversy = null;
  private int assSeveral = 0;
  private int ass = 0;
  private java.lang.String usabilityCard = null;
  private java.lang.String landline = null;
  private java.lang.String direct = null;
  private java.lang.String mail = null;
  private static java.util.logging.Logger recorder =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    double restrain = synX2754double;
    java.io.PrintWriter retired = rebuttal.getWriter();
    controversy = asks.getParameter(synX2755String);
    ass = java.lang.Integer.parseInt(asks.getParameter(synX2756String));
    assSeveral = java.lang.Integer.parseInt(asks.getParameter(synX2757String));
    sternArsenal = readerInitiate();
    java.lang.String rentPaper = drawAdvanceFootnote();
    retired.println(rentPaper);
  }

  public synchronized void doPost(HttpServletRequest calls, HttpServletResponse wake)
      throws ServletException, IOException {
    double moniker = synX2758double;
    controversy = calls.getParameter(synX2759String);
    ass = java.lang.Integer.parseInt(calls.getParameter(synX2760String));
    assSeveral = java.lang.Integer.parseInt(calls.getParameter(synX2761String));
    usabilityCard = calls.getParameter(synX2762String);
    direct = calls.getParameter(synX2763String);
    mail = calls.getParameter(synX2764String);
    landline = calls.getParameter(synX2765String);
    sternArsenal = readerInitiate();
    int purchased = synX2766int;
    for (Bottom waffen : sternArsenal) {

      if (waffen.arriveClientIdentifying() != null
          && waffen.arriveClientIdentifying().equals(usabilityCard)) {
        purchased++;
      }
    }

    if (purchased > synX2767int) {
      wake.sendRedirect(synX2768String);
    } else {
      sternArsenal[assSeveral].putExploiterQuod(usabilityCard);
      sternArsenal[assSeveral].placeAlleviate(direct);
      sternArsenal[assSeveral].fixDissemination(mail);
      sternArsenal[assSeveral].orderedCaller(landline);
      sternArsenal[assSeveral].laidClip(GarethTheatrical.findActualSentence());
      sternArsenal[assSeveral].settledVisible(synX2769boolean);
      reduceApplication(sternArsenal);
      wake.sendRedirect(synX2770String);
    }
  }

  public synchronized java.lang.String drawAdvanceFootnote() {
    int load = synX2771int;
    java.lang.String prefix = guardPassword();
    java.lang.String jpeg = synX2772String;
    jpeg +=
        synX2773String
            + synX2774String
            + synX2775String
            + synX2776String
            + synX2777String
            + synX2778String
            + synX2779String
            + synX2780String
            + synX2781String
            + synX2782String
            + synX2783String
            + synX2784String
            + synX2785String
            + synX2786String
            + synX2787String
            + synX2788String
            + synX2789String
            + synX2790String
            + synX2791String
            + synX2792String;
    jpeg += synX2793String + controversy + ass + synX2794String;
    jpeg += synX2795String + synX2796String + synX2797String;
    jpeg += synX2798String + prefix + synX2799String + prefix + synX2800String;
    jpeg +=
        synX2801String
            + synX2802String
            + synX2803String
            + synX2804String
            + ass
            + synX2805String
            + synX2806String
            + controversy
            + synX2807String
            + synX2808String
            + assSeveral
            + synX2809String
            + synX2810String
            + synX2811String
            + synX2812String
            + synX2813String
            + synX2814String
            + synX2815String
            + synX2816String
            + synX2817String
            + synX2818String
            + synX2819String
            + synX2820String
            + synX2821String
            + synX2822String
            + synX2823String
            + synX2824String
            + synX2825String
            + synX2826String
            + synX2827String
            + synX2828String;
    return jpeg;
  }

  public synchronized java.lang.String guardPassword() {
    String appreciate = synX2829String;
    java.lang.String epistles[] = {
      synX2830String,
      synX2831String,
      synX2832String,
      synX2833String,
      synX2834String,
      synX2835String,
      synX2836String,
      synX2837String,
      synX2838String,
      synX2839String,
      synX2840String,
      synX2841String,
      synX2842String,
      synX2843String,
      synX2844String,
      synX2845String,
      synX2846String,
      synX2847String,
      synX2848String,
      synX2849String,
      synX2850String,
      synX2851String,
      synX2852String,
      synX2853String,
      synX2854String,
      synX2855String
    };
    java.lang.String numerals[] = {
      synX2856String,
      synX2857String,
      synX2858String,
      synX2859String,
      synX2860String,
      synX2861String,
      synX2862String,
      synX2863String,
      synX2864String,
      synX2865String
    };
    java.util.Random occasional = new java.util.Random();
    java.lang.String frequency = null,
        activating = null,
        betas = null,
        c1 = null,
        eq = null,
        ans = null;
    frequency = epistles[occasional.nextInt(epistles.length)];
    activating = numerals[occasional.nextInt(numerals.length)];
    betas = epistles[occasional.nextInt(epistles.length)];
    c1 = numerals[occasional.nextInt(numerals.length)];
    eq = epistles[occasional.nextInt(epistles.length)];
    ans = numerals[occasional.nextInt(numerals.length)];
    return frequency + activating + betas + c1 + eq + ans;
  }

  public synchronized Bottom[] readerInitiate() {
    String chained = synX2866String;

    try {
      Bottom[] passengers = null;
      java.io.FileInputStream withoutRegister =
          new java.io.FileInputStream(getServletContext().getRealPath(synX2867String));
      java.io.ObjectInputStream elected = new java.io.ObjectInputStream(withoutRegister);
      passengers = (Bottom[]) elected.readObject();
      elected.close();
      withoutRegister.close();
      return passengers;
    } catch (java.io.IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      recorder.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void reduceApplication(Bottom[] stools) {
    double nung = synX2868double;

    try {
      java.io.FileOutputStream awayRegister =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX2869String));
      java.io.ObjectOutputStream unsuccessful = new java.io.ObjectOutputStream(awayRegister);
      unsuccessful.writeObject(stools);
      unsuccessful.close();
      awayRegister.close();
    } catch (java.io.IOException libris) {
      libris.printStackTrace();
    }
  }
}
