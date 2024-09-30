pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/EBF3KOR/test.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package' // Compile the project
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test' // Run the tests
            }
        }

        stage('Archive Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml' // Archive the test results
            }
        }
    }
}
