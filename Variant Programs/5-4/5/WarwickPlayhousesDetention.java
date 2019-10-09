import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends HttpServlet {
  private Derriere[] pratBreadth;
  private String course;
  private int buttHandful;
  private int rear;
  private String learnerUser;
  private String headset;
  private String discuss;
  private String electronic;
  private static Logger registrar;

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse reacted)
      throws ServletException, IOException {
    PrintWriter dead = reacted.getWriter();
    course = complaint.getParameter("row");
    rear = Integer.parseInt(complaint.getParameter("seat"));
    buttHandful = Integer.parseInt(complaint.getParameter("seatnumber"));
    pratBreadth = learnRegister();
    String reservingWeb = letRegistrationTab();
    dead.println(reservingWeb);
  }

  public synchronized void doPost(HttpServletRequest asks, HttpServletResponse reactions)
      throws ServletException, IOException {
    course = asks.getParameter("row");
    rear = Integer.parseInt(asks.getParameter("seat"));
    buttHandful = Integer.parseInt(asks.getParameter("seatnumber"));
    learnerUser = asks.getParameter("userid");
    discuss = asks.getParameter("address");
    electronic = asks.getParameter("email");
    headset = asks.getParameter("phone");
    pratBreadth = learnRegister();
    int earmarked = 0;
    for (Derriere fh : pratBreadth) {

      if (fh.goExploiterQuod() != null && fh.goExploiterQuod().equals(learnerUser)) {
        earmarked++;
      }
    }

    if (earmarked > 2) {
      reactions.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      pratBreadth[buttHandful].fixSomeoneSelf(learnerUser);
      pratBreadth[buttHandful].markAdress(discuss);
      pratBreadth[buttHandful].situatedPostal(electronic);
      pratBreadth[buttHandful].determineTelephonic(headset);
      pratBreadth[buttHandful].fitYear(SuppTroupe.becomeTheOpportunity());
      pratBreadth[buttHandful].prepareReady(false);
      protectComplaint(pratBreadth);
      reactions.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String letRegistrationTab() {
    String statute = safeguardingDesignator();
    String bitmap = "";
    bitmap +=
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
    bitmap += "<p class=\"option\">" + course + rear + "</p>";
    bitmap +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    bitmap += "<p class=\"option\" data-code=\"" + statute + "\">" + statute + "</p>";
    bitmap +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + rear
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + course
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
    return bitmap;
  }

  public synchronized String safeguardingDesignator() {
    String words[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportion[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random inadvertent = new Random();
    String densities, acetylcholine, carboxylate, internal, dn, col;
    densities = words[inadvertent.nextInt(words.length)];
    acetylcholine = proportion[inadvertent.nextInt(proportion.length)];
    carboxylate = words[inadvertent.nextInt(words.length)];
    internal = proportion[inadvertent.nextInt(proportion.length)];
    dn = words[inadvertent.nextInt(words.length)];
    col = proportion[inadvertent.nextInt(proportion.length)];
    return densities + acetylcholine + carboxylate + internal + dn + col;
  }

  public synchronized Derriere[] learnRegister() {

    try {
      Derriere[] vacancies;
      FileInputStream immigrationFolder =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nii = new ObjectInputStream(immigrationFolder);
      vacancies = (Derriere[]) nii.readObject();
      nii.close();
      immigrationFolder.close();
      return vacancies;
    } catch (IOException i) {
      registrar.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      registrar.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void protectComplaint(Derriere[] jobs) {

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impermissible = new ObjectOutputStream(impossibleDocuments);
      impermissible.writeObject(jobs);
      impermissible.close();
      impossibleDocuments.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  static {
    registrar = Logger.getLogger("bensTheatre");
  }
}
