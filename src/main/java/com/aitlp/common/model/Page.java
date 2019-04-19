package com.aitlp.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> implements Serializable {
    private static final long serialVersionUID = 3035157868344176539L;

    private int code, count;
    private String msg;
    private List<T> data;

    public Page(List data){
        this.code = 200;
        this.count = data.size();
        this.msg = "success";
        this.data=data;
    }
}
