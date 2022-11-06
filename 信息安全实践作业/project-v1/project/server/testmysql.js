var mysql =require('mysql')
var connection = mysql.createConnection({
    host:'127.0.0.1',
    user:'root',
    password:'111111',
    database:'my_db_01'
});
connection.connect;

//测试是否连接成功
// connection.query('select 1 AS solution',function(error,results,fields){
//     if (error) throw error;
//     console.log('The solution is: ',results[0].solution);
// })

//查询库表内信息
// const sqlStr ='select * from userinfo'
// connection.query(sqlStr,(error,results)=>{
//     if (error) throw error;
//     //查询数据成功
//     //查询结果是数组
//     console.log(results);
// })


//插入数据到userinfo表   id,username,phone,collegeid,courseid,status
// const user={id:101,username:'zhangzhang',phone:13089,collegeid:1,courseid:1,status:0}
// //   ?表示要插入变量内容，占位符，插入的值
// const sqlStr1 = "insert into users(id,username,phone,collegeid,courseid,status) values (?,?,?,?,?,?)"
// connection.query(sqlStr1,[user.id,user.username,user.phone,user.collegeid,user.courseid,user.status],(err,results)=>{
//     if (err) return console.log(err.message)
//     //插入数据成功
//     if (results.affectedRows ===1) {console.log('插入数据成功')}   //插入数据成功   
// })

// const user={id:103,username:'zhangzhang123',phone:130890,collegeid:1,courseid:1,status:0}
// //   ?表示要插入变量内容，占位符，插入的值
// const sqlStr2 = "insert into users SET ?"
// connection.query(sqlStr2, user,(err,results)=>{
//     if (err) return console.log(err.message)
//     //插入数据成功
//     if (results.affectedRows ===1) {console.log('插入数据成功')}   //插入数据成功   
// })

//更新数据
// const user={id:103,username:'xiaoxiao',phone:1300000,status:0}
// //   ?更新内容和变量要一一对应
// const sqlStr3 = "update users SET username=?,phone=?,status=? where id=?"
// connection.query(sqlStr3, [user.username,user.phone,user.status,user.id],(err,results)=>{
//     if (err) return console.log(err.message)
//     //更新数据成功
//     if (results.affectedRows ===1) {console.log('更新数据成功')}   //更新数据成功   
// })

//更新数据对象
// const user={id:103,username:'maomao',phone:130,status:0}
// //   ?更新内容和变量要一一对应
// const sqlStr3 = "update users SET ? where id=?"
// connection.query(sqlStr3, [user,user.id],(err,results)=>{
//     if (err) return console.log(err.message)
//     //更新数据成功
//     if (results.affectedRows ===1) {console.log('更新数据成功')}   //更新数据成功   
// })


//删除id=103的用户
// const sqlStr3 = "delete from  users where id=?"
// connection.query(sqlStr3, 103,(err,results)=>{
//     if (err) return console.log(err.message)
//     //删除数据成功
//     if (results.affectedRows ===1) {console.log('删除数据成功')}   //删除数据成功   
// })
//注意：   在数据库里不要做删除操作，删除后就没有证据了，
//要做的删除操作，通过修改状态使得数据不可用，将状态置为1，并和时间配合
//间接处理方法，解决问题


//标记删除，不使用delete语句，通过更新语句完成任务
//在表中设置status状态字段，标记这条数据是否可用
//要删除用户，只是将状态标记，表示不可用就意味着删除了
const sqlStr4 = "update users set status=1 where id=?"
connection.query(sqlStr4, 101,(err,results)=>{
    if (err) return console.log(err.message)
    //更新数据成功
    if (results.affectedRows ===1) {console.log('更新数据成功')}   //更新数据成功   
})