pipeline {
    agent any

    tools {
        maven 'Maven 3'  // Use exact Maven name from Jenkins Global Tool Config
        jdk 'JDK 17'     // Use exact JDK name if configured
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Building the project using Maven"
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo "Running the Spring Boot application"
                // Replace with your actual jar name inside target folder
                bat 'java -jar target/Crud_Operation-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
