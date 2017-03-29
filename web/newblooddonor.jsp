<%-- 
    Document   : newblooddonor
    Created on : 9 Μαρ 2017, 11:43:51 πμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Blood Donor</title>
    </head>
    
    
    
    
    <body>
        <h1>Νέος Αιμοδότης / Επεξεργασία</h1>
        <table border ="0">
            <tbody>
        <form name="newblooddoner" action="Registration" method="POST">
        
            <tr><td> Κωδικός Αιμοδότη</td>
                <td> <input type="text" name="kodikosAimodoti" value="<c:out value="${donor.am}"/> " readonly/></td>
            </tr>
            <tr>
            <td>Επίθετο</td>
                <td><input type="text" name="lastname" value="<c:out value="${donor.lastName}"/> " /></td>
            </tr>
            <tr>
            <td>Όνομα</td>
                <td><input type="text" name="name" value="<c:out value="${donor.name}"/> " /></td>
            </tr>
            <tr>
            <td>Διεύθυνση</td>
                <td><input type="text" name="address" value="<c:out value="${donor.address}"/> " /></td>
            </tr>
            <tr>
            <td>Αριθμός Τηλεφώνου</td>
                <td><input type="text" name="phonenumber" value="<c:out value="${donor.phone}"/> " /></td>
            </tr> 
            <tr>
            <td>Ομάδα Αίματος</td>
                <td><input type="text" name="omadaAimatos" value="<c:out value="${donor.bloodType}"/> " /></td>
            </tr>
            <tr>
            
                <td><input type="submit" name="saveButton" value="Save" /></td>
            </tr>
            
            </form>
          </tbody>
             
        </table>
       
            
            
        
        
        
        
        
        
    </body>
</html>
