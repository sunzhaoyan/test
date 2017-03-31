package com.test.result;

/**
 * 错误常量类
 * 
 * @author szy
 * @date 2017年2月13日 上午10:12:13
 *
 */
public final class Result {
    /** 错误代码 */
    private String code;
    /** 错误信息 */
    private String msg;

    private Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /** 远程错误1 */
    public static final Result FE_PRC_BACK_001 = new Result("FE_PRC_BACK_001", "TargetUri is not exist");
    /** 远程错误2 */
    public static final Result FE_PRC_BACK_002 = new Result("FE_PRC_BACK_002", "TargetUri is not exist2");
    /** 测试错误1 */
    public static final Result TEST_ERROR_001 = new Result("TEST_ERROR_0001", "测试错误1");

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", msg=" + msg + "]";
    }

}
