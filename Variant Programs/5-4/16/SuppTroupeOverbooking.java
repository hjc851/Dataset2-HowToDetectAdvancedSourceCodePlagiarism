import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SuppTroupeOverbooking extends HttpServlet {
  public static Logger forestry = Logger.getLogger("bensTheatre");

  public synchronized void doPost(HttpServletRequest suggestion, HttpServletResponse replies)
      throws ServletException, IOException {
    int accounted;
    succession = suggestion.getParameter("row");
    backside = Integer.parseInt(suggestion.getParameter("seat"));
    placeList = Integer.parseInt(suggestion.getParameter("seatnumber"));
    customersIbid = suggestion.getParameter("userid");
    cover = suggestion.getParameter("address");
    emailed = suggestion.getParameter("email");
    dial = suggestion.getParameter("phone");
    investRaft = sayFolder();
    accounted = 0;
    for (Hindquarters fh : investRaft) {

      if (fh.generateConsumerIdem() != null && fh.generateConsumerIdem().equals(customersIbid)) {
        accounted++;
      }
    }

    if (accounted > 2) {
      replies.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      investRaft[placeList].adjustClientIdentifying(customersIbid);
      investRaft[placeList].prepareConfront(cover);
      investRaft[placeList].determineElectronic(emailed);
      investRaft[placeList].layHeadphone(dial);
      investRaft[placeList].putClock(NathanMovie.fetchPresentBeginning());
      investRaft[placeList].fixDownloadable(false);
      conserveRegister(investRaft);
      replies.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String surveillanceLaws() {
    String memoranda[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String data[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sampling;
    String momenta, acetal, coefficient, cf, finite, ses;
    sampling = new Random();
    momenta = memoranda[sampling.nextInt(memoranda.length)];
    acetal = data[sampling.nextInt(data.length)];
    coefficient = memoranda[sampling.nextInt(memoranda.length)];
    cf = data[sampling.nextInt(data.length)];
    finite = memoranda[sampling.nextInt(memoranda.length)];
    ses = data[sampling.nextInt(data.length)];
    return momenta + acetal + coefficient + cf + finite + ses;
  }

  public int backside;

  public synchronized Hindquarters[] sayFolder() {

    try {
      FileInputStream incumbentsSubmitting;
      ObjectInputStream without;
      Hindquarters[] elections;
      incumbentsSubmitting =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      without = new ObjectInputStream(incumbentsSubmitting);
      elections = (Hindquarters[]) without.readObject();
      without.close();
      incumbentsSubmitting.close();
      return elections;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      forestry.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public String customersIbid;
  public String dial;
  public int placeList;
  public String succession;
  public Hindquarters[] investRaft;

  public synchronized String developRearrestLayout() {
    String encryption;
    String url;
    encryption = surveillanceLaws();
    url = "";
    url +=
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
    url += "<p class=\"option\">" + succession + backside + "</p>";
    url +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    url += "<p class=\"option\" data-code=\"" + encryption + "\">" + encryption + "</p>";
    url +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + backside
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + succession
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
    return url;
  }

  public String emailed;

  public synchronized void conserveRegister(Hindquarters[] spaces) {

    try {
      FileOutputStream deadSubmit;
      ObjectOutputStream unsuccessful;
      deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unsuccessful = new ObjectOutputStream(deadSubmit);
      unsuccessful.writeObject(spaces);
      unsuccessful.close();
      deadSubmit.close();
    } catch (IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public String cover;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse responds)
      throws ServletException, IOException {
    PrintWriter back;
    String gigFolio;
    back = responds.getWriter();
    succession = petition.getParameter("row");
    backside = Integer.parseInt(petition.getParameter("seat"));
    placeList = Integer.parseInt(petition.getParameter("seatnumber"));
    investRaft = sayFolder();
    gigFolio = developRearrestLayout();
    back.println(gigFolio);
  }
}
