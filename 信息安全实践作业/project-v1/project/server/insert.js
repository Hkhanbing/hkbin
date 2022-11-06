// 1. 导入 mysql 模块
const mysql = require('mysql')
// 2. 建立与 MySQL 数据库的连接关系
const db = mysql.createPool({
  host: '127.0.0.1', // 数据库的 IP 地址
  user: 'root', // 登录数据库的账号
  password: '12345678', // 登录数据库的密码
  database: 'my_db_01', // 指定要操作哪个数据库
})

// 测试 mysql 模块能否正常工作
 db.query('select 1', (err, results) => {
  // mysql 模块工作期间报错了
  if(err) return console.log(err.message)
  // 能够成功的执行 SQL 语句
  console.log('success',results)
}) 

 const sqlStr = 'select * from users where username="123123"'
db.query(sqlStr, (err, results) => {
  // 查询数据失败
  if (err) return console.log(err.message)
  // 查询数据成功
  // 注意：如果执行的是 select 查询语句，则执行的结果是数组
  console.log(results)
}) 

 const user = { username: 'Spider-Man', password: 'pcc123' }
 //const sqlStr1 = 'insert into users (4,username, password) values (?, ?, ?)'
// 定义待执行的 SQL 语句
//const sqlStr1 = 'insert into users (id,username, password) values (?, ?, ?)'
// 执行 SQL 语句
// db.query(sqlStr1, [3,user.username, user.password], (err, results) => {
//   // 执行 SQL 语句失败了
//   if (err) return console.log(err.message)
//   // 成功了
//   // 注意：如果执行的是 insert into 插入语句，则 results 是一个对象
//   // 可以通过 affectedRows 属性，来判断是否插入数据成功
//   if (results.affectedRows === 1) {
//     console.log('插入数据成功!')
//   }
// }) 


const sqlStr1 = 'insert into users (username, password) values (?, ?)'

// 执行 SQL 语句
db.query(sqlStr1, [user.username, user.password], (err, results) => {
  // 执行 SQL 语句失败了
  if (err) return console.log(err.message)
  // 成功了
  // 注意：如果执行的是 insert into 插入语句，则 results 是一个对象
  // 可以通过 affectedRows 属性，来判断是否插入数据成功
  if (results.affectedRows === 1) {
    console.log('插入数据成功!')
  }
}) 