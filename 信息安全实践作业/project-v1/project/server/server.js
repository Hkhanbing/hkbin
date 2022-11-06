// 1. 导入 express
const express = require('express')
const userroute = require('./routeReg.js')
const cors = require('cors')
var querystring = require('querystring');
var session = require('express-session')

// 2. 创建 web 服务器
const app = express()

app.use(cors())
app.use(session({
  secret:'hello',        //secret属性值可以自己指定
  resave: false,         //固定写法
  saveUninitialized:true  //固定写法
}))
app.use(express.static('../../project/'))
app.use(userroute)


// 3. 启动 web 服务器
app.listen(80, () => {
  console.log('express server running at http://127.0.0.1')
})
