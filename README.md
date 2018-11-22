# spring-5-java-11-sample
Sample project to show the usage of spring 5 and java 11

## Install Java 11 (Ubuntu)
`sudo wget https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.1_linux-x64_bin.tar.gz -O /tmp/openjdk-11+28_linux-x64_bin.tar.gz`
`sudo tar xfvz /tmp/openjdk-11_linux-x64_bin.tar.gz --directory /usr/lib/jvm`
`rm /tmp/openjdk-11_linux-x64_bin.tar.gz`
`sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-11.0.1/bin/java 1`
`sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk-11.0.1/bin/javac 1`
`sudo update-alternatives --install /usr/bin/javap javap /usr/lib/jvm/jdk-11.0.1/bin/javap 1`
`sudo update-alternatives --install /usr/bin/javadoc javadoc /usr/lib/jvm/jdk-11.0.1/bin/javadoc 1`
