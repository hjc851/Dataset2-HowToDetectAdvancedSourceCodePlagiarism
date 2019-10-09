import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AllanSalleAppointment extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger chainsaw =
      java.util.logging.Logger.getLogger("bensTheatre");
  public java.lang.String mailing;
  public java.lang.String confront;
  public java.lang.String headset;
  public java.lang.String employeePictures;
  public int butt;
  public int rearAmount;
  public java.lang.String squabbling;
  public static final double upstreamBorder = 0.859356551354648;
  public Tail[] hindquartersPalette;

  public synchronized void doGet(HttpServletRequest motions, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    double significance;
    java.io.PrintWriter unconscious;
    java.lang.String ticketingWebpage;
    significance = 0.04494430391472559;
    unconscious = rejoinder.getWriter();
    squabbling = motions.getParameter("row");
    butt = java.lang.Integer.parseInt(motions.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(motions.getParameter("seatnumber"));
    hindquartersPalette = peruseDocket();
    ticketingWebpage = findTicketHomepage();
    unconscious.println(ticketingWebpage);
  }

  public synchronized void doPost(HttpServletRequest petitioning, HttpServletResponse respond)
      throws ServletException, IOException {
    String depressShackled;
    int made;
    depressShackled = "OSG";
    squabbling = petitioning.getParameter("row");
    butt = java.lang.Integer.parseInt(petitioning.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(petitioning.getParameter("seatnumber"));
    employeePictures = petitioning.getParameter("userid");
    confront = petitioning.getParameter("address");
    mailing = petitioning.getParameter("email");
    headset = petitioning.getParameter("phone");
    hindquartersPalette = peruseDocket();
    made = 0;
    for (Tail waffen : hindquartersPalette) synx0(waffen, made);

    if (made > 2) {
      respond.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      hindquartersPalette[rearAmount].fitConsumerIdem(employeePictures);
      hindquartersPalette[rearAmount].rigidTackle(confront);
      hindquartersPalette[rearAmount].putNetmail(mailing);
      hindquartersPalette[rearAmount].orderedCaller(headset);
      hindquartersPalette[rearAmount].prepareNow(EmpCinemas.producePrevalentNow());
      hindquartersPalette[rearAmount].arrangeUncommitted(false);
      helpData(hindquartersPalette);
      respond.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String findTicketHomepage() {
    int hallmark;
    java.lang.String designator;
    java.lang.String metadata;
    hallmark = -1321591463;
    designator = stabilityRules();
    metadata = "";
    metadata +=
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
    metadata += "<p class=\"option\">" + squabbling + butt + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + butt
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabbling
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + rearAmount
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
    return metadata;
  }

  public synchronized java.lang.String stabilityRules() {
    double primal;
    java.lang.String correspondence[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String populations[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random haphazard;
    java.lang.String a0, cc, crh, bt, nb, u;
    primal = 0.7126874281456893;
    haphazard = new java.util.Random();
    a0 = correspondence[haphazard.nextInt(correspondence.length)];
    cc = populations[haphazard.nextInt(populations.length)];
    crh = correspondence[haphazard.nextInt(correspondence.length)];
    bt = populations[haphazard.nextInt(populations.length)];
    nb = correspondence[haphazard.nextInt(correspondence.length)];
    u = populations[haphazard.nextInt(populations.length)];
    return a0 + cc + crh + bt + nb + u;
  }

  public synchronized Tail[] peruseDocket() {
    double threshold;
    threshold = 0.3952070466478651;

    try {
      java.io.FileInputStream detailsSubmitted;
      java.io.ObjectInputStream officeholders;
      Tail[] votes;
      detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      officeholders = new java.io.ObjectInputStream(detailsSubmitted);
      votes = (Tail[]) officeholders.readObject();
      officeholders.close();
      detailsSubmitted.close();
      return votes;
    } catch (java.io.IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      chainsaw.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void helpData(Tail[] member) {
    double central;
    central = 0.3942035527773311;

    try {
      java.io.FileOutputStream backBinder;
      java.io.ObjectOutputStream kayoed;
      backBinder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      kayoed = new java.io.ObjectOutputStream(backBinder);
      kayoed.writeObject(member);
      kayoed.close();
      backBinder.close();
    } catch (java.io.IOException officio) {
      officio.printStackTrace();
    }
  }

  private synchronized void synx0(Tail waffen, int made) throws ServletException, IOException {

    if (waffen.makeUsernameDimidiate() != null
        && waffen.makeUsernameDimidiate().equals(employeePictures)) {
      made++;
    }
  }
}
