// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "sudo usermod -aG docker $USER && newgrp docker"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
