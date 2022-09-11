# CountryService
REST-api for country information

provides 

GET /countries/
response:

[
  {
    "name": "Finland",
    "country_code": "FI"
  },
  {
    "name": "Guatemala",
    "country_code": "GT"
  },
  ...
]
 
GET /countries/{name}
response:

{
  "name": "Peru",
  "country_code": "PE",
  "capital": "Lima",
  "population": 32971846,
  "flag_file_url": "https://flagcdn.com/w320/pe.png"
}

## Build instructions

Use intellij IDEA to import the project and just run it

###### Maven 

You can also use Maven to run the project

``` 
mvn spring-boot:run
```



