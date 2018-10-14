# Mybatis_HighLevelMapping
mybatis动态代理实现高级映射，主要整合了mybatis和mysql间的复杂查询方法，主要在用户，订单，订单明细，商品明细间进行关联查询操作

以下三种查询方法主要以resultType和resultMap两种封装方法完成

resultType:对结果没有特殊的映射要求

一对一查询

将查询结果映射到pojo封装

项目用到的需求：查询订单信息，关联查询用户信息

1.resultType的封装方法查询
2.resultMap的封装方法查询


resultMap:对结果有特殊的映射要求

一对多查询

使用
association:将关联查询信息映射到一个pojo对象中
和
collection:将关联查询信息映射到一个list集合中
完成一对多高级映射

项目用到的需求：查询订单关联查询用户及订单明细

多对多查询

使用
association:将关联查询信息映射到一个pojo对象中
和
collection:将关联查询信息映射到一个list集合中
完成一对多高级映射

项目用到的需求:查询用户以及用户购买的商品信息


