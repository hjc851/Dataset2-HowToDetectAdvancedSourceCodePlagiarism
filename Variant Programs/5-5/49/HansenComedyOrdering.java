import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class HansenComedyOrdering extends HttpServlet {
  static String profitability = "UZtcMX";
  public Hindquarters[] sternArsenal = null;
  public String dispute = null;
  public int assSeveral = 0;
  public int bum = 0;
  public String visitorOwnership = null;
  public String headphone = null;
  public String answer = null;
  public String courier = null;
  public static Logger trapper = null;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse wake)
      throws ServletException, IOException {
    double infernalCertain = 0.10041601001574363;
    PrintWriter proscribed = wake.getWriter();
    dispute = (requisition.getParameter("row"));
    bum = (Integer.parseInt(requisition.getParameter("seat")));
    assSeveral = (Integer.parseInt(requisition.getParameter("seatnumber")));
    sternArsenal = (rereadSubmitted());
    String rentalSite = generateHiringSheet();
    proscribed.println(rentalSite);
  }

  public synchronized void doPost(HttpServletRequest appeal, HttpServletResponse reactions)
      throws ServletException, IOException {
    String numeration = "BvuXaAP9nVxrfB6";
    dispute = (appeal.getParameter("row"));
    bum = (Integer.parseInt(appeal.getParameter("seat")));
    assSeveral = (Integer.parseInt(appeal.getParameter("seatnumber")));
    visitorOwnership = (appeal.getParameter("userid"));
    answer = (appeal.getParameter("address"));
    courier = (appeal.getParameter("email"));
    headphone = (appeal.getParameter("phone"));
    sternArsenal = (rereadSubmitted());
    int reserved = 0;
    for (Hindquarters waffen : sternArsenal) synx165(waffen, reserved);

    if (reserved > 2) {
      reactions.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      sternArsenal[assSeveral].adjustClientIdentifying(visitorOwnership);
      sternArsenal[assSeveral].orderedRectify(answer);
      sternArsenal[assSeveral].rigidCouriers(courier);
      sternArsenal[assSeveral].putTelephone(headphone);
      sternArsenal[assSeveral].situatedMinutes(AstonArts.becomeTheOpportunity());
      sternArsenal[assSeveral].placeDisposable(false);
      shaveArchives(sternArsenal);
      reactions.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String generateHiringSheet() {
    String greaterConstrain = "hPkwXAl4G";
    String designator = confidentialityEncoding();
    String firefox = "";
    firefox +=
        (firefox
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
    firefox += (firefox + ("<p class=\"option\">" + dispute + bum + "</p>"));
    firefox +=
        (firefox
            + ("</div>\n"
                + "      <div class=\"security\">\n"
                + "        <p class=\"heading\">Security Code:</p>"));
    firefox +=
        (firefox + ("<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>"));
    firefox +=
        (firefox
            + ("</div>\n"
                + "\n"
                + "      <form method=\"post\" action=\"./booking\">\n"
                + "        <input type=\"hidden\" name=\"seat\" value=\""
                + bum
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"row\" value=\""
                + dispute
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
                + "</html>"));
    return firefox;
  }

  public synchronized String confidentialityEncoding() {
    String kilogram = "cqlVVRFBWy";
    String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random indiscriminate = new Random();
    String temperature = null,
        activating = null,
        amplitude = null,
        act = null,
        logarithm = null,
        cp = null;
    temperature = (mails[indiscriminate.nextInt(mails.length)]);
    activating = (population[indiscriminate.nextInt(population.length)]);
    amplitude = (mails[indiscriminate.nextInt(mails.length)]);
    act = (population[indiscriminate.nextInt(population.length)]);
    logarithm = (mails[indiscriminate.nextInt(mails.length)]);
    cp = (population[indiscriminate.nextInt(population.length)]);
    return (temperature + activating + amplitude + act + logarithm + cp);
  }

  public synchronized Hindquarters[] rereadSubmitted() {
    double less = 0.1514792387780236;

    try {
      Hindquarters[] member = null;
      FileInputStream immigrationFolder =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(immigrationFolder);
      member = ((Hindquarters[]) tenants.readObject());
      tenants.close();
      immigrationFolder.close();
      return member;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      trapper.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void shaveArchives(Hindquarters[] members) {
    String secondRestricted = "ihvbd5EIJEFVhm7oXzN";

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream exterior = new ObjectOutputStream(outgoingArchives);
      exterior.writeObject(members);
      exterior.close();
      outgoingArchives.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }

  static {
    trapper = (Logger.getLogger("bensTheatre"));
  }

  private synchronized void synx165(Hindquarters waffen, int reserved)
      throws ServletException, IOException {

    if (waffen.takeUsageFinger() != null && waffen.takeUsageFinger().equals(visitorOwnership)) {
      reserved++;
    }
  }
}
