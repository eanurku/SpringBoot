1. vm options setup:
  groups_url is set in vm options as
-Dgroups_url="https://xxxx.com/abc"

2. override bean definition from @Configuration classes by @Bean to @RestController classes.

        SpringApplication springApplication = new SpringApplication(XmlToJavaObjectConversionApp.class);
        //bean definitions override
        springApplication.setAllowBeanDefinitionOverriding(true);
        springApplication.run(args);

3. XmlAccessorType are to be set properly on Java Classes

4. library required for xml to java conversions are :
    <properties>
        <jaxb.version>2.3.1</jaxb.version>
        <istack.version>3.0.10</istack.version>
    </properties>
    <dependencies>
        <!--jaxb required for xml annotations after jdk>8 as jaxb removed from jdk module-->
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>${jaxb.version}</version>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-impl</artifactId>
            <version>${jaxb.version}</version>
        </dependency>
        <dependency>
            <groupId>com.sun.istack</groupId>
            <artifactId>istack-commons-runtime</artifactId>
            <version>${istack.version}</version>
        </dependency>

