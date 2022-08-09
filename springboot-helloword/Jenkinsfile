pipeline {
   agent any

   stages {
      stage('pull code') {
         steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'ea3e97ed-099f-448e-9e85-13e950cbf2b6', url: 'https://github.com/1051513344/springboot-helloword.git']]])
         }
      }
      stage('build project') {
         steps {
            sh 'mvn clean package  -DskipTests'
         }
      }
      stage('publish project') {
         steps {
            deploy adapters: [tomcat9(credentialsId: 'e7d70443-03bf-4cd7-8829-11ee64730489', path: '', url: 'http://fwq.geekrabbit.xyz:3074/')], contextPath: null, war: 'target/*.war'
         }
      }
   }
}