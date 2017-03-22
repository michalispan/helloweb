<%-- 
    Document   : ReceiptBlood
    Created on : 9 Μαρ 2017, 1:36:05 μμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Receipt Blood</title>
    </head>
    <body>
        <h1>Ληψη Αιματος</h1>
        <form name="lipsi" action="lipsi" method="POST">
        <table border="0">
            <tr>    
            <td>Μητρωο</td>    
                <td><input type="text" name="mhtrwo" value="<c:out value="${donor.am}"/>" readonly/></td>
            </tr>
            <tr>    
            <td>Επωνυμο</td>    
                <td><input type="text" name="eponumo" value="<c:out value="${donor.lastName}"/>" readonly /></td>
            </tr>
            <tr>    
            <td>Ημερομηνια</td>    
                <td><input type="date" name="dates" value=""/></td>
            </tr>
            <tr>    
            <td>Φιάλες</td>    
                <td><input type="text" name="fiales" value=""/></td>
            </tr>
            <tr>    
            <td>Σχόλια</td>    
                <td><input type="text" name="sxolia" value=""/></td>
            </tr>
            <tr>    
                
                
            </tr>
        
            
        </table>
            <td><input type="submit" name="Save" value="Save"/></td>
         </form>
        
        
        
    </body>
</html>
