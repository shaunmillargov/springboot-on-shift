# Spring Boot modified for OpenShift deployment

ideas from: https://blog.openshift.com/using-spring-boot-on-openshift/

Pertinent bits about this application:
- The war file name has been set to "ROOT" in the pom file. 
- When deploying to a new Openshift project, use the OpenJDK 8 template
- Use a PUBLIC github project (this one) as the git source.
- Look to the services tab in Openshift console once the project has completed building and the container has been deployed. 
- Add the context to the given endpoint. For example:
  http://springboot-on-shift-springboot-on-shift.0000.starter-us-east-5.openshiftapps.com/hello

  
