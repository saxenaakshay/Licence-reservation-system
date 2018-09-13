<%-- 
    Document   : index
    Created on : 14 Nov, 2014, 10:34:02 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://bootstrapjsp.org/" prefix="b" %>
<!DOCTYPE html>
<b:kickstart title="My First Page">
    <html>
        <head>
            <style type="text/css">
       
@import "http://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css";

body {
  font: 13px/20px "Lucida Grande", Tahoma, Verdana, sans-serif;
  color: #404040;
  background: #e6e6e6;
  //background-image: url("img/w2.jpg");
  
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

//@import url("http://fonts.googleapis.com/css?family=Droid+Sans");

body {
    background: #F0F0F0
}

/* Positioning */
#slider #slides_image .slide.one {
    left: 400px;
    top: 0;

    -webkit-animation: fadeOne 16s infinite;
    -moz-animation: fadeOne 16s infinite;
    animation: fadeOne 16s infinite;
}

#slider #slides_image .slide.two {
    left: 900px;
    top: 500px;

    -webkit-transform: rotate(90deg);
    -moz-transform: rotate(90deg);
    transform: rotate(90deg);

    -webkit-animation: fadeTwo 16s infinite;
    -moz-animation: fadeTwo 16s infinite;
    animation: fadeTwo 16s infinite;
}

#slider #slides_image .slide.three {
    left: 400px;
    top: 1000px;

    -webkit-transform: rotate(180deg);
    -moz-transform: rotate(180deg);
    transform: rotate(180deg);

    -webkit-animation: fadeThree 16s infinite;
    -moz-animation: fadeThree 16s infinite;
    animation: fadeThree 16s infinite;
}

#slider #slides_image .slide.four {
    left: -100px;
    top: 500px;

    -webkit-transform: rotate(270deg);
    -moz-transform: rotate(270deg);
    transform: rotate(270deg);

    -webkit-animation: fadeFour 16s infinite;
    -moz-animation: fadeFour 16s infinite;
    animation: fadeFour 16s infinite;
}

#slider #slides_info .slide_info.one {
    left: 400px;
    top: 0;

    -webkit-transform: rotate(180deg);
    -moz-transform: rotate(180deg);
    transform: rotate(180deg);

    -webkit-animation: fadeThree 16s infinite;
    -moz-animation: fadeThree 16s infinite;
    animation: fadeThree 16s infinite;
}

#slider #slides_info .slide_info.two {
    left: 800px;
    top: 400px;

    -webkit-transform: rotate(270deg);
    -moz-transform: rotate(270deg);
    transform: rotate(270deg);

    -webkit-animation: fadeFour 16s infinite;
    -moz-animation: fadeFour 16s infinite;
    animation: fadeFour 16s infinite;
}

#slider #slides_info .slide_info.three {
    left: 400px;
    bottom: 0;

    -webkit-animation: fadeOne 16s infinite;
    -moz-animation: fadeOne 16s infinite;
    animation: fadeOne 16s infinite;
}

#slider #slides_info .slide_info.four {
    left: 0;
    top: 400px;

    -webkit-transform: rotate(90deg);
    -moz-transform: rotate(90deg);
    transform: rotate(90deg);

    -webkit-animation: fadeTwo 16s infinite;
    -moz-animation: fadeTwo 16s infinite;
    animation: fadeTwo 16s infinite;
}

/* Slider Styles */
#slider_wrapper {
    position: relative;
    margin: 100px auto;
    width: 1000px;
    height: 400px;
    overflow: hidden;
}

#slider {
    width: 900px;
    height: 300px;
    top: 50px;
    left: 50px;
    position: relative;
}

#slider #slides_image {
    position: absolute;
    top: 0;
    left: 0px;
    width: 1300px;
    height: 1300px;

    -webkit-animation: rotate 16s ease infinite;
    -moz-animation: rotate 16s ease infinite;
    animation: rotate 16s ease infinite;
}

#slider #slides_info {
    position: absolute;
    bottom: 0;
    left: -400px;
    width: 1100px;
    height: 1100px;

    -webkit-animation: rotate 16s ease infinite;
    -moz-animation: rotate 16s ease infinite;
    animation: rotate 16s ease infinite;
    z-index: 5;
}

#slider #slides_info .slide_info {
    width: 300px;
    height: 300px;
    position: absolute;
}

#slider #slides_image .slide {
    width: 500px;
    height: 300px;
    background: rgba(0,0,0,0.5);
    position: absolute;
    background: url(http://cdn1.iconfinder.com/data/icons/defaulticon/icons/png/256x256/media-pause.png) 50% 50% no-repeat;
}

/* Text Styles */
#slider #slides_info .slide_info h2 {
    color: #333;
    font-family: "Droid Sans", sans-serif;
    margin: 0;
    font-weight: normal;
    font-size: 24px;
    padding-bottom: 5px;
}

#slider #slides_info .slide_info p {
    color: #666;
    font: 13px/18px Arial, sans-serif;
    text-shadow: 1px 1px #eee;
}

/* Button */
#slider a.button {
    display: inline-block;
    height: 40px;
    background: #ededed;
    padding: 0 15px;
    bottom: 0;
    left: 0;
    font: 13px/40px Arial, sans-serif;

    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 5px;
    border: 1px solid #aaa;
    color: #333;
    text-decoration: none;
    cursor: pointer;
    margin-top: 40px;
}
/*
#slider:hover #slides_image,#slider:hover #slides_info,#slider:hover #slides_image .slide,#slider:hover #slides_info .slide_info {
    -webkit-animation-play-state: paused;
    -moz-animation-play-state: paused;
    animation-play-state: paused;
}

#slider:hover .slide img {
    filter: alpha(opacity=50);
    opacity: .5;
}
*/
/* Animation Keyframes */

