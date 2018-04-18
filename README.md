# spring-dubble
dubble 的框架,使用了com.alibaba.dubbo.container.Main
在target 目录下，多生成了一个文件夹lib
java -Jar dubbo_service.jar 既可以运行，无需编写main函数
在测试中爆出字符编码的错误。添加
<properties>
		<!-- 设置默认编码 -->
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
既可以解决。
