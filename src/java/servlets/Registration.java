/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import db.dbmanager;
import db.Aimodotes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author michael
 */
@WebServlet(name = "Registration", urlPatterns = {"/Registration"})
public class Registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Registration at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        dbmanager dbmanager = new dbmanager();
        int am = Integer.parseInt(request.getParameter("am"));
        String energia = request.getParameter("action");
        Aimodotes donor;
        if (am == 0) {
            donor = new Aimodotes();
            donor.setProsforaList(new ArrayList<>());
        } else {
            donor = dbmanager.getDonor(am);
        }
        String nextJSP;
        if (energia.equals("card")) {
            nextJSP = "/card.jsp";
        } else if (energia.equals("offer"))  {
            nextJSP = "/OfferingBlood.jsp";
        }
          else if (energia.equals("take")){
                    nextJSP = "/ReceiptBlood.jsp";
                    }
         else {
            nextJSP = "/newblooddonor.jsp";
        }
        request.setAttribute("donor", donor);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        dbmanager dbmanager = new dbmanager();
        Aimodotes donor;
        String am = request.getParameter("kodikosAimodoti").trim();
        if (am == null || am.isEmpty() || am.equalsIgnoreCase("0")) {
            donor = new Aimodotes();
        } else {
            donor = dbmanager.getDonor(Integer.parseInt(am.trim()));
        }
//        donor.setAm();
        donor.setLastName(request.getParameter("lastname"));
        donor.setName(request.getParameter("name"));
        donor.setAddress(request.getParameter("address"));
        donor.setPhone(request.getParameter("phonenumber"));
        donor.setBloodType(request.getParameter("omadaAimatos"));

        if (am == null || am.isEmpty() || am.equalsIgnoreCase("0")) {
            dbmanager.createDonor(donor);
        } else {
            dbmanager.updateDonor(donor);
        }

        String nextJSP = "/donorList";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
