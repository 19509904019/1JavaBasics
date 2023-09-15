package com.throwable.exer2;

/**
 * ClassName:BelowZeroException
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/15 17:08
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -3387516948L;

    public BelowZeroException() {}

    public BelowZeroException(String message) {
        super(message);
    }
}
