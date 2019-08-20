package com.aitlp.poet.data;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
public class PoetDTO {
    private String author;
    private List<String> paragraphs;
    private List<String> strains;
    private String title;

    public PoetWithBLOBs changeToPoet() {
        PoetWithBLOBs poet = new PoetWithBLOBs();
        poet.setTitle(title);
        poet.setParagraphs(StringUtils.join(paragraphs, ","));
        poet.setStrains(StringUtils.join(strains, ","));
        return poet;
    }
}
