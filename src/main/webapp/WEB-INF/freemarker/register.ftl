<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>注册页面</title>
        <link rel="stylesheet" href="css/blog.css">
        <style type="text/css">
        </style>
		<script src="js/jquery-1.7.2.js" type="text/javascript"></script>
		<script src="js/blog.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="app">
            <div id="header">
                <h1></h1>
                <h2>账户注册</h2>
            </div>
            <div class="steps step1">
            </div>
            <div class="reg fix">
                <div class="form">
                    <form method="post">
                        <div class="inpt">
                            <span class="label">
                                <label for="C_nick" class="">
                                    会员名：
                                </label>
                            </span>
                            <input class="itxt" type="text" id="username" onblur="check()"/>
                            <div class="msg">
                                <div class="msg_warn msg_err">
                                    <i></i>
                                    <div id="nametip" class="msg_con">
                                        不能为空
                                    </div>
                                </div>
                            </div>
                            <div class="tip">
                            </div>
                        </div>
                        <div class="inpt">
                            <span class="label">
                                <label for="C_nick" class="">
                                    登录密码：
                                </label>
                            </span>
                            <input class="itxt err_inpt" type="text" id="password"/>
                            <div class="msg">
                                <div class="msg_warn msg_suc">
                                    <i></i>
                                    <div class="msg_con">
                                        不能为空
                                    </div>
                                </div>
                            </div>
                            <div class="psw_streng">
                                <div class="pwd_bar">
                                </div>
                                <div class="pwd_lev">
                                    <span>弱</span>
                                    <span>中</span>
                                    <span>强</span>
                                </div>
                            </div>
                            <!--<div class="tip"></div>-->
                        </div>
                        <div class="inpt">
                            <span class="label">
                                <label for="C_nick" class="">
                                    确认密码：
                                </label>
                            </span>
                            <input class="itxt" type="text" id="confirm"/>
                            <div class="msg">
                                <div class="msg_warn">
                                    <i></i>
                                    <div class="msg_con">
                                        不能为空
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inpt">
                            <span class="label">
                                <label for="C_nick" class="">
                                    验证码：
                                </label>
                            </span>
                            <input class="itxt short" type="text" id="C_nick"/>
                            <div class="valid">
                                <div>
                                    783h
                                </div>
                            </div>
                            <div class="msg">
                                <div class="msg_warn">
                                    <i></i>
                                    <div class="msg_con">
                                        不能为空
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inpt">
                            <button class="sbtn" type="submit" onclick="register()">
                                创建新账户
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
