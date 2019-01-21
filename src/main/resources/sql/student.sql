-- 创建学生信息表
create TABLE tb_student(
  id int PRIMARY KEY auto_increment comment '学生编号',
  name varchar(20) not null comment '姓名',
  age int not NULL comment '年龄'
)