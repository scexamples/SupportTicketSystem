## SupportTicketSystem - a web app to manage support tickets

## Technologies   
 Spring Boot  
 Spring Session JDBC  
 Spring Data JPA  
 JSP  
 REST  
 Bootstrap  
 MySQL

## The app was designed for the following requirements:
- On specifying a project, all support tickets for that project should be retreived and displayed.   
- For each ticket, there should be an option to update or delete it.
- Functionality should be provided to create a new ticket.
- On specifying a project, the selection (project name) should be displayed in the subsequent workflow.
- Functionality should be provided to exit a workflow and select a new project.

### Use Case  

i) Start the MySQL server.  
ii) Update the MySQL username and password in application.properties. The application is configured to use the default port for MySQL (3306).  
iii) Start the application and access on localhost:8080  

##### Page loads with a dropdown for specifying the project whose tickets are to be displayed.

![img1re](https://user-images.githubusercontent.com/15854708/209499633-3de95d8d-4cf8-469f-9991-43e79e971c16.JPG)  

##### If no project is selected before clicking 'Submit', an error message is displayed.  

![img1 0submitwithoutselectionre](https://user-images.githubusercontent.com/15854708/209499645-6a12c6d9-7e80-476b-b3fe-0084c75192ff.JPG)

### 1. Select a project and click on 'Submit'.

![img1and2editre](https://user-images.githubusercontent.com/15854708/209500058-89583519-50aa-40f6-92ee-dcb72412c69e.png)  

##### Support tickets for the selected project are displayed. 'Log out' functionality is exposed in the workflow (to exit the selected project).     

![img4 allticketsre](https://user-images.githubusercontent.com/15854708/209500104-d1de57a0-f74a-4940-8bfa-eb0a5f920511.JPG)  

### 2. Click on 'Update' action for ticket 1.  

![img5-updateTicket1re](https://user-images.githubusercontent.com/15854708/209500111-b6aaecca-feaf-46f1-a7af-0de4bad0775b.png)    

##### An editable form displays current details for ticket 1.  

### 3. Update details and click on 'Update Ticket'.  

![img6 afterUpdating1re](https://user-images.githubusercontent.com/15854708/209500122-b779fe6f-2ce0-42e5-8e06-3a52a829a7a4.JPG)    

##### A page loads displaying all tickets - with updated details for ticket 1.  

### 4. Click on 'Add New'.

![img7clickOnAddNewre](https://user-images.githubusercontent.com/15854708/209500134-807828eb-c3a1-452b-8ff6-058cb7676442.JPG)  

##### An editable form is displayed to enter details for a new ticket.

### 5. Enter details for the new ticket and click 'Create Ticket'.   

![img8afterCreateTicket](https://user-images.githubusercontent.com/15854708/209500143-62b56b9a-c46a-40b5-8375-e0d68e018612.JPG)    

##### A page loads displaying all tickets - including the newly created ticket.  

### 6. Click on 'Delete' action for ticket 1.  

![img9AfterDeletingTicket1](https://user-images.githubusercontent.com/15854708/209500145-5db5e99b-bac6-4dac-842e-5eca05bfb1f3.JPG)  

##### A page loads displaying all tickets - ticket 1 has been deleted.

### 7. Click on 'Log out'  

![img10AfterLogout](https://user-images.githubusercontent.com/15854708/209500148-2c2a3c73-462d-41c7-96ad-83edf1eefb0f.JPG)  
##### App exits workflow for the selected project and loads the home page. 

