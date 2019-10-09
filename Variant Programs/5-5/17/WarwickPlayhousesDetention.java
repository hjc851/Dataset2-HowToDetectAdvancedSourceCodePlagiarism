import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends javax.servlet.http.HttpServlet {
  private java.lang.String emailed;
  private int behind;

  public synchronized java.lang.String takeRentalSite() {
    java.lang.String statute = insecureCodex();
    java.lang.String url = "";
    url +=
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Seat Booking</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"booking\">\n"
            + "    <header>\n"
            + "      <a href=\"benstheatre\">HOME</a>\n"
            + "      <h1>Seat Booking</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <h2>Your Selection</h2>\n"
            + "      <div class=\"selected\">\n"
            + "        <p class=\"heading\">Selected Seat:</p>";
    url += "<p class=\"option\">" + wrangle + behind + "</p>";
    url +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    url += "<p class=\"option\" data-code=\"" + statute + "\">" + statute + "</p>";
    url +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangle
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + inductBit
            + "\" />\n"
            + "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n"
            + "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n"
            + "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n"
            + "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n"
            + "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n"
            + "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n"
            + "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n"
            + "      </form>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>";
    return url;
  }

  private java.lang.String speech;
  private java.lang.String wrangle;
  private Tail[] buttMix;
  private int inductBit;
  private java.lang.String headset;
  private static java.util.logging.Logger voyage =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized java.lang.String insecureCodex() {
    java.lang.String writing[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String quantity[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random haphazard = new java.util.Random();
    java.lang.String temperature, crh, android, act, rl, fgf;
    temperature = writing[haphazard.nextInt(writing.length)];
    crh = quantity[haphazard.nextInt(quantity.length)];
    android = writing[haphazard.nextInt(writing.length)];
    act = quantity[haphazard.nextInt(quantity.length)];
    rl = writing[haphazard.nextInt(writing.length)];
    fgf = quantity[haphazard.nextInt(quantity.length)];
    return temperature + crh + android + act + rl + fgf;
  }

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse responding)
      throws ServletException, IOException {
    java.io.PrintWriter impossible = responding.getWriter();
    wrangle = motion.getParameter("row");
    behind = java.lang.Integer.parseInt(motion.getParameter("seat"));
    inductBit = java.lang.Integer.parseInt(motion.getParameter("seatnumber"));
    buttMix = tellReadme();
    java.lang.String hiringSheet = takeRentalSite();
    impossible.println(hiringSheet);
  }

  public synchronized Tail[] tellReadme() {

    try {
      Tail[] mats;
      java.io.FileInputStream supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream officeholders =
          new java.io.ObjectInputStream(supportersDocumentation);
      mats = (Tail[]) officeholders.readObject();
      officeholders.close();
      supportersDocumentation.close();
      return mats;
    } catch (java.io.IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      voyage.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void doPost(HttpServletRequest asks, HttpServletResponse wake)
      throws ServletException, IOException {
    wrangle = asks.getParameter("row");
    behind = java.lang.Integer.parseInt(asks.getParameter("seat"));
    inductBit = java.lang.Integer.parseInt(asks.getParameter("seatnumber"));
    personName = asks.getParameter("userid");
    speech = asks.getParameter("address");
    emailed = asks.getParameter("email");
    headset = asks.getParameter("phone");
    buttMix = tellReadme();
    int recorded = 0;
    for (Tail waffen : buttMix) {

      if (waffen.catchCustomersIbid() != null && waffen.catchCustomersIbid().equals(personName)) {
        recorded++;
      }
    }

    if (recorded > 2) {
      wake.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttMix[inductBit].adjustClientIdentifying(personName);
      buttMix[inductBit].markAdress(speech);
      buttMix[inductBit].arrangeElectronically(emailed);
      buttMix[inductBit].markMobile(headset);
      buttMix[inductBit].situatedMinutes(NigelDramaturgy.producePrevalentNow());
      buttMix[inductBit].laidObtainable(false);
      keepSubmit(buttMix);
      wake.sendRedirect("benstheatre?message=success");
    }
  }

  private java.lang.String personName;

  public synchronized void keepSubmit(Tail[] ridings) {

    try {
      java.io.FileOutputStream unstylishPaperwork =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unsuccessful = new java.io.ObjectOutputStream(unstylishPaperwork);
      unsuccessful.writeObject(ridings);
      unsuccessful.close();
      unstylishPaperwork.close();
    } catch (java.io.IOException officio) {
      officio.printStackTrace();
    }
  }
}
