pipeline{
  stage('SCM Checkout'){
    git 'https://github.com/Mahendar-Orupula/Users'
  }
  stage('Compile-Package'){
           //Get maven home path
           def mvnHome = tool name: 'maven-3', type: 'maven'
           sh "${C:\Users\Brigosha_Guest\Documents\Android Data\apache-maven-3.8.6}/bin/mvn Test"
        }
        
  }
