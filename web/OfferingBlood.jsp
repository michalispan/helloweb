<%-- 
    Document   : OfferingBlood
    Created on : 9 Μαρ 2017, 1:07:45 μμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Offering Blood</title>
    </head>
    <body>

        <h1>Δωρεά Αίματος</h1>
        <form name="Dorea" action="Dorea" method="POST">
            <table border="0">
                <tr>    
                    <td>Μητρώο</td>    
                    <td><input type="text" name="mhtrwo" value="<c:out value="${donor.am}"/>" readonly/> </td>
                </tr>
                <tr>    
                    <td>Επώνυμο</td>    
                    <td><input type="text" name="eponumo" value="<c:out value="${donor.lastName}"/>" readonly /></td>
                </tr>
                <tr>    
                    <td>Ημερομηνία</td>    
                    <td><input type="date" name="dates" value="" /></td>
                </tr>
                <tr>    
                    <td>Φιάλες</td>    
                    <td><input type="text" name="fiales" value="" /></td>
                </tr>
                <tr>    
                    <td>Σχόλια</td>    
                    <td><input type="text" name="sxolia" value="" /></td>
                </tr>


            </table>
            <input type="submit" value="Save"/>
        </form>

    </body>
</html>
