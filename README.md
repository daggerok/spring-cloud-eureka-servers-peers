spring-cloud-eureka-server-peers [![build](https://travis-ci.org/daggerok/spring-cloud-eureka-servers-peers.svg?branch=master)](https://travis-ci.org/daggerok/spring-cloud-eureka-servers-peers)
================================

prepare:

```sh
$ more /etc/hosts
peer1 127.0.0.1
peer2 127.0.0.1
```

test:

- given

```sh
$ ./gradlew clean build
$ ./gradlew :config-server:bootRun
$ ./gradlew :eureka-server-peer1:bootRun
$ ./gradlew :eureka-server-peer2:bootRun
```

- when
  - `ZONE=1 ./gradlew :eureka-client:bootRun`
  - `ZONE=2 ./gradlew :eureka-client:bootRun`
  - `ZONE=2 ./gradlew :eureka-client:bootRun`
  - kill and restore one of the eureka server peers

- then
  - logs EurekaServerPeer1 was logged first
  - logs EurekaServerPeer2 was logged first
  - logs EurekaServerPeer2 was logged first
  - check [eureka server peer1](http://peer1:8761/), [eureka server peer2](http://peer2:8762/) admin web UIs

