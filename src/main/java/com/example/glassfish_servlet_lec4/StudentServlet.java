package com.example.glassfish_servlet_lec4;

import com.example.glassfish_servlet_lec4.utils.StudentUtil;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="studentServlet", value = "/student-servlet")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //   super.doPost(req, resp);
        String first_name = req.getParameter("first_name");
        String last_name = req.getParameter("last_name");
        int age = Integer.parseInt(req.getParameter("age"));

//        String first_name="ee", last_name="ll";
     //   int age=25;
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        writer.print("<html>");
        writer.print("<head>");
        writer.print("<title>JSP - hello world</title>");
        writer.print("</head>");

        writer.print("<body>");
        writer.print("<p>"+first_name+"</p>");
        writer.print("<p>"+last_name+"</p>");
        writer.print("<p>"+age+"</p>");
        writer.print("</body>");


        writer.print("</html>");

        writer.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        String first_name = req.getParameter("first_name");
        String last_name = req.getParameter("last_name");
        int age = Integer.parseInt(req.getParameter("age"));

       // resp.setContentType("text/html");

//        PrintWriter writer = resp.getWriter();
//
//        writer.print(first_name);
//        writer.print(last_name);
//        writer.print(age);
//        writer.close();

        Gson gson = new Gson();
        String studentJason =  gson.toJson(StudentUtil.getTestStudent(first_name, last_name, age));

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().print(studentJason);
        resp.getWriter().close();

    }
//lec4 > lifecycle > package orjer dawkapeba
}
