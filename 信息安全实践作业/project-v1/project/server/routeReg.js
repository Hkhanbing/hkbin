var express=require('express')
var mysql =require('mysql')
var fs=require('fs')
const cors = require('cors')
var session = require('express-session')

//var staitc=require('express.static')
express.static('../../')
//创建路由对象
var routeReg =express.Router()
var querystring = require('querystring')
routeReg.use(cors())
routeReg.use(session({
    secret:'hello',        //secret属性值可以自己指定
    resave: false,         //固定写法
    saveUninitialized:true  //固定写法
  }))

var connection = mysql.createConnection({
    host:'127.0.0.1',
    user:'root',
    password:'12345678',
    database:'my_db_01'
});


routeReg.get('/', (req, res) => {
    console.log('homepage')
    //res.sendFile('../index.html')

    fs.readFile('../index.html',function (err,data){
        if (err) {
            res.writeHead(404,{'Content-Type':'text/html'});
            res.end('读取文件失败')
        }else {
            console.log('send homepage')
            res.writeHead(200,{'Content-Type':'text/html'})           
            res.write(data.toString())
            res.end()
        }
    })
})

routeReg.post('/api/login', (req, res) => {
    // req.session.user = body        //将用户信息存储到Session中
    // req.session.islogin = true
    // console.log('get 登录信息 is',body)
    // if (req.session.islogin) {
    //     console.log('user is ',body.username)
    // }
    // if (!req.session.islogin) {
    //     return res.send("msg:session fail")
    // }
    // else {
    //     console.log('user is  ',req.session.user.username)
    //     return res.send('session ok')
    // }
    //else {return res.send({status:0,msg:'session ok',username:req.session.user.username,})}

    // 调用 express 提供的 res.send() 方法，处理客户端的登录请求
    //写状态码和数据
    var body = ""
    req.on('data', function (chunk) {
        body += chunk;
    })

    console.log('login ',body)
    req.on('end', function () {
        // 解析参数
        body = querystring.parse(body);
        
        // 设置响应头部信息及编码
        res.writeHead(200, {'Content-Type': 'text/html; charset=utf8'});
        
        if(body.username && body.password) { // 输出提交的数据
            connection.connect;
            console.log('get username is ',body.username)
            const sqlStr ='select * from users where username= ?'
            //注册前看该用户能否注册，如果系统中已经有该用户名则不能注册，否则可以注册
            connection.query(sqlStr,body.username,(err,results)=>{
                if (err) {
                    res.write("msg:查询失败")
                    res.end()
                    return 
                }
                if (results.length > 0) {
                    // return res.send({ status: 1, message: '用户名被占用，请更换其他用户名！' })
                    if (results[0].password== body.password) {
                        req.session.user = body        //将用户信息存储到Session中
                        req.session.islogin = true     //将用户的登录状态，存储到Session中
                
                        res.write("msg:查询到该用户名,登录成功！")        
                        res.end()
                        //return 
                    }
                    else {
                        //console.log('select username is ',results[0].username)
                        res.write("msg:用户名或密码不对，请重新输入！")        
                        res.end()                        
                    }

                    
                }      
            })
        } 
        else {  // 通知客户端登录失败                
                res.write('登录信息不全');
                res.end();
        }
    })
})

routeReg.post('/api/reguser', (req, res) => {
    var body = ""
    req.on('data', function (chunk) {
        body += chunk;
    })

    req.on('end', function () {
        // 解析参数
        body = querystring.parse(body);
        // 设置响应头部信息及编码
        res.writeHead(200, {'Content-Type': 'text/html; charset=utf8'});
    
        if(body.username && body.password) { // 输出提交的数据
            //查询库表内信息            
            connection.connect;
            console.log('get username is ',body.username)
            const sqlStr ='select * from users where username= ?'
            //注册前看该用户能否注册，如果系统中已经有该用户名则不能注册，否则可以注册
            connection.query(sqlStr,body.username,(err,results)=>{
                if (err) {
                    res.write("msg:查询失败")
                    res.end()
                    return 
                }
                if (results.length > 0) {
                    // return res.send({ status: 1, message: '用户名被占用，请更换其他用户名！' })
                    console.log('select username is ',results[0].username)
                    res.write("msg:用户名被占用，请更换其他用户名！")        
                    res.end()
                    return 
                }                
                else {
                    //新用户，注册进入数据库
                    console.log('will insert body.username is ',body.username)
                    const sqlStr1 = 'insert into users (username, password) values (?, ?)'
                    // 执行 SQL 语句
                    connection.query(sqlStr1, [body.username, body.password], (err, results) => {
                        // 执行 SQL 语句失败了
                        if (err) return console.log(err.message)
                        // 插入成功
                        if (results.affectedRows === 1) {
                            console.log('插入数据成功!')
                            res.write("msg:注册成功")
                            res.end()
                        }   
                    }) 
                }
            })            
        }
        else {  // 通知客户端注册失败                
                res.write("msg:注册信息不全");
                res.end();
        }
    })
})

// 4. 监听客户端的 GET 和 POST 请求，并向客户端响应具体的内容
routeReg.get('/user', (req, res) => {
    // 调用 express 提供的 res.send() 方法，向客户端响应一个 JSON 对象
    res.send({ name: 'zs', age: 20, gender: '男' })
  })

  routeReg.post('/user', (req, res) => {
    // 调用 express 提供的 res.send() 方法，向客户端响应一个 文本字符串
    res.send('请求成功')
  })
  

  // 注意：这里的 :id 是一个动态的参数
routeReg.get('/user/:ids/:username', (req, res) => {
    // req.params 是动态匹配到的 URL 参数，默认也是一个空对象
    console.log(req.params)
    res.send(req.params)
  })
  
  
//向外公开路由对象
module.exports = routeReg