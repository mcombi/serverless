# Serverless

## Setup on OCP Cluster
To enable serverless install on an openshift cluster (in the developer sanbox serverless is already installed and you don't need to do anything):

**Red Hat OpenShift Serverless**

Then create a Create KnativeServing in knative-serving namespace, through the operator.

Once the serverless operator is up and running, go to the menu on the top right corner and press the Question Mark icon, and then go to the Command Line Tools section and download the <em>kn - OpenShift Serverless Command Line Interface (CLI)</em> for ypur machine.

## Develop a new Function
To create a new function locally run: 
```shell script
kn func create -l quarkus
```
Now navigate the code that has been generated and you can see a standard java project. Edit the code or deploy it as it has been generated

## Deploy a Function

To deploy a function, once you are logged in an openshift cluster
```shell script
kn func deploy -n kn
```

To only build a function to an Image
```shell script
kn func deploy
```

Once the function has been deployed you can see the route that receives traffic and you can test it

## Deploy a Knative Service

To create a service from an existing image
```shell script
kn service create qs --image quay.io/mcombi/quarkus-getting-started
```