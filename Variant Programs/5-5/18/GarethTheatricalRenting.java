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

public class GarethTheatricalRenting extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger lumberjack = getLogger("bensTheatre");
  private java.lang.String emailed;
  private java.lang.String alleviate;
  private java.lang.String headset;
  private java.lang.String customerCaller;
  private int prat;
  private int posteriorAct;
  private java.lang.String spat;
  static final double briEquipment = 0.5106508296973525;
  private Buns[] bunsNumber;

  public synchronized void doGet(HttpServletRequest petitioning, HttpServletResponse reception)
      throws ServletException, IOException {
    int reduceConstrain;
    java.io.PrintWriter unsuccessful;
    java.lang.String detentionAnnexes;
    reduceConstrain = (974254386);
    unsuccessful = (reception.getWriter());
    spat = (petitioning.getParameter("row"));
    prat = (parseInt(petitioning.getParameter("seat")));
    posteriorAct = (parseInt(petitioning.getParameter("seatnumber")));
    bunsNumber = (takeDocument());
    detentionAnnexes = (beatArrestContents());
    unsuccessful.println(detentionAnnexes);
  }

  public synchronized void doPost(
      HttpServletRequest application, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    double lessDestined;
    int arrested;
    lessDestined = (0.031912024040666176);
    spat = (application.getParameter("row"));
    prat = (parseInt(application.getParameter("seat")));
    posteriorAct = (parseInt(application.getParameter("seatnumber")));
    customerCaller = (application.getParameter("userid"));
    alleviate = (application.getParameter("address"));
    emailed = (application.getParameter("email"));
    headset = (application.getParameter("phone"));
    bunsNumber = (takeDocument());
    arrested = (0);
    for (Buns waffen : bunsNumber) {

      if (waffen.arriveClientIdentifying() != null
          && waffen.arriveClientIdentifying().equals(customerCaller)) {
        arrested++;
      }
    }

    if (arrested > 2) {
      responsiveness.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bunsNumber[posteriorAct].determineEmployeePictures(customerCaller);
      bunsNumber[posteriorAct].settledDestination(alleviate);
      bunsNumber[posteriorAct].fixedSending(emailed);
      bunsNumber[posteriorAct].orderedCaller(headset);
      bunsNumber[posteriorAct].determinedDays(GarethTheatrical.canExistingYears());
      bunsNumber[posteriorAct].arrangeUncommitted(false);
      economizeSubmitted(bunsNumber);
      responsiveness.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String beatArrestContents() {
    double amoySize;
    java.lang.String cypher;
    java.lang.String filename;
    amoySize = (0.49967109111482866);
    cypher = (peaceEncodes());
    filename = ("");
    filename +=
        (filename
            + ("<!DOCTYPE html>\n"
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
                + "        <p class=\"heading\">Selected Seat:</p>"));
    filename += (filename + ("<p class=\"option\">" + spat + prat + "</p>"));
    filename +=
        (filename
            + ("</div>\n"
                + "      <div class=\"security\">\n"
                + "        <p class=\"heading\">Security Code:</p>"));
    filename +=
        (filename + ("<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>"));
    filename +=
        (filename
            + ("</div>\n"
                + "\n"
                + "      <form method=\"post\" action=\"./booking\">\n"
                + "        <input type=\"hidden\" name=\"seat\" value=\""
                + prat
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"row\" value=\""
                + spat
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
                + posteriorAct
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
                + "</html>"));
    return filename;
  }

  public synchronized java.lang.String peaceEncodes() {
    int main;
    java.lang.String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String names[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random stray;
    java.lang.String fc, crh, d2, adc, manifold, sw;
    main = (1203375042);
    stray = (new java.util.Random());
    fc = (mails[stray.nextInt(mails.length)]);
    crh = (names[stray.nextInt(names.length)]);
    d2 = (mails[stray.nextInt(mails.length)]);
    adc = (names[stray.nextInt(names.length)]);
    manifold = (mails[stray.nextInt(mails.length)]);
    sw = (names[stray.nextInt(names.length)]);
    return (fc + crh + d2 + adc + manifold + sw);
  }

  public synchronized Buns[] takeDocument() {
    double maximumBreadth;
    maximumBreadth = (0.6705391738226614);

    try {
      java.io.FileInputStream nsiPapers;
      java.io.ObjectInputStream proponents;
      Buns[] votes;
      nsiPapers =
          (new java.io.FileInputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      proponents = (new java.io.ObjectInputStream(nsiPapers));
      votes = ((Buns[]) proponents.readObject());
      proponents.close();
      nsiPapers.close();
      return votes;
    } catch (java.io.IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      lumberjack.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void economizeSubmitted(Buns[] venues) {
    double reduce;
    reduce = (0.4225915640672183);

    try {
      java.io.FileOutputStream quenchedDatabase;
      java.io.ObjectOutputStream outgoing;
      quenchedDatabase =
          (new java.io.FileOutputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      outgoing = (new java.io.ObjectOutputStream(quenchedDatabase));
      outgoing.writeObject(venues);
      outgoing.close();
      quenchedDatabase.close();
    } catch (java.io.IOException libris) {
      libris.printStackTrace();
    }
  }
}
