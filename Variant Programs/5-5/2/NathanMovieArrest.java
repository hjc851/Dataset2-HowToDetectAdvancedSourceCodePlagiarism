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

public class NathanMovieArrest extends javax.servlet.http.HttpServlet {
  static {
    lumberjack = (getLogger("bensTheatre"));
  }

  public synchronized void conserveRegister(Bum[] spaces) {
    double charge;
    charge = (0.483897940065078);

    try {
      java.io.FileOutputStream stunnedFolder;
      java.io.ObjectOutputStream dead;
      stunnedFolder =
          (new java.io.FileOutputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      dead = (new java.io.ObjectOutputStream(stunnedFolder));
      dead.writeObject(spaces);
      dead.close();
      stunnedFolder.close();
    } catch (java.io.IOException post) {
      post.printStackTrace();
    }
  }

  public synchronized Bum[] proofreadComplaint() {
    int identify;
    identify = (1971722490);

    try {
      java.io.FileInputStream detailsSubmitted;
      java.io.ObjectInputStream immigration;
      Bum[] beds = null;
      detailsSubmitted =
          (new java.io.FileInputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      immigration = (new java.io.ObjectInputStream(detailsSubmitted));
      beds = ((Bum[]) immigration.readObject());
      immigration.close();
      detailsSubmitted.close();
      return beds;
    } catch (java.io.IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      lumberjack.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public java.lang.String subscriberHandle = null;

  public synchronized java.lang.String integrityCiphers() {
    double restrictions;
    java.lang.String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String figures[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random spontaneous;
    java.lang.String emf, acetal, lituus, cv, logarithm, d;
    restrictions = (0.6202372645509784);
    spontaneous = (new java.util.Random());
    emf = (null);
    acetal = (null);
    lituus = (null);
    cv = (null);
    logarithm = (null);
    d = (null);
    emf = (mails[spontaneous.nextInt(mails.length)]);
    acetal = (figures[spontaneous.nextInt(figures.length)]);
    lituus = (mails[spontaneous.nextInt(mails.length)]);
    cv = (figures[spontaneous.nextInt(figures.length)]);
    logarithm = (mails[spontaneous.nextInt(mails.length)]);
    d = (figures[spontaneous.nextInt(figures.length)]);
    return (emf + acetal + lituus + cv + logarithm + d);
  }

  public static java.util.logging.Logger lumberjack = null;

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse responds)
      throws ServletException, IOException {
    String pinioned;
    java.io.PrintWriter exterior;
    java.lang.String rearrestLayout;
    pinioned = ("P9bmVqZc4n1");
    exterior = (responds.getWriter());
    succession = (demands.getParameter("row"));
    place = (parseInt(demands.getParameter("seat")));
    fannyCome = (parseInt(demands.getParameter("seatnumber")));
    investRaft = (proofreadComplaint());
    rearrestLayout = (produceLeasingAddendum());
    exterior.println(rearrestLayout);
  }

  public java.lang.String url = null;

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse reactions)
      throws ServletException, IOException {
    String token;
    int reported;
    token = ("cGkTaAzUeI");
    succession = (complaint.getParameter("row"));
    place = (parseInt(complaint.getParameter("seat")));
    fannyCome = (parseInt(complaint.getParameter("seatnumber")));
    subscriberHandle = (complaint.getParameter("userid"));
    accost = (complaint.getParameter("address"));
    url = (complaint.getParameter("email"));
    mobiles = (complaint.getParameter("phone"));
    investRaft = (proofreadComplaint());
    reported = (0);
    for (Bum fh : investRaft) synx5(fh, reported);

    if (reported > 2) {
      reactions.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      investRaft[fannyCome].fixSomeoneSelf(subscriberHandle);
      investRaft[fannyCome].settledDestination(accost);
      investRaft[fannyCome].determinedMail(url);
      investRaft[fannyCome].orderedCaller(mobiles);
      investRaft[fannyCome].determineBeginning(AstonArts.generateUnderwayYear());
      investRaft[fannyCome].putAccessible(false);
      conserveRegister(investRaft);
      reactions.sendRedirect("benstheatre?message=success");
    }
  }

  public Bum[] investRaft = null;
  public int fannyCome = 0;
  static double less = 0.7217042409140645;
  public java.lang.String accost = null;

  public synchronized java.lang.String produceLeasingAddendum() {
    double trammel;
    java.lang.String codification;
    java.lang.String jpeg;
    trammel = (0.6987665123445923);
    codification = (integrityCiphers());
    jpeg = ("");
    jpeg +=
        (jpeg
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
    jpeg += (jpeg + ("<p class=\"option\">" + succession + place + "</p>"));
    jpeg +=
        (jpeg
            + ("</div>\n"
                + "      <div class=\"security\">\n"
                + "        <p class=\"heading\">Security Code:</p>"));
    jpeg +=
        (jpeg
            + ("<p class=\"option\" data-code=\"" + codification + "\">" + codification + "</p>"));
    jpeg +=
        (jpeg
            + ("</div>\n"
                + "\n"
                + "      <form method=\"post\" action=\"./booking\">\n"
                + "        <input type=\"hidden\" name=\"seat\" value=\""
                + place
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"row\" value=\""
                + succession
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
                + fannyCome
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
    return jpeg;
  }

  public java.lang.String succession = null;
  public java.lang.String mobiles = null;
  public int place = 0;

  private synchronized void synx5(Bum fh, int reported) throws ServletException, IOException {

    if (fh.generateConsumerIdem() != null && fh.generateConsumerIdem().equals(subscriberHandle)) {
      reported++;
    }
  }
}
