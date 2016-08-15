<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ADD CUSTOMER</title>
<style>
*{margin:0px;padding:0px;}
body{
margin-left:400px;
margin-top:100px;
background-color:#00ccff;}

.clears{ clear:both;}
/*messages*/
.messages{padding:15px 0;}
.messages input,.messages select,.messages textarea{margin:0;padding:0; background:none; border:0; font-family:"Microsoft Yahei";}
.messlist {height:30px;margin-bottom:10px;}
.messlist label{float:left;width:100px; height:30px; font-size:14px; line-height:30px; text-align:right;padding-right:10px;}
.messlist input{float:left;width:300px;height:28px;padding-left:5px;border:#ccc 1px solid;}
.messlist.textareas{ height:auto;}
.messlist textarea{float:left;width:400px; height:110px;padding:5px;border:#ccc 1px solid;}
.messlist.yzms input{width:100px;}
.messlist.yzms .yzmimg{ float:left;margin-left:10px;}
.messsub{padding:0px 0 0 110px;}
.messsub input{width:100px; height:35px; background:#ddd; font-size:14px; font-weight:bold; cursor:pointer;margin-right:5px}
.messsub input:hover{ background:#f60;color:#fff;}
#label0{display:none;color:#0aa770;height:28px;line-height:28px;}
#label1{display:none;color:#0aa770;height:28px;line-height:28px;}
#label2{display:none;color:#0aa770;height:28px;line-height:28px;}
#label3{display:none;color:#0aa770;height:28px;line-height:28px;}
#label4{display:none;color:#0aa770;height:28px;line-height:28px;}
#label5{display:none;color:#0aa770;height:28px;line-height:28px;}
#label6{display:none;color:#0aa770;height:28px;line-height:28px;}
#label7{display:none;color:#0aa770;height:28px;line-height:28px;}
#label8{display:none;color:#0aa770;height:48px;line-height:48px;}
#label9{display:none;color:#0aa770;height:48px;line-height:48px;}
#label10{display:none;color:#0aa770;height:48px;line-height:48px;}
</style>
</head>
<body >
<div class="mail">
<div class="send">
<div class="sendbox">
<form action="#" method="get" class="messages">
     <div class="messlist">
      <label>First_name</label>
      <input type="text" placeholder="姓名" id="input1" style=""/>
      <div class="clears"></div>
     </div>

 <div class="messlist">
      <label>Last_name</label>
      <input type="text" placeholder="姓名" id="input3" style=""/>
      <div class="clears"></div>
     </div>
     
     <div class="messlist">
      <label>Email</label>
      <input type="text" placeholder="电子邮件" id="input2" />
      <div class="clears"></div>
     </div>


     <div class="messlist">
      <label>手机号</label>
      <input type="text" placeholder="手机号" id="input3" />

      <div class="clears"></div>
     </div>


     <div class="messlist textareas">
      <label>留言内容</label>
      <textarea placeholder="说点什么吧..." id="input4" ></textarea>

      <div class="clears"></div>
     </div>


     


     <div class="messsub">
      <input type="submit" value="提交" onclick="send()"style="background:#00a3eb;color:#fff;" />
      <input type="reset" value="重填" />
     </div>
</form>	 
<script>
function send(){

var name = document.getElementById("input1").value;
var mail = document.getElementById("input2").value;
var phone = document.getElementById("input3").value;
var content = document.getElementById("input4").value;
if(name=="")
{
label2.style.display = 'none';
label1.style.display = 'none';
label0.style.display = 'block';;
return false;
}
if(mail=="")
{
label3.style.display = 'none';
label4.style.display = 'none';
label5.style.display = 'block';;
return false;
}

if(content=="")
{
        label8.style.display = 'none'; 
        label9.style.display = 'none'; 
        label10.style.display = 'block'; //*必填
        return false;
}


 

}
</script>