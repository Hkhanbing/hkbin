$(function(){
    $.ajax({
        type:"GET",
        url:"http://127.0.0.1/getname",
        success:function(res){
            if(res=='false')$("#user").html("登录")
            else
                $("#user").html(res.username)
        }
    })
})