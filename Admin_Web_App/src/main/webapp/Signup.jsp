<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Page</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style type="text/css">

body {
     background: url('https://static-communitytable.parade.com/wp-content/uploads/2014/03/rethink-target-heart-rate-number-ftr.jpg') fixed;
    background-size: cover;
}

*[role="form"] {
    max-width: 530px;
    padding: 15px;
    margin: 0 auto;
    border-radius: 0.3em;
    background-color: #f2f2f2;
}

*[role="form"] h2 { 
    font-family: 'Open Sans' , sans-serif;
    font-size: 40px;
    font-weight: 600;
    color: #000000;
    margin-top: 5%;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 4px;
}
.btn{
border:1px solid black;
margin-left: 40px;
color: black;
font-weight: bold;
}

</style>
</head>
<body>


<div class="container">
            <form class="form-horizontal" role="form" action="Signup" method="post">
                <h2>User Registration</h2>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="Name" placeholder="Name" class="form-control" name="name" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email* </label>
                    <div class="col-sm-9">
                        <input type="email" id="email" placeholder="Email" class="form-control" name= "email">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password*</label>
                    <div class="col-sm-9">
                        <input type="password" id="password" placeholder="Password" name="pass" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth*</label>
                    <div class="col-sm-9">
                        <input type="date" id="birthDate" class="form-control" name="dob">
                    </div>
                </div>
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-3 control-label">Phone number </label>
                    <div class="col-sm-9">
                        <input type="tel" id="phoneNumber" placeholder="Phone number" class="form-control" name="mob">
                        <span class="help-block">Your phone number won't be disclosed anywhere </span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio" name="gender" value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio" name="gender" value="Male">Male
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio" name="gender" value="Others">Others
                                </label>
                            </div>
                            
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <span class="help-block">*Required fields</span>
                    </div>
                </div>
                <input type="submit" class="btn" value="Register">
                 <input type="reset" class="btn" value="Cancel">
                
            </form> <!-- /form -->
             <a href="Logout"><button class="btn">Logout</button></a>
        </div> <!-- ./container -->
        
        <script type="text/javascript">
        $(function(){
        	$.validator.setDefaults({
        		highlight: function(element){
        			$(element)
        			.closest('.form-group')
        			.addClass('has-error')
        		},
        		unhighlight: function(element){
        			$(element)
        			.closest('.form-group')
        			.removeClass('has-error')
        		}
        	});
        	
        	$.validate({
        		rules:
        		{	
        		    password: "required",
        			birthDate: "required",
        			weight: {
        			    required:true,
        			    number:true
        			},
        			height:  {
        			    required:true,
        			    number:true
        			},
        			email: {
        				required: true,
        				email: true
        			}
        		},
        			messages:{			
        				email: {
        				required: true,
        				email: true
        			}
        		},
        				password: {
        					required: " Please enter password"
        				},
        				birthDate: {
        					required: " Please enter birthdate"
        				},
        				email: {
        					required: ' Please enter email',
        					email: ' Please enter valid email'
        				},
        				weight: {
        					required: " Please enter your weight",
        					number: " Only numbers allowed"
        				},
        				height: {
        					required: " Please enter your height",
        					number: " Only numbers allowed"
        				},
        			}
        			
        	});
        });
        </script>
</body>
</html>