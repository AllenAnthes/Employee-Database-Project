angular.module('app.controllers', []).controller('EmployeeListController', function($scope, $state, popupService, $window, Employee) {
  $scope.employees = Employee.query(); //fetch all employees. Issues a GET to /api/vi/employees

  $scope.deleteEmployee = function(employee) { // Delete a Employee. Issues a DELETE to /api/v1/employees/:id
    if (popupService.showPopup('Really delete this?')) {
      employee.$delete(function() {
        $scope.employees = Employee.query();
        $state.go('employees');
      });
    }
  };
}).controller('EmployeeViewController', function($scope, $stateParams, Employee) {
  $scope.employee = Employee.get({ id: $stateParams.id }); //Get a single Employee.Issues a GET to /api/v1/employees/:id
}).controller('EmployeeCreateController', function($scope, $state, $stateParams, Employee) {
  $scope.employee = new Employee();  //create new Employee instance. Properties will be set via ng-model on UI

  $scope.addEmployee = function() { //create a new Employee. Issues a POST to /api/v1/employees
    $scope.employee.$save(function() {
      $state.go('employees'); // on success go back to the list i.e. employees state.
    });
  };
}).controller('EmployeeEditController', function($scope, $state, $stateParams, Employee) {
  $scope.updateEmployee = function() { //Update the edited Employee. Issues a PUT to /api/v1/employees/:id
    $scope.employee.$update(function() {
      $state.go('employees'); // on success go back to the list i.e. employees state.
    });
  };

  $scope.loadEmployee = function() { //Issues a GET request to /api/v1/employees/:id to get a Employee to update
    $scope.employee = Employee.get({ id: $stateParams.id });
  };

  $scope.loadEmployee(); // Load a Employee which can be edited on UI
});
