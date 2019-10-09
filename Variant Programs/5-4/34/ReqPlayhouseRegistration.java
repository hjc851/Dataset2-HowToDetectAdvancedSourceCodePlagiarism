import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ReqPlayhouseRegistration extends javax.servlet.http.HttpServlet {
  private Prat[] backsideAssortment;
  private java.lang.String squabbling;
  private int keisterRoutine;
  private int tail;
  private java.lang.String searcherIdentification;
  private java.lang.String earpiece;
  private java.lang.String discuss;
  private java.lang.String electronic;
  private static java.util.logging.Logger woodworker;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse responded)
      throws ServletException, IOException {
    java.io.PrintWriter off = responded.getWriter();
    squabbling = petition.getParameter("row");
    tail = java.lang.Integer.parseInt(petition.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(petition.getParameter("seatnumber"));
    backsideAssortment = registerSubmit();
    java.lang.String advanceFootnote = canLogScreen();
    off.println(advanceFootnote);
  }

  public synchronized void doPost(HttpServletRequest quest, HttpServletResponse answer)
      throws ServletException, IOException {
    squabbling = quest.getParameter("row");
    tail = java.lang.Integer.parseInt(quest.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(quest.getParameter("seatnumber"));
    searcherIdentification = quest.getParameter("userid");
    discuss = quest.getParameter("address");
    electronic = quest.getParameter("email");
    earpiece = quest.getParameter("phone");
    backsideAssortment = registerSubmit();
    int logged = 0;
    for (Prat fh : backsideAssortment) synx75(fh, logged);

    if (logged > 2) {
      answer.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      backsideAssortment[keisterRoutine].layUsabilityCard(searcherIdentification);
      backsideAssortment[keisterRoutine].layDeal(discuss);
      backsideAssortment[keisterRoutine].readyMails(electronic);
      backsideAssortment[keisterRoutine].doLaptop(earpiece);
      backsideAssortment[keisterRoutine].primedPeriod(AstonArts.haveCirculatingPeriods());
      backsideAssortment[keisterRoutine].putAccessible(false);
      protectComplaint(backsideAssortment);
      answer.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String canLogScreen() {
    java.lang.String encode = policemenStandards();
    java.lang.String wysiwyg = "";
    wysiwyg +=
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
    wysiwyg += "<p class=\"option\">" + squabbling + tail + "</p>";
    wysiwyg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    wysiwyg += "<p class=\"option\" data-code=\"" + encode + "\">" + encode + "</p>";
    wysiwyg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tail
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabbling
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + keisterRoutine
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

  public synchronized java.lang.String policemenStandards() {
    java.lang.String mailboxes[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String numerals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unselected = new java.util.Random();
    java.lang.String fe, ao, frequencies, correspond, fgf, col;
    fe = mailboxes[unselected.nextInt(mailboxes.length)];
    ao = numerals[unselected.nextInt(numerals.length)];
    frequencies = mailboxes[unselected.nextInt(mailboxes.length)];
    correspond = numerals[unselected.nextInt(numerals.length)];
    fgf = mailboxes[unselected.nextInt(mailboxes.length)];
    col = numerals[unselected.nextInt(numerals.length)];
    return fe + ao + frequencies + correspond + fgf + col;
  }

  public synchronized Prat[] registerSubmit() {

    try {
      Prat[] votes;
      java.io.FileInputStream tenantsDocuments =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream incumbents = new java.io.ObjectInputStream(tenantsDocuments);
      votes = (Prat[]) incumbents.readObject();
      incumbents.close();
      tenantsDocuments.close();
      return votes;
    } catch (java.io.IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      woodworker.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void protectComplaint(Prat[] slots) {

    try {
      java.io.FileOutputStream impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream outgoing = new java.io.ObjectOutputStream(impermissibleArchiving);
      outgoing.writeObject(slots);
      outgoing.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException combatants) {
      combatants.printStackTrace();
    }
  }

  static {
    woodworker = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private synchronized void synx75(Prat fh, int logged) throws ServletException, IOException {

    if (fh.makeUsernameDimidiate() != null
        && fh.makeUsernameDimidiate().equals(searcherIdentification)) {
      logged++;
    }
  }
}
