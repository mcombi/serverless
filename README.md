# serverless

To enable serverless install on an openshift cluster:

Red Hat OpenShift Serverless

Then create a Create KnativeServing in knative-serving namespace

Create a new project for example kn.

To create a new function locally
kn func create -l quarkus

To deploy a function
kn func deploy -n kn

To only build a function to an Image
kn func deploy



To create a service from an existing image

kn service create qs --image quay.io/mcombi/quarkus-getting-started
