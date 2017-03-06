var usersApp = angular.module('usersApp', ['ngRoute', 'ngResource', 'ui.bootstrap']);

usersApp.config(function ($routeProvider) {

    $routeProvider
        .when('/', {
            templateUrl: '/views/user/user.html',
            controller: 'UserController'
        })
        .when('/groups', {
            templateUrl: '/views/group/group.html',
            controller: 'GroupController'
        })
        .otherwise({
            redirectTo: '/'
        });
});