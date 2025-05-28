pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building project with Maven"
                // Windows users ke liye 'bat', Linux/Mac ke liye 'sh'
                bat 'mvn clean package -DskipTests'
                // agar Linux hai to: sh 'mvn clean package -DskipTests'
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying app"
                bat 'java -jar target/Crud_Operation-0.0.1-SNAPSHOT.jar'
                // Linux me: sh 'java -jar target/Crud_Operation-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
