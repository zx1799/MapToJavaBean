package com.zx1799.work1;

import java.io.File;

/*
    问题：
        遍历目录
        递归遍历指定目录下的所有文件和文件夹，然后输出
 */
public class RecursiveErgodic {
    public static void main(String[] args){
        File file = new File("e:java");
        getFile(file);
    }

    //递归方法：
    //    返回值类型：void
    //    参数列表：File file
    public static void getFile(File file){
        //判断File对象是否为空
        if(file != null){
            if (file.isDirectory()){    //判断目录是否为空
                File[] files = file.listFiles();    //列出所有文件夹
                if (files != null){     //判断文件夹是否为空
                    for(int i = 0; i < files.length; i++){  //遍历文件夹
                        getFile(files[i]);
                    }
                }
            }else
                System.out.println(file);
        }
    }
}
