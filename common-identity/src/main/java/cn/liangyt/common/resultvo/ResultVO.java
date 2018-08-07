package cn.liangyt.common.resultvo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 描述：传递对象
 * 创建时间 2018-07-19 10:25
 * 作者 liangyongtong
 */
@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> implements Serializable {
    private String code;
    private String message;
    private T data;

    public static <T> ResultVO<T> succee() {
        return new ResultVO(ResultCode.SUCCEED, ResultMessage.SUCCEED, null);
    }

    public static <T> ResultVO<T> succeeWithCode(String code) {
        return new ResultVO(code, ResultMessage.SUCCEED, null);
    }

    public static <T> ResultVO<T> succeeWithMessage(String message) {
        return new ResultVO(ResultCode.SUCCEED, message, null);
    }

    public static <T> ResultVO<T> succeeWithData(T data) {
        return new ResultVO(ResultCode.SUCCEED, ResultMessage.SUCCEED, data);
    }

    public static <T> ResultVO<T> succeeWithCodeAndMessage(String code, String message) {
        return new ResultVO(code, message, null);
    }

    public static <T> ResultVO<T> error() {
        return new ResultVO(ResultCode.ERROR, ResultMessage.ERROR, null);
    }

    public static <T> ResultVO<T> errorWithCode(String code) {
        return new ResultVO(code, ResultMessage.ERROR, null);
    }

    public static <T> ResultVO<T> errorWithMessage(String message) {
        return new ResultVO(ResultCode.ERROR, message, null);
    }

    public static <T> ResultVO<T> errorWithData(T data) {
        return new ResultVO(ResultCode.ERROR, ResultMessage.ERROR, data);
    }
}
