package service;

/**
 * ClassName:TeamException
 * Description:自定义异常类
 *
 * @Author ZY
 * @Create 2023/9/19 11:53
 * @Version 1.0
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -338751694229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
