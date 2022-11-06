$(function(){
    $(".logout").click(function(e){
      e.preventDefault()
      $.ajax({
        type:"GET",
        url:"http://127.0.0.1/logout",
        success:function(){
            layer.msg("退出登录成功!", function(){
                top.location.href = "http://127.0.0.1/"
            })
        }
      })
    })
  })