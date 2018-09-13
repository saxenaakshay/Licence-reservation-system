<%-- 
    Document   : booked
    Created on : Nov 14, 2014, 7:20:58 PM
    Author     : ROHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>

@import "http://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css";

body {
  font: 13px/20px "Lucida Grande", Tahoma, Verdana, sans-serif;
  color: #404040;
  background: #e6e6e6;
}

.container {
  margin: 10px auto;
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
    </head>
    <body>
            
            <div class="container">
    <nav>
      <ul class="nav">
        <li ><a href="index.jsp" title="Home">Home</a></li>
        <li ><a href="road.html" title="Road Rules">Road Rules</a></li>
        <li><a href="traffic.html" title="Traffic Signals">Traffic Signals</a></li>
        <li><a href="sign.html" title="Signs Info">Learn Signs</a></li>
      </ul>
    </nav>
                <br> <br> <br>
        <h1>YOUR BOOKING</h1>
        Registration Number: "${regid}"
        Date: "${date}"
        Slot: "${slot}"
      
        </br> Return to <a href="index.jsp">HOME</a> 
            </div>
    </body>
</html>