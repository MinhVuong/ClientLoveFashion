var myApp = angular.module("MyOrder", []);

myApp.controller("MyOrder", function($scope, $http, $location){

	$scope.cancel = function(id, index){
		
		
		var res = $http.get('http://localhost:8080/api/customer/myorder/cancle/'+id+','+index);
		res.success(function(data, status, headers, config) {
			if(status==200)
			{
				 alert("Orders has been canceled.");
				 window.location.href = "http://localhost:8081/customer/account/myorder" ;
			}
		});
		res.error(function(data, status, headers, config) {
			if(status=504)
			{
				alert("Your order has placed more than 3 hours should not be canceled.");
			}else
				alert("Bad Request!");
			
			
		});	
	}

    
});