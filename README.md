# NIMAP_INFOTECH_MINIPROJECT


Rajat Jadhav         jadhavrajat2001@gmail.com


**Project Overview:**

  **Completed tasks**
  1) Category CRUD operation.
  2) Product CRUD operation.
  3) Relation between Category-Products should have one-to-many relation. (One category can have multiple products)
  
    Delay Notice - Project Submission without Pagination Due to Deadline Constraints.
  

I've developed a Spring Boot application utilizing Java EE architecture, encompassing various layers such as controller, presentation, service, DAO, and database connectivity.

**Key Components:**

- **Controllers:** Utilized to handle incoming HTTP requests and route them to appropriate service methods.
  
- **Service Layer:** Contains business logic, orchestrating the flow of data between controllers and DAOs.
  
- **DAO (Data Access Object) Layer:** Responsible for interacting with the database, performing CRUD operations, and implementing data access logic.
  
- **Database Connectivity:** Integrated with PostgreSQL database using Spring Data JPA for seamless data access and manipulation.

- **API Endpoints:**
  - **Category API:** Handles operations related to categories, including creation, retrieval, update, and deletion.
  - **Product API:** Manages product-related functionalities, leveraging one-to-many relationship with categories.
  
**Features:**

- **Relationship Mapping:** Implemented one-to-many relationship between categories and products, and many-to-one relationship between products and categories using JPA annotations.
  
- **Dependencies:** Leveraged Spring Web, Spring Data JPA, and PostgreSQL dependencies for robust web development and database interactions.

**Implementation of Server-Side Pagination:**

- Modify the service layer methods to support pagination, incorporating methods such as getProducts(int page, int size) for retrieving specific pages of products with defined sizes.
  
- Update the corresponding DAO layer, enhancing repository methods for pagination. For JPA repositories, utilize Spring Data JPA's built-in support for pagination by extending PagingAndSortingRepository or JpaRepository.
  
- Update the controller layer to manage pagination parameters (e.g., page number, page size) in API requests, which can be passed as query parameters in the URL.
 
- Adjust the API response to include pagination metadata, providing details such as the total number of items, current page number, total pages, etc., to assist clients in navigating through paginated results.
  
- Handle pagination UI components and user interactions in the client application (e.g., front-end) to request and display paginated data from the server.


**Testing:**

- **POSTMAN API Testing:** Utilized POSTMAN for comprehensive API testing, ensuring functionality and reliability.
  
**Future Scope:**

- **Deployment:** The application is deployable on Amazon EC2 Linux instances, enabling seamless API testing and production use.


**Database Table of Category Entity after running the Application**



![WhatsApp Image 2024-05-13 at 23 09 47_103ca186](https://github.com/rajatrj3/Nimap_miniProject/assets/73461409/1eff3ff4-dc9f-424a-bf55-7da7b2969ad0)


**Database Table of Product Entity after running the Application**



![image](https://github.com/rajatrj3/Nimap_miniProject/assets/73461409/0bc2dbef-fa38-44ab-bdb6-6070dca96e4c)



**Relationship Mapping:** Implemented one-to-many relationship between categories and products, and many-to-one relationship between products and categories using JPA annotations.




![WhatsApp Image 2024-05-13 at 23 10 41_d77182ba](https://github.com/rajatrj3/Nimap_miniProject/assets/73461409/f09aebf5-4dd8-48ce-8c8c-6666ff15861f)



![WhatsApp Image 2024-05-13 at 23 11 35_6bca6186](https://github.com/rajatrj3/Nimap_miniProject/assets/73461409/ea5bedd9-7701-4ed8-a8d4-c51165b15358)



**Conclusion:**

The project encapsulates best practices in Spring Boot development, ensuring scalability, maintainability, and robustness in handling category and product-related operations with PostgreSQL database integration.
