<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Input</title>
 <style>
        .fieldset
        {
            border-radius: 20px;
            border-color: black;
            margin-left: 50px;
            margin-right: 50px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <form name="loginForm" action="formDisplay" method="post">
        <fieldset class="fieldset">
            <legend style="color: red;">Form</legend>
        <label for="Sname">Student name:</label>
        <input type="text" name="sname" id="Sname" placeholder="Enter your name"><br><br>
        <label for="email">E-mail Id : </label>
        <input type="email" name="email" id="email" placeholder="Enter your email"><br><br>
        <label for="Gender">Gender: M</label>
        <input type="radio" id="Gender" name="Gender" value="Male">
        <label for="FGender">F</label>
        <input type="radio" id="FGender" name="Gender" value="Female"><br><br>
        <label for="Course">Select Course - </label>
        <select name="Course" id="Course">
            <option value="btech">B.Tech</option>
            <option value="ba">BA</option>
            <option value="mca">MCA</option>
            <option value="msc">M.SC</option>
            <option value="mtech">M.Tech</option>
            <option value="bsc">B.Sc</option>
            <option value="bca">BCA</option>
            <option value="bcom">B.Com</option>
        </select> <br><br>
        <label for="adddress">Address</label>
        <input type="text" name="address" id="address" placeholder="Enter your address"><br><br>
        <input type="checkbox" id="Rules" name="condition" value="checked">
        <label for="Rules">Accept Rules</label><br><br>
        <input type="submit" value="Submit"> &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="Cancel">
    </fieldset>
    </form>
</body>
</html>