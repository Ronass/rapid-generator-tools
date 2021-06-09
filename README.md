# rapid-generator-tools
半自动化代码生成，根据需要更改模板配置
注意：本项目属于rapid-generator项目已生成项目，生成源码见rapid-generator

1.使用说明
	* generator.xml 中配置项目均已经说明，请具体根据需求配置 *
	* 配置完成后，启动CMD命令窗口定位到本目录根路径，运行rapid-gen.bat文件，根据提示输入内容 *
	
2.帮助说明
	* 运行命令 gen * 代表生成数据库全部表  *
	* 运行命令 gen sqltabelName 代表生成指定表全部表  *
3.使用中请注意
在windows中，由于系统底层不一样，所以对脚本的换行符也不一样，所以会出现脚本执行问题
可以在vscode中或者支持修改换行符的编辑器中修改脚本的换行符已到达脚本运行无问题
具体参考https://www.jianshu.com/p/dd7464cf32b5
搜索建议，lf,crlf
