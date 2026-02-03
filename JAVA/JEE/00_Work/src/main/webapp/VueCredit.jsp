<%@page import="Web.CreditModel"%>
<%
CreditModel model = (CreditModel)request.getAttribute("creditmodel");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Credit Bancaire</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

<div>
   <h2>Simulation de Crédit Bancaire</h2>
   
   <form action="calculer.php"  method="post">
   <table>
   <tr>
    <td>Montant :</td>
    <td><input type="text" name="montant"  /></td>
    <td>DH</td>
   </tr>
   
     <tr>
    <td>Taux :</td>
    <td><input type="text" name="taux"  /></td>
    <td>%</td>
   </tr>
   
     <tr>
    <td>Duree :</td>
    <td><input type="text" name="duree"  /></td>
    <td>mois</td>
   </tr>
   
   </table>
   <button type="submit">Calculer</button>
   </form>
</div>
 <p></p>
<div>
 Mensualite  = <%=model.getMensualite()%>
</div>


</body>
</html>