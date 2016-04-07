package com.example.datapersistancesample.data;

import com.example.datapersistancesample.data.file.FileAccess;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import rx.Observable;

public class CommonStorage {

    @Inject
    FileAccess fileAccess;

    @Inject
    CommonStorage() {
    }

    public Observable<List<Map<String, String>>> getNoteList() {
        return fileAccess.getFileContentList();
    }

    public Observable<Map<String, String>> addNote(String content) {
        return fileAccess.addFileWithStringContent(content);
    }

    public Observable<Boolean> removeNote(String name) {
        return fileAccess.removeFile(name);
    }
}
