<h1>Person API application</h1>

<h2>1.Tasks</h2>
<h3>Implement simple REST service based on spring-boot framework<h3/>
<p>a. Service input personal id; date of birth</p>
 <p>b. Service output Person object with following properties:</p>  
<ul>
  <li>i. Personal id</li> 
  <li>ii. First name, last name</li> 
   <li>iii. Gender: male, female iv. Date of birth</li>
</ul>
  <p>c. Data need to be located in a database, e.g. H2</p> 
  <p>d. Dependency manger: maven</p> 
   e. Log some service activities to log file and in database
   f. Implement unit tests and integration test
<h3>2. Implement angular client to use the implemented service</h3>
 <p>a. Input form with search parameters</p>  
 <p>b. Search button</p>  
  <p>c. Result table</p> 

<h2>2. How to run application</h2>
<p>2.1 Download project to your PC</p>
<ol>
<li>open project folder Person </li>
<li>open terminal in project folder </li>
<li>run command mvn spring-boot:run</li>
<li><a href="http://localhost:8080/h2-console">Click on this link</a>   </li>
<li>Now you see H.2 database console</li>
<li><a href="https://user-images.githubusercontent.com/56352422/171335550-9a9b4ea8-8709-4bcc-9788-0cc6f6c0d919.jpg">Image</a></li>
<li>Click on button connect</li>
<li>And now you see H2 database</li>
 <li><a href="https://user-images.githubusercontent.com/56352422/171334225-385ec6b0-d3d5-47f7-a8a6-d7ab3c906ee9.jpg">Click on link</a></li>
 <li> You can use SQL command SELECT * FROM Person to get a data</li>
 
</ol>



