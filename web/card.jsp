<%-- 
    Document   : card
    Created on : 9 Μαρ 2017, 1:51:49 μμ
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <th>Επωνυμο</th>
                    <th>Ονομα</th>
         </tr>
         <tr>
             <td><input type="text" name="am" value="" readonly="" /></td>
             <td><input type="text" name="lastname" value="" readonly="" /></td>
             <td><input type="text" name="name" value="" readonly="" /></td>
             
             
         </tr>
         <tr>
                    <th>Διευθυνση</th>
                    <th>Τηλεφωνο</th>
                    <th>Ομαδα Αιματος</th>
         </tr>
         <tr>
             <td><input type="text" name="address" value="" readonly="" /></td>
             <td><input type="text" name="phone" value="" readonly="" /></td>
             <td><input type="text" name="bloodtype" value="" readonly="" /></td>
         </tr>
           
     
     
     
        </table>
        </td></center>
        <hr></hr>
     
    
    <center> <table style="width:50%">
           
            
                <tr>
                    <th>Ημερομηνια</th>
                    <th>Φιάλες Προσφορας</th>
                    <th>Φιάλες Λήψης</th>
                    <th>Σχόλια</th>
                    
                </tr>  
                <tr>
                    <td><input type="text" name="hmeromhnia" value="" readonly="" /></td>
                    <td><input type="text" name="prosfora" value="" readonly="" /></td>
                    <td><input type="text" name="lipsi" value="" readonly="" /></td>
                    <td><input type="text" name="sxolia" value="" readonly="" /></td>
                    
              
        
        
                
        
        
        
        
            
        </table>
           <hr>
           <table>
           
             <tr> <%--(sinolof_p =fiali prosforas) & (sinolof_l = fiali lipsis)  --%>
                 <td>Συνολο</td>
                 <td><input type="text" name="sinolof_p" value="" readonly/></td>
                 <td><input type="text" name="sinolof_l" value="" readonly/></td>
                 
             </tr>
             <tr>
                 <td>Υπολοιπο</td>
                 <td><input type="text" name="ypoloipof_p" value="" readonly/></td>
             </tr>
             
           </hr>
           </table> </center>
                 <center><hr>
                     <td><a href="OfferingBlood.jsp">Νέα Δωρέα</a></td>
                     <td><a href="ReceiptBlood.jsp">Νέα Λήψη</a></td>
                     <td><a href="donorList">Προβολή Όλων</a></td>
                     
                     
                     
                     
                     
                 </hr></center>
    </body>
</html>
