package com.breeze.framework.common;

import java.io.Serializable;

/**
 * @author JuanChensh
 *
 * @param <T>
 */
public class MergeQuery<T> extends MergeQueryBase implements Serializable {
    private static final long serialVersionUID = -6443186486048799474L;

    /**
     * data
     *
     */
    private T data;

    /**
     * orderBy
     *
     */
    private String orderBy;

    /**
     * getData
     *
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     * setData
     *
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * getOrderBy
     *
     * @return
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * setOrderBy
     *
     * @param orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
