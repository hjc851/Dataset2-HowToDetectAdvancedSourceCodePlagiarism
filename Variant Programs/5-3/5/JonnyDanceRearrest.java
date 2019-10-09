import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JonnyDanceRearrest extends HttpServlet {
  private Hindquarters[] bunsNumber;
  private String spat;
  private int sitTotal;
  private int tooshie;
  private String searcherIdentification;
  private String headset;
  private String confronting;
  private String send;
  private static Logger homesteader;

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    PrintWriter dead = rebuttal.getWriter();
    spat = appeals.getParameter("row");
    tooshie = Integer.parseInt(appeals.getParameter("seat"));
    sitTotal = Integer.parseInt(appeals.getParameter("seatnumber"));
    bunsNumber = understandCharge();
    String reservationsWebsite = letRegistrationTab();
    dead.println(reservationsWebsite);
  }

  public synchronized void doPost(HttpServletRequest asking, HttpServletResponse riposte)
      throws ServletException, IOException {
    spat = asking.getParameter("row");
    tooshie = Integer.parseInt(asking.getParameter("seat"));
    sitTotal = Integer.parseInt(asking.getParameter("seatnumber"));
    searcherIdentification = asking.getParameter("userid");
    confronting = asking.getParameter("address");
    send = asking.getParameter("email");
    headset = asking.getParameter("phone");
    bunsNumber = understandCharge();
    int accounted = 0;
    for (Hindquarters fh : bunsNumber) {

      if (fh.sustainSomeoneSelf() != null
          && fh.sustainSomeoneSelf().equals(searcherIdentification)) {
        accounted++;
      }
    }

    if (accounted > 2) {
      riposte.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bunsNumber[sitTotal].prepareWearerMap(searcherIdentification);
      bunsNumber[sitTotal].laidSpeak(confronting);
      bunsNumber[sitTotal].fixDissemination(send);
      bunsNumber[sitTotal].bentDial(headset);
      bunsNumber[sitTotal].primedPeriod(JamalProductions.comeLatestClip());
      bunsNumber[sitTotal].placeDisposable(false);
      helpData(bunsNumber);
      riposte.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String letRegistrationTab() {
    String law = guardingEncrypt();
    String xml = "";
    xml +=
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
    xml += "<p class=\"option\">" + spat + tooshie + "</p>";
    xml +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    xml += "<p class=\"option\" data-code=\"" + law + "\">" + law + "</p>";
    xml +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tooshie
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + spat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + sitTotal
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
    return xml;
  }

  public synchronized String guardingEncrypt() {
    String correspondence[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String scores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random occasional = new Random();
    String emf, crh, carboxylate, bt, fgf, cp;
    emf = correspondence[occasional.nextInt(correspondence.length)];
    crh = scores[occasional.nextInt(scores.length)];
    carboxylate = correspondence[occasional.nextInt(correspondence.length)];
    bt = scores[occasional.nextInt(scores.length)];
    fgf = correspondence[occasional.nextInt(correspondence.length)];
    cp = scores[occasional.nextInt(scores.length)];
    return emf + crh + carboxylate + bt + fgf + cp;
  }

  public synchronized Hindquarters[] understandCharge() {

    try {
      Hindquarters[] constituencies;
      FileInputStream tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nsi = new ObjectInputStream(tenantsDocuments);
      constituencies = (Hindquarters[]) nsi.readObject();
      nsi.close();
      tenantsDocuments.close();
      return constituencies;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      homesteader.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void helpData(Hindquarters[] elections) {

    try {
      FileOutputStream extinctComplaint =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinct = new ObjectOutputStream(extinctComplaint);
      extinct.writeObject(elections);
      extinct.close();
      extinctComplaint.close();
    } catch (IOException late) {
      late.printStackTrace();
    }
  }

  static {
    homesteader = Logger.getLogger("bensTheatre");
  }
}
