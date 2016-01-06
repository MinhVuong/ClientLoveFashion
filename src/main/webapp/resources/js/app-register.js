var myApp = angular.module("Register", []);

myApp.controller("submit", function($scope, $http, $location){

	$scope.submit = function() {
		if($scope.firstName==null || $scope.firstName=="")
		{
			alert("First Name Null!");
		}else if($scope.lastName==null || $scope.lastName==""){
			alert("Last Name Null!");
		} else if($scope.email==null || $scope.email==""){
			alert("Email Null!");
		} else if($scope.password==null || $scope.password==""){
			alert("Password Null!");
		}else if($scope.password.length < 6){
			alert("Length Password less 6 chars");
		}else if($scope.confirmPassword!=$scope.password){
			alert("Password didn't machecd");
		}else{
			var registerMode = {
					"email": $scope.email,
					  "firstName": $scope.firstName,
					  "lastName": $scope.lastName,
					  "password": $scope.password,
					  "confirmPassword": null
					};
			var res = $http.post('http://localhost:8080/api/customer/register', registerMode);
			res.success(function(data, status, headers, config) {
				if(status==200)
				{
					 window.location.href = "http://localhost:8081/customer/account/login" ;
				}
				
				
			});
			res.error(function(data, status, headers, config) {
				
				if(status==409)
				{
					 alert("Email had exist!");
				}else{
					alert("Error!");
				}
			});	
		}
		
		
    };
    
    
});