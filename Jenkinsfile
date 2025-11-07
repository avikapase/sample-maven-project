pipeline {
    agent any
    stages {
        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/surefire-reports/index.html', fingerprint: true

            emailext (
                to: 'avi.kapase@gmail.com',
                subject: "Build Execution",
                body: "Build completed successfully. See attached report.",
                attachmentsPattern: 'target/surefire-reports/index.html',
                mimeType: 'text/html'
            )
        }
    }
}
