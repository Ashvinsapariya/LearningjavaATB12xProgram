# 📘 Project #2 - REST API Test Cases

**Collection Name:** Project #2 REST API

## 📋 Test Case List

### ✅ Get All the Bookings
- **Method**: `GET`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking`
#### 🔍 Test Script:
```javascript
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});


pm.test("Response time is less than 1000ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(1000);
});


pm.test("Response is an array and contains the required field 'bookingid'", function () {
    const responseData = pm.response.json();
    
    pm.expect(responseData).to.be.an('array').that.is.not.empty;
    responseData.forEach(function(item) {
        pm.expect(item).to.have.property('bookingid').that.is.a('number');
    });
});


pm.test("Booking ID is a non-negative integer", function () {
    const responseData = pm.response.json();
    
    pm.expect(responseData).to.be.an('array').that.is.not.empty;
    responseData.forEach(function(booking) {
        pm.expect(booking).to.have.property('bookingid');
        pm.expect(booking.bookingid).to.be.a('number').that.is.at.least(0);
    });
});


pm.test("Response content-type is application/json", function () {
    pm.expect(pm.response.headers.get('Content-Type')).to.include("application/json");
});

```
---
### ✅ Get Single Booking by ID
- **Method**: `GET`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking/1`
#### 🔍 Test Script:
```javascript
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});

```
---
### ✅ Create Booking
- **Method**: `POST`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking`

#### 📨 Request Body:
```json
{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
```
#### 🔍 Test Script:
```javascript
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});

```
---
### ✅ Create Booking Negative #1 - Invalid JSON Body
- **Method**: `POST`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking`
#### 🔍 Test Script:
```javascript
pm.test(" Invalid body response code should be 500", function () {
    pm.expect(pm.response.code).to.eql(500);
});

```
---
### ✅ Create Booking Negative #2 - Large value of deposit paid.
- **Method**: `POST`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking`

#### 📨 Request Body:
```json
{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 1100000000000000000,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
```
#### 🔍 Test Script:
```javascript
pm.test(" Invalid body response code should be 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});

```
---
### ✅ Create Booking TC Way #2 Snippets
- **Method**: `POST`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking`

#### 📨 Request Body:
```json
{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
```
#### 🔍 Test Script:
```javascript
pm.test("TC#1 - Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("TC#2 -Content-Type is present", function () {
    pm.response.to.have.header("Content-Type");
});

pm.test("TC#3 - Response time is less than 1000ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(1000);
});

pm.test("TC#4 -Body matches bookingid", function () {
    pm.expect(pm.response.text()).to.include("bookingid");
});

```
---
### ✅ Create Booking TC Way #3 TC in Postman Foramt(JS)
- **Method**: `POST`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking`

#### 📨 Request Body:
```json
{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
```
#### 🔍 Test Script:
```javascript
// We need to learn the basics of JavaScript as well as the syntax of Postman. 
```
---
### ✅ Create Booking TC Way #1 - By AI
- **Method**: `POST`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking`

#### 📨 Request Body:
```json
{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
```
#### 🔍 Test Script:
```javascript
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});


pm.test("Response contains required fields", function () {
    const responseData = pm.response.json();
    
    pm.expect(responseData).to.be.an('object');
    pm.expect(responseData).to.have.all.keys('bookingid', 'booking');
    pm.expect(responseData.booking).to.be.an('object');
});


pm.test("Validate the booking object structure and types", function () {
    const responseData = pm.response.json();

    pm.expect(responseData).to.be.an('object').that.has.all.keys('bookingid', 'booking');
    pm.expect(responseData.booking).to.be.an('object').that.has.all.keys('firstname', 'lastname', 'totalprice', 'depositpaid', 'bookingdates', 'additionalneeds');

    pm.expect(responseData.booking.firstname).to.be.a('string');
    pm.expect(responseData.booking.lastname).to.be.a('string');
    pm.expect(responseData.booking.totalprice).to.be.a('number');
    pm.expect(responseData.booking.depositpaid).to.be.a('boolean');
    
    pm.expect(responseData.booking.bookingdates).to.be.an('object').that.has.all.keys('checkin', 'checkout');
    pm.expect(responseData.booking.bookingdates.checkin).to.be.a('string');
    pm.expect(responseData.booking.bookingdates.checkout).to.be.a('string');
    
    pm.expect(responseData.booking.additionalneeds).to.be.a('string');
});


pm.test("Response time is less than 500ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(500);
});


pm.test("The depositpaid field must be a boolean", function () {
    const responseData = pm.response.json();
    
    pm.expect(responseData).to.be.an('object');
    pm.expect(responseData.booking.depositpaid).to.be.a('boolean');
});

```
---
### ✅ Full Update PUT
- **Method**: `PUT`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking/124`

#### 📨 Request Body:
```json
{
    "firstname" : "James",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
```
#### 🔍 Test Script:
```javascript
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});

```
---
### ✅ Partial Update booking
- **Method**: `PUT`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking/1`

#### 📨 Request Body:
```json
{
    "firstname" : "James",
    "lastname" : "Brown"
}
```
#### 🔍 Test Script:
```javascript
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});

```
---
### ✅ Delete Booking By ID
- **Method**: `DELETE`
- **Endpoint**: `https://restful-booker.herokuapp.com/booking/1`
#### 🔍 Test Script:
```javascript
pm.test("Response status code is 200", function () {
    pm.expect(pm.response.code).to.eql(200);
});

```
---
### ✅ PING Request
- **Method**: `GET`
- **Endpoint**: `https://restful-booker.herokuapp.com/ping`
---
### ✅ Create Token by AUTH
- **Method**: `POST`
- **Endpoint**: `https://restful-booker.herokuapp.com/auth`
#### 🔍 Test Script:
```javascript
// After making the request, you want to test something; you can write it here in JavaScript. 
```
---