<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE> 
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Set Interval in JS</title>
    <style>
        body{
            background-color: black;
        }
        #para{
            border: 2px solid black;
            font-size: 24px;
            text-align: center;
            padding: 10px;
            background-color: black;
            color: white;
        }
        #para1{
            border: 2px solid black;
            font-size: 24px;
            text-align: center;
            padding: 10px;
            background-color: black;
            color: white;
        }
        #time{
            color: white;
            text-shadow: 1px 1px 2px white;
            font-weight: bold;
            font-style: italic;
        }
        #curtime{
            color: white;
            text-shadow: 1px 1px 2px white;
            font-weight: bold;
            font-style: italic;
        }
    </style>
</head>
<body>
    <p id="para">Indian Standard Time is <span id="time"></span></p>
    <p id="para1">Current Time is <span id="curtime"></span></p>
    <script>
        displaytime=()=>{
            time= Date();
            document.getElementById('time').innerHTML=time;
        }
        setInterval(displaytime,1000);
        function currenttime(){
        let para1= new Date();
        let h= para1.getHours();
        let m= para1.getMinutes();

        let s= para1.getSeconds();  
        // let d=para1.getMilliseconds();
        document.getElementById('curtime').innerHTML= h+':'+m+':'+s;
        }
        setInterval(currenttime,1000);
    </script>
</body>
</html>