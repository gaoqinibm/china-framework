# 项目简介

### 实现微服务可插拔性，特整理`china-framework`，集成多重组件供依赖使用
    注重研发效率提升，节省程序调试时间，快速融入框架使用，以实现简单、简洁化研发为目的

## 平台简介
    china-framework基础能力建设实现
    - 集成spring全家桶 使用nacos做注册中心和配置中心
      - 熔断，限流，降级已集成完毕
      - 基于spring+springBoot+mybatis+cloud+nacos+redis快速搭建微服务
      - 另需组件后期不断进行升级维护

```
china-framework
|
├──framework-dependencies --spring 全家桶框架
|
├──middleware-dependencies --中间件能力
|
├──pennyworth-adaptor --pennyworth神兽
|
├──swagger-dependencies --文档工具
|
end

```

## 运行方式：
- 独立jar包形式传送私服

## 微服务项目依赖
    <dependency>
        <groupId>com.istudy</groupId>
        <artifactId>framework-dependencies</artifactId>
        <version>1.0.1-SNAPSHOT</version>
    </dependency>
    
    <dependency>
        <groupId>com.istudy</groupId>
        <artifactId>pennyworth-adaptor</artifactId>
        <version>1.0.1-SNAPSHOT</version>
    </dependency>
    
    <dependency>
        <groupId>com.istudy</groupId>
        <artifactId>swagger-dependencies</artifactId>
        <version>1.0.1-SNAPSHOT</version>
    </dependency>
    
    <!-- 如不需要全部中间件可不引入，否则启动寻找相应url配置 -->
    <dependency>
        <groupId>com.istudy</groupId>
        <artifactId>middleware-dependencies</artifactId>
        <version>1.0.1-SNAPSHOT</version>
    </dependency>
    
## Q&A
    无法加载swagger配置类
    由于不同包名限制，在启动类添加 @ComponentScan({"com.istudy"}) 注解即可

## 开启程序猿微服务浪荡之游吧O(∩_∩)O~

