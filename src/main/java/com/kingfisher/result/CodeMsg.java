package com.kingfisher.result;/**
 * Created by xinglongfan on 2018/1/3.
 */

/**
 * @author
 * @create 2018-01-03 下午6:05
 **/
public class CodeMsg {

    private int code;

    private String msg;

    //通用异常

    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(50010, "服务器端异常");

    //登录异常 50020

    //商品异常 50030

    //订单异常 50040

    //秒杀异常 50050

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
