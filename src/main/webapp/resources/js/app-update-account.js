var myApp = angular.module("UpdateAccount", []);

myApp.controller("submit", function($scope, $http, $location){
	$scope.submit = function(){
		
		if($scope.isChangePassword)
		{
			if($scope.password.length < 6)
			{
				alert("Length Password less 6 chars!");
				return;
			}
			else if($scope.password != $scope.confirmPassword)
			{
				alert("Password didn't matched!");
				return;
			}
		}
		var update = {
				"email": $scope.email,
			  "firstName": $scope.firstName,
			  "lastName": $scope.lastName,
			  "changePassword": $scope.isChangePassword,
			  "currentPassword": $scope.currentPassword,
			  "password": $scope.password,
			  "confirmPassword": null
			};
		var res = $http.post('http://localhost:8080/api/customer/edit', update);
		res.success(function(data, status, headers, config) {
			if(status==200)
			{
				window.location.href = "http://localhost:8081/customer/account/" + data.content ;
			}
			
			
		});
		res.error(function(data, status, headers, config) {
			
			if(status==404)
			{
				alert("Current Password didn't correct!");
			}else{
				alert(status);
			}
		});	
	}
});