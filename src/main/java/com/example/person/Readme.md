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
<img src="https://drive.google.com/file/d/13aeRvhmaeXYmT89Av02tJjXyxu6vZvZ6/view?usp=sharing"
raw=true
style=“margin-right: 10px
 alt="h2";/>
<li>Click on button connect</li>
<li>And now you see H2 database</li>
<img src="https://drive.google.com/file/d/1laHgjXbriYECiqBWc-Tsa14D9joviQ9e/view?usp=sharing"
raw=true
style=“margin-right: 10px
 alt="h2_1";/>
<li> Using SQL statmant SELECT * FROM Person you can select all persons in database</li>
</ol>
