def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(ip,contextpath)
{
   deploy adapters: [tomcat9(credentialsId: 'f91a7a22-cfed-42ee-ac0a-0399de4446be', path: '', url: "${ip}")], contextPath: "${contextpath}", war: '**/*.war'
}



def runSelenium(path)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${path}/testing.jar"
}
