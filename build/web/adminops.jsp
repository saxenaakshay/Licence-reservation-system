<%-- 
    Document   : adminops
    Created on : 14 Nov, 2014, 10:34:02 PM
    Author     : AKSHAY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<!DOCTYPE html>
<b:kickstart title="My First Page">
    <html>
        <body>
         
    <b:button label="USER INFO" context="success" href="adminservlet" />
    <b:button label="ALL BOOKINGS" context="success" href="adminservlet2"/>
    <b:button label="CANCELLATION REQUESTS" context="success" href="admincancelreq"/>
    
        </body>
    </html>
</b:kickstart>