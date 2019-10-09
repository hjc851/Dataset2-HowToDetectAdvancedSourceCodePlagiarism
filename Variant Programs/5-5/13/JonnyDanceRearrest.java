import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JonnyDanceRearrest extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger lumberman = null;
  public java.lang.String telefax = null;
  public java.lang.String tackle = null;
  public java.lang.String telephony = null;
  public java.lang.String wearerMap = null;
  public int stern = 0;
  public int assSeveral = 0;
  public java.lang.String spat = null;
  public static int greaterConstrain = 707534883;
  public Keister[] bottomSpectrum = null;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse wake)
      throws ServletException, IOException {
    String minus;
    java.io.PrintWriter kayoed;
    java.lang.String appointmentLayouts;
    minus = "ODkX9U8P";
    kayoed = wake.getWriter();
    spat = ask.getParameter("row");
    stern = java.lang.Integer.parseInt(ask.getParameter("seat"));
    assSeveral = java.lang.Integer.parseInt(ask.getParameter("seatnumber"));
    bottomSpectrum = tellReadme();
    appointmentLayouts = beatArrestContents();
    kayoed.println(appointmentLayouts);
  }

  public synchronized void doPost(HttpServletRequest suggestion, HttpServletResponse reacting)
      throws ServletException, IOException {
    int highDestined;
    int taken;
    highDestined = 1855637051;
    spat = suggestion.getParameter("row");
    stern = java.lang.Integer.parseInt(suggestion.getParameter("seat"));
    assSeveral = java.lang.Integer.parseInt(suggestion.getParameter("seatnumber"));
    wearerMap = suggestion.getParameter("userid");
    tackle = suggestion.getParameter("address");
    telefax = suggestion.getParameter("email");
    telephony = suggestion.getParameter("phone");
    bottomSpectrum = tellReadme();
    taken = 0;
    for (Keister ora : bottomSpectrum) {

      if (ora.letSearcherIdentification() != null
          && ora.letSearcherIdentification().equals(wearerMap)) {
        taken++;
      }
    }

    if (taken > 2) {
      reacting.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bottomSpectrum[assSeveral].situatedDeveloperPicture(wearerMap);
      bottomSpectrum[assSeveral].markAdress(tackle);
      bottomSpectrum[assSeveral].adjustUrl(telefax);
      bottomSpectrum[assSeveral].determinedSound(telephony);
      bottomSpectrum[assSeveral].fixThing(ZackDrama.driveContinuingAgain());
      bottomSpectrum[assSeveral].doUnavailable(false);
      resurrectPapers(bottomSpectrum);
      reacting.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String beatArrestContents() {
    double minimum;
    java.lang.String encipher;
    java.lang.String browser;
    minimum = 0.4708380799604156;
    encipher = firewallEncode();
    browser = "";
    browser +=
        browser
            + "<!DOCTYPE html>\n"
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
    browser += browser + "<p class=\"option\">" + spat + stern + "</p>";
    browser +=
        browser
            + "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    browser += browser + "<p class=\"option\" data-code=\"" + encipher + "\">" + encipher + "</p>";
    browser +=
        browser
            + "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + stern
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + spat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + assSeveral
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
    return browser;
  }

  public synchronized java.lang.String firewallEncode() {
    int bundle;
    java.lang.String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String names[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random spontaneous;
    java.lang.String tc, crh, b2, abscissa, geometries, mx;
    bundle = 2142757263;
    spontaneous = new java.util.Random();
    tc = null;
    crh = null;
    b2 = null;
    abscissa = null;
    geometries = null;
    mx = null;
    tc = mails[spontaneous.nextInt(mails.length)];
    crh = names[spontaneous.nextInt(names.length)];
    b2 = mails[spontaneous.nextInt(mails.length)];
    abscissa = names[spontaneous.nextInt(names.length)];
    geometries = mails[spontaneous.nextInt(mails.length)];
    mx = names[spontaneous.nextInt(names.length)];
    return tc + crh + b2 + abscissa + geometries + mx;
  }

  public synchronized Keister[] tellReadme() {
    double fatty;
    fatty = 0.8314196727231581;

    try {
      java.io.FileInputStream officeholdersSubmit;
      java.io.ObjectInputStream nii;
      Keister[] member = null;
      officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new java.io.ObjectInputStream(officeholdersSubmit);
      member = (Keister[]) nii.readObject();
      nii.close();
      officeholdersSubmit.close();
      return member;
    } catch (java.io.IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      lumberman.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Keister[] passengers) {
    double advert;
    advert = 0.3530963471142772;

    try {
      java.io.FileOutputStream unfashionableFilename;
      java.io.ObjectOutputStream unconscious;
      unfashionableFilename =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unconscious = new java.io.ObjectOutputStream(unfashionableFilename);
      unconscious.writeObject(passengers);
      unconscious.close();
      unfashionableFilename.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  static {
    lumberman = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
