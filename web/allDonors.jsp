<%-- 
    Document   : allDonors
    Created on : 13 Μαρ 2017, 2:54:02 μμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Donors</title>
    </head>
    <body>
        <h1>Δωρητές</h1>
        <table style="width:50%">
            <tr>
                <th>AM</th>
                <th>Επωνυμο</th>
                <th>Ονομα</th>
                <th>Διευθυνση</th>
                <th>Τηλεφωνο</th>
                <th>Ομαδα Αιματος</th>
            </tr>
            <c: foreach items="${donorlist}" var="donor">
            <tr>
                <td><c:out value="{donor.am}" /></td>
                <td><c:out value="{donor.lastname}" /></td>
                <td><c:out value="{donor.name}" /></td>
                <td><c:out value="{donor.address}" /></td>
                <td><c:out value="{donor.phone}" /></td>
                <td><c:out value="{donor.bloodType}" /></td>
           <%-- <td><input type="text" name="lastname" value="" readonly/></td>
            <td><input type="text" name="name" value="" readonly/></td>
            <td><input type="text" name="address" value="" readonly/></td>
            <td><input type="text" name="phone" value="" readonly/></td>
            <td><input type="text" name="bloodType" value="" readonly/></td>--%>
            <td><a href="card.jsp" >Καρτέλα</a></td><br>
            <td><a href="newblooddonor.jsp" >Επεξεργασία Αιμοδοτη</a></td> 
            </tr>
            </c:>
        </table>
        <input type="submit" value="Νέος Αιμοδότης" />
            
               
                    
                
              
    </body>
</html>
