pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/MocanuGeorge010/Curs21_QA_Basics.git'
                bat ' ./mvnw clean compile'
            }
        }
    }
}
