# dap  Development Application Platform, UniDap的Spring Boot版本

## 主要更新历史:
## 2019.10.10 将引用到的jar包升级到最新版本，并测试dap的稳定性; spring boot升级到2.1.9
## 2019.01.13 修改main.js菜单渲染和对应接口，使之支持多级菜单
## 2018.09.24作废DruidConfig类，将druid改为配置的方式，前缀为spring.datasource.druid
## 2017.03.15上传文件的大小配置修改spring.http.multipart改为spring.servlet.multipart

#Dap [Development Application Platform]功能描述
>spring security 全注解式的权限管理
动态配置权限，角色和资源，权限控制到按钮粒度
采用token进行权限校验，禁用session，未登录返回401，权限不足返回403
采用redis存储token及权限信息

>用户管理：用户查询、添加用户、修改用户、给用户分配角色
菜单管理：菜单列表、添加菜单、修改菜单、删除菜单、权限配置、菜单图标设置、菜单排序
角色管理：角色查询、添加角色、修改角色、删除角色
代码生成：根据表名生成bean、controller、dao、Mapper.xml、列表页、搜索、分页、新增页、修改页
job集群：创建job、取消job、查询job、下拉搜索spring bean
数据源监控：druid
接口swagger文档
日志查询
邮件管理：发送邮件、搜索邮件
文件管理：上传文件、文件列表、文件删除
公告管理：公告未读提醒、发布公告、查询公告、公告阅读人列表
excel下载：自定义sql导出excel、也可在页面展示sql结果数
字典管理：一些常量字典的维护
个人信息修改
修改密码
头像修改

>日志模块
 >>sl4j日志分包：将sql日志、业务日志、异常日志进行了分离，更方便定位问题
 >>日志表：使用aop拦截实现

>权限控制：基于token方式，禁用session
对各种不同异常进行了全局统一处理
使用lombok简化java代码，让源码更简洁，可读性高
mybatis未进行二次封装，原滋原味，简单sql采用注解，复杂sql采用Mapper.xml配置
使用了layui的弹出层、菜单、文件上传、富文本编辑、日历、选项卡、数据表格等
表单数据采用bootstrapValidator校验，简单快捷方便