import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JamalProductionsHiring extends javax.servlet.http.HttpServlet {
  static final double highDestined = 0.9119921407047034;
  private Hindquarters[] sitRegalia = null;
  private java.lang.String rack = null;
  private int buttHandful = 0;
  private int butt = 0;
  private java.lang.String patientNerfling = null;
  private java.lang.String call = null;
  private java.lang.String discuss = null;
  private java.lang.String telefax = null;
  private static java.util.logging.Logger trapper = null;

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse explanation)
      throws ServletException, IOException {
    String rolled = "Ud8zNxP2sFoR5WY6";
    java.io.PrintWriter outer = explanation.getWriter();
    rack = insistence.getParameter("row");
    butt = java.lang.Integer.parseInt(insistence.getParameter("seat"));
    buttHandful = java.lang.Integer.parseInt(insistence.getParameter("seatnumber"));
    sitRegalia = translateDocuments();
    java.lang.String ticketingWebpage = becomeVenueFront();
    outer.println(ticketingWebpage);
  }

  public synchronized void doPost(HttpServletRequest quest, HttpServletResponse replies)
      throws ServletException, IOException {
    double tonality = 0.4344057752336856;
    rack = quest.getParameter("row");
    butt = java.lang.Integer.parseInt(quest.getParameter("seat"));
    buttHandful = java.lang.Integer.parseInt(quest.getParameter("seatnumber"));
    patientNerfling = quest.getParameter("userid");
    discuss = quest.getParameter("address");
    telefax = quest.getParameter("email");
    call = quest.getParameter("phone");
    sitRegalia = translateDocuments();
    int purchased = 0;
    for (Hindquarters waffen : sitRegalia) {

      if (waffen.letSearcherIdentification() != null
          && waffen.letSearcherIdentification().equals(patientNerfling)) {
        purchased++;
      }
    }

    if (purchased > 2) {
      replies.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      sitRegalia[buttHandful].solidifyingLearnerUser(patientNerfling);
      sitRegalia[buttHandful].fixedResolve(discuss);
      sitRegalia[buttHandful].adjustUrl(telefax);
      sitRegalia[buttHandful].adjustPayphone(call);
      sitRegalia[buttHandful].placedWhen(SuppTroupe.startPresentlyMinutes());
      sitRegalia[buttHandful].orderedGetable(false);
      redeemDocuments(sitRegalia);
      replies.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String becomeVenueFront() {
    String wide = "okCvcTKrdGc9Vt";
    java.lang.String guideline = peaceEncodes();
    java.lang.String plugin = "";
    plugin +=
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
    plugin += "<p class=\"option\">" + rack + butt + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + guideline + "\">" + guideline + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + butt
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + rack
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + buttHandful
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
    return plugin;
  }

  public synchronized java.lang.String peaceEncodes() {
    String depressShackled = "f1wltNVsg1DfU";
    java.lang.String cards[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String percentages[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random selective = new java.util.Random();
    java.lang.String density = null,
        carboxylate = null,
        robot = null,
        b = null,
        finite = null,
        r6 = null;
    density = cards[selective.nextInt(cards.length)];
    carboxylate = percentages[selective.nextInt(percentages.length)];
    robot = cards[selective.nextInt(cards.length)];
    b = percentages[selective.nextInt(percentages.length)];
    finite = cards[selective.nextInt(cards.length)];
    r6 = percentages[selective.nextInt(percentages.length)];
    return density + carboxylate + robot + b + finite + r6;
  }

  public synchronized Hindquarters[] translateDocuments() {
    double bound = 0.9154382802949064;

    try {
      Hindquarters[] stools = null;
      java.io.FileInputStream detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream cbs = new java.io.ObjectInputStream(detailsSubmitted);
      stools = (Hindquarters[]) cbs.readObject();
      cbs.close();
      detailsSubmitted.close();
      return stools;
    } catch (java.io.IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      trapper.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void redeemDocuments(Hindquarters[] venues) {
    String thresholds = "4K3clF";

    try {
      java.io.FileOutputStream tabooApplication =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unsuccessful = new java.io.ObjectOutputStream(tabooApplication);
      unsuccessful.writeObject(venues);
      unsuccessful.close();
      tabooApplication.close();
    } catch (java.io.IOException abel) {
      abel.printStackTrace();
    }
  }

  static {
    trapper = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
