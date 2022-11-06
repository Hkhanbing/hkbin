// 1. 导入 express
const express = require('express')
const cors = require('cors')
var querystring = require('querystring');

// 2. 创建 web 服务器
const app = express()
app.use(cors())

// 4. 监听客户端的 GET 和 POST 请求，并向客户端响应具体的内容
app.get('/user', (req, res) => {
  // 调用 express 提供的 res.send() 方法，向客户端响应一个 JSON 对象
  res.send({ name: 'zs', age: 20, gender: '男' })
})
app.post('/user', (req, res) => {
  // 调用 express 提供的 res.send() 方法，向客户端响应一个 文本字符串
  res.send('请求成功')
})
app.post('/api/reguser', (req, res) => {
    // 调用 express 提供的 res.send() 方法，向客户端响应一个 文本字符串
    //写状态码和数据
    var body = ""

    req.on('data', function (chunk) {
        body += chunk;
    })

    req.on('end', function () {
        // 解析参数
        body = querystring.parse(body);
        // 设置响应头部信息及编码
        res.writeHead(200, {'Content-Type': 'text/html; charset=utf8'});
        console.log('reg info')

        if(body.username && body.password) { // 输出提交的数据
            res.write("msg:注册成功")
            // res.write("<br>");
            // res.write("username：" + body.username);
            // res.write("<br>");
            // res.write("password：" + body.password);
            // console.log('username is ',body.username)
            // console.log('password is ',body.password)
            res.end();
        } 
        else {  // 通知客户端不能注册                
                res.write('注册信息不全');
                res.end();
        }
    })
})

app.post('/api/login', (req, res) => {
    // 调用 express 提供的 res.send() 方法，出来客户端的登录请求
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
    
        console.log('get data body is',body)
        if(body.username && body.password) { // 输出提交的数据
            res.write("msg:登录成功")
            // res.write("username：" + body.username);
            // res.write("<br>");
            // res.write("password：" + body.password);
            // console.log('username is ',body.username)
            // console.log('password is ',body.password)
            res.end();
        } 
        else {  // 通知客户端登录失败                
                res.write('登录信息不全');
                res.end();
        }
    })
})
  
app.get('/', (req, res) => {
  // 通过 req.query 可以获取到客户端发送过来的 查询参数
  // 注意：默认情况下，req.query 是一个空对象
  console.log(req.query)
  res.send(req.query)
})
// 注意：这里的 :id 是一个动态的参数
app.get('/user/:ids/:username', (req, res) => {
  // req.params 是动态匹配到的 URL 参数，默认也是一个空对象
  console.log(req.params)
  res.send(req.params)
})

// 3. 启动 web 服务器
app.listen(80, () => {
  console.log('express server running at http://127.0.0.1')
})
