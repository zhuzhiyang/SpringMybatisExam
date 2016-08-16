
dp.properties 存放数据库的连接信息,文件路径：src/main/resources/db.properties
注：增加的时候必须把Customer表不会空的字段设置为为空，否则插入的时候会报错

需要把pom文件里面的 "project.build.sourceEncoding" UTF-8 "/project.build.sourceEncoding" 
改为"poject.build.sourceEncoding" GBK "/project.build.sourceEncoding" 
这样中文才不会乱码
mvn clean compile
mvn exec:java -Dexec.mainClass="com.hand.main.SpringTest" -Dexec.args="arg0 arg1 arg2"
