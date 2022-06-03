![Spring boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# <div align="center"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-envelope-open" viewBox="0 0 16 16"><path d="M8.47 1.318a1 1 0 0 0-.94 0l-6 3.2A1 1 0 0 0 1 5.4v.817l5.75 3.45L8 8.917l1.25.75L15 6.217V5.4a1 1 0 0 0-.53-.882l-6-3.2ZM15 7.383l-4.778 2.867L15 13.117V7.383Zm-.035 6.88L8 10.082l-6.965 4.18A1 1 0 0 0 2 15h12a1 1 0 0 0 .965-.738ZM1 13.116l4.778-2.867L1 7.383v5.734ZM7.059.435a2 2 0 0 1 1.882 0l6 3.2A2 2 0 0 1 16 5.4V14a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V5.4a2 2 0 0 1 1.059-1.765l6-3.2Z"/></svg> Messenger </div>

This is simple application for send sms message using [Twilio API](https://www.twilio.com/).

## Installation Information

```bash
  $ git clone https://github.com/AleksRemizov/messenger.git
  $ cd messenger
  $ mvn clean install
```
## Technology 

- **Programming Language:** [Java 11](https://www.java.com)
  <a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="20" height="20"/> </a>

- **Core Framework:** [Spring boot 2.6.6](https://spring.io/projects/spring-boot)
   <img height="20" width="20" src="src/main/resources/spring_boot.svg"/>
 
- **Build System:** [Maven 3.6.3](https://maven.apache.org/) <img height="20" width="20" src="https://raw.githubusercontent.com/vscode-icons/vscode-icons/master/icons/file_type_maven.svg"/>

- **Control System:** [Git 2.5.1](https://git-scm.com/) <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="18" height="18"/> </a>

## Way to use:

* Get  your [Twilio free account](https://www.twilio.com/try-twilio).

* Add your account sid,auth token and your trial number in [application.yml](src/main/resources/application.yml).

* Run application and use available endpoint [http://localhost:8080/api/v1/messenger](http://localhost:8080/api/v1/messenger) .
---
> **_NOTE:_** Unfortunately, with a free Twilio account you can use only one verificated phone number for send message.




