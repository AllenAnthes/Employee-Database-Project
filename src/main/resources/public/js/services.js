angular.module('app.services', []).factory('Employee', function($resource) {
  return $resource('/api/v1/employees/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
