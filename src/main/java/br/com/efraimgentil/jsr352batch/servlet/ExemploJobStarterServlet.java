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

@WebServlet("/iniciarJob")
public class ExemploJobStarterServlet extends HttpServlet {

    private static final long serialVersionUID = 210259608080458589L;
    
    private final String JOB_EMAPLE="exemplo";
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendError( HttpServletResponse.SC_BAD_REQUEST );
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        JobOperator jobOperator =  BatchRuntime.getJobOperator();
        jobOperator.start(JOB_EMAPLE,  new Properties() );
        resp.getWriter().write("OK");
    }
}
