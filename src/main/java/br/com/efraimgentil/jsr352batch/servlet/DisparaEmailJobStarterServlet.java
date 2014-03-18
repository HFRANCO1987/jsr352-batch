package br.com.efraimgentil.jsr352batch.servlet;

import java.io.IOException;
import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Efraim Gentil (efraim.gentil@gmail.com)
 */
@WebServlet("/disparar-emails")
public class DisparaEmailJobStarterServlet extends HttpServlet {

    private static final long serialVersionUID = -4401460464470771762L;
    
    private final String JOB="emailJob";
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("disparar-emails.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("DISPARAR EMAILS");
        JobOperator jobOperator =  BatchRuntime.getJobOperator();
        jobOperator.start(JOB,  new Properties() );
        super.doPost(req, resp);
    }

}