@-moz-keyframes rotate { 
    0% {
        -moz-transform: rotate(0deg);
    }
    20% {
        -moz-transform: rotate(0deg);
    }
    25% {
        -moz-transform: rotate(-90deg);
    }
    45% {
        -moz-transform: rotate(-90deg);
    }
    50% {
        -moz-transform: rotate(-180deg);
    }
    70% {
        -moz-transform: rotate(-180deg);
    }
    75% {
        -moz-transform: rotate(-270deg);
    }
    95% {
        -moz-transform: rotate(-270deg);
    }
    100% {
        -moz-transform: rotate(-360deg);
    }
}
@-webkit-keyframes "rotate" { 
    0% {
        -webkit-transform: rotate(0deg);
    }
    20% {
        -webkit-transform: rotate(0deg);
    }
    25% {
        -webkit-transform: rotate(-90deg);
    }
    45% {
        -webkit-transform: rotate(-90deg);
    }
    50% {
        -webkit-transform: rotate(-180deg);
    }
    70% {
        -webkit-transform: rotate(-180deg);
    }
    75% {
        -webkit-transform: rotate(-270deg);
    }
    95% {
        -webkit-transform: rotate(-270deg);
    }
    100% {
        -webkit-transform: rotate(-360deg);
    }
}

@keyframes "rotate" { 
    0% { transform: rotate(0deg); }
    20% { transform: rotate(0deg); }
    25% { transform: rotate(-90deg); }
    45% { transform: rotate(-90deg); }
    50% { transform: rotate(-180deg); }
    70% { transform: rotate(-180deg); }
    75% { transform: rotate(-270deg); }
    95% { transform: rotate(-270deg); }
    100% { transform: rotate(-360deg); }
}

@-moz-keyframes fadeOne { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    20% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    22% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    30% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}
@-webkit-keyframes "fadeOne" { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    20% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    22% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    30% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}
@keyframes "fadeOne" { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    20% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    22% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    30% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}

@-moz-keyframes fadeTwo { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    45% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    47% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    55% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}
@-webkit-keyframes "fadeTwo" { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    45% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    47% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    55% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}
@keyframes "fadeTwo" { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    45% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    47% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    55% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}

@-moz-keyframes fadeThree { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    70% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    72% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    80% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}
@-webkit-keyframes "fadeThree" { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    70% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    72% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    80% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}
@keyframes "fadeThree" { 
    0% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    70% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    72% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    80% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
}

@-moz-keyframes fadeFour { 
    0% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    5% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    95% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    97% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
}
@-webkit-keyframes "fadeFour" { 
    0% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    5% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    95% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    97% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
}
@keyframes "fadeFour" { 
    0% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    5% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    95% {
        filter: alpha(opacity=100);
        opacity: 1;
    }
    97% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
    100% {
        filter: alpha(opacity=0);
        opacity: 0;
    }
}      </style>
        </head>
        <body>
            
            <div class="container">
    <nav>
      <ul class="nav">
        <li class="active"><a href="#" title="Home">Home</a></li>
        <li ><a href="road.html" title="Road Rules">Road Rules</a></li>
        <li><a href="traffic.html" title="Traffic Signals">Traffic Signals</a></li>
        <li><a href="signs.html" title="Signs Info">Learn Signs</a></li>
      </ul>
    </nav>
  
            
        <center> 
         
    <b:button label="Register" context="warning" href="register.html" />
    <b:button label="Login" context="success" href="login.jsp"/>
    <b:button label="Ask a Question?"  href="qna.jsp"/>
    
    <b:button label="ADMIN" context="info" href="admin.jsp"/>
    
        </center> </div>
        
        <div id="slider_wrapper">
	<div id="slider">
		
		<div id="slides_info">
			<div class="slide_info one">
				<h2>E-MAIL Notifications!</h2>
				<p><br>  You will receive email notifications for registering and booking slots on our site! 
                                    Make sure you check them and set a reminder so that you don't forget.
				</p>
				
			</div>
			<div class="slide_info two">
				<h2>Q&A</h2>
				<p><br> <br> Ask us anything! If our team is online, you will get an instant reply to your answer.
				</p>
				
			</div>
			<div class="slide_info three">
				<h2>Book Online!</h2>
				<p><br>  PICK YOUR DATE AND SLOT FOR YOUR LICENSE TEST AND SHOW UP AT YOUR LOCAL RTO ON TIME.
				</p>
				<p>
					No more hassles! 
				</p>
				</div>
			<div class="slide_info four">
				<h2>Take a practice test</h2>
				<p><br> It is always good  to practice beforehand and know what you're going in for!
                                    Practice a few tests online to get an idea.
				</p>		
				<p>
					Visit the link below to practice tests. 
				</p>
				<a class="button" href="http://toptests.co.uk/">Practice Now!</a>
			
			</div>
		</div>
		
		<div id="slides_image">
			<div class="slide one">
                            <img src="img/b.png" width="500" height="300"/>
			</div>		
			<div class="slide two">
				<img src="img/a.jpg" width="450" height="300" />
			</div>		
			<div class="slide three">				
				<img src="img/c.png"  width="400" height="400"/>
			</div>		
			<div class="slide four">				
				<img src="img/d.jpg" />
			</div>
		</div>
	</div>
</div>
        
        </body>
    </html>
</b:kickstart>