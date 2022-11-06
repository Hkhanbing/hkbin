

const express = require("express")

const app = express()


const session = require("express-session")

app.use(session({
    secret:'keyboard cat',
    cookie: { maxAge: 1000 * 60 * 60 * 24 },
    resave:false,
    saveUninitialized:true
}))


const path = require('path')
const fs = require('fs')
const cors = require('cors')
const { endianness } = require("os")
const bodyParser = require("body-parser")
const mysql = require("mysql")


app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())

app.use(cors())

app.use(express.static(__dirname + '/static'))


app.listen(80, () => {
    console.log("express server running at 127.0.0.1")
})

app.get('/', (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to admin.html")
    res.sendFile(__dirname + "/static/html/admin.html")
})

app.get('/index', (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to admin.html")
    res.sendFile(__dirname + "/static/html/admin.html")
})


app.get('/register', (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    res.sendFile(__dirname + "/static/html/register.html")
    console.log("going to register.html")
})

app.post('/register', (req, res) => {

    const sqlStr = 'INSERT INTO users SET ?'
    var data = req.body

    data["status"] = 1
    const db = mysql.createConnection({
        host : '127.0.0.1',
        user : 'root',
        password : '123456',
        database : 'mydata'
    })

    db.connect()

    //check
    const checkStr = 'SELECT username from `users` where username = \"' + req.body.username + '\" and status = "1"';
    console.log(checkStr)
    db.query(checkStr, (err, results) => {
        if(err)return console.log(err.message)
        if(results.length){
            console.log(results)
            console.log("I am in results query of login step 1")
            res.write("该用户已经注册过")
            res.end()
            return
        }
        else{
            db.query(sqlStr, req.body, (err, results) => {
                console.log("I am in last")
                if(err)return console.log(err.message)
                res.write("注册成功")
                res.end()
                return
            })
        }
    })

    // console.log(req.body.username);
})

app.get('/upgrade', (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to upgrade.html")
    res.sendFile(__dirname + "/static/html/upgrade.html")
})

app.post('/login', (req, res) => {
    var data = req.body

    data["status"] = 1
    const db = mysql.createConnection({
        host : '127.0.0.1',
        user : 'root',
        password : '123456',
        database : 'mydata'
    })

    db.connect()

    const sqlStr = 'SELECT username from `users` where username = \"' + req.body.username + '\" and password = \"' + req.body.password + '\" and status = "1"';
    db.query(sqlStr, (err, results) => {
        if(err)return console.log(err.message)
        if(results.length){
            console.log(req.session.islogin)
            console.log(req.session.user)
            if(req.session.islogin){
                res.write("该用户已经登录")
                res.end()
                return
            }
            else{
                req.session.user = req.body
                req.session.islogin = true
                console.log(req.session.user)
                console.log(results)
                console.log("I am in results query of login step 1")
                res.write("该用户有账号")
                res.end()
                return
            }
        }
        else{
            console.log("I am in results query of login step 2")
            res.write("该用户没有账号")
            res.end()
            return
        }
    })

    // // console.log(req.body.username);
    // db.query(sqlStr, req.body, (err, results) => {
    //     console.log("I am in last")
    //     if(err)return console.log(err.message)
    //     res.write("注册成功")
    //     res.end()
    //     return
    // })

})


app.get("/login", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to login.html")
    res.sendFile(__dirname + "/static/html/login.html")
})

app.get("/logout", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to logout.html")
    req.session.destroy()
    res.send({
        status:0,
        msg:"退出登陆成功"
    })
})

app.get("/getname", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to getname.html")
    if(req.session.user != undefined){
        res.send(req.session.user)
        return
    }
    else{
        res.send("false")
        return
    }
})

app.get("/user", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to user.html")
    res.sendFile(__dirname + "\\static\\html\\user.html")
})


app.get("/document", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\document.html")
})


app.get("/tool_web", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\tool_web.html") 
})

app.get("/tools", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\tools.html") 
})


app.get("/nums", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\nums.html") 
})

app.get("/modern", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\modern.html") 
})

app.get("/logic", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\logic.html") 
})


app.get("/knowledge", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\knowledge.html") 
})
app.get("/datastruct_webs", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\datastruct_webs.html") 
})
app.get("/moreknowledge", (req, res) => {
    res.setHeader('Access-Control-Allow-Methods', '*')
    console.log("going to document.html")
    res.sendFile(__dirname + "\\static\\html\\moreknowledge.html") 
})

