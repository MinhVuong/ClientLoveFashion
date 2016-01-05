var myApp = angular.module("Customer", []);

myApp.controller("loginCtrl", function($scope, $http, $location){

	$scope.login = function() {
		var user ={ "email":$scope.email,
            	"password":$scope.password};
		var res = $http.post('http://localhost:8080/api/customer/login', user);
		res.success(function(data, status, headers, config) {
			if(status==200)
			{
				 window.location.href = "http://localhost:8081/customer/account/" + data.content ;
			}
			
		});
		res.error(function(data, status, headers, config) {
			if(status == 400){
				alert("Mssv exists in database");
			}
		});	
		
    };
    
    
});