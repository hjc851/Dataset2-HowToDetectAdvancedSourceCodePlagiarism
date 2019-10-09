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

public class ZackDramaRegister extends HttpServlet {
  public static Logger fisherman;
  public String mails;
  public String handle;
  public String mobiles;
  public String customerCaller;
  public int backside;
  public int inductBit;
  public String ranking;
  public Prat[] tailMultiplicity;

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse feedback)
      throws ServletException, IOException {
    PrintWriter outer;
    String hiringSheet;
    outer = (feedback.getWriter());
    ranking = (demands.getParameter("row"));
    backside = (parseInt(demands.getParameter("seat")));
    inductBit = (parseInt(demands.getParameter("seatnumber")));
    tailMultiplicity = (showDocumentation());
    hiringSheet = (drawAdvanceFootnote());
    outer.println(hiringSheet);
  }

  public synchronized void doPost(HttpServletRequest quest, HttpServletResponse respond)
      throws ServletException, IOException {
    int reported;
    ranking = (quest.getParameter("row"));
    backside = (parseInt(quest.getParameter("seat")));
    inductBit = (parseInt(quest.getParameter("seatnumber")));
    customerCaller = (quest.getParameter("userid"));
    handle = (quest.getParameter("address"));
    mails = (quest.getParameter("email"));
    mobiles = (quest.getParameter("phone"));
    tailMultiplicity = (showDocumentation());
    reported = (0);
    for (Prat ora : tailMultiplicity) synx40(ora, reported);

    if (reported > 2) {
      respond.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tailMultiplicity[inductBit].fixSomeoneSelf(customerCaller);
      tailMultiplicity[inductBit].primedAccost(handle);
      tailMultiplicity[inductBit].determineElectronic(mails);
      tailMultiplicity[inductBit].settledLandline(mobiles);
      tailMultiplicity[inductBit].placedWhen(HansenComedy.arriveFlowMonth());
      tailMultiplicity[inductBit].orderedGetable(false);
      relieveFolders(tailMultiplicity);
      respond.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String drawAdvanceFootnote() {
    String prefix;
    String pdf;
    prefix = (secureLaw());
    pdf = ("");
    pdf +=
        (pdf
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
    pdf += (pdf + ("<p class=\"option\">" + ranking + backside + "</p>"));
    pdf +=
        (pdf
            + ("</div>\n"
                + "      <div class=\"security\">\n"
                + "        <p class=\"heading\">Security Code:</p>"));
    pdf += (pdf + ("<p class=\"option\" data-code=\"" + prefix + "\">" + prefix + "</p>"));
    pdf +=
        (pdf
            + ("</div>\n"
                + "\n"
                + "      <form method=\"post\" action=\"./booking\">\n"
                + "        <input type=\"hidden\" name=\"seat\" value=\""
                + backside
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"row\" value=\""
                + ranking
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
                + "</html>"));
    return pdf;
  }

  public synchronized String secureLaw() {
    String correspondences[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random occasional;
    String fc, cc, betas, c1, ip, mx;
    occasional = (new Random());
    fc = (correspondences[occasional.nextInt(correspondences.length)]);
    cc = (estimates[occasional.nextInt(estimates.length)]);
    betas = (correspondences[occasional.nextInt(correspondences.length)]);
    c1 = (estimates[occasional.nextInt(estimates.length)]);
    ip = (correspondences[occasional.nextInt(correspondences.length)]);
    mx = (estimates[occasional.nextInt(estimates.length)]);
    return (fc + cc + betas + c1 + ip + mx);
  }

  public synchronized Prat[] showDocumentation() {

    try {
      FileInputStream tenantsDocuments;
      ObjectInputStream tenants;
      Prat[] stools;
      tenantsDocuments =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      tenants = (new ObjectInputStream(tenantsDocuments));
      stools = ((Prat[]) tenants.readObject());
      tenants.close();
      tenantsDocuments.close();
      return stools;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      fisherman.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Prat[] elects) {

    try {
      FileOutputStream unsuccessfulFolders;
      ObjectOutputStream quenched;
      unsuccessfulFolders =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      quenched = (new ObjectOutputStream(unsuccessfulFolders));
      quenched.writeObject(elects);
      quenched.close();
      unsuccessfulFolders.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }

  static {
    fisherman = (getLogger("bensTheatre"));
  }

  private synchronized void synx40(Prat ora, int reported) throws ServletException, IOException {

    if (ora.bringCustomerCaller() != null && ora.bringCustomerCaller().equals(customerCaller)) {
      reported++;
    }
  }
}
