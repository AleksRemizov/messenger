![Spring boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# <div align="center"><img height="25" width="25" src="src/main/resources/logotype.svg"/></svg> Messenger </div>

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




