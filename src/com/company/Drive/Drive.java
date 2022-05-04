package com.company.Drive;

import com.company.file.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String name);

}
