pipeline {
    agent any

    tools {
        jdk 'JDK 17'                // Name you set in Global Tool Config
        maven 'Maven 3.8.1'         // Name you set in Global Tool Config
    }

    environment {
        MAVEN_OPTS = '-Xmx1024m'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/gouravgoud/Crud_Operation' // Replace this with your actual repo
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Application') {
            steps {
                bat 'start /b java -jar target\\Crud_Operation-0.0.1-SNAPSHOT.jar'
            }
        }
    }

    post {
        always {
            echo 'Cleaning up workspace...'
            deleteDir()
        }
    }
}
