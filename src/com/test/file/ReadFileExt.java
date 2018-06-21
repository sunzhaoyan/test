package com.test.file;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Set;

import org.junit.Test;

public class ReadFileExt {

    Path path = Paths.get("C:", "Users", "szy", "Desktop", "temp", "notepad++.exe");

    @Test
    public void test0() throws Exception {
        FileSystem fileSystem = FileSystems.getDefault();
        Set<String> views = fileSystem.supportedFileAttributeViews();
        for (String view : views) {
            System.out.println(view);
        }

        FileStore fileStore = Files.getFileStore(path);
//        fileSystem.getFileStores();
        System.out.println("是否支持自定义视图: " + fileStore.supportsFileAttributeView(UserDefinedFileAttributeView.class));
    }

    @Test
    public void test1() {

        BasicFileAttributeView bfav = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        try {
            BasicFileAttributes bfas = bfav.readAttributes();
            System.out.println(bfas.creationTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() throws Exception {
        DosFileAttributeView dfav = Files.getFileAttributeView(path, DosFileAttributeView.class);
        DosFileAttributes dfas = dfav.readAttributes();
    }
    
    @Test
    public void test3() throws Exception {
        
        UserDefinedFileAttributeView udfav = Files.getFileAttributeView(path, UserDefinedFileAttributeView.class);
        
        System.out.println(udfav.list().size());
        
        udfav.write("file.description", Charset.defaultCharset().encode("This file contains private information."));
        
    }
}
