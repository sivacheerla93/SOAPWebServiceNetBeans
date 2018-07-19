# SOAP Web Services
* SOAP stands for Simple Object Access Protocol. It is a XML-based protocol for accessing web services.
* SOAP is a W3C recommendation for communication between two applications.
* SOAP is XML based protocol. It is platform independent and language independent. By using SOAP, you will be able to interact with other programming language applications.

### Advantages of Soap Web Services:
* WS Security: SOAP defines its own security known as WS Security.
* Language and Platform independent: SOAP web services can be written in any programming language and executed in any platform.

### Disadvantages of Soap Web Services:
* Slow: SOAP uses XML format that must be parsed to be read. It defines many standards that must be followed while developing the SOAP applications. So it is slow and consumes more bandwidth and resource.
* WSDL dependent: SOAP uses WSDL and doesn't have any other mechanism to discover the service.

### Creating sample SOAP Web Service using NetBeans

#### Project Configuartion:
* OS: Windows 8.1 64-bit
* Language: Java 8
* IDE: NetBeans 8.2
* Server: GlassFish Server 4.1.1 coming with NetBeans

#### Steps to create project:
##### 1. Open NetBeans -> Click on New Project -> Select Java Web -> Choose Web Application -> Click Next
![](/screenshots/Service1.png)
##### 2. Give any project name and click next
![](/screenshots/Service2.png)
##### 3. Select GlassFish Server 4.1.1 and Click Finish
![](/screenshots/Service3.png)
##### 4. Right click project -> Go to New -> Click Web Service
###### Note: If you don't find Web Service in the list, Please follow step 5.. Otherwise go with step 6
![](/screenshots/Service4.png)
##### 5. Right click project -> Go to New -> Click Other
![](/screenshots/Service5.png)
##### 6. Web Services -> Web Service -> Click Next
![](/screenshots/Service6.png)
##### 7. Give any Web Service Name as you like as well as package name also and check Implement Web Service as            Stateless Session Bean -> Click Finish
![](/screenshots/Service7.png)
##### 8. Go to Project Explorer -> Source Packages -> Go to Package -> Open Web Service class
![](/screenshots/Service8.png)
##### 9. Go to Design tab
![](/screenshots/Service9.png)
##### 10. Click Add Operation
![](/screenshots/Service10.png)
##### 11. Name Operation with return type and add parameters with return types -> Click Ok
![](/screenshots/Service11.png)
##### 12. Go to Source tab -> Write your logic in the Operation
![](/screenshots/Service12.png)
##### 13. Right click on project -> Clean and Build
![](/screenshots/Service13.png)
##### 14. Right click on project -> Deploy
![](/screenshots/Service14.png)
##### 15. Go to GlassFish Server 4.1.1 tab and observe whether it is successfully deployed or not!
![](/screenshots/Service15.png)
##### 16. Expand Web Services in the project folder -> Right click on service -> Click Test Web Service
![](/screenshots/Service16.png)
##### 17. Give any values and click the operation
![](/screenshots/Service17.png)
##### 18. Finally, Notice the result!
![](/screenshots/Service18.png)

### Note:
Please don't edit this project as it is open source or public repository, If you find any error or want to give any suggestion, create a issue or write to sivacheerla@live.com
