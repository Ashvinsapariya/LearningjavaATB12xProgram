# 📘 IsValidISBN10 API Test Cases

**Collection Name:** IsValidISBN10 API Test Cases

## 📋 Test Case List

### ✅ TC001 - Valid ISBN-10
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0306406152</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC002 - Valid ISBN-10 ending with 'X'
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>048665088X</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC003 - Invalid ISBN-10 checksum
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>1234567890</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC004 - Alphabetic characters
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>ABCDEFGHIJ</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC005 - 9-digit ISBN ending in 'X'
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>12345678X</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC006 - Empty string input
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN></sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC007 - Null input
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN></sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC008 - Too short ISBN
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>12345</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC009 - Too long ISBN
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>1234567890123</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC010 - All zeros
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0000000000</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC011 - Arabic numerals
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>١٢٣٤٥٦٧٨٩٠</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC012 - Chinese numerals
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>一二三四五六七八九十</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC013 - Emojis
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>😊😂🤣🧐😎</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC014 - Special characters
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>12@45#78%90</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC015 - Alphanumeric
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>abc1234567</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC016 - Missing sISBN field
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC017 - Malformed XML
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope><soap:Body><IsValidISBN10><sISBN>INVALID</sISBN></IsValidISBN10></soap:Body>
```
---
### ✅ TC018 - No headers
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0306406152</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC019 - Incorrect Content-Type
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0306406152</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC020 - Missing SOAP envelope
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<IsValidISBN10><sISBN>0306406152</sISBN></IsValidISBN10>
```
---
### ✅ TC021 - No cookie
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0306406152</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC022 - Extra fields in SOAP body
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0306406152</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC023 - Concurrent Requests
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0306406152</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---
### ✅ TC024 - Repeated Request
- **Method**: `POST`
- **Endpoint**: `https://webservices.daehosting.com/services/isbnservice.wso`

#### 📨 Request Body:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <IsValidISBN10 xmlns="http://webservices.daehosting.com/ISBN">
      <sISBN>0306406152</sISBN>
    </IsValidISBN10>
  </soap:Body>
</soap:Envelope>
```
---