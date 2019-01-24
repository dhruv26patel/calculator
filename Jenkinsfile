pipeline {
     agent any
     stages {
          stage("Checkout") {
               steps {
                    git url: 'https://github.com/dhruv26patel/calculator'
               }
            }
          stage("Compile") {
                steps {
                    sh "pwd; cd calculator; ls -l; ./gradlew compileJava"
                }
            }
            stage("Unit test") {
                steps {
                    sh "pwd; cd calculator; ls -l; ./gradlew test"
                }
            }
            // stage("Code coverage") {
            //     steps {
            //         sh "pwd; cd calculator; ls -l; ./gradlew jacocoTestReport"
            //         // publishHTML (target: [
            //         //     reportDir: 'build/reports/jacoco/test/html',
            //         //     reportFiles: 'index.html',
            //         //     reportName: "JaCoCo Report"
            //         // ])
            //         sh "pwd; cd calculator; ls -l; ./gradlew jacocoTestCoverageVerification"
            //     }
            // }
            // stage("Static code analysis") {
            //     steps {
            //         sh "pwd; cd calculator; ls -l; ./gradlew checkstyleMain"
            //         // publishHTML (target: [
            //         //     reportDir: 'build/reports/checkstyle/',
            //         //     reportFiles: 'main.html',
            //         //     reportName: "Checkstyle Report"
            //         // ])
            //     }
            // }
            stage("Package") {
                steps {
                    sh "pwd; cd calculator; ls -l; sudo su -; ./gradlew build"
                }
            }
            stage("Docker build") {
                steps {
                    sh "pwd; cd calculator; ls -l; whoami; sudo docker build -t dhruv26patel/calculator ."
                }
            }
            stage("Docker login") {
                steps {
                    sh "sudo docker login"
                }
            }
            stage("Docker push") {
                steps {
                    sh "pwd; cd calculator; ls -l; whoami; sudo docker push dhruv26patel/calculator"
                }
            }
            stage("Deploy to staging") {
                steps {
                    sh "pwd; cd calculator; ls -l; whoami; su - ec2-user; whoami; docker-compose up -d"
                }
            }
            stage("Acceptance test") {
                steps {
                    sleep 60
                    sh "pwd; ls -l; whoami; su - ec2-user; whoami; chmod +x acceptance_test.sh; ./acceptance_test.sh"
                }
            }
     }
    post {
        always {
            sh "pwd; cd calculator; ls -l; whoami; sudo docker-compose down"
        }
    }
}