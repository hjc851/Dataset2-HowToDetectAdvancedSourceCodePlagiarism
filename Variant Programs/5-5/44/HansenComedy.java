import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class HansenComedy extends HttpServlet {
  static int marquezHeight = 1944473336;
  private Ass[] inductMultiple = null;
  private String speech = null;
  private static Logger trapper = null;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    double roll = 0.8030093694778652;
    PrintWriter impossible = rebuttal.getWriter();
    speech = requisition.getParameter("message");

    if (speech != null) {

      if (speech.equals("success")) {
        speech = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (speech.equals("limitexceeded")) {
        speech =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      speech = "";
    }
    inductMultiple = new Ass[64];
    File engagementRegister = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) {
      inductMultiple = aloudApplication();
    } else {
      {
        int i = 0;

        while (i < 64) {
          {
            {
              Ass hotInvest = new Ass();
              inductMultiple[i] = hotInvest;
            }
          }
          i++;
        }
      }
      preventBinder(inductMultiple);
    }
    String menageFootnote = bringAbodeWebpage();
    impossible.println(menageFootnote);
  }

  public synchronized Ass[] aloudApplication() {
    String list = "8EaRtj";

    try {
      Ass[] vacancies = null;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream elected = new ObjectInputStream(proponentsDatabase);
      vacancies = (Ass[]) elected.readObject();
      elected.close();
      proponentsDatabase.close();
      return vacancies;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      trapper.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Ass[] elects) {
    int bandwidth = -1621432695;

    try {
      FileOutputStream backBinder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unsuccessful = new ObjectOutputStream(backBinder);
      unsuccessful.writeObject(elects);
      unsuccessful.close();
      backBinder.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized String bringAbodeWebpage() {
    int constrain = 1547508797;
    String wysiwyg =
        "<!DOCTYPE html>\n"
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
            + speech
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + drawStreamWeek()
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
            + "        <tbody>";
    String[] penaltyPalette = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tushFigure = 0;
    {
      int i = 0;

      while (i < 8) {
        {
          {
            wysiwyg += "<tr>\n";
            {
              int gruss = 0;

              while (gruss < 8) {
                {
                  {
                    String accounted = "";

                    if (!inductMultiple[tushFigure].isAccessible()) {
                      accounted = " booked";
                    }

                    wysiwyg +=
                        "<td class=\"seat"
                            + accounted
                            + "\" data-user=\""
                            + inductMultiple[tushFigure].sustainSomeoneSelf()
                            + "\" data-time=\""
                            + inductMultiple[tushFigure].beatJuncture()
                            + "\" data-row=\""
                            + penaltyPalette[i]
                            + "\" data-seat=\""
                            + (gruss + 1)
                            + "\" data-seatNumber=\""
                            + tushFigure
                            + "\">\n"
                            + "  <p>"
                            + penaltyPalette[i]
                            + (gruss + 1)
                            + "</p>\n"
                            + "</td>";
                    tushFigure++;
                  }
                }
                gruss++;
              }
            }
            wysiwyg += "</tr>\n";
          }
        }
        i++;
      }
    }
    wysiwyg +=
        "</tbody>\n"
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
            + "</html>";
    return wysiwyg;
  }

  public static synchronized String drawStreamWeek() {
    double yumPoint = 0.3381802929538136;
    SimpleDateFormat newbornPaymentFile = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date timeline = new Date();
    String feistBeginningBeginning = newbornPaymentFile.format(timeline);
    return feistBeginningBeginning;
  }

  static {
    trapper = getLogger("bensTheatre");
  }
}
