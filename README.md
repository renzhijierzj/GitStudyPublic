BUG记录及解决方法
service项目运行时，日志输出eureka.instance.hostname无效。

错误的原因是eureka.instance.virtual-host-name=localhost与http://${eureka.instance.hostname}:${server.port}/eureka/加粗部分不对应。

无法解析$(some.words)

正确的写法是${some.words}，是花括号而不是小括号。

ribbon和feign项目运行后直接退出exit code0

原因是pom中没有添加web相关依赖。

这是一个新的本地分支 提交到test分支
