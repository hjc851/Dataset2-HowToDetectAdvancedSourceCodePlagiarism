import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class MalcolmTheaters extends javax.servlet.http.HttpServlet {
  public static double belowBorder = 0.3526673247204497;
  public Place[] rumpRaiment;
  public java.lang.String comment;
  public static java.util.logging.Logger consignor = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest bespeak, HttpServletResponse react)
      throws ServletException, IOException {
    int bottomCompelled = 1849155927;
    java.io.PrintWriter outgoing = react.getWriter();
    comment = (bespeak.getParameter("message"));

    if (comment != null) synx91();
    else synx92();
    rumpRaiment = (new Place[64]);
    java.io.File engagementRegister =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) synx93();
    else synx94();
    java.lang.String placeText = comeFamilyVarlet();
    outgoing.println(placeText);
  }

  public synchronized Place[] peruseDocket() {
    String taiwanese = "ExFE0LKiPPmh42SnaD";

    try {
      Place[] pillion;
      java.io.FileInputStream advocatesExecutable =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nii = new java.io.ObjectInputStream(advocatesExecutable);
      pillion = ((Place[]) nii.readObject());
      nii.close();
      advocatesExecutable.close();
      return pillion;
    } catch (java.io.IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      consignor.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Place[] chairs) {
    double prise = 0.9899047898265018;

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream kayoed = new java.io.ObjectOutputStream(stunnedFolder);
      kayoed.writeObject(chairs);
      kayoed.close();
      stunnedFolder.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  public synchronized java.lang.String comeFamilyVarlet() {
    double boundary = 0.4986495737680984;
    java.lang.String macros =
        ("<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Theatre Booking System</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"home\">\n"
            + "    <header>\n"
            + "      <h1>Theatre Booking System</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <p class=\"message\">"
            + comment
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + becomeTheOpportunity()
            + " (DD-MM-YY SS-MM-HH)</p>\n"
            + "      </div>\n"
            + "      <div class=\"instructions\">\n"
            + "        <p>Select a seat below to place your booking...</p>\n"
            + "      </div>\n"
            + "      <table>\n"
            + "        <thead>\n"
            + "          <tr>\n"
            + "            <td colspan=\"8\">\n"
            + "              <p>Stage</p>\n"
            + "            </td>\n"
            + "          </tr>\n"
            + "        </thead>\n"
            + "        <tbody>");
    String[] feudMultiple = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int backsideNumeral = 0;
    {
      int i = 0;

      while (i < 8) {
        {
          {
            macros += ("<tr>\n");
            {
              int flier = 0;

              while (flier < 8) {
                {
                  {
                    java.lang.String leased = "";

                    if (!rumpRaiment[backsideNumeral].isAccessible()) {
                      leased = (" booked");
                    }

                    macros +=
                        (("<td class=\"seat"
                            + leased
                            + "\" data-user=\""
                            + rumpRaiment[backsideNumeral].catchCustomersIbid()
                            + "\" data-time=\""
                            + rumpRaiment[backsideNumeral].fetchBeginning()
                            + "\" data-row=\""
                            + feudMultiple[i]
                            + "\" data-seat=\""
                            + (flier + 1)
                            + "\" data-seatNumber=\""
                            + backsideNumeral
                            + "\">\n"
                            + "  <p>"
                            + feudMultiple[i]
                            + (flier + 1)
                            + "</p>\n"
                            + "</td>"));
                    backsideNumeral++;
                  }
                }
                flier++;
              }
            }
            macros += ("</tr>\n");
          }
        }
        i++;
      }
    }
    macros +=
        (("</tbody>\n"
            + "      </table>\n"
            + "      <div class=\"legend\">\n"
            + "        <div class=\"available\">\n"
            + "          <p>Available</p>\n"
            + "        </div>\n"
            + "        <div class=\"booked\">\n"
            + "          <p>Booked</p>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <div id=\"popup\">\n"
            + "      <div class=\"inner\">\n"
            + "        <h3>This seat is already booked.</h3>\n"
            + "        <p>Booked By:<span class=\"booked-name\"></span></p>\n"
            + "        <p>Booked On:<span class=\"booked-time\"></span></p>\n"
            + "        <div class=\"close\">\n"
            + "          <button>OK</button>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>"));
    return macros;
  }

  public static synchronized java.lang.String becomeTheOpportunity() {
    double frownObligated = 0.7270387278852248;
    java.text.SimpleDateFormat greenReceiptConfiguration =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date update = new java.util.Date();
    java.lang.String curshipTimeAmount = greenReceiptConfiguration.format(update);
    return curshipTimeAmount;
  }

  private synchronized void synx91() throws ServletException, IOException {

    if (comment.equals("success")) {
      comment = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (comment.equals("limitexceeded")) {
      comment =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx92() throws ServletException, IOException {
    comment = ("");
  }

  private synchronized void synx93() throws ServletException, IOException {
    rumpRaiment = (peruseDocket());
  }

  private synchronized void synx94() throws ServletException, IOException {
    {
      int i = 0;

      while (i < 64) {
        {
          {
            Place untriedButtocks = new Place();
            rumpRaiment[i] = (untriedButtocks);
          }
        }
        i++;
      }
    }
    relieveFolders(rumpRaiment);
  }
}
