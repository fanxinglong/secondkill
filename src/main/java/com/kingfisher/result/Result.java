package com.kingfisher.result;/**
 * Created by xinglongfan on 2018/1/3.
 */

/**
 * @author
 * @create 2018-01-03 下午5:50
 * 响应结果类
 **/
public class Result<T> {

    /**
     * 响应结果编码
     */
    private int code;

    /**
     * 响应结果提示信息
     */
    private String msg;

    /**
     * 响应结果数据
     * 由于不知道数据类型 所以用泛型表示
     */
    private T data;

    /**
     * 成功时候调用
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }

    /**
     * 失败时候调用
     */
    public static <T> Result<T> error(CodeMsg cm){
        return new Result<T>(cm);
    }

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg cm) {
        if(cm == null){
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
