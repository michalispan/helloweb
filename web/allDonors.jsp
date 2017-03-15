<%-- 
    Document   : allDonors
    Created on : 13 Μαρ 2017, 2:54:02 μμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Donors</title>
    </head>
    <body>
        <h1>Δωρητές</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>AM</th>
                    <th>Επωνυμο</th>
                    <th>Ονομα</th>
                    <th>Διευθυνση</th>
                    <th>Τηλεφωνο</th>
                    <th>Ομαδα Αιματος</th>
                    <th>Ενέργειες</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${donorlist}" var="donor">
                    <tr>
                        <td><c:out value="${donor.am}" /></td>
                        <td><c:out value="${donor.lastName}" /></td>
                        <td><c:out value="${donor.name}" /></td>
                        <td><c:out value="${donor.address}" /></td>
                        <td><c:out value="${donor.phone}" /></td>
                        <td><c:out value="${donor.bloodType}" /></td>
                        <td><a href="card.jsp">Καρτέλα</a></td>
                        <td><a href="Registration?am=<c:out value="${donor.am}"/>">Επεξεργασία Αιμοδοτη</a></td> 
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="Registration?am=0" >Νέος Αιμοδοτης</a>
    </body>
</html>
