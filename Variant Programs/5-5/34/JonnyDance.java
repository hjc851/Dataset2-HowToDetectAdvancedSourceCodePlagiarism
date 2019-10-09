import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class JonnyDance extends javax.servlet.http.HttpServlet {
  private static final String synX4164String = "bensTheatre";
  private static final String synX4163String = "dd-MM-YY ss-MM-HH";
  private static final int synX4162int = 336298121;
  private static final String synX4161String = "</html>";
  private static final String synX4160String = "  </body>\t\n";
  private static final String synX4159String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4158String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4157String = "    </div>\n";
  private static final String synX4156String = "      </div>\n";
  private static final String synX4155String = "        </div>\n";
  private static final String synX4154String = "          <button>OK</button>\n";
  private static final String synX4153String = "        <div class=\"close\">\n";
  private static final String synX4152String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX4151String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX4150String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX4149String = "      <div class=\"inner\">\n";
  private static final String synX4148String = "    <div id=\"popup\">\n";
  private static final String synX4147String = "    </footer>\n";
  private static final String synX4146String = "      </div>\n";
  private static final String synX4145String = "        <p>c3063467</p>\n";
  private static final String synX4144String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4143String = "      <div class=\"author\">\n";
  private static final String synX4142String = "    <footer>\n";
  private static final String synX4141String = "    </article>\n";
  private static final String synX4140String = "      </div>\n";
  private static final String synX4139String = "        </div>\n";
  private static final String synX4138String = "          <p>Booked</p>\n";
  private static final String synX4137String = "        <div class=\"booked\">\n";
  private static final String synX4136String = "        </div>\n";
  private static final String synX4135String = "          <p>Available</p>\n";
  private static final String synX4134String = "        <div class=\"available\">\n";
  private static final String synX4133String = "      <div class=\"legend\">\n";
  private static final String synX4132String = "      </table>\n";
  private static final String synX4131String = "</tbody>\n";
  private static final String synX4130String = "</tr>\n";
  private static final String synX4129String = "</td>";
  private static final String synX4128String = "</p>\n";
  private static final int synX4127int = 1;
  private static final String synX4126String = "  <p>";
  private static final String synX4125String = "\">\n";
  private static final String synX4124String = "\" data-seatNumber=\"";
  private static final int synX4123int = 1;
  private static final String synX4122String = "\" data-seat=\"";
  private static final String synX4121String = "\" data-row=\"";
  private static final String synX4120String = "\" data-time=\"";
  private static final String synX4119String = "\" data-user=\"";
  private static final String synX4118String = "<td class=\"seat";
  private static final String synX4117String = " booked";
  private static final String synX4116String = "";
  private static final int synX4115int = 8;
  private static final int synX4114int = 0;
  private static final String synX4113String = "<tr>\n";
  private static final int synX4112int = 8;
  private static final int synX4111int = 0;
  private static final int synX4110int = 0;
  private static final String synX4109String = "H";
  private static final String synX4108String = "G";
  private static final String synX4107String = "F";
  private static final String synX4106String = "E";
  private static final String synX4105String = "D";
  private static final String synX4104String = "C";
  private static final String synX4103String = "B";
  private static final String synX4102String = "A";
  private static final String synX4101String = "        <tbody>";
  private static final String synX4100String = "        </thead>\n";
  private static final String synX4099String = "          </tr>\n";
  private static final String synX4098String = "            </td>\n";
  private static final String synX4097String = "              <p>Stage</p>\n";
  private static final String synX4096String = "            <td colspan=\"8\">\n";
  private static final String synX4095String = "          <tr>\n";
  private static final String synX4094String = "        <thead>\n";
  private static final String synX4093String = "      <table>\n";
  private static final String synX4092String = "      </div>\n";
  private static final String synX4091String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX4090String = "      <div class=\"instructions\">\n";
  private static final String synX4089String = "      </div>\n";
  private static final String synX4088String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX4087String = "        <p>";
  private static final String synX4086String = "      <div class=\"time\">\n";
  private static final String synX4085String = "      <h2>Seats</h2>\n";
  private static final String synX4084String = "</p>\n";
  private static final String synX4083String = "      <p class=\"message\">";
  private static final String synX4082String = "    <article>\n";
  private static final String synX4081String = "    </header>\n";
  private static final String synX4080String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX4079String = "    <header>\n";
  private static final String synX4078String = "  <body class=\"home\">\n";
  private static final String synX4077String = "  </head>\n";
  private static final String synX4076String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4075String = "    <![endif]-->\n";
  private static final String synX4074String = "      </script>\n";
  private static final String synX4073String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4072String = "    <!--[if IE]>\n";
  private static final String synX4071String = "    <title>Theatre Booking System</title>\n";
  private static final String synX4070String = "    <meta charset=utf-8>\n";
  private static final String synX4069String = "  <head>\n";
  private static final String synX4068String = "<html lang=\"en\">\n";
  private static final String synX4067String = "<!DOCTYPE html>\n";
  private static final double synX4066double = 0.9295567843920046;
  private static final String synX4065String = "/WEB-INF/bookingData.ser";
  private static final double synX4064double = 0.11060483846257352;
  private static final String synX4063String = "/WEB-INF/bookingData.ser";
  private static final double synX4062double = 0.8385983374658663;
  private static final int synX4061int = 64;
  private static final int synX4060int = 0;
  private static final String synX4059String = "/WEB-INF/bookingData.ser";
  private static final int synX4058int = 64;
  private static final String synX4057String = "";
  private static final String synX4056String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX4055String = "limitexceeded";
  private static final String synX4054String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX4053String = "success";
  private static final String synX4052String = "message";
  private static final int synX4051int = 1423627621;
  public static final int reducedMaximum = -48062780;
  private Behind[] pratBreadth;
  private java.lang.String speech;
  private static java.util.logging.Logger sawmill;

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse riposte)
      throws ServletException, IOException {
    int bestAmount = synX4051int;
    java.io.PrintWriter proscribed = riposte.getWriter();
    speech = (quest.getParameter(synX4052String));

    if (speech != null) {

      if (speech.equals(synX4053String)) {
        speech = (synX4054String);
      } else if (speech.equals(synX4055String)) {
        speech = (synX4056String);
      }

    } else {
      speech = (synX4057String);
    }
    pratBreadth = (new Behind[synX4058int]);
    java.io.File ticketingCharge =
        new java.io.File(getServletContext().getRealPath(synX4059String));

    if (ticketingCharge.exists()) {
      pratBreadth = (quoteData());
    } else {
      {
        int i = synX4060int;

        while (i < synX4061int) {
          {
            {
              Behind newlyRear = new Behind();
              pratBreadth[i] = (newlyRear);
            }
          }
          i++;
        }
      }
      protectComplaint(pratBreadth);
    }
    java.lang.String abodeWebpage = catchDomesticSummary();
    proscribed.println(abodeWebpage);
  }

  public synchronized Behind[] quoteData() {
    double isterWidening = synX4062double;

    try {
      Behind[] elections;
      java.io.FileInputStream nsiPapers =
          new java.io.FileInputStream(getServletContext().getRealPath(synX4063String));
      java.io.ObjectInputStream nih = new java.io.ObjectInputStream(nsiPapers);
      elections = ((Behind[]) nih.readObject());
      nih.close();
      nsiPapers.close();
      return elections;
    } catch (java.io.IOException i) {
      sawmill.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      sawmill.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void protectComplaint(Behind[] jobs) {
    double pinioned = synX4064double;

    try {
      java.io.FileOutputStream backBinder =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX4065String));
      java.io.ObjectOutputStream unconscious = new java.io.ObjectOutputStream(backBinder);
      unconscious.writeObject(jobs);
      unconscious.close();
      backBinder.close();
    } catch (java.io.IOException con) {
      con.printStackTrace();
    }
  }

  public synchronized java.lang.String catchDomesticSummary() {
    double distinguish = synX4066double;
    java.lang.String ajax =
        (synX4067String
            + synX4068String
            + synX4069String
            + synX4070String
            + synX4071String
            + synX4072String
            + synX4073String
            + synX4074String
            + synX4075String
            + synX4076String
            + synX4077String
            + synX4078String
            + synX4079String
            + synX4080String
            + synX4081String
            + synX4082String
            + synX4083String
            + speech
            + synX4084String
            + synX4085String
            + synX4086String
            + synX4087String
            + developPreviousHour()
            + synX4088String
            + synX4089String
            + synX4090String
            + synX4091String
            + synX4092String
            + synX4093String
            + synX4094String
            + synX4095String
            + synX4096String
            + synX4097String
            + synX4098String
            + synX4099String
            + synX4100String
            + synX4101String);
    String[] wordsFinery = {
      synX4102String,
      synX4103String,
      synX4104String,
      synX4105String,
      synX4106String,
      synX4107String,
      synX4108String,
      synX4109String
    };
    int canQuantity = synX4110int;
    {
      int i = synX4111int;

      while (i < synX4112int) {
        {
          {
            ajax += (ajax + synX4113String);
            {
              int flier = synX4114int;

              while (flier < synX4115int) {
                {
                  {
                    java.lang.String arranged = synX4116String;

                    if (!pratBreadth[canQuantity].isAccessible()) {
                      arranged = (synX4117String);
                    }

                    ajax +=
                        (ajax
                            + (synX4118String
                                + arranged
                                + synX4119String
                                + pratBreadth[canQuantity].letSearcherIdentification()
                                + synX4120String
                                + pratBreadth[canQuantity].driveAgain()
                                + synX4121String
                                + wordsFinery[i]
                                + synX4122String
                                + (flier + synX4123int)
                                + synX4124String
                                + canQuantity
                                + synX4125String
                                + synX4126String
                                + wordsFinery[i]
                                + (flier + synX4127int)
                                + synX4128String
                                + synX4129String));
                    canQuantity++;
                  }
                }
                flier++;
              }
            }
            ajax += (ajax + synX4130String);
          }
        }
        i++;
      }
    }
    ajax +=
        (ajax
            + (synX4131String
                + synX4132String
                + synX4133String
                + synX4134String
                + synX4135String
                + synX4136String
                + synX4137String
                + synX4138String
                + synX4139String
                + synX4140String
                + synX4141String
                + synX4142String
                + synX4143String
                + synX4144String
                + synX4145String
                + synX4146String
                + synX4147String
                + synX4148String
                + synX4149String
                + synX4150String
                + synX4151String
                + synX4152String
                + synX4153String
                + synX4154String
                + synX4155String
                + synX4156String
                + synX4157String
                + synX4158String
                + synX4159String
                + synX4160String
                + synX4161String));
    return ajax;
  }

  public static synchronized java.lang.String developPreviousHour() {
    int atkinsAppliances = synX4162int;
    java.text.SimpleDateFormat modernSeeLayouts = new java.text.SimpleDateFormat(synX4163String);
    java.util.Date year = new java.util.Date();
    java.lang.String terriNotificationAgain = modernSeeLayouts.format(year);
    return terriNotificationAgain;
  }

  static {
    sawmill = (getLogger(synX4164String));
  }
}
