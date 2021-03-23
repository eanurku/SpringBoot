1. libraries required for xml to java conversions are :
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

2. xsd file to java object conversion
   use xjc to convert
