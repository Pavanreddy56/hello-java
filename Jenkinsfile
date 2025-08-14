pipeline {
  agent any

  environment {
    IMAGE = "pavanreddy-hello:${env.BUILD_NUMBER}"
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build (Maven)') {
      steps {
        bat 'mvn -B -DskipTests clean package'
      }
    }

    stage('Build Docker Image') {
      steps {
        bat "docker build -t ${IMAGE} ."
      }
    }

    stage('Load image into Minikube') {
      steps {
        bat "minikube image load ${IMAGE}"
      }
    }

    stage('Deploy to Kubernetes') {
      steps {
        bat """
        kubectl apply -f k8s/
        kubectl set image deployment/hello-deployment hello=${IMAGE} --record
        """
      }
    }

    stage('Smoke test (print service URL)') {
      steps {
        bat 'minikube service hello-service --url'
      }
    }
  }

  post {
    always {
      echo "Pipeline finished"
    }
  }
}
