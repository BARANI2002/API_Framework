This is a REST Assured + TestNG API Automation Framework designed to test the Restful-Booker public API
It includes :

POJO Class named As AuthRequest :

-Represents request body for POST /auth.
-Automatically converted to JSON by Rest Assured.

BaseTest:

-Parent class for all tests.
-Initializes request/response specifications.

CreateTokenTest class: 

-Sends POST /auth request with username & password.
-Extracts and stores the token for future requests.

GetBookingTest

-Sends GET /booking/1 request using the token from CreateTokenTest.
-Uses TestNG dependsOnMethods to ensure token is created first.
