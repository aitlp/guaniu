package com.aitlp.util;

import com.aitlp.base.util.FileUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 处理诗(json)
 */
public class ParseJsonUtil {

    @Value("${poet.path}")
    private String ROOT_PATH;

    /**
     * 唐诗&宋诗
     */
    public void handleTangAndSongPoet() {
        List<String> allFileList = FileUtil.listAllFiles("E:\\chinese-poetry\\json");
        List<String> poetJsonList = allFileList.stream().filter(fileName -> fileName.contains("poet.tang")).collect(Collectors.toList());
//        poetJsonList.sort((p1, p2) -> p1.replaceAll("\\D+", "").compareTo(p1.replaceAll("\\D+", "")));
        poetJsonList = poetJsonList.stream().sorted(Comparator.comparingInt(o -> Integer.parseInt(o.replaceAll("\\D+", "")))).collect(Collectors.toList());
        if (poetJsonList != null && poetJsonList.size() > 0) {
            for (String filePath : poetJsonList) {
                if (!StringUtils.contains(filePath, "poet.")) {
                    continue;
                }
//                List<ShiDto> shiDtoList = JSONArray.parseArray(FileUtil.readFileContent(filePath), ShiDto.class);
//                    List<String> paragraphs = (List<String>)shiList.get("paragraphs");
//                System.out.println(StringUtils.join(shiDtoList.get(0).getParagraphs(), ""));
                System.out.println("=======================");
//                ShiDto dto = new ShiDto();
            }
        }
    }


}
