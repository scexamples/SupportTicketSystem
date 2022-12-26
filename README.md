# SupportTicketSystem
Spring Boot, JSP, REST, Spring Session JDBC, Spring Data JPA, Bootstrap, MySQL


## SupportTicketSystem - a web app to manage support tickets

## Technologies   
 Spring Boot
 Spring Session JDBC
 Spring Data JPA 
 JSP
 REST  
 Bootstrap
 MySql

## The app was designed for the following requirements:
- The dataparser should support two formats: CSV and JSON. However the design should permit easy addition of functionality to support additional formats in future.   
- The output format should be JSON regardless of input format.
- The app should provide the ability to filter and sort records by specified fields (eg Filter by City or Sort by Region ASC / DESC).
- Files can be directly included in the project (upload functionality not needed).
- The default format can be kept as a configuration in a config file.

### Use Case  

i) Start the MySQL server.  
ii) Update the MySQL username and password in application.properties. The application is configured to use the default port for MySQL (3306).  
iii) Start the application and access on localhost:8080  

![img1re](https://user-images.githubusercontent.com/15854708/209499633-3de95d8d-4cf8-469f-9991-43e79e971c16.JPG)  

Page displays a dropdown for specifying the project whose tickets are to be displayed.    
If no project is selected before clicking 'Submit', an error message is displayed.   

![img1 0submitwithoutselectionre](https://user-images.githubusercontent.com/15854708/209499645-6a12c6d9-7e80-476b-b3fe-0084c75192ff.JPG)

### 2. Select a project and click on 'Submit'.

![img1and2editre](https://user-images.githubusercontent.com/15854708/209500058-89583519-50aa-40f6-92ee-dcb72412c69e.png)  

##### After a project is selected, this selection is stored in the session and 'Log out' functionality is exposed in the workflow. Support tickets for the selected project are displayed.    

![img4 allticketsre](https://user-images.githubusercontent.com/15854708/209500104-d1de57a0-f74a-4940-8bfa-eb0a5f920511.JPG)  

### 3. Clicking on 'Update' action for ticket 1 displays a form with current details for ticket 1.  

![img5-updateTicket1re](https://user-images.githubusercontent.com/15854708/209500111-b6aaecca-feaf-46f1-a7af-0de4bad0775b.png)    

##### On clicking 'Update', a page loads displaying all tickets - with updated details for ticket 1. 

![img6 afterUpdating1re](https://user-images.githubusercontent.com/15854708/209500122-b779fe6f-2ce0-42e5-8e06-3a52a829a7a4.JPG)    

### 4. Click on 'Add New' to display a form to enter details for a new ticket.

![img7clickOnAddNewre](https://user-images.githubusercontent.com/15854708/209500134-807828eb-c3a1-452b-8ff6-058cb7676442.JPG)  

### 5. Enter details for the new ticket and click 'Create Ticket'.  

![img8afterCreateTicket](https://user-images.githubusercontent.com/15854708/209500143-62b56b9a-c46a-40b5-8375-e0d68e018612.JPG)    

##### A page loads displaying all tickets - including the newly created ticket.  

### 6. Click on 'Delete' action for ticket 1. A page loads displaying all tickets - ticket 1 has been deleted.  

![img9AfterDeletingTicket1](https://user-images.githubusercontent.com/15854708/209500145-5db5e99b-bac6-4dac-842e-5eca05bfb1f3.JPG)  

### 7. Click on 'Log out' loads the home page where the user can select a project.  

![img10AfterLogout](https://user-images.githubusercontent.com/15854708/209500148-2c2a3c73-462d-41c7-96ad-83edf1eefb0f.JPG)
