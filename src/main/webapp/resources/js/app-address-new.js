var myApp = angular.module("NewAddress", []);

myApp.controller("NewAddress", function($scope, $http, $location){

	
	$scope.submit = function(x) {
		
		var user ={ "firstName":$scope.firstName,
				    "lastName": $scope.lastName,
				    "telephone": $scope.telephone,
				    "street": $scope.street,
				    "regionId":1,
				    "countryId":1,
				    "bill": $scope.bill,
				    "ship": $scope.ship};
		var res = $http.post('http://localhost:8080/api/customer/address/new/' + x, user);
		res.success(function(data, status, headers, config) {
			if(status==200)
			{
				 window.location.href = "http://localhost:8081/customer/account/address/" ;
			}
			
		});
		res.error(function(data, status, headers, config) {
			alert(status);
		});	
    };
    
    
});