package com.aitlp.base.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件工具类，用于操作文件或目录等
 */
public class FileUtil {
    /**
     * 列出目录下所有的文件
     *
     * @param dirName 路径名称
     * @return
     * @author 四个空格-https://www.4spaces.org
     */
    public static List<String> listAllFiles(String dirName) {
        List<String> filePathList = new ArrayList<>();
        //如果dir不以文件分隔符结尾，自动添加文件分隔符
        if (!dirName.endsWith(File.separator)) {
            dirName = dirName + File.separator;
        }
        File dirFile = new File(dirName);
        //如果dir对应的文件不存在，或者不是一个文件夹则退出
        if (!dirFile.exists() || (!dirFile.isDirectory())) {
            System.out.println("List失败！找不到目录：" + dirName);
        }

        //列出文件夹下所有的文件
        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                filePathList.add(files[i].getAbsolutePath());
            } else if (files[i].isDirectory()) {
                filePathList.addAll(listAllFiles(files[i].getAbsolutePath()));
            }
        }
        return filePathList;
    }

    /**
     * 读取文件内容
     *
     * @param fileFullPath 文件路径
     * @return
     */
    public static String readFileContent(String fileFullPath) {
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            fileInputStream = new FileInputStream(fileFullPath);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();
                stringBuffer = stringBuffer.append(line);
                stringBuffer = stringBuffer.append(System.getProperty("line.separator"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    /**
     * 获取文件后缀的方法
     *
     * @param file 要获取文件后缀的文件(比如"a.mp4"返回"mp4")
     * @return 文件后缀
     * @author https://www.4spaces.org/
     */
    public static String getFileExtension(File file) {
        String extension = "";
        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf(".") + 1);
            }
        } catch (Exception e) {
            extension = "";
        }
        return extension;
    }
}
