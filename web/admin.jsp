<%-- 
    Document   : login
    Created on : Oct 30, 2014, 9:44:57 PM
    Author     : AKSHAY
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<!DOCTYPE html>
<b:kickstart title="My Login Page">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
    <script>
           function validateForm() 
           {
             
             var x = document.forms["adminform"]["usn"].value;
             var y = document.forms["adminform"]["pass"].value;
             if (x=="hello" && y=="world")
               return true;
             alert("Incorrect Credentials");
             return false;
           }
        </script>

    <body>
        
      <form class="form-signin" name="adminform" action="adminops.jsp" onsubmit="return validateForm()" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="input-block-level" placeholder="USERNAME" name="usn">
        <input type="password" class="input-block-level" placeholder="PASSWORD" name="pass">
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <b:button type="submit" label="Login" context="success"> </b:button>
       
      </form>
      
      
</html>
</b:kickstart>
