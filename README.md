# spring-quartz
分布式定时器

### 调度执行
http://localhost:8085/spring-quartz/quartztest/cron?jobName=con1&jobGroup=cron-group1

### 暂停
http://localhost:8085/spring-quartz/quartztest/pause?jobName=con1&jobGroup=cron-group1

### 恢复
http://localhost:8085/spring-quartz/quartztest/resume?jobName=con1&jobGroup=cron-group1

### 删除
http://localhost:8085/spring-quartz/quartztest/delete?jobName=con1&jobGroup=cron-group1

### 请求地址
http://192.168.207.140:8008/swagger-ui.html

### 新增请求
{
  "content": "test1",
  "cron": "*/5 * * * * ?",
  "jobDesc": "test1",
  "link": "www.baidu.com",
  "onceFlag": false,
  "remark": "000001",
  "title": "test1",
  "userIdList": "01534271"
}

### 修改请求
{
  "content": "测试模板内容",
  "cron": "0 0 8,12,18 * * ? *",
  "depIdList": "84267036",
  "id": 17,
  "jobDesc": "测试Job内容",
  "link": "http://www.baidu.com",
  "remark": "000002",
  "title": "测试模板主题",
  "userIdList": "123"
}
