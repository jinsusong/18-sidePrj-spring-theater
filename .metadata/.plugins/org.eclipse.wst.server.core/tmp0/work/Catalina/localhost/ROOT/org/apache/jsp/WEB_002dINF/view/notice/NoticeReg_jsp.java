/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-11-08 09:43:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import poly.util.CmmUtil;

public final class NoticeReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("poly.util.CmmUtil");
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

request.setCharacterEncoding("euc-kr");

String SESSION_USER_ID = CmmUtil.nvl((String)session.getAttribute("SESSION_USER_ID"));

      out.write("   \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>게시판 글쓰기</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//로그인 여부 체크\r\n");
      out.write("function doOnload(){\r\n");
      out.write("\tvar user_id = \"");
      out.print(SESSION_USER_ID);
      out.write("\";\r\n");
      out.write("\t\r\n");
      out.write("\tif (user_id==\"\"){\r\n");
      out.write("\t\talert(\"로그인된 사용자만 글을 쓸 수 있습니다.\");\r\n");
      out.write("\t\ttop.location.href=\"/notice/NoticeList.do\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//전송시 유효성 체크\r\n");
      out.write("function doSubmit(f){\r\n");
      out.write("\tif(f.title.value == \"\"){\r\n");
      out.write("\t\talert(\"제목을 입력하시기 바랍니다.\");\r\n");
      out.write("\t\tf.title.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(calBytes(f.title.value) > 200){\r\n");
      out.write("\t\talert(\"최대 200Bytes까지 입력 가능합니다.\");\r\n");
      out.write("\t\tf.title.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar noticeCheck = false; //체크 여부 확인 변수\r\n");
      out.write("\tfor(var i=0;i<f.noticeYn.length;i++){\r\n");
      out.write("\t\tif (f.noticeYn[i].checked){\r\n");
      out.write("\t\t\tnoticeCheck = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(noticeCheck==false){\r\n");
      out.write("\t\talert(\"공지글 여부를 선택하시기 바랍니다.\");\r\n");
      out.write("\t\tf.noticeYn[0].focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\tif(f.contents.value == \"\"){\r\n");
      out.write("\t\talert(\"내용을 입력하시기 바랍니다.\");\r\n");
      out.write("\t\tf.contents.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\tif(calBytes(f.contents.value) > 4000){\r\n");
      out.write("\t\talert(\"최대 4000Bytes까지 입력 가능합니다.\");\r\n");
      out.write("\t\tf.contents.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//글자 길이 바이트 단위로 체크하기(바이트값 전달)\r\n");
      out.write("function calBytes(str){\r\n");
      out.write("\t\r\n");
      out.write("\tvar tcount = 0;\r\n");
      out.write("\tvar tmpStr = new String(str);\r\n");
      out.write("\tvar strCnt = tmpStr.length;\r\n");
      out.write("\r\n");
      out.write("\tvar onechar;\r\n");
      out.write("\tfor (i=0;i<strCnt;i++){\r\n");
      out.write("\t\tonechar = tmpStr.charAt(i);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (escape(onechar).length > 4){\r\n");
      out.write("\t\t\ttcount += 2;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\ttcount += 1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn tcount;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"doOnload();\">\r\n");
      out.write("<form name=\"f\" method=\"post\" action=\"/notice/NoticeInsert.do\" target= \"ifrPrc\" onsubmit=\"return doSubmit(this);\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<col width=\"100px\" />\r\n");
      out.write("\t\t<col width=\"500px\" />\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\">제목</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"title\" maxlength=\"100\" style=\"width: 450px\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\">공지글 여부</td>\r\n");
      out.write("\t\t\t<td>예<input type=\"radio\" name=\"noticeYn\" value=\"1\" />\r\n");
      out.write("\t\t\t        아니오<input type=\"radio\" name=\"noticeYn\" value=\"2\" />\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<textarea name=\"contents\" style=\"width: 550px; height: 400px\"></textarea>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"등록\" />\r\n");
      out.write("\t\t\t<input type=\"reset\" value=\"다시 작성\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- 프로세스 처리용 iframe / form 태그에서 target을 iframe으로 한다. -->\r\n");
      out.write("<iframe name=\"ifrPrc\" style=\"display:none\"></iframe>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
