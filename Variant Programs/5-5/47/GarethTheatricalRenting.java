import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class GarethTheatricalRenting extends javax.servlet.http.HttpServlet {
  public static String hand = "HaABtpMY";
  public Bottom[] tooshiePortfolio;
  public java.lang.String squabble;
  public int placeList;
  public int keister;
  public java.lang.String customersIbid;
  public java.lang.String telephone;
  public java.lang.String confronting;
  public java.lang.String messaging;
  public static java.util.logging.Logger surveyor;

  public synchronized void doGet(HttpServletRequest plea, HttpServletResponse intervention)
      throws ServletException, IOException {
    int namDetail = -160274560;
    java.io.PrintWriter unsuccessful = intervention.getWriter();
    squabble = plea.getParameter("row");
    keister = java.lang.Integer.parseInt(plea.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(plea.getParameter("seatnumber"));
    tooshiePortfolio = reciteSubmitting();
    java.lang.String registrationTab = generateHiringSheet();
    unsuccessful.println(registrationTab);
  }

  public synchronized void doPost(HttpServletRequest asked, HttpServletResponse wake)
      throws ServletException, IOException {
    String integral = "EO91iad7LuRp";
    squabble = asked.getParameter("row");
    keister = java.lang.Integer.parseInt(asked.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(asked.getParameter("seatnumber"));
    customersIbid = asked.getParameter("userid");
    confronting = asked.getParameter("address");
    messaging = asked.getParameter("email");
    telephone = asked.getParameter("phone");
    tooshiePortfolio = reciteSubmitting();
    int rented = 0;
    for (Bottom ora : tooshiePortfolio) {

      if (ora.drawPersonName() != null && ora.drawPersonName().equals(customersIbid)) {
        rented++;
      }
    }

    if (rented > 2) {
      wake.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tooshiePortfolio[placeList].orderedPatientNerfling(customersIbid);
      tooshiePortfolio[placeList].placedDirect(confronting);
      tooshiePortfolio[placeList].readyMails(messaging);
      tooshiePortfolio[placeList].layHeadphone(telephone);
      tooshiePortfolio[placeList].prepareNow(PhillipsAuditorium.driveContinuingAgain());
      tooshiePortfolio[placeList].placedForthcoming(false);
      avertPaperwork(tooshiePortfolio);
      wake.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String generateHiringSheet() {
    int peak = 726310036;
    java.lang.String encodes = protectingEncryption();
    java.lang.String wysiwyg = "";
    wysiwyg +=
        wysiwyg
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
    wysiwyg += wysiwyg + "<p class=\"option\">" + squabble + keister + "</p>";
    wysiwyg +=
        wysiwyg
            + "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    wysiwyg += wysiwyg + "<p class=\"option\" data-code=\"" + encodes + "\">" + encodes + "</p>";
    wysiwyg +=
        wysiwyg
            + "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + keister
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabble
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + placeList
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
    return wysiwyg;
  }

  public synchronized java.lang.String protectingEncryption() {
    int topLimitation = 1118172817;
    java.lang.String mail[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String quantity[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random coincidental = new java.util.Random();
    java.lang.String temperature, c2, coefficient, cp, fgf, d;
    temperature = mail[coincidental.nextInt(mail.length)];
    c2 = quantity[coincidental.nextInt(quantity.length)];
    coefficient = mail[coincidental.nextInt(mail.length)];
    cp = quantity[coincidental.nextInt(quantity.length)];
    fgf = mail[coincidental.nextInt(mail.length)];
    d = quantity[coincidental.nextInt(quantity.length)];
    return temperature + c2 + coefficient + cp + fgf + d;
  }

  public synchronized Bottom[] reciteSubmitting() {
    double leaping = 0.710096874570505;

    try {
      Bottom[] venues;
      java.io.FileInputStream officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsis = new java.io.ObjectInputStream(officeholdersSubmit);
      venues = (Bottom[]) nsis.readObject();
      nsis.close();
      officeholdersSubmit.close();
      return venues;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      surveyor.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Bottom[] elections) {
    int indictment = -2093058306;

    try {
      java.io.FileOutputStream impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream kayoed = new java.io.ObjectOutputStream(impermissibleArchiving);
      kayoed.writeObject(elections);
      kayoed.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException vet) {
      vet.printStackTrace();
    }
  }

  static {
    surveyor = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
