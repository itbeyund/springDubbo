# springDubbo
springDubbo spring整合dubbo项目

首先provider.java 是提供者服务。
建立接口类和接口实现类。
然后定义配置文件 applicationContext.xml
这个文件需要定义具体实现的bean,提供方应用信息，使用zookeeper注册中心暴露服务地址，使用dubbo协议在20880端口暴露服务。

然后声明要暴露的服务接口。


再建立一个消费者服务。
只需要在main方法中获取远程服务代理，就可以使用本地一样调用。
首先定义消费者应用名，使用zookeeper注册中心暴露服务地址，生成远程服务代理。


首先得要在github 下载https://github.com/apache/incubator-dubbo-ops
然后编译  mvn package .
把编译成war包放在tomcat下的webapps下。启动tomcat 服务。
http://localhost:8080/dubbo-admin-2.0.0
