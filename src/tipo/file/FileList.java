package tipo.file;

import java.io.*;

public class FileList {

    private String path;
    private String[] fileList;

    public FileList(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String[] getFileList() {

        for (int i = 0; i <  fileList.length; i++) {
            System.out.println(fileList[i]);

        }
        return fileList;
    }

    public void setFileList(String[] fileList) {
        this.fileList = fileList;
    }

    public void listaTipoFile() {
        path = getPath();
        File f = new File(path);

        fileList = new String[f.list().length];


        for (int i = 0; i < f.list().length; i++) {

            fileList[i] = f.list()[i];

        }



    }
}
