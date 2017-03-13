<%-- 
    Document   : newblooddonor
    Created on : 9 Μαρ 2017, 11:43:51 πμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Blood Doner</title>
    </head>
    
    
    
    
    <body>
        <h1>Νεος Αιμοδοτης / Επεξεργασια</h1>
        <table border ="0">
            <tbody>
        <form name="newblooddoner" action="Registration" method="POST">
        
            <tr><td> Κωδικος Αιμοδοτη</td>
                <td> <input type="text" name="kodikosAimodoti" value="" /></td>
            </tr>
            <tr>
            <td>Επιθετο</td>
                <td><input type="text" name="lastname" value="" /></td>
            </tr>
            <tr>
            <td>Ονομα</td>
                <td><input type="text" name="name" value="" /></td>
            </tr>
            <tr>
            <td>Διευθυνση</td>
                <td><input type="text" name="address" value="" /></td>
            </tr>
            <tr>
            <td>Αριθμος Τηλεφωνου</td>
                <td><input type="text" name="phonenumber" value="" /></td>
            </tr> 
            <tr>
            <td>Ομαδα Αιματος</td>
                <td><input type="text" name="omadaAimatos" value="" /></td>
            </tr>
            <tr>
            
                <td><input type="submit" name="saveButton" value="Save" /></td>
            </tr>
            
            </form>
          </tbody>
             
        </table>
       
            
            
        
        
        
        
        
        
    </body>
</html>
