<%-- 
    Document   : card
    Created on : 9 Μαρ 2017, 1:51:49 μμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doner Card</title>
    </head>
    <body>
    <center> <h1>Καρτέλα του Αιμοδότη</h1> </center>


    <center> <td valign = "top">

            <table style="width:50%">
                <tr>
                    <th>AM</th>
                    <th>Επώνυμο</th>
                    <th>Όνομα</th>
                </tr>
                <tr>
                    <td><input type="text" name="am" value="<c:out value="${donor.am}"/>" readonly/></td>
                    <td><input type="text" name="lastname" value="<c:out value="${donor.lastName}"/>" readonly/></td>
                    <td><input type="text" name="name" value="<c:out value="${donor.name}"/>" readonly/></td>


                </tr>
                <tr>
                    <th>Διεύθυνση</th>
                    <th>Τηλέφωνο</th>
                    <th>Ομάδα Αίματος</th>
                </tr>
                <tr>
                    <td><input type="text" name="address" value="<c:out value="${donor.address}"/>" readonly/></td>
                    <td><input type="text" name="phone" value="<c:out value="${donor.phone}"/>" readonly/></td>
                    <td><input type="text" name="bloodtype" value="<c:out value="${donor.bloodType}"/>" readonly/></td>
                </tr>

            </table>
        </td></center>
    <hr></hr>


    <center> <table style="width:50%">


            <tr>
                <th>Ημερομηνία</th>
                <th>Φιάλες Προσφοράς</th>
                <th>Φιάλες Λήψης</th>
                <th>Σχόλια</th>

            </tr>  
            <c:forEach items="${donor.prosforaList}" var="item">
            <tr>
                <td><input type="text" name="hmeromhnia" value="<c:out value="${item.date}"/>" readonly="" /></td>
                <td><input type="text" name="prosfora" value="<c:out value="${item.bloodBottle}"/>" readonly /></td>
                <td><input type="text" name="lipsi" value="<c:out value="${item.theirsBlood}"/>" readonly="" /></td>
                <td><input type="text" name="sxolia" value="<c:out value="${item.sxolia}"/>" readonly="" /></td>
            </tr>
            </c:forEach>
        </table>
        <hr>
        <table>

            <tr> <%--(sinolof_p =fiali prosforas) & (sinolof_l = fiali lipsis)  --%>
                <td>Σύνολο</td>
                <td><input type="text" name="sinolof_p" value="<c:out value="${donor.totP}"/>" readonly/></td>
                <td><input type="text" name="sinolof_l" value="<c:out value="${donor.totL}"/>" readonly/></td>

            </tr>
            <tr>
                <td>Υπόλοιπο</td>
                <td><input type="text" name="ypoloipof_p" value="<c:out value="${donor.ypol}"/>" readonly/></td>
            </tr>

            </hr>
        </table> </center>
    <center><hr>
        <td><a href="Registration?am=<c:out value="${donor.am}"/>&action=offer">Νέα Δωρέα</a></td>
        <td><a href="Registration?am=<c:out value="${donor.am}"/>&action=take">Νέα Λήψη</a></td>
        <td><a href="donorList">Προβολή Όλων</a></td>
        </hr>
    </center>
</body>
</html>
