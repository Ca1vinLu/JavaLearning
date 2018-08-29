package tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class RenameTools {
    public static void main(String args[]) {

        ArrayList<File> files = new ArrayList<File>();
        File file = new File("C:\\Users\\q7512\\Desktop\\编译原理笔记");
        File[] tempList = file.listFiles();

        if (tempList != null) {
            for (File file1 : tempList) {
                if (file1.isFile()) {
                    files.add(file1);
                }
            }
        }

        Collections.reverse(files);
        for (int i = 0; i < files.size(); i++) {
            File oldFile = files.get(i);
            File newFile = new File("C:\\Users\\q7512\\Desktop\\编译原理笔记" + "\\" + "编译原理笔记_" + (i + 1) + ".jpg");
            if (!newFile.exists()){
                oldFile.renameTo(newFile);
            }
        }

    }

    public static ArrayList<File> getFiles(String path) {
        ArrayList<File> files = new ArrayList<File>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        if (tempList != null) {
            for (File file1 : tempList) {
                if (file1.isFile()) {
                    files.add(file1);
                }
            }
        }
        return files;
    }
}

