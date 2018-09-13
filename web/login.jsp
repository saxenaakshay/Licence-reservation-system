<%-- 
    Document   : login
    Created on : Oct 30, 2014, 9:44:57 PM
    Author     : ROHIT
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<!DOCTYPE html>
<b:kickstart title="My Login Page">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
   
    <style type="text/css">
      body {
  width: 100%;
  height: 100%;
  margin: 0 auto;
  background-color: #fcfcfc;
  margin-top: 50px;
}

input {
  outline: none;
}

#wrapper {
  width: 100%;
  height: 100%;
  margin: 0 auto;
}

#box {
  position: fixed;
	left: 50%;
	top: 40%;
	width: 350px;
	height: auto;
  margin: 0 auto;
	margin-left: -170px;
	margin-top: -150px;
  background-color: #f7f7f7;
  border: 1px solid #ededed;
  border-radius: 3px;
}

.header {
  width: 100%;
  height: 90px;
}

.header > h4 {
  text-align: center;
  padding-top: 38px;
  color: #8f95a1;
  margin: 0;
  font-family: 'Lato', sans-serif;;
  font-weight: 300;
}

h6 {
  margin: 0;
  width: auto;
  height: 10px;
  background-color: #fff;
  padding: 20px 35px;
  color: #a9b0c0;
  border-top: 1px solid #ededed;
  box-sizing: border-box;
  font-family: 'Lato', sans-serif;
  font-weight: 300;
}

input[type="text"], input[type="password"], input[type="date"]  {
  width: 100%;
  height: 50px;
  border: none;
  font-size: 20px;
  padding: 0 35px;
  box-sizing: border-box;
  font-family: serif;
  color: #a9afbd;
  font-family: 'Lato', sans-serif;
  font-weight: 300;
}

input[type="text"]:focus, input[type="password"]:focus , input[type="date"]:focus {
  border-left: 3px solid #fe655d;
  -webkit-transition: border .2s ease;
  -moz-transition: border .2s ease;
  -o-transition: border .2s ease;
  transition: border .2s ease;
}

input[type="password"] {
  border-bottom: 1px solid #ededed;
}

input[type="submit"] {
  background-color: #fe655d;
  border: none;
  height: 60px;
  width: 310px;
  margin: 0 auto;
  display: block;
  color: #fff;
  margin: 30px auto;
  border: 1px solid #e0514b;
  border-radius: 3px;
  transition: all .2s ease;
  font-family: 'Lato', sans-serif;
  font-weight: 300;
}

input[type="submit"]:hover {
  background-color: #e0514b;
  border: 1px solid #fe655d;
}


body {
  font: 13px/20px "Lucida Grande", Tahoma, Verdana, sans-serif;
  color: #404040;
  background: #e6e6e6;
}

.container {
  margin: 1px auto;
  width: 540px;
  text-align: center;
}

.nav {
  height: 48px;
  display: inline-block;
}

.nav > li, .nav:active > .active {
  float: left;
  position: relative;
  margin: 0 0 4px;
  height: 44px;
  color: #595959;
  text-shadow: 0 1px white;
  background-color: rgba(0, 0, 0, 0.05);
  border: 1px solid;
  border-color: #cfcfcf #d6d6d6 #c8c8c8;
  background-image: -webkit-linear-gradient(top, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));
  background-image: -moz-linear-gradient(top, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));
  background-image: -o-linear-gradient(top, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));
  background-image: linear-gradient(to bottom, rgba(255, 255, 255, 0.6), rgba(255, 255, 255, 0.25));
  -webkit-box-shadow: inset 0 1px white, inset 0 0 0 1px rgba(255, 255, 255, 0.7), 0 2px #dadada, 0 3px #c4c4c4, 0 4px 3px rgba(0, 0, 0, 0.1);
  box-shadow: inset 0 1px white, inset 0 0 0 1px rgba(255, 255, 255, 0.7), 0 2px #dadada, 0 3px #c4c4c4, 0 4px 3px rgba(0, 0, 0, 0.1);
}

.nav > li:hover {
  color: #539f07;
  text-shadow: 0 1px white, 0 0 20px white;
}

.nav > li.active,
.nav > .active:active,
.nav > li:active {
  z-index: 2;
  margin: 4px 0 0;
  height: 43px;
  color: #404040;
  background: transparent;
  border-color: #ccc;
  border-width: 1px 0;
  background-image: -webkit-linear-gradient(top, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));
  background-image: -moz-linear-gradient(top, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));
  background-image: -o-linear-gradient(top, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));
  background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0.04), rgba(0, 0, 0, 0));
  -webkit-box-shadow: inset 0 1px rgba(255, 255, 255, 0.35), inset 0 -1px 1px rgba(0, 0, 0, 0.05), 1px 0 rgba(0, 0, 0, 0.05), -1px 0 rgba(0, 0, 0, 0.05), 0 1px rgba(255, 255, 255, 0.4);
  box-shadow: inset 0 1px rgba(255, 255, 255, 0.35), inset 0 -1px 1px rgba(0, 0, 0, 0.05), 1px 0 rgba(0, 0, 0, 0.05), -1px 0 rgba(0, 0, 0, 0.05), 0 1px rgba(255, 255, 255, 0.4);
}

.nav > li:active {
  z-index: 3;
}

.nav > li:first-child {
  border-left-width: 1px !important;
  border-left-color: #c6c6c6;
  border-radius: 5px 0 0 5px;
}

.nav > li:last-child {
  border-right-width: 1px !important;
  border-right-color: #c6c6c6;
  border-radius: 0 5px 5px 0;
}

.nav > li + li, .nav:active > .active + li, .nav:active > li + .active {
  border-left-width: 0;
}

.nav > .active + li,
.nav > .active:active + li,
.nav > li:active + li,
.nav > li:active + .active {
  border-left-width: 1px;
}

.nav > li > a {
  display: block;
  position: relative;
  line-height: 44px;
  padding: 0 20px;
  font-size: 12px;
  font-weight: bold;
  color: inherit;
  text-decoration: none;
  outline: 0;
}

.nav > li > a:before {
  content: attr(title);
  position: absolute;
  top: 1px;
  left: 20px;
  color: rgba(255, 255, 255, 0.4);
  text-shadow: none;
}






    </style>
     <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css'>
</head>

    <body>
        
   
              <div class="container">
    <nav>
      <ul class="nav">
        <li ><a href="index.jsp" title="Home">Home</a></li>
        <li ><a href="road.html" title="Road Rules">Road Rules</a></li>
        <li><a href="traffic.html" title="Traffic Signals">Traffic Signals</a></li>
        <li><a href="signs.html" title="Signs Info">Learn Signs</a></li>
      </ul>
    </nav>
  </div>
            
       
      <div id="wrapper">
      <div id="box">
        <div class="header">
          <h4>Sign In Below</h4>
        </div>
          <form  action="VerifyLogin" method="post">
       <h6>REGISTRATION ID:</h6>
          <input type="text"  placeholder="Registration-Id" name="regid">
          <h6>D.O.B.:</h6>
          <input type="date" placeholder="Date Of Birth" name="password" min="1940-01-01">
          <label class="checkbox">
              <input type="checkbox" value="remember-me" style=" margin-left: 0px"> Remember me
        </label>
       
          <input type="submit" value="SIGN IN">
          </form>
      </div>
    </div>
      
      
</html>
</b:kickstart>
