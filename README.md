# Certificate Generator 
 
The Certificate Generator Program is a program which is used to genrate PDF certificates for students in an institution. 


## Requirements

This program is developed using the Netbeans IDE and require the presence of the following libraries:
- iText 7 core (https://repo.itextsupport.com/ui/native/snapshot/com/)
- slf4j-api library (https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.1.0-alpha1)


## Installation

1. Download and Extract
 Unzip the provided ZIP file containing the source code and extract the folder CertificateGeneratorGUI

2. Import to Netbeans:
 Open Netbeans IDE (https://netbeans.apache.org/front/main/download/)
 Select File > Open Project and navigate to the extractedCertificateGeneratorGUI folder
 Open the project in Netbeans.


## Executing Program

1. Navigate to Source Files:
 Locate and open the src folder within the imported project to view the program classes
2.Execute the Program:
 Run the program from the Login.java class, which contains the main method for the program.
3. User Authentication 
 Upon execution, the program prompts for:
  i.   Username
  ii.  Email
  iii. Password  
  To have a clearer understanding, see the image in the link below: https://imgur.com/a/jY1Ji9r

4. User Account Types
 The system automatically identifies the user type (student or staff) based on the provided email domain
 
 i. Using a Student Account: 
   Username: Enter a desired username.
   Email Format: Use the following format: abc123@student.aru.ac.uk 
   Password Format: Combine the characters before '@' in the email with the entered username followed by '123' .
   Example: 
   Username: Joel
   Email: jao150@student.aru.ac.uk
   Password: jao150Joel123

 ii. Using a Staff/Admin Account:
    Username: Enter a desired username.
    Email Format: Use the following format: abc123@aru.ac.uk
    Password Format: Combine the characters before the '@' in the email with the entered username followed by '516' .
    Example:
    Username: Joel
    Email: jao150@aru.ac.uk
    Password: jao150Joel516

## Authors
    SID: 


