/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-10-01 12:14:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"all\">\r\n");
      out.write("\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <ul class=\"breadcrumb\">\r\n");
      out.write("                        <li><a href=\"#\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>Contact</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"box\" id=\"contact\">\r\n");
      out.write("                        <h1>Contact</h1>\r\n");
      out.write("\r\n");
      out.write("                        <p class=\"lead\">Are you curious about something? Do you have some kind of problem with our products?</p>\r\n");
      out.write("                        <p>Please feel free to contact us, our customer service center is working for you 24/7.</p>\r\n");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <h3><i class=\"fa fa-map-marker\"></i> Address</h3>\r\n");
      out.write("                                <p>13/25 New Avenue\r\n");
      out.write("                                    <br>New Heaven\r\n");
      out.write("                                    <br>45Y 73J\r\n");
      out.write("                                    <br>England\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <strong>Great Britain</strong>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.col-sm-4 -->\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <h3><i class=\"fa fa-phone\"></i> Call center</h3>\r\n");
      out.write("                                <p class=\"text-muted\">This number is toll free if calling from Great Britain otherwise we advise you to use the electronic form of communication.</p>\r\n");
      out.write("                                <p><strong>+33 555 444 333</strong>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.col-sm-4 -->\r\n");
      out.write("                            <div class=\"col-sm-4\">\r\n");
      out.write("                                <h3><i class=\"fa fa-envelope\"></i> Electronic support</h3>\r\n");
      out.write("                                <p class=\"text-muted\">Please feel free to write an email to us or to use our electronic ticketing system.</p>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><strong><a href=\"mailto:\">info@fakeemail.com</a></strong>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><strong><a href=\"#\">Ticketio</a></strong> - our ticketing support platform</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.col-sm-4 -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"map\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <h2>Contact form</h2>\r\n");
      out.write("\r\n");
      out.write("                        <form>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"firstname\">Firstname</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"firstname\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"lastname\">Lastname</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"lastname\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"email\">Email</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"email\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"subject\">Subject</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"subject\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"message\">Message</label>\r\n");
      out.write("                                        <textarea id=\"message\" class=\"form-control\"></textarea>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-sm-12 text-center\">\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\"><i class=\"fa fa-envelope-o\"></i> Send message</button>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.row -->\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col-md-9 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.container -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /#content -->\r\n");
      out.write("<br>\r\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDYszDWwAZ8W9Et6DoGeO7bR-GKaKmtoJU&amp;sensor=false\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function initialize() {\r\n");
      out.write("            var mapOptions = {\r\n");
      out.write("                zoom: 15,\r\n");
      out.write("                center: new google.maps.LatLng(49.1678136, 16.5671893),\r\n");
      out.write("                mapTypeId: google.maps.MapTypeId.ROAD,\r\n");
      out.write("                scrollwheel: false\r\n");
      out.write("            }\r\n");
      out.write("            var map = new google.maps.Map(document.getElementById('map'),\r\n");
      out.write("                mapOptions);\r\n");
      out.write("\r\n");
      out.write("            var myLatLng = new google.maps.LatLng(49.1681989, 16.5650808);\r\n");
      out.write("            var marker = new google.maps.Marker({\r\n");
      out.write("                position: myLatLng,\r\n");
      out.write("                map: map\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        google.maps.event.addDomListener(window, 'load', initialize);\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
